package exercicio.stream.map;

import java.time.LocalDate;

public class Order {
    public Long amount;
    public Currency currency;
    public LocalDate date;

    public Order(Long amount, Currency currency, LocalDate date) {
        this.amount = amount;
        this.currency = currency;
        this.date = date;
    }
}
