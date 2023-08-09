public class Main {
    public static void main(String[] args) {


            LibraryService libraryService = new LibraryService();

                GetBookRequest getBookRequest = new GetBookRequest();
                getBookRequest.setName("shelves/shelf1/books/book2");
                Book getBookResult = libraryService.getBook(getBookRequest);
                System.out.println("Get Book Result - Name: " + getBookResult.getName());

                CreateBookRequest createBookRequest = new CreateBookRequest();
                createBookRequest.setParent("shelves/shelf1");

                Book newBook = new Book("người nam châm  ");
                newBook.setName("book3");


                createBookRequest.setBook(newBook);
                Book createBookResult = libraryService.createBook(createBookRequest);
                System.out.println("Create Book Result - Name: " + createBookResult.getName());

            }
        }


