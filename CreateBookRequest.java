public class CreateBookRequest {
    private String parent ;
    private Book book;
    public CreateBookRequest(){

    }
    public String getParent(){
        return parent;
    }
    public void setParent(String parent){
        this.parent = parent;
    }
    public Book getBook(){
        return book;
    }
    public void setBook(Book book){
        this.book = book;
    }
}
