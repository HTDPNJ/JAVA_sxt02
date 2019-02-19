package cn.hfut.www.ht.IO.byteIo;

import java.io.*;

public class Demo04
{
    public static void main(String[] args)
    {
        String path="C:\\Users\\Oliver\\Desktop\\123.jpg";
        File file=new File(path);
        String copypath="C:\\Users\\Oliver\\Desktop\\123copy.jpg";
        File copyfile=new File(copypath);
        InputStream input=null;
        OutputStream out=null;
        try {
            input=new FileInputStream(file);
            byte[] car=new byte[1024];

            out=new FileOutputStream(copypath,true);
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
