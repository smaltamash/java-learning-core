package java_io.io;
import java.io.IOException;
import java.io.PipedOutputStream;
import java.io.PipedInputStream;
public class PipedOutputStreamAndPipedInputStreamExample
{
	public static void main(String args[])throws IOException
	{
		final PipedOutputStream pout=new PipedOutputStream();
		final PipedInputStream pin=new PipedInputStream();
		pout.connect(pin); //connecting the streams
		//Creating one thread t1 which writes the data
		Thread t1=new Thread(){
			public void run()
			{
				try
				{
					for(int i=65;i<=90;i++)
					{
						pout.write(i);
						Thread.sleep(1000);
					}
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}           
			}
		};
		//Creating another thread t2 which reads the data
		Thread t2=new Thread(){
			public void run()
			{
				try
				{
					for(int i=65;i<=90;i++)
					{
						System.out.println(pin.read());
					}
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		};
		//Starting both Threads
		t1.start();
		t2.start();
	} 
}

