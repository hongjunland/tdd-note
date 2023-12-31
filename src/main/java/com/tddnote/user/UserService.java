package com.tddnote.user;

import lombok.RequiredArgsConstructor;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User createUser(UserDto userDto){
        User user = User.builder()
                .name(userDto.getName())
                .build();
        return userRepository.save(user);
    }
    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findByUserId(Long userId)  {
        return userRepository.findById(userId).orElseThrow(EntityNotFoundException::new);
    }
}
