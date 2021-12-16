public class Piece {

    /**
     * colour : 0 - white, 1 - black
     */
    private boolean isMen;
    private boolean isBlack;
    private Position pos;

    public Piece(Position pos, boolean isBlack) {
        this.isMen = true;
        this.pos = pos;
        this.isBlack = isBlack;
    }

    public Piece() {

    }

    public boolean ifAtBottom() {
        if (isBlack) {
            if (pos.getX() == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            if (pos.getX() == 9) {
                return true;
            } else {
                return false;
            }
        }
    }

    public Position getPos() {
        return pos;
    }

    public void setPos(Position pos) {
        this.pos = pos;
    }

    public boolean getIsMen() {
        return isMen;
    }

    public void setIsMen(boolean isMen) {
        this.isMen = isMen;
    }


}
