
public class Student {
	Student(String name) {

	}

	Student() {

	}

	int play(int gameType) {

		if (gameType == 1) {
			System.out.println("Playing basketball for 10 minutes");
			return 10;

		} else if (gameType == 2) {
			System.out.println("Playing soccer for 10 minutes");
			return 10;

		} else {
			System.out.println("I don't know what game you're playing");
			return 10;

		}

	}

	int play2(int gameType) {
		switch (gameType) {

		case 1:
			System.out.println("Playing basketball for 10 minutes");
			break;

		case 2:
			System.out.println("Playing soccer for 10 minutes");
			break;

		default:
			System.out.println("I don't know what game you're playing.");
			break;

		}
		return 10;

	}
	
	 int play(enum Game, int gametype) {
		 
		
		
		
	}
	
	
	

}
