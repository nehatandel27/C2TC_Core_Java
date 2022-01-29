package string;

public class String01 {
	public static void main(String[] args) {
		
		String s1 = "name";
		String s2 = "Name";
		String s3 = "lastname";
		String s4 = "     name    na ";
		String s5 =  "";
		String s6 = "this is demo";
		
		s1.concat(s3);
		
//		System.out.println(s4.trim());   // it remove the space
//		System.out.println(s1);
//		System.out.println(s5.isEmpty());
//		System.out.println(s1.equals(s2));
//		System.out.println(s1.equalsIgnoreCase(s2));
//		System.out.println(s1.compareTo(s2));
//		System.out.println(s1.compareToIgnoreCase(s2));
//		System.out.println("name  " + "lastname");
//		System.out.println(String.join(";", s1,s2));
//		System.out.println(s3.subSequence(2, 5));
//		System.out.println(s3.substring(3));
//		System.out.println(s3.substring(1, 7));
//		System.out.println(s6.replace("is", "was"));
//		System.out.println(s6.replaceFirst("is", "the"));
//		System.out.println(s6.replaceAll("is", "was"));
//		System.out.println(s3.indexOf("s"));  //2
//		System.out.println(s3.lastIndexOf("a"));  //5
//		System.out.println(s3.charAt(3));//t
//		System.out.println(s3.contains("m")); //true
//		System.out.println(s3.startsWith("L")); // false 
//		System.out.println(s3.endsWith("e"));   //true
		
//		System.out.println(s2.toLowerCase());
//		System.out.println(s1.toUpperCase());
		
		int a =10;
		String s7 = String.valueOf(a);
		char[] c = s7.toCharArray();
		System.out.println(s7);
		
		
		
		
	}

}
