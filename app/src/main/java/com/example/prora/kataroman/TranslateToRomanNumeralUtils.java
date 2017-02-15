package com.example.prora.kataroman;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by prora on 2/15/2017.
 */

public class TranslateToRomanNumeralUtils {

	static List<RomanNumeral> listDefaultRomanNumeral = new ArrayList<>();
	final static int max = 3999;

	public static void initListData() {
		listDefaultRomanNumeral.add(new RomanNumeral("I", 1, 3));
		listDefaultRomanNumeral.add(new RomanNumeral("V", 5, 1));
		listDefaultRomanNumeral.add(new RomanNumeral("X", 10, 3));
		listDefaultRomanNumeral.add(new RomanNumeral("L", 50, 1));
		listDefaultRomanNumeral.add(new RomanNumeral("C", 100, 3));
		listDefaultRomanNumeral.add(new RomanNumeral("D", 500, 1));
		listDefaultRomanNumeral.add(new RomanNumeral("M", 1000, 3));
	}

	public static String translate(int number) {
		if (number > max) {
			return "number error";
		}
		initListData();
		String result = "";
		char[] stringNumberArray = String.valueOf(number).toCharArray();
		for (int i = 0; i < stringNumberArray.length; i++) {
			int zeroCount = stringNumberArray.length - i - 1;
			int tempNumber = (int) (Integer.parseInt(String.valueOf(stringNumberArray[i])) * Math.pow(10, zeroCount));
			result += convertNumber(tempNumber, zeroCount);
		}
		return result;
	}

	private static String convertNumber(int number, int zeroCount) {
		RomanNumeral minNumber = listDefaultRomanNumeral.get(zeroCount * 2);
		RomanNumeral middleNumber = listDefaultRomanNumeral.get(zeroCount * 2 + 1);
		RomanNumeral maxNumber = listDefaultRomanNumeral.get(zeroCount * 2 + 2);
		String result = "";
		int tempCount;
		if (number > 0) {
			if (number <= minNumber.realValue * minNumber.repeatTime) {
				tempCount = number / minNumber.realValue;
				result = addSymbol(result, minNumber, tempCount);
			} else if (number <= middleNumber.realValue) {
				tempCount = (middleNumber.realValue - number) / minNumber.realValue;
				result = addSymbol(result, minNumber, tempCount);
				result += middleNumber.symbol;
			} else if (number <= (middleNumber.realValue + minNumber.realValue * minNumber.repeatTime)) {
				result += middleNumber.symbol;
				tempCount = (number - middleNumber.realValue) / minNumber.realValue;
				result = addSymbol(result, minNumber, tempCount);
			} else {
				tempCount = (maxNumber.realValue - number) / minNumber.realValue;
				result = addSymbol(result, minNumber, tempCount);
				result += maxNumber.symbol;
			}
		}
		return result;
	}

	private static String addSymbol(String result, RomanNumeral minNumber, int tempCount) {
		for (int i = 0; i < tempCount; i++) {
			result += minNumber.symbol;
		}
		return result;
	}

}
