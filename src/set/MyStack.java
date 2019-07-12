package set;
import java.util.LinkedList;
public class MyStack implements Stack{
	LinkedList<Hero> H = new LinkedList<>(); 
	@Override
	public void push(Hero h){//入栈
		H.addLast(h);//放到末尾
	}
	@Override
	public Hero pull(){//出栈
		if(!H.isEmpty())
			return H.removeLast();//第一个出来
		else
			return null;
	}
	@Override
	public Hero peek(){//查看最后一个英雄
		if(!H.isEmpty())
			return H.getLast();
		else
			return null;
	}
}
