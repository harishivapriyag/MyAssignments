package week3.day1.assignments;
// method overloading - polymorphism

public class Students {
	public int getstudentInfo(int Id) {
		return Id;
	}
	
	public String getstudentInfo(int Id, String Name) {
		return Name;
		}
	
	public String getstudentInfo(String email, String phonenumber) {
		return phonenumber;
	}

	public static void main(String[] args) {
		Students s=new Students();
		System.out.println(s.getstudentInfo(34));	
		System.out.println(s.getstudentInfo(34, "Student Name is Hari Shivapriya G"));
		System.out.println(s.getstudentInfo("harishivapriyag.99@gmail.com", "9159881380"));		
		
	}

}
