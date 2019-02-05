/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.com.atel.puttingitalltogether1;

import gt.com.atel.pojo.Book;
import gt.com.atel.service.BookService;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

/**
 *
 * @author atel
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Weld weld = new Weld();
        WeldContainer contenedor = weld.initialize();
        
        BookService bookService = contenedor.instance().select(BookService.class).get();
        Book book = bookService.createBook("H2G2", 12.5f, "Geeky scifi Book");
        
        System.out.println("Test");
        weld.shutdown();
    }
    
}
