/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartparkingproroject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Ashbir Dhiman
 */
public class admin_checkspace extends javax.swing.JFrame {

    /**
     * Creates new form select_floor
     */
    public admin_checkspace() {
        initComponents();
        
        
        try {
                
                
                String p="";
                String q="";
                String r="";
                Connection co = DriverManager.getConnection("jdbc:mysql://localhost/smartpark","root","");

                String b = "Select * from parking_space  ";
                Statement st=co.createStatement();
                ResultSet rs=st.executeQuery(b);

                while(rs.next())
                {
                   
                        p=rs.getString("floor_1");
                    ground.setText(p);
                    q=rs.getString("floor_2");
                    upper.setText(q);
                    r=rs.getString("floor_3");
                   top.setText(r);

                }
                
                

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex);

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

        upper = new javax.swing.JLabel();
        top = new javax.swing.JLabel();
        ground = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        upper.setFont(new java.awt.Font("HelvLight", 0, 36)); // NOI18N
        getContentPane().add(upper, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, 180, 40));

        top.setFont(new java.awt.Font("HelvLight", 0, 36)); // NOI18N
        getContentPane().add(top, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 450, 190, 40));

        ground.setFont(new java.awt.Font("HelvLight", 0, 36)); // NOI18N
        getContentPane().add(ground, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, 170, 60));

        jButton4.setFont(new java.awt.Font("Gungsuh", 0, 24)); // NOI18N
        jButton4.setText("BACK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 180, 50));

        jLabel1.setFont(new java.awt.Font("HelvLight", 0, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Se project\\Projectimages\\adminfloor.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, -1));

        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 30, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new admin_checkvalid().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(admin_checkspace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin_checkspace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin_checkspace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin_checkspace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_checkspace().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ground;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel top;
    private javax.swing.JLabel upper;
    // End of variables declaration//GEN-END:variables
}
