import java.util.ArrayList;

public class BookDTO {
    public  String title;
    public String ISBN;
    public String author;
    public String publisher;
    public int publishesYear;

    public static String paperQuality = "90-Gsm";

    ArrayList<BookDTO>books=new ArrayList<>();
    public BookDTO(String title, String ISBN, String author, String publisher, String paperQuality, int publishesYear) {
        this.title = title;
        this.ISBN = ISBN;
        this.author = author;
        this.publisher = publisher;
        this.publishesYear = publishesYear;
        books.add(this);
        BookDTO.paperQuality=paperQuality;
    }

    public static String qualityOfPaper(){
        return paperQuality;
    }
    public String showBookDetail(){
        return "BookName : "+title+"\nISBN : "+ISBN+"\nAuthor : "+author+"\nPublisher : "+publisher +"\nPublisher year : "+publishesYear;
    }
    public void showAllBookDetails() {
        for(BookDTO book:books){
            System.out.println(book.showBookDetail());
        }
    }
}
class BookMain{
    public static void main(String[] args) {
        BookDTO bookDTO=new BookDTO("AtomicHabits","9876-987-673","James clear","penguin","80-Gsm",1990);
        bookDTO.showAllBookDetails();
        System.out.println("Quality of paper : " + BookDTO.qualityOfPaper());
    }
}


