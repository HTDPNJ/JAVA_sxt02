package cn.hfut.www.ht.IO.OtherStream;

import java.io.*;

/*
* 1、文件到字节数组
* 文件输入流
* 字节数组输出流
*
* 2、字节数组到文件
* 字节数组输入流
* 文件输出流
* */
public class ByteArrayDemo02
{
    public static void main(String[] args) throws IOException
    {
    }
    public static byte[] getBytesFromFile(String srcPath)throws FileNotFoundException,IOException{
        //创建文件源
        byte[] dest=null;
        File src =new File(srcPath);
        InputStream is=new BufferedInputStream(new FileInputStream(src));
        ByteArrayOutputStream bos=new ByteArrayOutputStream();

        byte[] flush=new byte[1024];
        int len=0;
        while(-1!=(len=is.read(flush))){
            bos.write(flush,0,len);
        }
        bos.flush();
        dest=bos.toByteArray();
        bos.close();
        is.close();
        return null;
    }
}
