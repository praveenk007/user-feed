package com.crowdfire.userfeed.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

/**
 * @author kamathp
 * @version 0.0.1
 */
@Data
@Builder
@Table("account")
public class Account {

    @Id
    private long id;

    private String firstName;

    private String lastName;

    private String displayName;
}
