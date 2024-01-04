// Jose Guzman
// October 29, 2023
/*Wrote a method that returns the speed of a car.
The method takes as parameters the distance and time of a car.
The method returns the velocity of a car
*/
// File name: Speed.java
// To Compile in terminal type: javac Speed.java
// To Run in terminal type: java Speed

public class Speed{
	public static double speed(double distance, double time)
{
	return distance * time;
}

public static void main(String[] args)
{
	double d = 0, t = 0;
	/*
	Here is the table that you should print out for velocity.

	The distance starts at 0 meters then will start increasing by one for eah row,
	until it reaches 4.

	The time starts at 0 meters and increases by 3 every row. 
distance    time    speed
0.0     0.0     0.0
1.0     3.0     3.0
2.0     6.0     12.0
3.0     9.0     27.0
4.0     12.0     48.0

	*/
	System.out.println("distance  time  speed");
	for (d = 0.0; d < 5; d++ )
	{
		System.out.println(d+"     "+t+"     "+ speed(d, t) );
		t+=3;
	}// end of main
}// end of class
}