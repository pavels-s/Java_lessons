package main.java.JavaGuru_2020_Java1.teacher.lesson_5.lessoncode;

class ForExample {

	public static void main(String[] args) {
		int i = 1; // for first part

		if (i < 100) {
			System.out.println(i);
			i++;
		}

		if (i < 100) {
			System.out.println(i);
			i++;
		}

		if (i < 100) {
			System.out.println(i);
			i++;
		}

		if (i < 100) { // for second part
			System.out.println(i);
			i++; // for third part
		}


		for (int j = 1; j < 100; j++) {  // j++ | j = j + 1
			System.out.println(j);
		}

		for (int j = 100; j > 0; j--) {
			if (j != 50) {
				System.out.println(j);
			}
		}


		System.out.println("First command after for!");

	}

}
