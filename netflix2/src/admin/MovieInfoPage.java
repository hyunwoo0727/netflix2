package admin;

import java.util.List;

import actor.ActorBean;
import movie.MovieBean;

/**
 * @date   :2016. 7. 7.
 * @author :HyunWoo Lee
 * @file   :MovieInfoPage.java
 * @story  :
*/

public class MovieInfoPage {
	private MovieBean mvBean;
	private List<ActorBean> actorList;
	private int movieCode;
	
	public MovieBean getMvBean() {
		return mvBean;
	}
	public void setMvBean(MovieBean mvBean) {
		this.mvBean = mvBean;
	}
	public List<ActorBean> getActorList() {
		return actorList;
	}
	public void setActorList(List<ActorBean> actorList) {
		this.actorList = actorList;
	}
	public int getMovieCode() {
		return movieCode;
	}
	public void setMovieCode(int movieCode) {
		this.movieCode = movieCode;
	}
}
