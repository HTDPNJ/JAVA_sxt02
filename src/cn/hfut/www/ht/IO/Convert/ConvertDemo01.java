package cn.hfut.www.ht.IO.Convert;

import java.io.UnsupportedEncodingException;

public class ConvertDemo01
{
    public static void main(String[] args)throws UnsupportedEncodingException
    {

    }
    public static void test01() throws UnsupportedEncodingException{
        String str="中国";
        byte[] data=str.getBytes();
        System.out.println(new String(data));
        data=str.getBytes("Unicode"); //设定编码字符集
        System.out.println(new String(data,"Unicode"));
    }
}
