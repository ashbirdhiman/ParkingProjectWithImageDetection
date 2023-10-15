/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartparkingproroject;

import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author Ashbir Dhiman
 */
public class ConfirmTicket extends javax.swing.JFrame {

    /**
     * Creates new form ConfirmTicket
     */
    public ConfirmTicket(String cname,String vname,String flname,String parklc) {
        initComponents();
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        cuname.setText(cname);
        vhname.setText(vname);
        fulname.setText(flname);
        pkloc.setText(parklc);
        LocalDateTime now=LocalDateTime.now();
        time.setText(dtf.format(now));
        
        
        
    }

    private ConfirmTicket() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        time = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pkloc = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cuname = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        vhname = new javax.swing.JLabel();
        fulname = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        time.setFont(new java.awt.Font("Gulim", 1, 18)); // NOI18N
        getContentPane().add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 550, 260, 30));

        jLabel3.setFont(new java.awt.Font("Gulim", 1, 18)); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, 200, 30));

        pkloc.setFont(new java.awt.Font("Gulim", 1, 18)); // NOI18N
        getContentPane().add(pkloc, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, 200, 30));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 200, 30));

        cuname.setFont(new java.awt.Font("Gulim", 1, 18)); // NOI18N
        getContentPane().add(cuname, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 200, 30));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 200, 30));

        vhname.setFont(new java.awt.Font("Gulim", 1, 18)); // NOI18N
        getContentPane().add(vhname, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 200, 30));

        fulname.setFont(new java.awt.Font("Gulim", 1, 18)); // NOI18N
        getContentPane().add(fulname, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 200, 30));

        jButton1.setFont(new java.awt.Font("Gulim", 1, 24)); // NOI18N
        jButton1.setText("Print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 620, 170, 40));

        jLabel1.setFont(new java.awt.Font("Gulim", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Se project\\Projectimages\\ticket.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 510, 690));

        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, -1, -1));

        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String flor=fulname.getText();
        if(flor.equalsIgnoreCase("Top Floor"))
        {
            jLabel2.setText("floor_3");
        }
        else if(flor.equalsIgnoreCase("1st Floor"))
        {
            jLabel2.setText("floor_2");
        }
        else if(flor.equalsIgnoreCase("Ground Floor"))
        {
            jLabel2.setText("floor_1");
        }
        String check=jLabel2.getText();
         try {
                
                
                String p="";
                Connection co = DriverManager.getConnection("jdbc:mysql://localhost/smartpark","root","");

                String b = "Select "+check+" from parking_space ";
                Statement st=co.createStatement();
                ResultSet rs=st.executeQuery(b);

                while(rs.next())
                {
                   
                   p=rs.getString(check);
                   int rp=Integer.parseInt(p);
                   rp=rp-1;
                    jLabel4.setText(rp+"");
                }
                
                

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex);

            }
         String left=jLabel4.getText();
         try {
                
                
                String p="";
                Connection co = DriverManager.getConnection("jdbc:mysql://localhost/smartpark","root","");

                String b = "Update parking_space set "+check+"='"+left+"' ";
                Statement st=co.createStatement();
                st.execute(b);
                
                

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex);

            }
         
         
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ConfirmTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfirmTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfirmTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfirmTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConfirmTicket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cuname;
    private javax.swing.JLabel fulname;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel pkloc;
    private javax.swing.JLabel time;
    private javax.swing.JLabel vhname;
    // End of variables declaration//GEN-END:variables
}