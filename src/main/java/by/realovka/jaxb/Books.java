package by.realovka.jaxb;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashSet;

@XmlRootElement
public class Books {
    @XmlElement
    private HashSet<Book> bookHashSet;

    public Books(HashSet<Book> bookHashSet) {
        this.bookHashSet = bookHashSet;
    }

    public Books() {
    }
}
