package week1.day4;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String CompanyName = "TestLeaf";
       char[] Company = CompanyName.toCharArray();
       for(int i = Company.length-1; i>0; i--) {
       System.out.print(Company[i]);
	}
}
}
