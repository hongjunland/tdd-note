package com.tddnote;

import com.tddnote.person.Name;
import com.tddnote.person.Person;
import com.tddnote.person.PersonId;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class TddNoteApplicationTests {

   @Test
    void person_테스트(){
       Person person = new Person(
               new PersonId(2133),
               new Name("Hong", "GilDong")
       );
       System.out.println(person);
   }

}

