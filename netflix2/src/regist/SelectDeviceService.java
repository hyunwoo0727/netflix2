package regist;

import member.MemberBean;

public interface SelectDeviceService {
	public void selectDevice(String device);
	public int setDeviceCnt(String memberGrade);
	public boolean checkSelectDivCnt();
	public void moveNext(MemberBean memBean);
}
