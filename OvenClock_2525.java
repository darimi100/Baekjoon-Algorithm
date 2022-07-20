import java.util.Scanner;

class OvenClock_2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int th = sc.nextInt();
        int tm = sc.nextInt();
        int cookTime = sc.nextInt();
        
        if (tm + cookTime < 60) {
            System.out.print(th + " " + (tm + cookTime));
        } else if (th + (tm + cookTime)/60 >= 24) {
            System.out.print((th + (tm + cookTime)/60 - 24) + " " + (tm + cookTime)%60 );
        } else {
            System.out.print((th + (tm + cookTime)/60) + " " + (tm + cookTime)%60);
        }
    }
}