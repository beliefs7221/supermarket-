package entity;

import java.math.BigDecimal;

public class Fruits {

    private BigDecimal price = new BigDecimal("0.0") ;
    private BigDecimal weight = new BigDecimal("0.0");

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public Fruits(BigDecimal price, BigDecimal weight) {
        this.price = price;
        this.weight = weight;
    }
}
