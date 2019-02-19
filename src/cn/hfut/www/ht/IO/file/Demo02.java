package cn.hfut.www.ht.IO.file;

import java.io.File;

public class Demo02
{
    public static void main(String[] args)
    {
        String parentpath="E:/xp/test";
        String name="2.jpg";

        File src=new File(parentpath,name);
        System.out.println(src.getName());
        src=new File(new File(parentpath),name);
        System.out.println(src.getName());

        src=new File("test/2.jpg");
        System.out.println(src.getAbsolutePath());
    }
}
