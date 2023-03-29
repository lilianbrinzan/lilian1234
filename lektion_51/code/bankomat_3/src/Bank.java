public class Bank extends Account{

    String nameBank;
    String adreseBank;
    String bicBank;

    public Bank(int iban, int pin_cod, String nameBank, String adreseBank, String bicBank) {
        super(iban, pin_cod);
        this.nameBank = nameBank;
        this.adreseBank = adreseBank;
        this.bicBank = bicBank;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "nameBank='" + nameBank + '\'' +
                ", adreseBank='" + adreseBank + '\'' +
                ", bicBank='" + bicBank + '\'' +
                '}';
    }

}
