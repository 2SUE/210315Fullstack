package com.sue.board7.user;

// 테이블 구조가 바뀌지 않는 이상 수정하지 않음
public class UserEntity {
	private int iuser;
	private String uid;
	private String upw;
	private String unm;
	private int gender;
	private String regdt;
	private String profileImg;

	public String getProfileImg() {
		return profileImg;
	}

	public void setProfileImg(String profileImg) {
		this.profileImg = profileImg;
	}

	public int getIuser() {
		return iuser;
	}

	public void setIuser(int iuser) {
		this.iuser = iuser;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUpw() {
		return upw;
	}

	public void setUpw(String upw) {
		this.upw = upw;
	}

	public String getUnm() {
		return unm;
	}

	public void setUnm(String unm) {
		this.unm = unm;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getRegdt() {
		return regdt;
	}

	public void setRegdt(String regdt) {
		this.regdt = regdt;
	}
}