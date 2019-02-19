package cn.hfut.www.ht.IO.OtherStream;

import java.io.*;

public class ByteArrayDemo01
{
    public static void main(String[] args) throws IOException
    {
        read(write());
    }
    public static byte[] write() throws IOException
    {
        byte[] dest;
        ByteArrayOutputStream bos=new ByteArrayOutputStream();
        String msg="操作与文件输入流一致";
        byte[] info=msg.getBytes();
        bos.write(info,0,info.length);
        //写出到bos中
        dest=bos.toByteArray();
        bos.close();

        return dest;
    }
    public static void read(byte[] src)throws IOException
    {
        InputStream is=new BufferedInputStream(new ByteArrayInputStream(src));

        byte[] flush=new byte[1024];
        int len=0;
        while(-1!=(len=is.read(flush))){
            System.out.println(new String(flush,0,len));
        }
        is.close();
    }
}
