package com.ohgiraffers.practice_chap4;

import java.util.Scanner;

public class A_if {

    public void practiceStatement() {

        Scanner sc = new Scanner(System.in);
        System.out.print("정수 한 개 입력하세요: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("입력하신 숫자는 양수입니다.");
        } else {

            System.out.println("양수가 아닙니다.");

        }
    }

    /* 정수를 입력 받아 그 수가 짝수인지 홀수인지 판단해서 결과를 출력하세요
     * 짝수인 경우 "짝수다." 출력, 홀수인 경우 "홀수다." 출력
     *
     * -- 입력 예시 --
     * 정수를 하나 입력하세요 : 5
     *
     * -- 출력 예시 --
     * 홀수다.
     * */
    public void practiceStatement2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 하나 입력하세요: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("짝수다");


        } else {
            System.out.println("홀수다");
        }

    }

    /* 1~10 사이의 정수 한개를 입력받아 홀수인지 짝수인지 인지 확인하고,
     * 홀수이면 "홀수다.", 홀수가 아니면 "짝수다." 라고 출력하세요.
     * 단, 1~10 사이의 정수가 아닌 경우 "반드시 1~10 사이의 정수를 입력해야 합니다." 를 출력하세요.
     * */

    public void practiceStatement3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 하나 입력하세요:");
        int num = sc.nextInt();

        if (num >= 1 && num <= 10) {

            if (num % 2 != 0) {
                System.out.println("입력하신 숫자는 홀수입니다.");
            } else {
                System.out.println("입력하신 숫자는 짝수입니다.");
            }
        } else {
            System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
        }

    }

    /* BMI(신체질량지수)를 계산하고, 계산된 값에 따라
     * 저체중(20 미만)인 경우 "당신은 저체중 입니다.",
     * 정상체중(20이상 25미만)인 경우 "당신은 정상체중 입니다.",
     * 과제충(25이상 30미만)인 경우 "당신은 과체중 입니다.",
     * 비만(30이상)인 경우 "당신은 비만 입니다." 를  출력하세요
     *
     * BMI 계산 방법은 체중(kg) / (신장(m) * 신장(m)) 이다.
     *
     * 계산 예시) BMI = 67 / (1.7 * 1.7)
     * */

    public void practiceStatement4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("당신의 신장을 입력하시오: ");
        double height = sc.nextDouble();
        System.out.print("당신의 체중을 입력하시오: ");
        int mass = sc.nextInt();
        double bmi = (mass / (height * height));
        String result = "";

        if (bmi >= 30) {
            result = "당신은 비만입니다.";
        } else if (bmi >= 25 && bmi < 30) {
            result = "당신은 과체중입니다.";
        } else if (bmi >= 20 && bmi < 25) {
            result = "당신은 정상체중입니다";
        } else {
            result = "당신은 저체중입니다.";
        }
        System.out.println(result);
    }

    /* 두 개의 정수를 입력 받아 변수에 저장하고,
     * 연산기호(+, -, *, /, %)를 입력 받아 해당 연산의 수행 결과를 출력하세요.
     * 단, 준비된 연산기호 외의 문자를 입력하는 경우 "입력하신 연산은 없습니다. 프로그램을 종료합니다." 출력 후 프로그램 종료
     *
     * -- 입력 예시 --
     * 첫 번째 정수 : 4
     * 두 번쨰 정수 : 3
     * 연산 기호를 입력하세요 : +
     *
     * -- 출력 예시 --
     * 4 + 3 = 7
     */

    public void practiceStatement5() {



    }



}




