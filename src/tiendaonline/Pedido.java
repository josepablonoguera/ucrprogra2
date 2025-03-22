/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tiendaonline;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pablonoguera
 */
public class Pedido {
    private List <Product>productos;
    private String idPedido;

    public Pedido(List<Product> productos, String idPedido) {
        this.productos = productos;
        this.idPedido = idPedido;
    }

    /**
     * @return the productos
     */
    public List <Product> getProductos() {
        return productos;
    }

    /**
     * @param productos the productos to set
     */
    public void setProductos(ArrayList <Product> productos) {
        this.productos = productos;
    }

    /**
     * @return the idPedido
     */
    public String getIdPedido() {
        return idPedido;
    }

    /**
     * @param idPedido the idPedido to set
     */
    public void setIdPedido(String idPedido) {
        this.idPedido = idPedido;
    }
    
    
    
    
}
