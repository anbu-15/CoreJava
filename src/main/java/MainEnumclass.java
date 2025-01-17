enum Enumcls {
 INSTANCE;
 public void some() {
     System.out.println("Enum");
 }
}

public class MainEnumclass {
    public static void main(String[] args) {
//        Enumcls.INSTANCE.some();
     Enumcls e1= Enumcls.INSTANCE;
     Enumcls e2= Enumcls.INSTANCE;
     if(e1==e2)
     {
         System.out.println("both instances are same");
     }
     else {
         System.out.println("both instances are not same");
     }
    }
}