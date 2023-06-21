package com.example.springlv2.entity;

public enum UserRoleEnum {
    USER(Authority.USER);   // 사용자 권한

    private final String authority;


    UserRoleEnum(String authority) {
        this.authority = authority;
    }

    public String getAuthority() {
        return authority;
    }

    public static class Authority {
        public static final String USER = "ROLE_USER";
    }
}
