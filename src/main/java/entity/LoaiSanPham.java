package entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "TBL_LOAI_SAN_PHAM")

public class LoaiSanPham {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int  id ;
//	@NotBlank(message = "Name is mandatory")
//	@Size(min = 5 , max = 50 , message = "Tên sản phẩm phải từ 5 - 50 ký tự" )
	@Column(name = "ten_loai")
    private String tenLoai ;
	@Column(name = "trang_thai")
    private Short trangThai;
	@Column(name = "meta_keyword")
    private String metaKeyword ;
	@Column(name = "meta_description")
    private String metaDescription ;
	@Column(name = "imgname")
	private String imgName;
    
	@OneToMany(mappedBy = "loaiSanPham",fetch = FetchType.EAGER)
	public List<SanPham> lstSanPham ;
    public LoaiSanPham() {
		// TODO Auto-generated constructor stub
	}

			

	public LoaiSanPham(int id, String tenLoai, Short trangThai, String metaKeyword, String metaDescription,
			String imgName, List<SanPham> lstSanPham) {
		super();
		this.id = id;
		this.tenLoai = tenLoai;
		this.trangThai = trangThai;
		this.metaKeyword = metaKeyword;
		this.metaDescription = metaDescription;
		this.imgName = imgName;
		this.lstSanPham = lstSanPham;
	}



	public int getId() {
		return id;
	}







	public void setId(int id) {
		this.id = id;
	}







	public String getTenLoai() {
		return tenLoai;
	}







	public void setTenLoai(String tenLoai) {
		this.tenLoai = tenLoai;
	}







	public Short getTrangThai() {
		return trangThai;
	}







	public void setTrangThai(Short trangThai) {
		this.trangThai = trangThai;
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







	public List<SanPham> getLstSanPham() {
		return lstSanPham;
	}







	public void setLstSanPham(List<SanPham> lstSanPham) {
		this.lstSanPham = lstSanPham;
	}



	public String getImgName() {
		return imgName;
	}



	public void setImgName(String imgName) {
		this.imgName = imgName;
	}


	
  }
