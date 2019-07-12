package set;

import java.util.ArrayList;
import java.util.List;//ArrayList实现了该接口
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
		heros.add(3,specialhero);//容器里面加元素
		System.out.println(heros.toString());
        System.out.print("虽然一个新的对象名字也叫 hero 1，但是contains的返回是:");
        System.out.println(heros.contains(new Hero("hero 1")));//判断标准是对象是否相同，而非对象的name值是否相等
        System.out.print("而对specialhero的判断，contains的返回是:");
        System.out.println(heros.contains(specialhero));
        System.out.println(heros.get(5));//获取下标为5的元素
        System.out.println(heros.indexOf(specialhero));//查找对象的下标位置
        System.out.println(heros.indexOf(new Hero("hero 1")));//不存在返回-1
        heros.remove(2);//移除第2个元素
        heros.remove(specialhero);//移除指定元素
        System.out.println(heros);
        heros.set(2, new Hero("special hero"));//将第2个元素替换
        System.out.println(heros);
        Hero []s = (Hero [])heros.toArray(new Hero []{});//转为元素数组
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
		
/*		List heros = new ArrayList();//接口引用指向子类对象
		heros.add(new Hero("garren"));
		System.out.println(heros.size());
		
        List <father> H = new ArrayList<>();//给Item和Hero构造一个共同的父类，这样都可以放入泛型容器
        H.add(new Item("破败"));
        H.add(new Hero("妮蔻"));
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
		heros.addLast(new Hero("塔姆"));
		heros.addLast(new Hero("盖伦"));
		heros.addLast(new Hero("女枪"));
		System.out.println(heros);
		heros.addFirst(new Hero("妖姬"));
		System.out.println(heros);
		heros.removeFirst();
		heros.removeLast();
		System.out.println(heros);*/
		
		List<Hero> heros = new LinkedList<>();//LinkedList也实现了List接口
		Queue<Hero> myheros = new LinkedList<>();//LinkedList还实现了Queue接口
		myheros.offer(new Hero("塔姆"));
		myheros.offer(new Hero("盖伦"));
		myheros.offer(new Hero("女枪"));
		System.out.println(myheros);
		myheros.offer(new Hero("妖姬"));
		System.out.println(myheros);
		System.out.println(myheros.poll());
		System.out.println(myheros.poll());
		myheros.offer(new Hero("维鲁斯"));
		System.out.println(myheros);
		
        MyStack H = new MyStack();
        H.push(new Hero("塔姆"));
        H.push(new Hero("盖伦"));
        H.push(new Hero("女枪"));
        
        System.out.println(H.pull());
        System.out.println(H.pull());
        
        H.push(new Hero("维鲁斯"));
        System.out.println(H.pull());
        
        
        
        
	}
}
