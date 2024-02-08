package com.ohgiraffers.basic.datatype;

public class TrueFalse {

    public static void main(CharacterAndString[] args) {

        /* 참(true) 또는 거짓(false)의 값을 갖는 자료형을 불(boolean) 자료형이라고 한다.
        *   불 자료형에 대입되는 값은 참 또는 거짓만 가능하다.
        * */

        boolean isSuccess = true;
        boolean isTest = false;

        /* 불 연산
        *   불 자료형에는 불 연산의 결과값을 대입할 수 있다.
        *   2 > 1               // true
        *   1 == 2              // false
        *   3 % 2               // true (3을 2로 나눈 나머지는 1이므로 참)
        *   "3".equals("2")     // false
        * */

        /* 불 연산 사용 예 - 조건문
        *   불 연산은 보통 조건문의 판단 기준으로 많이 사용한다.
        * */

        int base = 180;
        int height = 185;
        boolean isTall = height > base;

        if(isTall) {
            System.out.println("키가 큽니다.");
        }

        int i = 3;
        boolean isOdd = i % 2 == 1;
        System.out.println(isOdd);

    }

}
