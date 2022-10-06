package mypack;
import java.time.LocalDate;
public class HopDongThue {
	public String MaHD;
	public LocalDate NgayLap;
	public int SoTien;
	public String MaKH;
	public String MaPT;
	public HopDongThue() {

	}
	public HopDongThue(HopDongThue hd)
	{
		this.MaHD=hd.MaHD;
		this.NgayLap=hd.NgayLap;
		this.SoTien=hd.SoTien;
		this.MaKH=hd.MaKH;
		this.MaPT=hd.MaPT;
		this.kh=hd.kh;
		this.phieuthu = hd.phieuthu;
	}
	public HopDongThue(String MaHD,LocalDate NgLap,int SoTien,String MaKH,
			KhachHang kh,String MaPT,PhieuThu phieuthu)
	{
		this.MaHD=MaHD;
		this.NgayLap=NgLap;
		this.SoTien=SoTien;
		this.MaKH=MaKH;
		this.MaPT=MaPT;
		this.kh=kh;
		this.phieuthu=phieuthu;
	}
	public KhachHang kh;
	public PhieuThu phieuthu;
	public String getMaHD() {
		return MaHD;
	}
	public void setMaHD(String maHD) {
		this.MaHD = maHD;
	}
	public LocalDate getNgayLap() {
		return NgayLap;
	}
	public void setNgayLap(LocalDate NgayLap) {
		this.NgayLap=NgayLap;
	}
	public int getSoTien() {
		return SoTien;
	}
	public void setSoTien(int soTien) {
		this.SoTien = soTien;
	}

	public String getMaKH() {
		return MaKH;
	}
	public void setMaKH(String maKH) {
		this.MaKH = maKH;
	}
	public KhachHang kh()
	{
		return kh;
	}
	public void setKhachHang(KhachHang kh)
	{
		this.kh=kh;
	}
	public PhieuThu phieuthu()
	{
		return phieuthu;
	}
	public void setPhieuThu(PhieuThu phieuthu)
	{
		this.phieuthu=phieuthu;
	}

}
