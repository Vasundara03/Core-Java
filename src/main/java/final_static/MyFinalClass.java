package final_static;

final class MyFinalClass {

    private final int finalvariable = 10;

    final int getFinalvariable(){
        return finalvariable;
    }
}

// Another class within the same package
class AnotherClassInSamePackage {
    public static void main(String[] args) {
        // Creating an instance of MyFinalClass
        MyFinalClass myFinalClass = new MyFinalClass();

        // Accessing the final variable and method from the same package
        //System.out.println("Final Variable: " + MyFinalClass.getfinalVariable());  // Output: 10
    }
}
