import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

class main{
    public static void main(String[] args) {
	    System.out.println("Hi! I made another version of tictactoe! (the main difference is that it's written in java)\n");
	    Scanner getPlayerType = new Scanner(System.in);
	    System.out.println("Player 1, would you like x or o?");
	    char playerType = (getPlayerType.nextLine()).charAt(0);
	    System.out.println("\nCool! Now, which space would you like?"); 
        printBoardEmpty();
        char[] board = new char[9];// smaller than int!
	    boolean turn = false;
    }

    public static void handleInput(Scanner s, char[] board, char pt, boolean t) {
        char choice = (s.nextLine()).charAt(0);
        int c = (int)choice;
        if ((int)board[c] > 0) {
            System.out.println("\n" + "Sorry, you can't overwrite that space. Please try again." + "\n");
            printBoard(board);
            handleInput(s, board, pt, t);
        } else {
            
        }
        
    }

    public static void printBoard(char[] board) {
        // it's technically O(1) time, and technically correct is the best kind of correct.
        for (int i = 0; i < 3; i++) {
                for (int k = 0; k < 3; k++) {
                    for (int j = 0; j < 7; j++) {
                        if (board[j + i] == 'x') {
                            System.out.printf(x[k]);
                        } else if (board[j + i] == 'o') {
                            System.out.printf(o[k]);// named it 'k' solely so i could type 'ok' in the code somewhere lol
                        } else {
                            System.out.printf(blank);
                        }
                        if (i > 2) {
                            System.out.printf("||");
                        }
                    }
                }
            }
        /*
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
        */
    }

    public static void printBoardEmpty() {
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

    public static String[] o = {"  ============  ",
                                " ||          || ",
                                " ||          || ",
                                " ||          || ",
                                " ||          || ",
                                " ||          || ",
                                "  ============  "};
    public static String blank = "                ";

    public static String[] x = {"  \\           /  ",
                                "    \\       /    ",
                                "      \\   /      ",
                                "        X         ",
                                "      /   \\      ",
                                "    /      \\     ",
                                "  /          \\   "};
}
    
