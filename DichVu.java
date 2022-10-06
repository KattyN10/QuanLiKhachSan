package mypack;
import java.util.List;

public class DichVu {
	public String MaDV;
	public String TenDV;
	public int GiaDV;
	public DichVu()
	{
		
	}
	public DichVu(DichVu dv)
	{
		this.MaDV=dv.MaDV;
		this.TenDV=dv.TenDV;
		this.GiaDV=dv.GiaDV;
		this.dschitiet=dv.dschitiet;
		
		
	}
	public DichVu(String MaDV,String TenDV, int GiaDV,List<ChiTietDichVu> dschitiet)
	{
		this.MaDV=MaDV;
		this.TenDV=TenDV;
		this.GiaDV=GiaDV;
		this.dschitiet=dschitiet;
		
	}
	public List<ChiTietDichVu> dschitiet;
	public String getMaDV() {
		return MaDV;
	}
	public void setMaDV(String maDV) {
		this.MaDV = maDV;
	}
	public String getTenDV() {
		return TenDV;
	}
	public void setTenDV(String tenDV) {
		this.TenDV = tenDV;
	}
	public int getGiaDV() {
		return GiaDV;
	}
	public void setGiaDV(int giaDV) {
		this.GiaDV = giaDV;
	}
	public List<ChiTietDichVu> getDschitiet() {
		return dschitiet;
	}
	public void setDschitiet(List<ChiTietDichVu> dschitiet) {
		this.dschitiet = dschitiet;
	}
	
}
