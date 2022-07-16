import java.util.Scanner;

public class Multiplication_2588 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a * (b%10));
        System.out.println(a * (b%100/10));
        System.out.println(a * (b/100));
        System.out.print(a * b);
    }
}

/* 
    1. Integer.parseInt(String a);
        매개변수로 String형을 받는데 b.charAt(int index);에서는 Char형을 리턴하기 때문에 오류 발생 


    2. int와 Integer의 차이
        int : 기본 자료형
        Integer : Wrapper 클래스(객체로 생성) - * 기본 자료형 8개를 "객체로 다루기" 위해서 JDK에서 만들어진 클래스 *
                                            + java.lang 패키지 제공
        (Boxing : 기본 자료형 -> Wrapper 객체)
        Integer i = Integer.valueOf(100);
        Double d = Double.valueOf(3.14); 
        Boolean b = Boolean.valueOf(true);

        (Unboxing : Wrapper 객체 -> 기본 자료형)
        int numI = i.intValue();
        double numD = d.doubleValue();
        boolean bool = b.booleanValue();

        +++ autoBoxing에 대해서 공부해보기


    3. 각 자릿수를 구하는 방법
            [천] [백] [십] [일] ...
        num = 1   5   4   2
        n = 10의 (num 자릿수 - 1)제곱수 (ex) 1542 -> n = 1000

        [천]: num / 천 -> 1542 / 1000
        [백]: num % 천 / 벡
        [십]: num % 백 / 십
        .
        . num % (10 ^구하려는 자릿수+1) / 10 ^구하려는 자릿수
        .
        [마지막]: num % 10 
*/ 