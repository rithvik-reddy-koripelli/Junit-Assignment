package com.accolite.mini_au.Junit_Assignment;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.junit.Before;
import org.junit.Test;


public class FizzBuzzTest {
	FizzBuzz fb;
	Logger logger;
	@Before
	public void setup() throws Exception {
		fb = new FizzBuzz();
		logger = Logger.getLogger(FizzBuzzTest.class.getName());
	}

	@Test
	public void testGetResult() {
		logger.info("Executing testGetResult");
		List<Integer> input = new ArrayList<Integer>();
		input.add(1);
		input.add(3);
		input.add(5);
		input.add(15);
		List<String> output = new ArrayList<String>();
		output.add("1");
		output.add("Fizz");
		output.add("Buzz");
		output.add("FizzBuzz");
		for (int i = 0; i < 4; i++) {
			logger.info("Testing for input "+input.get(i));
			assertEquals(output.get(i), fb.getResult(input.get(i)));
		}

	}

}
