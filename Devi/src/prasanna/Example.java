package prasanna;

public class Example {
 int df;//instance variable
public void run() 
{
	System.out.println("fghj");
}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	System.out.println("dfh");
    new Example().df=100;
    new Example().run();//new classname .method name without any obj creation
    //System.out.println(df);
    Example test=new Example();//same class obj creation
    test.df=345;//variable
    System.out.println("fg" +"\n"+"gh "+test.df);
	}

}
