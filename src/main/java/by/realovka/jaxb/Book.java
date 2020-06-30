package by.realovka.jaxb;


import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"vendorCode", "name","yearOfPublishing"})
public class Book {
    private int vendorCode;
    private String name;
    private int yearOfPublishing;

    public Book(int vendorCode, String name, int yearOfPublishing) {
        this.vendorCode = vendorCode;
        this.name = name;
        this.yearOfPublishing = yearOfPublishing;
    }

    public Book() {
    }

    public int getVendorCode() {
        return vendorCode;
    }

    public void setVendorCode(int vendorCode) {
        this.vendorCode = vendorCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    @Override
    public String toString() {
        return "Book{" +
                "vendorCode=" + vendorCode +
                ", name='" + name + '\'' +
                ", yearOfPublishing=" + yearOfPublishing +
                '}';
    }
}
