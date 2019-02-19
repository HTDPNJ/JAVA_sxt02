package cn.hfut.www.ht.IO.file;

import java.io.File;

public class Demo01
{
    public static void main(String[] args)
    {
        System.out.println(File.pathSeparator);
        System.out.println(File.separator);
        String path="";
        path="E:"+File.separator+"src"+File.separator;
    }
}
