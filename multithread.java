class multithreadingDemo extends Thread
{
public void run()
{
try
{
System.out.println("thread"+Thread.currentThread().getId()+"is running");
}
catch(Exception e)
{
System.out.println("Exception is caught");
}
}
}
class multithread
{
public static void main(String[] args)
{
int n=8;
for(int i=0;i<8;i++)
{
multithreadingDemo object=new multithreadingDemo();
object.start();
}
}
}


