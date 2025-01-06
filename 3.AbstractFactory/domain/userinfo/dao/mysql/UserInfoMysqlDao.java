package domain.userinfo.dao.mysql;

import domain.userinfo.UserInfo;
import domain.userinfo.dao.UserInfoDao;

public class UserInfoMysqlDao implements UserInfoDao {

	@Override
	public void insertUserInfo(UserInfo userInfo) {

		System.out.println("insert into Mysql DB UserInfoId ="+userInfo.getUserId());
		
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {

		System.out.println("update into Mysql DB UserInfoId ="+userInfo.getUserId());
		
	}

	@Override
	public void deleteUserInfo(UserInfo userInfo) {


		System.out.println("delete from Mysql DB UserInfoId ="+userInfo.getUserId());
	}


}
