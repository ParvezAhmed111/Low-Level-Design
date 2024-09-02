package designPatterns.structuralDesignPatterns.f_facadeDP.Example2.comlexClasses;

import designPatterns.structuralDesignPatterns.f_facadeDP.Example2.Product;

public class ProductDAO {
    public Product getProduct(int id){
        //get product based on product id and return
        System.out.println("get product based on product");
        return new Product();
    }
}
