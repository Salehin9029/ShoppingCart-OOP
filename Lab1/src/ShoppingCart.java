import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;
/**
 * @author salehin
 *
 */

public class ShoppingCart {
//initiating object type list	
	public List<Item> Bag;
 
	public ShoppingCart()
	{
		Bag = new ArrayList<Item>();	
	}
// adding item in arraylist
	public void addItem(Item item)
	{
		Bag.add(item);
	}	
// sorting using comparator
	public void AscendingOrder()
	{
		Comparator<Item> PriceComparator = (c1, c2) -> (int) (c1.getPrice() - c2.getPrice());
		Bag.sort(PriceComparator);
	}

// showing all items and calling printing methods
	public void showAllItems()
	{
		for (Item num : Bag)
		{
			if (num instanceof Book)
			{
				((Book) num).showBook();
				System.out.println();
			}
			else
			{
				((GiftCard) num).showGift();
				System.out.println();
			}
		}
	}
	
	

}