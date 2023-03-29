public class Atm extends Account{

    String iban;
    String adreseAtm;
    public Account account;

    public Atm(int iban, int pin_cod, String iban1, String adreseAtm) {
        super(iban, pin_cod);
        this.iban = iban1;
        this.adreseAtm = adreseAtm;
    }


    // сеттер назначает account для класса Atm из класса Account
    public void setAccount(Account account) {
        this.account = account;
    }

    // метод, который связывает atm и account
    public void go(){
        System.out.println( "Atm " + this.iban + " поехал под управлением - " + account.getPin_cod());
    }
    public Account getAccount(){
        return account;
    }

    @Override
    public String toString() {
        return "Atm{" +
                "iban='" + iban + '\'' +
                ", adreseAtm='" + adreseAtm + '\'' +
                ", account=" + account +
                '}';
    }

}
