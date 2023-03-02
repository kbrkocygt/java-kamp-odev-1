public class Main {
    public static void main(String[] args) {
        Product product = new Product(3,"deneme"); //parametreli constructur
        product.set_name("Leptop");
        product.set_description("Leptop");
        product.setId(1);
        product.set_price(500);
        System.out.println(product.get_name());
        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        productManager.Add2(1, "kübra", "Açıklama");

    }
}