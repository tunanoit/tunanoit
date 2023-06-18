package jp.co.tunanoit.calculator.calculator;

import java.util.ArrayList;

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
		ArrayList<Double> elements = new ArrayList<>();
		ArrayList<String> operators = new ArrayList<>();
		double result = 0;
		String operator = "";

		while (!operator.equals("=")) {
			elements.add(MyInputter.inputDouble());
			operator = InputValidator.checkOperator(MyInputter.inputString());
			operators.add(operator);
		}
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
