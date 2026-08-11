package exam.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int maxWordLen = 0;
		String maxWord = "";
		
		List<String> lists = new ArrayList<String>();
		
		for(int i = 0; i < 4; i++) {
			System.out.print("단어를 입력하세요>>");
			lists.add(sc.next());
		}
		
		System.out.println("-----------------------");
		for(String list : lists) {
			System.out.print(list + " ");
			if(list.length() > maxWordLen) {
				maxWordLen = list.length();
				maxWord = list;
			}
		}
		System.out.println();
		System.out.println("가장 긴 단어는 : " + maxWord);
		System.out.println("가장 긴 단어의 길이는 : " + maxWordLen);
		sc.close();
	}
}
