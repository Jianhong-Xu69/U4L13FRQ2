public class CoinGame {

    public static void main(String[] args) {
        // COPY/PASTE YOUR METHODS for (a) and (b)
        // into the CoinGame class, then run this code
        // to test your solutions
        CoinGame game1 = new CoinGame(10, 5);
        game1.playGame();  // should print: tie game

        CoinGame game2 = new CoinGame(10, 4);
        game2.playGame(); // should print: tie game

        CoinGame game3 = new CoinGame(10, 3);
        game3.playGame(); // should print: player 1 wins

        CoinGame game4 = new CoinGame(10, 2);
        game4.playGame(); // should print: player 2 wins

        CoinGame game5 = new CoinGame(10, 6);
        game5.playGame(); // should print: player 2 wins

        CoinGame game6 = new CoinGame(5, 4);
        game6.playGame(); // should print: player 2 wins

        CoinGame game7 = new CoinGame(7, 4);
        game7.playGame(); // should print: tie game
    }

    private int startingCoins; // starting number of coins
    private int maxRounds; // maximum number of rounds played
    private int roundTracker = 1; // *** ADDED TO ENABLE TESTING ***

    public CoinGame(int s, int r) {
        startingCoins = s;
        maxRounds = r;
    }


    /**
     * Returns the number of coins (1, 2, or 3) that player 1 will spend.
     * NOTE: THIS CODE WAS NOT PROVIDED IN THE FRQ ("implementation not shown")
     * BUT IS INCLUDED HERE TO ENABLE TESTING
     */
    public int getPlayer1Move() {
        int result;
        if (roundTracker == 1 || roundTracker == 2 || roundTracker == 4) {
            result = 2;
        } else if (roundTracker == 3) {
            result = 1;
        } else {
            result = 3;
        }
        roundTracker++;
        return result;
    }


    /**
     * Returns the number of coins (1, 2, or 3) that player 2
     * will spend, as described in part (a).
     */
    public int getPlayer2Move(int round) {
        if (round % 3 == 0) {
            return 3;
        } else if (round % 2 == 0) {
            return 2;
        } else {
            return 1;
        }
    }


    /** Plays a simulated game between two players,
     as described in part (b).
     */
    public void playGame() {
        int player1Coins = startingCoins;
        int player2Coins = startingCoins;
        int player1Move = -0;
        int player2Move = -0;
        for (int i = 1; i <= maxRounds; i++){
            player1Move = getPlayer1Move();
            player2Move = getPlayer2Move(i);
            player1Coins -= player1Move;
            player2Coins -= player2Move;
            if (player1Move == player2Move || player1Move + 1 == player2Move || player1Move -1 == player2Move){
                player2Coins++;
            }
            if (player1Move + 2 == player2Move || player1Move - 2 == player2Move){
                player1Coins += 2;
            }
            if (player1Coins < 3 || player2Coins < 2){
                i = i + maxRounds;
            }
        }
        if (player1Coins > player2Coins){
            System.out.println("Player1 Wins");
        } else if (player1Coins < player2Coins){
            System.out.println("Player2 Wins");
        } else {
            System.out.println("Tie Game");
        }
    }
}

