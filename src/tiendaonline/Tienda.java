/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiendaonline;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

/**
 *
 * @author pablonoguera
 */
public class Tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList <Product> list = new  ArrayList();
       Product pr1 = new  Product();
       pr1.setNameProduct("Camisa Polo");
       pr1.setPrice(8000.0);
       Product pr2 = new  Product();
       pr2.setNameProduct("Tennis OC");
       pr2.setPrice(70000.0);
       
       list.add(pr1);
       list.add(pr2);
       
       
       List <Pedido> carrito = new  ArrayList<>();
       
       Pedido pd1 =new  Pedido(list, "1");
       
       carrito.add(pd1);
       
       
       
//       
//        Stack stack = new Stack();
//        
//        
//        stack.p
//        
//        
//        
//       
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i).getNameProduct());
//        }
//        
//        list.forEach((p)-> System.out.println(p.getNameProduct()));
//       
//        
//        
//        Product  remove = list.remove(0);
//        
//        
//        if (remove!= null) {
//            System.out.println("Eliminado" + remove.getNameProduct());
//        }else{
//            System.out.println("No eliminado");
//        }
//         list.forEach((p)-> System.out.println(p.toString()));
//         
//         list.clear();
//         System.out.println("'''''''");
//         list.forEach((p)-> System.out.println(p.toString()));
         
         
         
         
    }
    
}
