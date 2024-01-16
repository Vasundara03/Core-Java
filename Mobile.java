public class Mobile {

    private static int price =0;

   public static int getPrice(){
       return price;
   }

    public static void main(String[] args) {
        System.out.println("Price: " + Mobile.getPrice());
    }
}
