package Java8;
class Sample
{
	Sample()
	{
		System.out.println("Sample class Constructor Excution... ");
	}
}
interface interff
{
	public Sample m1();
}
public class Constructor_Reference 
{
	public static void main(String[] args) 
	{
		interff s=Sample::new;
		Sample s1=s.m1();
		Sample s2=s.m1();
		Sample s3=s.m1();
		Sample s4=s.m1();
	}
}
