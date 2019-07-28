
class ReverseArray {

	// Method -1: using another array of same size and putting elements in reverse
	// order one by one
	static void getReverseArray(int[] arr) {

		int n = arr.length;
		int[] b = new int[n];

		for (int i = 0; i < n; i++) {
			b[i] = arr[n - i - 1];
		}
		for (int j = 0; j < b.length; j++) {
			System.out.print(b[j] + "");
		}
	}

	// Method -2: Using same array and interchanging the number(indexes)
	// keeping the middle element there only
	static void getReverseArrayWoNewArray(int[] arr) {

		int temp = 0;
		int n = arr.length;
		for (int i = 0; i < n / 2; i++) {
			temp = arr[i];
			arr[i] = arr[n - i - 1];
			arr[n - i - 1] = temp;
		}

		for (int j = 0; j < n; j++) {
			System.out.print(arr[j]);
		}
	}

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5 };
		ReverseArray ra = new ReverseArray();
		// ra.getReverseArray(a);

		ra.getReverseArrayWoNewArray(a);
	}

}
