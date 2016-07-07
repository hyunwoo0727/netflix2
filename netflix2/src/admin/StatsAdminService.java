package admin;

import java.util.List;

/**
 * @date   :2016. 7. 7.
 * @author :HyunWoo Lee
 * @file   :StatsAdminService.java
 * @story  :
*/

public interface StatsAdminService {
	public List<StatsBean> list();
	public List<StatsBean> sortList(String keyword);
}
