package ifelseconditions;

public class Age {

    public static void main(String[] args) {

       int personage = 16;
       classifyAge(personage);
    }
    private static void classifyAge(int age) {
       if(age < 13){
           System.out.println("Kid");
       } else if(age >= 13 && age <= 19){
           System.out.println("Teen");
       }else{
           System.out.println("Adult");
       }
    }
}
