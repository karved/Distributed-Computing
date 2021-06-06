package Bully;

import java.util.*;

class abc{
    public static void main(String[] args)
    {
        System.out.println("Enter No.of inputs:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // System.out.print(a);
        System.out.println("Enter status:");
        int array [] = new int[n];
        for (int i=0;i<n;i++)
        {   
            System.out.print(i+1+": ");
            array[i] = sc.nextInt();
        }
        System.out.println("Enter initiator:");
        int init = sc.nextInt();

        int bt [] = new int[n];
        for ( int j =0 ; j< n; j++)
        {
            bt[j] = -1;
        }

        System.out.println();
        for (int w=init;w<n;w++)
        {
            System.out.println("Election message sent to "+ (w+1));
        }

        System.out.println();
        int a= 0;
        for (int i=(init); i<n; i++)
        {
            if( array[i] == 0)
            {
                bt[a] = i;
                System.out.println("Status of "+(i+1)+" : OK ");
                a++;
            }
        }

        System.out.println();

        for (int f = (init); f<n;f++)
        {
            System.out.println("Process "+(f+1));
            if ( array[f] == 0)
            {

                for (int s=(f+1);s<n;s++)
                {
                    System.out.println("Election message sent to "+ (s+1));
                }
            }
            else
            {
                System.out.println("Process Inactive");
            }
            System.out.println();

        }
            
        
        
        int k = -1;
        System.out.println();
        if ( bt[0] != -1)
        {
            for (k=0;k<a; k++)
            {
                System.out.println("Process:"+ (bt[k]+1));
                
                    for (int l= bt[k]; l<n; l++)
                    {
                        if( array[l] == 0 && l!= (bt[k]))
                        {
                            System.out.println("Status of "+(l+1)+" : OK");
                          
                        }
        
                    }
                    System.out.println();

                }
               
        }
            System.out.println("NO OK received \n");

        }

      
    }


