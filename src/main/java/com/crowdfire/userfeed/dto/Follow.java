package com.crowdfire.userfeed.dto;

import lombok.Builder;
import lombok.Data;

/**
 * @author kamathp
 * @version 0.0.1
 */
@Data
@Builder
public class Follow {

    private Long followerId;

    private Long followeeId;

    public com.crowdfire.userfeed.model.Follow toModel() {
        return com.crowdfire.userfeed.model.Follow
                .builder()
                .followeeId(this.getFolloweeId())
                .followerId(this.getFollowerId())
                .build();
    }
}
