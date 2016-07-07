package regist;

import member.MemberBean;

public interface JoinMembrService {
	public boolean checkExistEmail(String email);
	public boolean validatePassword(MemberBean memBean);
	public boolean validateEmail(String email);
	public void checkReceiveEmail(boolean isChecked);
	public void registAccount(MemberBean memBean);
}
