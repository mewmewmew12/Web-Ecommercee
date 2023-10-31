package dao;

import java.util.List;


import entity.LoaiSanPham;

public interface ILoaiSanPhamDAO {
	public List<LoaiSanPham> selecALL();
	public LoaiSanPham selectById(int idlsp);
	public boolean insert(LoaiSanPham lsp);
	public boolean update(LoaiSanPham lsp);
	public boolean delete(int idlsp);
	public  List<LoaiSanPham> search(String title);
	
}
