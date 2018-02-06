
public class Application {

	public static void main(String[] args) {
		Student s1 = new Student();
		Address a = new Address();
		a.city = "Portland";
		a.street = "Tucson";
		a.zip = "97006";
		a.state = "Oregon";
		s1.name = "Varun Dharmala";
		s1.address = a;
		School school = new School();
		school.enroll(s1);

	}

}
