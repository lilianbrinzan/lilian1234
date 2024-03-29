public class Account {

    String iban;
    int pin_cod;
    Atm atm; // Atm, котороi ездит account

    public Account(int iban, int pin_cod) {
        this.iban = String.valueOf(iban);
        if (pin_cod >= 1234 && pin_cod <= 1234) {
            this.pin_cod = pin_cod;
            System.out.println("Account допущен k ispolzovanie Atm");
        } else {
            System.out.println("Account не допущен k ispolzovanie Atm");
        }
    }

    public int getPin_cod() {
        return pin_cod;
    }

    public void getDescription(){ //   metod in viitor
    }

    // метод, который dopuscaiet Account на Atm
    public void go(Atm atm){
        this.atm = atm;
        this.atm.setAccount(this);
    }

    // метод, который отображает, что Account rabotaiet s Atm
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
                ", atm=" + atm +
                '}';
    }

}
