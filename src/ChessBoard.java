public class ChessBoard {
    private Rectangle[][] board;
     public ChessBoard() {
         this.board = new Rectangle[8][8];

     }
     public void fill(int x, int y, Rectangle rectangle) {
         if ( x>= 0 && x < 8 && y >= 0 && y < 8) {
             board[x][y] = rectangle;
         } else {

         }
     }

     public Rectangle getRectangle (int x, int y) {
         if (x >= 0 && x < 8 && y >= 0 && y < 8) {
             return board[x][y];
         } else {
             return  null;
         }
     }
}
