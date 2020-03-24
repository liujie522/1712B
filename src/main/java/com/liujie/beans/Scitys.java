package com.liujie.beans;

//市区表
public class Scitys {
	private Integer sid;
	private String sname;
	private String sename;

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSename() {
		return sename;
	}

	public void setSename(String sename) {
		this.sename = sename;
	}

	public Scitys(Integer sid, String sname, String sename) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sename = sename;
	}

	public Scitys() {
		super();
	}

	@Override
	public String toString() {
		return "Scitys [sid=" + sid + ", sname=" + sname + ", sename=" + sename + "]";
	}

}
