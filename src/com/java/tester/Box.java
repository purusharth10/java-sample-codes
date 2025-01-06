package com.java.tester;

public class Box {
    private int width;
    private int depth;
    private int height;


    public Box(int width,int depth,int height){
        this.width = width;
        this.depth = depth;
        this.height = height;
    }

    public String getBoxDimesion(){
        return "Box dimension are -> w:"+width+" d:"+depth+" h:"+height;
    }

    public boolean isBoxEqual(Box anotherBox){
        if(width == anotherBox.width && depth == anotherBox.depth && height == anotherBox.height){
            return true;
        }else{
            return false;
        }
    }
}
