package mypack;
import java.time.LocalDate;
import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
//
public class QLKS 
{
	//
	public static List<KhachHang> dsKhachHang = new ArrayList<KhachHang>();
	public static List<HopDongThue> dsHopDong = new ArrayList<HopDongThue>();
	public static List<PhieuThu> dsPhieuThu = new ArrayList<PhieuThu>();
	public static List<HinhThucThanhToan> dsHinhThucTT = new ArrayList<HinhThucThanhToan>();
	public static List<DichVu> dsDichVu = new ArrayList<DichVu>();
	public static List<ChiTietHopDong> dsChiTietHD = new ArrayList<ChiTietHopDong>();
	public static List<Phong> dsPhong = new ArrayList<Phong>();
	public static List<ThietBi> dsThietBi = new ArrayList<ThietBi>();
	public static List<NhanVien> dsNhanVien = new ArrayList<NhanVien>();
	public static List<ChucVu> dsChucVu = new ArrayList<ChucVu>();
	public static List<ChiTietDichVu> dsChiTietDichVu = new ArrayList<ChiTietDichVu>();
	public static List<ChiTietThietBi> dsChiTietThietBi = new ArrayList<ChiTietThietBi>();
	public static void taoDSChiTietThietBi()
	{
		dsChiTietThietBi.add(new ChiTietThietBi(dsPhong.get(0).SoPhong, dsPhong.get(0), dsThietBi.get(0).MaThietBi, dsThietBi.get(0)));
		dsChiTietThietBi.add(new ChiTietThietBi(dsPhong.get(0).SoPhong, dsPhong.get(0), dsThietBi.get(1).MaThietBi, dsThietBi.get(1)));
		dsChiTietThietBi.add(new ChiTietThietBi(dsPhong.get(0).SoPhong, dsPhong.get(0), dsThietBi.get(2).MaThietBi, dsThietBi.get(2)));
		dsChiTietThietBi.add(new ChiTietThietBi(dsPhong.get(0).SoPhong, dsPhong.get(0), dsThietBi.get(3).MaThietBi, dsThietBi.get(3)));
		dsChiTietThietBi.add(new ChiTietThietBi(dsPhong.get(0).SoPhong, dsPhong.get(0), dsThietBi.get(4).MaThietBi, dsThietBi.get(4)));
  
        //
		dsChiTietThietBi.add(new ChiTietThietBi(dsPhong.get(1).SoPhong, dsPhong.get(1), dsThietBi.get(0).MaThietBi, dsThietBi.get(0)));
		dsChiTietThietBi.add(new ChiTietThietBi(dsPhong.get(1).SoPhong, dsPhong.get(1), dsThietBi.get(1).MaThietBi, dsThietBi.get(1)));
		dsChiTietThietBi.add(new ChiTietThietBi(dsPhong.get(1).SoPhong, dsPhong.get(1), dsThietBi.get(2).MaThietBi, dsThietBi.get(2)));
		dsChiTietThietBi.add(new ChiTietThietBi(dsPhong.get(1).SoPhong, dsPhong.get(1), dsThietBi.get(3).MaThietBi, dsThietBi.get(3)));
		dsChiTietThietBi.add(new ChiTietThietBi(dsPhong.get(1).SoPhong, dsPhong.get(1), dsThietBi.get(4).MaThietBi, dsThietBi.get(4)));
        //
		dsChiTietThietBi.add(new ChiTietThietBi(dsPhong.get(2).SoPhong, dsPhong.get(2), dsThietBi.get(0).MaThietBi, dsThietBi.get(0)));
		dsChiTietThietBi.add(new ChiTietThietBi(dsPhong.get(2).SoPhong, dsPhong.get(2), dsThietBi.get(1).MaThietBi, dsThietBi.get(1)));
		dsChiTietThietBi.add(new ChiTietThietBi(dsPhong.get(2).SoPhong, dsPhong.get(2), dsThietBi.get(2).MaThietBi, dsThietBi.get(2)));
		
        //
		dsChiTietThietBi.add(new ChiTietThietBi(dsPhong.get(3).SoPhong, dsPhong.get(3), dsThietBi.get(0).MaThietBi, dsThietBi.get(0)));
		dsChiTietThietBi.add(new ChiTietThietBi(dsPhong.get(3).SoPhong, dsPhong.get(3), dsThietBi.get(1).MaThietBi, dsThietBi.get(1)));
		dsChiTietThietBi.add(new ChiTietThietBi(dsPhong.get(3).SoPhong, dsPhong.get(3), dsThietBi.get(2).MaThietBi, dsThietBi.get(2)));
        //
		dsChiTietThietBi.add(new ChiTietThietBi(dsPhong.get(4).SoPhong, dsPhong.get(4), dsThietBi.get(0).MaThietBi, dsThietBi.get(0)));
		dsChiTietThietBi.add(new ChiTietThietBi(dsPhong.get(4).SoPhong, dsPhong.get(4), dsThietBi.get(2).MaThietBi, dsThietBi.get(2)));
        //
		dsChiTietThietBi.add(new ChiTietThietBi(dsPhong.get(5).SoPhong, dsPhong.get(5), dsThietBi.get(0).MaThietBi, dsThietBi.get(0)));
		dsChiTietThietBi.add(new ChiTietThietBi(dsPhong.get(5).SoPhong, dsPhong.get(5), dsThietBi.get(2).MaThietBi, dsThietBi.get(2)));

        //
        dsPhong.get(0).dsthietbi.add(dsChiTietThietBi.get(0));
        dsPhong.get(0).dsthietbi.add(dsChiTietThietBi.get(1));
        dsPhong.get(0).dsthietbi.add(dsChiTietThietBi.get(2));
        dsPhong.get(0).dsthietbi.add(dsChiTietThietBi.get(3));
        dsPhong.get(0).dsthietbi.add(dsChiTietThietBi.get(4));
        //
        dsPhong.get(1).dsthietbi.add(dsChiTietThietBi.get(5));
        dsPhong.get(1).dsthietbi.add(dsChiTietThietBi.get(6));
        dsPhong.get(1).dsthietbi.add(dsChiTietThietBi.get(7));
        dsPhong.get(1).dsthietbi.add(dsChiTietThietBi.get(8));
        dsPhong.get(1).dsthietbi.add(dsChiTietThietBi.get(9));
        //
        dsPhong.get(2).dsthietbi.add(dsChiTietThietBi.get(10));
        dsPhong.get(2).dsthietbi.add(dsChiTietThietBi.get(11));
        dsPhong.get(2).dsthietbi.add(dsChiTietThietBi.get(12));
        //
        dsPhong.get(3).dsthietbi.add(dsChiTietThietBi.get(13));
        dsPhong.get(3).dsthietbi.add(dsChiTietThietBi.get(14));
        dsPhong.get(3).dsthietbi.add(dsChiTietThietBi.get(15));
        //
        dsPhong.get(4).dsthietbi.add(dsChiTietThietBi.get(16));
        dsPhong.get(4).dsthietbi.add(dsChiTietThietBi.get(17));
        //
        dsPhong.get(5).dsthietbi.add(dsChiTietThietBi.get(18));
        dsPhong.get(5).dsthietbi.add(dsChiTietThietBi.get(19));
        //
        dsThietBi.get(0).dschitiet.add(dsChiTietThietBi.get(0));
        dsThietBi.get(0).dschitiet.add(dsChiTietThietBi.get(5));
        dsThietBi.get(0).dschitiet.add(dsChiTietThietBi.get(10));
        dsThietBi.get(0).dschitiet.add(dsChiTietThietBi.get(13));
        dsThietBi.get(0).dschitiet.add(dsChiTietThietBi.get(16));
        dsThietBi.get(0).dschitiet.add(dsChiTietThietBi.get(18));
        //
        dsThietBi.get(2).dschitiet.add(dsChiTietThietBi.get(2));
        dsThietBi.get(2).dschitiet.add(dsChiTietThietBi.get(7));
        dsThietBi.get(2).dschitiet.add(dsChiTietThietBi.get(12));
        dsThietBi.get(2).dschitiet.add(dsChiTietThietBi.get(15));
        dsThietBi.get(2).dschitiet.add(dsChiTietThietBi.get(17));
        dsThietBi.get(2).dschitiet.add(dsChiTietThietBi.get(19));
        //
        dsThietBi.get(1).dschitiet.add(dsChiTietThietBi.get(1));
        dsThietBi.get(1).dschitiet.add(dsChiTietThietBi.get(6));
        dsThietBi.get(1).dschitiet.add(dsChiTietThietBi.get(11));
        dsThietBi.get(1).dschitiet.add(dsChiTietThietBi.get(14));
        //
        dsThietBi.get(3).dschitiet.add(dsChiTietThietBi.get(3));
        dsThietBi.get(3).dschitiet.add(dsChiTietThietBi.get(4));
        //
        dsThietBi.get(4).dschitiet.add(dsChiTietThietBi.get(8));
        dsThietBi.get(4).dschitiet.add(dsChiTietThietBi.get(9));
	}
	//
	public static void taoDSChiTietDichVu()
	{
		dsChiTietDichVu.add(new ChiTietDichVu(dsChiTietHD.get(0).SoPhong, dsChiTietHD.get(0),dsDichVu.get(0).MaDV, dsDichVu.get(0)));
		dsChiTietDichVu.add(new ChiTietDichVu(dsChiTietHD.get(0).SoPhong, dsChiTietHD.get(0),dsDichVu.get(1).MaDV, dsDichVu.get(1)));
		dsChiTietDichVu.add(new ChiTietDichVu(dsChiTietHD.get(1).SoPhong, dsChiTietHD.get(1),dsDichVu.get(0).MaDV, dsDichVu.get(0)));
		dsChiTietDichVu.add(new ChiTietDichVu(dsChiTietHD.get(1).SoPhong, dsChiTietHD.get(1),dsDichVu.get(2).MaDV, dsDichVu.get(2)));
		dsChiTietDichVu.add(new ChiTietDichVu(dsChiTietHD.get(2).SoPhong, dsChiTietHD.get(2),dsDichVu.get(1).MaDV, dsDichVu.get(1)));
		dsChiTietDichVu.add(new ChiTietDichVu(dsChiTietHD.get(3).SoPhong, dsChiTietHD.get(3),dsDichVu.get(3).MaDV, dsDichVu.get(3)));
		dsChiTietDichVu.add(new ChiTietDichVu(dsChiTietHD.get(3).SoPhong, dsChiTietHD.get(3),dsDichVu.get(3).MaDV, dsDichVu.get(3)));
		dsChiTietDichVu.add(new ChiTietDichVu(dsChiTietHD.get(4).SoPhong, dsChiTietHD.get(4),dsDichVu.get(4).MaDV, dsDichVu.get(4)));
		dsChiTietDichVu.add(new ChiTietDichVu(dsChiTietHD.get(4).SoPhong, dsChiTietHD.get(4),dsDichVu.get(5).MaDV, dsDichVu.get(5)));
		dsChiTietDichVu.add(new ChiTietDichVu(dsChiTietHD.get(4).SoPhong, dsChiTietHD.get(4),dsDichVu.get(1).MaDV, dsDichVu.get(1)));
		dsChiTietDichVu.add(new ChiTietDichVu(dsChiTietHD.get(5).SoPhong, dsChiTietHD.get(5),dsDichVu.get(1).MaDV, dsDichVu.get(1)));
		
        //
        dsChiTietHD.get(0).dschitiet.add(dsChiTietDichVu.get(0));
        dsChiTietHD.get(0).dschitiet.add(dsChiTietDichVu.get(1));
        //
        dsChiTietHD.get(1).dschitiet.add(dsChiTietDichVu.get(2));
        dsChiTietHD.get(1).dschitiet.add(dsChiTietDichVu.get(3));
        //
        dsChiTietHD.get(2).dschitiet.add(dsChiTietDichVu.get(4));;
        //
        dsChiTietHD.get(3).dschitiet.add(dsChiTietDichVu.get(5));
        dsChiTietHD.get(3).dschitiet.add(dsChiTietDichVu.get(6));
        //
        dsChiTietHD.get(4).dschitiet.add(dsChiTietDichVu.get(7));
        dsChiTietHD.get(4).dschitiet.add(dsChiTietDichVu.get(8));
        dsChiTietHD.get(4).dschitiet.add(dsChiTietDichVu.get(9));
        //
        dsChiTietHD.get(5).dschitiet.add(dsChiTietDichVu.get(10));
        //
        dsDichVu.get(0).dschitiet.add(dsChiTietDichVu.get(0));
        dsDichVu.get(0).dschitiet.add(dsChiTietDichVu.get(2));
        //
        dsDichVu.get(1).dschitiet.add(dsChiTietDichVu.get(1));
        dsDichVu.get(1).dschitiet.add(dsChiTietDichVu.get(4));
        dsDichVu.get(1).dschitiet.add(dsChiTietDichVu.get(9));
        dsDichVu.get(1).dschitiet.add(dsChiTietDichVu.get(10));
        //
        dsDichVu.get(2).dschitiet.add(dsChiTietDichVu.get(3));
        //
        dsDichVu.get(3).dschitiet.add(dsChiTietDichVu.get(5));
        dsDichVu.get(3).dschitiet.add(dsChiTietDichVu.get(6));
        //
        dsDichVu.get(4).dschitiet.add(dsChiTietDichVu.get(7));
        //
        dsDichVu.get(5).dschitiet.add(dsChiTietDichVu.get(8));
	}
	public static void taoDSKhachHang() 
	{
		dsKhachHang.add(new KhachHang("KH01","Aberto Smith","Nam","256875648",
				"0569875648","Anh Quoc"));
		dsKhachHang.add(new KhachHang("KH02", "Pham Mach Can", "Nam", "215666669", 
				"0326578954", "Viet Nam"));
		dsKhachHang.add(new KhachHang("KH03", "Choi Song Young", "Nam", "2525648675",
				"0864759245", "Han Quoc"));
		dsKhachHang.add(new KhachHang("KH04", "Jessica Do", "Nu", "236975645", 
				"0123697584", "Hoa Ky"));
		dsKhachHang.add(new KhachHang("KH05", "Hu Jintao", "Nam", "252564578",
				"0978654257", "Trung Quoc"));
		dsKhachHang.add(new KhachHang("KH06", "Thai Hong Tuyet",  "nu", "221345999", 
				"0965429999", "Viet Nam"));
	}
	//
	public static void taoDSHopDong() 
	{
		//
		dsHopDong.add(new HopDongThue("HD01",IsoChronology.INSTANCE.date(2021, 11, 20),
				999000, dsKhachHang.get(0).MaKH, 
				dsKhachHang.get(0), dsPhieuThu.get(0).MaPT, dsPhieuThu.get(0)));
		dsHopDong.add(new HopDongThue("HD02", IsoChronology.INSTANCE.date(2021, 10, 1),
				550000, dsKhachHang.get(1).MaKH,
				dsKhachHang.get(1), dsPhieuThu.get(1).MaPT, dsPhieuThu.get(1)));
		dsHopDong.add(new HopDongThue("HD03",IsoChronology.INSTANCE.date(2021, 10, 11),
				1800000, dsKhachHang.get(2).MaKH,
				dsKhachHang.get(2), dsPhieuThu.get(2).MaPT, dsPhieuThu.get(2)));
		dsHopDong.add(new HopDongThue("HD04", IsoChronology.INSTANCE.date(2021, 10, 20),
				4999000, dsKhachHang.get(3).MaKH,
				dsKhachHang.get(3), dsPhieuThu.get(3).MaPT, dsPhieuThu.get(3)));
		dsHopDong.add(new HopDongThue("HD05", IsoChronology.INSTANCE.date(2021, 11, 20),
				750000, dsKhachHang.get(4).MaKH,
				dsKhachHang.get(4), dsPhieuThu.get(4).MaPT, dsPhieuThu.get(4)));
		dsHopDong.add(new HopDongThue("HD06", IsoChronology.INSTANCE.date(2021, 10, 20), 
				1999000, dsKhachHang.get(5).MaKH,
				dsKhachHang.get(5), dsPhieuThu.get(5).MaPT, dsPhieuThu.get(5)));
	}
	//
	public static void taoDSChiTietHD()
	{
		dsChiTietHD.add(new ChiTietHopDong(dsHopDong.get(0).MaHD, dsPhong.get(0).SoPhong, IsoChronology.INSTANCE.date(2021, 11, 20), 
				IsoChronology.INSTANCE.date(2021, 11, 22), dsHopDong.get(0), dsPhong.get(0), new ArrayList<ChiTietDichVu>()));
		dsChiTietHD.add(new ChiTietHopDong(dsHopDong.get(1).MaHD, dsPhong.get(1).SoPhong, IsoChronology.INSTANCE.date(2021, 10, 1), 
				IsoChronology.INSTANCE.date(2021, 10, 5), dsHopDong.get(1), dsPhong.get(1), new ArrayList<ChiTietDichVu>()));
		dsChiTietHD.add(new ChiTietHopDong(dsHopDong.get(2).MaHD, dsPhong.get(2).SoPhong, IsoChronology.INSTANCE.date(2021, 10, 11), 
				IsoChronology.INSTANCE.date(2021, 11, 1), dsHopDong.get(2), dsPhong.get(2), new ArrayList<ChiTietDichVu>()));
		dsChiTietHD.add(new ChiTietHopDong(dsHopDong.get(3).MaHD, dsPhong.get(3).SoPhong, IsoChronology.INSTANCE.date(2021, 10, 7), 
				IsoChronology.INSTANCE.date(2021, 10, 20), dsHopDong.get(3), dsPhong.get(3), new ArrayList<ChiTietDichVu>()));
		dsChiTietHD.add(new ChiTietHopDong(dsHopDong.get(4).MaHD, dsPhong.get(4).SoPhong, IsoChronology.INSTANCE.date(2021, 11, 16), 
				IsoChronology.INSTANCE.date(2021, 11, 21), dsHopDong.get(4), dsPhong.get(4), new ArrayList<ChiTietDichVu>()));
		dsChiTietHD.add(new ChiTietHopDong(dsHopDong.get(5).MaHD, dsPhong.get(5).SoPhong, IsoChronology.INSTANCE.date(2021, 10, 2), 
				IsoChronology.INSTANCE.date(2021, 10, 8), dsHopDong.get(5), dsPhong.get(5), new ArrayList<ChiTietDichVu>()));
	}
	//
	public static void taoDSDichVu()
	{
		dsDichVu.add(new DichVu("DV01", "Massage", 500000,new ArrayList<ChiTietDichVu>()));
        dsDichVu.add(new DichVu("DV02", "Tam Bun Non", 350000, new ArrayList<ChiTietDichVu>()));
        dsDichVu.add(new DichVu("DV03", "Spa", 250000, new ArrayList<ChiTietDichVu>()));
        dsDichVu.add(new DichVu("DV04", "Giu Xe", 999000, new ArrayList<ChiTietDichVu>()));
        dsDichVu.add(new DichVu("DV05", "Don Phong", 222000, new ArrayList<ChiTietDichVu>()));
        dsDichVu.add(new DichVu("DV06", "Buffet", 299000, new ArrayList<ChiTietDichVu>()));
	}
	//
	public static void taoDSPhieuThu()
	{
		dsPhieuThu.add(new PhieuThu("PT1", IsoChronology.INSTANCE.date(2021, 11, 22), 
				10000000, IsoChronology.INSTANCE.date(2021, 11, 22),
				dsHinhThucTT.get(0).MaHT, dsHinhThucTT.get(0)));
		dsPhieuThu.add(new PhieuThu("PT2", IsoChronology.INSTANCE.date(2021, 10, 5),
				9700000, IsoChronology.INSTANCE.date(2021, 10, 5),
				dsHinhThucTT.get(1).MaHT, dsHinhThucTT.get(1)));
		dsPhieuThu.add(new PhieuThu("PT3", IsoChronology.INSTANCE.date(2021, 11, 1), 
				6480000,IsoChronology.INSTANCE.date(2021, 11, 1),
				dsHinhThucTT.get(2).MaHT, dsHinhThucTT.get(2)));
		dsPhieuThu.add(new PhieuThu("PT4", IsoChronology.INSTANCE.date(2021, 10, 20), 
				6600000, IsoChronology.INSTANCE.date(2021, 10, 20), 
				dsHinhThucTT.get(0).MaHT, dsHinhThucTT.get(0)));
		dsPhieuThu.add(new PhieuThu("PT5", IsoChronology.INSTANCE.date(2021, 11, 21), 
				9000000, IsoChronology.INSTANCE.date(2021, 11, 21),
				dsHinhThucTT.get(1).MaHT, dsHinhThucTT.get(1)));
		dsPhieuThu.add(new PhieuThu("PT6", IsoChronology.INSTANCE.date(2021, 10, 8), 
				11000000,IsoChronology.INSTANCE.date(2021, 10, 8),
				dsHinhThucTT.get(2).MaHT, dsHinhThucTT.get(2)));
	}
	//
	public static void  taoDSHTTT()
	{
		dsHinhThucTT.add(new HinhThucThanhToan("HT01", "Tien Mat"));
		dsHinhThucTT.add(new HinhThucThanhToan("HT02", "Chuyen Khoan"));
		dsHinhThucTT.add(new HinhThucThanhToan("HT03", "Quet The"));
	}
	//
	public static void taoDSNhanVien()
	{
		dsNhanVien.add(new NhanVien("NV01", "Alex Truong", "Nam", "2565486750", "Quy Nhon", 
				"0368547568", dsChucVu.get(0).MaChucVu, dsChucVu.get(0),
				dsPhong.get(0).SoPhong, dsPhong.get(0)));
		dsNhanVien.add(new NhanVien("NV02", "Nguyen Thai Lan", "Nam", "2546875624", "Tp. Ho Chi Minh",
				"0324568754", dsChucVu.get(0).MaChucVu, dsChucVu.get(0),
				dsPhong.get(1).SoPhong, dsPhong.get(1)));
		dsNhanVien.add(new NhanVien("NV03", "Duong Tuyet Tran", "Nu", "2456875648", "Da Nang", 
				"0324568759", dsChucVu.get(1).MaChucVu, dsChucVu.get(1), 
				dsPhong.get(2).SoPhong, dsPhong.get(2)));
		dsNhanVien.add(new NhanVien("NV04", "Tran Mach Can", "Nam", "2456987564", "Nha Trang", 
				"0354698754", dsChucVu.get(2).MaChucVu, dsChucVu.get(2), 
				dsPhong.get(3).SoPhong, dsPhong.get(3)));
		dsNhanVien.add(new NhanVien("NV05", "Nguyen Thai Duong", "Nam", "2554789654", "Chau Doc",
				"0378965475", dsChucVu.get(3).MaChucVu, dsChucVu.get(3), 
				dsPhong.get(2).SoPhong, dsPhong.get(2)));
		dsNhanVien.add(new NhanVien("NV06", "Thai Tuyet Hong Hoa", "Nu", "2548657450", "Ha Noi", 
				"0324568754", dsChucVu.get(2).MaChucVu, dsChucVu.get(2),
				dsPhong.get(4).SoPhong, dsPhong.get(4)));
	}
	//
	public static void taoDSChucVu()
	{
		dsChucVu.add(new ChucVu("CV01", "Giat Giu", 2040000));
		dsChucVu.add(new ChucVu("CV02", "Phuc Vu", 2800000));
		dsChucVu.add(new ChucVu("CV03", "Tap Vu", 2400000));
		dsChucVu.add(new ChucVu("CV04", "Dau Bep", 2800000));
	}
	//
	public static void taoDSPhong()
	{
		dsPhong.add(new Phong("P01", "Phong LUXURY", 5550000, 
				new ArrayList<ChiTietThietBi>(), new ArrayList<NhanVien>()));
		dsPhong.add(new Phong("P02", "Phong LUXURY", 5550000, 
				new ArrayList<ChiTietThietBi>(), new ArrayList<NhanVien>()));
		dsPhong.add(new Phong("P03", "Phong VIP", 4440000, 
				new ArrayList<ChiTietThietBi>(), new ArrayList<NhanVien>()));
		dsPhong.add(new Phong("P04", "Phong VIP", 4440000, 
				new ArrayList<ChiTietThietBi>(), new ArrayList<NhanVien>()));
		dsPhong.add(new Phong("P05", "Phong NORMAL", 3000000,
				new ArrayList<ChiTietThietBi>(), new ArrayList<NhanVien>()));
		dsPhong.add(new Phong("P06", "Phong NORMAL", 3000000, 
				new ArrayList<ChiTietThietBi>(), new ArrayList<NhanVien>()));
	}
	//
	public static void taoDSThietBi()
	{
			dsThietBi.add(new ThietBi("TB01","May Lanh",new ArrayList<ChiTietThietBi>()));
			dsThietBi.add(new ThietBi("TB02","Tu Lanh",new ArrayList<ChiTietThietBi>()));
			dsThietBi.add(new ThietBi("TB03","Ti Vi",new ArrayList<ChiTietThietBi>()));
			dsThietBi.add(new ThietBi("TB04","Quan Ao Ngu",new ArrayList<ChiTietThietBi>()));
			dsThietBi.add(new ThietBi("TB05","May Say Toc",new ArrayList<ChiTietThietBi>()));
	}
	/*================Khoa======================*/
	//Thiet bi tung phong
	public static void Lamda01()
	{
		System.out.println("Danh sach thiet bi tung phong: ");
		System.out.println();
		List<Phong> dsphong = dsPhong
				.stream()
				.collect(Collectors.toList());

		for(Phong phong:dsphong)
		{
			System.out.println("Phong: "+phong.SoPhong+" - "+"Loai Phong: "+phong.LoaiPhong.toString()+" - "+
					"Gia Phong: "+phong.GiaPhong);
			for(ChiTietThietBi tb:phong.dsthietbi)
			{
				System.out.println(tb.MaThietBi+"-"+tb.thietbi.TenThietBi);
			}
			System.out.println();
		}
	}
	// Cho biet thong tin cua nhan vien nam
	public static void Lamda02(String gioitinh)
	{
		System.out.println("Thong tin nhan vien nam:");
		List<NhanVien> dsnhanvien = dsNhanVien
				.stream()
				.filter(t->t.GioiTinh==gioitinh)
				.collect(Collectors.toList());

		for(NhanVien nv:dsnhanvien)
		{
			System.out.println("Ma Nhan Vien: "+nv.MaNV+" - "+"Ho Ten: "+nv.Hoten+" - "+"Dia Chi: "+nv.DiaChi+" - "+
					"CMND: "+nv.CMND+" - "+"Chuc Vu: "+nv.CV.TenChucVu);
		}
	}
	// Liet ke hop dong co gia tri hon 1000000
	public static void Lambda03()
	{
		System.out.println("Danh sach hop dong co gia tri hon 1000000:");
		List<HopDongThue> hopdong = dsHopDong
				.stream()
				.filter(t->t.SoTien>1000000)
				.collect(Collectors.toList());

		for(HopDongThue hd:hopdong)
		{
			System.out.println("Ma Hop Dong: "+hd.MaHD+" - "+"Ten Khach Hang: "+hd.kh.Hoten
					+" - "+"Ngay Lap: "+hd.NgayLap+" - "+"Gia Tri: "+hd.SoTien);
		}
	}
	// Hop dong thanh toan bang tien mat
	public static void Lambda04()
	{
		System.out.println("Danh sach hop dong thanh toan bang tien mat:");
		List<HopDongThue> hopdong = dsHopDong
				.stream()
				.filter(t->t.phieuthu.HTthanhtoan.TenHT=="Tien Mat")
				.collect(Collectors.toList());

		for(HopDongThue hd:hopdong)
		{
			System.out.println("Ma Hop Dong: "+hd.MaHD+" - "+"Ten Khach Hang: "+hd.kh.Hoten+" - "+"Ngay Lap: "+hd.NgayLap+" - "+"Gia Tri: "+hd.SoTien
					+" - "+"Phieu Thu: "+hd.phieuthu.MaPT+" - "+"Hinh Thuc Thanh Toan: "+hd.phieuthu.HTthanhtoan.TenHT);
		}
	}
	// Thong tin khach hang o hop dong có ma HD02
	public static void Lambda05(String mahd)
	{
		HopDongThue hd = dsHopDong
				.stream()
				.filter(t->t.MaHD==mahd)
				.findFirst().get();
		if (hd != null)
		{
			System.out.println("Thong Tin Khach Hang O Hop Dong Co Ma "+mahd);
			System.out.println("Ho ten: "+hd.kh.Hoten+" - "+"Gioi Tinh: "+hd.kh.GioiTinh+" - "+"Quoc Tich: "+hd.kh.QuocTich+" - "+
					"CMND: "+hd.kh.CMND+" - "+"So Dien Thoai: "+hd.kh.SDT);
		}
		else
			System.out.println("Khong co Hop Dong Có Ma "+ mahd);
	}
	/*================Phuc=====================*/
	// Danh sach nhan vien lam viec o phong LUXURY
	public static void Lambda06(String LoaiPhong)
	{
		System.out.println("Danh Sach Nhan Vien Lam Viec "+LoaiPhong+" :");
		List<NhanVien> dsNV = dsNhanVien
				.stream()
				.filter(t -> t.phong.getLoaiPhong()==LoaiPhong)
				.collect(Collectors.toList());

		for(NhanVien nv:dsNV)
		{
			System.out.println("MaNV: "+nv.MaNV+" HoTen: "+nv.Hoten+" GioiTinh: "+nv.GioiTinh
					+" CMND: "+nv.CMND+" DiaChi: "+nv.DiaChi+" PhongLamViec: "+nv.phong.getLoaiPhong());
		}
	}
	// Thong tin ve hop dong thue cua khach hang
	public static void Lambda07()
	{
		System.out.println("Thong Tin Hop Dong Cua Khach Hang Viet Nam: ");
		List<HopDongThue> dsHD = dsHopDong
				.stream()
				.filter(t -> t.kh.getQuocTich()=="Viet Nam")
				.collect(Collectors.toList());
		//
		for(HopDongThue ds:dsHD)
		{
			System.out.println("MaKH: "+ds.MaKH+" HoTen: "+ds.kh.getHoten()+" GioiTinh: "
					+ds.kh.getGioiTinh()+" QuocTich: "+ds.kh.QuocTich+" MaHD: "+ds.MaHD+" NgayLapHD: "+ds.NgayLap
					+" SoTienTra: "+ds.SoTien+" HinhThucTT: "+ds.phieuthu.HTthanhtoan.getTenHT());
		}

	}
	// Thong tin hop dong dau tien duoc thanh toan bang Chuyen Khoan
	public static void Lambda08()
	{
		System.out.println("Thong tin hop dong dau tien duoc thanh toan bang Chuyen Khoan: ");
		HopDongThue hd =dsHopDong
				.stream()
				.filter(t -> t.phieuthu.HTthanhtoan.getTenHT()=="Chuyen Khoan")
				.findFirst().get();
		//
		if (hd!=null)
		{
			System.out.println("MaHD: "+hd.MaHD+" NgayLap: "+hd.NgayLap+" SoTien: "
					+hd.SoTien+" HinhThucTT: "+hd.phieuthu.HTthanhtoan.getTenHT());
		}
	}
	// Danh sach hop dong duoc lap truoc ngay 
	public static void Lambda09()
	{ 
		System.out.println("Thong tin hop dong duoc lap truoc 20/11/2021: ");
		System.out.println();
		LocalDate date =LocalDate.of(2021, 11, 20);
		List<HopDongThue> dsHD= dsHopDong
				.stream()
				.filter(t -> t.NgayLap.isBefore(date))
				.collect(Collectors.toList());
		//
		for(HopDongThue ds:dsHD)
		{
			System.out.println("MaHD: "+ds.MaHD+" NgayLap: "+ds.NgayLap+" SoTien: "+ds.SoTien);
		}
		System.out.println();
	}
	// Thong tin hop dong cua khach hang KH01
	public static void Lambda10(String MaKH)
	{
		System.out.println("Thong tin hop dong cua khach hang "+MaKH);
		HopDongThue hd=dsHopDong
				.stream()
				.filter(t->t.MaKH==MaKH)
				.findFirst().get();
		//
		if(hd != null)
			System.out.println("MaHD: "+hd.MaHD+" NgLapHD: "+hd.NgayLap+" SoTien: "+hd.SoTien);
		else
			System.out.println("Khong co hop dong cua khach hang "+MaKH);
	}
   //Danh sach dich vu cac phong da su dung
	public static void Lambda11()
	{
		System.out.println("Danh Sach cac dich vu cac phong da su dung: ");
		System.out.println();
		List<ChiTietHopDong> dscthd = dsChiTietHD
				.stream()
				.collect(Collectors.toList());
		for(ChiTietHopDong ds:dscthd)
		{
			System.out.println("Phong: "+ds.SoPhong);
			System.out.println("Da dung cac dich vu: ");
			for(ChiTietDichVu dv:ds.dschitiet)
			{
			//	System.out.println(dv.TenDV+" ("+dv.MaDV+")");
				System.out.println("Ten dich vu: "+dv.dichvu.TenDV +" ,Ma dich vu: "+(dv.dichvu.MaDV));
			}
			System.out.println();
		}
		
	}
	//Cac cong viec co muc luong 2800000
	public static void Lambda12()
	{
		System.out.println("Cac cong viec co muc luong: <2800000>: ");
		List<ChucVu> nv = dsChucVu
				.stream()
				.filter(t->t.Luong==2800000)
				.collect(Collectors.toList());
		for(ChucVu n:nv)
		{
			System.out.println("Ma: "+n.MaChucVu+" - "+n.TenChucVu);
		}
	
		
	}
	public static void Lambda13()
	{
		System.out.println("Cac nhan vien tap vu: ");
		List<NhanVien> dsNV = dsNhanVien
				.stream()
				.filter(t -> t.CV.TenChucVu=="Tap Vu")
				.collect(Collectors.toList());
		for(NhanVien nv:dsNV)
		{
			System.out.println("Ho ten: "+nv.Hoten+", msnv: "+nv.MaNV+", gioi tinh: "+nv.GioiTinh);
		}	
	}
	public static void Lambda14()
	{
		System.out.println("Danh sach phong gia lon hon <4000000>: ");
		List<Phong> kh = dsPhong
				.stream()
				.filter(t->t.GiaPhong>4000000)
				.collect(Collectors.toList());
		for(Phong k:kh)
		{
			System.out.println("Ma phong: "+k.SoPhong+", Gia phong: "+k.GiaPhong);
		}
				
	}
	
	public static void Lambda15(String MaHD)
	{
		System.out.println("Hop Dong "+MaHD+" co phuong thuc thanh toan la: ");
		HopDongThue dv = dsHopDong
				.stream()
				.filter(t->t.MaHD==MaHD)
				.findFirst().get();
		if(dv != null)
		{
			System.out.println(dv.phieuthu.HTthanhtoan.TenHT);
		}
		else
			System.out.println("Khong co hop dong co ma "+MaHD);
	}
	public static void main(String[] args) 
	{
		taoDSPhong();
		taoDSKhachHang();
		taoDSHTTT();
		taoDSThietBi();
		taoDSChucVu();
		taoDSPhieuThu();
		taoDSHopDong();
		taoDSChiTietHD();
		taoDSDichVu();
		taoDSNhanVien();
		taoDSChiTietDichVu();
		taoDSChiTietThietBi();
		/*===============Khoa=============*/
		//Lamda01();
		//Lamda02("Nam");
		//Lambda03();
		//Lambda04();
		//Lambda05("HD02");
		/*===============Phuc=============*/
		//Lambda06("Phong LUXURY");
		//Lambda07();
		//Lambda08();
		//Lambda09();
		//Lambda10("KH01");
		/*===============Hieu=============*/
		Lambda11();
		//Lambda12();
		//Lambda13();
		//Lambda14();
		//Lambda15("HD03");
		
	}

}
