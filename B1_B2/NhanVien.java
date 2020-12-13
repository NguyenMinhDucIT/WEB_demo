package B1_B2;

import java.util.concurrent.ArrayBlockingQueue;

public class NhanVien {
	private String tenNhanVien;
	private double luongCoBan;
	private double heSoLuong;
	public static int count = 0;
	
	public NhanVien(String name, double luongCB, double heSoLuong) {
		this.tenNhanVien = name;
		this.luongCoBan = luongCB;
		this.heSoLuong = heSoLuong;
		count++;
		System.out.println("Số lượng nhân viên: " + count);
	}
	
	public String getTenNhanVien() {
		return tenNhanVien;
	}
	public void setTenNhanVien(String tenNhanVien) {
		this.tenNhanVien = tenNhanVien;
	}
	public double getLuongCoBan() {
		return luongCoBan;
	}
	public void setLuongCoBan(double luongCoBan) {
		this.luongCoBan = luongCoBan;
	}
	public double getHeSoLuong() {
		return heSoLuong;
	}
	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}
	
	public double tinhLuong()
    {
        return getLuongCoBan() * getHeSoLuong();
    }
	
	public void inTTin(double luong) {
        System.out.println((new StringBuilder("Tên nhân viên: " + getTenNhanVien())
        		.append("\nLương cơ bản: " + getLuongCoBan())
        		.append("\nHệ số lương cơ bản: " + getHeSoLuong())
        		.append("\nLương nhân viên: " + luong)));
    }
	
	public static double tongLuong(NhanVien... n1) {
		double sum = 0;
		for (int i = 0; i < n1.length; i++) {
			sum = sum + n1[i].tinhLuong();
		}
		return sum;
	}
	public static void main(String[] args) {
		
		NhanVien[] nv = new NhanVien[2];
		nv[0] = new NhanVien("A", 500, 0.5);
		nv[1] = new NhanVien("B", 2500, 1.2);
		double tongLuong = tongLuong(nv);
		System.out.println("Tong luong: " + tongLuong);
	}
}


