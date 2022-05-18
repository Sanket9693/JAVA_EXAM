import java.util.*;
class Item{
	Integer item_id;
	String item_name;
	
	Item(int itemId,String itemName){
		this.item_id=itemId;
		this.item_name=itemName;
	}
	Item(){
		
	}
	
	void setItemId(int id){
		this.item_id=id;
	}
	
	void setItemName(String name){
		this.item_name=name;
	}
	
	@Override
	public String toString(){
		return this.item_id+" "+this.item_name;
	}
	
	@Override
	public boolean equals(Object o){
		if(o instanceof Item){
			Item temp=(Item)o;
			if(this.item_id.equals(temp.item_id) && this.item_name.equals(temp.item_name)){
				return true;
			}
			
		}
		return false;
	}
	
	@Override
	public int hashCode(){
		int prime=13;
		int val=1;
		val=val*prime + this.item_id.hashCode();
		val=val*prime + this.item_name.hashCode();
		return val;
		
	}
	
}

class ItemID_sort implements Comparator<Item>{
	public int compare(Item I1,Item I2){
		return I1.item_id-(I2.item_id);
	}
}

class ItemName_sort implements Comparator<Item>{
	public int compare(Item I1,Item I2){
		return I1.item_name.compareTo(I2.item_name);
	}
}