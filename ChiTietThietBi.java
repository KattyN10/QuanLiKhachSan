package mypack;

public class ChiTietThietBi {
	public String SoPhong;
	public String MaThietBi;
	public ChiTietThietBi()
	{
		
	}
	public ChiTietThietBi(ChiTietThietBi cttb)
	{
		this.SoPhong=cttb.SoPhong;
		this.phong=cttb.phong;
		this.MaThietBi=cttb.MaThietBi;
		this.thietbi=cttb.thietbi;
	}
	public ChiTietThietBi(String SoPhong,Phong phong, String MaThietBi,ThietBi thietbi)
	{
		this.SoPhong=SoPhong;
		this.phong=phong;
		this.MaThietBi=MaThietBi;
		this.thietbi=thietbi;
	}
	public ThietBi thietbi;
	public Phong phong;
	public String getSoPhong() {
		return SoPhong;
	}
	public void setSoPhong(String soPhong) {
		this.SoPhong = soPhong;
	}
	public String getMaThietBi() {
		return MaThietBi;
	}
	public void setMaThietBi(String maThietBi) {
		this.MaThietBi = maThietBi;
	}
	public ThietBi getThietbi() {
		return thietbi;
	}
	public void setThietbi(ThietBi thietbi) {
		this.thietbi = thietbi;
	}
	public Phong getPhong() {
		return phong;
	}
	public void setPhong(Phong phong) {
		this.phong = phong;
	}
	
	

}
