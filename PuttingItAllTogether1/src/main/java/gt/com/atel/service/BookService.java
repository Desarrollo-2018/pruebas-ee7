/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.com.atel.service;

import gt.com.atel.numbergenerator.NumberGeneratorService;
import gt.com.atel.pojo.Book;
import gt.com.atel.qualifiers.Loggable;
import gt.com.atel.qualifiers.ThirteenDigits;
import javax.inject.Inject;

/**
 *
 * @author atel
 */
@Loggable
public class BookService {
    
    @Inject @ThirteenDigits
    NumberGeneratorService numberGenerator;
    
    public Book createBook(String title, Float price, String description){
        Book book = new Book(title, price, description);
        book.setNumber(numberGenerator.generateNumber());
        System.out.println("Book save: " + book.getNumber());
        return book;
    }
}
