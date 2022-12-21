import java.util.*;
public class BAI10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char [] answer = {'A' ,'B', 'C', 'D', 'C'};
        char[][] sv =  {{'A', 'B', 'B', 'B', 'C'}, {'C', 'C', 'D', 'A', 'C'}, {'A', 'C', 'C', 'A', 'D'}, {'C', 'A', 'C', 'A', 'C'}, {'A', 'B', 'D', 'A', 'C'}};
        int[] score = new int[5];
        int n = 0;
        int maxScore = score[0];
        int countBestScore = 0;
        for(int i = 0; i < sv.length; i++) {
            int p = 0;
            for(int j = 0; j < sv[0].length; j++) {
                if(sv[i][j] == answer[j]) {
                    p += 2;
                } else continue;
            }
            score[n] = p;
            n++;
        }
        
        for(int j = 0; j < score.length; j++) {
                if(score[j] > maxScore) {
                    maxScore = score[j];
                } else continue;
                
            }
        
        int[][] result = new int[sv.length][2];
        for(int i = 0; i < result.length; i++) {
            for(int j = 0; j < result[0].length; j++) {
                result[i][0] = i + 1;
                result[i][1] = score[i];
            }
        }
        
        for(int i = 0; i < result.length; i++) {
            for(int j = i + 1; j < result.length; j++) {
                if(result[i][1] > result[j][1]) {
                    // swap index
                    int temp = result[i][0];
                    result[i][0] = result[j][0];
                    result[j][0] = temp;
                    // swap grade
                    int temp1 = result[i][1];
                    result[i][1] = result[j][1];
                    result[j][1] = temp1;
                }
            }
        }
        
        for(int i = 0; i < result.length; i++) {
                System.out.println("Score of student " + result[i][0] + " equal " + result[i][1]);
        }
        
        for(int i = 0; i < result.length; i++) {
            if(score[i] == maxScore) {
                System.out.println("The highest score belongs to the student " + (i + 1));
            }
        }
    }
}
