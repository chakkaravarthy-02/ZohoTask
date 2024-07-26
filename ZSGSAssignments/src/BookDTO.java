public class BookDTO {
    private  String title;
    private String ISBN;
    private String author;
    private String publisher;
    private int publishesYear;

    public static String paperQuality = "90-Gsm";

    public BookDTO(String title, String ISBN, String author, String publisher, String paperQuality, int publishesYear) {
        this.title = title;
        this.ISBN = ISBN;
        this.author = author;
        this.publisher = publisher;
        this.publishesYear = publishesYear;
        BookDTO.paperQuality=paperQuality;
    }

    public static String qualityOfPaper(){
        return paperQuality;
    }
    public String showBookDetail(){
        return "BookName : "+title+"\nISBN : "+ISBN+"\nAuthor : "+author+"\nPublisher : "+publisher +"\nPublisher year : "+publishesYear;
    }
}
class Main{
    public static void main(String[] args) {
        BookDTO bookDTO=new BookDTO("AtomicHabits","9876-987-673","James clear","penguin","80-Gsm",1990);
        System.out.println(bookDTO.showBookDetail());
        System.out.println("Quality of paper : " + BookDTO.qualityOfPaper());
    }
}


