import java.util.Scanner;

class Sum_8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            sum += i;
        }
        System.out.print(sum);
    }
}