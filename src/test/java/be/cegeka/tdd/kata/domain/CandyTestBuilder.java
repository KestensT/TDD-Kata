package be.cegeka.tdd.kata.domain;

import org.springframework.test.util.ReflectionTestUtils;

public class CandyTestBuilder {

    private String name;
    private double price;
    private double weight;
    private int id;

    public static CandyTestBuilder aCandy() {
        return new CandyTestBuilder()
                .withName("name")
                .withPrice(5)
                .withWeight(5)
                .withId(1);
    }

    public Candy build() {
        Candy candy = new Candy(id,name, price, weight);
        ReflectionTestUtils.setField(candy, "id", id);
        return candy;
    }

    public CandyTestBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public CandyTestBuilder withPrice(double price) {
        this.price = price;
        return this;
    }

    public CandyTestBuilder withWeight(double weight) {
        this.weight = weight;
        return this;
    }

    public CandyTestBuilder withId(int id) {
        this.id = id;
        return this;
    }
}
