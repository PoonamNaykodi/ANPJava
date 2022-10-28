package question2;

public class GameMenu {
	void startGame() {
		System.out.println("Start Game");
	}
	void displayGameInstruction() {
		System.out.println("Display Game Instruction");
	}
	void ExitGame() {
		System.out.println("Exit Game");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameMenu G1=new GameMenu();
		System.out.println("1. Start the Game \n 2. Display the Game \n 3. Exit the Game");
		int choice=2;
		switch (choice) {
		case 1:
			G1.startGame();
			break;
		case 2:
			G1.displayGameInstruction();
			break;
		case 3:
			G1.ExitGame();
			break;
			
		}

	}

}
