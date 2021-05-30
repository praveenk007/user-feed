package com.crowdfire.userfeed.factory;

import com.crowdfire.userfeed.service.FollowService;
import com.crowdfire.userfeed.service.UserService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author kamathp
 * @version 0.0.1
 */
@Data
@Service
public class ServiceFactory {

    @Autowired
    private UserService userService;

    @Autowired
    private FollowService followService;
}
