package cn.hfut.www.ht.IO.file;

import java.io.File;
import java.io.IOException;

public class Demo03
{
    public static void main(String[] args)
    {
        try {
            test3();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void test2(){
        String path="G:/c++ ppt";
        File src=new File(path);
        System.out.println(src.exists());
        System.out.println(src.canWrite());
        if(src.isDirectory()){
            System.out.println("是文件夹");
        }else{
            System.out.println("是文件");
        }
        System.out.println(src.isAbsolute());
    }
    public static void test3() throws IOException
    {
        String path="G:/123";
        File src=new File(path);
        if(!src.exists()){
            boolean flag=src.createNewFile();
            System.out.println(flag?"成功":"失败");
        }
        boolean flag=src.delete();
        System.out.println(flag?"删除成功":"删除失败");
        File temp=File.createTempFile("abc",".tem",new File("G:/src"));
        try {
            Thread.sleep(10000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        temp.deleteOnExit();
    }
}
