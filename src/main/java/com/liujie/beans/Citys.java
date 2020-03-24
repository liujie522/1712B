package com.liujie.beans;
//省区表
public class Citys {
	private Integer cid;	//主键编号
	private String cname;	//省区名称
	private String ecname;	//英文名称
	
	//增强字段
	private String sname;
	private String sename;
	private int sze;	 //本省确诊人数
	private int sys;	 //本省疑似人数
	private int szy;	 //本省治愈人数
	private int ssw;	 //本省死亡人数
	
	private int pqz;	 //本市确诊人数
	private int pys;	 //本市疑似人数
	private int pzy;	 //本市治愈人数
	private int psw;     //本市死亡人数
	
	private String stime; //数据更新时间

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getEcname() {
		return ecname;
	}

	public void setEcname(String ecname) {
		this.ecname = ecname;
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

	public int getSze() {
		return sze;
	}

	public void setSze(int sze) {
		this.sze = sze;
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

	public int getPqz() {
		return pqz;
	}

	public void setPqz(int pqz) {
		this.pqz = pqz;
	}

	public int getPys() {
		return pys;
	}

	public void setPys(int pys) {
		this.pys = pys;
	}

	public int getPzy() {
		return pzy;
	}

	public void setPzy(int pzy) {
		this.pzy = pzy;
	}

	public int getPsw() {
		return psw;
	}

	public void setPsw(int psw) {
		this.psw = psw;
	}

	public String getStime() {
		return stime;
	}

	public void setStime(String stime) {
		this.stime = stime;
	}

	public Citys(Integer cid, String cname, String ecname, String sname, String sename, int sze, int sys, int szy,
			int ssw, int pqz, int pys, int pzy, int psw, String stime) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.ecname = ecname;
		this.sname = sname;
		this.sename = sename;
		this.sze = sze;
		this.sys = sys;
		this.szy = szy;
		this.ssw = ssw;
		this.pqz = pqz;
		this.pys = pys;
		this.pzy = pzy;
		this.psw = psw;
		this.stime = stime;
	}

	public Citys() {
		super();
	}

	public Citys(Integer cid, String cname, String ecname) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.ecname = ecname;
	}

	@Override
	public String toString() {
		return "Citys [cid=" + cid + ", cname=" + cname + ", ecname=" + ecname + ", sname=" + sname + ", sename="
				+ sename + ", sze=" + sze + ", sys=" + sys + ", szy=" + szy + ", ssw=" + ssw + ", pqz=" + pqz + ", pys="
				+ pys + ", pzy=" + pzy + ", psw=" + psw + ", stime=" + stime + "]";
	}
	
	
}
