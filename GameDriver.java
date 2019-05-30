import java.util.Scanner;

public class GameDriver {
	public static Scanner kbr = new Scanner(System.in); 
    public static Scanner kbr2 = new Scanner(System.in);
    
	public static void main(String args[]){
		Layout gamePath = new Layout(); //making the place
		
		System.out.println("First Name:"); //getting the data
		String name1 = kbr.nextLine();
		System.out.println("Last name:");
		String name2 = kbr.nextLine();
		System.out.println("Gender (0 is female, 1 is male, 2 is non-binary):");
		int gender = kbr2.nextInt();
		System.out.println("Age:");
		int age = kbr2.nextInt();
		System.out.println("Race:");
		String race = kbr.nextLine();
		System.out.println("Land of Origin:");
		String land = kbr.nextLine();
		System.out.println("Sexuality:");
		String sexuality = kbr.nextLine();
		System.out.println("Number of Siblings:");
		int numSibs = kbr2.nextInt();
		
		GameCharacter main = new GameCharacter(name1, name2, race, land, sexuality, age, numSibs, gender); //making your character with your input
		System.out.println("Just to check,\n" + main.toString());
		
		GameCharacter npc = new GameCharacter();//creation of an NPC
		System.out.println("Your accompaniment:\n" + npc.toString()); //checking it works, telling you who you are traveling with
		
		//Start the adventure!
		System.out.println("You enter the first room:\n" + gamePath.getPlace(0).toString());
		npc.talk("Hey! There's a monster! It's a " + gamePath.getPlace(0).getMonster(0).getType() + "!");
		main.talk("Oh. Cool, I guess.");
	}
}
