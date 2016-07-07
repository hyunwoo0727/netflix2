package admin;

import java.util.List;

import actor.ActorBean;
import movie.MovieBean;

/**
 * @date   :2016. 7. 7.
 * @author :HyunWoo Lee
 * @file   :MovieInfoService.java
 * @story  :
*/

public interface MovieInfoService {
	public void insert(MovieBean mvBean,String imgNames);
	public List<ActorBean> list();
	public int findMovieCode(int serialNo);
	public void update(MovieBean mvBean);
}
