import java.io.*;
class Valuefun
{
    int a,b,e;

    public void input()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the value a:");
        a=Integer.parseInt(br.readLine());
        System.out.print("Enter the value b:");
        b=Integer.parseInt(br.readLine());
    }
    public void value()
    {
        e=a;
        a=b;
        b=e;
    }
    public void print()
    {
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
    public static void main(String args[])throws IOException
    {
        Valuefun vf=new Valuefun();
        vf.input();
        vf.value();
        vf.print();
    }
}