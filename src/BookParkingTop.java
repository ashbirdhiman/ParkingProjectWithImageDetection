//Author Ashbir Dhiman
package smartparkingproroject;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class BookParkingTop extends javax.swing.JFrame {

    
    Map<String,JButton> buttonMap=new HashMap<String,JButton>();
    public BookParkingTop(String user_id,String veh_num) {
       
        initComponents();
        jLabel7.setText(user_id);
        
        veh_name.setText(veh_num);
        try {
                
                
                String p="";
                String q="";
                Connection co = DriverManager.getConnection("jdbc:mysql://localhost/smartpark","root","");

                String b = "Select flname,lname from user_detail where user_id='"+user_id+"'  ";
                Statement st=co.createStatement();
                ResultSet rs=st.executeQuery(b);

                while(rs.next())
                {
                   
                    p=rs.getString("flname");
                    q=rs.getString("lname");
                    cust_name.setText(p+q);

                }
                
                

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex);

            }
       buttonMap.put("A11", A11);
       buttonMap.put("A12", A12);
       buttonMap.put("A13", A13);
       buttonMap.put("A14", A14);
       buttonMap.put("A15", A15);
       buttonMap.put("A17", A17);
       buttonMap.put("A18", A18);
       buttonMap.put("A19", A19);
       buttonMap.put("A20", A20);
       buttonMap.put("A21", A21);
       buttonMap.put("A22", A22);
       buttonMap.put("A23", A23);
       buttonMap.put("A24", A24);
       buttonMap.put("A25", A24);
       buttonMap.put("A26", A25);
       buttonMap.put("A27", A26);
       buttonMap.put("A28", A27);
       buttonMap.put("A29", A29);
       
       buttonMap.put("B20",B21);
       buttonMap.put("B22",B22);
       buttonMap.put("B23",B23);
       buttonMap.put("B24",B24);
       buttonMap.put("B25",B25);
       buttonMap.put("B27",B27);
       buttonMap.put("B28",B28);
       buttonMap.put("B29",B29);
       buttonMap.put("B30",B30);
       buttonMap.put("B31",B31);
       buttonMap.put("B32",B32);
       buttonMap.put("B33",B33);
       
       
       buttonMap.put("C10",C10);
       buttonMap.put("C11",C11);
       buttonMap.put("C12",C12);
       buttonMap.put("C13",C13);
       buttonMap.put("C14",C14);
       buttonMap.put("C15",C15);
       buttonMap.put("C16",C16);
       buttonMap.put("C17",C17);
       buttonMap.put("C18",C18);
       buttonMap.put("C19",C19);
       
       
       buttonMap.put("A30",A30);
       buttonMap.put("A31",A31);
       buttonMap.put("A32",A32);
      
       
        try {
                
                
                String p="";
                Connection co = DriverManager.getConnection("jdbc:mysql://localhost/smartpark","root","");

                    String b = "Select parkloc from floor_3  ";
                Statement st=co.createStatement();
                ResultSet rs=st.executeQuery(b);

                while(rs.next())
                {
                   
                    p=rs.getString("parkloc");
                    
                    changecolorr(p);

                }
                
                

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex);

            }

        
    }

    private BookParkingTop() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
   
    
void changecolor(JButton jtbutton)
{
    
    
        jtbutton.setBackground(Color.GREEN);
    
}
final void changecolorr(String jtbutton)
{
    JButton jButton=buttonMap.get(jtbutton);
   jButton.setBackground(Color.red);
    
        
    
}
void addtodb(String text)
{
    String user_id=jLabel7.getText();
    String user=cust_name.getText();
    
    String carnum=veh_name.getText();
        try {
            Connection co=DriverManager.getConnection("jdbc:mysql://localhost/smartpark","root",null);
            String b = "insert into floor_3 values(Null,'"+user_id+"','"+user+"','"+carnum+"','"+text+"',curdate(),curtime())";

            Statement stmt=co.createStatement();
             stmt.execute(b);
            
            
            

            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        parkloc = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cust_name = new javax.swing.JLabel();
        veh_name = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        A11 = new javax.swing.JButton();
        A12 = new javax.swing.JButton();
        A13 = new javax.swing.JButton();
        A14 = new javax.swing.JButton();
        A15 = new javax.swing.JButton();
        A17 = new javax.swing.JButton();
        A18 = new javax.swing.JButton();
        A19 = new javax.swing.JButton();
        A20 = new javax.swing.JButton();
        A28 = new javax.swing.JButton();
        A27 = new javax.swing.JButton();
        A26 = new javax.swing.JButton();
        A25 = new javax.swing.JButton();
        A24 = new javax.swing.JButton();
        A23 = new javax.swing.JButton();
        A22 = new javax.swing.JButton();
        A21 = new javax.swing.JButton();
        B21 = new javax.swing.JButton();
        B22 = new javax.swing.JButton();
        B23 = new javax.swing.JButton();
        B24 = new javax.swing.JButton();
        B25 = new javax.swing.JButton();
        B27 = new javax.swing.JButton();
        B28 = new javax.swing.JButton();
        B29 = new javax.swing.JButton();
        B30 = new javax.swing.JButton();
        B33 = new javax.swing.JButton();
        B32 = new javax.swing.JButton();
        B31 = new javax.swing.JButton();
        C10 = new javax.swing.JButton();
        C11 = new javax.swing.JButton();
        C12 = new javax.swing.JButton();
        C13 = new javax.swing.JButton();
        C14 = new javax.swing.JButton();
        C15 = new javax.swing.JButton();
        C16 = new javax.swing.JButton();
        C17 = new javax.swing.JButton();
        C18 = new javax.swing.JButton();
        C19 = new javax.swing.JButton();
        A29 = new javax.swing.JButton();
        A30 = new javax.swing.JButton();
        A31 = new javax.swing.JButton();
        A32 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Sitka Text", 0, 15)); // NOI18N
        jLabel2.setText(" select the following detail to book a parking location:");

        jLabel3.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel3.setText("Car number :");

        jLabel4.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel4.setText("Your Selected Location is:");

        parkloc.setFont(new java.awt.Font("Sitka Text", 0, 24)); // NOI18N

        jButton1.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jButton1.setText("Back");

        jButton2.setFont(new java.awt.Font("Sitka Text", 0, 24)); // NOI18N
        jButton2.setText("Confirm");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel5.setText("Customer name :");

        jLabel6.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel6.setText("Floor No :");

        cust_name.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N

        veh_name.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        jLabel9.setText("Top Floor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(veh_name, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cust_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(parkloc, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cust_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(veh_name, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(parkloc, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        jPanel2.setLayout(null);

        A11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A11ActionPerformed(evt);
            }
        });
        jPanel2.add(A11);
        A11.setBounds(50, 0, 80, 30);

        A12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A12ActionPerformed(evt);
            }
        });
        jPanel2.add(A12);
        A12.setBounds(50, 40, 70, 30);

        A13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A13ActionPerformed(evt);
            }
        });
        jPanel2.add(A13);
        A13.setBounds(50, 90, 70, 30);

        A14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A14ActionPerformed(evt);
            }
        });
        jPanel2.add(A14);
        A14.setBounds(50, 130, 70, 30);

        A15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A15ActionPerformed(evt);
            }
        });
        jPanel2.add(A15);
        A15.setBounds(50, 170, 70, 30);

        A17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A17ActionPerformed(evt);
            }
        });
        jPanel2.add(A17);
        A17.setBounds(50, 210, 70, 30);

        A18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A18ActionPerformed(evt);
            }
        });
        jPanel2.add(A18);
        A18.setBounds(50, 250, 70, 30);

        A19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A19ActionPerformed(evt);
            }
        });
        jPanel2.add(A19);
        A19.setBounds(50, 290, 70, 30);

        A20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A20ActionPerformed(evt);
            }
        });
        jPanel2.add(A20);
        A20.setBounds(50, 330, 70, 30);

        A28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A28ActionPerformed(evt);
            }
        });
        jPanel2.add(A28);
        A28.setBounds(280, 80, 70, 30);

        A27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A27ActionPerformed(evt);
            }
        });
        jPanel2.add(A27);
        A27.setBounds(280, 40, 70, 30);

        A26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A26ActionPerformed(evt);
            }
        });
        jPanel2.add(A26);
        A26.setBounds(280, 0, 70, 30);

        A25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A25ActionPerformed(evt);
            }
        });
        jPanel2.add(A25);
        A25.setBounds(50, 520, 70, 30);

        A24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A24ActionPerformed(evt);
            }
        });
        jPanel2.add(A24);
        A24.setBounds(50, 490, 70, 30);

        A23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A23ActionPerformed(evt);
            }
        });
        jPanel2.add(A23);
        A23.setBounds(50, 450, 70, 30);

        A22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A22ActionPerformed(evt);
            }
        });
        jPanel2.add(A22);
        A22.setBounds(50, 410, 70, 30);

        A21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A21ActionPerformed(evt);
            }
        });
        jPanel2.add(A21);
        A21.setBounds(50, 370, 70, 30);

        B21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B21ActionPerformed(evt);
            }
        });
        jPanel2.add(B21);
        B21.setBounds(500, 0, 70, 30);

        B22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B22ActionPerformed(evt);
            }
        });
        jPanel2.add(B22);
        B22.setBounds(500, 40, 70, 30);

        B23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B23ActionPerformed(evt);
            }
        });
        jPanel2.add(B23);
        B23.setBounds(500, 80, 70, 30);

        B24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B24ActionPerformed(evt);
            }
        });
        jPanel2.add(B24);
        B24.setBounds(500, 120, 70, 30);

        B25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B25ActionPerformed(evt);
            }
        });
        jPanel2.add(B25);
        B25.setBounds(500, 160, 70, 30);

        B27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B27ActionPerformed(evt);
            }
        });
        jPanel2.add(B27);
        B27.setBounds(500, 350, 70, 20);

        B28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B28ActionPerformed(evt);
            }
        });
        jPanel2.add(B28);
        B28.setBounds(500, 380, 70, 20);

        B29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B29ActionPerformed(evt);
            }
        });
        jPanel2.add(B29);
        B29.setBounds(500, 420, 70, 20);

        B30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B30ActionPerformed(evt);
            }
        });
        jPanel2.add(B30);
        B30.setBounds(500, 460, 70, 20);

        B33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B33ActionPerformed(evt);
            }
        });
        jPanel2.add(B33);
        B33.setBounds(500, 570, 70, 20);

        B32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B32ActionPerformed(evt);
            }
        });
        jPanel2.add(B32);
        B32.setBounds(500, 530, 70, 20);

        B31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B31ActionPerformed(evt);
            }
        });
        jPanel2.add(B31);
        B31.setBounds(500, 500, 70, 20);

        C10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C10ActionPerformed(evt);
            }
        });
        jPanel2.add(C10);
        C10.setBounds(760, 170, 70, 20);

        C11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C11ActionPerformed(evt);
            }
        });
        jPanel2.add(C11);
        C11.setBounds(760, 210, 70, 20);

        C12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C12ActionPerformed(evt);
            }
        });
        jPanel2.add(C12);
        C12.setBounds(760, 250, 70, 20);

        C13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C13ActionPerformed(evt);
            }
        });
        jPanel2.add(C13);
        C13.setBounds(760, 290, 70, 20);

        C14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C14ActionPerformed(evt);
            }
        });
        jPanel2.add(C14);
        C14.setBounds(760, 330, 70, 20);

        C15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C15ActionPerformed(evt);
            }
        });
        jPanel2.add(C15);
        C15.setBounds(760, 370, 70, 20);

        C16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C16ActionPerformed(evt);
            }
        });
        jPanel2.add(C16);
        C16.setBounds(760, 410, 70, 20);

        C17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C17ActionPerformed(evt);
            }
        });
        jPanel2.add(C17);
        C17.setBounds(760, 450, 70, 20);

        C18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C18ActionPerformed(evt);
            }
        });
        jPanel2.add(C18);
        C18.setBounds(760, 490, 70, 20);

        C19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C19ActionPerformed(evt);
            }
        });
        jPanel2.add(C19);
        C19.setBounds(760, 520, 70, 20);

        A29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A29ActionPerformed(evt);
            }
        });
        jPanel2.add(A29);
        A29.setBounds(280, 120, 70, 30);

        A30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A30ActionPerformed(evt);
            }
        });
        jPanel2.add(A30);
        A30.setBounds(280, 160, 70, 30);

        A31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A31ActionPerformed(evt);
            }
        });
        jPanel2.add(A31);
        A31.setBounds(280, 200, 70, 30);

        A32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A32ActionPerformed(evt);
            }
        });
        jPanel2.add(A32);
        A32.setBounds(280, 240, 70, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Se project\\Projectimages\\parklayup.jpg")); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 880, 597);

        jLabel7.setText("jLabel7");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(400, 80, 34, 14);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 877, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String cname=cust_name.getText();
        String vname=veh_name.getText();
        String flname=jLabel9.getText();
        String parklc=parkloc.getText();
        new ConfirmTicket(cname,vname,flname,parklc).setVisible(true);
        dispose();            
    }//GEN-LAST:event_jButton2ActionPerformed

    private void C19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C19ActionPerformed
       
        changecolor(C19);
        parkloc.setText("C19");
        addtodb("C19");
        
    }//GEN-LAST:event_C19ActionPerformed

    private void A27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A27ActionPerformed
       
        changecolor(A27);
        parkloc.setText("A27");
        addtodb("A27");
        
    }//GEN-LAST:event_A27ActionPerformed

    private void A11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A11ActionPerformed
        changecolor(A11);
        parkloc.setText("A11");
        addtodb("A11");
        
        
    }//GEN-LAST:event_A11ActionPerformed

    private void A14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A14ActionPerformed
        // TODO add your handling code here:
        changecolor(A14);
        parkloc.setText("A14");
        addtodb("A14");
        
    }//GEN-LAST:event_A14ActionPerformed

    private void A20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A20ActionPerformed
        // TODO add your handling code here:
        changecolor(A20);
        parkloc.setText("A20");
        addtodb("A20");
        
    }//GEN-LAST:event_A20ActionPerformed

    private void A29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A29ActionPerformed
        changecolor(A29);
        parkloc.setText("A29");
        addtodb("A29");
        // TODO add your handling code here:
    }//GEN-LAST:event_A29ActionPerformed

    private void B22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B22ActionPerformed
        // TODO add your handling code here:
        changecolor(B22);
        parkloc.setText("B22");
        addtodb("B22");
        
    }//GEN-LAST:event_B22ActionPerformed

    private void B33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B33ActionPerformed
        changecolor(B33);
        parkloc.setText("B33");
        addtodb("B33");
        
    }//GEN-LAST:event_B33ActionPerformed

    private void A12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A12ActionPerformed
        changecolor(A12);
        parkloc.setText("A12");
        addtodb("A12");
                // TODO add your handling code here:
    }//GEN-LAST:event_A12ActionPerformed

    private void A13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A13ActionPerformed
        changecolor(A13);
        parkloc.setText("A13");
        addtodb("A13");        // TODO add your handling code here:
    }//GEN-LAST:event_A13ActionPerformed

    private void A15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A15ActionPerformed
    changecolor(A15);
        parkloc.setText("A15");
        addtodb("A15");        // TODO add your handling code here:
    }//GEN-LAST:event_A15ActionPerformed

    private void A17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A17ActionPerformed
        changecolor(A17);
        parkloc.setText("A17");
        addtodb("A17");        // TODO add your handling code here:
    }//GEN-LAST:event_A17ActionPerformed

    private void A18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A18ActionPerformed
        changecolor(A18);
        parkloc.setText("A18");
        addtodb("A18");// TODO add your handling code here:
    }//GEN-LAST:event_A18ActionPerformed

    private void A19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A19ActionPerformed
    changecolor(A19);
        parkloc.setText("A19");
        addtodb("A19");        // TODO add your handling code here:
    }//GEN-LAST:event_A19ActionPerformed

    private void A21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A21ActionPerformed
        changecolor(A21);
        parkloc.setText("A21");
        addtodb("A21");        // TODO add your handling code here:
    }//GEN-LAST:event_A21ActionPerformed

    private void A22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A22ActionPerformed
        changecolor(A22);
        parkloc.setText("A22");
        addtodb("A22");         // TODO add your handling code here:
    }//GEN-LAST:event_A22ActionPerformed

    private void A23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A23ActionPerformed
 changecolor(A23);
        parkloc.setText("A23");
        addtodb("A23");         // TODO add your handling code here:
    }//GEN-LAST:event_A23ActionPerformed

    private void A24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A24ActionPerformed
        changecolor(A24);
        parkloc.setText("A24");
        addtodb("A24");         // TODO add your handling code here:
    }//GEN-LAST:event_A24ActionPerformed

    private void A25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A25ActionPerformed
        changecolor(A25);
        parkloc.setText("A25");
        addtodb("A25");         // TODO add your handling code here:
    }//GEN-LAST:event_A25ActionPerformed

    private void A26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A26ActionPerformed
         changecolor(A26);
        parkloc.setText("A26");
        addtodb("A26");         // TODO add your handling code here:
    }//GEN-LAST:event_A26ActionPerformed

    private void A28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A28ActionPerformed
        changecolor(A28);
        parkloc.setText("A28");
        addtodb("A28");         // TODO add your handling code here:
    }//GEN-LAST:event_A28ActionPerformed

    private void A30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A30ActionPerformed
        changecolor(A30);
        parkloc.setText("A30");
        addtodb("A30");         // TODO add your handling code here:
    }//GEN-LAST:event_A30ActionPerformed

    private void A31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A31ActionPerformed
             changecolor(A31);
        parkloc.setText("A31");
        addtodb("A31");            // TODO add your handling code here:
    }//GEN-LAST:event_A31ActionPerformed

    private void A32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A32ActionPerformed
        changecolor(A32);
        parkloc.setText("A32");
        addtodb("A32");                 // TODO add your handling code here:
    }//GEN-LAST:event_A32ActionPerformed

    private void B21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B21ActionPerformed
        changecolor(B21);
        parkloc.setText("B21");
        addtodb("B21");       
       
    }//GEN-LAST:event_B21ActionPerformed

    private void B23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B23ActionPerformed
       changecolor(B23);
        parkloc.setText("B23");
        addtodb("B23");       
        // TODO add your handling code here:
    }//GEN-LAST:event_B23ActionPerformed

    private void B24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B24ActionPerformed
        changecolor(B24);
        parkloc.setText("B24");
        addtodb("B24");       
               // TODO add your handling code here:
    }//GEN-LAST:event_B24ActionPerformed

    private void B25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B25ActionPerformed
        changecolor(B25);
        parkloc.setText("B25");
        addtodb("B25");       
       // TODO add your handling code here:
    }//GEN-LAST:event_B25ActionPerformed

    private void B27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B27ActionPerformed
        changecolor(B27);
        parkloc.setText("B27");
        addtodb("B27");       
               // TODO add your handling code here:
    }//GEN-LAST:event_B27ActionPerformed

    private void B28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B28ActionPerformed
        changecolor(B28);
        parkloc.setText("B28");
        addtodb("B28");       
               // TODO add your handling code here:
    }//GEN-LAST:event_B28ActionPerformed

    private void B29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B29ActionPerformed
        changecolor(B29);
        parkloc.setText("B29");
        addtodb("B29");       
       // TODO add your handling code here:
    }//GEN-LAST:event_B29ActionPerformed

    private void B30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B30ActionPerformed
        changecolor(B30);
        parkloc.setText("B30");
        addtodb("B30");       
               // TODO add your handling code here:
    }//GEN-LAST:event_B30ActionPerformed

    private void B31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B31ActionPerformed
        changecolor(B31);
        parkloc.setText("B31");
        addtodb("B31");       
       // TODO add your handling code here:
    }//GEN-LAST:event_B31ActionPerformed

    private void B32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B32ActionPerformed
          changecolor(B32);
        parkloc.setText("B32");
        addtodb("B32"); // TODO add your handling code here:
    }//GEN-LAST:event_B32ActionPerformed

    private void C10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C10ActionPerformed
          changecolor(C10);
        parkloc.setText("C10");
        addtodb("C10"); // TODO add your handling code here:
    }//GEN-LAST:event_C10ActionPerformed

    private void C11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C11ActionPerformed
        changecolor(C11);
        parkloc.setText("C11");
        addtodb("C11");// TODO add your handling code here:
    }//GEN-LAST:event_C11ActionPerformed

    private void C12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C12ActionPerformed
    changecolor(C12);
        parkloc.setText("C12");
        addtodb("C12");        // TODO add your handling code here:
    }//GEN-LAST:event_C12ActionPerformed

    private void C13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C13ActionPerformed
       changecolor(C13);
        parkloc.setText("C13");
        addtodb("C13"); // TODO add your handling code here:
    }//GEN-LAST:event_C13ActionPerformed

    private void C14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C14ActionPerformed
      changecolor(C14);
        parkloc.setText("C14");
        addtodb("C14");  // TODO add your handling code here:
    }//GEN-LAST:event_C14ActionPerformed

    private void C15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C15ActionPerformed
     changecolor(C15);
        parkloc.setText("C15");
        addtodb("C15");   // TODO add your handling code here:
    }//GEN-LAST:event_C15ActionPerformed

    private void C16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C16ActionPerformed
        changecolor(C16);
        parkloc.setText("C16");
        addtodb("C16");// TODO add your handling code here:
    }//GEN-LAST:event_C16ActionPerformed

    private void C17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C17ActionPerformed
      changecolor(C17);
        parkloc.setText("C17");
        addtodb("C17");  // TODO add your handling code here:
    }//GEN-LAST:event_C17ActionPerformed

    private void C18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C18ActionPerformed
       changecolor(C18);
        parkloc.setText("C18");
        addtodb("C18"); // TODO add your handling code here:
    }//GEN-LAST:event_C18ActionPerformed

   
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(BookParkingTop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookParkingTop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookParkingTop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookParkingTop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookParkingTop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A11;
    private javax.swing.JButton A12;
    private javax.swing.JButton A13;
    private javax.swing.JButton A14;
    private javax.swing.JButton A15;
    private javax.swing.JButton A17;
    private javax.swing.JButton A18;
    private javax.swing.JButton A19;
    private javax.swing.JButton A20;
    private javax.swing.JButton A21;
    private javax.swing.JButton A22;
    private javax.swing.JButton A23;
    private javax.swing.JButton A24;
    private javax.swing.JButton A25;
    private javax.swing.JButton A26;
    private javax.swing.JButton A27;
    private javax.swing.JButton A28;
    private javax.swing.JButton A29;
    private javax.swing.JButton A30;
    private javax.swing.JButton A31;
    private javax.swing.JButton A32;
    private javax.swing.JButton B21;
    private javax.swing.JButton B22;
    private javax.swing.JButton B23;
    private javax.swing.JButton B24;
    private javax.swing.JButton B25;
    private javax.swing.JButton B27;
    private javax.swing.JButton B28;
    private javax.swing.JButton B29;
    private javax.swing.JButton B30;
    private javax.swing.JButton B31;
    private javax.swing.JButton B32;
    private javax.swing.JButton B33;
    private javax.swing.JButton C10;
    private javax.swing.JButton C11;
    private javax.swing.JButton C12;
    private javax.swing.JButton C13;
    private javax.swing.JButton C14;
    private javax.swing.JButton C15;
    private javax.swing.JButton C16;
    private javax.swing.JButton C17;
    private javax.swing.JButton C18;
    private javax.swing.JButton C19;
    private javax.swing.JLabel cust_name;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel parkloc;
    private javax.swing.JLabel veh_name;
    // End of variables declaration//GEN-END:variables
}
