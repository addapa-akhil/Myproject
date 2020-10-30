import java.util.*;
class MyDate
{
 private int day,month,year;

MyDate()
{
day=20; month=10;year=2020;
}

MyDate(int d,int m,int y)
{
day=d; month=m;year=y;
}

void display()
{
System.out.println(day+"/"+month+"/"+year);
}
 
public int getDay()
{
 return day;
}
public int getMonth()
{
return month;
}
public int getYear()
{
return year;
}

public void setDay(int a)
{
 day=a;
}

public void setMonth(int b)
{
month=b;
}

public void setYear(int c)
{
year=c;
}

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
MyDate d=new MyDate();
System.out.println("Enter day: " );
int a=sc.nextInt();
d.setDay(a);
System.out.println("Enter Month: ");
int b=sc.nextInt();
d.setMonth(b);
System.out.println("Enter Year: " );
int c=sc.nextInt();
d.setYear(c);

MyDate d1=new MyDate(19,10,2020);
d.display();
d1.display();
}
}

