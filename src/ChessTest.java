public class ChessTest {
    public static void main(String[] args) {
        ChessBoard chessBoard = new ChessBoard();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Rectangle square = new Rectangle("black", true, new LocationOfFigure(i,j), 50);
                chessBoard.fill(i,j,square);
                System.out.println(square.speak());
            }
        }
        System.out.println(Rectangle.getSquareCount());
    }
}
