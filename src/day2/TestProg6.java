package day2;

public class TestProg6 {
	@Test
	public void testRemoveDups() {
		String[] testData = {"horse", "dog", "cat", "horse", "dog"};
		String[] result = Prog6.removeDups(testData);
		String[] expected = {"horse", "dog", "cat"};
		assertTrue(expected == result);
	}
}
