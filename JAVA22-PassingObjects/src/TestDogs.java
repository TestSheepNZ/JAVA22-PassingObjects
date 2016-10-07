import org.junit.Test;

/*
 * This program is part of my learning Java series
 * This one looks at passing methods
 * 
 * Find the blog here,
 * http://testsheepnz.blogspot.co.nz/2016/09/java-22-methods-arent-always-pass-by.html
 * 
 * For more information - please reread.
 * 
 * Mike Talks, Sept 2016
 */

public class TestDogs {
	
	public void changeNameByString (String name)
	{
		name = "Fido";
		System.out.println("Changed name string to " + name);
	}

	public void changeNameUsingMethod (DogClass myDog)
	{
		myDog.setName("Ralf");
		System.out.println("changeNameUsingMethod dog is " + myDog.getName());
	}
	
	public void changeNameUsingAttribute (DogClass myDog)
	{
		myDog.name = "Mr Flibble";
		System.out.println("changeNameUsingAttribute dog is " + myDog.getName());
	}
	
	public void getNewDog (DogClass myDog)
	{
		myDog = new DogClass("Bertie");
		System.out.println("getNewDog dog is " + myDog.getName());
	}

	public DogClass returnNewDog (DogClass myDog)
	{
		myDog = new DogClass("Isis");
		System.out.println("returnNewDog dog is " + myDog.getName());
		return myDog;
	}
	
	@Test
	public void whoIsMyDog()
	{
		DogClass thisDog = new DogClass("Max");
		System.out.println("thisDog dog is " + thisDog.getName());
		
		changeNameByString(thisDog.name);
		System.out.println("thisDog dog is " + thisDog.getName());
		
		getNewDog(thisDog);
		System.out.println("thisDog dog is " + thisDog.getName());	

		changeNameUsingMethod(thisDog);
		System.out.println("thisDog dog is " + thisDog.getName());

		changeNameUsingAttribute(thisDog);
		System.out.println("thisDog dog is " + thisDog.getName());

		thisDog = returnNewDog(thisDog);
		System.out.println("thisDog dog is " + thisDog.getName());		
	}
}
