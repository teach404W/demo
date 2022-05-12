package com.example;

/**
 * Generiert eine Person
 */
public class Person {
    /**
     * 
     */
    private String name;
    
    
    /**
     * 
     */
    private int alter;

    /**
     * Default Konstruktor
     * 
     */
    public Person(){

    }

    /**
     * Gibt das alter zurück
     * @param pAlter
     */
    public void setAlter(int pAlter){
        this.alter = pAlter;
    }

    /**
     * Gibt den Namen zurück
     * @param pName
     */
    public void setName(String pName){
        this.name = pName;
    }


    /**
     * 
     * @return name
     */
    public String getName(){
        return this.name;
    }

    public int getAlter(){
        return this.alter;
    }
}
