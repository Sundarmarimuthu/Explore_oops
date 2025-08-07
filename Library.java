abstract class LibraryBase {
    private String bhName;
    private int card;
    private String city;
    private String bookName;
    private int bookNo;

    LibraryBase(String name, int card, String city, String book, int no) {
        this.bhName = name;
        this.card = card;
        this.city = city;
        this.bookName = book;
        this.bookNo = no;
    }

    public String getBhName() {
        return bhName;
    }

    public void setBhName(String bhName) {
        this.bhName = bhName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getCard() {
        return card;
    }

    public void setCard(int card) {
        this.card = card;
    }

    public int getBookNo() {
        return bookNo;
    }

    public void setBookNo(int bookNo) {
        this.bookNo = bookNo;
    }

    public abstract void display();
}

class LibraryMember extends LibraryBase {
    public LibraryMember(String name, int card, String city, String book, int no) {
        super(name, card, city, book, no);
    }

    @Override
    public void display() {
        System.out.println("The name of the Book Holder: " + getBhName());
        System.out.println("The card no of BookHolder: " + getCard());
        System.out.println("The city Name of the BookHolder: " + getCity());
        System.out.println("The book borrowed by the BookHolder: " + getBookName());
        System.out.println("The book Id number: " + getBookNo());
    }
}

public class Library {
    public static void main(String[] args) {
        LibraryMember lib = new LibraryMember("Sundar", 1, "Dindigul", "Casper Nights", 220);
        lib.display();
    }
}
