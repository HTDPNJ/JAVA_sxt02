package cn.hfut.www.ht.IO.file;

import java.io.File;
import java.io.FilenameFilter;

public class Demo04
{
    public static void main(String[] args)
    {
        String path="G:/test/test/parent/test";
        File src=new File(path);
        if(src.isDirectory()){
            String[] subName=src.list();
            for(String temp:subName){
                System.out.println(temp);
            }
            File[] subFile=src.listFiles();
            for(File temp:subFile){
                System.out.println(temp.getAbsolutePath());
            }
            System.out.println("/////");
            subFile=src.listFiles(new FilenameFilter()
            {
                @Override
                public boolean accept(File dir, String name)
                {
                    return new File(dir,name).isFile()&&name.endsWith(".java");
                }
            });
            for(File temp:subFile){
                System.out.println(temp.getAbsolutePath());
            }
        }

    }
}
