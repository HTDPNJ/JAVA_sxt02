package cn.hfut.www.ht.IO.byteIo;

import java.io.*;

public class Demo01
{
    public static void main(String[] args)
    {
        File file=new File("F:\\java_CODE\\IDEA_Try\\SXT_Part02\\src\\cn\\hfut\\www\\ht\\IO\\byteIo\\Demo01.java");
        InputStream is=null;
        try {
            is=new FileInputStream(file);
            byte[] car=new byte[1024];
            int len=0;
            while(-1!=(len=is.read(car))){
                String str=new String(car,0,len);
                System.out.println(str);
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("文件不存在");
        }catch(IOException e){
            e.printStackTrace();
            System.out.println("读文件失败");
        }finally {
            if(null!=is){
                try {
                    is.close();
                }
                catch (IOException e) {
                    System.out.println("关闭文件流失败");
                    e.printStackTrace();
                }
            }
        }
    }
}
