import java.io.*;
import java.util.StringTokenizer;

class FastAplusB_15552 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            int num = Integer.parseInt(br.readLine());

            for (int i = 0; i < num; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                bw.write((a+b)+"\n");
            }

            bw.flush();
            bw.close();
            
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}

// BufferReader & BufferWriter 클래스
// 1. 입출력이 많은 경우 Scanner 클래스와 System.out.print()보다 버퍼를 사용한 방법이 더 빠르다.
// 2. BufferReader & BufferWriter 클래스는 문자열을 다루는 클래스이기 때문에 write() 메소드에 정수를 넣게 되면 ascii 타입으로 인코딩을 한다.