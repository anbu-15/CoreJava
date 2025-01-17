//Method overriding with Exception
package org.example;

//class OverridingException {
//   void move() throws Exception{
//       System.out.println("Exception: It is an checked Exception");
//    }
//}
//class SubClas extends OverridingException{
//    int a=10;
//    int b=0;
//    void move() throws ArithmeticException{
//        System.out.println(a/b);
//    }
//}

import java.io.IOException;

//class OverridingException {
//    void move() throws Throwable {
//        System.out.println("Exception: It is an checked Exception");
//    }
//}
//class SubClas extends OverridingException{
//    void move() throws Exception{//this is not the subclass of super class exception ...so it is not possible
//        System.out.println("Exception and error super class is Throwable");
//    }
//}
class OverridingException {
    void move() throws Exception {
        System.out.println("Exception: It is an checked Exception");
    }
}
class SubClas extends OverridingException{
    void move() throws IOException{//this is not the subclass of super class exception ...so it is not possible
        System.out.println("Exception-> it should throws its subclass exception in subclass method");
    }
}
public class MainClass{
public static void main(String[] args) {
    SubClas o=new SubClas();
try {
    o.move();
}catch(Exception e){
    e.printStackTrace();
}

}
}