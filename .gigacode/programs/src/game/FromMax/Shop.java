package FromMax;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.util.List;

@Component
public class Shop {

    @Value("#{productList.getProducts()}")          //Все показывает
    private List<ProductList.Product> allProduct;

    @Value("#{productList.getProducts().?[getFit()]}")    //True
    private List<ProductList.Product> productsTrue;

    @Value("#{productList.getProducts().?[getCount() < 10]  }")   //по количест фильтр
    private List<ProductList.Product> productLess;

    @Value("#{productList.getProducts()[2]}")   //по индексу
    private List<ProductList.Product> productsIndex;

    @Value("#{T(java.time.LocalTime).of(9,0)}")
    private LocalTime time;

    private static boolean test(ProductList.Product e) {
        return e.equals(true);
    }

    public void allShow(){
        System.out.println(allProduct);
        System.out.println(productsTrue);
        System.out.println(productLess);
        System.out.println(productsIndex);
        System.out.println(time);
    }
}
