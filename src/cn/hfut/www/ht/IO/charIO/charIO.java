package cn.hfut.www.ht.IO.charIO;

import java.io.*;

public class charIO
{
    public static void main(String[] args) throws IOException
    {
        File src=new File("G:/aaaa/1234.txt");
        Reader rd=new FileReader(src);
        char[] flush=new char[10];
        int len=0;
        while(-1!=(len=rd.read(flush))){
            String str=new String(flush,0,len);
            System.out.print(str);
    }
    }
}
