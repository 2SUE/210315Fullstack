package sec06.ch07;

public class MyArrayList implements MyList {

	// 전역변수는 무조건 디폴트 값이 들어감
	private int[] arr; // = null

	public MyArrayList() {
		arr = new int[0];
	}

	@Override
	public void add(int value) {
		int[] temp = new int[arr.length + 1];
		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		temp[arr.length] = value;
		arr = temp;
	}

	@Override
	public int size() {
		return arr.length;
	}

	@Override
	public int get(int index) {
		return arr[index];
	}

	public int remove() {
		int[] temp = new int[arr.length - 1];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = arr[i];
		}

		int lastVal = arr[arr.length - 1];
		arr = temp;

		return lastVal;
	}

	@Override
	public void add(int index, int value) {
		
		int[] temp = new int[arr.length + 1];

		/*
		for (int i = 0; i < temp.length; i++) {
			if (i < index) {
				temp[i] = arr[i];
			} else if (i == index) {
				temp[i] = value;
			} else {
				temp[i] = arr[i -1]; 
			}
		}
		*/
		
		for (int i = 0; i < arr.length; i++) {
			int tIdx = i < index ? i : i+1;
			temp[tIdx] = arr[i];
		}
		temp[index] = value;
		
		arr = temp;
		
	}

	@Override
	public int remove(int index) {
		int[] temp = new int[arr.length-1];
		
		/*
		int last = 0;
		
		for(int i = 0; i<temp.length; i++) {
			if(i < index) {
				temp[i] = arr[i];
			} else if(i == index) {
				last = arr[i];
				temp[i] = arr[i+1];
			} else {
				temp[i] = arr[i+1];
			}
		}
		*/
		
		int last = arr[index];
		for(int i = 0; i<temp.length; i++) {
			int tIdx = i < index ? i : i+1;
			temp[i] = arr[tIdx];
		}
		arr = temp;
		return last;
	}

}