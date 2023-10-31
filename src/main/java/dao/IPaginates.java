package dao;

import entity.Paginates;

public interface IPaginates {
	public Paginates getInfoPaginates(int currenPage,int limit , int totalData);
}
