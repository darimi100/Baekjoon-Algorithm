import java.util.Scanner;

class OXquiz_8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] score = new String[sc.nextInt()];
        int tot = 0, cnt = 1;
        for (int i = 0; i < score.length; i++) {
            score[i] = sc.next();
        }
        sc.close();
        
       
        for (int i = 0; i < score.length; i++) {
            char[] c = score[i].toCharArray();
            tot = 0;
            cnt = 1;

            for (int j = 0; j < c.length; j++) {
                if(c[j] == 'O') {
                    tot += cnt;
                    cnt++;
                } else if(c[j] == 'X') {
                    cnt = 1;
                }
            }
            
            System.out.println(tot);
        }
        
    }
}