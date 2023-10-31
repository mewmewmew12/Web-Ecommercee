package controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import dao.ILoaiSanPhamDAO;
import dao.ImplLoaiSanPham;
import entity.LoaiSanPham;

@Controller
@RequestMapping("/loaisanpham")
public class CLoaiSanPham {

	@RequestMapping(value = { "", "/" })
	public String index(Model m) {
		LoaiSanPham lsp = new LoaiSanPham();
		ILoaiSanPhamDAO dao = new ImplLoaiSanPham();
		List<LoaiSanPham> lstlsp = dao.selecALL();
		m.addAttribute("lstlsp", lstlsp);
		return "loaisanpham/index";
	}

	@RequestMapping(value = "/initInsert", method = RequestMethod.GET)
	public String initInsert(Model m) {
		LoaiSanPham lsp = new LoaiSanPham();
		m.addAttribute("lsp", lsp);
		return "loaisanpham/insert";
	}

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public String insert(@ModelAttribute("lsp") LoaiSanPham lsp, @RequestParam("imageName") MultipartFile fileImg,
			HttpServletRequest request, Model m) {
		// xử lsy ảnh
		String path = request.getServletContext().getRealPath("public/images");
		File f = new File(path);
		File destination = new File(f.getAbsoluteFile() + "/" + fileImg.getOriginalFilename());
		if (!destination.exists()) {
			try {
				Files.write(destination.toPath(), fileImg.getBytes(), StandardOpenOption.CREATE);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		lsp.setImgName(fileImg.getOriginalFilename());
		ILoaiSanPhamDAO dao = new ImplLoaiSanPham();
		boolean isOk = dao.insert(lsp);
		if (isOk) {
			m.addAttribute("msg", "Thêm danh mục thành công");
		} else {
			m.addAttribute("msgErr", "Thêm danh mục thất bại");
		}
		m.addAttribute("lsp", lsp);
		return "loaisanpham/insert";
	}

	@RequestMapping(value = "/initUpdate", method = RequestMethod.GET)
	public String initUpdate(@RequestParam(name = "idlsp") int idlsp, Model m) {
		ILoaiSanPhamDAO dao = new ImplLoaiSanPham();
		LoaiSanPham lsp = dao.selectById(idlsp);
		m.addAttribute("lsp", lsp);
		return "loaisanpham/update";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(@ModelAttribute("lsp") LoaiSanPham lsp, @RequestParam("imageName") MultipartFile fileImg,
			HttpServletRequest request, Model m) {
		// xử lý ảnh

		String path = request.getServletContext().getRealPath("public/images");
		File f = new File(path);
		File destination = new File(f.getAbsoluteFile() + "/" + fileImg.getOriginalFilename());
		if (!destination.exists()) {
			try {
				Files.write(destination.toPath(), fileImg.getBytes(), StandardOpenOption.CREATE);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		lsp.setImgName(fileImg.getOriginalFilename());

		ILoaiSanPhamDAO dao = new ImplLoaiSanPham();
		boolean isOk = dao.update(lsp);
		if (isOk) {
			m.addAttribute("msg", "Cập nhật danh mục thành công");
		} else {
			m.addAttribute("msgErr", "Cập nhật danh mục thất bại");
		}
		m.addAttribute("lsp", lsp);
		return "loaisanpham/update";
	}
//	    try {
//	        // Xử lý ảnh
//	        ILoaiSanPhamDAO dao = new ImplLoaiSanPham();
//	        boolean isOk = dao.update(lsp);
//
//	        if (isOk) {
//	            m.addAttribute("msg", "Cập nhật danh mục thành công");
//	        } else {
//	            m.addAttribute("msgErr", "Cập nhật danh mục thất bại");
//	        }
//
//	        String path = request.getServletContext().getRealPath("public/images");
//	        File f = new File(path);
//	        File destination = new File(f.getAbsoluteFile() + "/" + fileImg.getOriginalFilename());
//	        if (!destination.exists()) {
//	            try {
//	                Files.write(destination.toPath(), fileImg.getBytes(), StandardOpenOption.CREATE);
//	                lsp.setImgName(fileImg.getOriginalFilename());
//	                m.addAttribute("lsp", lsp);
//	                return "loaisanpham/update";
//	            } catch (IOException e) {
//	                // Ghi log và xử lý ngoại lệ
//	                e.printStackTrace();
//	                m.addAttribute("msgErr", "Lỗi khi lưu ảnh");
//	            }
//	        } else {
//	            m.addAttribute("msgErr", "Tệp ảnh đã tồn tại");
//	        }
//	    } catch (Exception e) {
//	        // Ghi log và xử lý ngoại lệ
//	        e.printStackTrace();
//	        m.addAttribute("msgErr", "Có lỗi xảy ra");
//	    }
//
//	    return "loaisanpham/update";
//	}

	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public String detail(@RequestParam(name = "idlsp") int idlsp, Model m) {
		ILoaiSanPhamDAO dao = new ImplLoaiSanPham();
		LoaiSanPham lsp = dao.selectById(idlsp);
		m.addAttribute("lsp", lsp);
		return "loaisanpham/detail";
	}

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String search(@RequestParam(name = "search") String search, Model m) {
		ILoaiSanPhamDAO dao = new ImplLoaiSanPham();
		List<LoaiSanPham> lsp = dao.search(search);
		m.addAttribute("search", search);
		return "loaisanpham/index";
	}

	@RequestMapping(value = "delete", method = RequestMethod.GET)
	public String delete(@RequestParam(name = "idlsp") int idlsp, Model m) {
		ILoaiSanPhamDAO dao = new ImplLoaiSanPham();
		boolean isOk = dao.delete(idlsp);
		if (isOk) {
			m.addAttribute("msg", "Xóa thành công ");
		} else {
			m.addAttribute("msgErr", "Xóa thất bại  ");
		}
		// load lại danh mục
		List<LoaiSanPham> lstlsp = loadData();
		m.addAttribute("lstlsp", lstlsp);
		return "loaisanpham/index";
	}

	private List<LoaiSanPham> loadData() {
		ILoaiSanPhamDAO dao = new ImplLoaiSanPham();
		List<LoaiSanPham> lstlsp = dao.selecALL();
		return dao.selecALL();
	}

}
