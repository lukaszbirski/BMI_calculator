package com.example.BMI.calculator;

public class Bmi {

    private int height;
    private int weight;
    private double result;

    public Bmi(int height, int weight) {
        double heightDouble = (double) height/100;
        double weightDouble = (double) weight;
        this.height = height;
        this.weight = weight;
        this.result = weightDouble/(heightDouble*heightDouble);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public String getResultAsString(){
        return String.format("%.2f%n",result);
    }

    public String getDescription(){
        if (result < 16){
            return "wygłodzenie.";
        }
        else if (result >= 16 && result < 17){
            return "wychudzenie.";
        }
        else if (result >= 17 && result < 18.5){
            return "niedowagę.";
        }
        else if (result >= 18.5 && result < 25){
            return "wagę prawidłową.";
        }
        else if (result >= 25 && result < 30){
            return "nadwagę.";
        }
        else if (result >= 30 && result < 35){
            return "I stopień otyłości.";
        }
        else if (result >= 35 && result < 40){
            return "II stopień otyłości.";
        }
        else{
            return "skrajną otyłość.";
        }
    }
}
