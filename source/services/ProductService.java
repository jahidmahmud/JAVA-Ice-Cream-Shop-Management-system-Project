package services;
import repositories.*;
public class ProductService{
    ProductRepositories productRepositories=new ProductRepositories();
    public boolean addNewProduct(String PRODUCT_ID,String PRODUCT_NAME,String PRODUCT_QUANTITY,String PRODUCT_PRICE,String EXP_DATE){
        return productRepositories.insertProductIntoDB(PRODUCT_ID,PRODUCT_NAME,PRODUCT_QUANTITY,PRODUCT_PRICE,EXP_DATE);
    }

    public String[][] productDetails(){
		return productRepositories.productDetailsFromDB();
	}

}