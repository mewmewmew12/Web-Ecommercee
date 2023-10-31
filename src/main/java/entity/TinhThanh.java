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

@Entity
@Table(name = "tbl_TINH_THANH")
public class TinhThanh {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="id")
	private int id ;
	@Column(name ="trang_thai")
    private Short trang_thai ;
	@Column(name ="ten_tinh_thanh")
    private String ten_tinh_thanh ;
	
	@OneToMany(mappedBy = "tinhThanh" ,fetch = FetchType.EAGER)
	public List<QuanHuyen> quanHuyen;
}
