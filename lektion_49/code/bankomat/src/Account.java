public class Account {

    String iban;
    int pin_cod;
    Atm atm; // Atm, на котором ездит account

    public Account(int iban, int pin_cod) {
        this.iban = String.valueOf(iban);
        if (pin_cod >= 1234 && pin_cod <= 1234) {
            this.pin_cod = pin_cod;
            System.out.println("Account допущен у правлению Atm");
        } else {
            System.out.println("Account не допущен у правлению Atm");
        }
    }

    public int getPin_cod() {
        return pin_cod;
    }

    public void getDescription(){
    }

    // метод, который сажает Account на Atm
    public void go(Atm atm){
        this.atm = atm;
        this.atm.setAccount(this);
    }

    // метод, который отображает, что Account поехал на Atm
    public void account(){
        this.atm.go(); // вызываем метод из класса Atm
    }

    public String getIban(){
        return iban;
    }

    @Override
    public String toString() {
        return "Account{" +
                "iban='" + iban + '\'' +
                ", pin_cod=" + pin_cod +
                ", atm=" + atm +
                '}';
    }
}
