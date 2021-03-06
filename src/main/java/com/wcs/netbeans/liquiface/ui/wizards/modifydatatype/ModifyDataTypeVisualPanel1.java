/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wcs.netbeans.liquiface.ui.wizards.modifydatatype;

/*
 * #%L
 * Liquiface - GUI for Liquibase
 * %%
 * Copyright (C) 2013 Webstar Csoport Kft.
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the 
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public 
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */

import com.wcs.netbeans.liquiface.facade.ColumnTypeFacade;
import java.awt.event.ItemEvent;
import javax.swing.JPanel;

public final class ModifyDataTypeVisualPanel1 extends JPanel {

    /**
     * Creates new form RenameColumnVisualPanel1
     */
    public ModifyDataTypeVisualPanel1() {
        initComponents();
    }

    @Override
    public String getName() {
        return "Modify data type";
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        newTypeLabel = new javax.swing.JLabel();
        newTypeField = new javax.swing.JTextField();
        oldTypeLabel = new javax.swing.JLabel();
        oldTypeField = new javax.swing.JTextField();
        columnNameLabel = new javax.swing.JLabel();
        columnNameField = new javax.swing.JTextField();
        typeTemplateBox = new javax.swing.JComboBox();

        org.openide.awt.Mnemonics.setLocalizedText(newTypeLabel, org.openide.util.NbBundle.getMessage(ModifyDataTypeVisualPanel1.class, "ModifyDataTypeVisualPanel1.newTypeLabel.text")); // NOI18N

        oldTypeLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        org.openide.awt.Mnemonics.setLocalizedText(oldTypeLabel, org.openide.util.NbBundle.getMessage(ModifyDataTypeVisualPanel1.class, "ModifyDataTypeVisualPanel1.oldTypeLabel.text")); // NOI18N

        oldTypeField.setEnabled(false);

        org.openide.awt.Mnemonics.setLocalizedText(columnNameLabel, org.openide.util.NbBundle.getMessage(ModifyDataTypeVisualPanel1.class, "ModifyDataTypeVisualPanel1.columnNameLabel.text")); // NOI18N

        columnNameField.setEnabled(false);

        typeTemplateBox.setModel(new javax.swing.DefaultComboBoxModel(ColumnTypeFacade.getInstance().getColumnTypes()));
        typeTemplateBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                typeTemplateBoxItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(columnNameLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(newTypeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(oldTypeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(oldTypeField, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                    .addComponent(columnNameField)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(newTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(typeTemplateBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(columnNameLabel)
                    .addComponent(columnNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oldTypeLabel)
                    .addComponent(oldTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newTypeLabel)
                    .addComponent(newTypeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeTemplateBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void typeTemplateBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_typeTemplateBoxItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            newTypeField.setText((String) evt.getItem());
        }
    }//GEN-LAST:event_typeTemplateBoxItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField columnNameField;
    private javax.swing.JLabel columnNameLabel;
    private javax.swing.JTextField newTypeField;
    private javax.swing.JLabel newTypeLabel;
    private javax.swing.JTextField oldTypeField;
    private javax.swing.JLabel oldTypeLabel;
    private javax.swing.JComboBox typeTemplateBox;
    // End of variables declaration//GEN-END:variables

    public String getNewDataType() {
        return newTypeField.getText();
    }

    public void setColumnName(String name){
        columnNameField.setText(name);
    }

    public void setOldDataType(String type){
        oldTypeField.setText(type);
    }
}
