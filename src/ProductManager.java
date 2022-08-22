import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductManager {
    public static List<Product> productList=new ArrayList<>();
    public static List<Product> productListByName=new ArrayList<>();
    public void addProduct(Product product){
        productList.add(product);
    }
    public void removeProduct(String id){
        for (int i = 0; i < productList.size(); i++) {
            if(productList.get(i).getId().equals(id)){
                productList.remove(i--);
            }
        }
    }
    public void changeProduct(String id,String name,int price) {
         for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId().equals(id) ) {
                productList.get(i).setName(name);
                productList.get(i).setPrice(price);
            }
         }
    }
    public List<Product> searchByName(String name){
            productListByName.clear();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getName().equals(name) ) {
                productListByName.add(productList.get(i));
            }
    }
        return productListByName;
    }
    public void sort(){
        Collections.sort(productList);
    }
    public void reverseSort(){
        Collections.sort(productList,new ProductComparator());
    }
}
