import java.util.ArrayList;

public class BookShelf implements Cloneable {

	private ArrayList<Book> shelf ;
	public BookShelf() {
		shelf = new ArrayList<Book>();
	}

//책이 들어오면 책장에 책 넣어주기
	public void addBook(Book book) {
		shelf.add(book);
	}

	public ArrayList<Book> getShelf() {
		return shelf;
	}

	public void setShelf(ArrayList<Book> shelf) {
		this.shelf = shelf;
	}
//ArrayList에 있는 toString 메서드 이용
	public String toString() {
		return shelf.toString();
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		BookShelf anotherShelf = new BookShelf();
		for(Book book : shelf) {
			anotherShelf.addBook(new Book(book.getAuthor(), book.getTitle()));
		}
		return anotherShelf;
		//그냥 clone하면 얕은 복사라 각각 분리되서 복사가 안된다.
	}

}
