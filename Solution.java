package com.java;

import com.java.Animal;

import com.java.Duck;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

	public static void main(String[] args) {
		System.out.println("Duck Implementation::");
		Animal myDuck =  new Duck();
		myDuck.walk();
		myDuck.fly();
		myDuck.sing();
		System.out.println("Chicken Implementation::");
		Animal myChicken =  new Chicken();
		myChicken.walk();
		myChicken.fly();
		myChicken.sing();
		System.out.println("Rooster Implementation::");
		Animal myRooster =  new Rooster();
		myRooster.walk();
		myRooster.fly();
		myRooster.sing();
		System.out.println("Rooster Delegation Implementation::");
		RoosterDelegation myRoosterDel =  new RoosterDelegation();
		myRoosterDel.walk();
		myRoosterDel.fly();
		myRoosterDel.sing();
		System.out.println("Rooster Living With Dogs Implementation::");
		Parrot myParrotwithDogs =  new Parrot();
		myParrotwithDogs.livingWith(new Dog());
		myParrotwithDogs.walk();
		myParrotwithDogs.fly();
		myParrotwithDogs.sing();
		System.out.println("Parrot Living With Cats Implementation::");
		Parrot myParrotwithCats =  new Parrot();
		myParrotwithCats.livingWith(new Cat());
		myParrotwithCats.walk();
		myParrotwithCats.fly();
		myParrotwithCats.sing();
		System.out.println("Parrot Living With Rooster Implementation::");
		Parrot myParrotWithRoosters =  new Parrot();
		myParrotWithRoosters.livingWith(new Rooster());
		myParrotWithRoosters.walk();
		myParrotWithRoosters.fly();
		myParrotWithRoosters.sing();
	    System.out.println("Parrot Living With Ducks Implementation::");
		Parrot myParrotWithDucks =  new Parrot();
		myParrotWithDucks.livingWith(new Duck());
		myParrotWithDucks.walk();
		myParrotWithDucks.fly();
		myParrotWithDucks.sing();
		 System.out.println("Shark Implementation::");
	   Shark mySFish = new Shark();
	   mySFish.fly();
	   mySFish.sing();
	   mySFish.walk();
	   mySFish.swim();
	   mySFish.colour();
	   mySFish.eat();
	   mySFish.makeJokes();
	   System.out.println("Clownfish Implementation::");
	   Clownfish myCFish = new Clownfish();
	   myCFish.fly();
	   myCFish.sing();
	   myCFish.walk();
	   myCFish.swim();
	   myCFish.colour();
	   myCFish.eat();
	   myCFish.makeJokes();
	   System.out.println("Dolphin Implementation::");
	   Dolphin dolphin = new Dolphin();
	   dolphin.hasFishBehaviour(new Shark());
	   dolphin.fly();
	   dolphin.sing();
	   dolphin.swim();
	   dolphin.walk();
	   System.out.println("Butterfly Implementation::");
	   Butterfly myButterFly =  new Butterfly();
	   myButterFly.setCaterpiller(false);
	   myButterFly.fly();
	   myButterFly.sing();
	   myButterFly.walk();
	   System.out.println("Caterpilar Implementation::");
	   Butterfly myCaterpillar =  new Butterfly();
	   myCaterpillar.setCaterpiller(true);
	   myCaterpillar.fly();
	   myCaterpillar.sing();
	   myCaterpillar.walk();
	   System.out.println("Count of animals displayed::");
	   Animal[] animals = new Animal[]{
			   new Bird(),
			   new Duck(),
			   new Chicken(),
			   new Rooster(),
			   new Parrot(),
			   new Shark(),
			   new Clownfish(),
			   new Dog(),
			   new Butterfly(),
			   new Cat()
			   };
	   int countFlying = 0 ;
	   int countWalk = 0 ;
	   int countSing = 0 ;
	   int countSwim = 0 ;
	   for (Animal animal : animals) {
		   System.out.println(animal.getClass().getName() + "Starting count::");
		   if(animal.fly())
			   countFlying++;
		    if(animal.walk())
			   countWalk++;
		    if(animal.sing())
			   countSing++;
		    if(animal.swim())
			   countSwim++;
	}
	   System.out.println("Flying Animals: " + countFlying);
	   System.out.println("Walking Animals: " + countWalk);
	   System.out.println("Singing Animals: " + countSing);
	   System.out.println("Swimming Animals: " + countSwim);
	   System.out.println("Bonus Task Rooster::"); 
	   
	   Rooster myRstr = new Rooster();
	   List<String> arrayList = new ArrayList<String>(){{
                add("English");
	        add("Danish");
	        add("Dutch");
	        add("Finnish");
	        add("French");
	        add("German");
	        add("Greek");
	        add("Hebrew");
	        add("Hungarian");
	        add("Italian");
	        add("Japanese");
	        add("Portuguese");
	        add("Russian");
	        add("Swedish");
	        add("Turkish");
	        add("Urdu");
		}}; 
		
		for (String lang : arrayList) {
			myRstr.sing(lang);
		}
	}

}
