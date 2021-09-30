package com.model.dto;

public class MemberBean {
	private int memNo;
	private String memId;
	private String memNm;
	
	public MemberBean() {}
	
	public MemberBean(int memNo, String memId, String memNm) {
		this.memNo = memNo;
		this.memId = memId;
		this.memNm = memNm;
	}
	
	public int getMemNo() {
		return memNo;
	}
	
	public void setMemNo(int memNo) {
		this.memNo = memNo;
	}
	
	public String getMemId() {
		return memId;
	}
	
	public void setMemId(String memId) {
		this.memId = memId;
	}
	
	public String getMemNm() {
		return memNm;
	}
	
	public void setMemNm(String memNm) {
		this.memNm = memNm;
	}	
}
