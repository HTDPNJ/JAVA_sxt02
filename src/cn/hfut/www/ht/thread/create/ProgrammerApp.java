package cn.hfut.www.ht.thread.create;

public class ProgrammerApp
{
    public static void main(String[] args)
    {
        Proprammer pro=new Proprammer();
        Thread proxy=new Thread(pro);
        proxy.start();
        for(int i=0;i<1000;i++){
            System.out.println("一边聊qq...");
        }
    }
}
