package db4;

public class EmpBiz {

	public void addressList() {
		EmpDao dao = new EmpDao();
		EmpView view = new EmpView();
		
		view.addressList(dao.addressList());
	}

	public void addressInsert(EmpEntity entity) {
		EmpDao dao = new EmpDao();
		EmpView view = new EmpView();
		
		view.addressInsert(dao.addressInsert(entity));
	}

	public boolean addressSearch(String name) {
		EmpDao dao = new EmpDao();
		EmpView view = new EmpView();
		EmpEntity entity = dao.addressSearch(name);
		
		view.addressSearch(entity);
		
		return entity != null ? true : false;
	}

	public void addressUpdate(String name, String phone, String addr) {
		EmpDao dao = new EmpDao();
		EmpView view = new EmpView();
		
		view.addressUpdate(dao.addressUpdate(name, phone, addr));
	}

	public void addressDelete(String name) {
		EmpDao dao = new EmpDao();
		EmpView view = new EmpView();
		
		view.addressDelete(dao.addressDelete(name));
	}

}
