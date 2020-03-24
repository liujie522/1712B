package com.liujie.beans;

public class Sctype {
	private Integer pid;
	private int pqz;
	private int pys;
	private int pzy;
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
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
	public Sctype(Integer pid, int pqz, int pys, int pzy) {
		super();
		this.pid = pid;
		this.pqz = pqz;
		this.pys = pys;
		this.pzy = pzy;
	}
	public Sctype() {
		super();
	}
	@Override
	public String toString() {
		return "Sctype [pid=" + pid + ", pqz=" + pqz + ", pys=" + pys + ", pzy=" + pzy + "]";
	}

}
