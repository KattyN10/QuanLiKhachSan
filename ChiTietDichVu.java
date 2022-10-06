package mypack;

public class ChiTietDichVu {
	public String SoPhong;
	public String MaDichVu;
	public ChiTietDichVu() {
		
	}
	public ChiTietDichVu(ChiTietDichVu ctdv)
	{
		this.SoPhong=ctdv.SoPhong;
		this.phong=ctdv.phong;
		this.MaDichVu=ctdv.MaDichVu;
		this.dichvu=ctdv.dichvu;
	}
	public ChiTietDichVu(String SoPhong,ChiTietHopDong phong,String MaDichVu,DichVu dichvu)
	{
		this.SoPhong=SoPhong;
		this.phong=phong;
		this.MaDichVu=MaDichVu;
		this.dichvu=dichvu;
	}
	public ChiTietHopDong phong;
	public DichVu dichvu;
	public String getSoPhong() {
		return SoPhong;
	}
	public void setSoPhong(String soPhong) {
		this.SoPhong = soPhong;
	}
	public String getMaDichVu() {
		return MaDichVu;
	}
	public void setMaDichVu(String maDichVu) {
		this.MaDichVu = maDichVu;
	}
	public ChiTietHopDong getPhong() {
		return phong;
	}
	public void setPhong(ChiTietHopDong phong) {
		this.phong = phong;
	}
	public DichVu getDichvu() {
		return dichvu;
	}
	public void setDichvu(DichVu dichvu) {
		this.dichvu = dichvu;
	}
	
	
}
