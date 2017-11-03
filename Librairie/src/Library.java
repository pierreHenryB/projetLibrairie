import java.util.*;

public class Library implements InterfaceLibrary{
	
	List <Book> BookAvailable = new ArrayList<Book>();
    Book book1 = new Book("1" ,"123465","123456789123", "Wololo", "Trul"); 
    
    /**
    * Add a book with the given ISBN
    *
    * @param isbn the ISBN
    * @return the id of the added book if the isbn exists
    */
    public Optional<String> addBook(String isbn){
    	
    	if(isbn.length() == 10) {
    		for(int i =0; i < BookAvailable.size(); i++) {
        		if(BookAvailable.get(i).getIsbn10().equals(isbn)) {
        			return Optional.ofNullable(BookAvailable.get(i).getId());
        		}
        	}
    	}else if(isbn.length() == 13) {
    		for(int i =0; i < BookAvailable.size(); i++) {
        		if(BookAvailable.get(i).getIsbn13().equals(isbn)) {
        			return Optional.ofNullable(BookAvailable.get(i).getId());
        		}
        	}
    	}
    	
    	BookAvailable.add();
    	return Optional.ofNullable(null);
    		    	
    };
    		
		
	    
	    /**
	    * Get a book from its id
	    *
	    * @param id the id of the wanter book
	    * @return a book with the given id if there is one
	    */
	    public Optional<Book> getBook(String id){
	    	Book TheBook = new Book();
	    	for(int i =0; i < BookAvailable.size(); i++) {
	    		if(BookAvailable.get(i).getId().equals(id)) {
	    			TheBook = (Book) BookAvailable.get(i);
	    		}
	    	}
	    	return Optional.ofNullable(TheBook);
	    }

	    /**
	    * Borrow a book from the library
	    *
	    * @param id the id of the borrowed book
	    * @param username the name of the user
	    * @throws BookNotFoundException if no book in the library has the given id
	    * @throws UnavailableBookException if all books in the library with the given id
	    have been borrowed
	    */
	    public void borrowBook(String id, String username) throws BookNotFoundException,
	    UnavailableBookException{
	    	try {
				
			}catch(BookNotFoundException e){
				
			}
	    	catch(UnavailableBookException e){
				
			}
	    	
	    };
	    
	    /**
	    * Return a book back to the library
	    *
	    * @param id the id of the book to borrow
	    * @param username the name of the user
	    * @throws BookNotFoundException if no book in the library has the given id
	    * @throws AllBooksAlreadyReturnedException if all books with the given id are
	    already returned
	    */
	    public void returnBook(String id, String username) throws BookNotFoundException,
	    AllBooksAlreadyReturnedException{
	    	try {
				
			}catch(BookNotFoundException e){
				
			}
	    	catch(AllBooksAlreadyReturnedException e){
				
			}
	    };
	    
	    /**
	    * Get all books of the library
	    * @return the books
		*/
		public List<Book> getBooks(){
			return BookAvailable;			
		};
		
		/**
		* Return all books with an author, a title or an ISBN matching the search term
		*
		* @param searchTerm the searched term
		* @return the books matching the search term
		*/
		public List<Book> searchBooks(String searchTerm){
			List<Book> SearchedBooks = new ArrayList<Book>();
			for(Book TheBook : BookAvailable) {
				if(TheBook.getIsbn10().equals(searchTerm))
					SearchedBooks.add(TheBook);
				if(TheBook.getIsbn13().equals(searchTerm))
					SearchedBooks.add(TheBook);
				if(TheBook.getAuthor().equals(searchTerm))
					SearchedBooks.add(TheBook);
				if(TheBook.getTitle().equals(searchTerm))
					SearchedBooks.add(TheBook);
			}
			return SearchedBooks;
		};
}
