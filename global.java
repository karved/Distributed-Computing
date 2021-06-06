import java.util.*;

class Clock{
    int hr;
    float min;
    float sec;

    Clock(){
        this.hr = 0;
        this.min = 0;
        this.sec = 0;
    }
    Clock(int hr,float min){
        this.hr = hr;
        this.min = min;
        this.sec = 0;
    }

    public void checkTime() {

        if (this.sec > 60) {
            this.sec -= 60;
            this.min += 1;
        }
        if (this.min > 60) {
            this.min -= 60;
            this.hr += 1;
        }
        if (this.hr > 23) {
            this.hr = 0;
        }
    
    }

    public void incrTime(float t){
        this.min += t;
        checkTime();
        System.out.println(getTime());
    }

    public String getTime(){
        return (this.hr + ":" + (int)this.min + ":" + (int)this.sec);
    }

}
class global{

    public static float diff(Clock a, Clock b) {
        float d = 0;
        if (a.hr > b.hr) {
            d += 60;
        } else if (a.hr < b.hr) {
            d -= 60;
        }
        d = a.min - b.min;
        
        return d;
    }
   

    public static float[] averageTime(int n,int j,Clock[] c){
        float[] numerator = new float[c.length];
        for( int i = 0 ; i < c.length ; i++ ){
                numerator[i] = diff(c[i],c[j]);
        }
        return numerator;

    }

    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of Processes:");
        int n = sc.nextInt();

        System.out.println("Enter the clock time:");
        Clock[] c = new Clock[n];

        for( int i = 0 ; i < n ; i++ ){

            System.out.print("For Clock " + (i+1) + ": ");
            String inpt = sc.next();
            String[] inp = inpt.split(":");
            c[i] = new Clock(Integer.parseInt(inp[0]),Float.parseFloat(inp[1]));

        }

        System.out.println("Enter the internal clock time: ");
        float t = sc.nextFloat();
        float[] avg = new float[n];

        for( int i = 0 ; i < n ; i++ ){
            float[] ret = global.averageTime(n,i,c);
            for( int j = 0 ; j < n ; j++ ){
                avg[j] += ret[j];
            }
            if( i < n-1 ){
                for (int j = 0; j < n; j++) {
                    c[j].incrTime(t);
                }
            }
        }

        for( int i = 0 ; i < n ; i++ ){
            avg[i] /= n;
        }
            
        for( int i = 0 ; i < n ; i++ ){
            c[i].min -= (avg[i]);
            c[i].sec = (c[i].min - (int)c[i].min) * 60;
            System.out.println("Current time : " + c[i].getTime() + "   Skew time : " + avg[i]);
        }
       
        sc.close();

    }
}