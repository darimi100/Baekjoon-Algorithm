public class Test {

    public static void main(String[] args) {
        
        String str = "OOXXOXXOOO";

        char[] c = str.toCharArray();
        System.out.println("길이 : " + c.length);
        System.out.println("------------------------------");
        for(int i =0; i < c.length; i++) {
            System.out.println(c[i]);
        }
        System.out.println("------------------------------");
        
    }
}
