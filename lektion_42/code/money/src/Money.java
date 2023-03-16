public class Money {
    private long amount; // переменная типа long - это целые числа
    private String currency; // название валюты - USD, EUR, ...

    // конструктор модифицированный
    public Money(double amount, String currency) { // переопределили тип переменной
        this.amount = Math.round(amount * 100); // round - это округление и умножение на 100, т.е. считаем деньги сотнями
        this.currency = currency;
    }

    // переопределяение метода toString
    @Override
    public String toString() { // это сигнатура метода, доступный, возвращает строку
        return String.format("%.2f %s", amount / 100.0, currency.toUpperCase()); // вывод кол-ва денег и названия валюты
    }
    // переопределяение метода equals
    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Money money)) {
            return false;
        }
        return amount == money.amount && currency.equalsIgnoreCase(money.currency);
    }


}
