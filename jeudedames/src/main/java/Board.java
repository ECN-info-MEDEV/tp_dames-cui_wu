import java.util.ArrayList;
import java.util.Map;

public class Board {
    private ArrayList<Piece> blackPieces;
    private ArrayList<Piece> whiePieces;
    private Map<String, Piece> pieceMap;

    static private int sizeBoard=10;

    public Board(){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j ++) {
                if ((i+j)%2 == 0) {
                    whiePieces.add(new Piece(new Position(i, j), false));
                }
            }
        }

        for (int i = 9; i > 5 ; i--) {
            for (int j = 0; j < 10; j ++) {
                if ((i+j)%2 == 0) {
                    blackPieces.add(new Piece(new Position(i, j), true));
                }
            }
        }

        for (Piece i : whiePieces) {
            pieceMap.put(i.getPos().toString(), i);
        }

        for (Piece i : blackPieces) {
            pieceMap.put(i.getPos().toString(), i);
        }
    }

    public void tourdejeu() {

    }

}