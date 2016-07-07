package admin;

import java.util.List;

import actor.ActorBean;

/**
 * @date   :2016. 7. 7.
 * @author :HyunWoo Lee
 * @file   :ActorAdminService.java
 * @story  :
*/

public interface ActorAdminService {
	public void addActor(ActorBean actBean);
	public void deleteActor(int actNo);
	public void update(ActorBean actBean);
	public List<ActorBean> findByName(String name);
	public List<ActorBean> list();
}
