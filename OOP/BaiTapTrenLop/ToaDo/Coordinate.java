package OOP.BaiTapTrenLop.ToaDo;

public class Coordinate {
    private int x;
    private int y;
    public Coordinate(){
        this.x = 0;
        this.y = 0;
    }
    public Coordinate(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public Coordinate tong2ToaDo(Coordinate other){
        int xNew = this.x + other.getX();
        int yNew = this.y + other.getY();
        return new Coordinate(xNew,yNew);
    }
    public Coordinate diemDoiXung(){
        return new Coordinate(x,-y);
    }
    public void inToaDo(){
        System.out.println("(" + x + "," + y + ")");
    }
}
