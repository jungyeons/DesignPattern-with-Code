
public class Book {
	// field는 일단 캡슐화해서 private으로 하고
	// getter setter로만 접근 가능하게 해주는게 좋다.
	private String author;
	private String title;

	public Book(String author, String title) {
		super();
		this.author = author;
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String toString() {
		return "("+author + "," + title+")";
	}

}
