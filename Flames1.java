package usingStrings;

import java.util.Scanner;

public class Flames1 
{
		public static void main(String ar[])
		 {
		  Scanner sc=new Scanner(System.in);
		  String name,fname,flm="flames";
		  System.out.println("Enter the person1 name...");
		  name=sc.next();
		  System.out.println("Enter the person2 name...");
		  fname=sc.next();
		  int l=name.length();
		  int gl=fname.length();
		  int num=0,tl=0; 
		  char n[]=name.toCharArray();
		  char gn[]=fname.toCharArray();
		  for(int i=0;i<l;i++)
		  {  
		   for(int j=0;j<gl;j++)
		   {
		    if(n[i]==gn[j])
		    {
		     n[i]='*';
		     gn[j]='*';
		     break;
		    }
		   }
		  }
		  String tname=new String(n);
		  tname=tname+(new String(gn));
		  tname=tname.replace("*","");
		  tl=tname.length();
		  System.out.println(tl);

		  for(int s=6;s>=2;s--)
		  {
		   if(tl>s)
		     num=tl-s;
		   else
		     num=tl;
		   while(num>s)
		   {
		     num=num-s;
		   } 
		   flm=flm.substring(num,flm.length())+(flm.substring(0,num-1)); 
		  }
		  switch(flm.charAt(0))
		  {
		   case 'f': System.out.println("Relationship = Friends"); break;
		   case 'l': System.out.println("Relationship = Lovers"); break;
		   case 'a': System.out.println("Relationship = Affections"); break;
		   case 'm': System.out.println("Relationship = Married"); break;
		   case 'e': System.out.println("Relationship = Enemy"); break;
		   case 's': System.out.println("Relationship = Brother & Sisters"); break;
		  }
		  //System.out.println("Name ="+flm);
		 }
}
