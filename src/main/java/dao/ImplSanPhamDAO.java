package dao;

import java.util.List;

import org.hibernate.Session;

import entity.SanPham;
import utils.HibernateHelper;

public class ImplSanPhamDAO implements ISanPham {
	private Session sf ;
	public ImplSanPhamDAO() {
		sf = HibernateHelper.getSessionFactory().openSession();
				
	}
	@Override
	public List<SanPham> selectALL() {
		// TODO Auto-generated method stub
		sf.beginTransaction();
		List<SanPham> lstsp = sf.createQuery("FROM SanPham").list();
		sf.close();
		return lstsp;
	}

	@Override
	public boolean insert(SanPham sp) {
		// TODO Auto-generated method stub
		sf.beginTransaction();
		sf.save(sp);
		sf.getTransaction().commit();
		sf.close();
		if (sp.getId()>0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean update(SanPham sp) {
		// TODO Auto-generated method stub
		sf.beginTransaction();
		try {
			sf.update(sp);
			sf.getTransaction().commit();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		} finally {
			sf.close();
		}
		return false;
	}

	@Override
	public boolean delete(int idsp) {
		// TODO Auto-generated method stub
		sf.beginTransaction();
		try {
			SanPham sp = sf.get(SanPham.class,idsp);
			sf.delete(idsp);
			sf.getTransaction().commit();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		} finally {
			sf.close();
		}
		return false;
	}

	@Override
	public List<SanPham> selectByName(String name) {
		// TODO Auto-generated method stub
		sf.beginTransaction();
		List<SanPham> lstsp = sf.createQuery("FROM SanPham WHERE tensp LIKE :name").setParameter("name", "%" + name + "%").list();
		sf.close();
		return lstsp;
	}

	@Override
	public SanPham selectByid(int idsp) {
		// TODO Auto-generated method stub
		sf.beginTransaction();
		SanPham sp =  (SanPham) sf.createQuery("FROM SanPham WHERE id =  :masp").setParameter("masp", idsp).getSingleResult();
		sf.close();
		
		return sp;
	}
	@Override
	public List<SanPham> selectRanDom() {
		// TODO Auto-generated method stub
		sf.beginTransaction();
		List<SanPham> lst = sf.createQuery("FROM SanPham ORDER BY RAND() FETCH FIRST 6 ROWS ONLY").list();
		sf.close();
		return lst;
	}
	@Override
	public List<SanPham> getSanPhamDm(int idlsp) {
		sf.beginTransaction();
		try {
			List<SanPham> lstsp = sf.createQuery("FROM SanPham WHERE loaiSanPham.id = :maDm ").setParameter("maDm", idlsp).list();
			sf.getTransaction().commit();
			return lstsp;
		} catch (Exception e) {
			sf.getTransaction().rollback();
		} finally {
			sf.close();
		}
		return null;
	}
	

}
