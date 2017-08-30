package com.mcc.panel;

import com.mcc.util.FunctionLibrary;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;

/**
 * Created by Owner on 4/21/14.
 */
public class AdderPanel extends JPanel
{
    private JTextField txtNumber1;
    private JTextField txtNumber2;
    private JTextField txtResult;

    private String sNumber1;
    private String sNumber2;
    private FunctionLibrary fLibrary = new FunctionLibrary();
    public AdderPanel()
    {
        txtNumber1 = new JTextField(100);
        txtNumber2 = new JTextField(100);
        txtResult = new JTextField(101);

        setLayout(new GridLayout(4, 1));
        add(txtNumber1);
        add(txtNumber2);
        add(txtResult);
    }

    public void setNumbers()
    {
        sNumber1 = txtNumber1.getText();
        sNumber2 = txtNumber2.getText();

        if (sNumber1.length() < sNumber2.length())
        {
            sNumber1 = fLibrary.fillInZeros(sNumber1, sNumber2.length());
        }
        if (sNumber2.length() < sNumber1.length())
        {
            sNumber2 = fLibrary.fillInZeros(sNumber2, sNumber1.length());
        }

        txtResult.setText(fLibrary.performAddition(sNumber1, sNumber2));
    }
}