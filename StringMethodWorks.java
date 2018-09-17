package usingStrings;

public class StringMethodWorks 
{
		public static void main(String[] args) 
	{
			String str="ABCDEFGHIJKLMN";
			String str1=new String("DEF");
			String str2="abc";

			char a=str.charAt(2);
			System.out.println(a);
			
			int b=str1.codePointAt(2);
			System.out.println(a);
			
			int c=str2.codePointBefore(1);
			System.out.println(c);
			
			int d=str.codePointCount(0, 2);
			System.out.println(d);
			
			int e=str.compareTo(str2);
			System.out.println(e);
			
			int f=str.compareToIgnoreCase(str1);
			System.out.println(f);
			
			String g=str.concat(str1);
			System.out.println(g);
			
			boolean h=str.contains(str1);
			System.out.println(h);
			
			boolean i=str1.contentEquals(str);
			System.out.println(i);
			
			boolean j=str2.contentEquals(str2);
			System.out.println(j);
			
			String k=str1.valueOf(str1);
			System.out.println(k);
			
			String l=str.valueOf(a);
			System.out.println(l); 
			
			boolean m=str2.endsWith(str2);
			System.out.println(m);
			
			boolean n=str.equals(g);
			System.out.println(n);
			
			boolean o=str.equalsIgnoreCase(str2);
			System.out.println(o);
			
			Object format = null;
			String p=str.format(l, format, args);
			System.out.println(p);
			
			String q=str2.format(p, null);
			System.out.println(q);
			
			byte[] r=str2.getBytes();
			System.out.println(r);
			
			byte[] s=str1.getBytes();
			System.out.println(s);
			
			int t=str.hashCode();
			System.out.println(t);
			
			int u=str.indexOf(f);
			System.out.println(u);
			
			String v=str.intern();
			System.out.println(v);

			boolean w=str1.isEmpty();
			System.out.println(w);
			
			boolean x=str.matches(str1);
			System.out.println(x);
			
			boolean y=str1.startsWith(p);
			System.out.println(y);		
	}
}
