import java.util.Scanner;

class MaybeAboveAvg_4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            int[] x = new int[sc.nextInt()];
            int sum = 0;
            int cnt = 0;
            for (int j = 0; j < x.length; j++) {
                x[j] = sc.nextInt();
                sum += x[j];
            }
            double avg = (double)sum / (double)x.length;
            for (int j = 0; j < x.length; j++) {
                if (x[j] > avg) {
                    cnt++;
                }
            }
            double tot = (double)cnt / x.length * 100;
            System.out.println(String.format("%.3f", tot) + "%");
        }
        sc.close();
    }
}