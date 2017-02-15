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
		assertEquals("I", TranslateToRomanNumeralUtils.translate(1));
	}

	@Test
	public void testUnitNumber(){
		assertEquals("I", TranslateToRomanNumeralUtils.translate(1));
		assertEquals("II", TranslateToRomanNumeralUtils.translate(2));
		assertEquals("III", TranslateToRomanNumeralUtils.translate(3));
		assertEquals("IV", TranslateToRomanNumeralUtils.translate(4));
		assertEquals("V", TranslateToRomanNumeralUtils.translate(5));
		assertEquals("VI", TranslateToRomanNumeralUtils.translate(6));
		assertEquals("VII", TranslateToRomanNumeralUtils.translate(7));
		assertEquals("VIII", TranslateToRomanNumeralUtils.translate(8));
		assertEquals("IX", TranslateToRomanNumeralUtils.translate(9));
	}

	@Test
	public void testTenthNumber(){
		assertEquals("XI", TranslateToRomanNumeralUtils.translate(11));
		assertEquals("LV", TranslateToRomanNumeralUtils.translate(55));
		assertEquals("LXXIX", TranslateToRomanNumeralUtils.translate(79));
		assertEquals("XXIII", TranslateToRomanNumeralUtils.translate(23));
		assertEquals("XCIX", TranslateToRomanNumeralUtils.translate(99));
		assertEquals("XLII", TranslateToRomanNumeralUtils.translate(42));
	}

	@Test
	public void testHundredsNumber(){
		assertEquals("CXI", TranslateToRomanNumeralUtils.translate(111));
		assertEquals("DCCXXXIX", TranslateToRomanNumeralUtils.translate(739));
		assertEquals("CCX", TranslateToRomanNumeralUtils.translate(210));
		assertEquals("CMLI", TranslateToRomanNumeralUtils.translate(951));
		assertEquals("CXCIII", TranslateToRomanNumeralUtils.translate(193));
		assertEquals("DXX", TranslateToRomanNumeralUtils.translate(520));
	}

	@Test
	public void testThousandsNumber(){
		assertEquals("MCXI", TranslateToRomanNumeralUtils.translate(1111));
		assertEquals("MMM", TranslateToRomanNumeralUtils.translate(3000));
		assertEquals("MMMDXC", TranslateToRomanNumeralUtils.translate(3590));
		assertEquals("MMCLIX", TranslateToRomanNumeralUtils.translate(2159));
		assertEquals("MMMCCXCIV", TranslateToRomanNumeralUtils.translate(3294));
		assertEquals("MMDCCXVIII", TranslateToRomanNumeralUtils.translate(2718));
		assertEquals("MMMCMXCIX", TranslateToRomanNumeralUtils.translate(3999));

	}
}
