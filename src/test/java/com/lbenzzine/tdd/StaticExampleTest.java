package com.lbenzzine.tdd;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.lbenzzine.statickeyword.Person;

public class StaticExampleTest {



@Test
public void whenNumberOfPersonObjectsInitialized_thenStaticCounterIncreases() {
    new Person("Jack", "jack@mail.net");
    new Person("Pedro", "pedro@mail.net");
 
    assertEquals(2, Person.numberOfPeople);
}

}