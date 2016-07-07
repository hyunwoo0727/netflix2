package member;

/**
 * @date   :2016. 7. 7.
 * @author :HyunWoo Lee
 * @file   :FindPassword.java
 * @story  :
*/

public class FindPassword {
	private String word;
	private String[] findWay = {"email","SMS"};
	
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String[] getFindWay() {
		return findWay;
	}
	public void setFindWay(String[] findWay) {
		this.findWay = findWay;
	}
}
