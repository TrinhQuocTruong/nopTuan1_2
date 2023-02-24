package tuan2;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;

public class CD {
 private String maCD;
 private String tuaCD;
 private Calendar ngayPH;
 private double donGia;
 private int soBH;
public String getMaCD() {
	return maCD;
}
public void setMaCD(String ma) throws Exception {
	if (ma!="") {
		this.maCD = ma;
	}else throw new Exception ("Loi ma");
}
public String getTuaCD() {
	return tuaCD;
}
public void setTuaCD(String tua) throws Exception {
	if (tua!="") {
		this.tuaCD = tua;
	}else throw new Exception ("Loi");
}
public Calendar getNgayPH() {
	return ngayPH;
}
public void setNgayPH(Calendar ngayPH) throws Exception {
	if (ngayPH!=null) {
		this.ngayPH = ngayPH;
	}else throw new Exception ("Loi ngay");
}
public double getDonGia() {
	return donGia;
}
public void setDonGia(double donGia) {
	this.donGia = donGia;
}
public int getSoBH() {
	return soBH;
}
public void setSoBH(int so) throws Exception {
	if (so>0) {
		this.soBH = so;
	}else throw new Exception ("Loi so");
}
//tao ham de khoi tao doi tuong
 public CD() {
	 this.maCD="000000";
	 this.tuaCD="xxxxxxx";
	 this.ngayPH=null;
	 this.soBH=0;
	 this.donGia=1000;
 }
public CD(String ma, String tua, Calendar ngayPH, double donGia, int so) throws Exception {
	if (ma!="") {
		this.maCD = ma;
	}else throw new Exception ("Loi ma");
	if (tua!="") {
		this.tuaCD = tua;
	}else throw new Exception ("Loi");
	if (ngayPH!=null) {
		this.ngayPH = ngayPH;
	}else throw new Exception ("Loi ngay");
		this.donGia = donGia;
	if (so>0) {
		this.soBH = so;
	}else throw new Exception ("Loi so");
}
//phuongthuctinh getthanhtien
public double getThanhTien() {
	return getDonGia()*getSoBH();
}
public void tieuDe() {
	System.out.println("test ket qua ");
	for (int i=0 ;i < 72;i++)
		System.out.printf("-");
	System.out.println("-");
	System.out.printf("|% -10s|%-10s|%- 14s|% - 10s|%- 10s|%- 12s|\n",
	"Ma CD","Tua CD","Ngay Phat Hanh","Don gia ","So Bai Hat","Tong Tien");
	for (int i= 0;i < 72 ;i ++)
		System.out.printf("-");
	System.out.println();
}
Locale lc=new Locale("vi","VN");
DateFormat df= DateFormat.getDateInstance(1,lc );
NumberFormat sf = NumberFormat.getCurrencyInstance(lc);
@Override
public String toString() {
	String s="";
	s+=String.format("|% -10s|%-10s|%- 14s|% - 10s|%- 10s|%- 12s|",getMaCD(),getTuaCD(),df.format(getNgayPH().getTime()),sf.format(getDonGia()),getSoBH(),sf.format(getThanhTien()));
return s;
}
}



