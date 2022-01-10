package Java8;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Vehicle
{
	String name;
	double price;
	public Vehicle(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}	
}
public class Consumer_Lambda 
{
	public static void main(String[] args) 
	{
		//Creating an object for Vehicle
		ArrayList<Vehicle> vehicles=new ArrayList<Vehicle>();
		vehicles.add(new Vehicle("Car",1000000));
		vehicles.add(new Vehicle("Bike",70000));
		vehicles.add(new Vehicle("Bus",2000000));
		vehicles.add(new Vehicle("Auto",200000));
		Function<Vehicle,String> f1=f->
		{
			String name=f.name;
			//String model;
			if(name=="Car") return "BMW";
			else if(name=="Bike") return "Royan Enfield";
			else if(name=="Bus") return "Ashoka LeyLand";
			else return "Simple Auto";
		};
		Predicate<Vehicle> p1=p->p.price>300000;
		Consumer<Vehicle> c=c1->
		{
			System.out.println("Vehicla Name: "+c1.name);
			System.out.println("Vehicle Price: "+c1.price);
			System.out.println("Vehicle Model: "+f1.apply(c1));
			System.out.println();
		};
		for(Vehicle vehicle:vehicles)
		{
			//This is for printing all the Vehicle details
			c.accept(vehicle);
            //This is for if the price is more than 300000
			if(p1.test(vehicle))
			{
				//Prinitng details of the vehicles using consumer
				c.accept(vehicle);
					
			}
		}

	}

}
