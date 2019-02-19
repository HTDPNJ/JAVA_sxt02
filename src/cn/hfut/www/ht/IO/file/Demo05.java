package cn.hfut.www.ht.IO.file;

import java.io.File;
import java.util.Arrays;

public class Demo05
{
    public static void main(String[] args)
    {
        String path="G:/test";
        File file=new File(path);
        print(file,0);
        File[] roots=File.listRoots();
        System.out.println(Arrays.toString(roots));
    }
    public static void print(File file,int count){
        for(int i=0;i<=count;i++){
            System.out.print("-");
        }
        System.out.println(file.getPath());
        if(file.isDirectory()){
            for(File temp:file.listFiles()){
                print(temp.getAbsoluteFile(),count+1);
            }
        }

    }
}
