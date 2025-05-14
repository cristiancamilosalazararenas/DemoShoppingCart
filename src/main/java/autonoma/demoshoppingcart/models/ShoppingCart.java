/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.demoshoppingcart.models;

import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class ShoppingCart {
    private int id=1;
    private ArrayList<Product> product;

    public ShoppingCart() {
    }
    public boolean addProduct(Product product){
        this.product.add(product);
        return true;
    }
    public boolean remoteProduct(int num){
        if (this.product.size()<=num){
            this.product.remove(num);
            return true;
        }
        else{
            return false;
        }
    }   
    public Product serchProduct(int num){
        for (int i=0; i<this.product.size();i++){
            if (i == num){
                return this.product.get(i);
            }
        }
        return null;
    }
    public int size(){
        return this.product.size();
    }
    public void buy(){
        
    }
    
}
