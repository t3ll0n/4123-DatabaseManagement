/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dao.DBConnection;
import javax.swing.JFrame;

/**
 *
 * @author legen
 */
public class MainFrame extends javax.swing.JFrame {
    /**
     * Creates new form MainFrame
     */
    public MainFrame(DBConnection myConn) {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
         
        ContributionFrame c = new ContributionFrame(myConn);
        DonorFrame d = new DonorFrame();
        FundFrame f = new FundFrame(myConn);
        ReportFrame r = new ReportFrame();
        
        //adds the contents of each frame to their appropriate tabs
        contributions_tab.add(c.getContentPane());
        donors_tab.add(d.getContentPane());
        funds_tab.add(f.getContentPane());
        reports_tab.add(r.getContentPane());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tab_menu = new javax.swing.JTabbedPane();
        contributions_tab = new javax.swing.JPanel();
        donors_tab = new javax.swing.JPanel();
        funds_tab = new javax.swing.JPanel();
        reports_tab = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Donation Tracker");

        javax.swing.GroupLayout contributions_tabLayout = new javax.swing.GroupLayout(contributions_tab);
        contributions_tab.setLayout(contributions_tabLayout);
        contributions_tabLayout.setHorizontalGroup(
            contributions_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 816, Short.MAX_VALUE)
        );
        contributions_tabLayout.setVerticalGroup(
            contributions_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 244, Short.MAX_VALUE)
        );

        tab_menu.addTab("Contributions", contributions_tab);

        javax.swing.GroupLayout donors_tabLayout = new javax.swing.GroupLayout(donors_tab);
        donors_tab.setLayout(donors_tabLayout);
        donors_tabLayout.setHorizontalGroup(
            donors_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 816, Short.MAX_VALUE)
        );
        donors_tabLayout.setVerticalGroup(
            donors_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 244, Short.MAX_VALUE)
        );

        tab_menu.addTab("Donors", donors_tab);

        javax.swing.GroupLayout funds_tabLayout = new javax.swing.GroupLayout(funds_tab);
        funds_tab.setLayout(funds_tabLayout);
        funds_tabLayout.setHorizontalGroup(
            funds_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 816, Short.MAX_VALUE)
        );
        funds_tabLayout.setVerticalGroup(
            funds_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 244, Short.MAX_VALUE)
        );

        tab_menu.addTab("Funds", funds_tab);

        javax.swing.GroupLayout reports_tabLayout = new javax.swing.GroupLayout(reports_tab);
        reports_tab.setLayout(reports_tabLayout);
        reports_tabLayout.setHorizontalGroup(
            reports_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 816, Short.MAX_VALUE)
        );
        reports_tabLayout.setVerticalGroup(
            reports_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 244, Short.MAX_VALUE)
        );

        tab_menu.addTab("Reports", reports_tab);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tab_menu)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tab_menu)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contributions_tab;
    private javax.swing.JPanel donors_tab;
    private javax.swing.JPanel funds_tab;
    private javax.swing.JPanel reports_tab;
    private javax.swing.JTabbedPane tab_menu;
    // End of variables declaration//GEN-END:variables
}
