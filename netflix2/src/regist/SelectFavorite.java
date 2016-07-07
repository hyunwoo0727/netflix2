package regist;

import java.util.List;
import movie.MovieBean;

public class SelectFavorite {
	private List<MovieBean> movieList;
	private String email;
	private int[] selectMovieNo;
	
	public SelectFavorite() {
		selectMovieNo = new int[3];
	}
	
	public List<MovieBean> getMovieList() {
		return movieList;
	}
	public void setMovieList(List<MovieBean> movieList) {
		this.movieList = movieList;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int[] getSelectMovieNo() {
		return selectMovieNo;
	}
	public void setSelectMovieNo(int[] selectMovieNo) {
		this.selectMovieNo = selectMovieNo;
	}
	
	
	
}
