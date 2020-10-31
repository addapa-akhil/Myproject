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
MyDate d1=new MyDate(31,10,2020);
d1.display();
}
}

