package Inheritance;

import java.util.ArrayList;
import java.util.Scanner;

public class PhongBan {
	private String tenPhongBan;
	private byte soNhanVien ;
	public static final byte SO_NV_MAX = 100;
	//
	public PhongBan(String name) {
		setTenPhongBan(name);
		
	}
	public String getTenPhongBan() {
		return tenPhongBan;
	}
	public void setTenPhongBan(String tenPhongBan) {
		this.tenPhongBan = tenPhongBan;
	}
	public byte getSoNhanVien() {
		return soNhanVien;
	}
	public void setSoNhanVien(byte soNhanVien) {
		this.soNhanVien = soNhanVien;
	}
	//
	public ArrayList<NhanVien> stackNV = new ArrayList<NhanVien>();
	public boolean isFull() {
		if(soNhanVien == SO_NV_MAX) return true;
		return false;
	}
	public boolean isEmpty() {
		if(soNhanVien == 0) return true;
		return false;
	}
	public void themNV(NhanVien nv) {
		if(isFull()) {
			System.out.println("Số lượng nhân viên đã đủ!");
			return;
		}
		stackNV.add(soNhanVien, new NhanVien(nv.getTenNhanVien(), nv.getHeSoLuong()));
		soNhanVien++;
	}
	public NhanVien xoaNV() {
		if(isEmpty()) {
			System.out.println("Không có nhân viên để xóa!");
			return null;
		} else {
			NhanVien tmp = stackNV.get(soNhanVien - 1);
			stackNV.set(soNhanVien - 1, null);
			soNhanVien--;
			return tmp;
		}
	}
	public double tongLuong() {
		double sum = 0.0;
		for (int i = 0; i < stackNV.size(); i++) {
			sum = sum + stackNV.get(i).tinhLuong();
		}
		return sum;
	}
	public void inTT() {
		System.out.println("--- Content ---");
		System.out.println("Ten phong: " + tenPhongBan);
		System.out.println("So nhan vien: " + soNhanVien);
		System.out.println("*********");
		System.out.println("Cac nhan vien:");	
		for (int i = 0; i < stackNV.size(); i++) {
			stackNV.get(i).inTT();
		}
	}
	
	
	
	
	
	
}
