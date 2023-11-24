/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.example;

/**
 *
 * @author seiri
 */
public class JsonObject {
    double remPageLength;
    double remPageBredth;
    int  numberOfCut;

    public JsonObject(double remPageLength, double remPageBredth, int numberOfCut) {
        this.remPageLength = remPageLength;
        this.remPageBredth = remPageBredth;
        this.numberOfCut = numberOfCut;
    }

    @Override
    public String toString() {
        return "JsonObject{" + "remPageLength=" + remPageLength + ", remPageBredth=" + remPageBredth + ", numberOfCut=" + numberOfCut + '}';
    }

    public double getRemPageLength() {
        return remPageLength;
    }

    public void setRemPageLength(double remPageLength) {
        this.remPageLength = remPageLength;
    }

    public double getRemPageBredth() {
        return remPageBredth;
    }

    public void setRemPageBredth(double remPageBredth) {
        this.remPageBredth = remPageBredth;
    }

    public int getNumberOfCut() {
        return numberOfCut;
    }

    public void setNumberOfCut(int numberOfCut) {
        this.numberOfCut = numberOfCut;
    }

  
    
    
    
    
    
    
    
    
}
