package com.crowdfire.userfeed.factory;

import com.crowdfire.userfeed.dao.FollowRepository;
import com.crowdfire.userfeed.dao.UserRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author kamathp
 * @version 0.0.1
 */
@Data
@Service
public class DaoFactory {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private FollowRepository followRepository;
}
