import java.util.Scanner;

class AlarmClock_2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        if (m >= 45) {
            System.out.print(h + " " + (m-45));
        } else if (h == 0) {
            System.out.print(23 + " " + (60-(45-m)));
        } else {
            System.out.print(h-1 + " " + (60-(45-m)));
        }
    }
}

// line 9, 11, 13 : 연산을 괄호로 감싸지 않으면 String + int -> String + String 암묵적 형변환이 발생
//                  '-' 연산자가 String - int 연산으로 오류가 발생하게 된다.