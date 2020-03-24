package com.liujie.beans;
//省区疫情人数表
public class Sqcity {
	private Integer sid;
	private int sys;
	private int szy;
	private int ssw;
	private String stime;
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public int getSys() {
		return sys;
	}
	public void setSys(int sys) {
		this.sys = sys;
	}
	public int getSzy() {
		return szy;
	}
	public void setSzy(int szy) {
		this.szy = szy;
	}
	public int getSsw() {
		return ssw;
	}
	public void setSsw(int ssw) {
		this.ssw = ssw;
	}
	public String getStime() {
		return stime;
	}
	public void setStime(String stime) {
		this.stime = stime;
	}
	public Sqcity(Integer sid, int sys, int szy, int ssw, String stime) {
		super();
		this.sid = sid;
		this.sys = sys;
		this.szy = szy;
		this.ssw = ssw;
		this.stime = stime;
	}
	public Sqcity() {
		super();
	}
	@Override
	public String toString() {
		return "Sqcity [sid=" + sid + ", sys=" + sys + ", szy=" + szy + ", ssw=" + ssw + ", stime=" + stime + "]";
	}
	

}
