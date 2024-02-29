package com.ohgiraffers.generics.ex4;

import java.util.List;

public class ListUtils {
    public static void printList(List<?> list){
        for(Object item : list){
            System.out.println(item);
        }
    }
}
