/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
/**
 *
 * @author Cent
 */
public class User {
    int userId;
    int categoryId;
    String userName;
    String userPassword;
    String userEmail;
    String userGender;
    CategoryUser userCategory;
    int userFollowers;

    public User(int userId, int categoryId, String userName, String userPassword, String userEmail, String userGender, CategoryUser userCategory, int userFollowers) {
        this.userId = userId;
        this.categoryId = categoryId;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userEmail = userEmail;
        this.userGender = userGender;
        this.userCategory = userCategory;
        this.userFollowers = userFollowers;
    }
    
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public CategoryUser getUserCategory() {
        return userCategory;
    }

    public void setUserCategory(CategoryUser userCategory) {
        this.userCategory = userCategory;
    }

    public int getUserFollowers() {
        return userFollowers;
    }

    public void setUserFollowers(int userFollowers) {
        this.userFollowers = userFollowers;
    }
    
    public HashMap<String, String> getData() {
        HashMap<String, String> map = new HashMap<>();
        map.put("userName", this.userName);
        map.put("userPassword", this.userPassword);
        map.put("userEmail", this.userEmail);
        map.put("userGender", this.userGender);
        map.put("categoryId", String.valueOf(this.categoryId));
        map.put("userFollowers", String.valueOf(this.userFollowers));
        
        return map;
    }
    public User(ResultSet rs) throws SQLException {
        this.userId = rs.getInt("userId");
        this.userName = rs.getString("userName");
        this.userPassword = rs.getString("userPassword");
        this.userEmail = rs.getString("userEmail");
        this.userGender = rs.getString("userGender");
        this.categoryId = rs.getInt("categoryId");
        this.userFollowers = rs.getInt("userFollowers");
    }
}
