package codeguide;

/**
 * Super car is in the part of car
 * @author Patiphan Srisook
 *
 */

class Car {

	/**Default constructor of car*/
	public Car(){

    }

	/**Method to tell you are driving a car*/
    public void drive(){
        System.out.println("drive!!");
    }

    /**Method to tell you are stopping a car*/
    public void stop(){
        System.out.println("Breakk!!");
    }

    //And so on
}

public class Supercar extends Car{
	
	/**Default constructor of Supercar*/
	public Supercar(){
		
	}
	
	/**Turbo method*/
	public void Turbo(){
		System.out.println("BOOMM!!!");
	}
	
	public static void main (String args[]){
		Supercar s = new Supercar();
		s.drive(); //you see? we can use method drive from class Car 
		s.Turbo(); //and we car use turbo from class Supercar too
	}
}
