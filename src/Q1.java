import java.util.Scanner;

public class Q1 {

    public static void main (String [] Args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the string");
        String s1= sc.nextLine();
        System.out.println("Enter the shift key");
        int s=sc.nextInt();
        if(s<=26&&s>=1)
        {
            int [] a= new int [s1.length()];
            for(int i =0;i<s1.length();i++)

            {
                if(s1.charAt(i)==' ')
                {
                    continue;
                }
                else{
                int temp=s1.charAt(i);
                temp=temp-s;
                a[i]=temp;
            }}
            for(int x =0;x<s1.length();x++)
            {
                if(a[x]==a[x+1])
                {
                    System.out.print(" ");
                    x++;
                }
                else
                {
                char y =(char) a[x];
                System.out.print(y);
            }}
        }
        else {
            System.out.println("Invalid Input");
        }
    }
      }

