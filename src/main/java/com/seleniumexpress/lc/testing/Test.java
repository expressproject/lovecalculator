package com.seleniumexpress.lc.testing;

class GrandParent{
	
   public void born() {
	   System.out.println("I did born in 18862");
   }
}
class Parent extends GrandParent{
	@Override
	 public void born() {
		   System.out.println("I did born in 1968");
	   }
	
	public void property() {
		System.out.println("I have done a goverment job");
	}
}
class Child extends Parent{
	@Override
	 public void born() {
		   System.out.println("I did born in 1992");
	   }
}

public class Test {
	
	public static void main(String[] args) {
		
		//GrandParent gp = new Parent(); // scinario 1
		//Parent p = new Child(); // scinario 2 
		//Child c = new Child(); // 3
		
		Parent p = new Child();
	    p.born(); // 1 scinariio // remove born from child class to confuse
	 
	  // GrandParent gp = new Parent();
	   //((Parent)gp).property();
	   
	   
	    GrandParent gp = new Parent();
	    Parent p1 = (Parent)gp;
		p1.property();
		
		GrandParent gp1 = new Child();
		Parent p3 = (Parent)gp1;// another scinario
		
		if(gp1 instanceof Parent) {
			System.out.println("inside if");
			Parent p4 = (Parent)gp1;
		}
		
	    
		GrandParent gp4 = new GrandParent();
		Parent p4 = (Parent)gp4;
		
		
		
	}

}
