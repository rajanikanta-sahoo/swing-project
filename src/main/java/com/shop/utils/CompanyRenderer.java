/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shop.utils;

import com.shop.domain.ProductCompany;
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
public class CompanyRenderer extends JPanel implements ListCellRenderer {

    private static final long serialVersionUID = 7725612423709257703L;

    JLabel[] lbl = new JLabel[1];

    List<String> toolTipList;
    List<ProductCompany> items;

    public CompanyRenderer(List<ProductCompany> items) {
        this.items = items;

        toolTipList = new ArrayList<>();

        FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
        layout.setVgap(1);
        layout.setHgap(1);
        setLayout(layout);
        for (int x = 0; x < lbl.length; x++) {
            lbl[x] = new JLabel();
            lbl[x].setOpaque(true);
            lbl[x].setFont(new Font("ARIAL", Font.PLAIN, 16));
            lbl[x].setHorizontalAlignment(JLabel.LEFT);
            if (x == 0) {
                lbl[x].setPreferredSize(new Dimension(400, 16));
            }

            add(lbl[x]);
        }
    }

    @Override
    public CompanyRenderer getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {

        try {

            ProductCompany item = (ProductCompany) value;

            // item =   em.merge(item);
            lbl[0].setText(item.getName());

            if (isSelected) {
                lbl[0].setBackground(Color.LIGHT_GRAY);

            } else {

                lbl[0].setBackground(new Color(238, 238, 238));

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }

        return this;

    }
}
