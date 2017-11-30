/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
//package dao;

import java.sql.*;
import core.Donor;
import core.Fund;
import core.Contribution;
import dao.DBConnection;
import dao.DonorDAO;
import dao.FundDAO;
import dao.ContributionDAO;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import javax.swing.table.TableModel;

/**
 *
 * @author legen
 */
public class DonorFrame extends javax.swing.JFrame {
    private DonorDAO donorDAO;
    private List<Donor> donors;
    private DBConnection conn;
    private DonorTableModel model;
    /**
     * Creates new form DonorFrame
     */
    public DonorFrame(DBConnection myConn) {
        initComponents();
        
        try{
            conn = myConn;
            donorDAO = new DonorDAO(conn);
            donors = this.donorDAO.getAllDonors();
            model = new DonorTableModel(donors);
            TableDonor.setModel(model);
            
            //set default fields
            restoreDefaults();
            cityTextField.addFocusListener(new FocusListener(){
                public void focusGained(FocusEvent arg0)
                {
                    
                    cityTextField.selectAll();
                    
                }
                public void focusLost(FocusEvent arg0)
                {
                    
                }
            });
        }
        catch(Exception err){
            JOptionPane.showMessageDialog(this, "Error: "+err,"Error",JOptionPane.ERROR_MESSAGE);
        }
        
    }
   
        // You could do something here when the field loses focus, if you like

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        addPanel = new javax.swing.JPanel();
        env_numLabel = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        streetLabel = new javax.swing.JLabel();
        cityLabel = new javax.swing.JLabel();
        stateLabel = new javax.swing.JLabel();
        ZipLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        mailPrefLabel = new javax.swing.JLabel();
        envNumTextField = new javax.swing.JTextField();
        firstNameTextField = new javax.swing.JTextField();
        lastNameTextField = new javax.swing.JTextField();
        streetTextField = new javax.swing.JTextField();
        cityTextField = new javax.swing.JTextField();
        zipTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        mailPrefComboBox = new javax.swing.JComboBox<>();
        addButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        stateComboBox = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableDonor = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1443, 742));

        jScrollPane1.setAutoscrolls(true);

        addPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Add/Update/Delete Donor"));
        addPanel.setAutoscrolls(true);
        addPanel.setPreferredSize(new java.awt.Dimension(421, 456));

        env_numLabel.setText("Env_num:");

        firstNameLabel.setText("First Name:");

        lastNameLabel.setText("Last Name:");

        streetLabel.setText("Street:");

        cityLabel.setText("City:");

        stateLabel.setText("State:");

        ZipLabel.setText("Zip:");

        emailLabel.setText("Email:");

        mailPrefLabel.setText("Mail_pref:");

        mailPrefComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "printed", "electronic" }));
        mailPrefComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailPrefComboBoxActionPerformed(evt);
            }
        });

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        addButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                addButtonKeyPressed(evt);
            }
        });

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });
        resetButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                resetButtonKeyPressed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        deleteButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                deleteButtonKeyPressed(evt);
            }
        });

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        updateButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                updateButtonKeyPressed(evt);
            }
        });

        stateComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AL", "AK", "AZ", "AR", "CA", "CO", "CT", "DE", "DC", "FL", "GA", "HI", "ID", "IL", "IN", "IA", "KS", "KY", "LA", "ME", "MD", "MA", "MI", "MN", "MS", "MO", "MT", "NE", "NV", "NH", "NJ", "NM", "NY", "NC", "ND", "O", "OK", "OR", "PA", "PR", "RI", "SC", "SD", "TN", "TX", "UT", "VT", "VA", "VI", "WA", "WV", "WI", "WY" }));

        javax.swing.GroupLayout addPanelLayout = new javax.swing.GroupLayout(addPanel);
        addPanel.setLayout(addPanelLayout);
        addPanelLayout.setHorizontalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addComponent(env_numLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(envNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(firstNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lastNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(addPanelLayout.createSequentialGroup()
                                .addComponent(emailLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, addPanelLayout.createSequentialGroup()
                                .addComponent(streetLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(streetTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cityLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addPanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(stateLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(stateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ZipLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(zipTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(addPanelLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(mailPrefLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mailPrefComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addPanelLayout.setVerticalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(env_numLabel)
                    .addComponent(envNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameLabel)
                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameLabel)
                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(streetLabel)
                    .addComponent(streetTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stateLabel)
                    .addComponent(cityLabel)
                    .addComponent(cityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ZipLabel)
                    .addComponent(zipTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(mailPrefLabel)
                        .addComponent(mailPrefComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(emailLabel)
                        .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addButton)
                            .addComponent(deleteButton))
                        .addGap(15, 15, 15)
                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(resetButton)
                            .addComponent(updateButton))))
                .addContainerGap(371, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(addPanel);

        TableDonor.setAutoCreateRowSorter(true);
        TableDonor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Env_num", "First Name", "Last Name", "Street", "City", "State", "Zip", "Email", "Mail_pref"
            }
        ));
        TableDonor.setAutoscrolls(false);
        TableDonor.setMaximumSize(new java.awt.Dimension(32767, 32767));
        TableDonor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableDonorMouseClicked(evt);
            }
        });
        TableDonor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TableDonorKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(TableDonor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1105, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1105, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//(int eNum, String fname, String lname, String street, String city, String state, int zip, String email, String mpref)
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed

        try {
            
            if(mailPrefComboBox.getSelectedItem().toString() == "electronic" &&  emailTextField.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "The electronic mail preference requires an email address!");
            }
            else
            {
                Donor donor = new Donor(Integer.parseInt
                    (envNumTextField.getText()),firstNameTextField.getText(),
                        lastNameTextField.getText(),streetTextField.getText(),
                        cityTextField.getText(),stateComboBox.getSelectedItem().toString(),
                        Integer.parseInt(zipTextField.getText()),
                        emailTextField.getText(),mailPrefComboBox
                                .getSelectedItem().toString());
                donorDAO.addDonor(donor);
            }
         }catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Value Error : " + ex, "Error", JOptionPane.ERROR_MESSAGE);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Database Error : " + ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
         finally{
             reset();
             clearTextBoxes();
             restoreDefaults();
         }
                 // TODO add your handling code here:
    }//GEN-LAST:event_addButtonActionPerformed

    private void restoreDefaults(){
        //Default data in TextFields
        try{
            String temp = Integer.toString(donorDAO.getNextEnvNum());
            stateComboBox.setSelectedItem("TX");
            envNumTextField.setText(temp);
            cityTextField.setText("Wichita Falls");
            
        }
            
        catch(Exception err){
            JOptionPane.showMessageDialog(this, "Error: "+err,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void TableDonorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableDonorMouseClicked
        // TODO add your handling code here:
        TableModel donor_model = TableDonor.getModel();
        int selectedRowIndex = TableDonor.getSelectedRow();
        int selectedRowModel = TableDonor.convertRowIndexToModel(selectedRowIndex);

        
        envNumTextField.setText(donor_model.getValueAt(selectedRowModel, 0).toString());
        firstNameTextField.setText(donor_model.getValueAt(selectedRowModel, 1).toString());
        lastNameTextField.setText(donor_model.getValueAt(selectedRowModel, 2).toString());
        streetTextField.setText(donor_model.getValueAt(selectedRowModel, 3).toString());
        cityTextField.setText(donor_model.getValueAt(selectedRowModel, 4).toString());
        stateComboBox.setSelectedItem(donor_model.getValueAt(selectedRowModel, 5).toString());
        zipTextField.setText(donor_model.getValueAt(selectedRowModel, 6).toString());
        emailTextField.setText(donor_model.getValueAt(selectedRowModel, 7).toString());
        mailPrefComboBox.setSelectedItem(donor_model.getValueAt(selectedRowModel,8).toString());
       
    }//GEN-LAST:event_TableDonorMouseClicked

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
        reset();
        clearTextBoxes();
        restoreDefaults();
        addButton.setEnabled(true);
        
    }//GEN-LAST:event_resetButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
         try {
             
            Donor donor = new Donor(Integer.parseInt
                (envNumTextField.getText()),firstNameTextField.getText(),
                    firstNameTextField.getText(),streetTextField.getText(),
                    cityTextField.getText(),stateComboBox.getSelectedItem().toString(),
                    Integer.parseInt(zipTextField.getText()),
                    emailTextField.getText(),mailPrefComboBox
                            .getSelectedItem().toString());
            donorDAO.deleteDonor(donor);
            
         }catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Value Error : " + ex, "Error", JOptionPane.ERROR_MESSAGE);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Database Error : " + ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
         finally{
             reset();
             clearTextBoxes();
             restoreDefaults();
         }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        try{ 
            
             if(mailPrefComboBox.getSelectedItem().toString() == "electronic" &&  emailTextField.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this, "The electronic mail preference requires an email address!");
            }
            else
            {
                String env = envNumTextField.getText( );
                String f_name = firstNameTextField.getText();
                String l_name = lastNameTextField.getText( );
                String street = streetTextField.getText( );
                String city = cityTextField.getText( );
                String state = stateComboBox.getSelectedItem( ).toString();
                String zipcode = zipTextField.getText( );
                String email = emailTextField.getText( );
                String mail_pref = mailPrefComboBox.getSelectedItem( ).toString();
                int env_num = Integer.parseInt( env );
                int zip = Integer.parseInt( zipcode );
                Donor donor=new Donor(env_num,f_name,l_name,street,city,state,zip,email,mail_pref);
                donorDAO.updateDonor(donor);
            }
         }
         catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Value Error : " + ex, "Error", JOptionPane.ERROR_MESSAGE);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Database Error : " + ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
         finally{
             reset();
             clearTextBoxes();
             restoreDefaults();
         }
   

    }//GEN-LAST:event_updateButtonActionPerformed
 
    private void addButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)            
        {
            addButton.doClick();
        }
    }//GEN-LAST:event_addButtonKeyPressed

    private void deleteButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_deleteButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)            
        {
           deleteButton.doClick();
        }
    }//GEN-LAST:event_deleteButtonKeyPressed

    private void resetButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_resetButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)            
        {
            resetButton.doClick();
        }
    }//GEN-LAST:event_resetButtonKeyPressed

    private void updateButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_updateButtonKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)            
        {
            updateButton.doClick();
        }
    }//GEN-LAST:event_updateButtonKeyPressed

    private void TableDonorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TableDonorKeyPressed
        int selectedRowIndex = 0;
        int selectedRowModel = 0;
        
        if (evt.getKeyCode() == KeyEvent.VK_UP)            
        {
            selectedRowIndex = TableDonor.getSelectedRow()-1;
            selectedRowModel = TableDonor.convertRowIndexToModel(selectedRowIndex);
        }
        else if (evt.getKeyCode() == KeyEvent.VK_DOWN || evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            selectedRowIndex = TableDonor.getSelectedRow()+1;
            selectedRowModel = TableDonor.convertRowIndexToModel(selectedRowIndex);  
        }

        TableModel donor_model = TableDonor.getModel();
        envNumTextField.setText(donor_model.getValueAt(selectedRowModel, 0).toString());
        firstNameTextField.setText(donor_model.getValueAt(selectedRowModel, 1).toString());
        lastNameTextField.setText(donor_model.getValueAt(selectedRowModel, 2).toString());
        streetTextField.setText(donor_model.getValueAt(selectedRowModel, 3).toString());
        cityTextField.setText(donor_model.getValueAt(selectedRowModel, 4).toString());
        stateComboBox.setSelectedItem(donor_model.getValueAt(selectedRowModel, 5).toString());
        zipTextField.setText(donor_model.getValueAt(selectedRowModel, 6).toString());
        emailTextField.setText(donor_model.getValueAt(selectedRowModel, 7).toString());
        mailPrefComboBox.setSelectedItem(donor_model.getValueAt(selectedRowModel,8).toString());
        
        //disable add button
        addButton.setEnabled(false);
    }//GEN-LAST:event_TableDonorKeyPressed

    private void mailPrefComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailPrefComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mailPrefComboBoxActionPerformed
   
    private void clearTextBoxes()
    {
        envNumTextField.setText("");
        firstNameTextField.setText("");
        lastNameTextField.setText("");
        streetTextField.setText("");
        cityTextField.setText("");
        stateComboBox.setSelectedItem("TX");
        zipTextField.setText("");
        emailTextField.setText("");
        firstNameTextField.requestFocus();
    }
    
    private void reset(){   
    try{
            donors = donorDAO.getAllDonors();
            DonorTableModel model = new DonorTableModel(donors);
            TableDonor.setModel(model);
            firstNameTextField.requestFocus();
        } catch (Exception ex)
        {
            JOptionPane.showMessageDialog(this, "Error : " + ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DonorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DonorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DonorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DonorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DonorFrame(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableDonor;
    private javax.swing.JLabel ZipLabel;
    private javax.swing.JButton addButton;
    private javax.swing.JPanel addPanel;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JTextField cityTextField;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JTextField envNumTextField;
    private javax.swing.JLabel env_numLabel;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JComboBox<String> mailPrefComboBox;
    private javax.swing.JLabel mailPrefLabel;
    private javax.swing.JButton resetButton;
    private javax.swing.JComboBox<String> stateComboBox;
    private javax.swing.JLabel stateLabel;
    private javax.swing.JLabel streetLabel;
    private javax.swing.JTextField streetTextField;
    private javax.swing.JButton updateButton;
    private javax.swing.JTextField zipTextField;
    // End of variables declaration//GEN-END:variables
}
