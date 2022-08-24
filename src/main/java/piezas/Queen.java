package piezas;

import interfaz.ChessGameBoard;
import services.ChessGamePiece;

import javax.swing.ImageIcon;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
// import java.awt.Color;
// -------------------------------------------------------------------------
/**
 * Represents a piesas.Queen game piece.
 *
 * @author Ben Katz (bakatz)
 * @author Myles David II (davidmm2)
 * @author Danielle Bushrow (dbushrow)
 * @version 2010.11.17
 */
public class Queen
    extends ChessGamePiece {
    protected Map<Integer, String> iconsMap;
    // ----------------------------------------------------------
    /**
     * Create a new piesas.Queen object.
     *
     * @param board
     *            the board the queen is on
     * @param row
     *            the row location of the queen
     * @param col
     *            the column location of the queen
     * @param color
     *            either GamePiece.WHITE, BLACK, or UNASSIGNED
     */
    public Queen(ChessGameBoard board, int row, int col, int color ){
        super( board, row, col, color );
    }
    /**
     * Calculates the possible moves for this piesas.Queen.
     * @param board the board to check on
     * @return ArrayList<String> the list of moves
     */
    @Override
    protected ArrayList<String> calculatePossibleMoves( ChessGameBoard board ){
        return movesQueenKing(board,8);
    }

    /**
     * Creates an icon for this piece depending on the piece's color.
     *
     * @return ImageIcon the ImageIcon representation of this piece.
     */
    @Override
    public ImageIcon createImageByPieceType(){
        iconsMap = new HashMap<>();
        iconsMap.put(-1, "../chessImages/default-Unassigned.gif");
        iconsMap.put(ChessGamePiece.BLACK, "../chessImages/BlackQueen.gif");
        iconsMap.put(ChessGamePiece.WHITE, "../chessImages/WhiteQueen.gif");
        return new ImageIcon(getClass().getResource(this.iconsMap.get(getColorOfPiece())));
    }
}
