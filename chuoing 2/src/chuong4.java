
/**
 *
 * @author 12-45-5-9-2020
 */
public class chuong4 {

    public static void main(String[] args) {
        sinhvien sv = new sinhvien();
        
       
        
        cuuSinhvien s = new cuuSinhvien();
        
        System.out.println(s.getKhoa());
    }

}

class cuuSinhvien extends sinhvien{
    
    
}

class sinhvien {

    private int tuoi;
    private String khoa;
    private String ten;

    public sinhvien() {
        tuoi = 18;
        khoa = "Kinh te";
        ten = "NVM";
    }

    public void setKhoa(String khoa) {
        String khoa_ = khoa + "465645";
        this.khoa = khoa;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getKhoa() {
        return khoa;
    }

    public String getTen() {
        return ten;
    }

    public int getTuoi() {
        return tuoi;
    }
    
    

}
