package cn.hfut.www.ht.thread.create;
/*
* 模拟龟兔赛跑
* 1、创建进程继承thread的类, 重写run(线程体)*/
public class Rabbit extends Thread
{
    @Override
    public void run()
    {
        for(int i=0;i<100;i++){
            System.out.println("兔子跑了"+i+"步");
        }
    }
}

class Tortoise extends Thread
{
    @Override
    public void run()
    {
        for(int i=0;i<100;i++){
            System.out.println("乌龟跑了"+i+"步");
        }
    }
}
