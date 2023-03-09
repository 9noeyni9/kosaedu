package lab.day4;

public class ArrayLab2 {
	public static void main(String[] args) {
		int[] arr = new int[10];

		int i;
		int sumA = 0;
		System.out.print("모든 원소의 값 : ");
		for (i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 17) + 4;
			sumA += arr[i];
			if (i < arr.length - 1)
				System.out.print(arr[i] + ", ");
			else
				System.out.println(arr[i]);
		}

		System.out.println();
		System.out.println("모든 원소의 합 : " + sumA);

	}

}
