package mypack;
import java.time.LocalDate;
import java.util.List;
//
public class ChiTietHopDong {
	public String MaHD;
	public String SoPhong;
	public LocalDate NgayDen;
	public LocalDate NgayDi;
	public ChiTietHopDong()
	{

	}
	public ChiTietHopDong(ChiTietHopDong ct)
	{
		this.MaHD=ct.MaHD;
		this.SoPhong = ct.SoPhong;
		this.NgayDen=ct.NgayDen;
		this.NgayDi=ct.NgayDi;
		this.hopdong=ct.hopdong;
		this.phong=ct.phong;
		this.dschitiet=ct.dschitiet;
	}
	public ChiTietHopDong(String MaHD, String SoPhong,LocalDate Ngden, LocalDate Ngdi,
			HopDongThue hopdong, Phong phong, List<ChiTietDichVu> dschitiet)
	{
		this.MaHD=MaHD;//khoa ngoai
		this.SoPhong=SoPhong;
		this.NgayDen=Ngden;
		this.NgayDi=Ngdi;
		this.hopdong=hopdong;
		this.phong=phong;
		this.dschitiet=dschitiet;
	}
	public Phong phong;
	public HopDongThue hopdong;
	public List<ChiTietDichVu> dschitiet;
	public String getMaHD() {
		return MaHD;
	}
	public void setMaHD(String maHD) {
		this.MaHD = maHD;
	}
	public String getSoPhong() {
		return SoPhong;
	}
	public void setSoPhong(String soPhong) {
		this.SoPhong = soPhong;
	}
	public LocalDate getNgDen() {
		return NgayDen;
	}
	public void setNgDen(LocalDate NgayDen) {
		this.NgayDen=NgayDen;
	}
	public LocalDate getNgDi() {
		return NgayDi;
	}
	public void setNgDi(LocalDate NgayDi) {
		this.NgayDi=NgayDi;
	} 
	//lien ket 1-1 voi HopDongThue
	public HopDongThue hopdong()
	{
		return hopdong;
	}
	public void setHopDong(HopDongThue hopdong)
	{
		this.hopdong=hopdong;
	}
	//
	//line ket 1-1 voi phong
	public Phong phong()
	{
		return phong;
	}
	public void setPhong(Phong phong)
	{
		this.phong=phong;
	}

	public List<ChiTietDichVu> dschitiet()
	{
		return dschitiet;
	}
	public void setDschitiet(List<ChiTietDichVu> dschitiet)
	{
		this.dschitiet=dschitiet;
	}

}
