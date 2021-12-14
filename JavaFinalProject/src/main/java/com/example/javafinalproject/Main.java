package com.example.javafinalproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

//UserMenu.java
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.*;

public class Main extends Application{
    @Override
    public void start(Stage primaryStage) throws IOException{
        UserValues u = new UserValues();
        FlowPane pane = new FlowPane();
        pane.setVgap(20);
        TextField feetnum = new TextField("0");
        TextField inchnum = new TextField("0");
        TextField weightnum = new TextField("0");
        TextField agenum = new TextField("0");
        TextField hipcircnum = new TextField("0");
        TextField GenNum = new TextField("0");

        

        TextField BMInum = new TextField("0");
        TextField RMRnum = new TextField("0");
        TextField BAInum = new TextField("0");
        TextField Leannum = new TextField("0");

        feetnum.setPrefColumnCount(7);
        inchnum.setPrefColumnCount(7);
        weightnum.setPrefColumnCount(7);
        agenum.setPrefColumnCount(7);
        GenNum.setPrefColumnCount(7);
        hipcircnum.setPrefColumnCount(7);
        BMInum.setPrefColumnCount(7);
        RMRnum.setPrefColumnCount(7);
        BAInum.setPrefColumnCount(7);
        Leannum.setPrefColumnCount(7);

        pane.getChildren().addAll(new Label("BMI: Body mass index is a value derived from the mass and height of a person. " +
                "\nThe BMI is defined as the body mass divided by the square of the body height," +
                " \nand is expressed in units of kg/m², resulting from mass in kilograms and height in metres." +
                "\n\nBAI: The body adiposity index is a method of estimating the amount of body fat in humans. " +
                "\nThe BAI is calculated without using body weight, unlike the body mass index. " +
                "\nInstead, it uses the size of the hips compared to the person's height." +
                "\n\nRMR: Resting metabolic rate is your calories burnt per day at rest. " +
                "\n\nLean: Lean Body Mass is your body weight excluding body fat."));

        pane.setAlignment(Pos.CENTER);
        pane.getChildren().addAll(new Label("Feet: "), feetnum,
                new Label("Inches: "), inchnum,
                new Label("Weight: "), weightnum,
                new Label("Age: "), agenum,
                new Label("Hip Circumference: "), hipcircnum,
                new Label("1 For Male, 2 For Female: "), GenNum,


                new Label("Body Mass Index: "), BMInum,
                new Label("Resting Metabolic Rate: "), RMRnum,
                new Label("Body Adiposity Index (Percentage): "), BAInum,
                new Label("Lean Body Mass: "), Leannum);



        VBox vBox = new VBox(0);

        Button BMI = new Button("Body Mass Index");
        Button RMR = new Button("Resting Metabolic Rate");
        Button BAI = new Button("Body Adiposity Index");
        Button Lean = new Button("Lean Body Mass");

        Font font = Font.font("Courier New", FontWeight.BOLD, 30);

        BMI.setPrefSize(513,75);
        RMR.setPrefSize(513,75);
        BAI.setPrefSize(513,75);
        Lean.setPrefSize(513,75);

        BMI.setFont(font);
        BAI.setFont(font);
        RMR.setFont(font);
        Lean.setFont(font);

        vBox.setAlignment(Pos.CENTER);
        vBox.getChildren().addAll(BMI, RMR, BAI, Lean);

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(pane);
        borderPane.setBottom(vBox);

        Scene scene = new Scene(borderPane,513,700);
        primaryStage.setTitle("Health Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();


        BMI.setOnAction(e -> {
            u.Pounds = Double.parseDouble(weightnum.getText());
            Double Kilograms = u.Pounds * 0.453592;

            u.Feet = Integer.parseInt(feetnum.getText());
            u.Inches = Integer.parseInt(inchnum.getText());
            Double HeightInches = (u.Feet * 12.0) + u.Inches;
            Double HeightCm = HeightInches * 2.54;
            Double HeightMeters = HeightCm * 0.01;
            BMInum.setText((Kilograms / (HeightMeters * HeightMeters)) + "");



            Stage BMIstage = new Stage();
            GridPane gridPane = new GridPane();
            if (Double.parseDouble(BMInum.getText()) < 18.5){
                gridPane.add(new ImageView(new Image("C:\\Users\\Jonah\\Desktop\\JavaFinalProject\\src\\main\\java\\com\\example\\javafinalproject\\underweight.jpg")),1,1);
            } else if (Double.parseDouble(BMInum.getText()) >= 18.5 && Double.parseDouble(BMInum.getText()) < 24.9){
                gridPane.add(new ImageView(new Image("C:\\Users\\Jonah\\Desktop\\JavaFinalProject\\src\\main\\java\\com\\example\\javafinalproject\\normal.jpg")),1,1);
            } else if (Double.parseDouble(BMInum.getText()) >= 24.9 && Double.parseDouble(BMInum.getText()) < 30.0){
                gridPane.add(new ImageView(new Image("C:\\Users\\Jonah\\Desktop\\JavaFinalProject\\src\\main\\java\\com\\example\\javafinalproject\\overweight.jpg")),1,1);
            } else if (Double.parseDouble(BMInum.getText()) >= 30.0 && Double.parseDouble(BMInum.getText()) < 35.0){
                gridPane.add(new ImageView(new Image("C:\\Users\\Jonah\\Desktop\\JavaFinalProject\\src\\main\\java\\com\\example\\javafinalproject\\obese.jpg")),1,1);
            } else if (Double.parseDouble(BMInum.getText()) >= 35.0){
                gridPane.add(new ImageView(new Image("C:\\Users\\Jonah\\Desktop\\JavaFinalProject\\src\\main\\java\\com\\example\\javafinalproject\\extremelyobese.jpg")),1,1);
            }
            Scene BMIScene = new Scene(gridPane, 1000, 500);
            BMIstage.setTitle("BMI");
            BMIstage.setScene(BMIScene);
            BMIstage.show();

        });

        RMR.setOnAction(e -> {
            u.Pounds = Double.parseDouble(weightnum.getText());
            Double Kilograms = u.Pounds * 0.453592;

            u.Feet = Integer.parseInt(feetnum.getText());
            u.Inches = Integer.parseInt(inchnum.getText());
            Double HeightInches = (u.Feet * 12.0) + u.Inches;
            Double HeightCm = HeightInches * 2.54;
            Double HeightMeters = HeightCm * 0.01;
            u.Sex = Integer.parseInt(GenNum.getText());
            u.Years = Integer.parseInt(agenum.getText());
            DecimalFormat df = new DecimalFormat("####.##");
            if (u.Sex == 1){
                RMRnum.setText( df.format( (10.0 * Kilograms + 6.25 * HeightCm - 5.0 * u.Years + 5.0)  ) + "");

            } else if (u.Sex == 2){
                RMRnum.setText(  df.format( (10.0 * Kilograms + 6.25 * HeightCm - 5.0 * u.Years - 161.0)   ) + "");
            }

        });

        BAI.setOnAction(e -> {
            u.Feet = Integer.parseInt(feetnum.getText());
            u.Inches = Integer.parseInt(inchnum.getText());
            Double HeightInches = (u.Feet * 12.0) + u.Inches;
            Double HeightCm = HeightInches * 2.54;
            Double HeightMeters = HeightCm * 0.01;

            u.HipInches = Integer.parseInt(hipcircnum.getText());
            Double HipCm = u.HipInches * 2.54;

            BAInum.setText(  (HipCm / (Math.pow(HeightMeters , 1.5)) - 18) + "" );
        });

        Lean.setOnAction(e -> {
            u.Pounds = Double.parseDouble(weightnum.getText());
            Double Kilograms = u.Pounds * 0.453592;

            Leannum.setText(  ((Kilograms * (1.0 - (Double.parseDouble(BAInum.getText()) / 100))) * 2.20462) + "" );
        });
    }

    public static void main(String[] args) {

        launch();

    }
}

