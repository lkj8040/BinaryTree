package myFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileReader;

public class copyfile {
	public static void main(String[] args) {
		
		String srcfile = "d:/LOLfolder/lol.txt";
		String destfile = "d:/LOLfolder/lol-副本.txt";
		String srcfolder = "d:/LOLfolder/skin";
		String destfolder = "d:/LOLfolder/skin-副本";
		String search = "Magic";
		File folder = new File("d:/project");
		copyFile(srcfile,destfile);
		copyFolder(srcfolder,destfolder);
		searchString(folder,search);
		
	}
	public static void copyFile(String srcFile,String destFile){
		File src = new File(srcFile);
		File dest = new File(destFile);
		try(FileInputStream fis = new FileInputStream(src);
			FileOutputStream fos = new FileOutputStream(dest);)
		{
			byte[]b = new byte[(int)src.length()];
			fis.read(b);
			fos.write(b);
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	public static void copyFolder(String srcfolder,String destfolder){
		File src = new File(srcfolder);
		File dest = new File(destfolder);
		try{
			if(dest.exists() == false)
				dest.mkdirs();
			File []copyfile = src.listFiles();
			for(File each : copyfile){
				if(each.isDirectory() == false)
					copyFile(srcfolder + "/" + each.getName(), destfolder + "/" + each.getName());
				else
					copyFolder(srcfolder + "/" + each.getName(), destfolder + "/" + each.getName());
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void searchString(File folder, String search){
		try{
			File []copyfile = folder.listFiles();
			for(File each : copyfile)
				if(each.isDirectory() == false){
					String filename = folder.getAbsolutePath() + "/" + each.getName();
					File myfile = new File(filename);
					FileReader fr = new FileReader(myfile);
					char []b = new char[(int)myfile.length()];
					fr.read(b);
					fr.close();
					if(new String(b).indexOf("Magic") == -1)
						continue;
					else
						System.out.println(filename);
				}
				else{
					String filename = folder.getAbsolutePath() + "/" + each.getName();
					File myfile = new File(filename);
					searchString(myfile,search);
				}
					
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
}
