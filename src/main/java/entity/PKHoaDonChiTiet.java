package entity;

import java.io.Serializable;

public class PKHoaDonChiTiet implements Serializable{
	protected Integer idsp ;
	protected Integer idkh ;
	
	public PKHoaDonChiTiet() {
		// TODO Auto-generated constructor stub
	}
	public PKHoaDonChiTiet(Integer idsp, Integer idkh) {
		super();
		this.idsp = idsp;
		this.idkh = idkh;
	}
	public Integer getIdsp() {
		return idsp;
	}
	public void setIdsp(Integer idsp) {
		this.idsp = idsp;
	}
	public Integer getIdkh() {
		return idkh;
	}
	public void setIdkh(Integer idkh) {
		this.idkh = idkh;
	}
	
	
	
}
