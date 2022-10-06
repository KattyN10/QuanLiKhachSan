package mypack;

public class ChucVu {
	public String MaChucVu;
	public String TenChucVu;
	public int Luong;
	public ChucVu()
	{
		
	}
	public ChucVu(ChucVu cv)
	{
		this.MaChucVu=cv.MaChucVu;
		this.TenChucVu=cv.TenChucVu;
		this.Luong=cv.Luong;
	}
	public ChucVu(String MaChucVu,String TenChucVu, int Luong)
	{
		this.MaChucVu=MaChucVu;
		this.TenChucVu=TenChucVu;
		this.Luong=Luong;
	}
	public String getMaChucVu() {
		return MaChucVu;
	}
	public void setMaChucVu(String maChucVu) {
		this.MaChucVu = maChucVu;
	}
	public String getTenChucVu() {
		return TenChucVu;
	}
	public void setTenChucVu(String tenChucVu) {
		this.TenChucVu = tenChucVu;
	}
	public int getLuong() {
		return Luong;
	}
	public void setLuong(int luong) {
		this.Luong = luong;
	}
}
