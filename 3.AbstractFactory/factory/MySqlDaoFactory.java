package factory;

import domain.product.dao.ProductDao;
import domain.product.dao.mysql.ProductMysqlDao;
import domain.userinfo.dao.UserInfoDao;
import domain.userinfo.dao.mysql.UserInfoMysqlDao;

public class MySqlDaoFactory implements DaoFactory{

	@Override
	public UserInfoDao createUserInfoDao() {
		return new UserInfoMysqlDao();
	}

	@Override
	public ProductDao createProductDao() {
		return new ProductMysqlDao();
	}

}
