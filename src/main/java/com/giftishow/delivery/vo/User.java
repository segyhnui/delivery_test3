package com.giftishow.delivery.vo;

import lombok.Data;

@Data
public class User {

    private String userId;
    private String userPw;

    public User(String userId, String userPw) {
        this.userId = userId;
        this.userPw = userPw;
    }


}
