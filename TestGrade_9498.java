import java.util.Scanner;

public class TestGrade_9498 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        if(a <= 100 && a >= 90){
            System.out.print("A");
        } else if(a <= 89 && a >= 80){
            System.out.print("B");
        } else if(a <= 79 && a >= 70){
            System.out.print("C");
        } else if(a <= 69 && a >= 60){
            System.out.print("D");
        } else {
            System.out.print("F");
        }
    }
}
