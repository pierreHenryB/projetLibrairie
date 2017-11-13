import java.util.*;

public class Library implements InterfaceLibrary{
	
	List <Book> BookAvailable = new ArrayList<Book>();
	List <String> BookBorrowed = new ArrayList<String>();

	/**
    * Add a book with the given ISBN
    *
    * @param isbn the ISBN
    * @return the id of the added book if the isbn exists
    * 
    */
    public Optional<String> addBook(String isbn){
    	
    	String id = Integer.toString(BookAvailable.size() + 1);
    	if(isbn.length() == 10) {
    		for(int i = 0; i < BookAvailable.size(); i++) {
    			if(BookAvailable.get(i).getIsbn10().equals(isbn))
    				BookAvailable.get(i).setQuantity(BookAvailable.get(i).getQuantity() + 1);
    		}
    		Book book = new Book(id ,isbn, null ,"TitreLivre", "AuteurLivre", 1); 
    		BookAvailable.add(book);    	
    	}
    	else {
    		for(int i = 0; i < BookAvailable.size(); i++) {
    			if(BookAvailable.get(i).getIsbn13().equals(isbn))
    				BookAvailable.get(i).setQuantity(BookAvailable.get(i).getQuantity() + 1);
    		}
    		Book book = new Book(id , null, isbn,"TitreLivre", "AuteurLivre", 1); 
    		BookAvailable.add(book);
    	}
    	return Optional.ofNullable(id);    		    	
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
    };

	/**
	* Borrow a book from the library
	*
	* @param id the id of the borrowed book
	* @param username the name of the user
	* @throws LibraryException the book cannot be borrowed
	*/
	public void borrowBook(String id, String username) throws LibraryException{
		try {
			for(int i=0; i < BookAvailable.size(); i++) {
				if ((BookAvailable.get(i).getId().equals(id)) && (BookAvailable.get(i).getQuantity() > 0)) {
					BookAvailable.get(i).setQuantity(BookAvailable.get(i).getQuantity() - 1);
					BookBorrowed.add(id + username);
				}else {
					throw new LibraryException();
				}
			}
			
		}catch(LibraryException e){
			System.out.println("The book cannot be borrowed");
		}
	};
	
	/**
	* Return a book back to the library
	*
	* @param id the id of the book to borrow
	* @param username the name of the user
	* @throws LibraryException if the book cannot be returned
	*/
	public void returnBook(String id, String username) throws LibraryException{
		try {
			for(int i=0; i < BookBorrowed.size(); i++) {
				if (BookBorrowed.get(i).equals(id + username)) {
					BookAvailable.get(i).setQuantity(BookAvailable.get(i).getQuantity() + 1);
					BookBorrowed.remove(i);
				}else {
					throw new LibraryException();
				}
			}
			
		}catch(LibraryException e){
			System.out.println("The book cannot be returned");
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
