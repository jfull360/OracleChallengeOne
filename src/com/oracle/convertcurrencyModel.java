/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oracle;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author JORGE DOMINGUEZ
 */
public class convertcurrencyModel {

    convertcurrencyModel() {
    }

    private double new_amount;
    private String new_currency;
    private String old_currency;
    private String old_amount;

    public double getNew_amount() {
        return new_amount;
    }

    public void setNew_amount(double new_amount) {
        this.new_amount = new_amount;
    }

    public String getNew_currency() {
        return new_currency;
    }

    public void setNew_currency(String new_currency) {
        this.new_currency = new_currency;
    }

    public String getOld_currency() {
        return old_currency;
    }

    public void setOld_currency(String old_currency) {
        this.old_currency = old_currency;
    }

    public String getOld_amount() {
        return old_amount;
    }

    public void setOld_amount(String old_amount) {
        this.old_amount = old_amount;
    }
    
       protected void SetImage(JLabel labelName, String image) {
        ImageIcon imageicon = new ImageIcon(image);
        Icon icon = new ImageIcon(imageicon.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
        //this.repaint();
    }

}
