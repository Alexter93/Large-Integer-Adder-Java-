package com.mcc.panel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Owner on 4/21/14.
 */
public class MenuPanel extends JPanel implements ActionListener
{
    private JLabel lblNumber1;
    private JLabel lblNumber2;
    private JLabel lblResult;
    private JButton btnAdd;
    private AdderPanel pnlAdd;

    public void setAddPanel(AdderPanel p)
    {
        pnlAdd = p;
    }

    public MenuPanel()
    {
        lblNumber1 = new JLabel("Number 1:");
        lblNumber2 = new JLabel("Number 2:");
        lblResult = new JLabel("Result:");
        btnAdd = new JButton("Add");

        btnAdd.setActionCommand("addNumbers");
        btnAdd.addActionListener(this);

        setLayout(new GridLayout(4, 1));
        add(lblNumber1);
        add(lblNumber2);
        add(lblResult);
        add(btnAdd);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        pnlAdd.setNumbers();
    }
}
