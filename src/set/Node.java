package set;

import java.util.List;
import java.util.ArrayList;

public class Node {
	public Node LeftNode;
	public Node RightNode;
	public Object value;
	
	public void add(Object V){
		if(null == value)//出口条件
			value = V;
		else
			if((Integer)value > (Integer)V){
				if(LeftNode == null)//如果左边为空，则新生成一个左节点
					LeftNode = new Node();
				LeftNode.add(V);
			}
			else{
				if(RightNode == null)//如果右边为空，则新生成一个右节点
					RightNode = new Node();
				RightNode.add(V);
			}
			
	}
	public List<Object> MidOrder(){//中序遍历
		List<Object> values = new ArrayList<>();
		
		if(null != LeftNode)
			values.addAll(LeftNode.MidOrder());
		
		values.add(value);
		
		if(null != RightNode)
			values.addAll(RightNode.MidOrder());
		
		return values;
		
	}
	public List<Object> befOrder(){//前序遍历
		List<Object> values = new ArrayList<>();
		
		values.add(value);
		
		if(null != LeftNode)
			values.addAll(LeftNode.befOrder());
		
		if(null != RightNode)
			values.addAll(RightNode.befOrder());
		
		return values;
		
	}
	public List<Object> aftOrder(){//后序遍历
		List<Object> values = new ArrayList<>();
		
		if(null != LeftNode)
			values.addAll(LeftNode.aftOrder());	
		
		if(null != RightNode)
			values.addAll(RightNode.aftOrder());

		values.add(value);
		
		return values;
		
	}
	public static void main(String[] args) {
		int []b = {63, 7, 79};
		Node H = new Node();
		for(int i = 0; i < b.length; i++)
		{
			H.add(b[i]);//作隐式类型转换
		}
		
		List<Object> order = H.MidOrder();
		for(Object each : order)
			System.out.print(each+" ");
		System.out.println();
		
		List<Object> order2 = H.befOrder();
		for(Object each : order2)
			System.out.print(each+" ");
		System.out.println();
		
		List<Object> order3 = H.aftOrder();
		for(Object each : order3)
			System.out.print(each+" ");
		System.out.println();
	}
}
