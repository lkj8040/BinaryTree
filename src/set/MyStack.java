package set;
import java.util.LinkedList;
public class MyStack implements Stack{
	LinkedList<Hero> H = new LinkedList<>(); 
	@Override
	public void push(Hero h){//��ջ
		H.addLast(h);//�ŵ�ĩβ
	}
	@Override
	public Hero pull(){//��ջ
		if(!H.isEmpty())
			return H.removeLast();//��һ������
		else
			return null;
	}
	@Override
	public Hero peek(){//�鿴���һ��Ӣ��
		if(!H.isEmpty())
			return H.getLast();
		else
			return null;
	}
}
