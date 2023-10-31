package dao;

import java.util.List;

import org.hibernate.Session;

import entity.LoaiSanPham;
import utils.HibernateHelper;

public class ImplLoaiSanPham implements ILoaiSanPhamDAO {
	private Session ss;
	public ImplLoaiSanPham() {
		ss = HibernateHelper.getSessionFactory().openSession();
	}

	@Override
	public List<LoaiSanPham> selecALL() {
		// TODO Auto-generated method stub
		ss.beginTransaction();
		List<LoaiSanPham> lst = ss.createQuery("FROM LoaiSanPham").list();
		ss.close();
		return lst;
	}

	@Override
	public LoaiSanPham selectById(int idlsp) {
		// TODO Auto-generated method stub
		
		ss.beginTransaction();
		
		LoaiSanPham lsp = (LoaiSanPham) ss.createQuery("FROM LoaiSanPham WHERE id = : malsp").setParameter("malsp", idlsp).getSingleResult();
		ss.getTransaction().commit();
		ss.close();
		return lsp;
	}

	@Override
	public boolean insert(LoaiSanPham lsp) {
		// TODO Auto-generated method stub
		ss.beginTransaction();
		
			ss.save(lsp);
			ss.getTransaction().commit();
			ss.close();
			if (lsp.getId() > 0) {
				return true;
			}
		
		
			
//			ss.beginTransaction().rollback();
		
			
		
		return false;
	}

	@Override
	public boolean update(LoaiSanPham lsp) {
		// TODO Auto-generated method stub
		ss.beginTransaction();
		try {
			ss.update(lsp);
			ss.getTransaction().commit();
			return true ;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
//			ss.beginTransaction().rollback();
		} finally {
			ss.close();
		}
		return false;
	}

	@Override
	public boolean delete(int idlsp) {
		// TODO Auto-generated method stub
		ss.beginTransaction();
		try {
			LoaiSanPham lsp = ss.get(LoaiSanPham.class,idlsp);
			ss.delete(lsp);
			ss.getTransaction().commit();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			ss.beginTransaction().rollback();
		} finally {
			ss.close();
		}
		return false;
	}

	@Override
	public List<LoaiSanPham> search(String title) {
		// TODO Auto-generated method stub
		ss.beginTransaction();
		List<LoaiSanPham> lstlsp =  ss.createQuery("FROM LoaiSanPham where tenLoai LIKE : sreach").setParameter("search", "%" + title + "%").list();
		ss.close();
		return lstlsp;
	}

}
