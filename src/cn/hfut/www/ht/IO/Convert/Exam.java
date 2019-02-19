package cn.hfut.www.ht.IO.Convert;
import java.util.Scanner;
public class Exam
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        s=s.replace(" ","");
        char[] arr=s.toCharArray();
        if(s.length()<7){
            System.out.println(s);
        }else if(s.length()<15){
            for(int i=0;i<6;i++){
                System.out.print(arr[i]);
            }
            System.out.print(" ");
            for(int i=6;i<s.length();i++){
                System.out.print(arr[i]);
            }
        }else {
            for(int i=0;i<6;i++){
                System.out.print(arr[i]);
            }
            System.out.print(" ");
            for(int i=6;i<14;i++){
                System.out.print(arr[i]);
            }
            System.out.print(" ");
            for(int i=14;i<s.length();i++){
                System.out.print(arr[i]);
            }
        }

    }
}
