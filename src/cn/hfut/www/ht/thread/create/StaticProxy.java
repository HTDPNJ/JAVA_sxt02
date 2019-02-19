package cn.hfut.www.ht.thread.create;
/*
* 静态代理 设计模式*/
public class StaticProxy
{
    public static void main(String[] args)
    {
        Marry you =new You(); //创建真实角色
        WeddingCompany company=new WeddingCompany(you); //创建代理角色 +真实角色的引用
        //执行任务
        company.marry();
    }
}
interface Marry{
    public abstract void marry();
}

class You implements Marry{
    @Override
    public void marry()
    {
        System.out.println("you and someone marry");
    }
}

class WeddingCompany implements Marry{
    private Marry you;

    public WeddingCompany()
    {
    }
    public WeddingCompany(Marry you)
    {
        this.you = you;
    }
    private void before(){
        System.out.println("布置窝");
    }
    private void after(){
        System.out.println("闹玉兔");
    }
    @Override
    public void marry()
    {
        before();
        you.marry();
        after();
    }
}
