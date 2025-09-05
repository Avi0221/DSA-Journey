public class Interface {
    public static void main(String[] args) {
        Queen Q = new Queen();
        Q.moves();
    }
}

interface chessBoard{
    void moves();
}


class Queen implements chessBoard{
    public void moves(){
        System.out.println("UP,DOWN,LEFT,RIGHT,DIAGONAL(all 4  direction)");

    }
}

class Rook implements chessBoard{
    public void moves(){
        System.out.println("UP.DOWN,LEFT,RIGHT");
    }
}

class King implements chessBoard{
    public void moves(){
        System.out.println("UP,DOWN,LEFT,RIGHT--(By 1 step)");
    }
}