package domain.product.dao.mysql;

import domain.product.Product;
import domain.product.dao.ProductDao;

public class ProductMysqlDao implements ProductDao {

	@Override
	public void insertProduct(Product product) {
		System.out.println("insert into Mysql DB productId ="+product.getProductId());
		
	}

	@Override
	public void updateProduct(Product product) {
		System.out.println("update into Mysql DB productId ="+product.getProductId());
		
	}

	@Override
	public void deleteProduct(Product product) {

		System.out.println("Delete from Mysql DB productId ="+product.getProductId());
		
	}

}
