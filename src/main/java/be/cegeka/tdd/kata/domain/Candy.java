package be.cegeka.tdd.kata.domain;

public class Candy {

    private int id;
    private String name;
    private double price;
    private double weight;

    public Candy(int id, String name, double price, double weight) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Candy candy = (Candy) o;

        if (Double.compare(candy.price, price) != 0) return false;
        if (Double.compare(candy.weight, weight) != 0) return false;
        return name != null ? name.equals(candy.name) : candy.name == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
