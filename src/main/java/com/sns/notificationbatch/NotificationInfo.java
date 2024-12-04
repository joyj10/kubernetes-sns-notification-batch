package com.sns.notificationbatch;

import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;

@Getter
@Setter
public class NotificationInfo {
    private int followId;
    private String email;
    private String username;
    private String followerName;
    private int followerId;
    private ZonedDateTime followDateTime;
}
