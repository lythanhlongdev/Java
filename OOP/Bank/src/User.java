public class User extends Bank implements Runnable{
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

    @Override
    protected synchronized boolean withdrawal(){

        return false;
    }

    @Override
    public void run() {

    }
}
