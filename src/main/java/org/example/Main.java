//Method overriding with Exception
//this program : it will execute like first it will give output as child and then throw exception....
//but when we use print statement after throwing an exception.... its not possible
package org.example;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

class Parent {
    void display() throws IOException {
        System.out.println("Parent display method.");
    }
}

class Child extends Parent {
    @Override
    void display() throws IOException {
        // Explicitly throwing IOException in the Child class

        System.out.println("child");
        throw new IOException("IOException thrown from Child class.");

// its not possible after throwing an exception we will not use print statement
//        throw new IOException("IOException thrown from Child class.");
//        System.out.println("child");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent obj = new Child(); // Polymorphism: Parent reference to Child object
        try {
            obj.display(); // Calls the overridden method in the Child class
        } catch (Exception e) { // Catching any Exception (including IOException)
            e.printStackTrace(); // Prints exception details
//            Set<> s=new HashSet<>();
//
//            s.add()
        }
    }



}