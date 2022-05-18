import java.util.*;
class Inventory{
	public static void main(String args[]){
		
		Item I=new Item();
		Scanner sc=new Scanner(System.in);
		int ch;
	

		Item i1=new Item(1,"abc");
		Item i2=new Item(4,"pqr");
		Item i3=new Item(3,"xyz");
		Item i4=new Item(2,"cpr");
		ArrayList<Item> list= new ArrayList<>(); 
		list.add(i1);
		list.add(i2);
		list.add(i3);
		list.add(i4);
		System.out.println("Arraylist"+" "+list);
		do{
			System.out.println("Enter your choice");
			System.out.println("1.Add Item\n2.Display complete inventory in sorted order of item names as well as itemId\n3.Remove Item\n4.Exit");
			ch=sc.nextInt();
			switch(ch){
				case 1: System.out.println("Enter ItemId");
						int id=sc.nextInt();
						I.setItemId(id);
						System.out.println("Enter ItemName");
						sc.nextLine();
						String name=sc.nextLine();
						I.setItemName(name);
						if(!list.contains(I)){
							list.add(I);
						}
						System.out.println("Arraylist"+" "+list);
						break;
				case 2: System.out.println("Sorting by ItemID");
						ItemID_sort idsort=new ItemID_sort();
						Collections.sort(list,idsort);
						System.out.println(list);
						System.out.println("Sorting by ItemName");
						ItemName_sort iname=new ItemName_sort();
						Collections.sort(list,iname);
						System.out.println(list);
						break;
				case 3: System.out.println("Enter index to remove Item");
						int i=sc.nextInt();
						list.remove(i);
						System.out.println("Updated ArrayList");
						System.out.println(list);
						break;
				case 4: System.out.println("Exit");
						break;
			}
		}while(ch!=4);
		
	
	}
}