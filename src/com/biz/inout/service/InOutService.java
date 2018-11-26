package com.biz.inout.service;

import java.util.Scanner;

import com.biz.inout.vo.InOutVO;

public class InOutService {

	InOutVO inoutVO;
	
	// 클래스의 생성자
	public InOutService() {
		inoutVO = new InOutVO();
	}
	
	public boolean makeInOut() {
		boolean retOk = true;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("날짜(19990101) : ");
		String strDate = scanner.nextLine();
		if(inoutVO.setStrDate(strDate) == false) {
			System.out.println("날짜형식이 잘못되었습니다.");
			return false;
		}
		
		System.out.print("구분(1:매입, 2:매출) : ");
		String strIO = scanner.nextLine();
		
//		inoutVO = new InOutVO();
		inoutVO.setStrIO(strIO);
		try {
			System.out.print("단가 : ");
			String strDanga = scanner.nextLine();
			inoutVO.setIntDanga(Integer.valueOf(strDanga));
			
			System.out.print("수량 : ");
			String strSuRyang = scanner.nextLine();
			inoutVO.setIntSuRyang(Integer.valueOf(strSuRyang));
			
			System.out.print("부가세(1:과세. 2:면세) : ");
			String strVat = scanner.nextLine();
			inoutVO.setVat(Byte.valueOf(strVat));
			
		} catch (Exception e) {
			// TODO: handle exception
			retOk = false;
		}
//		return true;
		return retOk;
	}

}
