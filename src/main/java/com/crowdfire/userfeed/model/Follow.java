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
@Table("follow")
public class Follow {

    @Id
    private Long id;

    private Long followerId;

    private Long followeeId;
}
