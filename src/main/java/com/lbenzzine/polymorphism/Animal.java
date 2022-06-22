package com.lbenzzine.polymorphism;

class Animal {
	public void animalSound() {
		System.out.println("The animal makes a sound");
	}
}

class Cat extends Animal {
	public void animalSound() {
		System.out.println("The cat says: meow meow");
	}
}

class Dog extends Animal {
	public void animalSound() {
		System.out.println("The dog says: bow wow");
	}
}

class Main {
	public static void main(String[] args) {
		Animal myAnimal = new Animal();
		Animal myCat = new Cat();
		Animal myDog = new Dog();

		System.out.println("The myAnimal is of type Animal");
		System.out.println("myAnimal.animalSound()" + " prints :");
		myAnimal.animalSound();

		System.out.println("After the assignment myAnimal " + "= " + "myCat");
		myAnimal = myCat;
		System.out.println("The myAnimal is now a cat " + "myAnimal.animalSound()" + " prints :");
		myAnimal.animalSound();
		System.out.println("myCat.animalSound()" + " prints :");
		myCat.animalSound();
		System.out.println("myDog.animalSound()" + " prints :");
		myDog.animalSound();
	}
}
