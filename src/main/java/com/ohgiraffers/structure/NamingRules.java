package com.ohgiraffers.structure;

public class NamingRules {

    public static void main(String[] args) {

        /* 1. 클래스 이름 짓기
        *   자바 클래스의 이름은 아무렇게나 지어도 되지만 다음과 같은 규칙이 있다.
        *   - 클래스 명은 명사로 한다.
        *   - 클래스명은 대문자로 시작한다.
        *   - 여러개의 단어를 조합하여 만들 경우 각 단어의 첫 번째 글자는 대문자이어야 한다.(파스칼 케이스(pascal case)
        *       ex) class Cookie { }
        *       ex) class ChocoCookie { }
        * */

        /* 2. 메소드 이름 짓기
        *   메소드 명은 보통 다음과 같은 규칙을 따른다.
        *   - 메소드명은 동사로 한다.
        *   - 메소드명은 소문자로 시작한다.
        *   - 여러개의 단어를 조합하여 만들 경우 맨 첫 글자를 제외한 나머지 단어의 첫 글자는 대문자를 써서 구분한다.(카멜 케이스(camel case)
        *       ex) run();
        *       ex) runFast();
        *       ex) getBackground();
        * */

        /* 3. 변수 이름 짓기
        * 변수 이름은 짧지만 의미가 있어야 한다. 즉, 변수명만 봐도 사용한 이유를 알 수 있게 지어야 한다.
        * 변수명에 '_', '$'를 쓸 수 있지만 시작 문자로 사용하는 것은 지양하자.
        *       ex) String userName;
        *       ex) float lineWidth;
        *       ex) int i;
        *       ex) char c;
        * */

    }

}
