package jp.co.tunanoit.calculator.calculator;

import jp.co.tunanoit.my_io_utils.InputValidator;
import jp.co.tunanoit.my_io_utils.MyInputter;

/**
 * 計算機クラス
 * 
 * @author tunanoit
 *
 */
public class Calculator {

	/**
	 * 計算を実行します。
	 * 
	 * @return 計算結果
	 */
	public double calc() {
		double result = 0;
		double element1 = MyInputter.inputDouble();
		String operator = InputValidator.checkOperator(MyInputter.inputString());
		double element2 = MyInputter.inputDouble();

		result = calc2(element1, element2, operator);
		return result;
	}

	private double calc2(double element1, double element2, String operator) {
		if (operator.equals("+")) {
			return element1 + element2;
		} else if (operator.equals("-")) {
			return element1 - element2;
		} else if (operator.equals("*")) {
			return element1 * element2;
		} else if (operator.equals("/")) {
			return element1 / element2;
		} else {
			return 0;
		}
	}
}
