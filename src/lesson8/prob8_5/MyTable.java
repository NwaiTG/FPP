package lesson8.prob8_5;

public class MyTable {
	private Entry[] entries = new Entry[26];

	// returns the String that is matched with char c in the table
	public String get(char c) {
		// implement
		int index = c - 'a';
		return entries[index].toString();
	}

	// adds to the table a pair (c, s) so that s can be looked up using c
	public void add(char c, String s) {
		// implement
		Entry entry = new Entry(s, c);
		int index = c - 'a';
		entries[index] = entry;
	}

	// returns a String consisting of nicely formatted display
	// of the contents of the table
	public String toString() {
		// implement
		String strs = "";
		for (Entry en : entries) {
			if (en != null) {
				strs += en.toString() + '\n';
			}
		}
		return strs.toString();
	}

	private class Entry {
		String str;
		char ch;

		Entry(String str, char ch) {
			// implement
			this.str = str;
			this.ch = ch;
		}

		// returns a String of the form "ch->str"
		public String toString() {
			// implement
			return this.ch + "->" + this.str;
		}
	}

	public static void main(String[] args) {
		MyTable t = new MyTable();
		t.add('a', "Andrew");
		t.add('b', "Billy");
		t.add('w', "Willie");
		System.out.println(t);

	}

}