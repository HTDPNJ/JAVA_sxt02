package cn.hfut.www.ht.thread.create;

public class Web12306 implements  Runnable
{
    private int num=50;
    @Override
    public void run()
    {
        while(true){
            if(num<=0){
                break;
            }
            System.out.println(Thread.currentThread().getName()+"抢到了"+num--);
        }
    }

    public static void main(String[] args)
    {
        Web12306 web=new Web12306();
        Thread T1=new Thread(web,"路人甲");
        Thread T2=new Thread(web,"黄牛已");
        Thread T3=new Thread(web,"工程师");
        T1.start();
        T2.start();
        T3.start();
    }
}
