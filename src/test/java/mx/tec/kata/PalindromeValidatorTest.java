package mx.tec.kata;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromeValidatorTest {
	PalindromeValidator validator = new PalindromeValidator();
	@Test
	void Given_SingleLetterString_When_ValidatingPalindrome_Then_True() {
		//Given
		String string = "m";
		//When
		boolean actualResult = validator.validate(string);
		//Then
		boolean expectedResult = true;
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void Given_TwoDifferentLettersString_When_ValidatingPalindrome_Then_False() {
		//Given
		String string = "ma";
		//When
		boolean actualResult = validator.validate(string);
		//Then
		boolean expectedResult = false;
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void Given_TwoEqualLettersString_When_ValidatingPalindrome_Then_True() {
		//Given
		String string = "mm";
		//When
		boolean actualResult = validator.validate(string);
		//Then
		boolean expectedResult = true;
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void Given_ThreeLettersPalindromeString_When_ValidatingPalindrome_Then_True() {
		//Given
		String string = "ama";
		//When
		boolean actualResult = validator.validate(string);
		//Then
		boolean expectedResult = true;
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void Given_ThreeLettersNotPalindromeString_When_ValidatingPalindrome_Then_False() {
		//Given
		String string = "amm";
		//When
		boolean actualResult = validator.validate(string);
		//Then
		boolean expectedResult = false;
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void Given_FourLettersPalindromeString_When_ValidatingPalindrome_Then_True() {
		//Given
		String string = "amma";
		//When
		boolean actualResult = validator.validate(string);
		//Then
		boolean expectedResult = true;
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void Given_FourLettersNotPalindromeString_When_ValidatingPalindrome_Then_False() {
		//Given
		String string = "amam";
		//When
		boolean actualResult = validator.validate(string);
		//Then
		boolean expectedResult = false;
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void Given_APalindromePhraseString_When_ValidatingPalindrome_Then_True() {
		//Given
		String string = "a man a plan a canal panama";
		//When
		boolean actualResult = validator.validate(string);
		//Then
		boolean expectedResult = true;
		
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	void Given_ANotPalindromePhraseString_When_ValidatingPalindrome_Then_False() {
		//Given
		String string = "b man a plan a canal panama";
		//When
		boolean actualResult = validator.validate(string);
		//Then
		boolean expectedResult = false;
		
		assertEquals(expectedResult, actualResult);
	}

}
