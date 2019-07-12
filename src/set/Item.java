package set;

public class Item extends father{
	int price;
	String Name;
	public Item()
	{
		
	}
	public Item(String Name)
	{
		this.Name = Name;
	}
	public String toString(){
		return Name;
	}
}
