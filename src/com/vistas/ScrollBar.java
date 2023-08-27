package com.vistas;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JScrollBar;

public class ScrollBar extends JScrollBar {

    public ScrollBar() {
        setUI(new ScrollBarUI());
        setPreferredSize(new Dimension(8, 8));
        setForeground(new Color(255,255,255));
        setBackground(new Color(24,25,32));
    }
}