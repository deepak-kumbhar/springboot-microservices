package com.deepak.kumbhar.department.service;

import com.deepak.kumbhar.department.entity.Department;
import com.deepak.kumbhar.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {


    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public Department getDepartment(Long departmentId) {
        log.info("In getDepartment of DepartmentService");
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
