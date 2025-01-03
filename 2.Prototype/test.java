
public class test {

	public static void main(String[] args) throws CloneNotSupportedException {
		BookShelf bookShelf = new BookShelf ();
		bookShelf.addBook(new Book("조정래","태백산맥"));
		bookShelf.addBook(new Book("박완서","나목"));
		bookShelf.addBook(new Book("박경리","토지"));
		System.out.println(bookShelf);
		BookShelf anotherShelf = (BookShelf) bookShelf.clone();
		System.out.println(anotherShelf);
		bookShelf.getShelf().get(0).setAuthor("박완서");
		bookShelf.getShelf().get(0).setTitle("김");
		
		System.out.println(bookShelf);
		System.out.println(anotherShelf);
		
	}

}
