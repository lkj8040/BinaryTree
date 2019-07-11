package myFile;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.InputStream;
import java.util.Scanner;
public class myBufferedReader {
	public static void main(String[] args) {
/*		File f = new File("d:/LOLfolder/lol.txt");
		try(BufferedReader fbr = new BufferedReader(new FileReader(f))){//缓存字符输入流
			while (true) {
                // 一次读一行
                String line = fbr.readLine();
                if (null == line)
                    break;
                System.out.println(line);
            }
			
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		File f2 = new File("d:/LOLfolder/lol2.txt");
		try(PrintWriter pw = new PrintWriter(new FileWriter(f2))){//缓存字符输出流
            pw.println("garen kill teemo");
            pw.flush();//立即把数据写入硬盘
            pw.println("teemo revive after 1 minutes");
            pw.println("teemo try to garen, but killed again");
			
		}catch(IOException e)
		{
			e.printStackTrace();
		}*/
		
		
		File f3 = new File("d:/LOLfolder/removeComments.java");
		removeComments(f3);
		
		File f4 = new File("d:/LOLfolder/lol2.txt");
		write(f4);
		read(f4);
		
		File f5 = new File("d:/LOLfolder/garen.lol");
		Hero []h = new Hero[10];
		
		for(int i = 0;i < 10; i++){
			h[i] = new Hero();
			h[i].Name = "hero";
			h[i].hp = i;
		}
		objectserialze(f5,h);
		
/*		try(InputStream is = System.in)
		{
			while(true){
			int i = is.read();
			System.out.println(i);
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}*/
		
		Scanner s = new Scanner(System.in);
		while(true)
		{
			String cs = s.nextLine();
			if(cs.equals("end"))
				break;
			System.out.println(cs);
		}
		int b = s.nextInt();
		System.out.println(b);
		
	}
	
	public static void removeComments(File javaFile){
		int i = 0;
		String []cs = new String[1000];
		try(BufferedReader br = new BufferedReader(new FileReader(javaFile)))
		{
			while(true)
			{	
				String Line = br.readLine();
				if(null == Line)
					break;
				cs[i] = Line;
				i++;
			}
		}			
		catch(IOException e)
		{
			e.printStackTrace();
		}
		int m = 0;//m是删减后的行数
		String [] newLine = new String[i];
		for(int j = 0; j < i; j++){
			char []tmp = cs[j].toCharArray();
			if(tmp[0]=='/' && tmp[1]=='/')
				continue;
			else{
				newLine[m] = cs[j];
				m++;
			}
		}
		try(PrintWriter pw = new PrintWriter(new FileWriter(javaFile)))
		{
			for(int k = 0; k < m; k++)
				pw.println(newLine[k]);
		}			
		catch(IOException e)
		{
			e.printStackTrace();
		}		
	}
	public static void read(File f){
		try(FileInputStream fis = new FileInputStream(f);
		    DataInputStream dis = new DataInputStream(fis);)
		{
			boolean b = dis.readBoolean();
			int c = dis.readInt();
			String d = dis.readUTF();
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	public static void write(File f){
		try(FileOutputStream fos = new FileOutputStream(f);
		    DataOutputStream dos = new DataOutputStream(fos);)
		{
			dos.writeBoolean(true);
			dos.writeInt(0xaef);
			dos.writeUTF("123 this is gareen");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	public static void objectserialze(File f, Hero []h)
	{
		try(			
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
				
			FileInputStream fis = new FileInputStream(f);
			ObjectInputStream ois = new ObjectInputStream(fis);
			)
		{
			int i = 0;
			for (Hero each : h){
				oos.writeObject(each);
				i++;
			}
			Hero []h2 = new Hero[i];
			for (int j = 0; j < i; j++){
				h2[j] = (Hero) ois.readObject();
				System.out.println(h2[j].Name+":"+h2[j].hp);
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}

	}
}

