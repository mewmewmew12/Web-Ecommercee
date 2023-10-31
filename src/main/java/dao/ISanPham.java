package dao;

import java.util.List;


import entity.SanPham;

public interface ISanPham {
	public List<SanPham> selectALL();
	public List<SanPham> selectRanDom();
	public List<SanPham> getSanPhamDm(int idlsp);
	public boolean insert(SanPham sp);
	public boolean update(SanPham sp);
	public boolean delete(int idsp);
	public List<SanPham> selectByName(String name);
	public SanPham selectByid(int idsp);

}
