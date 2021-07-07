package com.sist.util;
// Date => 날짜 관리 (시간)
import java.util.*; // 웹(데이터베이스 : int, String, Date 이정도 사용)
import java.text.*;
public class MainClass4 {

	public static void main(String[] args) {
		for(;;) {
		Date date=new Date(); // 일반 클래스
//		System.out.println(date);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sdf.format(date));
		try {
			Thread.sleep(1000);
		}catch(Exception ex) {
			
		}
		}
		/*
		 *    날짜 출력
		 *      년도 : y (4자리 yyyy, 3자리:yyy, 2자리:yy)
		 *      월  : M (1자리 : M,  2자리 : MM)
		 *              =========  ==========
		 *              12 => 12        1 => 01  ==> 07  
		 *              						 ==> 08,09 => 0(8진법) (08은 8진법으로 인식)
		 *              1 => 1
		 *      일 : d, dd
		 *      시간: h, hh
		 *      분 : m, mm
		 *      초 : s, ss
		 */
	}

}
