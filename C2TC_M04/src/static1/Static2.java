package static1;

public class Static2 {
	int roll;
	String name;
	static String college = "Mumbai unversity";

	Static2(int r,String n)
	 {
		 roll=r;
		 name=n;
		 
	 }

	void display() {
		System.out.println(roll + "" + name + "" + college);
	}

	public static void main(String[] args) {
		Static2 s1 = new Static2(1, "sneha");
		Static2 s2 = new Static2(1, "sne");
		s1.display();
		s2.display();
	}

}
