public class GiftCard extends Item {
	// variable initiating
	private String GCDes;
	private String GCColor;
	// constructor build up
	public GiftCard()
	{
		super();
	}
	// setting gift name
	public void setGiftName(String GCDes) {
		// TODO Auto-generated method stub
		
		this.GCDes = GCDes;
	}
	// setting gift color
	public void setGiftAuthor(String GCColor) {
		// TODO Auto-generated method stub
		this.GCColor = GCColor;
	}
	// print gifts
	public void showGift() {
		// TODO Auto-generated method stub
		System.out.println("ID, " +" "+ " GCDES, " +" "+ "GC COLOR,"+ " " + "PRICE");
		System.out.print(id +","+" "+ GCDes +","+" "+ GCColor +","+" " +price);
		
	}

}
