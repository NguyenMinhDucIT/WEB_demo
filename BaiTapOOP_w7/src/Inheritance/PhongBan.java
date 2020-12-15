package Inheritance;

public class PhongBan {
	private String tenPhongBan;
	private byte soNhanVien = 0;
	public static final byte SO_NV_MAX = 100;
	//
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
	public NhanVien[] stackNV;
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
		
		stackNV[soNhanVien] = nv;
		soNhanVien++;
	}
	public NhanVien xoaNV() {
		if(isEmpty()) {
			System.out.println("Không có nhân viên để xóa!");
			return null;
		} else {
			NhanVien tmp = stackNV[soNhanVien];
			stackNV[soNhanVien] = null;
			soNhanVien--;
			return tmp;
		}
	}
	public double tongLuong() {
		double sum = 0.0;
		for (int i = 0; i < stackNV.length; i++) {
			sum = sum + stackNV[i].tinhLuong();
		}
		return sum;
	}
	public void inTT() {
		System.out.println("Ten phong: " + tenPhongBan);
		System.out.println("So nhan vien: " + soNhanVien);
		System.out.println("Cac nhan vien:");	
		for (int i = 0; i < stackNV.length; i++) {
			stackNV[i].inTT();
		}
	}
	
	
	
	
}
