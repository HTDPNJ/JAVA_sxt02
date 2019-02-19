package cn.hfut.www.ht.IO.charIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Demo02
{
    public static void main(String[] args) throws IOException
    {
        String path="G:/aaaa/12345.txt";
        File outfile=new File(path);
        Writer wr=new FileWriter(outfile);
        String str="yyaaaaaabbb";
        wr.write(str);
        wr.close();
    }
}
