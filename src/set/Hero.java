package set;

public class Hero extends father{
	public String Name;
	public int hp;
	public Hero()
	{
		
	}
	public Hero(String Name)
	{
		this.Name = Name;
	}
	public String toString(){
		return Name;
	}
}
