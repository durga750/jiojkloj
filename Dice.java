package com.dice;

import java.util.*;


public class Dice {
 int facevalue=0;
 public void roll() {
	Random r= new Random();
	facevalue=r.nextInt(6)+1;
      }
  }


class Player {
	String name;
	int pValue;
	Player(String name){
		this.name=name;
		
	   }
	public void throwDice(Dice d1,Dice d2) {
		d1.roll();
		d2.roll();
		pValue=d1.facevalue+ d2.facevalue;
		System.out.println(pValue);
	   }
  }
	
 class DiceGame {
	
	public static  void main(String[] args) {
          Scanner s=new Scanner(System.in);
             Dice d1=new Dice();
              Dice d2=new Dice();
	      System.out.println("enter 1st player name:");
	          Player p1= new Player(s.next());
	      System.out.println("enter 2nd player name:");
	        Player p2= new Player(s.next());
	    p1.throwDice(d1,d2);
     	p2.throwDice(d1,d2);
     	String res=" ";
     	if(p1.pValue > p2.pValue) {
     		res=p1.name +"wins game";
     	}
     	else if(p2.pValue > p1.pValue) {
     		res=p2.name +"wins game";
     	}
     	else {
     		res="piz try again";
     	} 
     	System.out.println(res);
	
 }}

