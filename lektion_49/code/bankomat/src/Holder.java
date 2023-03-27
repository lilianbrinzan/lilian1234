public class Holder extends Account{

    String adreseHolder;
    int datum;

    public Holder(int iban, int pin_cod, String adreseHolder, int datum) {
        super(iban, pin_cod);
        this.adreseHolder = adreseHolder;
        this.datum = datum;
    }

    @Override
    public String toString() {
        return "Holder{" +
                "adreseHolder='" + adreseHolder + '\'' +
                ", datum=" + datum +
                '}';
    }
}
