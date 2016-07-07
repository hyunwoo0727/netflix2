package regist;


public interface SelectFavoriteService {
	public void selectFavorite(int serialNo);
	public boolean checkSelectCnt(); // 3개 선택했는지 확인 
	public void moveNext(String email,int[] serialNo);
}
