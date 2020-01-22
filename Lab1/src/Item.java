import java.util.ArrayList;
import java.util.List;

public abstract class Item {
// initiating variables
	public static int counter = 0;
	double price;
	int id;
	double MainPrice;
	List<Item> AllItem = new ArrayList<Item>();
// constructor initiation
	public Item()
	{ //adding unique ids with increment
		id = ++counter;
	}
//setting price and checking if it is valid or not 
	public void setPrice(double price)
	{
		if(price>=0) 
		{
		this.price = price;
		}
		else
			System.out.println("PRICE INVALID");
	}
	
// returning price
	public double getPrice()
	{
		return price;
	}
	
	
	
}
