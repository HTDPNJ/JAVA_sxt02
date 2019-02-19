package cn.hfut.www.ht.IO.byteIo;

import java.io.File;

public class CopyDir
{
    public static void main(String[] args)
    {
        File src=new File("G:/aaaa/");
        File des=new File("G:/A123");
        copydir(src,des);
    }
    public static void copydir(File src,File des){
        if(src.isFile()){
            File temp=new File(des.getAbsolutePath()+"/"+src.getName());
            FileUtil.copyfile(src,temp);
        }else if(src.isDirectory()){
            File h2=new File(des.getPath()+"/"+src.getName());
            h2.mkdir();
            for(File temp:src.listFiles()){
                copydir(temp,h2);
            }
        }
    }
}
