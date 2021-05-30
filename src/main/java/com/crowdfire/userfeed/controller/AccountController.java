package com.crowdfire.userfeed.controller;

import com.crowdfire.userfeed.dto.Account;
import com.crowdfire.userfeed.dto.Response;
import com.crowdfire.userfeed.factory.ServiceFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @author kamathp
 * @version 0.0.1
 */
@RestController
public class AccountController {

    @Autowired
    private ServiceFactory serviceFactory;

    @PostMapping("/account")
    public Mono<ResponseEntity<Response<Account>>> create(@RequestBody Account account) {
        return serviceFactory.getUserService().create(account)
                .map(updatedAccount -> new ResponseEntity<>(Response.<Account>builder().data(updatedAccount).build(), HttpStatus.OK));
    }


}
