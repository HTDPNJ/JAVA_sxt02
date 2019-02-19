package cn.hfut.www.ht.thread.create;

public class Proprammer implements Runnable
{
    @Override
    public void run()
    {
        for(int i=0;i<1000;i++){
            System.out.println("一边敲代码。。。");
        }
    }
}
