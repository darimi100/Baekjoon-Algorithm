import java.util.Scanner;

public class AdevideB_1008 {
    public static void main(String[] args) {
        double a, b;
        Scanner s = new Scanner(System.in);
        // 정수형으로 계산할 시 소수점 이하를 버리기 때문에 실수형으로 계산
        a = s.nextDouble();
        b = s.nextDouble();
        System.out.print(a/b);
    }
}