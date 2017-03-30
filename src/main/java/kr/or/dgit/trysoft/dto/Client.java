package kr.or.dgit.trysoft.dto;

public class Client {
	private String clntNo;
	private String clntName;
	private String clntAddr;
	private String clntTel;
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Client(String clntNo, String clntName, String clntAddr, String clntTel) {
		super();
		this.clntNo = clntNo;
		this.clntName = clntName;
		this.clntAddr = clntAddr;
		this.clntTel = clntTel;
	}
	public String getClntNo() {
		return clntNo;
	}
	public void setClntNo(String clntNo) {
		this.clntNo = clntNo;
	}
	public String getClntName() {
		return clntName;
	}
	public void setClntName(String clntName) {
		this.clntName = clntName;
	}
	public String getAddr() {
		return clntAddr;
	}
	public void setAddr(String clntAddr) {
		this.clntAddr = clntAddr;
	}
	public String getClntTel() {
		return clntTel;
	}
	public void setClntTel(String clntTel) {
		this.clntTel = clntTel;
	}
	@Override
	public String toString() {
		return String.format("Client [clntNo=%s, clntName=%s, clntAddr=%s, clntTel=%s]", clntNo, clntName, clntAddr, clntTel);
	}
	
	
}
