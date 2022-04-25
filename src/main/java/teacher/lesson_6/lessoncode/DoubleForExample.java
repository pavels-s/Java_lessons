package main.java.teacher.lesson_6.lessoncode;

class DoubleForExample {

	public static void main(String[] args) {
		//int[][] arr = new int[5][5];

		int[] withData = {1, 2, 3, 4};
		String[] withDataStr = {"A", "B", "C"};

		int[][] twoDimentionalArray = new int[2][5];

		int[][] arr = {{0, 1, 7},        //{1,2,3}, {1,2,2}, {1,2,3}
				       {4, 5, 9, 7, 8, 9},
					   {7, 8, 0}};
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				int number = arr[i][j];
				System.out.println("[" + i + "," + j + "] = " + number);
			}
		}

		arr[0][0] = 555;
	}

}
