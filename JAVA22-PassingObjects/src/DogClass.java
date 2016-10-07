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

public class DogClass {

	public String name;
	
	public DogClass (String dogName)
	{
		name = dogName;
	}
	
	public void setName (String dogName)
	{
		name = dogName;
	}
	
	public String getName()
	{
		return name;
	}
}
