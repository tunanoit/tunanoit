package jp.co.tunanoit.my_io_utils;

import java.util.Scanner;

/**
 * 標準入力クラス
 * 
 * @author tGame
 *
 */
public class MyInputter {

	private static Scanner scanner = new Scanner(System.in);

	/**
	 * 標準入力された文字列を返します。
	 * 
	 * @return 入力された文字列
	 */
	public static String inputString() {
		String str = scanner.next();
		return str;
	}

	/**
	 * 標準入力された実数を返します。
	 * 
	 * @return 入力された実数
	 */
	public static double inputDouble() {
		double num = scanner.nextDouble();
		return num;
	}
}
