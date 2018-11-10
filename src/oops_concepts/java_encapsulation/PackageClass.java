package oops_concepts.java_encapsulation;
public class PackageClass
{  
	public static void main(String args[])
	{  

		Package p=Package.getPackage("java.lang");  
		System.out.println("package name: "+p.getName());  
		System.out.println("Specification Title: "+p.getSpecificationTitle());  
		System.out.println("Specification Vendor: "+p.getSpecificationVendor());  
		System.out.println("Specification Version: "+p.getSpecificationVersion());  
		System.out.println("Implementaion Title: "+p.getImplementationTitle());  
		System.out.println("Implementation Vendor: "+p.getImplementationVendor());  
		System.out.println("Implementation Version: "+p.getImplementationVersion());  
		System.out.println("Is sealed: "+p.isSealed());  
	}  
}  