import java.util.*;

public class ShoppingCartApp {
//main class
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//adding value
		int value =55;
		ShoppingCart s = new ShoppingCart();
//creating the menu and keeping it on
		while(value!=3) {
		System.out.println("Press 1 for Add an Item");
		System.out.println("Press 2 for Display all Item");
		System.out.println("Press 3 for Exit");
		Scanner scan = new Scanner(System.in);
		System.out.print("ENTER VALUE");
		value = scan.nextInt();
		scan.nextLine();
		
		if(value==1)
		{	
			// BOOK INPUT STARTS
			System.out.println("ADDING TO CART");
			Book book = new Book();
			System.out.println("Enter Book Name");
			String Bname = scan.nextLine();
			
			book.setBookName(Bname);
			System.out.println("Enter Book Author");
			String Bauthor = scan.nextLine();
			book.setBookAuthor(Bauthor);
			System.out.println("Enter Valid Price");
			double i = scan.nextDouble();
			scan.nextLine();
			book.setPrice(i);
			// adding item
			s.addItem(book);
			book.showBook();
			System.out.println();
			// GIFT CARD INPUT STARTS
			System.out.println("Enter GIFTCARD Information");
			GiftCard GiftCard = new GiftCard();
			System.out.println("Enter Gift Card Description");
			String Gname = scan.nextLine();
			GiftCard.setGiftName(Gname);
			System.out.println("Enter Gift Card Color");
			String Gauthor = scan.nextLine();
			GiftCard.setGiftAuthor(Gauthor);
			System.out.println("Enter Valid Price");
			double j = scan.nextDouble();
			scan.nextLine();
			GiftCard.setPrice(j);
			// adding item
			s.addItem(GiftCard);
			GiftCard.showGift();

		}
		
		else if (value == 2)
		{
			System.out.println("SHOWING ALL ITEMS");
			s.AscendingOrder(); //sorting first
			s.showAllItems();   //printing second
		}
		
		else
		{
			System.out.println("EXIT");
			scan.close(); // scanner close
		}	
		}
		
	}
}
