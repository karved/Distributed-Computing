package ScheduleAlgo.SJF;

import java.util.*;
class Main1
{
    String name;
    int bt;
    int wt;
    int ta;

}
public class sjf
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of process:");
        int i = sc.nextInt();
        Main1 obj[]=new Main1[i];
        for(int j=0;j<i;j++)
        {
            obj[j]= new Main1();
            System.out.println("\nEnter for process_"+(j+1)+":");
            System.out.println("Enter name of process:");
            obj[j].name=sc.next();
            System.out.println("Enter burst time:");
            obj[j].bt=sc.nextInt();
        }
        Main1 temp;
        for(int j=0;j<i;j++)
        {
            for(int k=0;k<i-1;k++)
            {
                if(obj[k+1].bt<obj[k].bt)
                {
                    temp =new Main1();
                    temp=obj[k+1];
                    obj[k+1]=obj[k];
                    obj[k]=temp;
                }
            }
        }
        int w=0,s=0;
        for(int j=0;j<i;j++)
        {
            obj[j].wt=w;
            w=w+obj[j].bt;
            obj[j].ta=obj[j].bt+s;
            s=obj[j].ta;
        }
        System.out.println("\n**************************************************************************");
        System.out.println("Process \tBurst Time \t\tWait Time\t\tTurnA");
        System.out.println("**************************************************************************");
        float avwt=0,avta=0;
        for(int j=0;j<i;j++)
        {
            System.out.println(obj[j].name+"\t\t"+obj[j].bt+"\t\t\t"+obj[j].wt+"\t\t\t"+obj[j].ta);
            avwt=avwt+obj[j].wt;avta=avta+obj[j].ta;
        }
        avwt=avwt/i;
        avta=avta/i;
        System.out.println("\nAverage Waiting Time: "+avwt);
        System.out.println("Average TurnAround Time: "+avta+"\n");
    }
}
