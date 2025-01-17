package org.example;

import java.util.function.Function;

public class Funn {

    private static String apply(Integer str) {
        return new String(str+"a");
    }

    public static void main(String[] args) {
        Function<Integer, String> lengthFunction = Funn::apply;
        System.out.println(lengthFunction.apply(3)); // 5

    }


}
