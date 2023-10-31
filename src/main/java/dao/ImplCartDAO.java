package dao;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;



import entity.Cart;
import entity.SanPham;


public class ImplCartDAO implements ICartDAO {
	

	@Override
	public HashMap<Integer, Cart> addCart(int idsp, HashMap<Integer, Cart> cart) {
		Cart itemcart = new Cart();
		ISanPham dao = new ImplSanPhamDAO();
		SanPham sanpham = dao.selectByid(idsp);
		if(sanpham != null) {
			itemcart.setSanPham(sanpham);
			itemcart.setQuantity(1);
			itemcart.setTotalPrice(sanpham.getGiaBan());
		}
		cart.put(idsp, itemcart) ;
		return cart;
	}
	@Override
	public HashMap<Integer, Cart> updateCart(int idsp,int quantity, HashMap<Integer, Cart> cart) {
		Cart itemcart = new Cart();
		if (cart == null) {
			return cart ;
		}
		if (cart.containsKey(idsp)) { // hàm containsKey kiểm tra xem đã có idsp nào 
			itemcart = cart.get(idsp);
			itemcart.setQuantity(quantity);
			itemcart.setTotalPrice(quantity * itemcart.getSanPham().getGiaBan());
		}
		cart.put(idsp, itemcart); // hàm put sẽ ghi idsp mới đè lên idsp cũ
		return cart ;
	}
	@Override
	public HashMap<Integer, Cart> deleteCart(int idsp, HashMap<Integer, Cart> cart) {
		Cart itemcart = new Cart();
		if (cart == null) {
			return cart ;
		}
		if (cart.containsKey(idsp)) {
			cart.remove(idsp);
		}
		return cart;
	}
	@Override
	public int totalQuantity(HashMap<Integer, Cart> cart) {
		int totalQuantity = 0 ;
		for (Map.Entry<Integer, Cart> itemcart : cart.entrySet()) { // Map.Entry<Integer, Cart>  đại diện cho 1 sp nào trong HashMap
			totalQuantity += itemcart.getValue().getQuantity();
		}
		return totalQuantity;
	}
	@Override
	public double totalPrince(HashMap<Integer, Cart> cart) {
		int totalPrince = 0 ;
		for (Map.Entry<Integer, Cart> itemcart : cart.entrySet()) { // Map.Entry<Integer, Cart>  đại diện cho 1 sp nào trong HashMap
			totalPrince += itemcart.getValue().getTotalPrice();
		}
		return totalPrince;
	}

}
