package com.mcc.exec;

import com.mcc.panel.MenuPanel;
import com.mcc.panel.AdderPanel;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Owner on 4/21/14.
 */
public class PRJ05 extends JFrame
{
    public static void main(String[] args)
    {

        PRJ05 frmApp = new PRJ05();

        MenuPanel pnlMenu = new MenuPanel();
        AdderPanel pnlAdd = new AdderPanel();

        pnlMenu.setAddPanel(pnlAdd);

        frmApp.setTitle("PRJ05 Large Integer Calculator");
        frmApp.add(pnlMenu, BorderLayout.WEST);
        frmApp.add(pnlAdd, BorderLayout.CENTER);



        frmApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmApp.setSize(700, 200);
        frmApp.setVisible(true);
    }
}
