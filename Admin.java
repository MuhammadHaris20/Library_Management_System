import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Admin extends javax.swing.JFrame {

    public static boolean who=false;
    public static String nameAdmin;
    /**
     * Creates new form 
     */
    public Admin() {
        initComponents();
         NameError.setVisible(false);
        PassError.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PasswordField = new javax.swing.JPasswordField();
        AdminName = new javax.swing.JLabel();
        AdminField = new javax.swing.JTextField();
        AdminPassword = new javax.swing.JLabel();
        UserLink = new javax.swing.JLabel();
        Login = new javax.swing.JButton();
        NameError = new javax.swing.JLabel();
        PassError = new javax.swing.JLabel();
        Welcome = new javax.swing.JLabel();
        Please = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Login");

        PasswordField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 102)));
        PasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordFieldActionPerformed(evt);
            }
        });

        AdminName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        AdminName.setText("  Username/Email:");
        AdminName.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 0, 0)));

        AdminField.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        AdminField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 102)));
        AdminField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminFieldActionPerformed(evt);
            }
        });

        AdminPassword.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        AdminPassword.setText("  Enter Your Password: ");
        AdminPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 0, 0)));

        UserLink.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        UserLink.setForeground(new java.awt.Color(0, 51, 51));
        UserLink.setText(" I'm a User");
        UserLink.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 102, 0)));
        UserLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserLinkMouseClicked(evt);
            }
        });

        Login.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Login.setForeground(new java.awt.Color(0, 51, 51));
        Login.setText("LOGIN");
        Login.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        Login.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });

        NameError.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        NameError.setForeground(new java.awt.Color(204, 0, 0));
        NameError.setText("** No Admin Found for this name **");

        PassError.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        PassError.setForeground(new java.awt.Color(204, 0, 0));
        PassError.setText("         **Wrong Password**    ");

        Welcome.setFont(new java.awt.Font("Lucida Calligraphy", 1, 36)); // NOI18N
        Welcome.setForeground(new java.awt.Color(51, 102, 0));
        Welcome.setText("Welcome!!");

        Please.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        Please.setText("   Please Login to Continue");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(NameError)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PassError)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(UserLink, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(Please, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(Welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(AdminPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(AdminName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(24, 24, 24)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(AdminField, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                        .addComponent(PasswordField)))))
                        .addGap(74, 74, 74))))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Please, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AdminField)
                    .addComponent(AdminName, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AdminPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(PasswordField))
                .addGap(29, 29, 29)
                .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NameError, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PassError, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UserLink, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordFieldActionPerformed

    private void AdminFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdminFieldActionPerformed

    private void UserLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserLinkMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        PanelFactory.createPanel("mainscreen").setVisible(true);

    }//GEN-LAST:event_UserLinkMouseClicked
// Method to check if the password meets the criteria (at least 8 characters, includes letters, digits, and special characters)
private boolean isPasswordValid(String password) {
    if (password.length() >= 8 && 
        password.matches(".*[A-Za-z].*") &&  // At least one letter
        password.matches(".*[0-9].*") &&    // At least one digit
        password.matches(".*[@#$%^&+=].*")) {  // At least one special character
        return true;
    }
    return false;
}
    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
    NameError.setVisible(false);
    PassError.setVisible(false);

    String name = this.AdminField.getText();
    String pass = this.PasswordField.getText();

    // Validate the admin name format
    if (!isAdminNameValid(name)) {
        NameError.setText("** Invalid Admin Name Format **");
        NameError.setVisible(true);
        return;
    }

    // Validate the password format
    if (!isPasswordValid(pass)) {
        PassError.setText("** Invalid Password Combination **");
        PassError.setVisible(true);
        return;
    }

    // Check if the admin name exists in the database
    if (NameSearch(name)) {
        // Check if the password matches
        if (PassSearch(name, pass)) {
            who = true;
            nameAdmin = name;
            this.setVisible(false);
            PanelFactory.createPanel("adminfunc").setVisible(true);
        } else {
            PassError.setVisible(true);
            PasswordField.setText("");
        }
    } else {
        NameError.setVisible(true);
        PasswordField.setText("");
    }


    }//GEN-LAST:event_LoginActionPerformed

    // Method to validate the admin name
private boolean isAdminNameValid(String name) {
    // Regex for valid email or username
    String emailRegex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$"; // Email validation
    String usernameRegex = "^[A-Za-z0-9@#$%^&+=]+$"; // Username validation (no spaces)

    // Check for spaces
    if (name.contains(" ")) {
        return false;
    }

    // Check if it's a valid email or username
    if (name.matches(emailRegex) || name.matches(usernameRegex)) {
        return true;
    }

    return false; // Invalid name
}

private boolean NameSearch(String name) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            conn = DatabaseConnection.getInstance().getConnection(); // Get singleton connection
            String query = "SELECT * FROM admin WHERE name = ?";
            ps = conn.prepareStatement(query);
            ps.setString(1, name);
            rs = ps.executeQuery();

            return rs.next(); // True if name exists
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

        // Method to check if the password is valid
private boolean PassSearch(String name, String pass) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            conn = DatabaseConnection.getInstance().getConnection(); // Get singleton connection
            String query = "SELECT * FROM admin WHERE name = ? AND password = ?";
            ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, pass);
            rs = ps.executeQuery();

            return rs.next(); // True if name and password match
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PanelFactory.createPanel("admin").setVisible(true);
            }
        });
    }
    

    
        
        
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AdminField;
    private javax.swing.JLabel AdminName;
    private javax.swing.JLabel AdminPassword;
    private javax.swing.JButton Login;
    private javax.swing.JLabel NameError;
    private javax.swing.JLabel PassError;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel Please;
    private javax.swing.JLabel UserLink;
    private javax.swing.JLabel Welcome;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
