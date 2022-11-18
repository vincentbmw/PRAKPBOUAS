/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Cent
 */
public class User {
    int userId;
    String userName;
    String userPassword;
    String userEmail;
    String userGender;
    CategoryUser userCategory;
    int userFollowers;

    public User(int userId, String userName, String userPassword, String userEmail, String userGender, CategoryUser userCategory, int userFollowers) {
        this.userId = userId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userEmail = userEmail;
        this.userGender = userGender;
        this.userCategory = userCategory;
        this.userFollowers = userFollowers;
    }
}
