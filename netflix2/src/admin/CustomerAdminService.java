package admin;

import java.util.List;

import customer.CustomerBean;

/**
 * @date   :2016. 7. 7.
 * @author :HyunWoo Lee
 * @file   :CustomerAdminService.java
 * @story  :
*/

public interface CustomerAdminService {
	public void write(CustomerBean cusBean);
	public void delete(int cusSeq);
	public void modify(CustomerBean cusBean);
	public List<CustomerBean> list();
	public List<CustomerBean> findByWord(String word);
}
