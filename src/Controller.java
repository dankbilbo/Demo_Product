import java.util.ArrayList;
import java.util.List;

public class Controller {
    List<Product> products;
    public Controller(){
        products = new ArrayList<>();
        Product product1 = new Product();
        Category category = new Category();
        category.setName("demo cate");
        product1.setId(1);
        product1.setCategory(category);
        products.add(product1);
    }
    public void showCategory(){
        for (Product product : products){
            if (product.getCategory().getName().equals("demo cate")) {
                System.out.println("chac la no nhu the nay day");
            }
        }
    }
}
