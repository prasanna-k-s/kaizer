package com.kaizer.spring.batch.batch;

import com.kaizer.spring.batch.model.User;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import java.util.Date;

import static com.kaizer.spring.batch.config.SpringBatchConfig.DEPT_NAMES;

@Component
public class Processor implements ItemProcessor<User, User> {


    @Override
    public User process(User user) throws Exception {
        String deptCode = user.getDept();
        String dept = DEPT_NAMES.get(deptCode);
        user.setDept(dept);
        user.setTime(new Date());
        System.out.println(String.format("Converted from [%s] to [%s]", deptCode, dept));
        return user;
    }
}
