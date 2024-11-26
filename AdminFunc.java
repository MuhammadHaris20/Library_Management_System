
public class AdminFunc extends javax.swing.JFrame {

    SavedData s=new SavedData();
    UserScreen us=new UserScreen();
    /**
     * Creates new form AdminFunc
     */
    public AdminFunc() {
        initComponents();
        Hello.setText("Hello "+ s.nameAdmin);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddBook = new javax.swing.JButton();
        SwitchAdmin = new javax.swing.JButton();
        LogOut = new javax.swing.JButton();
        Hello = new javax.swing.JLabel();
        Please = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        AddBook2 = new javax.swing.JButton();
        AddBook3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Screen");

        AddBook.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AddBook.setText("            ADD A BOOK");
        AddBook.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 0, 0)));
        AddBook.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        AddBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBookActionPerformed(evt);
            }
        });

        SwitchAdmin.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        SwitchAdmin.setForeground(new java.awt.Color(0, 51, 51));
        SwitchAdmin.setText(" Switch to Reader's View ");
        SwitchAdmin.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        SwitchAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SwitchAdminActionPerformed(evt);
            }
        });

        LogOut.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LogOut.setForeground(new java.awt.Color(0, 51, 51));
        LogOut.setText("LOGOUT");
        LogOut.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 102, 0)));
        LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutActionPerformed(evt);
            }
        });

        Hello.setFont(new java.awt.Font("Lucida Calligraphy", 1, 24)); // NOI18N
        Hello.setForeground(new java.awt.Color(0, 51, 204));
        Hello.setText("    ");
        Hello.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Please.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        Please.setText("     SELECT ANY FUNCTION");
        Please.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 102, 102)));

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

        AddBook2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AddBook2.setText("          ADD NEW USER");
        AddBook2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 0, 0)));
        AddBook2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        AddBook2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBook2ActionPerformed(evt);
            }
        });

        AddBook3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AddBook3.setText("          ADD NEW FINE");
        AddBook3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 0, 0)));
        AddBook3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        AddBook3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBook3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(217, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Hello, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(Please, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(134, 134, 134))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SwitchAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AddBook3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddBook2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddBook, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Hello)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Please, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(AddBook, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AddBook2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AddBook3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SwitchAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AddBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBookActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        PanelFactory.createPanel("addbook").setVisible(true);
    }//GEN-LAST:event_AddBookActionPerformed

    private void SwitchAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SwitchAdminActionPerformed
        // TODO add your handling code here:
        
        this.setVisible(false);
        PanelFactory.createPanel("userscreen").setVisible(true);
    }//GEN-LAST:event_SwitchAdminActionPerformed

    private void LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutActionPerformed

         s.who=false;
         us.count=0;
         this.setVisible(false);
         PanelFactory.createPanel("admin").setVisible(true);
        
         
        
    }//GEN-LAST:event_LogOutActionPerformed

    private void AddBook2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBook2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddBook2ActionPerformed

    private void AddBook3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBook3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddBook3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PanelFactory.createPanel("adminfunc").setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBook;
    private javax.swing.JButton AddBook2;
    private javax.swing.JButton AddBook3;
    private javax.swing.JLabel Hello;
    public javax.swing.JButton LogOut;
    private javax.swing.JLabel Please;
    private javax.swing.JButton SwitchAdmin;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
