public class Book {
	
	private String id;
	private String isbn10;
	private String isbn13;
	private String title;
	private String author;
	private int quantity;
	
	public Book() {};
	public Book(String id, String isbn10, String isbn13, String title, String author, int quantity){
		
		this.id = id;
		this.isbn10 = isbn10;
		this.isbn13 = isbn13;
		this.title = title;
		this.author = author;
		this.quantity = quantity;
		
	}
	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIsbn10() {
		return this.isbn10;
	}
	public void setIsbn10(String isbn10) {
		this.isbn10 = isbn10;
	}
	public String getIsbn13() {
		return this.isbn13;
	}
	public void setIsbn13(String isbn13) {
		this.isbn13 = isbn13;
	}
	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return this.author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getQuantity() {
		return this.quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
