package com.ohgiraffers.section01.literal;

public class Applicationh3 {

    public static void main(String[] args) {
//문자열 합기치 결과를 예측하고 사용할 수 있다.
        //1. 두 개의 문자열 합치기
        System.out.println("=====두개의 문자열 합치기=====");
        System.out.println(9+9);
        System.out.println("9"+9);
        System.out.println(9+"9");
        System.out.println("9"+"9");

//2. 세 개의 문자열 합치기
        System.out.println("=====세 개의 문자열 합치기=====");
        System.out.println(9+9+"9");
        System.out.println(9+"9"+9);
        System.out.println("9"+9+9);

        System.out.println("9"+(9+9));

        System.out.println("10과20의 합: "+(10+20));
        System.out.println("10과20의 차: "+(10+20));
        System.out.println("10과20의 곱: "+(10+20));
        System.out.println("10과20의 나누기 한 몫: "+(10+20));
        System.out.println("10과20의 나누기 한 나머지: "+(10+20));


        System.out.println("기차");
        System.out.println("기차"+"칙칙폭폭");
        System.out.println("기차"+123+45+"출발");
        System.out.println(123+45+"기차"+"출발");



    }
}
