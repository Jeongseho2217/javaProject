package exam;

import java.util.Scanner;

public class Score_ex {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int[] scores = null;
        int stuNum = 0;
        
        while(true) {        
            System.out.println("------------------------------------------------");
            System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5.종료");
            System.out.println("------------------------------------------------");
                
            System.out.print("선택>");
            int input = sc.nextInt();
            
            switch(input) {
                case 1: {
                    System.out.print("학생수>");
                    stuNum = sc.nextInt();
                   
                    scores = new int[stuNum];
                    break;
                }
                case 2: {          
                    for(int i = 0; i < scores.length; i++) {
                        System.out.print("scores[" + i + "]>");
                        scores[i] = sc.nextInt();
                    }
                    break;
                }
                case 3: {
                    for(int i = 0; i < scores.length; i++) {
                        System.out.println("scores[" + i + "]: " + scores[i]);
                    }   
                    break;
                }
                case 4: {
                    int max = 0;
                    int sum = 0;
                    
                    for(int score : scores) {
                        if(score > max) max = score;
                        sum += score;
                    }
                    
                    double avg = (double) sum / scores.length;
                    System.out.println("최고 점수: " + max);
                    System.out.println("평균 점수: " + avg);
                    break;
                }
                case 5: {
                    System.out.println("프로그램 종료");
                    sc.close();
                    return;
                }
                default: {
                    System.out.println("1~5 사이의 번호를 입력해주세요.");
                }
            }
        }
    }
}