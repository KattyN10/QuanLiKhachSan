package mypack;
import java.util.List;
public class ThietBi {
	public String MaThietBi;
	public String TenThietBi;
	public ThietBi()
	{
		
	}
	public ThietBi(ThietBi tb)
	{
		this.MaThietBi=tb.MaThietBi;
		this.TenThietBi=tb.TenThietBi;
		this.dschitiet=tb.dschitiet;
		
	}
	public ThietBi(String MaThietBi,String TenThietBi,List<ChiTietThietBi> dschitiet)
	{	
		this.MaThietBi=MaThietBi;
		this.TenThietBi=TenThietBi;
		this.dschitiet=dschitiet;
		
	}
	public List<ChiTietThietBi> dschitiet;
	public String getMaThietBi() {
		return MaThietBi;
	}
	public void setMaThietBi(String maThietBi) {
		this.MaThietBi = maThietBi;
	}
	public String getTenThietBi() {
		return TenThietBi;
	}
	public void setTenThietBi(String tenThietBi) {
		this.TenThietBi = tenThietBi;
	}
	public List<ChiTietThietBi> getDschitiet() {
		return dschitiet;
	}
	public void setDschitiet(List<ChiTietThietBi> dschitiet) {
		this.dschitiet = dschitiet;
	}
	
}
