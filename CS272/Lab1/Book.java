import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

/**
* <h1>Add information of different book objects</h1>
* We create methods to assign different title, ISBN, authors Name 
* and then we check the information, compare them to different books, 
* or clone some objects.
* 
* @author  Alejandro Rosas
* @version 1.0
* @since   2019-01-28
*/

public class Book {
	
	/**
	* @param title This is the title of the book
	* @param authorsNumber  This is the number of authors that the book has
	* @param authorsName This is the Name/s of the authors of the book
	* @param isbn  This is the ISBN code of the book
	*/
	
	private String title;
	private int authorsNumber;
	private String[] authorsName;
	private String isbn;
	
	//Constructor method
	public Book() {
		title = null;
		isbn = null;
		authorsNumber = 0;
		authorsName = new String[3];
	}
	
	//constructor method with one argument that modifies title
	public Book (String _title) {
		title = _title;
		isbn = null;
		authorsNumber = 0;
		authorsName = new String[3];
	}
	
	//constructor method that clones object
	public Book (Object obj) {
		//Precondition is that obj should not be 
		//null and should be an instance of the Book class. 
		if ((obj != null) && (obj instanceof Book)){
			Book temp = (Book)obj;
			title = temp.title;
			isbn = temp.isbn;
			authorsNumber = temp.authorsNumber;
			authorsName = temp.authorsName;
		}
	}
	//get title method
	public String getTitle() {
		return title;
	}
	//get authorNumber method
	public int getAuthorNumber() {
		return authorsNumber;
	}
	//get ISBN method
	public String getISBN() {
		return isbn;
	}
	//set Title method
	public void setTitle (String _title) {
		title = _title;
	}
	//set ISBN method
	public void setISBN (String _isbn) {
		isbn = _isbn;
	}
	//boolean method that adds author if there is less than 
	//3 authors already and returns true
	public boolean addAuthor (String _author) {
		if (authorsNumber < 3) {
			authorsName[authorsNumber] = _author;
			authorsNumber += 1;
			return true;
		}
		else {
			return false;
		}
	}
	//Boolean method that returns true if two objects ISBN are equal
	public boolean equals (Object obj) {
		//Precondition is that obj should not be 
		//null and should be an instance of the Book class. 
		if ((obj != null) && (obj instanceof Book)){
			Book temp = (Book)obj;
			if (temp.isbn == isbn) {
				return true;
			}
		}
		return false;
	}
	
	/**
	* This method is used to add two object authors Name and return a String
	* Array without duplication. We created two list and checked, one with the authorsname
	* and the other empty. We append the authors name to the empty if they were 
	* not already on the list.
	* @param b1 This is the first Book object
	* @param b2  This is the second Book object
	*/
	public static String[] getAllAuthors(Book b1, Book b2) {
		//Precondition is that b1 and b2 should not be null
		if ((b1 != null) && (b2 != null)){
	        List<String> both = new ArrayList();
	        List<String> list2 = new ArrayList();
	        both.addAll(Arrays.asList(b1.authorsName));
	        both.addAll(Arrays.asList(b2.authorsName));
			
			for (String e1: both) {		        
		        if(!list2.contains(e1)){
		        	list2.add(e1);
		        }
			}
			
			String[] merged = new String[list2.size()];
			merged = list2.toArray(merged);	
			
			System.out.println(merged);
			
		    return merged;
		}
		return null;
	}
	//toString method
	public String toString() {
		return (title + ", " + isbn + ", " + authorsNumber + ", " + Arrays.toString(authorsName));
	}
	//Main method that we used to test the class and his methods
	public static void main(String[] args) {

		Book book1 = new Book();
		Book book2 = new Book("The fighter");
		book1.setTitle("Harry Potter");
		book1.setISBN("635267272");
		book2.setISBN("732329839");
		
		System.out.println("ISBN of the book 2 is: " + book2.getISBN());
		System.out.println("The title of the book 1 is: " + book1.getTitle());
		System.out.println("Are the ISBN of book1 and book2 equal? " + book1.equals(book2));
		
		book2.setISBN("635267272");
		System.out.println("Are the ISBN of book1 and book2 equal now? " + book1.equals(book2));

		Book book3 = new Book(book1);
		
		System.out.println("How many authors does book3 have? " + book3.getAuthorNumber());
		
		book3.addAuthor("Maria");
		book3.addAuthor("Jesus");
		System.out.println("Author was added? " + book3.addAuthor("Jose"));
		System.out.println("Author was added? " + book3.addAuthor("Jhon Doe"));

		book2.addAuthor("Maria");
		book2.addAuthor("Pedro");
		
		System.out.println("Information of book2? " + book2.toString());
		System.out.println("Information of book3? " + book3.toString());
		
		String allAuthors = Arrays.toString(getAllAuthors(book3,book2));
		System.out.println("All the authors of book2 and book3 are: " + allAuthors);
			
	}

}
