package domain.product.dao.oracle;

import domain.product.Product;
import domain.product.dao.ProductDao;

public class ProductOracleDao implements ProductDao {

	@Override
	public void insertProduct(Product product) {
		System.out.println("Oracle DB productId ="+product.getProductId());
		
	}

	@Override
	public void updateProduct(Product product) {

		System.out.println("update into Oracle DB productId ="+product.getProductId());
		
	}

	@Override
	public void deleteProduct(Product product) {


		System.out.println("Delete from Oracle DB productId ="+product.getProductId());
		
	}

}
