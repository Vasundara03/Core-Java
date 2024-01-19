package objectsarrays;

public class Product implements Comparable<Product> {
    private double weight;
    private double price;
    private int id;

    // Constructors, getters, and setters

    public Product(double weight, double price, int id) {
        this.weight = weight;
        this.price = price;
        this.id = id;
    }

    // Getter and Setter methods for weight, price, and id

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Implementing the compareTo method from Comparable interface

    @Override
    public int compareTo(Product otherProduct) {
        // Compare products based on their price
        return Double.compare(this.price, otherProduct.price);
    }

}
