package com.lbenzzine.statickeyword;

class StaticExample {
	
	public static void main (String [] args) {
		
		Person p1 = new Person( "John", "john@mail.net");
		Person p2 = new Person( "Matt", "mattn@mail.net");
		
		System.out.println("the numer of people is now : " + Person.numberOfPeople);
		//to be avoided because it leads to confusion, we no longer know if it's a class variable  or instance variable
		System.out.println("the numer of people is now : " + p1.numberOfPeople);
		
		int n = 4;
		System.out.println ( 4 * Math.PI);
	}

}

public class Person {
    private String name;
    private String email;
    
    public static int numberOfPeople;
    
    public Person(String name, String email) {
        this.name = name;
        this.email = email;
        numberOfPeople++;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static int getNumberOfPeople() {
		return numberOfPeople;
	}

	public static void setNumberOfPeople(int numberOfPeople) {
		Person.numberOfPeople = numberOfPeople;
	}

   
}
