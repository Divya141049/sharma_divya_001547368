/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.DeliveryMan.DeliveryMan;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Role.DeliverManRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Divya Sharma
 */
public class CreateDeliveryManJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateDeliveryManJPanel
     */
    
     private JPanel userProcessContainer;
    private EcoSystem ecosystem;
    private DeliveryManDirectory deliveryMandirectory;
    
    
    public CreateDeliveryManJPanel(JPanel userProcessContainer, EcoSystem ecosystem, DeliveryManDirectory deliveryMandirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.deliveryMandirectory = ecosystem.getDeliveryManDirectory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEmailCDM = new javax.swing.JLabel();
        btnBackCDM = new javax.swing.JButton();
        lblAgeCDM = new javax.swing.JLabel();
        lblUserNameCDM = new javax.swing.JLabel();
        lblAddressCDM = new javax.swing.JLabel();
        lblPasswordCDM = new javax.swing.JLabel();
        lblContactCDM = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtContact = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        txtFname = new javax.swing.JTextField();
        txtLname = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        titleCreateDeliveryMan = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblFname = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblLname = new javax.swing.JLabel();
        btnCreateCDM = new javax.swing.JButton();

        setBackground(new java.awt.Color(151, 145, 151));

        lblEmailCDM.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        lblEmailCDM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmailCDM.setText("EMAIL");

        btnBackCDM.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        btnBackCDM.setText("BACK");
        btnBackCDM.setBorder(new javax.swing.border.MatteBorder(null));
        btnBackCDM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackCDMActionPerformed(evt);
            }
        });

        lblAgeCDM.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        lblAgeCDM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgeCDM.setText("AGE");

        lblUserNameCDM.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        lblUserNameCDM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUserNameCDM.setText("USER NAME");

        lblAddressCDM.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        lblAddressCDM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddressCDM.setText("ADDRESS");

        lblPasswordCDM.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        lblPasswordCDM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPasswordCDM.setText("PASSWORD");

        lblContactCDM.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        lblContactCDM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblContactCDM.setText("CONTACT");

        txtUsername.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtContact.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtFname.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtLname.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtAge.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        titleCreateDeliveryMan.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        titleCreateDeliveryMan.setForeground(new java.awt.Color(255, 255, 255));
        titleCreateDeliveryMan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleCreateDeliveryMan.setText("CREATE DELIVERYMAN");

        txtEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblFname.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        lblFname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFname.setText("FIRST NAME");

        txtAddress.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblLname.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        lblLname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLname.setText("LAST NAME");

        btnCreateCDM.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        btnCreateCDM.setText("CREATE");
        btnCreateCDM.setBorder(new javax.swing.border.MatteBorder(null));
        btnCreateCDM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateCDMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(258, 258, 258)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblLname, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addComponent(lblFname, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(51, 51, 51)
                                                .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtLname, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblPasswordCDM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblUserNameCDM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                            .addComponent(lblEmailCDM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblAgeCDM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblAddressCDM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblContactCDM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(51, 51, 51)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtContact, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtAddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtAge, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(btnCreateCDM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(btnBackCDM, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 110, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(titleCreateDeliveryMan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(titleCreateDeliveryMan)
                .addGap(18, 18, 18)
                .addComponent(btnBackCDM, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFname))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLname)
                    .addComponent(txtLname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmailCDM)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAgeCDM)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddressCDM)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContactCDM)
                    .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblUserNameCDM)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPasswordCDM)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCreateCDM, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackCDMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackCDMActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageDeliveryManJPanel mcjp = (ManageDeliveryManJPanel) component;
        mcjp.refreshTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_btnBackCDMActionPerformed

    private void btnCreateCDMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateCDMActionPerformed
        // TODO add your handling code here:
        if(txtFname.getText().isEmpty() || txtLname.getText().isEmpty() || txtEmail.getText().isEmpty() ||
            txtContact.getText().isEmpty() || txtUsername.getText().isEmpty() || txtPassword.getText().isEmpty() ||
            txtAddress.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Fields cannot be left empty");
            return;
        }

        String firstName = txtFname.getText();
        String lastName = txtLname.getText();

        boolean flag ;

        flag = firstName.matches("^[a-zA-Z]+$");

        if(flag == false) {
            JOptionPane.showMessageDialog(null, "First name cannot have integer values");
            return;
        }

        flag = lastName.matches("^[a-zA-Z]+$");

        if(!flag) {
            JOptionPane.showMessageDialog(null, "Last name cannot have integer values");
            return;
        }

        String name = firstName + " " + lastName;

        String email = txtEmail.getText();

        flag = email.matches("^[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$");

        if(!flag) {
            JOptionPane.showMessageDialog(null, "Email Address must be in format of X@Y.Z");
            return;
        }

        for(DeliveryMan deliveryMan : deliveryMandirectory.getDeliveryManDirectory()) {
            if(deliveryMan.getEmail().equals(email)) {
                JOptionPane.showMessageDialog(null, "Email Address already exists");
                return;
            }
        }

        String phoneNumber = txtContact.getText();

        if(phoneNumber.length() != 10) {
            JOptionPane.showMessageDialog(null, "PhoneNumber must be of 10 digits");
            return;
        }
        flag = phoneNumber.matches("^[0-9]+$");
        if(!flag) {
            JOptionPane.showMessageDialog(null, "Phone Number must have digits only");
            return;
        }
        for(DeliveryMan deliveryMan : deliveryMandirectory.getDeliveryManDirectory()) {
            if(deliveryMan.getPhoneNumber().equals(phoneNumber)) {
                JOptionPane.showMessageDialog(null, "Phone Number already exists");
                return;
            }
        }

        int age = 0;

        try {

            age = Integer.parseInt(txtAge.getText());

        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Age must have integers only");
            return;
        }

        String address = txtAddress.getText();
        String userName = txtUsername.getText();
        String password = txtPassword.getText();

        for(UserAccount account : ecosystem.getUserAccountDirectory().getUserAccountList()) {
            if(account.getUsername().equals(userName)) {
                JOptionPane.showMessageDialog(null, "Username Already exists");
                return;
            }
        }

        ecosystem.getDeliveryManDirectory().newDeliveryMan(name, address, email, phoneNumber, age);
        Employee employee = ecosystem.getEmployeeDirectory().createEmployee(email);
        ecosystem.getUserAccountDirectory().createUserAccount(userName, password, employee, new DeliverManRole());

        JOptionPane.showMessageDialog(null, "DeliveryMan Profile Created");

    }//GEN-LAST:event_btnCreateCDMActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackCDM;
    private javax.swing.JButton btnCreateCDM;
    private javax.swing.JLabel lblAddressCDM;
    private javax.swing.JLabel lblAgeCDM;
    private javax.swing.JLabel lblContactCDM;
    private javax.swing.JLabel lblEmailCDM;
    private javax.swing.JLabel lblFname;
    private javax.swing.JLabel lblLname;
    private javax.swing.JLabel lblPasswordCDM;
    private javax.swing.JLabel lblUserNameCDM;
    private javax.swing.JLabel titleCreateDeliveryMan;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFname;
    private javax.swing.JTextField txtLname;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
