package B8_CleanCode;

public class TenisGame {
    private static final int LOVE = 0;
    private static final int FIFTEEN = 1;
    private static final int THIRTY = 2;
    private static final int FORTY = 3;


    public static String getScore(int playerScore) {
        String score;
        switch (playerScore) {
            case LOVE:
                score = "Love-All";
                break;
            case FIFTEEN:
                score = "Fifteen-All";
                break;
            case THIRTY:
                score = "Thirty-All";
                break;
            case FORTY:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;
        }
        return score;
    }

    public static int isAdvantage(int player1Score, int player2Score) {
        if (player1Score >= 4 || player2Score >= 4) {
            int minusResult = player1Score - player2Score;
            if (minusResult == 1) {
                return 1;
            } else if (minusResult == -1) {
                return -1;
            }
        }
        return 0;
    }

    public static int isWin(int player1Score, int player2Score) {
        if (player1Score >= 4 || player2Score >= 4) {
            int minusResult = player1Score - player2Score;
            if (minusResult >= 2) {
                return 1;
            } else {
                return -1;
            }
        }
        return 0;
    }
}
