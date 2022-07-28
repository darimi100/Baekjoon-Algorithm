import java.util.Scanner;

class MaxValue_2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[9];
        
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        
        int n = num[0], index = 0;
        for (int i = 1; i < num.length; i++) {
            if (num[i] > n) {
                n = num[i];
                index = i;
            }
        }
        System.out.print(n + "\n" + (index+1));
    }
}