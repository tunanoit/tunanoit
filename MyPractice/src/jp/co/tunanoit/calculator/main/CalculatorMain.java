package jp.co.tunanoit.calculator.main;

import jp.co.tunanoit.calculator.calculator.Calculator;

/**
 * 計算機メインクラス
 * 
 * @author tGame
 *
 */
public class CalculatorMain {

	public static void main(String[] args) {
		// 計算機クラスを生成する。
		Calculator calculator = new Calculator();

		// 計算を実行する。
		double result = calculator.calc();

		// 計算結果を標準出力する。
		System.out.println(result);
	}

}
