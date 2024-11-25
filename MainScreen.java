import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MainScreen extends javax.swing.JFrame {

  public static String userName;
    /**
     * Creates new form Main
     */
    public MainScreen() {
        initComponents();
        ErrorUser.setVisible(false);
        PinError.setVisible(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Name1 = new javax.swing.JLabel();
        NameField = new javax.swing.JTextField();
        Password = new javax.swing.JLabel();
        adminLink = new javax.swing.JLabel();
        ErrorMessage = new javax.swing.JLabel();
        ErrorUser = new javax.swing.JLabel();
        PinError = new javax.swing.JLabel();
        Submit = new javax.swing.JButton();
        PinField = new javax.swing.JPasswordField();
        Welcome = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Please1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Screen");
        setMinimumSize(new java.awt.Dimension(704, 361));

        Name1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Name1.setText("  Username/Email:");
        Name1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 0, 0)));

        NameField.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        NameField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        NameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameFieldActionPerformed(evt);
            }
        });

        Password.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Password.setText("  Enter Your Password:");
        Password.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 0, 0)));

        adminLink.setBackground(new java.awt.Color(0, 0, 0));
        adminLink.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        adminLink.setForeground(new java.awt.Color(0, 51, 51));
        adminLink.setText(" I'm an Admin");
        adminLink.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 102, 0)));
        adminLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminLinkMouseClicked(evt);
            }
        });

        ErrorMessage.setForeground(new java.awt.Color(204, 0, 0));

        ErrorUser.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ErrorUser.setForeground(new java.awt.Color(204, 0, 0));
        ErrorUser.setText("** Invalid Username or Password**");

        PinError.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        PinError.setForeground(new java.awt.Color(204, 0, 0));
        PinError.setText("**Wrong Pin**");

        Submit.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        Submit.setForeground(new java.awt.Color(0, 51, 51));
        Submit.setText("  LOGIN ");
        Submit.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        PinField.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        PinField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        PinField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PinFieldActionPerformed(evt);
            }
        });

        Welcome.setFont(new java.awt.Font("Lucida Calligraphy", 1, 36)); // NOI18N
        Welcome.setForeground(new java.awt.Color(51, 102, 0));
        Welcome.setText("Welcome!!");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 697, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        Please1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        Please1.setText("   Please Login to Continue");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addComponent(Welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ErrorUser)
                                .addGap(108, 108, 108))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(PinError)
                                .addGap(165, 165, 165)))
                        .addComponent(adminLink, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PinField, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(157, 157, 157))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Please1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(255, 255, 255))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Name1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(173, 173, 173)
                        .addComponent(ErrorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ErrorMessage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(Welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Please1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Name1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PinField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ErrorUser, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PinError, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(Submit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(adminLink, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameFieldActionPerformed

    private void adminLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminLinkMouseClicked
        // TODO add your handling code here:
         this.setVisible(false);
        new Admin().setVisible(true);
        
    }//GEN-LAST:event_adminLinkMouseClicked

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
       // Handle login submission
        ErrorUser.setVisible(false);
        PinError.setVisible(false);

        String username = this.NameField.getText();
        String password = this.PinField.getText();
        int pin = 0;

        try {
            pin = Integer.parseInt(password);  // parsing the pin
        } catch (Exception e) {
            PinError.setVisible(false);
            PinField.setText(null);
        }

        if (username == null || password == null) {
            ErrorUser.setText("Please Enter all credentials");
            ErrorUser.setVisible(true);
        }

        // Connect to the database and check if the username and pin are valid
        if (isValidUser(username, password)) {
            userName = username;
            this.setVisible(false);
            new UserScreen().setVisible(true);
        } else {
            ErrorUser.setVisible(true);
            PinField.setText(null);
        }

        if (username == null || password == null) {
            ErrorUser.setText("Please Enter all credentials");
            ErrorUser.setVisible(true);
            PinError.setVisible(false);
        }

    }//GEN-LAST:event_SubmitActionPerformed
private boolean isValidUser(String username, String password) {
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    boolean isValid = false;

    try {
        // Establish connection
        conn = DatabaseConnection.getInstance().getConnection();

        // Prepare SQL query
        String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
        stmt = conn.prepareStatement(sql);
        stmt.setString(1, username);
        stmt.setString(2, password);

        // Execute query
        rs = stmt.executeQuery();
        if (rs.next()) {
            isValid = true; // User exists with matching username and password
        }
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        try {
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    return isValid;
}


    private void PinFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PinFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PinFieldActionPerformed

    
    public static void main(String args[]) {
 
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }
    
      
          

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ErrorMessage;
    private javax.swing.JLabel ErrorUser;
    private javax.swing.JLabel Name1;
    private javax.swing.JTextField NameField;
    private javax.swing.JLabel Password;
    private javax.swing.JLabel PinError;
    private javax.swing.JPasswordField PinField;
    private javax.swing.JLabel Please1;
    private javax.swing.JButton Submit;
    private javax.swing.JLabel Welcome;
    private javax.swing.JLabel adminLink;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
