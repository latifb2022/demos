
for testing the inheritance program use

input:

Heraldo Memelli 8135627
2
100 90

for testing the generics example use 

input:

3
1
2
3

2
Hello
World

to test abstracts example use 

input:
The Alchemist
Paulo Coelho
248


TDD

In a very simplified manner, the three main steps in each cycle are:

Writing tests – define requirements in the form of tests
Implementing features – make the tests pass without focusing too much on the elegance of the code
Refactoring – improve the code to make it easier to read and maintain while still passing the tests
We'll go through these TDD cycles for some methods of the List interface, starting with the simplest ones.


isEmpty Method cycle

1- return false
2- return true
3- add element in the Test
4- need to implement add ( start with return false)
5- add method internal = new Object[] { element };
6- enhance isEmpty check internal.length with if/else as so:
if (internal.length != 0) {
			return false;
		} else {
			return true;
		}
7- refactor isEmpty further.