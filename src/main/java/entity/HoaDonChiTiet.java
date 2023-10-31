package entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(PKHoaDonChiTiet.class)
@Table(name = "TBL_CHITIET_HD")
public class HoaDonChiTiet {
	@Id
	@Column(name = "idhd")
	private int idhd ;
	@Id
	@Column(name = "idsp")
    private int idsp ;
	@Column(name = "gia_ban")
    private float gia_ban;
	@Column(name = "so_luong")
    private int so_luong ;
	@Column(name = "trang_thai")
    private Short trang_thai ;
	@Column(name = "ngay_mua")
    private Date ngay_mua ;
    
    public HoaDonChiTiet() {
		// TODO Auto-generated constructor stub
	}

	public HoaDonChiTiet(int idhd, int idsp, float gia_ban, int so_luong, Short trang_thai, Date ngay_mua) {
		super();
		this.idhd = idhd;
		this.idsp = idsp;
		this.gia_ban = gia_ban;
		this.so_luong = so_luong;
		this.trang_thai = trang_thai;
		this.ngay_mua = ngay_mua;
	}

	public int getIdhd() {
		return idhd;
	}

	public void setIdhd(int idhd) {
		this.idhd = idhd;
	}

	public int getIdsp() {
		return idsp;
	}

	public void setIdsp(int idsp) {
		this.idsp = idsp;
	}

	public float getGia_ban() {
		return gia_ban;
	}

	public void setGia_ban(float gia_ban) {
		this.gia_ban = gia_ban;
	}

	public int getSo_luong() {
		return so_luong;
	}

	public void setSo_luong(int so_luong) {
		this.so_luong = so_luong;
	}

	public Short getTrang_thai() {
		return trang_thai;
	}

	public void setTrang_thai(Short trang_thai) {
		this.trang_thai = trang_thai;
	}

	public Date getNgay_mua() {
		return ngay_mua;
	}

	public void setNgay_mua(Date ngay_mua) {
		this.ngay_mua = ngay_mua;
	}
    
    
}
