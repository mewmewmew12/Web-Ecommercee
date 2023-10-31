package utils;

import java.util.List;

import dao.ILoaiSanPhamDAO;
import dao.ISanPham;
import dao.ImplLoaiSanPham;
import dao.ImplSanPhamDAO;
import entity.LoaiSanPham;
import entity.SanPham;

public class HomeClass {
	public static void main(String[] args) {
//		ILoaiSanPhamDAO dao = new ImplLoaiSanPham();
//		List<LoaiSanPham> lst = dao.selecALL();
//		for (LoaiSanPham lsp : lst) {
//			System.out.println(lsp.getId() + lsp.getId
//					());
//		}
		ISanPham daosp = new ImplSanPhamDAO();
		List<SanPham> lstsp = daosp.getSanPhamDm(4);
		for (SanPham sp : lstsp) {
			System.out.println("idsp :" + sp.getId() + "tên sp :" + sp.getTenSp() + "giá bán :" + sp.getGiaBan());
		}
	}
}
