package OOP.ThongTinSach;

    public class Date {
        private int ngay;
        private int thang;
        private int nam;
        public Date(int ngay, int thang, int nam){
            if(ngay >= 1 && ngay <= 31){
                this.ngay = ngay;
            }
            else    this.ngay = 1;
            if(thang>=1 && thang <= 12){
                this.thang = thang;
            }
            else    this.thang = 1;
            if(nam >= 1){
                this.nam = nam;
            }
            else    this.nam = 1;
        }

        public int getNgay() {
            return ngay;
        }

        public void setNgay(int ngay) {
            if(ngay >= 1 && ngay <= 31){
                this.ngay = ngay;
            }
        }

        public int getThang() {
            return thang;
        }

        public void setThang(int thang) {
            if(thang >= 1 && thang <= 12){
                this.thang = thang;
            }
        }

        public int getNam() {
            return nam;
        }

        public void setNam(int nam) {
            if(nam >= 1){
                this.nam = nam;
            }
        }
    }
