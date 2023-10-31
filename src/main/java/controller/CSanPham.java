package controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.ISanPham;
import entity.LoaiSanPham;
import entity.SanPham;

@Controller
@RequestMapping("/sanpham")
public class CSanPham {

	public String selectAll() {
		SanPham sp = new SanPham();
		
		
		return "";
	}
}
