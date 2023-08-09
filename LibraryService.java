public class LibraryService {

    public Book getBook(GetBookRequest request) {
        String bookName = request.getName();
        Book book = new Book("người nam châm ");
        return book;
    }

    public Book createBook(CreateBookRequest request) {

        Book book = request.getBook();

        return book;
    }
}
