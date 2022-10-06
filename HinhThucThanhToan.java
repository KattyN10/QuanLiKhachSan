package mypack;

public class HinhThucThanhToan {
	public String MaHT;
	public String TenHT;
	public HinhThucThanhToan()
	{
		
	}
	public HinhThucThanhToan(HinhThucThanhToan ht)
	{
		this.MaHT=ht.MaHT;
		this.TenHT=ht.TenHT;
	}
	public HinhThucThanhToan(String MaHT,String TenHT)
	{
		this.MaHT=MaHT;
		this.TenHT=TenHT;
	}
	public String getMaHT() {
		return MaHT;
	}
	public void setMaHT(String maHT) {
		this.MaHT = maHT;
	}
	public String getTenHT() {
		return TenHT;
	}
	public void setTenHT(String tenHT) {
		this.TenHT = tenHT;
	}
	//
}
