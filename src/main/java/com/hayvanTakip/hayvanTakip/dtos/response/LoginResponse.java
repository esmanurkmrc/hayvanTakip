package com.hayvanTakip.hayvanTakip.dtos.response;

public class LoginResponse {
    private Integer userId;
    private String email;
    private String roleName;

    public LoginResponse(Integer userId, String email, String roleName) {
        this.userId = userId;
        this.email = email;
        this.roleName = roleName;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
