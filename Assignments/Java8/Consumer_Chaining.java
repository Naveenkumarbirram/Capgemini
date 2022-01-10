package Java8;

import java.util.function.Consumer;

class Movie
{
	String name;
	Movie(String name)
	{
		this.name=name;
	}	
}
public class Consumer_Chaining 
{
	public static void main(String[] args)
	{
		Consumer<Movie> c1=m->System.out.println(m.name+" at to release");
		Consumer<Movie> c2=m->System.out.println(m.name+" release b anf big hit movie");
		Consumer<Movie> c3=m->System.out.println(m.name+" Collection of that movue also is veru high");
		Consumer<Movie> cc=c1.andThen(c2).andThen(c3);
		Movie m=new Movie("Bahubali");
		c1.accept(m);
		System.out.println();
		//If i want to print all Consumers
		cc.accept(m);
		
	}

}
