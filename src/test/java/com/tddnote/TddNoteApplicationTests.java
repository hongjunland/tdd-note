package com.tddnote;

import com.tddnote.user.User;
import com.tddnote.user.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;

@SpringBootTest
class TddNoteApplicationTests {
   @Autowired
   private UserRepository userRepository;

   @Test
    void person_테스트(){
       User user1 = User.builder()
               .name("zxc")
               .build();
       userRepository.save(user1);
      User user2 = userRepository.findById(1L).orElseThrow();
      User user3 = userRepository.findById(1L).orElseThrow();
      System.out.println(user2==user3);
      System.out.println(user2.equals(user3));
      System.out.println(user2.getId());
      System.out.println(user3.getId());
   }

}
