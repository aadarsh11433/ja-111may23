package com.Problem3;

public class Main {

	public static void main(String[] args) {
		
		Car c1  =new Car();
		c1.model ="500xuv";
		c1.companyName ="Maruti";
		c1.Color ="red";
		c1.engine.rmp = 500;
		c1.engine.Power = 5000;
		c1.engine.manufacturer ="suzuki";
		c1.engine.enabler();
		
		Engine e =new Engine();
		Car c2 = new Car("400lkp","renault","black",e,300,1000,"duster"); 

	}

}
