package com.sist.util;
// Date => ��¥ ���� (�ð�)
import java.util.*; // ��(�����ͺ��̽� : int, String, Date ������ ���)
import java.text.*;
public class MainClass4 {

	public static void main(String[] args) {
		for(;;) {
		Date date=new Date(); // �Ϲ� Ŭ����
//		System.out.println(date);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sdf.format(date));
		try {
			Thread.sleep(1000);
		}catch(Exception ex) {
			
		}
		}
		/*
		 *    ��¥ ���
		 *      �⵵ : y (4�ڸ� yyyy, 3�ڸ�:yyy, 2�ڸ�:yy)
		 *      ��  : M (1�ڸ� : M,  2�ڸ� : MM)
		 *              =========  ==========
		 *              12 => 12        1 => 01  ==> 07  
		 *              						 ==> 08,09 => 0(8����) (08�� 8�������� �ν�)
		 *              1 => 1
		 *      �� : d, dd
		 *      �ð�: h, hh
		 *      �� : m, mm
		 *      �� : s, ss
		 */
	}

}
