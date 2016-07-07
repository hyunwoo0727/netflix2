package customer;

import java.util.List;

/**
 * @date   :2016. 7. 7.
 * @author :HyunWoo Lee
 * @file   :CustomerPageService.java
 * @story  :
*/

public interface CustomerPageService {
	public List<CustomerBean> getCustomList();
	public List<CustomerBean> searchByWord(String searchWord);
}
