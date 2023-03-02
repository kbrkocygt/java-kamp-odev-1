public class Product {
    //ovarloading oldu
   public Product (int _id, String _name)
   {
       System.out.println("Yapıcı metod çalıştı");
   }  public Product ()
    {
        System.out.println("Yapıcı metod çalıştı");
    }
   private int _id;
    private String _name;
    private String _description;
    private double _price;
    private int _stock;

    public int getId()
    {
        return _id;
    }
    public  void setId(int id)
    {
       _id=id;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_description() {
        return _description;
    }

    public void set_description(String _description) {
        this._description = _description;
    }

    public double get_price() {
        return _price;
    }

    public void set_price(double _price) {
        this._price = _price;
    }

    public int get_stock() {
        return _stock;
    }

    public void set_stock(int _stock) {
        this._stock = _stock;
    }
}
