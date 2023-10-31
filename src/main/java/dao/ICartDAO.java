package dao;

import java.util.HashMap;

import entity.Cart;

public interface ICartDAO {
	public HashMap<Integer, Cart> addCart(int idsp , HashMap<Integer, Cart> cart);
	public HashMap<Integer, Cart> updateCart(int idsp ,int quantity, HashMap<Integer, Cart> cart);
	public HashMap<Integer, Cart> deleteCart(int idsp , HashMap<Integer, Cart> cart);
	public int totalQuantity(HashMap<Integer,Cart> cart) ;
	public double  totalPrince(HashMap<Integer,Cart> cart) ;
}
