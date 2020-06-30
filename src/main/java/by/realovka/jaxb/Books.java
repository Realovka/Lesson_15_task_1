package by.realovka.jaxb;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;


@XmlRootElement
public class Books {
    @XmlElement
    private ArrayList<Book> bookArrayList;

    public Books(ArrayList<Book> bookArrayList) {
        this.bookArrayList = bookArrayList;
    }

    public Books() {
    }
}
