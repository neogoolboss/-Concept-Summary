package com.ohgiraffers.generics;

import com.ohgiraffers.generics.ex2.ArrayUtils;
import com.ohgiraffers.generics.ex1.Pair;
import com.ohgiraffers.generics.ex3.Stack;
import com.ohgiraffers.generics.ex3.StringStack;
import com.ohgiraffers.generics.ex4.ListUtils;

import java.util.List;

public class Generics {

    public static void main(String[] args) {

        /* Piar */
        Pair<String, Integer> pair = new Pair<>("One", 1);
        String first = pair.getFirst();
        Integer second = pair.getSecond();

        System.out.println(first); // One
        System.out.println(second); // 1
        System.out.println();

        /* printArray */

        Integer[] intArray = {1, 2, 3, 4 ,5};
        ArrayUtils.printArray(intArray);
        System.out.println();

        /* Stack interface */
        Stack<String> stringStack = new StringStack(5); // String을 저장하는 stack 생성
        stringStack.push("One");
        stringStack.push("Two");
        stringStack.push("Three");

        System.out.println(stringStack.pop()); // Three
        System.out.println(stringStack.pop()); // Two
        System.out.println(stringStack.pop()); // One
        System.out.println(stringStack.pop()); // null
        System.out.println();

        /* printList */

        List<Integer> intList = List.of(1,2,3,4,5);
        ListUtils.printList(intList);





    }

}
