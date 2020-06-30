package by.realovka.jaxb;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Book book1=new Book(123, "Ангелы и демоны", 2005);
        Book book2=new Book(124, "Код да Винчи", 2006);
        Book book3=new Book(125, "Точка обмана", 2007);
        HashSet<Book> books=new HashSet<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        Books fewBooks = new Books(books);
        try {
            JAXBContext context = JAXBContext.newInstance(Books.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
            marshaller.marshal(fewBooks,new File("book.xml"));

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
