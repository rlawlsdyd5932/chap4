package ohgiraffers.section02.looping;

import java.sql.SQLOutput;
import java.util.Scanner;

public class A_for {

    public void testSimpleForStatement() {

        /*수업목표. for문 단독 사용에 대한 흐름에 이해하고 적용할수 있다,
        * 필기.
        * [for문 표현식]
        * for(초기식; 조건식; 증감식;) {
        *            조건을 만족하는 경우 수행할 구문(반복할 구문)
        * }
        * */

        /*1부터 10까지 1씩 증가시키면서 (10번) i값을 출력하는 기본 반복문*/
        for(int i=1; i<=10; i++) {
            System.out.println(i);

        }

    }

    public void testForExample1() {
        Scanner sc=new Scanner(System.in);
        System.out.print("1번째 학생의 이름을 입력해주세요: ");
        String student1=sc.nextLine();
        System.out.println("1번째 학생의 이름은"+student1+"입니다.");

        System.out.print("2번째 학생의 이름을 입력해주세요: ");
        String student2=sc.nextLine();
        System.out.println("2번째 학생의 이름은"+student2+"입니다.");

        System.out.print("3번째 학생의 이름을 입력해주세요: ");
        String student3=sc.nextLine();
        System.out.println("3번째 학생의 이름은"+student3+"입니다.");

        System.out.print("4번째 학생의 이름을 입력해주세요: ");
        String student4=sc.nextLine();
        System.out.println("4번째 학생의 이름은"+student4+"입니다.");

        System.out.print("5번째 학생의 이름을 입력해주세요: ");
        String student5=sc.nextLine();
        System.out.println("5번째 학생의 이름은"+student5+"입니다.");

        System.out.print("6번째 학생의 이름을 입력해주세요: ");
        String student6=sc.nextLine();
        System.out.println("6번째 학생의 이름은"+student6+"입니다.");

        System.out.print("7번째 학생의 이름을 입력해주세요: ");
        String student7=sc.nextLine();
        System.out.println("7번째 학생의 이름은"+student7+"입니다.");

        System.out.print("8번째 학생의 이름을 입력해주세요: ");
        String student8=sc.nextLine();
        System.out.println("8번째 학생의 이름은"+student8+"입니다.");

        System.out.print("9번째 학생의 이름을 입력해주세요: ");
        String student9=sc.nextLine();
        System.out.println("9번째 학생의 이름은"+student9+"입니다.");

        System.out.print("10번째 학생의 이름을 입력해주세요: ");
        String student10=sc.nextLine();
        System.out.println("10번째 학생의 이름은"+student10+"입니다.");


        System.out.println("10명의 학생 이름을 입력받고 출력하는 기능을 완료했습니다.");
        for(int i=1; i<=10; i++) {
            System.out.println(i+"번째 학생의 이름을 입력해주세요.");
            String student=sc.nextLine();
            System.out.println(i +"번째 학생의 이름은" + student+"입니다.");

        }
    }

    public void tesForExample2() {

        /*1~10까지 1씩 증가시키면서 증가시키는 값을 저장할 변수에 계속 누적시켜 변수에 저장된 값을 출력하시오.*/

        int num1=1;
        int num2=2;
        int num3=3;
        int num4=4;
        int num5=5;
        int num6=6;
        int num7=7;
        int num8=8;
        int num9=9;
        int num10=10;

        int sum=0;

        sum+=num1;
        sum+=num2;
        sum+=num3;
        sum+=num4;
        sum+=num5;
        sum+=num6;
        sum+=num7;
        sum+=num8;
        sum+=num9;
        sum+=num10;

        System.out.println("sum = " + sum);

        int sum2=0;
        for(int i=1; i<=10; i++) {
            sum2 +=i;
        }

        System.out.println("sum2 = " + sum2);

    }

}
