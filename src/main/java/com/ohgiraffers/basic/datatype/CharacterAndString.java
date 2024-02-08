package com.ohgiraffers.basic.datatype;

public class CharacterAndString {

    public static void main(String[] args) {

        /* 문자 자료형은 char를 이용한다.
         *       ex) char a1 = 'a';
         *   문자값 앞 뒤를 단일 인용 부호 ' ' 로 감싸 주어야 한다.
         * */

        char a1 = 'a';          // 문자로 표현
        char a2 = 97;           // 아스키코드로 표현
        char a3 = '\u0061';     // 유니코드로 표현

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        /* ================================================================================================= */

        /* 문자열
        * 문자열이란 문자로 구성된 문장을 뜻한다.
        * 자바에서 문자열을 나타내는 자료형은 String이다. */
        String a = "Happy Java";
        String b = "a";
        String c = "123";

        /* 다음과 같이 표현할 수도 있다.
        String a = new String("Happy Java");
        String b = new String("a");
        String c = new String("123");

        이때 new 키워드는 객체를 만들 때 사용한다. 문자열을 표현할 때는 가급적이면 리터럴(literal)표기 방식을 사용하는 것이 좋다.
        */

        /* 원시 자료형
        *   int, long, double, float, boolean, char 자료형을 원시(primitive) 자료형이라고 한다.
        *   이런 원시 자료형은 new 키워드로 값을 생성할 수 없다.(리터럴 표기 방식으로만 값을 세팅할 수 있다.)
        *   String은 리터럴 표기 방식을 사용할 수 있지만 원시 자료형에 포함되지 않는다.
        * */

        /* Wrapper 클래스
        * 원시 자료형에는 각각 그에 대응하는 Wrapper 클래스가 있다.
        * Wrapper 클래스는 원시 자료형을 대신하여 사용할 수 있는 자료형으로, 객체지향 프로그래밍의 몯느 기능을 활용할 수 있게 해준다.
        *
        *       원시 자료형   |   Wrapper 클래스
        *          int      |      integer
        *         long      |       Long
        *        double     |      Double
        *         float     |       Float
        *        boolean    |      Boolean
        *         char      |       Char
        *
        * Wrapper 클래스를 사용하면 값 대신 객체를 주고받을 수 있어서 코드를 객체 중심으로 작성하는데 유리하다.
        * */

        /* 문자열 내장 메소드
        * String 자료형의 내장 메소드는 문자열 객체에 속한 함수라 할 수 있다. */

        /* 1. equals : 문자열 2개가 같은지를 비교하여 결과값을 리턴한다. */

        String str1 = "hello";
        String str2 = "java";
        String str3 = "hello";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println();

        /* 2. indexOf : 문자열에서 특정 문자열이 시작되는 위치(인덱스 값)를 리턴한다. */

        String str4 = "Hello Java";
        System.out.println(str4.indexOf("java"));
        System.out.println();

        /* 3. contains : 문자열에서 특정 문자열이 포함되어 있는지 여부를 리턴한다. */

        String str5 = "Hello Java";
        System.out.println(str5.contains("Java"));
        System.out.println();

        /* 4. charAt : 문자열에서 특정 위치의 문자를 리턴한다. */
        String str6 = "Hello Java";
        System.out.println(str6.charAt(6));
        System.out.println();

        /* 5. replaceAll : 특정 문자열을 다른 문자열로 바꿀 때 사용한다. */
        String str7 = "Hello java";
        System.out.println(str7.replaceAll("java", "World"));
        System.out.println();

        /* 6. substring : 문자열에서 특정 문자열을 뽑아낼 때 사용한다. */
        String str8 = "Hello Java";
        System.out.println(str8.substring(0,4)); // substring(시작위치, 끝위치) 시작위치 <= str8 < 끝위치
        System.out.println();

        /* 7. toUpperCase : 문자열을 모두 대문자로 변경할 때 사용한다. */
        String str9 = "hello world";
        System.out.println(str9.toUpperCase());
        System.out.println();

        /* 8. split : 문자열을 특정한 구분자로 나누어 문자열 배열로 리턴한다. */
        String str10 = "a:b:c:d";
        String[] result = a.split(":");

        /* 문자열 포매팅(formatting) */

        /* 숫자 바로 대입하기
        *   문자열 포매팅은 String.format 메소드를 사용한다. */
        System.out.println(String.format("I eat %d apples", 3));

        /* 문자열 바로 대입하기 */
        System.out.println(String.format("I eat %s apples.", "five"));

        /* 숫자값을 나타내는 변수 대입하기 */
        int num1 = 3;
        System.out.println(String.format("I eat %d apples.", num1));

        /* 값을 2개 이상 넣기 */
        int num2 = 10;
        String day = "three";
        System.out.println(String.format("I ate %d apples. So I was sick for %s days", num2, day));
        System.out.println();

        /* 문자열 포맷 코드
        *       종류              설명
        *       %s           문자열(String)
        *       %c         문자 1개(character)
        *       %d           정수(Integer)
        *       %f       부동 소수(floating-point)
        *       %o               8진수
        *       %x               16진수
        *       %%             특수 문자 %
        * */

        /* %s는 자동으로 전달되는 파라미터 값을 문자열로 바꾸어 사용한다. */
        System.out.println(String.format("I have %s apples.", 3));
        System.out.println(String.format("rate is %s.", 3.234));

        /* 특수문자인 %를 나타내려면 반드시 %%을 써야한다.*/
        //System.out.println(String.format("Error is %d%", 98));
        System.out.println(String.format("Error is %d%%", 98));

        /* System.out.printf() 을 사용하면 String.format 메소드가 없어도 가능하다. */
        System.out.printf("Error is %d%%",97);


    }

}
