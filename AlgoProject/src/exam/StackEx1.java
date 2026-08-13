package exam;

import java.util.Scanner;
import datastructure.stack.Stack;

public class StackEx1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("수식을 입력하세요. : ");
        String a = sc.nextLine();
        
        System.out.println(sikCheck(a));
        sc.close();
    }
    
    public static boolean sikCheck(String a) {
        
        Stack stk = new Stack(a.length());
        
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            
            // 여는 괄호일 경우 스택에 푸시
            if (ch == '(' || ch == '{' || ch == '[') {
                stk.push(ch);
            }
            // 닫는 괄호일 경우
            else if (ch == ')' || ch == '}' || ch == ']') {
                
                // 닫을 괄호가 없는데 닫는 괄호가 나온 경우
                if (stk.isEmpty()) {
                    return false;
                }
                
                // 스택에서 가장 최근에 열린 괄호를 반환
                char openChar = (char) stk.pop();
                
                // 3. 짝이 맞는지 검사 
                if (ch == ')' && openChar != '(') return false;
                if (ch == '}' && openChar != '{') return false;
                if (ch == ']' && openChar != '[') return false;
            }
        }
        
        // 탐색이 끝났을 때 스택이 완전히 비어있어야 올바른 괄호 수식
        return stk.isEmpty();
    }
}