package com.example.prora.kataroman;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by prora on 2/15/2017.
 */

public class TranslateToRomanNumberUtils {

	static List<RomanNumber> listDefaultRomanNumber = new ArrayList<>();

	public static void initListData() {
		listDefaultRomanNumber.add(new RomanNumber("I", 1, 3));
		listDefaultRomanNumber.add(new RomanNumber("V", 5, 1));
		listDefaultRomanNumber.add(new RomanNumber("X", 10, 3));
		listDefaultRomanNumber.add(new RomanNumber("L", 50, 1));
		listDefaultRomanNumber.add(new RomanNumber("C", 100, 3));
		listDefaultRomanNumber.add(new RomanNumber("D", 500, 1));
		listDefaultRomanNumber.add(new RomanNumber("M", 1000, 3));
	}

	public static String translate(int number) {
		initListData();
		String result = "";
		char[] stringNumberArray = String.valueOf(number).toCharArray();
		for (int i = 0; i < stringNumberArray.length; i++) {
			int zeroCount = stringNumberArray.length - i - 1;
			int tempNumber = (int) (Integer.parseInt(String.valueOf(stringNumberArray[i]))*Math.pow(10, zeroCount));
			result += convertNumber(tempNumber, zeroCount);
		}
		return result;
	}

	private static String convertNumber(int number, int zeroCount) {
		RomanNumber minNumber = listDefaultRomanNumber.get(zeroCount * 2);
		RomanNumber middleNumber = listDefaultRomanNumber.get(zeroCount * 2 + 1);
		RomanNumber maxNumber = listDefaultRomanNumber.get(zeroCount * 2 + 2);
		String result = "";
		int tempCount;
		if (number < maxNumber.realValue && number > 0) {
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

	private static String addSymbol(String result, RomanNumber minNumber, int tempCount) {
		for (int i = 0; i < tempCount; i++) {
			result += minNumber.symbol;
		}
		return result;
	}

}
