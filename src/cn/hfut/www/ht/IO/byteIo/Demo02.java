package cn.hfut.www.ht.IO.byteIo;

import java.io.*;

public class Demo02
{
    public static void main(String[] args)
    {
        String path="G:/aaaa/1234.txt";
        File dest=new File(path);

        OutputStream out=null;
        try {
            out=new FileOutputStream(dest,true);
            String str="you are very goog \r\n";
            byte[] car=str.getBytes();
            out.write(car,0,car.length);
            out.flush();
        }
        catch (FileNotFoundException e) {
            System.out.println("文件未找到");
            e.printStackTrace();
        }catch(IOException e){
            System.out.println("流错误");
            e.printStackTrace();
        } finally {
            if(null!=out){
                try {
                    out.close();
                }
                catch (IOException e){
                    System.out.println("流关闭异常");
                    e.printStackTrace();
                }
            }
        }
    }
}
