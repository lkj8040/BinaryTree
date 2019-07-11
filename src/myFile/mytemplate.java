package myFile;

import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;

public class mytemplate {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入类的名称：");
		String a = s.nextLine();
		System.out.println("请输入属性的类型：");
		String b = s.nextLine();
		System.out.println("请输入属性的名称：");
		String c = s.nextLine();
		System.out.println("替换后的内容：");
		File h = new File("d:/LOLfolder/class_"+a+".java");
		creatClassFile(h,a,b,c);
		
	}
	public static void creatClassFile(File myfile,String className,String typeName,String propertyName)
	{
		File f = new File("d:/LOLfolder/template.java");
		try (BufferedReader br = new BufferedReader(new FileReader(f));
			PrintWriter pw = new PrintWriter(new FileWriter(myfile)))
		{
			while(true){
				String s = br.readLine();
				if(null == s)
					break;
				s = s.replaceAll("@class@", className);
				s = s.replaceAll("@type@", typeName);
				s = s.replaceAll("@property@", propertyName);
				if (propertyName.charAt(0) >= 'a'&&propertyName.charAt(0)<='z'){
					char c = (char) (propertyName.charAt(0) - 32);
					String b = propertyName.substring(1);
					s = s.replaceAll("@Uproperty@", c+b);
					}
				else
					s = s.replaceAll("@Uproperty@", propertyName);
				pw.println(s);
				System.out.println(s);
				
				}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
