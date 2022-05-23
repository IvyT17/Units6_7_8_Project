/**
 * This class represents a Player object
 *
 * @author Ivy Tang
 */
public class Player
{
    /** String that represents a player's piece */
    private final String piece;

    /**
     * This initializes a Player object with a piece
     *
     * @param piece the player's piece
     */
    public Player(String piece)
    {
        this.piece = piece;
    }

    /**
     * @return This returns the player's piece
     */
    public String getPiece()
    {
        return piece;
    }
}