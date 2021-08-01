package com.java;

public class RoosterDelegation {
	
   Chicken chkn= new Chicken();
  
   void fly() {
	   chkn.fly();
	  
		}

	  void sing() {

		  System.out.println("Cock-a-doodle-doo");
	}
	  void walk(){
		  chkn.walk();
			}
}
