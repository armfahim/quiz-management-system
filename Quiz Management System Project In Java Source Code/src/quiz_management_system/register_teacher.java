/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz_management_system;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import com.mysql.jdbc.Messages;
import java.awt.event.KeyEvent;
import java.util.regex.Pattern;

/**
 *
 * @author admin
 */
public class register_teacher extends javax.swing.JFrame {

    /**
     * Creates new form register_teacher
     */
    public register_teacher() {
        initComponents();
               

        oldpanel.setBackground(new Color(0,0,0,64));
        newpanel.setBackground(new Color(0,0,0,64));
        namet.setBackground(new Color(0,0,0,64));
        namel.setBackground(new Color(0,0,0,64));
        passt.setBackground(new Color(0,0,0,64));
        passl.setBackground(new Color(0,0,0,64));
        yeart.setBackground(new Color(0,0,0,64));
        yearl.setBackground(new Color(0,0,0,64));
        departt.setBackground(new Color(0,0,0,64));
        departl.setBackground(new Color(0,0,0,64));
        mobilet.setBackground(new Color(0,0,0,64));
        mobilel.setBackground(new Color(0,0,0,64));
        emailt.setBackground(new Color(0,0,0,64));
        emaill.setBackground(new Color(0,0,0,64));
        usert.setBackground(new Color(0,0,0,64));
        userl.setBackground(new Color(0,0,0,64));
        signup.setBackground(new Color(0,0,0,64));
      
       
         home.setBackground(new Color(0,0,0,64));
         
         reset1.setBackground(new Color(0,0,0,64));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        oldpanel = new javax.swing.JPanel();
        newpanel = new javax.swing.JPanel();
        yearl = new javax.swing.JLabel();
        namel = new javax.swing.JLabel();
        departl = new javax.swing.JLabel();
        emaill = new javax.swing.JLabel();
        passl = new javax.swing.JLabel();
        mobilel = new javax.swing.JLabel();
        userl = new javax.swing.JLabel();
        emailt = new javax.swing.JTextField();
        departt = new javax.swing.JComboBox<>();
        yeart = new javax.swing.JComboBox<>();
        namet = new javax.swing.JTextField();
        mobilet = new javax.swing.JTextField();
        usert = new javax.swing.JTextField();
        signup = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        home = new javax.swing.JButton();
        passt = new javax.swing.JPasswordField();
        reset1 = new javax.swing.JButton();

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/40715.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        oldpanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Create Account", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 36), new java.awt.Color(255, 0, 0))); // NOI18N
        oldpanel.setForeground(new java.awt.Color(255, 255, 255));

        newpanel.setForeground(new java.awt.Color(255, 255, 255));

        yearl.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        yearl.setForeground(new java.awt.Color(255, 255, 255));
        yearl.setText("Subjects");

        namel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        namel.setForeground(new java.awt.Color(255, 255, 255));
        namel.setText("Name");

        departl.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        departl.setForeground(new java.awt.Color(255, 255, 255));
        departl.setText("Department");

        emaill.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        emaill.setForeground(new java.awt.Color(255, 255, 255));
        emaill.setText("Email ID");

        passl.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        passl.setForeground(new java.awt.Color(255, 255, 255));
        passl.setText("Password");

        mobilel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        mobilel.setForeground(new java.awt.Color(255, 255, 255));
        mobilel.setText("Mobile no");

        userl.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        userl.setForeground(new java.awt.Color(255, 255, 255));
        userl.setText("Username");

        emailt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        emailt.setForeground(new java.awt.Color(255, 255, 255));

        departt.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        departt.setForeground(new java.awt.Color(255, 255, 255));
        departt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Select Department>", "Mechanical", "I.T", "Civil", "Electronics", "E&TC", "Environment", "Production", "C.S.E" }));

        yeart.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        yeart.setForeground(new java.awt.Color(255, 255, 255));
        yeart.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Select Subject>", "Internet Technology", "Data Structure", "Java", "C", "Cpp", "python", "nodejs", " " }));

        namet.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        namet.setForeground(new java.awt.Color(255, 255, 255));

        mobilet.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        mobilet.setForeground(new java.awt.Color(255, 255, 255));
        mobilet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mobiletKeyTyped(evt);
            }
        });

        usert.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        usert.setForeground(new java.awt.Color(255, 255, 255));

        signup.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        signup.setForeground(new java.awt.Color(255, 255, 255));
        signup.setText("Signup");
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });

        home.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        home.setForeground(new java.awt.Color(255, 255, 255));
        home.setText("Back");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        passt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        passt.setForeground(new java.awt.Color(255, 255, 255));

        reset1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        reset1.setForeground(new java.awt.Color(255, 255, 255));
        reset1.setText("Reset");
        reset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout newpanelLayout = new javax.swing.GroupLayout(newpanel);
        newpanel.setLayout(newpanelLayout);
        newpanelLayout.setHorizontalGroup(
            newpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newpanelLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(signup, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reset1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(newpanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(newpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(newpanelLayout.createSequentialGroup()
                        .addGroup(newpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(newpanelLayout.createSequentialGroup()
                                .addComponent(passl, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(passt))
                            .addGroup(newpanelLayout.createSequentialGroup()
                                .addComponent(yearl, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(yeart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(newpanelLayout.createSequentialGroup()
                                .addComponent(mobilel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(mobilet, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(newpanelLayout.createSequentialGroup()
                                .addComponent(departl, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(newpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(namet, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(departt, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(26, Short.MAX_VALUE))
                    .addGroup(newpanelLayout.createSequentialGroup()
                        .addGroup(newpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(newpanelLayout.createSequentialGroup()
                                .addGroup(newpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(userl, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emaill, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(newpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(newpanelLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(emailt, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE))
                                    .addGroup(newpanelLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(usert))))
                            .addGroup(newpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(home)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(newpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(newpanelLayout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(namel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(350, Short.MAX_VALUE)))
        );
        newpanelLayout.setVerticalGroup(
            newpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newpanelLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(namet, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(newpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(departl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(departt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(newpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yeart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(newpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mobilel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mobilet, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(newpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emaill, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(newpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usert, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(newpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(passl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(newpanelLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(passt)))
                .addGap(18, 18, 18)
                .addGroup(newpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(signup, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset1, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(home)
                .addGap(79, 79, 79))
            .addGroup(newpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(newpanelLayout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addComponent(namel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(405, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout oldpanelLayout = new javax.swing.GroupLayout(oldpanel);
        oldpanel.setLayout(oldpanelLayout);
        oldpanelLayout.setHorizontalGroup(
            oldpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, oldpanelLayout.createSequentialGroup()
                .addContainerGap(387, Short.MAX_VALUE)
                .addComponent(newpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        oldpanelLayout.setVerticalGroup(
            oldpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, oldpanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(newpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        getContentPane().add(oldpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, 20, 830, 590));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        dispose();
        new welcome().setVisible(true);
    }//GEN-LAST:event_homeActionPerformed

    private void reset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset1ActionPerformed
        namet.setText(null);

        passt.setText(null);

        mobilet.setText(null);

        emailt.setText(null);

        usert.setText(null);
    }//GEN-LAST:event_reset1ActionPerformed

    private void signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupActionPerformed
            
         Pattern digitPattern = Pattern.compile("\\d{15}");
        String mob=mobilet.getText();
        if(digitPattern.matcher(mob).matches()){
        
        
        
        
        
        
        
        try {
//            Connection con;
//            
//            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz", "root","");
            
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/quiz","root","");  
            
            String str="insert into tech_info(id,name,department,subject,moblie,email,user,pass) values(0,?,?,?,?,?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(str);
            String name=namet.getText();
            String department=departt.getSelectedItem().toString();
            String year=yeart.getSelectedItem().toString();
           // String mob=mobilet.getText();
            String email=emailt.getText();
            String user=usert.getText();
            String pass=passt.getText();
            pstmt.setString(1,name);
            pstmt.setString(2,department);
            pstmt.setString(3,year);
            pstmt.setString(4,mob);
            pstmt.setString(5,email);
            pstmt.setObject(6,user);
            pstmt.setObject(7,pass);
            
            int res = pstmt.executeUpdate();
            if(res!=0)
            {
                JOptionPane.showMessageDialog(null,"User created successfully");
                new teacher_login().setVisible(true);
                this.dispose();
               
                
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Failed to create user");
            
                pstmt.close();
                con.close();
            }
        } catch(Exception e){}
        
        }
        else {
             JOptionPane.showMessageDialog(null,"Enter Valid number");
        }
    }//GEN-LAST:event_signupActionPerformed

    private void mobiletKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mobiletKeyTyped
          char c= evt.getKeyChar();
        String p;
        p = Character.toString(c);
       if(!(Character.isDigit(c)) || (c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_DELETE) )
       {
           evt.consume();
         
           
       } 
    }//GEN-LAST:event_mobiletKeyTyped

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
            java.util.logging.Logger.getLogger(register_teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register_teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register_teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register_teacher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register_teacher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel departl;
    private javax.swing.JComboBox<String> departt;
    private javax.swing.JLabel emaill;
    private javax.swing.JTextField emailt;
    private javax.swing.JButton home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel mobilel;
    private javax.swing.JTextField mobilet;
    private javax.swing.JLabel namel;
    private javax.swing.JTextField namet;
    private javax.swing.JPanel newpanel;
    private javax.swing.JPanel oldpanel;
    private javax.swing.JLabel passl;
    private javax.swing.JPasswordField passt;
    private javax.swing.JButton reset1;
    private javax.swing.JButton signup;
    private javax.swing.JLabel userl;
    private javax.swing.JTextField usert;
    private javax.swing.JLabel yearl;
    private javax.swing.JComboBox<String> yeart;
    // End of variables declaration//GEN-END:variables
}
