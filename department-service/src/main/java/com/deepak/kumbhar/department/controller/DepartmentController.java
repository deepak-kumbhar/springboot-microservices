package com.deepak.kumbhar.department.controller;

import com.deepak.kumbhar.department.entity.Department;
import com.deepak.kumbhar.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;


    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        log.info("In saveDepartment of DepartmentController");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department getDepartment(@PathVariable("id") Long departmentId){
        log.info("In getDepartment of DepartmentController");
        return departmentService.getDepartment(departmentId);
    }

}
