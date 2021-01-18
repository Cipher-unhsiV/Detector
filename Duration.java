import java.io.*;
import java.util.*;
public class Duration
{
public static void main(String args[]) throws IOException
{
long des,cur;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the view count you want to reach: ");
des = sc.nextLong();
System.out.println("Enter the view count after watching for which you want to inspect: ");
cur = sc.nextLong();
long dif;
dif = des - cur;
System.out.println("Enter the duration of the video(format:- min.sec ): ");
float dur;
dur = sc.nextFloat();
System.out.println("Enter the number of views in "+dur+".Format to do the same is given below:-");
System.out.println("\n Subract the reading/views taken at the end of the video with that of the beginning and enter it below.\n");
long view = sc.nextLong();
float req_min = dif / view;
float req_hr = req_min / 60;
float req_days = req_hr / 24;
System.out.println("\nRequired number of minutes to reach "+des+" : "+req_min);
System.out.println("\nRequired number of hours to reach "+des+" : "+req_hr);
System.out.println("\nRequired number of days to reach "+des+" : "+req_days);
}
}