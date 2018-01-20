package javacore;

public class Bike8 {
	public void finalize(){System.out.println("finalize duoc goi");}  
	public static void main(String[] args){  
		Bike8 f1=new Bike8();  
		Bike8 f2=new Bike8();  
	f1=null;  
	f2=null;  
	System.gc();  
	}
}
