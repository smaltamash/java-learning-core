package java_new_features.java_9_features;
public class ProcessAPIImprovements 
{
	public static void main(String args[])
	{
		ProcessHandle currentProcess=ProcessHandle.current(); //Current ProcessHandle
		System.out.println("Process Id : "+currentProcess.pid()); //Process id
		System.out.println("Direct Children : "+currentProcess.children()); //Direct children of the process
		System.out.println("Class Name : "+currentProcess.getClass()); //Class Name
		System.out.println("Process Id : "+ProcessHandle.allProcesses()); //All current processes
		System.out.println("Process Info : "+currentProcess.info()); //Process info
		System.out.println("Is Process Alive : "+currentProcess.isAlive()); 
		System.out.println("Process's Parent : "+currentProcess.parent()); //Parent of the process
 	}
}