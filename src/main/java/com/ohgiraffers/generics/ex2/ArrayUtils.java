package com.ohgiraffers.generics.ex2;

public class ArrayUtils {
    public static <T> void printArray(T[] array) {

        for (T element : array) {
            System.out.println(element);
        }

    }
}
