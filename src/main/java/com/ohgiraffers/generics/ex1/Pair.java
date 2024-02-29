package com.ohgiraffers.generics.ex1;

public class Pair <T, U> {  // T는 첫번째 값의 데이터 유형, U는 두번째 값의 데이터 유형

    /* T : 첫번째 타입
    *  U : 두번째 타입
    *  */

    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return  first;
    }

    public U getSecond() {
        return second;
    }


}
