import java.io.*;
import java.util.*;
import java.sql.*;
import javax.swing.*;

public class SearchByName extends javax.swing.JFrame {  
    UserScreen us= new UserScreen();
    SavedData sd=new SavedData();
  
    public SearchByName() {
        initComponents();
        ErrorBook.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        BookAns4 = new javax.swing.JLabel();
        BookAns6 = new javax.swing.JLabel();
        BookNameInput = new javax.swing.JLabel();
        BookNameField = new javax.swing.JTextField();
        BookName = new javax.swing.JLabel();
        AuthorName = new javax.swing.JLabel();
        Year = new javax.swing.JLabel();
        BookName3 = new javax.swing.JLabel();
        BookName4 = new javax.swing.JLabel();
        NameAns = new javax.swing.JLabel();
        AuthorAns = new javax.swing.JLabel();
        YearAns = new javax.swing.JLabel();
        CatAns = new javax.swing.JLabel();
        RackAns = new javax.swing.JLabel();
        Search = new javax.swing.JButton();
        ErrorBook = new javax.swing.JLabel();
        BookAns1 = new javax.swing.JLabel();
        AuthorAns1 = new javax.swing.JLabel();
        YearAns1 = new javax.swing.JLabel();
        CatAns1 = new javax.swing.JLabel();
        RackAns1 = new javax.swing.JLabel();
        Main = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("jLabel1");

        BookAns4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BookAns4.setText("                                           ");
        BookAns4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BookAns6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BookAns6.setText("                                           ");
        BookAns6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Search by Name");

        BookNameInput.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BookNameInput.setText(" Enter Book Name");
        BookNameInput.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 0, 0)));

        BookNameField.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        BookNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookNameFieldActionPerformed(evt);
            }
        });
        BookNameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BookNameFieldKeyReleased(evt);
            }
        });

        BookName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BookName.setText("Book:");

        AuthorName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AuthorName.setText("Author Name:");

        Year.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Year.setText("Year Published:");

        BookName3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BookName3.setText("Category:");

        BookName4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        BookName4.setText("Rack:");

        NameAns.setBackground(new java.awt.Color(255, 255, 255));
        NameAns.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        AuthorAns.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        YearAns.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        CatAns.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        RackAns.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        Search.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Search.setForeground(new java.awt.Color(0, 51, 51));
        Search.setText("Search");
        Search.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        ErrorBook.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ErrorBook.setForeground(new java.awt.Color(204, 0, 0));
        ErrorBook.setText("No Book found!!");

        BookAns1.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        BookAns1.setForeground(new java.awt.Color(0, 0, 102));

        AuthorAns1.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        AuthorAns1.setForeground(new java.awt.Color(0, 0, 102));

        YearAns1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        YearAns1.setForeground(new java.awt.Color(0, 0, 102));

        CatAns1.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        CatAns1.setForeground(new java.awt.Color(0, 0, 102));

        RackAns1.setFont(new java.awt.Font("Times New Roman", 0, 15)); // NOI18N
        RackAns1.setForeground(new java.awt.Color(0, 0, 102));

        Main.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        Main.setForeground(new java.awt.Color(0, 51, 51));
        Main.setText("Main Menu");
        Main.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 102, 0)));
        Main.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainActionPerformed(evt);
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
                .addContainerGap(162, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AuthorName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Year, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BookName, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addComponent(BookName3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BookName4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AuthorAns, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(YearAns, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NameAns, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(YearAns1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CatAns1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RackAns1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookAns1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AuthorAns1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(ErrorBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(134, 134, 134)
                        .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(BookNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BookNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RackAns, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CatAns, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(Main)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BookNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addComponent(ErrorBook, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BookName)
                    .addComponent(NameAns)
                    .addComponent(BookAns1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AuthorName)
                    .addComponent(AuthorAns)
                    .addComponent(AuthorAns1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Year)
                    .addComponent(YearAns)
                    .addComponent(YearAns1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BookName3)
                    .addComponent(CatAns)
                    .addComponent(CatAns1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BookName4)
                    .addComponent(RackAns)
                    .addComponent(RackAns1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(Main)
                .addGap(24, 24, 24))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        try {
            search();
        } 
        catch(SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error connecting to database: " + ex.getMessage(),
                    "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_SearchActionPerformed

    private void MainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainActionPerformed
        this.setVisible(false);
        PanelFactory.createPanel("userscreen").setVisible(true);
    }//GEN-LAST:event_MainActionPerformed

    private void BookNameFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BookNameFieldKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_BookNameFieldKeyReleased

    private void BookNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BookNameFieldActionPerformed
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PanelFactory.createPanel("searchbyname").setVisible(true);
            }
        });
    }
    
    public void search() throws SQLException {
        ErrorBook.setVisible(false);
        BookAns1.setText(null);
        AuthorAns1.setText(null);
        YearAns1.setText(null);
        CatAns1.setText(null);
        RackAns1.setText(null);

        String name = this.BookNameField.getText();
        boolean found = false;

        // Use singleton to get the database connection
        Connection connection = DatabaseConnection.getInstance().getConnection();
        String query = "SELECT * FROM Books WHERE book_name = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, name);
            ResultSet resultSet = stmt.executeQuery();
            if (resultSet.next()) {
                found = true;

                BookAns1.setText(resultSet.getString("book_name"));
                AuthorAns1.setText(resultSet.getString("author"));
                YearAns1.setText(resultSet.getString("year"));
                CatAns1.setText(resultSet.getString("category_id"));
                RackAns1.setText(resultSet.getString("rack_id"));
                WriteNow(resultSet.getString("book_name"), resultSet.getString("author"));
            }
        }
        if (!found) {
            ErrorBook.setVisible(true);
        }
    }
   public void WriteNow(String name, String author) throws SQLException {
        Connection connection = DatabaseConnection.getInstance().getConnection();
        String query = "INSERT INTO SearchHistory (book_name, author) VALUES (?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, name);
            stmt.setString(2, author);
            stmt.executeUpdate();
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AuthorAns;
    private javax.swing.JLabel AuthorAns1;
    private javax.swing.JLabel AuthorName;
    private javax.swing.JLabel BookAns1;
    private javax.swing.JLabel BookAns4;
    private javax.swing.JLabel BookAns6;
    private javax.swing.JLabel BookName;
    private javax.swing.JLabel BookName3;
    private javax.swing.JLabel BookName4;
    private javax.swing.JTextField BookNameField;
    private javax.swing.JLabel BookNameInput;
    private javax.swing.JLabel CatAns;
    private javax.swing.JLabel CatAns1;
    private javax.swing.JLabel ErrorBook;
    private javax.swing.JButton Main;
    private javax.swing.JLabel NameAns;
    private javax.swing.JLabel RackAns;
    private javax.swing.JLabel RackAns1;
    private javax.swing.JButton Search;
    private javax.swing.JLabel Year;
    private javax.swing.JLabel YearAns;
    private javax.swing.JLabel YearAns1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
