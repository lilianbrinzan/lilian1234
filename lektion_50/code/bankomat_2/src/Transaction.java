public class Transaction {

    int deposit;
    int withdraw;
    int transfers;

    public Transaction(int deposit, int withdraw, int transfers) {
        this.deposit = deposit;
        this.withdraw = withdraw;
        this.transfers = transfers;
    }

    public void Account (Account account) {
        System.out.println("На прием пришла " );
        account.getDescription();
    }

    public void setDeposit(int deposit) {
        System.out.println("класть деньги на депозит " + 100);
        this.deposit = deposit;
    }

    public void setTransfers(int transfers) {
        System.out.println("снимать средства  " + 200);
        this.transfers = transfers;
    }
    public void setWithdraw(int withdraw) {
        System.out.println("делать переводы " + 300);
        this.withdraw = withdraw;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "deposit=" + deposit +
                ", withdraw=" + withdraw +
                ", transfers=" + transfers +
                '}';
    }




}
