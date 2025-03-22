/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaonline;

/**
 * Class Product for online Boutique
 * @author pablonoguera
 */
public class Product {

  
    private double discount;
    private double price;
    private double tax;
    
    private int stock;

    private String category;
    private String idProduct;
    private String nameProduct;

    public Product() {
    }
    
    

    public Product(double discount, double price, double tax, int stock,
            String category, String idProduct, String nameProduct) {
        this.discount = discount;
        this.price = price;
        this.tax = tax;
        this.stock = stock;
        this.category = category;
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
    }

    /**
     * @return the discount
     */
    public double getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the tax
     */
    public double getTax() {
        return tax;
    }

    /**
     * @param tax the tax to set
     */
    public void setTax(double tax) {
        this.tax = tax;
    }

    /**
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * @return the idProduct
     */
    public String getIdProduct() {
        return idProduct;
    }

    /**
     * @param idProduct the idProduct to set
     */
    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    /**
     * @return the nameProduct
     */
    public String getNameProduct() {
        return nameProduct;
    }

    /**
     * @param nameProduct the nameProduct to set
     */
    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    @Override
    public String toString() {
        return "Product{" + "discount=" + discount + ", price=" + price + ", tax=" + tax + ", stock=" + stock + ", category=" + category + ", idProduct=" + idProduct + ", nameProduct=" + nameProduct + '}';
    }
    
    
    

}
