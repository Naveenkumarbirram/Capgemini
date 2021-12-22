package collections;
// A Java program to demonstrate use of Comparable
import java.io.*;
import java.util.*;
import java.util.*;

// A class 'Movie' that implements Comparable
class Movie implements Comparable<Movie>
{
	private double rating;
	private String name;
	private int year;

	// Used to sort movies by year
	public int compareTo(Movie m)
	{
		int cmd=name.compareTo(m.name);
		if(cmd==0)
		{
			return Double.compare(rating, m.rating);
		}
		return cmd;
		//return this.year - m.year;
		//we can also implement logic like this...
		//		if(this.getYear()>m.getYear())
		//			return 1;
		//		else
		//			return -1;
	}

	// Constructor
	public Movie(String nm, double rt, int yr)
	{
		this.name = nm;
		this.rating = rt;
		this.year = yr;
	}

	// Getter methods for accessing private data
	public double getRating() { return rating; }
	public String getName() { return name; }
	public int getYear()	 { return year; }
}

// Driver class
class Comparator
{
	public static void main(String[] args)
	{
		ArrayList<Movie> list = new ArrayList<>();
		list.add(new Movie("Force Awakens", 8.3, 2015));
		list.add(new Movie("Star Wars", 8.7, 1977));
		list.add(new Movie("Empire Strikes Back", 8.8, 1980));
		list.add(new Movie("Return of the Jedi", 8.4, 1983));
		//comparable Interface
		//		Comparator<Movie> com=new Comparator<Movie>()
		//			public int compare(Movie m1,Movie m2)
		//		    {
		//			   if(m1.getYear()>m2.getYear())
		//				   return 1;
		//			   else
		//				   return -1;
		//			
		//		    }
		//
		//		};
		Collections.sort(list);;

		System.out.println("Movies after sorting : ");
		for (Movie movie: list)
		{
			System.out.println(movie.getName() + " " +
					movie.getRating() + " " +
					movie.getYear());
		}
	}
}
