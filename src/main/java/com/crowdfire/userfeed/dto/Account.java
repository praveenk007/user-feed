package com.crowdfire.userfeed.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

/**
 * @author kamathp
 * @version 0.0.1
 */
@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Account {

    private Long id;

    private String firstName;

    private String lastName;

    private String displayName;

    public com.crowdfire.userfeed.model.Account toModel() {
        com.crowdfire.userfeed.model.Account account =  com.crowdfire.userfeed.model.Account
                .builder()
                .firstName(this.getFirstName())
                .lastName(this.getLastName())
                .displayName(this.getDisplayName())
                .build();
        if(null != this.getId()) {
            account.setId(this.getId());
        }
        return account;
    }

    public static Account toDTO(com.crowdfire.userfeed.model.Account account) {
        if(account == null) {
            return null;
        }
        return Account
                .builder()
                .id(account.getId())
                .firstName(account.getFirstName())
                .lastName(account.getLastName())
                .displayName(account.getDisplayName())
                .build();
    }
}
