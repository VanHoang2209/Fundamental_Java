package OOP.BaiTapTrenLop.BT_OOP_TH_Bai4Cau3;

public class NhanVienCLCao extends NhanVien {
    protected String trinhDo;
    protected String nganh;
    protected String noiDaoTao;
    public NhanVienCLCao(String ten, int namSinh, double luong, String ngayNhanViec, PhongBanKhoa phongBanKhoa,
                         String trinhDo, String nganh, String noiDaoTao){
        super(ten,namSinh,luong,ngayNhanViec,phongBanKhoa);
        this.trinhDo = trinhDo;
        this.nganh = nganh;
        this.noiDaoTao = noiDaoTao;
    }
    public NhanVienCLCao(){
        super();
        this.trinhDo = "";
        this.nganh = "";
        this.noiDaoTao = "";
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public String getNoiDaoTao() {
        return noiDaoTao;
    }

    public void setNoiDaoTao(String noiDaoTao) {
        this.noiDaoTao = noiDaoTao;
    }

}
