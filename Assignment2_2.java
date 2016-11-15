package session2;

public class Assignment2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int count = 2; count <= 100; count++) {
			for (int prime = 2; prime <= count; prime++) {
				if (prime == count) {
					System.out.println(count);
				}
				if (count % prime == 0) {
					break;
				}
			}

		}

	}

}
