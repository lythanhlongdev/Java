public class User extends Bank{
    private String userID;
    private  String userName;
    private  String remittanceCode;
    private  double mony;
    public User(String bankId, String bankName, String userID, String userName, String remittanceCode, double mony) {
        super(bankId, bankName);
        this.userID = userID;
        this.userName = userName;
        this.remittanceCode = remittanceCode;
        this.mony = mony;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRemittanceCode() {
        return remittanceCode;
    }

    public void setRemittanceCode(String remittanceCode) {
        this.remittanceCode = remittanceCode;
    }

    public double getMony() {
        return mony;
    }

    public void setMony(double mony) {
        this.mony = mony;
    }


    /*
        synchronized  tránh tranh chấp tài nguyên
    */
    @Override
    protected synchronized boolean withdrawal(Double mony) throws InterruptedException {
        if(getMony() > 0){
            if(getMony() >= mony){
                Thread.sleep(1000);
                double remainingAmount = getMony() - mony;
                setMony(remainingAmount);
                System.out.println("The Remaining Amount: "+getMony());
                return true;
            }else {
                System.out.println("minimum withdrawal amount 50 maximum is: "+getMony());
            }
        }
        System.out.println("Your money is not enough");
        return false;
    }

}
