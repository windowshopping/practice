import java.util.*;

public class Nearest_Repetition_hash {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 1, 3 };// 5, 47 82 4 4 6 2
		minDistance(arr);
	}

	public static int minDistance(int[] arr) {
		int a = 0, min1 = arr.length,min2=0,min=0;
		HashMap<Integer, Integer> h2 = new HashMap<Integer, Integer>();
		for (int j = 0; j < arr.length; j++) {
			if (h2.get(arr[j]) != null) {
				h2.put(arr[j], h2.get(arr[j]) + 1);
			} else {
				h2.put(arr[j], 1);
			}
		}
		for (int i = 0; i < arr.length - 1; i++) {
			if (h2.get(arr[i]) > 1) {
				int j = i + 1;
				boolean n = false;
				while (arr[j] != arr[i]) {
					//System.out.println(j);
					j++;
					n = true;
				}
				if (min1 > j - i + 1 && n == true) {
					min1 = j - i + 1;
					//System.out.println(min1);
				} else if (n == false) {
					min2 = j - i;
				}
				
				h2.put(arr[i], h2.get(arr[i])-1);
			}
		}
		if(min1<min2&&min1>0) {
			min=min1;
		}
        
        else if(min2<=min1) {
        	min=min2;
        }
		System.out.println(min);
		return min;
	}
}
