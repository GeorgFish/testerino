package assessment1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import assessment1.Palindrome;
class PalindromeTests {

	@Test
	void aSimplePalindromeWithEvenLenghtShouldBeTrue() {
		assertTrue((Palindrome.isPalindrome("abaaba")));
	}
	@Test	void aSimpleNoPalindromeShouldBeFalse() {
		assertFalse((Palindrome.isPalindrome("aabaaaa")));
	}
	@Test
	void aSimplePalindromeWithOddLenghtShouldBeTrue() {
		assertTrue((Palindrome.isPalindrome("aaabaaa")));
	}
	@Test
	void aSimplePalindromeWithOddLenghtShouldOnlyCompareAlphaNumeric() {
		assertTrue((Palindrome.isPalindrome("aaab1aaaf!\"#$%&HU'()*+,-./:;<=>?UH@[\\]^_f`{|}~aaa1baaa")));
	}
	@Test
	void aSimplePalindromeWithOddLenghtShouldCompareAlphaNumeric() {
		assertTrue((Palindrome.isPalindrome("aaab1aaaf!\"#$%&HU'()*+,-./:;<=>?UH@[\\]^_f`{|}~aaa1baaa")));
	}
	@Test
	void aSimplePalindromeWithOddLenghtShouldCompareAlphaNumeric2() {
		assertTrue((Palindrome.isPalindrome("123 321")));
	}@Test
	void aSimplePalindromeWithOddLenghtShouldCompareAlphaNumericIsFalse() {
		assertFalse((Palindrome.isPalindrome("331333")));
	}
	@Test
	void aSimplePalindromeWithOddLenghtShouldIgnoreCases() {
		assertTrue((Palindrome.isPalindrome("Abba ABBa")));
	}
}
