public class Account {

    String iban;
    int pin_cod;
    Atm atm; // Atm, который ездит Account

    public Account(int iban, int pin_cod) {
        this.iban = String.valueOf(iban);
        if (pin_cod == 1234 ) {
            this.pin_cod = pin_cod;
            System.out.println("Account допущен k использование Atm");
        } else {
            System.out.println("Account...НЕ...допущен k использование Atm");
        }
    }

    public int getPin_cod() {
        return pin_cod;
    }

    public void getDescription(){ //   metod на будущее
    }

    // метод, который разрешает Account на Atm
    public void go(Atm atm){
        this.atm = atm;
        this.atm.setAccount(this);
    }

    // метод, который отображает, что Account работает c Atm
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
