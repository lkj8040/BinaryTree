package myFile;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;
public class myBufferedReader {
	public static void main(String[] args) {
		File f = new File("d:/LOLfolder/lol.txt");
		try(BufferedReader fbr = new BufferedReader(new FileReader(f))){//�����ַ�������
			while (true) {
                // һ�ζ�һ��
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
		try(PrintWriter pw = new PrintWriter(new FileWriter(f2))){//�����ַ������
            pw.println("garen kill teemo");
            pw.flush();//����������д��Ӳ��
            pw.println("teemo revive after 1 minutes");
            pw.println("teemo try to garen, but killed again");
			
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		File f3 = new File("d:/LOLfolder/removeComments.java");
		removeComments(f3);
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
		int m = 0;//m��ɾ���������
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
}
