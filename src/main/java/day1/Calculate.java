package day1;

import java.util.Objects;

public class Calculate {
    private int price;
    private int price2;

    public Calculate(int price, int price2) {
        this.price = price;
        this.price2 = price2;
    }

    public int calculate() {
        return this.price + this.price2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Calculate calculate = (Calculate) o;
        return this.calculate() == calculate.calculate();
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.calculate());
    }
}

