import java.util.Scanner;

class PrintStar_2_2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        for(int i = 1; i <= x; i++) {
            for(int j = x - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for(int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}