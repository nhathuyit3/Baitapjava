package baitapgit;

public class bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int numbers[] = new int[] {53, 32, 19, 79, 25, 5, 47};
    int min = numbers[0];
    int max = numbers[0];
    for(int i = 1; i < numbers.length; i++) {
    	if(numbers[i] > max) {
    		max = numbers[i];
    	}
    	else if (numbers[i] < min) {
    		min = numbers[i];
    	}
	}
    System.out.println("So lon nhat trong mang la : " + max);
    System.out.print("So nho nhat trong mang la :" + min);
}
}
