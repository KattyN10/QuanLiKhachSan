package mypack;


public class KhachHang {
	public String MaKH;
	public String Hoten;
	public String GioiTinh;
	public String CMND;
	public String SDT;
	public String QuocTich;
	public KhachHang() {}
	public KhachHang(KhachHang kh)
	{
		this.MaKH=kh.MaKH;
		this.Hoten=kh.Hoten;
		this.GioiTinh = kh.GioiTinh;
		this.CMND = kh.CMND;
		this.SDT = kh.SDT;
		this.QuocTich = kh.QuocTich;
		
		
	}
	public KhachHang(String MaKH,String Hoten,String GioiTinh,
			String CMND,String SDT,String QuocTich)
	{
		this.MaKH = MaKH;
		this.Hoten=Hoten;
		this.GioiTinh=GioiTinh;
		this.CMND=CMND;
		this.SDT=SDT;
		this.QuocTich=QuocTich;
	
	}

	public String getMaKH() {
		return MaKH;
	}
	public void setMaKH(String maKH) {
		this.MaKH = maKH;
	}
	public String getHoten() {
		return Hoten;
	}
	public void setHoten(String hoten) {
		this.Hoten = hoten;
	}
	public String getGioiTinh() {
		return GioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.GioiTinh = gioiTinh;
	}
	public String getCMND() {
		return CMND;
	}
	public void setCMND(String cMND) {
		this.CMND = cMND;
	}
	public String getSDT() {
		return SDT;
	}
	public void setSDT(String sDT) {
		this.SDT = sDT;
	}
	public String getQuocTich() {
		return QuocTich;
	}
	public void setQuocTich(String quocTich) {
		this.QuocTich = quocTich;
	}
	
	
}
