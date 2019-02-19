package cn.hfut.www.ht.IO.byteIo;

import java.io.*;

public class FileUtil
{
    public static void copyfile(String src,String des){
        copyfile(new File(src),new File(des));
    }
    public static void copyfile(File src,File des){
        InputStream input=null;
        OutputStream out=null;
        try {
            input=new FileInputStream(src);
            byte[] car=new byte[1024];

            out=new FileOutputStream(des);
            int len=0;
            while(-1!=(len=input.read(car))){
                out.write(car,0,len);
            };
            out.flush();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }finally {
            if(null!=input){
                try {
                    out.close();
                    input.close();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
