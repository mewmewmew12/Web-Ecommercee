package controller;

import java.util.HashMap;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.ICartDAO;
import dao.ImplCartDAO;
import entity.Cart;

@Controller
public class CCart {
	
	@RequestMapping(value = "addcart/{idsp}")
	public String addCart(HttpSession session , @PathVariable("idsp") int idsp) {
		HashMap<Integer, Cart> itemcart = (HashMap<Integer, Cart>)session.getAttribute("Myitemcart");
		if (itemcart == null) {
			itemcart = new HashMap<>();
		}
		ICartDAO cartdao = new ImplCartDAO();
		itemcart = cartdao.addCart(idsp, itemcart);
		session.setAttribute("Myitemcart", itemcart);
		return  "";
	}
}
