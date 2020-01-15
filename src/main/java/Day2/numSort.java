package Day2;

import java.io.*;
import java.util.Scanner;

public class numSort {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        int num = br.read();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] numCnt = new int[10001];
        for(int i=0;i<num;i++){
//            int temp_num = br.read();
            int temp_num = sc.nextInt();
            numCnt[temp_num]++;

        }

        for(int i=0;i<numCnt.length;i++){
            if(numCnt[i] > 0){
                for(int j=0;j<numCnt[i];j++){
//                    bw.write(i);
                    System.out.println(i);
                }

            }
        }
    }
}
