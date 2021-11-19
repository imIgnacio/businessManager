/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.businessmanager;

import java.util.LinkedList;

/**
 *
 * @author Ignacio
 */
public class Warehouse {
    private String id;
    private String name;
    LinkedList partsList;
    
    public Warehouse(String id, String name) {
        this.id = id;
        this.name = name;
        this.partsList = new LinkedList();
    }
    
    public String getId() {
        return this.id;
    }
    
    public String getName() {
        return this.name;
    }
    
    public LinkedList getPartsList() {
        return this.partsList;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}
