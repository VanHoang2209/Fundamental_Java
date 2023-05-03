package OOP.ThongTinSach;

public class TacGia {
    private String tenTG;
    private Date ngaySinh;
    public TacGia (String TenTG, Date ngaySinh){
        this.tenTG = tenTG;
        this.ngaySinh = ngaySinh;
    }
    public String getTenTG() {
        return tenTG;
    }
    public void setTenTG(String tenTG) {
        this.tenTG = tenTG;
    }
    public Date getNgaySinh() {
        return ngaySinh;
    }
    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
}
