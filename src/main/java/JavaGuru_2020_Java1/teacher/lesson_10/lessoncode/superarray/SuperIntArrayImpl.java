package main.java.JavaGuru_2020_Java1.teacher.lesson_10.lessoncode.superarray;

public class SuperIntArrayImpl implements SuperIntArray {

	private int[] array;

	public SuperIntArrayImpl() {
		array = new int[0];
	}

	@Override
	public void add(int element) {
		int currentSize = size();
		int[] newArray = new int[currentSize + 1];
		for (int i = 0; i < currentSize; i++) {
			newArray[i] = array[i];
		}
		newArray[newArray.length - 1] = element;
		array = newArray;
	}

	@Override
	public int get(int index) {
		return array[index];
	}

	@Override
	public int size() {
		return array.length;
	}

	@Override
	public void removeByIndex(int index) {
		if (size() > 0) {
			int currentSize = size();
			int[] newArray = new int[currentSize - 1];
			int indexToPut = 0;
			for (int i = 0; i < currentSize; i++) {
				if (i != index) {
					newArray[indexToPut] = array[i];
					indexToPut++;
				}
			}
			array = newArray;
		}
	}

}
