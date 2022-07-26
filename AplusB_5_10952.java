import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean isZero = false;
        do {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a == 0 && b == 0) {
                isZero = true;
                break;
            }
            System.out.println(a+b);
        } while(!isZero);
    }
}