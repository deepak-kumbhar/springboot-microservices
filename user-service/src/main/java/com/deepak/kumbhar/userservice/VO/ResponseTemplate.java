package com.deepak.kumbhar.userservice.VO;

import com.deepak.kumbhar.userservice.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTemplate {

    private User user;
    private Department department;
}
