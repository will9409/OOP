
public class Book {

	String title;
	String author;
	int ISBN;
	
	public Book(String title,String author,int ISBN) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book javaBook = new Book("java JDK","х╡╠Беб",3333);

		System.out.println(javaBook.title);
		System.out.println(javaBook.author);
		System.out.println(javaBook.ISBN);
	}

}
