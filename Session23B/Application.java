
public class Application {

	public static void main(String[] args) {
		Nissan n1 = new Nissan();
		Toyota t1 = new Toyota();
		Honda h1 = new Honda();
		SportsNissan sn1 = new SportsNissan();
		
		n1.Start();
		t1.Start();
		h1.Start();
		sn1.Start();
		
		n1.Stop();
		t1.Stop();
		h1.Stop();
		sn1.Stop();
		
	}

}
