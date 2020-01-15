package Day2;

import java.util.Arrays;

public class knum {

    public int[] solution(int[] array, int[][] commands){
        int[] answer = new int[commands.length];
        for(int i=0;i < commands.length; i++){
            int[] splitedArr = splitArr(array,commands[i]);
            int[] sortedArr = bSort(splitedArr);
            int findIdx = (commands[i][2])-1;
            answer[i] = findNum(sortedArr,findIdx);
        }
        return answer;
    }

    public int[] splitArr(int[] array, int[] commands){
        int[] tempArr;
        int startIdx = commands[0] - 1;
        int endIdx = commands[1];
        if(startIdx == endIdx){
            tempArr = Arrays.copyOfRange(array,startIdx,endIdx+1);
        }else{
            tempArr = Arrays.copyOfRange(array,startIdx,endIdx);
        }
        return tempArr;
    }

    public int[] bSort(int[] splitedArr){
        int temp;
        int cnt = 1;
        while(cnt > 0){
            cnt = 0;
            for(int i=0;i<splitedArr.length-1;i++){
                if(splitedArr[i] > splitedArr[i+1]){
                    temp = splitedArr[i];
                    splitedArr[i] = splitedArr[i+1];
                    splitedArr[i+1] = temp;
                    cnt ++;
                }
            }
        }
        System.out.println(Arrays.toString(splitedArr));
        return splitedArr;
    }

    public int findNum(int[] sortedArr,int findIdx){
        return sortedArr[findIdx];
    }


    public static void main(String[] args) {

        knum k = new knum();

        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};

        int[] answer = k.solution(array,commands);
        System.out.println(Arrays.toString(answer));
    }
}
