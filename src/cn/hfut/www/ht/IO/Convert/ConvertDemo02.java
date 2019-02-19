package cn.hfut.www.ht.IO.Convert;

import java.io.*;

public class ConvertDemo02
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(
                new InputStreamReader(//指定解码字符集
                new FileInputStream(new File("G:/aaaa/1234.txt")),"utf-8"));
        BufferedWriter bw=new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream( new File("G:/aaaa/c1234.txt")),"utf-8"));
        String line=null;
        while (null!=(line=br.readLine())){
            bw.write(line);
        }
        bw.flush();

    }
}
