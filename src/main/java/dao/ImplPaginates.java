package dao;

import entity.Paginates;

public class ImplPaginates implements IPaginates {
	
	@Override
	public Paginates getInfoPaginates(int currenPage,int limit , int totalData) {
		Paginates paginate = new Paginates();		
		paginate.setLimit(limit);
		paginate.setTotalPage(SetInfoTotalPage(totalData , limit));
		paginate.setCurrenPage(CheckCurrenPage(currenPage, paginate.getTotalPage()));
		int start = FindStart(paginate.getCurrenPage(),limit);
		paginate.setStart(start);
		int end = FindEnd(paginate.getStart(),limit,totalData);
		paginate.setEnd(end);
		return paginate;
	}
	private int FindEnd(int start, int limit, int totalData) {
		// TODO Auto-generated method stub
		return (start + limit ) > totalData ? totalData : (start + limit) - 1;
	}
	private int FindStart(int currenPage, int limit) {
		
		return ((currenPage -1)* limit + 1);
	}
	private  int SetInfoTotalPage(int totalData , int limit) {
		int totalPage = 0;
		totalPage = totalData / limit ;// số trang bằng số sản phẩm chia cho số sản phẩm giới hạn 1 trang
		totalPage = totalPage * limit < totalData ? totalPage + 1 : totalPage ; // nếu như số sản phẩm mà chia cho giới hạn 1 trang ra số lẻ thì tổng số trang sẽ thêm 1 trang nữa để chứa sản phẩm 
		return totalPage;
	}
	public int CheckCurrenPage(int currenPage , int totalPage ) {
		if(currenPage < 1) { // nếu mà người dùng click dưới trang 1 thì tự động trả về trang số 1 
			return currenPage ;
		}
		if(currenPage > totalPage) { // nếu mà tổng số trang  là 5 mà người dùng muốn 10 trang thì nó tự động trả về trang totalPage  
			return totalPage;
		}
		return currenPage;
	}
}
