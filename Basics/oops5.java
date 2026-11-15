public class oops5{

    public static void main(String args[]){
Queen q=new Queen();
q.moves();
    }
}
interface chessPlayer{
    void moves();
}
class Queen implements  chessPlayer{
   public  void moves(){
    System.out.println("up,down,left,right,diagonal(in al 4 direction)");
    }
}
class Rook implements  chessPlayer{
   public  void moves(){
    System.out.println("up,down,left,right");
    }
}
class King implements  chessPlayer{
   public  void moves(){
    System.out.println("up,down,left,right,diagonal(in by 1 step)");
    }
}