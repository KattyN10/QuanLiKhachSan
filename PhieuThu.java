package mypack;
import java.time.LocalDate;
public class PhieuThu {
	public String MaPT;
	public LocalDate NgayLap;
	public int Sotientra;
	public LocalDate NgayThanhToan;
	public String MaHT;
	public PhieuThu()
	{

	}
	public PhieuThu(PhieuThu pt)
	{
		this.MaPT=pt.MaPT;
		this.NgayLap=pt.NgayLap;
		this.Sotientra=pt.Sotientra;
		this.NgayThanhToan=pt.NgayThanhToan;
		this.MaHT=pt.MaHT;
		this.HTthanhtoan=pt.HTthanhtoan;

	}
	public PhieuThu(String MaPT, LocalDate NgLap, int Sotientra, LocalDate NgTT,
			String MaHT,HinhThucThanhToan HTthanhtoan)
	{
		this.MaPT=MaPT;
		this.NgayLap=NgLap;
		this.Sotientra=Sotientra;
		this.NgayThanhToan=NgTT;
		this.MaHT=MaHT;
		this.HTthanhtoan=HTthanhtoan;
	}
	//
	public HinhThucThanhToan HTthanhtoan;
	public String getMaPT() {
		return MaPT;
	}
	public void setMaPT(String maPT) {
		this.MaPT = maPT;
	}
	public LocalDate getNgayLap() {
		return NgayLap;
	}
	public void setNgayLap(LocalDate NgayLap) {
		this.NgayLap=NgayLap;
	}
	public LocalDate getNgayTT() {
		return NgayThanhToan;
	}
	public void setNgayTT(LocalDate NgayTT) {
		this.NgayThanhToan=NgayTT;
	}
	public int getSotientra() {
		return Sotientra;
	}
	public void setSotientra(int sotientra) {
		this.Sotientra = sotientra;
	}
	public String MaHT()
	{
		return MaHT;
	}
	public void setMaHT(String MaHT)
	{
		this.MaHT=MaHT;
	}
	// lien ket 1-1 voi htthanhtoan
	public HinhThucThanhToan HTthanhtoan()
	{
		return HTthanhtoan;
	}
	public void setHTthanhtoan(HinhThucThanhToan HTthanhtoan)
	{
		this.HTthanhtoan=HTthanhtoan;
	}

}
