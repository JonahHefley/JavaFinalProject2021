package com.example.javafinalproject;

import java.util.Scanner;

public class UserValues extends Variables {
    //Weight
    public void EnterWeight(){
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your weight in pounds: ");
        System.out.println("Pounds: ");
        Pounds = input.nextDouble();
        System.out.println("Your weight is " + Pounds + " lbs.");
    }


    public Double GetWeight(){

        if (Pounds == 0) {
            System.out.println("No weight recorded.");
        } else if (Pounds > 0) {

            System.out.println("Your weight is " + Pounds + " lbs.");

        }
        return Pounds;
    }


    //Age
    public void EnterAge(){
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your Age in years: ");
        System.out.println("Years: ");
        Years = input.nextInt();
        System.out.println("You are " + Years + " years old.");

    }


    public int GetAge(){

        if (Years == 0) {
            System.out.println("No age recorded.");
        } else if (Years > 0) {

            System.out.println("You are " + Years + " years old.");

        }
        return Years;
    }

    //Height
    public void EnterHeight(){
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your height in feet and inches: ");
        System.out.println("Feet: ");
        Feet = input.nextInt();
        System.out.println("Inches:");
        Inches = input.nextInt();
        System.out.println("Your height is " + Feet + " ft. and " + Inches + " in.");

    }

    public int GetHeight(){

        if (Feet == 0) {
            System.out.println("No height recorded.");
        } else if (Feet > 0) {
            System.out.println("Your height is " + Feet + " ft. " + Inches + " in.");

        }
        return Inches + Feet * 12;
    }



    //Gender
    public void EnterGender(){
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 1 for male and 2 for female: ");
        System.out.println("Gender: ");
        Sex = input.nextInt();


        if (Sex == 1){
            Sex = Male;
            System.out.println("Your gender is male");

        } else if (Sex == 2){
            Sex = Female;
            System.out.println("Your gender is female");

        }

    }

    public int GetGender(){

        if (Sex == 0) {
            System.out.println("No gender recorded.");
        } else if (Sex == 5) {
            System.out.println("Your gender is male");
        } else if (Sex == 161) {
            System.out.println("Your gender is female");
        }
        return Sex;
    }

    //Hip Circumference
    public void EnterHipInches(){
        Scanner input = new Scanner(System.in);

        System.out.println("Please hip circumference in inches: ");
        System.out.println("Inches: ");
        HipInches = input.nextInt();
        System.out.println("Your hip circumference is " + HipInches + " in.");

    }


    public int GetHipInches(){

        if (HipInches == 0) {
            System.out.println("No hip circumference recorded.");
        } else if (HipInches > 0) {

            System.out.println("Your hip circumference is " + HipInches + " in.");

        }
        return HipInches;
    }

//BMI

    public float GetBMI(float Pounds, int Inches){

        if (Pounds == 0 && Feet == 0) {
            System.out.println("Please enter height and weight before proceeding.");
        } else if (Pounds > 0 && Feet > 0) {
            BMInum = Pounds / (Inches * Inches);
            System.out.println("Your BMI is " + BMInum);
        }
        return BMInum;

    }

//BAI

    public float GetBAI(int HipInches, int Inches){

        if (HipInches == 0 && Feet == 0) {
            System.out.println("Please enter height and weight before proceeding.");

        } else if (HipInches > 0 && Feet > 0) {

            double BAInum = ((HipInches * 2.54) / (Math.pow((Inches * 0.0254), 1.5))) - 18;

            System.out.println("Your BAI is " + BAInum);

        }
        return BAInum;

    }

//Lean Body Mass

    public float GetLean(float Pounds, int HipInches, int Inches){

        if (Pounds == 0 && Feet == 0 && HipInches == 0) {
            System.out.println("Please enter height, weight, and hip circumference before proceeding.");

        }
        return 0;

    }

    //RMR
    public float GetRMR(float Pounds, int Inches, int Years){

        if (Pounds == 0 && Feet == 0 && Inches == 0 && Years == 0 ) {
            System.out.println("Please enter height, weight, age, and gender before proceeding.");
            //} else if (Pounds > 0 && Feet > 0 && Inches > 0 && Years > 0 ) {

            //	RMRMennum = (10 * Pounds) + (6.25 * Inches) - (5 * Years) + 5;
            //	RMRWomennum = (10 * Pounds) + (6.25 * Inches) - (5 * Years) - 161;

        }
        return 0; //RMRMennum;
        //return RMRWomennum;
        //return Inches + Feet * 12;
    }
}
