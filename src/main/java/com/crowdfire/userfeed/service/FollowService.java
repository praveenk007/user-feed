package com.crowdfire.userfeed.service;

import com.crowdfire.userfeed.dto.Follow;
import com.crowdfire.userfeed.factory.DaoFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

/**
 * @author kamathp
 * @version 0.0.1
 */
@Service
public class FollowService {

    @Autowired
    private DaoFactory daoFactory;

    public Mono<Boolean> follow(final Follow follow) {
        return daoFactory.getFollowRepository().save(follow.toModel())
                .map(updatedFollow -> Boolean.TRUE);
    }
}
