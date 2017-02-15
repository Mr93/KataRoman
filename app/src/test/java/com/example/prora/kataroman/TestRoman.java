package com.example.prora.kataroman;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class TestRoman {
	@Test
	public void test1(){
		assertEquals("I", TranslateToRomanNumberUtils.translate(1));
	}

	@Test
	public void testUnitNumber(){
		assertEquals("I", TranslateToRomanNumberUtils.translate(1));
		assertEquals("II", TranslateToRomanNumberUtils.translate(2));
		assertEquals("III", TranslateToRomanNumberUtils.translate(3));
		assertEquals("IV", TranslateToRomanNumberUtils.translate(4));
		assertEquals("V", TranslateToRomanNumberUtils.translate(5));
		assertEquals("VI", TranslateToRomanNumberUtils.translate(6));
		assertEquals("VII", TranslateToRomanNumberUtils.translate(7));
		assertEquals("VIII", TranslateToRomanNumberUtils.translate(8));
		assertEquals("IX", TranslateToRomanNumberUtils.translate(9));
	}

	@Test
	public void testTenthNumber(){
		assertEquals("XI", TranslateToRomanNumberUtils.translate(11));
		assertEquals("LV", TranslateToRomanNumberUtils.translate(55));
		assertEquals("LXXIX", TranslateToRomanNumberUtils.translate(79));
		assertEquals("XXIII", TranslateToRomanNumberUtils.translate(23));
		assertEquals("XCIX", TranslateToRomanNumberUtils.translate(99));
		assertEquals("XLII", TranslateToRomanNumberUtils.translate(42));
	}
}
