package baitapgit;

import java.security.Key;

public class bai1 {
	 public static boolean contains(int[] arr, int item) {
	     for (int n : arr) {
	         if (item == n) {
	            return true;
	         }
	      }
	      return false;
	   }
 public static void main(String[] args) {
	  int[] my_array1 = {
	            1789, 2035, 1899, 1456, 2013  
	           };
	      System.out.println(contains(my_array1, 2013));
	      System.out.println(contains(my_array1, 2015));
	 }
 }
