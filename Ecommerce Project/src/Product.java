 public class Product
 {
    private String name;
    private String color;
    private String size;
    private double weight;
    private String addFeatures;
    private double price;
     //builder pattern to create a product that has many attributes
     // Steven Akram
    private Product(ProductBuilder productBuilder)
    {
        this.name = productBuilder.name;
        this.color = productBuilder.color;
        this.size = productBuilder.size;
        this.weight = productBuilder.weight;
        this.addFeatures = productBuilder.addFeatures;
        this.price = productBuilder.price;
    }

     public double getPrice() {
        return price;
     }

     public static class ProductBuilder
    {
        private String name;
        private String color;
        private String size;
        private double weight;
        private String addFeatures;
        private double price;

        public ProductBuilder(String name)
        {
            this.name = name;
        }
        public ProductBuilder setColor(String color)
        {
            this.color = color;
            return this;
        }
        public ProductBuilder setSize(String size)
        {
            this.size = size;
            return this;
        }
        public ProductBuilder setWeight(double weight)
        {
            this.weight = weight;
            return this;
        }
        public ProductBuilder setFeatures(String addFeatures)
        {
            this.addFeatures = addFeatures;
            return this;
        }
        public ProductBuilder setPrice(double price)
        {
            this.price = price;
            return this;
        }

        public Product build()
        {
            return new Product(this);
        }
    }
     @Override
     public String toString(){
         return "Product Details: " +
                 "\n Name: " + name +
                 "\n Color: " + color +
                 "\n Size: " + size +
                 "\n Weight in grams: " + weight +
                 "\n Additional Features: " + addFeatures +
                 "\n Price: " + price + " EGP";
     }
 }