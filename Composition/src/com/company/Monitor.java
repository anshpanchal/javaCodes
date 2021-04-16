package com.company;

public class Monitor {
    private String model;
    private String manufacturer;
    private  int size;

    // This is basically the composition , here the resolution class is the part of Monitor, but monitor isn't the resolution
    // Resolution is the component of the monitor
    private Resolution motiveResolution;

    public Monitor(String model, String manufacturer, int size, Resolution motiveResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.motiveResolution = motiveResolution;
    }

    public void drawPixelAt(int x, int y, String color){
        System.out.println("Draw pixel at " + x + ", " + y + " in colour " + color );
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getMotiveResolution() {
        return motiveResolution;
    }
}
