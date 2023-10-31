package entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_HD")
public class HoaDon {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "id")
	    private int id ;
		@Column(name = "idkh")
	    private int idkh ;	
		@Column(name = "ngay_mh")
	    private Date ngay_mh ;
		@Column(name = "Tong_tien")
	    private float Tong_tien ;
		@Column(name = "trang_thai_DH")
	    private Short trang_thai_DH ;
		@Column(name = "ten_nguoi_nhan")
	    private String ten_nguoi_nhan ;
		@Column(name = "dia_chi_nguoi_nhan")
	    private String dia_chi_nguoi_nhan ;
		@Column(name = "Email_nguoi_nhan")
	    private String Email_nguoi_nhan ;
		@Column(name = "phuong_thuc_thanh_toan")
	    private Short phuong_thuc_thanh_toan ;
		@Column(name = "phuong_thuc_van_chuyen")
	    private Short phuong_thuc_van_chuyen ;
		
		@ManyToOne
		@JoinColumn(name = "idkh",referencedColumnName = "id")
	    public KhachHang khachHang ;
	    
		public HoaDon() {
			// TODO Auto-generated constructor stub
		}

		public HoaDon(int id, int idkh, Date ngay_mh, float tong_tien, Short trang_thai_DH, String ten_nguoi_nhan,
				String dia_chi_nguoi_nhan, String email_nguoi_nhan, Short phuong_thuc_thanh_toan,
				Short phuong_thuc_van_chuyen, KhachHang khachHang) {
			super();
			this.id = id;
			this.idkh = idkh;
			this.ngay_mh = ngay_mh;
			Tong_tien = tong_tien;
			this.trang_thai_DH = trang_thai_DH;
			this.ten_nguoi_nhan = ten_nguoi_nhan;
			this.dia_chi_nguoi_nhan = dia_chi_nguoi_nhan;
			Email_nguoi_nhan = email_nguoi_nhan;
			this.phuong_thuc_thanh_toan = phuong_thuc_thanh_toan;
			this.phuong_thuc_van_chuyen = phuong_thuc_van_chuyen;
			this.khachHang = khachHang;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getIdkh() {
			return idkh;
		}

		public void setIdkh(int idkh) {
			this.idkh = idkh;
		}

		public Date getNgay_mh() {
			return ngay_mh;
		}

		public void setNgay_mh(Date ngay_mh) {
			this.ngay_mh = ngay_mh;
		}

		public float getTong_tien() {
			return Tong_tien;
		}

		public void setTong_tien(float tong_tien) {
			Tong_tien = tong_tien;
		}

		public Short getTrang_thai_DH() {
			return trang_thai_DH;
		}

		public void setTrang_thai_DH(Short trang_thai_DH) {
			this.trang_thai_DH = trang_thai_DH;
		}

		public String getTen_nguoi_nhan() {
			return ten_nguoi_nhan;
		}

		public void setTen_nguoi_nhan(String ten_nguoi_nhan) {
			this.ten_nguoi_nhan = ten_nguoi_nhan;
		}

		public String getDia_chi_nguoi_nhan() {
			return dia_chi_nguoi_nhan;
		}

		public void setDia_chi_nguoi_nhan(String dia_chi_nguoi_nhan) {
			this.dia_chi_nguoi_nhan = dia_chi_nguoi_nhan;
		}

		public String getEmail_nguoi_nhan() {
			return Email_nguoi_nhan;
		}

		public void setEmail_nguoi_nhan(String email_nguoi_nhan) {
			Email_nguoi_nhan = email_nguoi_nhan;
		}

		public Short getPhuong_thuc_thanh_toan() {
			return phuong_thuc_thanh_toan;
		}

		public void setPhuong_thuc_thanh_toan(Short phuong_thuc_thanh_toan) {
			this.phuong_thuc_thanh_toan = phuong_thuc_thanh_toan;
		}

		public Short getPhuong_thuc_van_chuyen() {
			return phuong_thuc_van_chuyen;
		}

		public void setPhuong_thuc_van_chuyen(Short phuong_thuc_van_chuyen) {
			this.phuong_thuc_van_chuyen = phuong_thuc_van_chuyen;
		}

		public KhachHang getKhachHang() {
			return khachHang;
		}

		public void setKhachHang(KhachHang khachHang) {
			this.khachHang = khachHang;
		}
		
		
}
