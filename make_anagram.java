import java.util.*;

public class make_anagram {
	public static void main(String[] args) {
		String s1 = "aab";
		String s2 = "abbc";
		makeAnagram(s1, s2);
	}

	public static int makeAnagram(String s1, String s2) {
		int num = 0;
		HashMap<Character, Integer> h1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> h2 = new HashMap<Character, Integer>();
		char[] a = s1.toCharArray();
		char[] b = s2.toCharArray();
		for (int i = 0; i < a.length; i++) {
			if (h1.get(a[i]) != null) {
				h1.put(a[i], h1.get(a[i]) + 1);
			} else {
				h1.put(a[i], 1);
			}
		}
		for (int j = 0; j < b.length; j++) {
			if (h2.get(b[j]) != null) {
				h2.put(b[j], h2.get(b[j]) + 1);
			} else {
				h2.put(b[j], 1);
			}
		}
		for (int i = 0; i < b.length; i++) {
			if (h1.containsKey(b[i]) != true) {
				num++;
			} else if (h1.containsKey(b[i]) && h1.get(b[i]) != 0) {
				h1.put(b[i], h1.get(b[i]) - 1);
			} else if (h1.get(b[i]) == 0) {
				num++;
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (h2.containsKey(a[i]) == false) {
				num++;
			} else if (h2.containsKey(a[i]) && h2.get(a[i]) != 0) {
				h2.put(a[i], h2.get(a[i]) - 1);
			} else if (h2.get(a[i]) == 0) {
				num++;
			}
		}
		//System.out.println(num);
		return num;
	}
}
