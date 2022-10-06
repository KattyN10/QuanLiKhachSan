package mypack;

public class NhanVien {
	public String MaNV;
	public String Hoten;
	public String GioiTinh;
	public String CMND;
	public String DiaChi;
	public String SDT;
	public String MaCV;
	public String PhongPhuTrach;
	public NhanVien()
	{
		
	}
	public NhanVien(NhanVien nv)
	{
		this.MaNV=nv.MaNV;
		this.Hoten=nv.Hoten;
		this.GioiTinh=nv.GioiTinh;
		this.CMND=nv.CMND;
		this.DiaChi=nv.DiaChi;
		this.SDT=nv.SDT;
		this.MaCV=nv.MaCV;
		this.CV=nv.CV;
		this.PhongPhuTrach=nv.PhongPhuTrach;
		this.phong=nv.phong;
	}
	public NhanVien(String MaNV,String Hoten,String GioiTinh,String CMND,
			String DiaChi,String SDT,String MaCV, ChucVu CV, 
			String PhongPhuTrach, Phong phong)
	{
		this.MaNV=MaNV;
		this.Hoten=Hoten;
		this.GioiTinh=GioiTinh;
		this.CMND=CMND;
		this.DiaChi=DiaChi;
		this.SDT=SDT;
		this.MaCV=MaCV;
		this.CV=CV;
		this.PhongPhuTrach=PhongPhuTrach;
		this.phong=phong;
	}
	public ChucVu CV;
	public Phong phong;
	public String getMaNV() {
		return MaNV;
	}
	public void setMaNV(String maNV) {
		this.MaNV = maNV;
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
	public String getDiaChi() {
		return DiaChi;
	}
	public void setDiaChi(String diaChi) {
		this.DiaChi = diaChi;
	}
	public String getSDT() {
		return SDT;
	}
	public void setSDT(String sDT) {
		this.SDT = sDT;
	}
	public String getMaCV() {
		return MaCV;
	}
	public void setMaCV(String maCV) {
		this.MaCV = maCV;
	}
	public String getPhongPhuTrach() {
		return PhongPhuTrach;
	}
	public void setPhongPhuTrach(String phongPhuTrach) {
		this.PhongPhuTrach = phongPhuTrach;
	}
	public ChucVu getCV() {
		return CV;
	}
	public void setCV(ChucVu CV) {
		this.CV = CV;
	}
	public Phong getPhong() {
		return phong;
	}
	public void setPhong(Phong phong) {
		this.phong = phong;
	}
	
	
}
