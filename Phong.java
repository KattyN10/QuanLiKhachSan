package mypack;
import java.util.List;
public class Phong {
	public String SoPhong;
	public String LoaiPhong;
	public int GiaPhong;
	public Phong()
	{
		
	}
	public Phong(Phong p)
	{
		this.SoPhong=p.SoPhong;
		this.LoaiPhong=p.LoaiPhong;
		this.GiaPhong=p.GiaPhong;
		this.dsnhanvien=p.dsnhanvien;
		this.dsthietbi=p.dsthietbi;
	}
	public Phong(String SoPhong,String LoaiPhong,int GiaPhong,
			List<ChiTietThietBi> dsthietbi, List<NhanVien> dsnhanvien)
	{
		this.SoPhong=SoPhong;
		this.LoaiPhong=LoaiPhong;
		this.GiaPhong=GiaPhong;
		this.dsnhanvien=dsnhanvien;
		this.dsthietbi=dsthietbi;
	}
	public List<NhanVien> dsnhanvien;
	public List<ChiTietThietBi> dsthietbi;
	public List<NhanVien> getNhanvien() {
		return dsnhanvien;
	}
	public void setNhanvien(List<NhanVien> dsnhanvien) {
		this.dsnhanvien = dsnhanvien;
	}
	public List<ChiTietThietBi> getThietbi() {
		return dsthietbi;
	}
	public void setThietbi(List<ChiTietThietBi> dsthietbi) {
		this.dsthietbi = dsthietbi;
	}
	public String getSoPhong() {
		return SoPhong;
	}
	public void setSoPhong(String soPhong) {
		this.SoPhong = soPhong;
	}
	public String getLoaiPhong() {
		return LoaiPhong;
	}
	public void setLoaiPhong(String loaiPhong) {
		this.LoaiPhong = loaiPhong;
	}
	public int getGiaPhong() {
		return GiaPhong;
	}
	public void setGiaPhong(int giaPhong) {
		this.GiaPhong = giaPhong;
	}
	
	
	
	
}
