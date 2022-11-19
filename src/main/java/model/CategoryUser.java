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
public class CategoryUser {
    int id;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CategoryUser(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public CategoryUser(ResultSet rs) throws SQLException{
        this.id = rs.getInt("categoryId");
        this.name = rs.getString("categoryName");
    }
    public HashMap<String, String> getData(){
        HashMap<String, String> map = new HashMap<>();
        map.put("categoryName", this.name);
        return map;
    }
}
