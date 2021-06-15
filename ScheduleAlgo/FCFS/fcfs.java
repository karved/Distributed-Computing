package ScheduleAlgo.FCFS;

import java.util.*;
class Main
{
    String name;
    int bt;
    int wt;
    int ta;

}
public class fcfs
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of process:");
        int i = sc.nextInt();
        Main obj[]=new Main[i];
        for(int j=0;j<i;j++)
        {
            obj[j]= new Main();
            System.out.println("\nEnter for process_"+(j+1)+":");
            System.out.println("Enter name of process:");
            obj[j].name=sc.next();
            System.out.println("Enter burst time:");
            obj[j].bt=sc.nextInt();
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
