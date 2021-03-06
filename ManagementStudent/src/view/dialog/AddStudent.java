/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.dialog;

import bo.StudentBo;
import entity.Student;
import java.util.Locale;
import java.util.ResourceBundle;
import util.Validate;


public class AddStudent extends javax.swing.JDialog {

    /**
     * Creates new form ViewDetailBook
     */
    /**
     * Creates new form AddStudent
     *
     * @param parent
     * @param modal
     * @param userName
     */
    private final Locale locale;
    private final StudentBo studentBo = new StudentBo();

    private void updateGui(Locale loc) {
        String url = "resource/languages";
        ResourceBundle rb = ResourceBundle.getBundle(url, loc);
        // de doc
        String btAdd = rb.getString("AddBook.AddStudent");
        String rollNumber = rb.getString("AddBook.rollNumber");
        String studentName = rb.getString("AddBook.studentName");
        String gender = rb.getString("AddBook.gender");
        String email = rb.getString("AddBook.email");
        String phoneNumber = rb.getString("AddBook.phoneNumber");
        String address = rb.getString("AddBook.addresss");
        String add = rb.getString("AddBook.add");
        String clear = rb.getString("AddBook.clear");
        
        // update
        txtTitle.setText(btAdd);
        labelLoginAccount11.setText(rollNumber);
        labelLoginAccount4.setText(studentName);
        labelLoginAccount8.setText(gender);
        labelLoginAccount12.setText(email);
        labelLoginAccount10.setText(phoneNumber);
        labelLoginAccount6.setText(address);
        btnAdd.setText(add);
        btnClear.setText(clear);
    }

    public AddStudent(java.awt.Frame parent, boolean modal, String userName, Locale locale) {
        super(parent, modal);
        initComponents();
        txtHiName.setText(userName);
        this.locale = locale;
        updateGui(locale);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        kGradientPanel4 = new keeptoo.KGradientPanel();
        labelLoginAccount4 = new javax.swing.JLabel();
        txtHiName = new javax.swing.JLabel();
        labelLoginAccount6 = new javax.swing.JLabel();
        txtTitle = new javax.swing.JLabel();
        labelLoginAccount11 = new javax.swing.JLabel();
        labelLoginAccount8 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        txtRollNumber = new javax.swing.JTextField();
        btnExitt1 = new javax.swing.JLabel();
        labelLoginAccount10 = new javax.swing.JLabel();
        labelLoginAccount12 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JLabel();
        btnClear = new javax.swing.JLabel();
        txtHi = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        kGradientPanel4.setkEndColor(new java.awt.Color(70, 71, 117));
        kGradientPanel4.setkStartColor(new java.awt.Color(70, 71, 117));
        kGradientPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelLoginAccount4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        labelLoginAccount4.setForeground(new java.awt.Color(255, 255, 255));
        labelLoginAccount4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelLoginAccount4.setText("Name:");
        kGradientPanel4.add(labelLoginAccount4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 120, 50));

        txtHiName.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        txtHiName.setForeground(new java.awt.Color(255, 255, 255));
        txtHiName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtHiName.setText("---------------");
        txtHiName.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kGradientPanel4.add(txtHiName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 160, 30));

        labelLoginAccount6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        labelLoginAccount6.setForeground(new java.awt.Color(255, 255, 255));
        labelLoginAccount6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelLoginAccount6.setText("Address:");
        kGradientPanel4.add(labelLoginAccount6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, 120, 30));

        txtTitle.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        txtTitle.setForeground(new java.awt.Color(255, 255, 255));
        txtTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTitle.setText("Add Student");
        kGradientPanel4.add(txtTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 250, 60));

        labelLoginAccount11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        labelLoginAccount11.setForeground(new java.awt.Color(255, 255, 255));
        labelLoginAccount11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelLoginAccount11.setText("Roll Number");
        kGradientPanel4.add(labelLoginAccount11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 120, 50));

        labelLoginAccount8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        labelLoginAccount8.setForeground(new java.awt.Color(255, 255, 255));
        labelLoginAccount8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelLoginAccount8.setText("Gender:");
        kGradientPanel4.add(labelLoginAccount8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 120, 50));

        txtEmail.setBackground(new java.awt.Color(70, 71, 117));
        txtEmail.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtEmail.setCaretColor(new java.awt.Color(240, 240, 240));
        kGradientPanel4.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 370, 40));

        txtAddress.setColumns(20);
        txtAddress.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        txtAddress.setForeground(new java.awt.Color(102, 102, 102));
        txtAddress.setRows(5);
        jScrollPane2.setViewportView(txtAddress);

        kGradientPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 520, 380, 100));

        txtRollNumber.setBackground(new java.awt.Color(70, 71, 117));
        txtRollNumber.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        txtRollNumber.setForeground(new java.awt.Color(255, 255, 255));
        txtRollNumber.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtRollNumber.setCaretColor(new java.awt.Color(240, 240, 240));
        kGradientPanel4.add(txtRollNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 370, 40));

        btnExitt1.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        btnExitt1.setForeground(new java.awt.Color(255, 255, 255));
        btnExitt1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnExitt1.setText("Exit");
        btnExitt1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExitt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitt1MouseClicked(evt);
            }
        });
        kGradientPanel4.add(btnExitt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 40, 30));

        labelLoginAccount10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        labelLoginAccount10.setForeground(new java.awt.Color(255, 255, 255));
        labelLoginAccount10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelLoginAccount10.setText("Phone Number:");
        kGradientPanel4.add(labelLoginAccount10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 170, 30));

        labelLoginAccount12.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        labelLoginAccount12.setForeground(new java.awt.Color(255, 255, 255));
        labelLoginAccount12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelLoginAccount12.setText("Email:");
        kGradientPanel4.add(labelLoginAccount12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 120, 50));

        btnAdd.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAdd.setText("Add");
        btnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
        });
        kGradientPanel4.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 670, 100, 30));

        btnClear.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnClear.setText("Clear");
        btnClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearMouseClicked(evt);
            }
        });
        kGradientPanel4.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 670, 100, 40));

        txtHi.setFont(new java.awt.Font("Candara Light", 1, 18)); // NOI18N
        txtHi.setForeground(new java.awt.Color(255, 255, 255));
        txtHi.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtHi.setText("Welcome");
        txtHi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        kGradientPanel4.add(txtHi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 90, 30));

        txtPhoneNumber.setBackground(new java.awt.Color(70, 71, 117));
        txtPhoneNumber.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        txtPhoneNumber.setForeground(new java.awt.Color(255, 255, 255));
        txtPhoneNumber.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtPhoneNumber.setCaretColor(new java.awt.Color(240, 240, 240));
        kGradientPanel4.add(txtPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 370, 40));

        txtName.setBackground(new java.awt.Color(70, 71, 117));
        txtName.setFont(new java.awt.Font("Corbel Light", 1, 18)); // NOI18N
        txtName.setForeground(new java.awt.Color(255, 255, 255));
        txtName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        txtName.setCaretColor(new java.awt.Color(240, 240, 240));
        kGradientPanel4.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 370, 40));

        jRadioButton1.setBackground(new java.awt.Color(70, 71, 117));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(240, 240, 240));
        jRadioButton1.setText("Female");
        kGradientPanel4.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, -1, -1));

        jRadioButton2.setBackground(new java.awt.Color(70, 71, 117));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(240, 240, 240));
        jRadioButton2.setText("Male");
        kGradientPanel4.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitt1MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnExitt1MouseClicked

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        // TODO add your handling code here:
        String name = Validate.getName(txtName);
        String rollNumber = Validate.getRollNumber(txtRollNumber);
        boolean gender = jRadioButton1.isSelected();
        String email = Validate.getEmail(txtEmail);
        String phoneNumber = Validate.getPhoneNumber(txtPhoneNumber);
        String address = txtAddress.getText();
        Student student = new Student(rollNumber, name, gender, email,
                phoneNumber, address);
        String mess = studentBo.addStudent(rollNumber, name, gender,
                email, phoneNumber, address);
        studentBo.displayMess(mess, student);
        if(mess.equals("Add successful")){
            this.dispose();
        }
    }//GEN-LAST:event_btnAddMouseClicked

    private void btnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseClicked
        // TODO add your handling code here:
        studentBo.clearInput(txtEmail,txtName,txtPhoneNumber,txtRollNumber);
        txtAddress.setText("");
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_btnClearMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAdd;
    private javax.swing.JLabel btnClear;
    private javax.swing.JLabel btnExitt1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane2;
    private keeptoo.KGradientPanel kGradientPanel4;
    private javax.swing.JLabel labelLoginAccount10;
    private javax.swing.JLabel labelLoginAccount11;
    private javax.swing.JLabel labelLoginAccount12;
    private javax.swing.JLabel labelLoginAccount4;
    private javax.swing.JLabel labelLoginAccount6;
    private javax.swing.JLabel labelLoginAccount8;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JLabel txtHi;
    private javax.swing.JLabel txtHiName;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtRollNumber;
    private javax.swing.JLabel txtTitle;
    // End of variables declaration//GEN-END:variables
}
