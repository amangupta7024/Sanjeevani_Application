/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sanjeevaniapp.pojo;

/**
 *
 * @author HP
 */
public class UserPojo {

    public UserPojo(String LoginId, String UserName, String Password, String UserType) {
        this.LoginId = LoginId;
        this.UserName = UserName;
        this.Password = Password;
        this.UserType = UserType;
    }
    public UserPojo()
    {
        
    }

    public String getLoginId() {
        return LoginId;
    }

    public void setLoginId(String LoginId) {
        this.LoginId = LoginId;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getUserType() {
        return UserType;
    }

    public void setUserType(String UserType) {
        this.UserType = UserType;
    }
    private String LoginId;
    private String UserName;
    private String Password;
    private String UserType;
    
}
