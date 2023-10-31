package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import dao.ILoaiSanPhamDAO;
import dao.ISanPham;
import dao.ImplLoaiSanPham;
import dao.ImplSanPhamDAO;
import entity.LoaiSanPham;
import entity.SanPham;

@Controller
@RequestMapping("")
public class CTrangChu {
	
	@RequestMapping(value = {"/","/trang-chu"})
	public String index(Model m) {
//		SessionFactory sf = new Configuration().configure().buildSessionFactory();
//		Session ss = sf.openSession();	
//		LoaiSanPham lsp = new LoaiSanPham();
//		ss.beginTransaction();
//		List<LoaiSanPham> lstlsp = ss.createQuery("FROM LoaiSanPham").list();		
//		m.addAttribute("lstlsp", lstlsp);
		LoaiSanPham lsp = new LoaiSanPham();
		ILoaiSanPhamDAO dao = new ImplLoaiSanPham();
		List<LoaiSanPham> lstlsp = dao.selecALL();
		m.addAttribute("lstlsp", lstlsp);
		ISanPham daosp = new ImplSanPhamDAO();
		SanPham sp = new SanPham();
		List<SanPham> lstsp = daosp.selectALL();
		List<SanPham> lst = new ArrayList<>();
		vl1:for (int i = 0; i < 12; i++) {
			Random rd = new Random();
			SanPham sp1 = lstsp.get(rd.nextInt(lstsp.size()));
			if (lst.size()==5) {
				break vl1;
			}
			if (!lst.equals(sp1)) {
				lst.add(sp1);
			}
			
		}
		
		m.addAttribute("lstsp", lst);
		return "index" ;
	}
	@RequestMapping(value = "/san-pham/{id}")
	public String loaisanpham(@PathVariable("id") int idlsp,Model m) {
		ImplLoaiSanPham dao = new ImplLoaiSanPham();
		LoaiSanPham lsp = dao.selectById(idlsp);
		m.addAttribute("lsp", lsp);
		ISanPham daosp = new ImplSanPhamDAO();
		SanPham spDm = new SanPham();
		List<SanPham> lstspDm = daosp.getSanPhamDm(idlsp);
		m.addAttribute("lstspDm", lstspDm);
		return "danhmuc";
	}
	@RequestMapping(value = "chi-tiet-san-pham/{idsp}")
	public String productdetails(@PathVariable(value="idsp", required = true) int idsp, Model m ) {
		ISanPham daosp = new ImplSanPhamDAO();
		SanPham sp = daosp.selectByid(idsp);
		m.addAttribute("sp", sp);
		ISanPham daodm = new ImplSanPhamDAO();
		int idCategory = sp.getLoaiSanPham().getId();
		List<SanPham> lst = daodm.getSanPhamDm(idCategory);
		m.addAttribute("lst", lst);
		return "product";
	}

}
