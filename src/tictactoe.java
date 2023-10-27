import java.util.Scanner;

class main{
    public static void main(String[] args) {
	    System.out.println("Hi! I made another version of tictactoe! (the main difference is that it's written in java)\n");
	    Scanner getPlayerType = new Scanner(System.in);
	    System.out.println("Player 1, would you like x or o?");
	    char playerType = getPlayerType.nextLine();
	    System.out.println("Cool! Now, which space would you like?"); 
        this.printBoard();
        char[] board = new char[9];// smaller than int!
	    boolean turn = false;
        System.out.println("\n" + board[0] + "\n");
    }

    public static void handleInput(Scanner s, char[] board, char pt, boolean t) {
        char choice = (s.nextLine()).charAt(0);
        int c = (int)choice;
        
    }

    public static void printBoard() {
    	System.out.println("                 ||                 ||                 ");
	    System.out.println("                 ||                 ||                 ");
	    System.out.println("                 ||                 ||                 ");
	    System.out.println("        1        ||        2        ||        3        ");
	    System.out.println("                 ||                 ||                 ");
	    System.out.println("                 ||                 ||                 ");
	    System.out.println("                 ||                 ||                 ");
	    System.out.println("=======================================================");
	    System.out.println("                 ||                 ||                 ");
	    System.out.println("                 ||                 ||                 ");
	    System.out.println("                 ||                 ||                 ");
	    System.out.println("        4        ||        5        ||        6        ");
	    System.out.println("                 ||                 ||                 ");
	    System.out.println("                 ||                 ||                 ");
	    System.out.println("                 ||                 ||                 ");
	    System.out.println("=======================================================");
	    System.out.println("                 ||                 ||                 ");
	    System.out.println("                 ||                 ||                 ");
	    System.out.println("                 ||                 ||                 ");
	    System.out.println("        7        ||        8        ||        9        ");
	    System.out.println("                 ||                 ||                 ");
	    System.out.println("                 ||                 ||                 ");
	    System.out.println("                 ||                 ||                 "); 
    }
}
