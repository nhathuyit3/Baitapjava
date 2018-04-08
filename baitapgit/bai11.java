package baitapgit;

public class bai11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String s1="Chao mung ban den voi khoa cong nghe thong tin va truyen thong SICT";
  System.out.println("chuoi duoc tra ve la :");
  for(String w:s1.split("\\s", 3)) {
	  System.out.println(w);
  }
	}
}
