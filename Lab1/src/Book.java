
public class Book extends Item {

	private String bookName ;
	private String Author; 
	// constructor
	public Book()
	{
		super();
	}
	// string initialization
	public void setBookName(String Bn)
	{
		this.bookName = Bn;
	}
	// author initialization
	public void setBookAuthor(String bauthor) {
		// TODO Auto-generated method stub
		this.Author = bauthor;
	}
	//returning name
	public String getName()
	{
		return bookName;
	}
	//showing book elements
	public void showBook()
	{
		System.out.println("ID," +" "+ " BookName," +" "+ "Book Author,"+ " " + "PRICE");
		System.out.print(id +","+" " + bookName + "," + " " + Author + ","+ " " + price);
	}
}
