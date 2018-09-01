package com.example.BMI.calculator;

public class Calories {

    private int age;
    private int height;
    private int weight;
    private String gender;
    private double value;
    private double bmr;

    public Calories(int age, int height, int weight, String gender, double value) {
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
        this.value = value;
        if (gender.equals("Kobieta")){
            this.bmr = value * (10 * weight + 6.25 * height - 5 * age - 161);
        }
        else {
            this.bmr = value * (10 * weight + 6.25 * height - 5 * age + 5);
        }
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getBmr() {
        return bmr;
    }

    public void setBmr(double bmr) {
        this.bmr = bmr;
    }

    public String getBmrAsString(){
        return String.format("%.2f%n",bmr);
    }
}
