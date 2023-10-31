package entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class QuanHuyen {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id ;
	@Column(name = "idtt")
    private int idtt ; 
	@Column(name = "ten_quan_huyen")
    private String ten_quan_huyen ;
	@Column(name = "trang_thai")
    private Short trang_thai ;
    
    @ManyToOne
    @JoinColumn(name = "idtt",referencedColumnName = "id")
    public TinhThanh tinhThanh ;
    public QuanHuyen() {
		// TODO Auto-generated constructor stub
	}
	public QuanHuyen(int id, int idtt, String ten_quan_huyen, Short trang_thai, TinhThanh tinhThanh) {
		super();
		this.id = id;
		this.idtt = idtt;
		this.ten_quan_huyen = ten_quan_huyen;
		this.trang_thai = trang_thai;
		this.tinhThanh = tinhThanh;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdtt() {
		return idtt;
	}
	public void setIdtt(int idtt) {
		this.idtt = idtt;
	}
	public String getTen_quan_huyen() {
		return ten_quan_huyen;
	}
	public void setTen_quan_huyen(String ten_quan_huyen) {
		this.ten_quan_huyen = ten_quan_huyen;
	}
	public Short getTrang_thai() {
		return trang_thai;
	}
	public void setTrang_thai(Short trang_thai) {
		this.trang_thai = trang_thai;
	}
	public TinhThanh getTinhThanh() {
		return tinhThanh;
	}
	public void setTinhThanh(TinhThanh tinhThanh) {
		this.tinhThanh = tinhThanh;
	}
    
}
