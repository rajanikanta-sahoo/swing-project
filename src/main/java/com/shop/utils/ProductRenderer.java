/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shop.utils;

import com.shop.domain.Product;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;

/**
 *
 * @author Lulu
 */
public class ProductRenderer extends JPanel implements ListCellRenderer {

    private static final long serialVersionUID = 7725612423709257703L;
    JLabel[] lbl = new JLabel[3];
    List<String> toolTipList;
    List<Product> items;

    public ProductRenderer(List<Product> items) {
        this.items = items;

        toolTipList = new ArrayList<>();

        FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
        layout.setVgap(0);
        layout.setHgap(0);
        setLayout(layout);
        for (int x = 0; x < lbl.length; x++) {
            lbl[x] = new JLabel();
            lbl[x].setOpaque(true);
            lbl[x].setFont(new Font("ARIAL", Font.BOLD, 14));
            lbl[x].setHorizontalAlignment(JLabel.LEFT);
            if (x == 0) {
                lbl[x].setPreferredSize(new Dimension(150, 14));
            }
            if (x == 1) {
                lbl[x].setPreferredSize(new Dimension(150, 14));
            }
//            if (x == 2) {
//                lbl[x].setPreferredSize(new Dimension(200, 14));
//            }
            add(lbl[x]);
        }
    }

    @Override
    public ProductRenderer getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {

        try {

            Product item = (Product) value;

            // item =   em.merge(item);
            lbl[0].setText(item.getName());
//            lbl[1].setText(item.getSize());
            lbl[1].setText("(" + item.getSize() + ")");

            if (isSelected) {
                lbl[0].setBackground(Color.LIGHT_GRAY);
                lbl[1].setBackground(Color.LIGHT_GRAY);
//                lbl[2].setBackground(Color.LIGHT_GRAY);

            } else {

                lbl[0].setBackground(new Color(200, 238, 238));
                lbl[1].setBackground(new Color(200, 238, 238));
//                lbl[2].setBackground(new Color(200, 238, 238));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
        return this;
    }
}
