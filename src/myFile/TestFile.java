package myFile;
import java.io.File;
import java.util.Date;
import java.io.IOException;
import java.util.Arrays;
public class TestFile {
	public static void main(String[] args)throws IOException {
/*		File myfile = new File("d:/LoLfolder/LOL.exe");//����·��
		System.out.println(myfile);
		System.out.println(myfile.exists());
		System.out.println(myfile.isDirectory());//�Ƿ��ļ���
		System.out.println(myfile.isFile());
		System.out.println(myfile.length());
		
		//�ļ�����޸ĵ�ʱ��
		long time = myfile.lastModified();
		Date d = new Date(time);
		System.out.println(d);
		myfile.setLastModified(0);
		
		//�ļ�������
		File myfile2 = new File("d:/LoLfolder/DOTA.exe");
		myfile.renameTo(myfile2);*/
		
/*		File myfile = new File("d:/LoLfolder/skin/garen.ski");
		myfile.mkdir();//�����ļ��У�������ļ���skin�����ڣ�����Ч
		myfile.mkdirs();//�����ļ��У�������ļ���skin�����ڣ���ᴴ�����ļ���
		myfile.createNewFile();//����һ�����ļ���������ļ��в����ڣ����׳��쳣
		myfile.getParentFile().mkdirs();//������Ŀ¼		
		System.out.println(Arrays.toString(myfile.list()));// ���ַ����������ʽ�����ص�ǰ�ļ����µ������ļ������������ļ������ļ��У�
		File []fs = myfile.listFiles();// ���ļ��������ʽ�����ص�ǰ�ļ����µ������ļ������������ļ������ļ��У�
		System.out.println(myfile.getParent()); // ���ַ�����ʽ���ػ�ȡ�����ļ���
		myfile.getParentFile();// ���ļ���ʽ���ػ�ȡ�����ļ���


		myfile.listRoots();//�г����е��̷�
*//*	myfile.delete();//ɾ���ļ�
		myfile.deleteOnExit();//JVM����ʱ��ɾ���ļ���������ɾ����ʱ�ļ�
*/	
		
		File myfile = new File("c:/windows");
		File[]fs = myfile.listFiles();
        if(null==fs)
            return;
        long minSize = Integer.MAX_VALUE;
        long maxSize = 0;
        File minFile = null;
        File maxFile = null;
        for (File file : fs) {
            if(file.isDirectory())
                continue;
            if(file.length()>maxSize){
                maxSize = file.length();
                maxFile = file;
            }
            if(file.length()!=0 && file.length()<minSize){
                minSize = file.length();
                minFile = file;
            }
        }
        System.out.printf("�����ļ���%s�����С��%,d�ֽ�%n",maxFile.getAbsoluteFile(),maxFile.length());
        System.out.printf("��С���ļ���%s�����С��%,d�ֽ�%n",minFile.getAbsoluteFile(),minFile.length());
		
	
	}

}
