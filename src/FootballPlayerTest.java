
public class FootballPlayerTest {

	public static void main(String[] args) {
		 FootballPlayer icardi = new FootballPlayer ();
		icardi.no = 9;
		icardi.name = "Mauro Emanuel Icardi Rivero";
		icardi.minutes = 0;
		icardi.inPlay = true;
		icardi.numberOfGoals = 0;
		
		icardi.play(90);	
		icardi.score();
		icardi.score();
		icardi.score();
		
		
		System.out.println("Number Of Goals İcardi scored: "  + icardi.numberOfGoals);
		System.out.println("İcardi played totally " + icardi.minutes + " minutes so far");
		System.out.println("İcardi Number: "  + icardi.no );
		 
		
		

	}

}
