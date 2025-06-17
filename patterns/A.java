
/* class A
{
public static void  main(String [] args)
{
int n=6;
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
System.out.print("* ");
}
System.out.println(" ");
}
}
}
o/p:
* * * * * *
* * * * * *
* * * * * *
* * * * * *
* * * * * *
* * * * * * 
class A
{
public static void  main(String [] args)
{
int i=6;
for(int i=1;i<n;i++)
{
for(int j=1;j<n;j++)
{
System.out.print(j);
}
System.out.println(" ");
}
}
}
o/p:
12345
12345
12345
12345
12345
import java.util.Scanner;
class  A
{
public static void  main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter n:");
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
System.out.print(i+" ");
}
System.out.println(" ");
}
}
}
o/p:
enter n:
5
1 1 1 1 1
2 2 2 2 2
3 3 3 3 3
4 4 4 4 4
5 5 5 5 5 
import java.util.Scanner;
class  A
{
public static void  main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter n:");
int n=sc.nextInt();
int x=1;
for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
System.out.print(x+" ");
x++;
}
System.out.println(" ");
}
}
}
o/p:
enter n:
5
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25 
import java.util.Scanner;
class  A
{
public static void  main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter n:");
int n=sc.nextInt();
int x=1;

for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
System.out.print(x+" ");

x++;
if(x>9)
x=1;
}
System.out.println(" ");
}
}
}
o/p:
enter n:
5
1 2 3 4 5
6 7 8 9 1
2 3 4 5 6
7 8 9 1 2
3 4 5 6 7 
import java.util.Scanner;
class  A
{
public static void  main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter n:");
int n=sc.nextInt();
int x=1;

for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
System.out.print(x+" ");
x=x+2;
}
System.out.println(" ");
}
}
}
o/p:
enter n:
5
1 3 5 7 9
11 13 15 17 19
21 23 25 27 29
31 33 35 37 39
41 43 45 47 49 
import java.util.Scanner;
class  A
{
public static void  main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter n:");
int n=sc.nextInt();

for(int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
System.out.print(j%2==0?"0":"1");
}
System.out.println(" ");
}
}
}
o/p:
enter n:
5
10101
10101
10101
10101
10101 
import java.util.Scanner;
class  A
{
public static void  main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter n:");
int n=sc.nextInt();
for ( int i = 0; i < n; i++) 
{  for ( int j = n - i; j > 1; j--)
 {
        System.out.print(" ");
  } 
 for (int j = 0; j <= i; j++)
 {
  System.out.print("* ");
}
System.out.println();
}
}
}
o/p:
enter n:
5
    *
   * *
  * * *
 * * * *
* * * * *    */
import java.util.Scanner;
class  A
{
public static void  main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter n:");
int n=sc.nextInt();
for ( int i = 1; i < n; i++) 
{  for ( int j = n - i; j > 1; j--)
 {
        System.out.print(" ");
  } 
 for (int j = 1; j <= i; j++)
 {
  System.out.print(2*j+" ");
}
System.out.println();
}
}
}


  

            
            
          