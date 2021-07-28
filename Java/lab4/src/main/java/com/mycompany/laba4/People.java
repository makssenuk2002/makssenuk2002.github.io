/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.laba4;


public class People {
    private String name;
    private String fio;

    public People(String name, String fio) {
        this.name = name;
        this.fio = fio;
    }

    public String getName() {
        return name;
    }

    public String getFio() {
        return fio;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }          
}
