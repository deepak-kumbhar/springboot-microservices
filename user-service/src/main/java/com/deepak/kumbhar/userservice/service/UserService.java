package com.deepak.kumbhar.userservice.service;

import com.deepak.kumbhar.userservice.VO.Department;
import com.deepak.kumbhar.userservice.VO.ResponseTemplate;
import com.deepak.kumbhar.userservice.entity.User;
import com.deepak.kumbhar.userservice.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    public User saveUser(User user) {
        log.info("In saveUser of UserService");
        return userRepository.save(user);
    }

    public ResponseTemplate getUserWithDepartment(Long userId) {
        log.info("In getUserWithDepartment of UserService");
        ResponseTemplate responseTemplate = new ResponseTemplate();
        User user = userRepository.findByUserId(userId);

        Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/" + user.getDepartmentId(), Department.class);

        responseTemplate.setUser(user);
        responseTemplate.setDepartment(department);

        return responseTemplate;
    }
}
