package jp.co.tunanoit.my_io_utils;

import java.util.Arrays;
import java.util.List;

/**
 * 入力チェッククラス
 * 
 * @author tunanoit
 *
 */
public class InputValidator {

	private static String PLUS = "+";
	private static String MINUS = "-";
	private static String MULTIPLIED_BY = "*";
	private static String DIVIDED_BY = "/";

	private static List<String> ARITHMETIC_SYMBOLS = Arrays.asList(PLUS, MINUS, MULTIPLIED_BY, DIVIDED_BY);

	/**
	 * 四則演算記号の判定を行います。
	 * 
	 * @param operator
	 * @return 引数の文字列が四則演算記号であればその値を、そうでなければnullを返します。
	 */
	public static String checkOperator(String operator) {
		if (ARITHMETIC_SYMBOLS.contains(operator)) {
			return operator;
		} else {
			return null;
		}
	}
}
