import java.util.Scanner;

class Avarage_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int g[] = new int[sc.nextInt()];
        
        for (int i = 0; i < g.length; i++) {
            g[i] = sc.nextInt();
            System.out.println(g[i]);
        }
        
        int max = g[0];
        for (int i = 1; i < g.length; i++) {
            if(max < g[i]) {
                max = g[i];
            }
        }
        
        double sum = 0;
        for (int i = 0; i < g.length; i++) {
            sum += (double)g[i]/(double)max * 100;
        }
        System.out.print(sum/(double)g.length);
    }
}