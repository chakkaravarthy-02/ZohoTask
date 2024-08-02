public abstract class Document {
    String name;
    String content;

    public Document(String name,String content){
        this.content=content;
        this.name=name;
    }

    public String getName(){
        return name;
    }
    public String getContent(){
        return content;
    }

    public abstract void open();
    public abstract void save();
    public abstract void close();
}

class TextDocument extends Document{

    public TextDocument(String name, String content) {
        super(name, content);
    }

    @Override
    public void open() {
        System.out.println(getName()+" Text Opened");
    }

    @Override
    public void save() {
        System.out.println(getName()+" Text Saved");
        System.out.println(getContent());
    }

    @Override
    public void close() {
        System.out.println(getName()+" Text Closed");
    }
}
class PdfDocument extends Document{

    public PdfDocument(String name, String content) {
        super(name, content);
    }

    @Override
    public void open() {
        System.out.println(getName()+" Pdf Opened");
    }

    @Override
    public void save() {
        System.out.println(getName()+" Pdf Saved");
        System.out.println(getContent());
    }

    @Override
    public void close() {
        System.out.println(getName()+" Pdf Closed");
    }
}
class ImageDocument extends Document {

    public ImageDocument(String name, String content) {
        super(name, content);
    }

    @Override
    public void open() {
        System.out.println(getName()+" Image Opened");
    }

    @Override
    public void save() {
        System.out.println(getName()+" Image Saved");
        System.out.println(getContent());
    }

    @Override
    public void close() {
        System.out.println(getName()+" Image Closed");
    }
}

class DocumentMain{
    public static void main(String[] args) {
        Document pd=new PdfDocument("Project","Added pdfFile");
        Document Id=new ImageDocument("Pixels","Added imageFile");
        Document Td=new TextDocument("Debug","Added textFile");

        pd.open();
        pd.save();
        pd.close();
        System.out.println("________________________________________");

        Id.open();
        Id.save();
        Id.close();
        System.out.println("________________________________________");

        Td.open();
        Td.save();
        Td.close();

    }
}