package com.sue.board6.board;

public class BoardVO {
	private int iboard;
	private String title;
	private String ctnt;
	private int iuser;
	private String regdt;

	private String unm;

	private int sIdx;
	private int page;
	private String search;

	String getSearch() {
		return search;
	}

	void setSearch(String search) {
		this.search = search;
	}

	int getsIdx() {
		return sIdx;
	}

	void setsIdx(int sIdx) {
		this.sIdx = sIdx;
	}

	int getPage() {
		return page;
	}

	void setPage(int page) {
		this.page = page;
	}

	public String getUnm() {
		return unm;
	}

	public void setUnm(String unm) {
		this.unm = unm;
	}

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

	public int getIuser() {
		return iuser;
	}

	public void setIuser(int iuser) {
		this.iuser = iuser;
	}

	public String getRegdt() {
		return regdt;
	}

	public void setRegdt(String regdt) {
		this.regdt = regdt;
	}
}