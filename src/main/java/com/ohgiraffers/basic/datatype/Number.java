package com.ohgiraffers.basic.datatype;

public class Number {

    public static void main(CharacterAndString[] args) {

        /* 숫자 자료형은 숫자 형태로 이루어지며 우리가 익숙히 알고 있는 것들이다. */

        /* 1. 정수
        *   자바에서 정수를 표현하는 자료형은 byte, short, int, long이다.
        *       byte  :  -128 ~ 127
        *       short :  -32768 ~ 32767
        *       int   :  -2147483648 ~ 2147483647
        *       long  :  -9223372036854775808 ~ 923372036854775807
        *       byte와 short는 잘 사용하지 않는다.(특정 상황에서 효율적인 메모리 사용이 필요한 경우에 사용)
        *           ex) int age = 10;
        *           ex) long countOfStar = 86294234123L;
        *       long 자료형 변수에 값을 대입할 때 끝에 접미사로 L을 붙여주어야 한다.
        * */

        /* 2. 실수
        *   자바에서 실수를 표현하는 자료형은 float, double이다.
        *       float  : -3.4 * 1.0e38 ~ 3.4 * 1.0e38
        *       double : -1.7 * 1.0e308 ~ 1.7 * 1.0e308
        *           ex) float pi = 3.14f;
        *           ex) double morePi = 3.14159265358979323846;
        *       자바에서 실수형은 기본값이 double이므로 float 변수에 값을 대입할 때에는 끝에 접미사로 F을 꼭 붙여줘야 한다.
        * */

        /* 3. 8진수와 16진수
        * 8진수와 16진수는 int 자료형을 사용한다.
        * 숫자 0으로 시작하면 8진수, 숫자 0과 알파벳 x로 시작하면 16진수가 된다.
        *           ex) int octal = 023; // 십진수 : 19
        *           ex) int hex = 0xC3;  // 십진수 : 195
        * */

        /* 4. 숫자 연산 */
        int a = 10;
        int b = 5;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        /* %는 나머지 값을 반환하는 연산자이다. */
        System.out.println(a % b);
        System.out.println();

        /* 5. 증감 연산*/
        /* 자바에서는 ++, -- 기호를 이용하여 값을 증가 또는 감소시킬 수 있는데 이를 증감 연산자라고 한다. */

        int i = 0;
        int j = 10;
        i++;
        j--;

        System.out.println(i);
        System.out.println(j);

        /* 주의사항
        *  i++ : 값을 참조한 후에 증가
        *  ++i : 값을 참조하기 전에 증가
        * */



    }

}
