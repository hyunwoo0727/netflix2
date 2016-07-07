package member;

/**
 * @date   :2016. 7. 7.
 * @author :HyunWoo Lee
 * @file   :AccountPage.java
 * @story  :
*/

public class AccountPage {
	private String email,password,phone,cardNum,memberGrade,profileImg,expireDate;
	private boolean isReceiveEmail;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCardNum() {
		return cardNum;
	}

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

	public String getMemberGrade() {
		return memberGrade;
	}

	public void setMemberGrade(String memberGrade) {
		this.memberGrade = memberGrade;
	}

	public String getProfileImg() {
		return profileImg;
	}

	public void setProfileImg(String profileImg) {
		this.profileImg = profileImg;
	}

	public String getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}

	public boolean isReceiveEmail() {
		return isReceiveEmail;
	}

	public void setReceiveEmail(boolean isReceiveEmail) {
		this.isReceiveEmail = isReceiveEmail;
	}
}
