import java.util.*;

public class Library {
	
	ArrayList <Book> BookAvailable = new ArrayList<Book>();
    Book book1 = new Book("1" ,"123465", "Wololo", "Trul"); 
    
    /**
    * Add a book with the given ISBN
    *
    * @param isbn the ISBN
    * @return the id of the added book if the isbn exists
    */
    Optional<String> addBook(String isbn){
    	for(int i =0; i < BookAvailable.size(); i++) {
    		if(BookAvailable.get(i).getIsbn() == isbn) {
    			return Optional.ofNullable(BookAvailable.get(i).getId());
    		}
    	}
    	BookAvailable.add();
    		    	
    };
    		
		
	    
	    /**
	    * Get a book from its id
	    *
	    * @param id the id of the wanter book
	    * @return a book with the given id if there is one
	    */
	    Optional<Book> getBook(String id){
	    	Book TheBook = new Book();
	    	for(int i =0; i < BookAvailable.size(); i++) {
	    		if(BookAvailable.get(i).getId() == id) {
	    			TheBook = BookAvailable.get(i);
	    		}
	    	}
	    	return Optional.ofNullable(TheBook);
	    }

	    
	    /**
	    * Return a book back to the library
	    *
	    * @param id the id of the book to borrow
	    * @param username the name of the user
	    * @throws BookNotFoundException if no book in the library has the given id
	    * @throws AllBooksAlreadyReturnedException if all books with the given id are
	    already returned
	    */
	    void returnBook(String id, String username) throws BookNotFoundException,
	    AllBooksAlreadyReturnedException;
	    /**
	    * Get all books of the library
	    * @return the books
		*/
		List<Books> getBooks();
		/**
		* Return all books with an author, a title or an ISBN matching the search term
		*
		* @param searchTerm the searched term
		* @return the books matching the search term
		*/
		List<Books> searchBooks(String searchTerm);
}
