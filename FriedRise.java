package org.billGeneration;

public class FriedRise {
	private int price;
	private boolean veg;
	private int ExtraMayoPrice=20;
	private int ExtraKetchupPrice=15;
	private int ExtraCokePrice=30;
	private int ExtraPepsiPrice=20;
	private int packingprice=20;
	
	private int baseFriedRise;
	
	
	private boolean isExtraMayoAdded=false; 
	private boolean isExtraKetchupAdded=false;
	private boolean isExtraCokeAdded=false;
	private boolean isExtraPepsiAdded=false;
	private boolean isOptedForTakeAway=false;
	
	
	
	public FriedRise(boolean veg) {
		this.veg=veg;
		if(this.veg) {
			this.price=140;
			
		}else {
			this.price=180;
			
		}
		baseFriedRise=this.price;
	}
	public void addExtraMayo() {
		isExtraMayoAdded = true;
		System.out.println("Extra Mayonaise Added");
		this.price+=ExtraMayoPrice;
	}
	public void addExtraKetchup() {
		isExtraKetchupAdded = true;
		System.out.println("Extra Ketchup Added");
		this.price+=ExtraKetchupPrice;
	}
	
	public void addExtraCoke() {
		isExtraCokeAdded=true;
		System.out.println("Extra Coke Added");
		this.price+=ExtraCokePrice;
	}
	
	public void addExtraPepsi() {
		isExtraPepsiAdded=true;
		System.out.println("Extra Pepsi Added");
		this.price+=ExtraPepsiPrice;
	}
	public void takeAway() {
		isOptedForTakeAway=true;
		this.price+=packingprice;

	} 
	public void getBill() {
		String bill="";
		System.out.println("FriedRise :"+baseFriedRise);
		if(isExtraMayoAdded) {
			bill+="Extra Mayonaise Added: "+ExtraMayoPrice+"\n";
		}
		if (isExtraKetchupAdded) {
			bill+="Extra Ketchup Added: "+ExtraKetchupPrice+"\n";
		}
		if (isExtraCokeAdded) {
			bill+="Extra Coke Added: "+ExtraCokePrice+"\n";
		}
		if (isExtraPepsiAdded) {
			bill+="Extra Pepsi Added: "+ExtraPepsiPrice+"\n";
		}
		if (isOptedForTakeAway) {
			bill+="Is Opted for TakeAway: "+packingprice+"\n";
		}
		bill+="Bill : "+this.price+"\n";
		System.out.println(bill);
	}
}
