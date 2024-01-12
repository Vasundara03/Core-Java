public class Product {

    double price = 0;

    public double getPrice(){
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice(int quantity) {
        return price * quantity;
    }
    public static void main(String[] args) {
        Product laptop = new Product();

        laptop.getPrice(50);

        double singlePrice = laptop.getPrice();
        System.out.println("Price for single quantity: " + singlePrice);

        int quantity = 5;
        double totalPrice = laptop.getPrice(quantity);
        System.out.println("Total price for " + quantity + " quantities: " + totalPrice);


    }

}

