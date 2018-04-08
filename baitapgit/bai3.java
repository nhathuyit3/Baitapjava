package baitapgit;

import java.util.ArrayList;

public class bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList objArray = new ArrayList();
    ArrayList objArray2 = new ArrayList();
    objArray.add("1");
    objArray.add("2");
    objArray.add("5");
    objArray2.add("6");
    objArray2.add("5");
    objArray2.add("8");
    System.out.println("Mang 1 la :" + objArray);
    System.out.println("Mang 2 la : " + objArray2);
    objArray.retainAll(objArray2);
    System.out.println("So chung giua 2 mang la : " + objArray);
}
}
