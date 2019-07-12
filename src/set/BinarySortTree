package set;

import java.util.List;
import java.util.ArrayList;

public class sortTree {
	public sortTree LeftNode;
	public sortTree RightNode;
	public Object Value;
	public void add(Object V){
		if(null == Value)
			Value = V;
		else
			if((Integer)Value > (Integer)V){
				if(null == LeftNode)
					LeftNode = new sortTree();
				LeftNode.add(V);
			}
			else{
				if(null == RightNode)
					RightNode = new sortTree();
				RightNode.add(V);
			}
	}
	public List<Object> MidSort(){
		List <Object> values = new ArrayList <>();
		
		if(LeftNode != null)
			values.addAll(LeftNode.MidSort());
		
		values.add(Value);
		
		if(RightNode != null)
			values.addAll(RightNode.MidSort());
		
		return values;
	}
	public static void main(String[] args) {
		int []num = new int[40000];
		for(int i = 0; i < num.length; i++)
			num[i] = (int)(Math.random()*100000);
		
		long start1 = System.currentTimeMillis();
		sortTree T = new sortTree();
		for(int i = 0; i < num.length; i++)
			T.add(num[i]);
		List<Object> sortT = T.MidSort();
		long end1 = System.currentTimeMillis();
		System.out.println("二叉树中序遍历排序："+(end1-start1));
		
		int []num2 = num;
		int tmp;
		long start2 = System.currentTimeMillis();
		for(int i = 0; i < num.length; i++)
			for(int j = i + 1; j < num.length; j++)
				if(num[i] > num[j]){
					tmp = num[i];
					num[i] = num[j];
					num[j] = tmp;
				}
		long end2 = System.currentTimeMillis();
		System.out.println("选择排序："+(end2-start2));
		
		long start3 = System.currentTimeMillis();
		for(int i = 0; i < num2.length; i++)
			for(int j = num2.length-1; j > i; j--)
				if(num2[j] < num2[j-1]){
					tmp = num2[j];
					num2[j] = num2[j-1];
					num2[j-1] = tmp;
				}
		long end3 = System.currentTimeMillis();
		System.out.println("冒泡排序："+(end3-start3));
	}
}
