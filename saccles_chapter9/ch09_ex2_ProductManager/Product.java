import java.text.NumberFormat;

public class Product {

    private String code;
    private String description;
    private double price;
    private long isbn;
    private String author;
    private boolean in_print;

    public Product() {
        this("", "", 0, 0, "", false);
    }

    public Product(String code, String description, double price, 
            long isbn, String author, boolean in_print) {
        this.code = code;
        this.description = description;
        this.price = price;
        this.isbn = isbn;
        this.author = author;
        this.in_print = in_print;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getPriceFormatted() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(price);
    }
    
    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }
    
    public long getIsbn() {
        return isbn;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public String getAuthor() {
        return author;
    } 
    
    public void setIn_print(boolean in_print) {
        this.in_print = in_print;
    }
    
    public boolean getIn_print() {
        return in_print;
    }
}