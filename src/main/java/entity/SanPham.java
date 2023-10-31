package entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tbl_SANPHAM")
public class SanPham {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "id")
	   private int  id ;
//		@Column(name = "idlsp")
//		private int idlsp;
//		@NotBlank(message = "Tên sản phẩm bắt buộc ")
//		@Size(min = 5 , max = 50 , message = "Tên sản phẩm phải từ 5-50 ký tự")
		@Column(name = "Ten_sp")
	   private String tenSp ;
//		@NotNull(message = "Không được để trống")
		@Column(name = "gia_ban")
	   private float giaBan ;
		@Column(name = "gia_KM")
	   private float giaKM ;
		@Column(name = "meta_keyword")
	   private String  metaKeyword ;
		@Column(name = "meta_description")
	   private String  metaDescription ;
		@Column(name = "mo_ta")
	   private String moTa ;
		@Column(name ="imgnamesp")
	   private String imgNameSp;
		
	   @ManyToOne
	   @JoinColumn(name = "idlsp" ,referencedColumnName = "id")
	   public LoaiSanPham loaiSanPham ;
	   public SanPham() {
		// TODO Auto-generated constructor stub
	}
	
	

	public SanPham(int id, String tenSp, float giaBan, float giaKM, String metaKeyword,
			String metaDescription, String moTa, String imgNameSp, LoaiSanPham loaiSanPham) {
		super();
		this.id = id;
		this.tenSp = tenSp;
		this.giaBan = giaBan;
		this.giaKM = giaKM;
		this.metaKeyword = metaKeyword;
		this.metaDescription = metaDescription;
		this.moTa = moTa;
		this.imgNameSp = imgNameSp;
		this.loaiSanPham = loaiSanPham;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTenSp() {
		return tenSp;
	}
	public void setTenSp(String tenSp) {
		this.tenSp = tenSp;
	}
	public float getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(float giaBan) {
		this.giaBan = giaBan;
	}
	public float getGiaKM() {
		return giaKM;
	}
	public void setGiaKM(float giaKM) {
		this.giaKM = giaKM;
	}
	public String getMetaKeyword() {
		return metaKeyword;
	}
	public void setMetaKeyword(String metaKeyword) {
		this.metaKeyword = metaKeyword;
	}
	public String getMetaDescription() {
		return metaDescription;
	}
	public void setMetaDescription(String metaDescription) {
		this.metaDescription = metaDescription;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public LoaiSanPham getLoaiSanPham() {
		return loaiSanPham;
	}
	public void setLoaiSanPham(LoaiSanPham loaiSanPham) {
		this.loaiSanPham = loaiSanPham;
	}

	public String getImgNameSp() {
		return imgNameSp;
	}

	public void setImgNameSp(String imgNameSp) {
		this.imgNameSp = imgNameSp;
	}		
	
	   
	   
	   
}
