public abstract class Bank {
    private String bankId;
    private String bankName;

    public Bank(String bankId, String bankName) {
        this.bankId = bankId;
        this.bankName = bankName;
    }

    protected String getBankId() {
        return bankId;
    }

    protected void setBankId(String bankId) {
        this.bankId = bankId;
    }

    protected String getBankName() {
        return bankName;
    }

    protected void setBankName(String bankName) {
        this.bankName = bankName;
    }

    protected abstract boolean withdrawal (Double mony) throws InterruptedException;
}
