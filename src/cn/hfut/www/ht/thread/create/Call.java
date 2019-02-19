package cn.hfut.www.ht.thread.create;

import java.util.concurrent.*;

public class Call
{
    public static void main(String[] args)throws InterruptedException,ExecutionException
    {
        //创建线程
        ExecutorService ser=Executors.newFixedThreadPool(2);
        Race tortoise=new Race("老不死",1000);
        Race rabbit=new Race("小兔子",500);
        //获取值
        Future<Integer> result1=ser.submit(tortoise);
        Future<Integer> result2=ser.submit(rabbit);

        Thread.sleep(2000); //2s后停下来
        tortoise.setFlag(false); //停止线程体循环
        rabbit.setFlag(false);


        int num1=result1.get();
        int num2=result2.get();
        System.out.println("乌龟跑了--》"+num1);
        System.out.println("兔子跑了--》"+num2);
        //停止服务
        ser.shutdown();
    }
}
class Race implements Callable<Integer>{
    private String name;
    private long time;
    private boolean flag=true;
    private int step=0;
    public Race()
    {
    }
    public Race(String name)
    {
        this.name = name;
    }

    public Race(String name, long time)
    {
        this.name = name;
        this.time = time;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public long getTime()
    {
        return time;
    }

    public void setTime(long time)
    {
        this.time = time;
    }

    public boolean isFlag()
    {
        return flag;
    }

    public void setFlag(boolean flag)
    {
        this.flag = flag;
    }

    public int getStep()
    {
        return step;
    }

    public void setStep(int step)
    {
        this.step = step;
    }

    @Override
    public Integer call() throws Exception
    {
        while(flag){
            Thread.sleep(time);//延时
            step++;
        }
        return step;
    }
}
