package web;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import domain.product.Product;
import domain.product.dao.ProductDao;
import domain.userinfo.UserInfo;
import domain.userinfo.dao.UserInfoDao;
import factory.DaoFactory;
import factory.MySqlDaoFactory;
import factory.OracleDaoFactory;

public class WebClient {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("db.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String dbType = prop.getProperty("DBTYPE");
		UserInfo userInfo = new UserInfo();
		userInfo.setUserId("qowjdduswkd");
		userInfo.setPassword("12345");
		userInfo.setUsername("배정연");
		
		Product product = new Product();
		product.setProductId("0011AA");
		product.setProductName("SmartTv");

		DaoFactory daoFactory = null;
		if(dbType.equals("MYSQL")) {
			daoFactory = new MySqlDaoFactory();
		}else if(dbType.equals("ORACLE")) {
			daoFactory = new OracleDaoFactory();
		}else {
			System.out.println("error");
		}
		
		UserInfoDao userInfoDao = daoFactory.createUserInfoDao();
		System.out.println("====UserInfo Transaction=====");
		userInfoDao.insertUserInfo(userInfo);
		userInfoDao.updateUserInfo(userInfo);
		userInfoDao.deleteUserInfo(userInfo);

		System.out.println("====Product Transaction=====");
		ProductDao productDao = daoFactory.createProductDao();
		productDao.insertProduct(product);
		productDao.updateProduct(product);
		productDao.deleteProduct(product);
	}

}
