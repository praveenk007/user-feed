package com.crowdfire.userfeed.controller;

import com.crowdfire.userfeed.dto.Account;
import com.crowdfire.userfeed.factory.ServiceFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @author kamathp
 * @version 0.0.1
 */
@RestController
public class FollowController {

    @Autowired
    private ServiceFactory serviceFactory;

    @PostMapping("/follow")
    public Mono<Account> follow(@RequestBody Account account) {
        return serviceFactory.getUserService().create(account);
    }}
