package com.examples;

public class MyCalc {
	private int no1;
	private int no2;
	private int ans;
	
	
	public int getAns() {
		ans = addInt();
		return ans;
	}


	public void setAns(int ans) {
		this.ans = ans;
	}


	public int getNo1() {
		return no1;
	}


	public void setNo1(int no1) {
		this.no1 = no1;
	}


	public int getNo2() {
		return no2;
	}


	public void setNo2(int no2) {
		this.no2 = no2;
	}


	public int addInt(){
		return no1 + no2;
	}
}
