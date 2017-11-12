/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import core.Contribution;
import core.Donor;
import core.Fund;
import dao.ContributionDAO;
import dao.DBConnection;
import dao.DonorDAO;
import dao.FundDAO;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

/**
 *
 * @author legen
 */
public class ContributionFrame extends javax.swing.JFrame {

    private DBConnection conn;
    private ContributionDAO conDAO;
    private DonorDAO donDAO;
    private FundDAO fundDAO;
    private List<Integer> intList;
    private List<Donor> donorList;
    private List<Contribution> contributionList;
    private List<Fund> fundList;
    private List<String> tempList;
    /**
     * Creates new form ContributionFrame
     */
    public ContributionFrame(DBConnection myConn)
    {
        initComponents();
        tempList = new ArrayList<String>();
        this.conn = myConn;
        donDAO = new DonorDAO(this.conn);
        conDAO = new ContributionDAO(this.conn);
        fundDAO = new FundDAO(this.conn);
        conButton.setBackground(Color.white);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        dateTextField.requestFocus();
        
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
        Date date = new Date();
        dateTextField.setText(sdf.format(date));
        
        try{
            contributionList = conDAO.getAllContributions();
            ContributionTableModel model = new ContributionTableModel(contributionList);
            contributionTable.setModel(model);
            
            donorList = donDAO.getAllDonors();
            nameTextField.setText(donorList.get(0).getF_name() + " " + donorList.get(0).getL_name());
            
            intList = donDAO.getAllEnvNums();
            envComboBox.setModel(new DefaultComboBoxModel(intList.toArray()));
            
            fundList = fundDAO.getAllFunds();
            //look into setting names for funds
            for(int i = 0; i < fundList.size(); i++)
            {
                tempList.add(fundList.get(i).getName());
            }
            fundComboBox.setModel(new DefaultComboBoxModel(tempList.toArray()));
            
        } catch(Exception ex)
        {
            Logger.getLogger(ContributionFrame.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Error 2: " + ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addPanel = new javax.swing.JPanel();
        nameTextField = new javax.swing.JTextField();
        amountLabel = new javax.swing.JLabel();
        amountTextField = new javax.swing.JTextField();
        typeComboBox = new javax.swing.JComboBox<>();
        addButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        dateLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        fundComboBox = new javax.swing.JComboBox<>();
        fundLabel = new javax.swing.JLabel();
        dateTextField = new javax.swing.JTextField();
        envIDLabel = new javax.swing.JLabel();
        envComboBox = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        noteTextPane = new javax.swing.JTextPane();
        noteLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        contributionTable = new javax.swing.JTable();
        donorButton = new javax.swing.JButton();
        reportButton = new javax.swing.JButton();
        fundButton = new javax.swing.JButton();
        conButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Add/Update/Delete Contribution"));

        nameTextField.setEditable(false);

        amountLabel.setText("Amount:");

        amountTextField.setPreferredSize(new java.awt.Dimension(6, 25));
        amountTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                amountTextFieldFocusLost(evt);
            }
        });

        typeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Check", "Currency", "Coin", "ACH", " " }));

        addButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        addButton.setText("Add");

        updateButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        updateButton.setText("Update");

        resetButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        deleteButton.setText("Delete");

        dateLabel.setText("Date:");

        nameLabel.setText("Name:");

        fundComboBox.setEditable(true);
        fundComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General Fund", " " }));
        fundComboBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fundComboBoxFocusLost(evt);
            }
        });

        fundLabel.setText("Fund:");

        envIDLabel.setText("Envelope ID:");

        envComboBox.setEditable(true);
        envComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        envComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                envComboBoxItemStateChanged(evt);
            }
        });
        envComboBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                envComboBoxFocusLost(evt);
            }
        });

        jScrollPane2.setViewportView(noteTextPane);

        noteLabel.setText("Note:");

        javax.swing.GroupLayout addPanelLayout = new javax.swing.GroupLayout(addPanel);
        addPanel.setLayout(addPanelLayout);
        addPanelLayout.setHorizontalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPanelLayout.createSequentialGroup()
                .addContainerGap(263, Short.MAX_VALUE)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addPanelLayout.createSequentialGroup()
                                .addComponent(dateLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(addPanelLayout.createSequentialGroup()
                                .addComponent(fundLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fundComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(98, 98, 98)
                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addPanelLayout.createSequentialGroup()
                                .addComponent(envIDLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(envComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(addPanelLayout.createSequentialGroup()
                                .addComponent(amountLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(amountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(typeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36)
                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addPanelLayout.createSequentialGroup()
                                .addComponent(nameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(addPanelLayout.createSequentialGroup()
                                .addComponent(noteLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(addPanelLayout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(332, 332, 332)))
                .addContainerGap(264, Short.MAX_VALUE))
        );
        addPanelLayout.setVerticalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel)
                    .addComponent(envIDLabel)
                    .addComponent(envComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateLabel))
                .addGap(45, 45, 45)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addPanelLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deleteButton)
                            .addComponent(addButton)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fundLabel)
                        .addComponent(fundComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(amountLabel)
                        .addComponent(amountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(typeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(noteLabel)))
                .addGap(18, 18, 18)
                .addGroup(addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updateButton)
                    .addComponent(resetButton)))
        );

        contributionTable.setAutoCreateRowSorter(true);
        contributionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Con. ID", "Env. ID", "Date", "Amount", "Type", "Fund", "Note"
            }
        ));
        contributionTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contributionTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(contributionTable);

        donorButton.setText("Donors");
        donorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donorButtonActionPerformed(evt);
            }
        });

        reportButton.setText("Reports");

        fundButton.setText("Funds");
        fundButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fundButtonActionPerformed(evt);
            }
        });

        conButton.setText("Contributions");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(conButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(donorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fundButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(donorButton)
                    .addComponent(reportButton)
                    .addComponent(conButton)
                    .addComponent(fundButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        addPanel.getAccessibleContext().setAccessibleName("Edit Contribution");
        addPanel.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void donorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donorButtonActionPerformed
        DonorFrame df = new DonorFrame();
        //DonorFrame df = new DonorFrame(conn);
        df.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_donorButtonActionPerformed

    private void envComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_envComboBoxItemStateChanged
        try{
            donorList = donDAO.getAllDonors();
            int i = envComboBox.getSelectedIndex();
            nameTextField.setText(donorList.get(i).getF_name() + " " + donorList.get(i).getL_name());
            
        } catch (Exception ex) {
            Logger.getLogger(ContributionFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_envComboBoxItemStateChanged

    private void fundButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fundButtonActionPerformed
        FundFrame ff = new FundFrame(conn);
        //FundFrame ff = new FundFrame(conn);
        ff.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_fundButtonActionPerformed

    private void envComboBoxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_envComboBoxFocusLost
        fundComboBox.requestFocus();
    }//GEN-LAST:event_envComboBoxFocusLost

    private void fundComboBoxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fundComboBoxFocusLost
        amountTextField.requestFocus();
    }//GEN-LAST:event_fundComboBoxFocusLost

    private void amountTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_amountTextFieldFocusLost
        addButton.requestFocus();
    }//GEN-LAST:event_amountTextFieldFocusLost

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        reset(donorList);
    }//GEN-LAST:event_resetButtonActionPerformed

    private void contributionTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contributionTableMouseClicked
        int i = contributionTable.getSelectedRow();
        
        TableModel model = contributionTable.getModel();
        //String id = model.getValueAt(i, 0).toString();
        //int idParam = Integer.parseInt(id);
        
        //NOTE: There has to be a better way to set comboboxes then if/else statements
        //Look into this before finalizing form
        if(model.getValueAt(i, 5).equals("check"))
            typeComboBox.setSelectedIndex(0);
        else if(model.getValueAt(i, 5).equals("currency"))
            typeComboBox.setSelectedIndex(1);
        else if(model.getValueAt(i, 5).equals("coin"))
            typeComboBox.setSelectedIndex(2);
        else
            typeComboBox.setSelectedIndex(3);
        
        if(model.getValueAt(i, 4).equals("Building"))
            fundComboBox.setSelectedIndex(0);
        else if(model.getValueAt(i, 4).equals("Bulletins"))
            fundComboBox.setSelectedIndex(1);
        else if(model.getValueAt(i, 4).equals("Comfort Dog"))
            fundComboBox.setSelectedIndex(2);
        else if(model.getValueAt(i, 4).equals("Facility Use"))
            fundComboBox.setSelectedIndex(3);
        else if(model.getValueAt(i, 4).equals("General"))
            fundComboBox.setSelectedIndex(4);
        else if(model.getValueAt(i, 4).equals("Missions"))
            fundComboBox.setSelectedIndex(5);
        else if(model.getValueAt(i, 4).equals("Music"))
            fundComboBox.setSelectedIndex(6);
        else if(model.getValueAt(i, 4).equals("No Longer Active"))
            fundComboBox.setSelectedIndex(7);
        else if(model.getValueAt(i, 4).equals("Scholarship"))
            fundComboBox.setSelectedIndex(8);
        else if(model.getValueAt(i, 4).equals("Sunday School"))
            fundComboBox.setSelectedIndex(9);
        else if(model.getValueAt(i, 4).equals("Youth Camp Fees"))
            fundComboBox.setSelectedIndex(10);
        else if(model.getValueAt(i,4).equals("Youth Fundraisers"))
            fundComboBox.setSelectedIndex(11);
        else
            fundComboBox.setSelectedIndex(12);
            
        
        int k = Integer.parseInt(model.getValueAt(i,2).toString());
        envComboBox.setSelectedIndex(k);
        amountTextField.setText(model.getValueAt(i, 3).toString());
        dateTextField.setText(model.getValueAt(i, 1).toString());
        //fund combo box
        if(model.getValueAt(i, 6) == null)
            noteTextPane.setText("");
        else    
            noteTextPane.setText(model.getValueAt(i, 6).toString());
        
        
    }//GEN-LAST:event_contributionTableMouseClicked

    private void reset(List<Donor> a)
    {
        
        envComboBox.setSelectedIndex(0);
        nameTextField.setText(a.get(0).getF_name() + " " + a.get(0).getL_name());
        fundComboBox.setSelectedIndex(0);
        amountTextField.setText("");
        typeComboBox.setSelectedIndex(0);
        noteTextPane.setText("");
        dateTextField.requestFocus();
        
        try{
            contributionList = conDAO.getAllContributions();
            ContributionTableModel model = new ContributionTableModel(contributionList);
            contributionTable.setModel(model);
        } catch (Exception ex)
        {
            JOptionPane.showMessageDialog(this, "Error 2: " + ex, "Error", JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(ContributionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContributionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContributionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContributionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContributionFrame(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JPanel addPanel;
    private javax.swing.JLabel amountLabel;
    private javax.swing.JTextField amountTextField;
    private javax.swing.JButton conButton;
    private javax.swing.JTable contributionTable;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JTextField dateTextField;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton donorButton;
    private javax.swing.JComboBox<String> envComboBox;
    private javax.swing.JLabel envIDLabel;
    private javax.swing.JButton fundButton;
    private javax.swing.JComboBox<String> fundComboBox;
    private javax.swing.JLabel fundLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel noteLabel;
    private javax.swing.JTextPane noteTextPane;
    private javax.swing.JButton reportButton;
    private javax.swing.JButton resetButton;
    private javax.swing.JComboBox<String> typeComboBox;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
