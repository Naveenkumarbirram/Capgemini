package Assignments;

public class CarObject 
{
	//Declaring variables
	//Car has a name,model,price
	String Carname;
	String model;
	double price;
	//Creating Constructor and initializing
	public CarObject(String carname, String model, double price) {
		super();
		Carname = carname;
		this.model = model;
		this.price = price;
	}
	//Creating Method
	void CarDetails()
	{
		System.out.println("Car name is: "+Carname);
		System.out.println("Car model is: "+model);
		System.out.println("Car price is: "+price);
	}
	public static void main(String[] args)
	{
		//Creating Objects for class
		CarObject obj1=new CarObject("BMW","2021",100000);
		CarObject obj2=new CarObject("RR","2020",200000);
		CarObject obj3=new CarObject("Audi","2019",750000);
		//Invoking or calling methods
		System.out.println("=======================");
		obj1.CarDetails();
		System.out.println("=======================");
		obj2.CarDetails();
		System.out.println("=======================");
		obj3.CarDetails();
		System.out.println("=======================");
		
		
	}

}
