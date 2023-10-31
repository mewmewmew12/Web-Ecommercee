package entity;

import java.util.List;

import javax.persistence.FetchType;
import javax.persistence.OneToMany;

public class PhuongXa {
	private int id ;
    private int idqh ;
   
    private String ten_quan_huyen ;
    private Short trang_thai ;
    
    
    @OneToMany(mappedBy = "phuongXa",fetch = FetchType.EAGER)
    public List<KhachHang> khachHang ;
}
