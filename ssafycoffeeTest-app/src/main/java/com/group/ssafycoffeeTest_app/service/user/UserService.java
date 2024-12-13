package com.group.ssafycoffeeTest_app.service.user;

import com.group.ssafycoffeeTest_app.domain.user.User;
import com.group.ssafycoffeeTest_app.domain.user.UserRepository;
import com.group.ssafycoffeeTest_app.dto.user.request.UserCreateRequest;
import com.group.ssafycoffeeTest_app.dto.user.response.UserResponse;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Transactional
    public void saveUser(UserCreateRequest request) {
        userRepository.save(new User(request.getAccount(),request.getPassword(), request.getName(), request.getMMID(),  request.getRefund()));
    }

    @Transactional(readOnly = true)
    public List<UserResponse> getUsers() {
        List<User> users = userRepository.findAll();  // 모든 사용자 조회
        return users.stream()
                .map(user -> new UserResponse(user.getAccount(), user.getName()))  // User -> UserResponse 변환
                .collect(Collectors.toList());  // 변환된 UserResponse 리스트 반환
    }
}
