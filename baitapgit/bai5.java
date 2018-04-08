package baitapgit;

public class bai5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int[] mangso = new int[] {1789, 2035, 1899, 1456, 2013};
  int temp;
  for(int i = 0; i < mangso.length; i++) {
	  for(int j = 0; j < i; j++) {
		if(mangso[i] <= mangso[j]) {
			temp = mangso[i];
			mangso[i]=mangso[j];
			mangso[j]=temp;
		}
	  }
  }
  System.out.println("Mang duoc sap xep lai la :");
  for(int i = 0; i < mangso.length; i++) {
	  System.out.println(mangso[i]);
  }
}
}
