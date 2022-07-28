import java.util.Scanner;

class PlusCycle_1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int x = num;
        int cnt = 0;
        
        do {
            int a = x / 10;
            int b = x % 10;
            x = b * 10 + (a + b) % 10;
            cnt++;
        } while(x != num);
        System.out.print(cnt);
    }
}