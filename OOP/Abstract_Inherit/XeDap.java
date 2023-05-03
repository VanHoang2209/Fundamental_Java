package OOP.Abstract_Inherit;

public class XeDap extends PhuongTienDiChuyen {

    public XeDap( HangSanXuat hangSX) {
        super("Xe dap",hangSX);
    }
    @Override
    public double layVanToc(){
        return 10;
    }
}
