import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {
	public void getLargestNumberLoop(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length && i != j; j++) {
				String A = "" + numbers[i];
				String B = "" + numbers[j];
				String AB = A + B;
				String BA = B + A;

				if (Integer.parseInt(BA) < Integer.parseInt(AB)) {
					int t = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = t;
				}
			}
		}
		for (int i : numbers)
			System.out.println(i);
	}

	public void getLargestNumberComparator(int[] numbers) {
		String[] numbersInString = new String[numbers.length];
		for (int i = 0; i < numbers.length; i++)
			numbersInString[i] = "" + numbers[i];
		Arrays.sort(numbersInString, stringComparator);
		for (String i : numbersInString)
			System.out.println(i);
	}

	public static Comparator<String> stringComparator = new Comparator<String>() {

		@Override
		public int compare(String A, String B) {
			String AB = A + B;
			String BA = B + A;
			return BA.compareTo(AB);
		}
	};

	public static void main(String[] args) {
		int numbers[] = { 87, 998, 9, 956, 752, 83 };
		// 9 998 956 87 83 752
		LargestNumber ln = new LargestNumber();
		ln.getLargestNumberLoop(numbers);
		ln.getLargestNumberComparator(numbers);

	}

}
