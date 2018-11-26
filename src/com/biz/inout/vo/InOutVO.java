package com.biz.inout.vo;

import java.text.SimpleDateFormat;

public class InOutVO extends Object{

	// member 변수 영역
	private String strDate;
	private String strIO;
	private int intDanga;
	private int intSuRyang;
	private byte vat;
	private int intTotal;
	
	// getter, setter 영역
	// 날짜값을 문자열로 저장하려고 하는데 변수에 값을 직접 저장하면 날짜값이 유효한지 아닌지 알 수가 없다.
	public String getStrDate() {
		return strDate;
	}
	
	public boolean setStrDate(String strDate) {
		boolean retOk = true;
		SimpleDateFormat sd = new SimpleDateFormat("yyyyMMdd");		// 검사하는 형식
		sd.setLenient(false);
		try {
			sd.parse(strDate);										// 문자열이 맞고 유효한 날짜값인지 검사
			this.strDate = strDate;
		} catch (Exception e) {
			// TODO: handle exception
			retOk = false;
		}
		return retOk;
	}
	
	public String getStrIO() {
		return strIO;
	}
	public void setStrIO(String strIO) {
		this.strIO = strIO;
	}
	public int getIntDanga() {
		return intDanga;
	}
	public void setIntDanga(int intDanga) {
		this.intDanga = intDanga;
	}
	public int getIntSuRyang() {
		return intSuRyang;
	}
	public void setIntSuRyang(int intSuRyang) {
		this.intSuRyang = intSuRyang;
	}
	public byte getVat() {
		return vat;
	}
	public void setVat(byte vat) {
		this.vat = vat;
	}
	public int getIntTotal() {
		return intTotal;
	}
	public void setIntTotal(int intTotal) {
		this.intTotal = intTotal;
	}
	
	// object 클래스에 정의된 toString() 메서드를 임의로 다 정의(재작성)한 것
	public String toString() {
		return "InOutVO [strDate=" + strDate + ", strIO=" + strIO + ", intDanga=" + intDanga + ", intSuRyang="
				+ intSuRyang + ", vat=" + vat + ", intTotal=" + intTotal + "]";
	}
	
	

}
