package com.example.prora.kataroman;

/**
 * Created by prora on 2/15/2017.
 */

public class RomanNumeral {
	public String symbol;
	public int realValue;
	public int repeatTime;

	public RomanNumeral(String symbol, int realValue, int repeatTime) {
		this.symbol = symbol;
		this.realValue = realValue;
		this.repeatTime = repeatTime;
	}
}
