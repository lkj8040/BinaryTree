package set;

import java.util.ArrayList;
import java.util.List;//ArrayListʵ���˸ýӿ�
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import set.MyStack;

public class Testcollection {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
/*		ArrayList heros = new ArrayList();
		for(int i = 0; i < 5; i++)
			heros.add(new Hero("hero"+i));
		System.out.println(heros);
		Hero specialhero = new Hero("special hero");
		heros.add(3,specialhero);//���������Ԫ��
		System.out.println(heros.toString());
        System.out.print("��Ȼһ���µĶ�������Ҳ�� hero 1������contains�ķ�����:");
        System.out.println(heros.contains(new Hero("hero 1")));//�жϱ�׼�Ƕ����Ƿ���ͬ�����Ƕ����nameֵ�Ƿ����
        System.out.print("����specialhero���жϣ�contains�ķ�����:");
        System.out.println(heros.contains(specialhero));
        System.out.println(heros.get(5));//��ȡ�±�Ϊ5��Ԫ��
        System.out.println(heros.indexOf(specialhero));//���Ҷ�����±�λ��
        System.out.println(heros.indexOf(new Hero("hero 1")));//�����ڷ���-1
        heros.remove(2);//�Ƴ���2��Ԫ��
        heros.remove(specialhero);//�Ƴ�ָ��Ԫ��
        System.out.println(heros);
        heros.set(2, new Hero("special hero"));//����2��Ԫ���滻
        System.out.println(heros);
        Hero []s = (Hero [])heros.toArray(new Hero []{});//תΪԪ������
        for(Hero each : s)
        	System.out.print(each.Name+" ");
        System.out.println();
        ArrayList anotherHeros = new ArrayList();
        anotherHeros.add(new Hero("hero a"));
        anotherHeros.add(new Hero("hero b"));
        anotherHeros.add(new Hero("hero c"));
        heros.addAll(anotherHeros);
        System.out.println(heros);
        boolean tag = false;
        for(Hero each : s)
        	if (each.Name == "hero1")
        		tag = true;
        System.out.println(tag);	
        heros.clear();
        System.out.println(heros);*/
		
/*		List heros = new ArrayList();//�ӿ�����ָ���������
		heros.add(new Hero("garren"));
		System.out.println(heros.size());
		
        List <father> H = new ArrayList<>();//��Item��Hero����һ����ͬ�ĸ��࣬���������Է��뷺������
        H.add(new Item("�ư�"));
        H.add(new Hero("��ޢ"));
        System.out.println(H);*/
		
/*      List<Hero> H = new ArrayList<>();
        for(int i = 0; i < 100; i++)
        	H.add(i,new Hero("hero"+i));

        for(int i = 0; i < H.size(); i++){
        	if(Integer.valueOf(H.get(i).Name.substring(4)) %8 ==0)
        		H.remove(i);
        }
        for(Hero each : H)
        {
        	System.out.println(each.Name);
        }*/
		
/*		LinkedList<Hero> heros = new LinkedList<>();
		heros.addLast(new Hero("��ķ"));
		heros.addLast(new Hero("����"));
		heros.addLast(new Hero("Ůǹ"));
		System.out.println(heros);
		heros.addFirst(new Hero("����"));
		System.out.println(heros);
		heros.removeFirst();
		heros.removeLast();
		System.out.println(heros);*/
		
		List<Hero> heros = new LinkedList<>();//LinkedListҲʵ����List�ӿ�
		Queue<Hero> myheros = new LinkedList<>();//LinkedList��ʵ����Queue�ӿ�
		myheros.offer(new Hero("��ķ"));
		myheros.offer(new Hero("����"));
		myheros.offer(new Hero("Ůǹ"));
		System.out.println(myheros);
		myheros.offer(new Hero("����"));
		System.out.println(myheros);
		System.out.println(myheros.poll());
		System.out.println(myheros.poll());
		myheros.offer(new Hero("ά³˹"));
		System.out.println(myheros);
		
        MyStack H = new MyStack();
        H.push(new Hero("��ķ"));
        H.push(new Hero("����"));
        H.push(new Hero("Ůǹ"));
        
        System.out.println(H.pull());
        System.out.println(H.pull());
        
        H.push(new Hero("ά³˹"));
        System.out.println(H.pull());
        
        
        
        
	}
}
