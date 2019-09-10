package com.web.grade.domains;

import java.io.Serializable;

public class GradeBean implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String kor,eng,math,soceity;
	private int sum,avg;
	public String getKor() {
		return kor;
	}
	public void setKor(String kor) {
		this.kor = kor;
	}
	public String getEng() {
		return eng;
	}
	public void setEng(String eng) {
		this.eng = eng;
	}
	public String getMath() {
		return math;
	}
	public void setMath(String math) {
		this.math = math;
	}
	public String getSoceity() {
		return soceity;
	}
	public void setSoceity(String soceity) {
		this.soceity = soceity;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public int getAvg() {
		return avg;
	}
	public void setAvg(int avg) {
		this.avg = avg;
	}
	@Override
	public String toString() {
		return "GradeBean [kor=" + kor + ", eng=" + eng + ", math=" + math + ", soceity=" + soceity + ", sum=" + sum
				+ ", avg=" + avg + "]";
	}
	
	

}