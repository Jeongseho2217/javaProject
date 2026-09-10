package com.spring_aop.xml2;

public class Evaluation {
	private int KorScore;
	private int EngScore;
	private int MathScore;
	
	public int getKorScore() {
		return KorScore;
	}
	public void setKorScore(int korScore) {
		KorScore = korScore;
	}
	public int getEngScore() {
		return EngScore;
	}
	public void setEngScore(int engScore) {
		EngScore = engScore;
	}
	public int getMathScore() {
		return MathScore;
	}
	public void setMathScore(int mathScore) {
		MathScore = mathScore;
	}
	
	public void showResult() {
		System.out.println("과목 총점 : " + (MathScore + EngScore + KorScore) + "점");
		System.out.println("과목 평균 : " + ((MathScore + EngScore + KorScore) / 3) + "점");
	}
}
