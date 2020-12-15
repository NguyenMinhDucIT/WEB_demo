package Inheritance;

public class NhanVien {
	private String tenNhanVien;
	private double heSoLuong;
	public static final double LUONG_CO_BAN = 750000;
	public static final double LUONG_MAX = 20000000;
	//
	public String getTenNhanVien() {
		return tenNhanVien;
	}
	public void setTenNhanVien(String tenNhanVien) {
		this.tenNhanVien = tenNhanVien;
	}
	public double getHeSoLuong() {
		return heSoLuong;
	}
	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}
	//
	public double tinhLuong() {
		return getHeSoLuong() * LUONG_CO_BAN;
	}
	public boolean tangLuong(double a) {
		if(a > LUONG_MAX) return false;
		return true;
	}
	public void inTT() {
		System.out.println("Ten nv: " + this.tenNhanVien);
		System.out.println("He so luong: " + this.heSoLuong);
		System.out.println("Luong: " + this.tinhLuong());
		System.out.println("Tang luong: " + this.tangLuong(this.tinhLuong()));
		
	}
}
