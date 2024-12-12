package com.group.ssafycoffeeTest_app.controller.user;

import com.group.ssafycoffeeTest_app.dto.user.request.UserCreateRequest;
import com.group.ssafycoffeeTest_app.dto.user.response.UserResponse;
import com.group.ssafycoffeeTest_app.service.user.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user")  // /users/user 경로로 POST 요청 처리
    public void saveUser(@RequestBody UserCreateRequest request) {
        System.out.println("----------------------------------------------");

        System.out.println(request.getMMID()); // null
        System.out.println(request); // com.group.ssafycoffeeTest_app.dto.user.request.UserCreateRequest@1367b0de
        System.out.println("----------------------------------------------");
        userService.saveUser(request);  // UserService에서 사용자 생성
    }

    // 사용자 목록 조회
    @GetMapping("/user")  // /users/user 경로로 GET 요청 처리
    public List<UserResponse> getUsers() {
        return userService.getUsers();  // UserService에서 모든 사용자 목록 조회
    }

}
