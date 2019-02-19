package cn.hfut.www.ht.IO.charIO;

import java.io.*;

public class BufferedCharDemo
{
    public static void main(String[] args)throws IOException
    {
        File src=new File("G:/aaaa/1234.txt");
        File dest=new File("G:/aaaa/copy12.txt");
        BufferedReader read=null;
        BufferedWriter wr=null;
        read=new BufferedReader(new FileReader(src));
        wr=new BufferedWriter(new FileWriter(dest));
//        char[] flush=new char[1024];
//        int len=0;
//        while(-1!=(len=read.read(flush))){
//            wr.write(flush,0,len);
//        }
        String line=null;
        while(null!=(line=read.readLine())){
            wr.write(line);
            wr.newLine();
    }
        wr.flush();
        wr.close();
        read.close();
    }
}
