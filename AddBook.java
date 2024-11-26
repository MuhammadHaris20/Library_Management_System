import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public final class AddBook extends javax.swing.JFrame  {

    public AddBook() {
        initComponents();
        initiatecategory();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DialogAdd = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        AddAnother = new javax.swing.JButton();
        Return = new javax.swing.JButton();
        sectionbox = new javax.swing.JComboBox<>();
        Category = new javax.swing.JLabel();
        Rack = new javax.swing.JLabel();
        rackbox = new javax.swing.JComboBox<>();
        next1 = new javax.swing.JButton();
        NameLabel = new javax.swing.JLabel();
        AuthorLabel = new javax.swing.JLabel();
        YearLabel = new javax.swing.JLabel();
        NameField = new javax.swing.JTextField();
        AuthorField = new javax.swing.JTextField();
        YearField = new javax.swing.JTextField();
        ReturntoMain = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        DialogAdd.setMinimumSize(new java.awt.Dimension(400, 175));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("Book Added Successfully!!");

        AddAnother.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        AddAnother.setText("Add Another Book");
        AddAnother.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddAnotherActionPerformed(evt);
            }
        });

        Return.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Return.setText("Return to Main Screen");
        Return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DialogAddLayout = new javax.swing.GroupLayout(DialogAdd.getContentPane());
        DialogAdd.getContentPane().setLayout(DialogAddLayout);
        DialogAddLayout.setHorizontalGroup(
            DialogAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogAddLayout.createSequentialGroup()
                .addGroup(DialogAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DialogAddLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(AddAnother)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Return, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DialogAddLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel1)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        DialogAddLayout.setVerticalGroup(
            DialogAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogAddLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DialogAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddAnother)
                    .addComponent(Return))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add Book");

        sectionbox.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        sectionbox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        sectionbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sectionboxActionPerformed(evt);
            }
        });

        Category.setBackground(new java.awt.Color(204, 204, 255));
        Category.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Category.setText("   Select the Section of new Book:");
        Category.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 0, 0)));
        Category.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));

        Rack.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Rack.setText("  Select the Rack No. of new Book:  ");
        Rack.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 0, 0)));

        rackbox.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        rackbox.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 153)));
        rackbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rackboxActionPerformed(evt);
            }
        });

        next1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        next1.setForeground(new java.awt.Color(0, 51, 51));
        next1.setText(" Add this Book ");
        next1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        next1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next1ActionPerformed(evt);
            }
        });

        NameLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        NameLabel.setText("         Enter the Book Name:");
        NameLabel.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 0, 0)));

        AuthorLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        AuthorLabel.setText("        Enter the Author Name:");
        AuthorLabel.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 0, 0)));

        YearLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        YearLabel.setText("           Year of Publication:");
        YearLabel.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 0, 0)));

        NameField.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        NameField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 102)));
        NameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameFieldActionPerformed(evt);
            }
        });

        AuthorField.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        AuthorField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 102)));
        AuthorField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AuthorFieldActionPerformed(evt);
            }
        });

        YearField.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        YearField.setForeground(new java.awt.Color(255, 0, 0));
        YearField.setText("   ");
        YearField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 102, 102)));
        YearField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YearFieldActionPerformed(evt);
            }
        });

        ReturntoMain.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ReturntoMain.setForeground(new java.awt.Color(0, 51, 51));
        ReturntoMain.setText("Main Menu");
        ReturntoMain.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 102, 0)));
        ReturntoMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturntoMainActionPerformed(evt);
            }
        });

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(AuthorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ReturntoMain, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Rack)
                                    .addComponent(Category, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(YearLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NameField)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rackbox, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sectionbox, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AuthorField, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(YearField, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 53, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(next1)))
                .addGap(81, 81, 81))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Category, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sectionbox, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Rack, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rackbox, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AuthorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AuthorField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(YearLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(YearField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(next1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ReturntoMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void rackboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rackboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rackboxActionPerformed
/*
    private void next1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next1ActionPerformed
        // TODO add your handling code here:
        */
           // Add book to the database
    private void next1ActionPerformed(java.awt.event.ActionEvent evt) {
            String name = NameField.getText();
    String author = AuthorField.getText();
    String year = YearField.getText();
    String section = (String) sectionbox.getSelectedItem();
    String rack = (String) rackbox.getSelectedItem();

    // Validation for empty fields
    if (name.isEmpty() || author.isEmpty() || year.isEmpty() || section == null || rack == null) {
        JOptionPane.showMessageDialog(this, "All fields must be filled out.");
        return;
    }

    // Validation for valid year
    if (!isValidYear(year)) {
        JOptionPane.showMessageDialog(this, "Please enter a valid 4-digit year.", "Invalid Year", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Save to database
    saveToDatabase(name, author, year, section, rack);

    // Hide current panel and show the next panel
    this.setVisible(false);
    PanelFactory.createPanel("adminfunc").setVisible(true);
    }//GEN-LAST:event_next1ActionPerformed

    private boolean isValidYear(String year) {
    try {
        int parsedYear = Integer.parseInt(year.trim());
        return parsedYear >= 1000 && parsedYear <= 9999;
    } catch (NumberFormatException e) {
        return false; // Not a valid integer or outside the 4-digit range
    }
}
    
    
    private void saveToDatabase(String name, String author, String year, String section, String rack) {
        Connection conn = DatabaseConnection.getInstance().getConnection();

        try {
            if (bookExists(conn, name)) {
                JOptionPane.showMessageDialog(this, "This book already exists in the database.");
                return;
            }
            int categoryId = getIdFromDatabase(conn, "categories", "category_name", section);
            int rackId = getIdFromDatabase(conn, "racks", "rack_number", rack);

            String query = "INSERT INTO books (book_name, author, year, category_id, rack_id) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setString(1, name);
                stmt.setString(2, author);
                stmt.setInt(3, Integer.parseInt(year.trim()));
                stmt.setInt(4, categoryId);
                stmt.setInt(5, rackId);

                if (stmt.executeUpdate() > 0) {
                    JOptionPane.showMessageDialog(this, "Book details saved to database.");
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to save book details.");
                }
            }
        } catch (SQLException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error saving to database.");
            e.printStackTrace();
        }
    }

private boolean bookExists(Connection conn, String bookName) throws SQLException {
    String query = "SELECT COUNT(*) FROM books WHERE book_name = ?";
    try (PreparedStatement stmt = conn.prepareStatement(query)) {
        stmt.setString(1, bookName);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            return rs.getInt(1) > 0;  // Returns true if the book exists
        }
        return false;
    }
}
    private void NameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameFieldActionPerformed

    private void AuthorFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AuthorFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AuthorFieldActionPerformed

    private void YearFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YearFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_YearFieldActionPerformed

    private void AddAnotherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddAnotherActionPerformed
        // TODO add your handling code here:
         NameField.setText("");
        AuthorField.setText("");
        YearField.setText("");
        DialogAdd.setVisible(false);
    }//GEN-LAST:event_AddAnotherActionPerformed

     
    private void ReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        PanelFactory.createPanel("mainscreen").setVisible(true);
               
    }//GEN-LAST:event_ReturnActionPerformed

    private void ReturntoMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturntoMainActionPerformed
        // TODO add your handling code here:
        
        this.setVisible(false);
        PanelFactory.createPanel("adminfunc").setVisible(true);
    }//GEN-LAST:event_ReturntoMainActionPerformed

    private void sectionboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sectionboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sectionboxActionPerformed

    /**
     * @param args the command line arguments
     */
    private void initiatecategory() {
        Connection conn = DatabaseConnection.getInstance().getConnection();

        try {
            String categoryQuery = "SELECT category_name FROM categories";
            try (PreparedStatement categoryStmt = conn.prepareStatement(categoryQuery);
                 ResultSet categoryRs = categoryStmt.executeQuery()) {
                while (categoryRs.next()) {
                    sectionbox.addItem(categoryRs.getString("category_name"));
                }
            }

            String rackQuery = "SELECT rack_number FROM racks";
            try (PreparedStatement rackStmt = conn.prepareStatement(rackQuery);
                 ResultSet rackRs = rackStmt.executeQuery()) {
                while (rackRs.next()) {
                    rackbox.addItem(rackRs.getString("rack_number"));
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error loading categories or racks from the database.");
            e.printStackTrace();
        }
    }
private int getIdFromDatabase(Connection conn, String table, String column, String value) throws SQLException {
        String query = "SELECT id FROM " + table + " WHERE " + column + " = ?";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, value);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt("id");
            } else {
                throw new SQLException("Value not found in " + table + ": " + value);
            }
        }
    }
public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PanelFactory.createPanel("addbook").setVisible(true);
            }
        });
    
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddAnother;
    private javax.swing.JTextField AuthorField;
    private javax.swing.JLabel AuthorLabel;
    private javax.swing.JLabel Category;
    private javax.swing.JDialog DialogAdd;
    private javax.swing.JTextField NameField;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel Rack;
    private javax.swing.JButton Return;
    private javax.swing.JButton ReturntoMain;
    private javax.swing.JTextField YearField;
    private javax.swing.JLabel YearLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton next1;
    private javax.swing.JComboBox<String> rackbox;
    private javax.swing.JComboBox<String> sectionbox;
    // End of variables declaration//GEN-END:variables
}
