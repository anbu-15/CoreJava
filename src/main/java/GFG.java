// Java Program Illustrating Difference between
// Effectively final and Mutable Local Variables

// Importing reqiored classes
// An example of capturing a local variable from the
// enclosing scope

import java.lang.ref.WeakReference;

// Inrterface
interface MyFunction {

    // Method inside the interface
    int func(int n);
}

// Main class
class GFG {

    // Main driver method
    public static void main(String[] args)
    {

        // Custom local variable that can be captured
//        int number = 10;
//
//        MyFunction myLambda = (n) ->
//        {
//
//            // This use of number is OK It does not modify
//            // num
//            int value = number + n;
//
//            // However, the following is illegal because it
//            // attempts to mod;ify the value of number
//
//           // number++;
//            return value;
//        };
//
//        //Using the Lambda expression
//        System.out.println(myLambda.func(20));
//        System.out.println("GFG!");

        GFG obj = new GFG();
        WeakReference<GFG> weakGFG = new WeakReference<>(new GFG());
        weakGFG.get().man();
        for( int i = 0;i<=1;i++){
            System.out.println(i);
//            i--;

        }
//        obj = null; // Make object eligible for garbage collection
//        System.gc(); // Request garbage collection
//        System.out.println("After call the carbage collection");
//        weakGFG.get().man();


        exampleResponse exampleResponse = new exampleResponse();
        exampleResponse.setAge(22);
        exampleResponse.setName("ABC");

//        return new ResponseDTO<>().builder()
//                .Data(exampleResponse)
//                .err

    }

    @Override
    protected void finalize() throws Throwable {
//        super.finalize();
        System.out.println("Call before the gc () method");
    }

     public void man(){
        System.out.println("It's a weak reference" );
        man();
    }
}


 class ResponseDTO<T>{

     T Data;
     String message;


}


class exampleResponse{
    int age;
    String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

