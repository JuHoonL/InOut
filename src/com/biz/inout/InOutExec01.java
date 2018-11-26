package com.biz.inout;

import java.util.ArrayList;
import java.util.List;

import com.biz.inout.service.InOutService;

public class InOutExec01{
	
	public static void main(String[] args) {
		List<InOutService> inoutList = new ArrayList();
		
		for(int i = 0 ; i < 2 ; i ++) {
			
			InOutService inoutService = new InOutService();
			if(inoutService.makeInOut() == false) {
				i--;
				continue;
			}
			System.out.println(inoutService.toString());
		}
		
	}
}