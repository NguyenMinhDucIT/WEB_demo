package Inheritance;

import java.util.Scanner;

public class NhanVien {
	private String tenNhanVien;
	private double heSoLuong;
	public static final double LUONG_CO_BAN = 750000;
	public static final double LUONG_MAX = 20000000;
	//
	public NhanVien(String name, double heSoLuong) {
		setTenNhanVien(name);
		setHeSoLuong(heSoLuong);
	}
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
		System.out.println("*****");
		
	}
	
//	public NhanVien nhapNV() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Ten nhan vien: ");
//		String name = sc.nextLine();
//		sc.nextDouble();
//		System.out.println("He so luong nhan vien: ");
//		double hsl = sc.nextDouble();
//		NhanVien tmp = new NhanVien(name, hsl);
//		return tmp;
//		
//	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PhongBan pb = new PhongBan("Nhan su");
		NhanVien nv;
		for (int i = 0; i < 2; i++) {
			System.out.println("Nhap ten nhan vien: ");
			String name = sc.nextLine();
			System.out.println("Nhap he so luong: ");
			double hsl = sc.nextDouble();
			sc.nextLine();
			nv = new NhanVien(name, hsl);
			pb.themNV(nv);
			
		}
		
		pb.inTT();
		System.out.println("So nhan vien: " + pb.getSoNhanVien());
		NhanVien nv2 = pb.xoaNV();
		nv2.inTT();
		System.out.println("So nhan vien: " + pb.getSoNhanVien());
		
			
			
		
		
	}
}
