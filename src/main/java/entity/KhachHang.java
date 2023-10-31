package entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "TBL_KHACH_HANG")
public class KhachHang {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id ;
	@NotBlank(message = "Tên khách hàng là bắt buộc ")
	@Size(min = 5 , max = 50 , message = "Tên khách hàng phải có từ 5-50 ký tự")
	@Column(name = "ten_kh")
    private String ten_kh ;
	@NotBlank(message = "Mật khẩu là bắt buộc")
	@Column(name = "mat_khau")
    private String mat_khau ;
	@NotBlank(message = "Số điện thoại là bắt buộc")
	@Column(name = "dien_thoai")
    private int dien_thoai ;
	@NotBlank(message = "Ngày sinh là bắt buộc")
	@Column(name = "ngay_sinh")
    private Date ngay_sinh  ;
	@Column(name = "Gioi_tinh")
    private boolean Gioi_tinh ;
	@Column(name = "idpx")
    private int idpx ;
    
	@OneToMany(mappedBy = "khachHang",fetch = FetchType.EAGER)
	public List<HoaDon> hoaDon ;
   public KhachHang() {
	// TODO Auto-generated constructor stub
}
public KhachHang(int id, String ten_kh, String mat_khau, int dien_thoai, Date ngay_sinh, boolean gioi_tinh, int idpx,
		List<HoaDon> hoaDon) {
	super();
	this.id = id;
	this.ten_kh = ten_kh;
	this.mat_khau = mat_khau;
	this.dien_thoai = dien_thoai;
	this.ngay_sinh = ngay_sinh;
	Gioi_tinh = gioi_tinh;
	this.idpx = idpx;
	this.hoaDon = hoaDon;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTen_kh() {
	return ten_kh;
}
public void setTen_kh(String ten_kh) {
	this.ten_kh = ten_kh;
}
public String getMat_khau() {
	return mat_khau;
}
public void setMat_khau(String mat_khau) {
	this.mat_khau = mat_khau;
}
public int getDien_thoai() {
	return dien_thoai;
}
public void setDien_thoai(int dien_thoai) {
	this.dien_thoai = dien_thoai;
}
public Date getNgay_sinh() {
	return ngay_sinh;
}
public void setNgay_sinh(Date ngay_sinh) {
	this.ngay_sinh = ngay_sinh;
}
public boolean isGioi_tinh() {
	return Gioi_tinh;
}
public void setGioi_tinh(boolean gioi_tinh) {
	Gioi_tinh = gioi_tinh;
}
public int getIdpx() {
	return idpx;
}
public void setIdpx(int idpx) {
	this.idpx = idpx;
}
public List<HoaDon> getHoaDon() {
	return hoaDon;
}
public void setHoaDon(List<HoaDon> hoaDon) {
	this.hoaDon = hoaDon;
}

   
   
}
