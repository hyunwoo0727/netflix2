package admin;

import java.util.List;

import actor.ActorBean;

/**
 * @date   :2016. 7. 7.
 * @author :HyunWoo Lee
 * @file   :ActorAdminPage.java
 * @story  :
*/

public class ActorAdminPage {
	private String name;
	private List<ActorBean> actList;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<ActorBean> getActList() {
		return actList;
	}
	public void setActList(List<ActorBean> actList) {
		this.actList = actList;
	}
}
