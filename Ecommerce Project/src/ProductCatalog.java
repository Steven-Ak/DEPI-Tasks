import java.util.ArrayList;
import java.util.List;
public class ProductCatalog {
// Singleton to make it public and the same for all classes this is a database
// Steven Akram
    private static volatile ProductCatalog catalog;
    private List<Product> productList;

    private ProductCatalog()
    {
        productList = new ArrayList<>();
    }

    public static ProductCatalog getCatalog()
    {
        ProductCatalog result = catalog;
        if (result == null)
        {
            synchronized (ProductCatalog.class)
            {
                result = catalog;
                if (result == null)
                {
                    catalog = result = new ProductCatalog();
                }
            }
        }
        return result;
    }
    public void addProduct(Product product)
    {
        productList.add(product);
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void printCatalog() {
        for (Product product : productList) {
            System.out.println(product);
            System.out.println("----------------------------------");
        }
    }
}