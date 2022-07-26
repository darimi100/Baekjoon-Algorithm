import java.util.Scanner;

class PrintStar_1_2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i = 1; i <= x; i++) {
            for(int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}