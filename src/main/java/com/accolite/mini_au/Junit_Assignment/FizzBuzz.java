package com.accolite.mini_au.Junit_Assignment;
import java.util.logging.Logger;

public class FizzBuzz {
	public String getResult(int i)
	{
		Logger logger = Logger.getLogger(FizzBuzz.class.getName());
		logger.info("Executing getResult method for input "+i);
		if(i%3==0 && i%5==0)
		{
			logger.info("In FizzBuzz Condition");
			return "FizzBuzz";
		}
		else if(i%3==0) {
			logger.info("In Fizz Condition");
			return "Fizz";
		}
		else if(i%5==0) {
			logger.info("In Buzz Condition");
			return "Buzz";
		}
		else
		{
			logger.info("In else Condition");
			Integer j = new Integer(i);
			return j.toString();
		}
	}
}
