public class Transaction {

    int deposit;
    int withdraw;
    int transfers;
    private Atm atm;

    public Transaction(int deposit, int withdraw, int transfers) {
        this.deposit = deposit;
        this.withdraw = withdraw;
        this.transfers = transfers;
    }

    // метод, который сажает Transaction на Atm
    public void go(Atm atm){
        this.atm = atm;
        //this.atm.setTransaction(this);
    }
    // метод, который отображает, что Account поехал на Atm
    public void transaction(){
        this.atm.go(); // вызываем метод из класса Atm
    }


    public void setDeposit(int deposit) {
        System.out.println("внeсти деньги на депозит " + deposit);
        this.deposit = deposit;
    }

    public void setTransfers(int transfers) {
        System.out.println(" снeати с сцеота " + transfers);
        this.transfers = transfers;
    }
    public void setWithdraw(int withdraw) {
        System.out.println("сделать переводы " + withdraw);
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

    public int getDeposit() {
        System.out.println(" внeсти  деньги на депозит " + deposit);
        return deposit;
    }

    public int getWithdraw() {
        System.out.println("сделать переводы " + withdraw);
        return withdraw;
    }

    public int getTransfers() {
        System.out.println("снeати с сцеота   " + transfers);
        return transfers;
    }
}
