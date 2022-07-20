import java.util.Scanner;

class ThreeDice_2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] d = new int[3];
        for(int i = 0; i < d.length; i++) {
            d[i] = sc.nextInt();
        }
        int num = 0;
        
        if (d[0] == d[1] && d[1] == d[2]) {
            System.out.print(10000 + d[0] * 1000);
        } else if (d[0] == d[1] || d[1] == d[2] || d[0] == d[2]) {
            if (d[0] == d[1]) {
                num = d[0];
            } else if (d[1] == d[2]) {
                num = d[1];
            } else {
                num = d[2];
            }
            System.out.print(1000 + num * 100);
        } else {
            num = d[0];
            for (int i = 1; i < d.length; i++) {
                num = (num < d[i]) ? d[i] : num;
            }
            System.out.print(num * 100);
        }
    }
}