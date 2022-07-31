import java.util.Scanner;

class Remainder_3052 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        boolean isEqual = false;
        int cnt = 0;
        
        for(int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt() % 42;
        }
        
        for (int i = 0; i < num.length; i++) {
            isEqual = false;
            for (int j = i+1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    isEqual = true;
                    break;
                }
            }
            if(!isEqual) {
                cnt++;
            }
        }
        
        System.out.println(cnt);
    }
}