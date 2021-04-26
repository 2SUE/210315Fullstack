package com.sue.board;

// value object
// DB 테이블 구조와 1:1 매칭
// 값 전달용
public class BoardVO {
	private int iboard;
	private String title;
	private String ctnt;
	
	public int getIboard() {
		return iboard;
	}
	
	public void setIboard(int iboard) {
		this.iboard = iboard;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getCtnt() {
		return ctnt;
	}
	
	public void setCtnt(String ctnt) {
		this.ctnt = ctnt;
	}
}
