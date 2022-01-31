package com.example.calculatorjavafxv2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    private boolean start = true;
    float data = 0f;
    int operation = -1;
    String number = "";
    float solution = 0f;
    @FXML
    private Label display;
    @FXML
    private Button minus;

    @FXML
    private Button nine;

    @FXML
    private Button six;

    @FXML
    private Button multiply;

    @FXML
    private Button one;

    @FXML
    private Button clear;

    @FXML
    private Button seven;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button plus;

    @FXML
    private Button eight;

    @FXML
    private Button zero;

    @FXML
    private Button divide;

    @FXML
    private Button four;

    @FXML
    private Button equals;

    @FXML
    private Button five;

    @FXML
    private Button point;

    @FXML
    public void onHelloButtonClick(ActionEvent event) {
        if (start) {
            display.setText("");
            start = false;
        }
        if (event.getSource() == one) {
            display.setText(display.getText() + "1");
            number += "1";
        } else if (event.getSource() == two) {
            display.setText(display.getText() + "2");
            number += "2";
        } else if (event.getSource() == three) {
            display.setText(display.getText() + "3");
            number += "3";
        } else if (event.getSource() == four) {
            display.setText(display.getText() + "4");
            number += "4";
        } else if (event.getSource() == five) {
            display.setText(display.getText() + "5");
            number += "5";
        } else if (event.getSource() == six) {
            display.setText(display.getText() + "6");
            number += "6";
        } else if (event.getSource() == seven) {
            display.setText(display.getText() + "7");
            number += "7";
        } else if (event.getSource() == eight) {
            display.setText(display.getText() + "8");
            number += "8";
        } else if (event.getSource() == nine) {
            display.setText(display.getText() + "9");
            number += "9";
        } else if (event.getSource() == zero) {
            display.setText(display.getText() + "0");
            number += "0";
        } else if (event.getSource() == point) {
            if (!display.getText().contains(".")) {
                display.setText(display.getText() + ".");
                number += ".";
            } }else if (event.getSource() == clear) {
                display.setText("");
                number = "";
            } else if (event.getSource() == plus) {
                data = Float.parseFloat(display.getText());
                operation = 1; //Addition
                display.setText("");
                number += "+";
            } else if (event.getSource() == minus) {
                data = Float.parseFloat(display.getText());
                operation = 2; //Subtraction
                display.setText("");
                number += "-";
            } else if (event.getSource() == multiply) {
                data = Float.parseFloat(display.getText());
                operation = 3; //Mul
                display.setText("");
                number += "*";
            } else if (event.getSource() == divide) {
                data = Float.parseFloat(display.getText());
                operation = 4; //Division
                display.setText("");
                number += "/";
            } else if (event.getSource() == equals) {
                number += "=";
                Float secondOperand = Float.parseFloat(display.getText());
                switch (operation) {
                    case 1: //Addition
                        Float ans = data + secondOperand;
                        display.setText(String.valueOf(ans));
                        number = String.valueOf(ans);
                        break;
                    case 2: //Subtraction
                        ans = data - secondOperand;
                        display.setText(String.valueOf(ans));
                        number = String.valueOf(ans);
                        break;
                    case 3: //Mul
                        ans = data * secondOperand;
                        display.setText(String.valueOf(ans));
                        number = String.valueOf(ans);
                        break;
                    case 4: //Div
                        ans = 0f;
                        try {
                            ans = data / secondOperand;
                        } catch (Exception e) {
                            display.setText("Error");
                        }
                        if (ans.isInfinite()){
                            display.setText("Teilen durch 0 ist nicht möglich");
                        }else {
                            display.setText(String.valueOf(ans));
                            number = String.valueOf(ans);
                        }
                        break;
                }
            }
            System.out.println(number);
        }
    }