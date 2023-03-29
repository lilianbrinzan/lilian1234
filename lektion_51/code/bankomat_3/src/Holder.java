public class Holder extends Account{

    String nameHolder;
    String adreseHolder;
    int datum;

    public Holder(int iban, int pin_cod, String nameHolder, String adreseHolder, int datum) {
        super(iban, pin_cod);
        this.nameHolder = nameHolder;
        this.adreseHolder = adreseHolder;
        this.datum = datum;
    }

    @Override
    public String toString() {
        return "Holder{" +
                "nameHolder='" + nameHolder + '\'' +
                ", adreseHolder='" + adreseHolder + '\'' +
                ", datum=" + datum +
                '}';
    }

}
