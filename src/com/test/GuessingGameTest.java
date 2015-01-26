package com.test;

import static org.junit.Assert.*;

import org.hamcrest.Matcher;
import org.junit.Test;

import com.guess.GuessingGame;

public class GuessingGameTest {
	
	@Test
	public void test_get_random_number() {
		int randomNumber = 9;
		assertNotEquals(GuessingGame.getRandomNumber(), randomNumber);
	}

}
