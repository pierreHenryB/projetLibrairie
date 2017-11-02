import java.util.Date;

public class Book {
	
	private String id;
	private String isbn;
	private String name;
	private String autor;
	//private Date release;
	
	public Book() {};
	public Book(String pId, String pIsbn, String pName, String pAutor){
		
		this.id = pId;
		this.isbn = pIsbn;
		this.name = pName;
		this.autor = pAutor;
		
	}
	public String getId() {
		return this.id;
	}
	public void setId(String pId) {
		this.id = pId;
	}
	public String getIsbn() {
		return this.isbn;
	}
	public void setIsbn(String pIsbn) {
		this.isbn = pIsbn;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String pName) {
		this.name = pName;
	}
	public String getAutor() {
		return this.autor;
	}
	public void setAutor(String pAutor) {
		this.autor = pAutor;
	}


	/*public void setRelease(Date pRelease) {
		this.release = pRelease;
	}*/

	

}
