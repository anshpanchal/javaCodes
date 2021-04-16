package com.company;

public class Car {
    // But here i have passed as a field.
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    // Here I have passed the model as a parameter
    public void setModel(String model){
        // If we want to access the field in here for that we use " this" keyword and then use the field over here.
        String validModel = model.toLowerCase();
        if(validModel.equals("cayman") || validModel.equals("commodore")){
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }
    public String getModel(){
        return this.model;
    }
}
