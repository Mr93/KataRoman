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
}
