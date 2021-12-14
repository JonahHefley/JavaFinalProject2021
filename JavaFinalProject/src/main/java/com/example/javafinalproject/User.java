package com.example.javafinalproject;

public abstract class User {
    UserValues UserHeight = new UserValues();

    UserValues UserWeight = new UserValues();

    UserValues UserAge = new UserValues();

    UserValues UserHips = new UserValues();

    UserValues UserGender = new UserValues();


    UserValues UserBMI = new UserValues();

    UserValues UserBAI = new UserValues();

    UserValues UserRMR = new UserValues();

    UserValues UserLean = new UserValues();

    public void EnterHeight(){
        UserHeight.EnterHeight();
    }

    public void EnterWeight(){
        UserWeight.EnterWeight();
    }

    public void EnterAge(){
        UserAge.EnterAge();
    }

    public void EnterHipInches(){
        UserHips.EnterHipInches();
    }

    public void EnterGender(){
        UserGender.EnterGender();
    }

    public int GetHeight(){
        return UserHeight.GetHeight();

    }

    public Double GetWeight(){
        return UserWeight.GetWeight();
    }

    public int GetAge(){
        return UserAge.GetAge();
    }

    public int GetHipInches(){
        return UserHips.GetHipInches();
    }

    public int GetGender(){
        return UserGender.GetGender();
    }


    public float GetBMI(float Pounds, int Inches){
        return UserBMI.GetBMI(Pounds, Inches);
    }

    public float GetBAI(int HipInches, int Inches){
        return UserBAI.GetBAI(HipInches, Inches);
    }

    public float GetRMR(float Pounds, int Inches, int Years){
        return UserRMR.GetRMR(Pounds, Inches, Years);
    }

    public float GetLean(float Pounds, int HipInches, int Inches){
        return UserLean.GetLean(Pounds, HipInches, Inches);
    }
}