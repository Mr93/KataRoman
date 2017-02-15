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
		if (number < listDefaultRomanNumber.get(2).realValue) {
			int tempCount;
			if (number <= listDefaultRomanNumber.get(0).realValue * listDefaultRomanNumber.get(0).repeatTime) {
				tempCount = number/listDefaultRomanNumber.get(0).realValue;
				for (int i = 0; i < tempCount; i++) {
					result += listDefaultRomanNumber.get(0).symbol;
				}
			}else if (number <= listDefaultRomanNumber.get(1).realValue){
				tempCount = (listDefaultRomanNumber.get(1).realValue - number)/listDefaultRomanNumber.get(0).realValue;
				for (int i = 0; i < tempCount; i++){
					result += listDefaultRomanNumber.get(0).symbol;
				}
				result += listDefaultRomanNumber.get(1).symbol;
			} else if (number <= (listDefaultRomanNumber.get(1).realValue +
					listDefaultRomanNumber.get(0).realValue
					* listDefaultRomanNumber.get(0).repeatTime)) {
				result += listDefaultRomanNumber.get(1).symbol;
				tempCount = (number - listDefaultRomanNumber.get(1).realValue)/listDefaultRomanNumber.get(0).realValue;
				for(int i = 0; i < tempCount; i ++){
					result += listDefaultRomanNumber.get(0).symbol;
				}
			}else {
				tempCount = (listDefaultRomanNumber.get(2).realValue - number)/listDefaultRomanNumber.get(0).realValue;
				for (int i = 0; i < tempCount; i++){
					result += listDefaultRomanNumber.get(0).symbol;
				}
				result += listDefaultRomanNumber.get(2).symbol;
			}
		}
		return result;
	}


}
