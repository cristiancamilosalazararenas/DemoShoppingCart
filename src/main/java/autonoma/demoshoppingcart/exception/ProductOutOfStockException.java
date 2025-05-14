/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.demoshoppingcart.exception;

/**
 *
 * @author Asus
 */
public class ProductOutOfStockException extends RuntimeException{
    public ProductOutOfStockException (){
        super("No hay stock del producto");
    }
}
