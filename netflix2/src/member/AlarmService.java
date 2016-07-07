package member;

import java.util.List;

/**
 * @date   :2016. 7. 7.
 * @author :HyunWoo Lee
 * @file   :AlarmService.java
 * @story  :
*/

public interface AlarmService {
	public List<AlarmPage> list(String email);
}
