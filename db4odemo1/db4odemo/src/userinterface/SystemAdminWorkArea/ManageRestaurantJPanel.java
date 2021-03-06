/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Divya Sharma
 */
public class ManageRestaurantJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageRestaurantJPanel
     */
    
    private JPanel userProcessContainer;
    private EcoSystem ecosystem;
    private RestaurantDirectory restaurantdirectory;
    
    
    public ManageRestaurantJPanel(JPanel userProcessContainer, EcoSystem ecosystem, RestaurantDirectory restaurantdirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem =  ecosystem;
        this.restaurantdirectory = ecosystem.getRestaurantDirectory();
        populateTable();
    }

    public void populateTable() {
        DefaultTableModel deftabmdl = (DefaultTableModel) tblRestaurant.getModel();
        deftabmdl.setRowCount(0);
        for(Restaurant restrnt : ecosystem.getRestaurantDirectory().getRestaurantDirectory()){
            Object [] row = new Object[4];
            row[0] = restrnt;
            row[1] = restrnt.getAddress();
            row[2] = restrnt.getManagerName();
            row[3] = restrnt.getPhoneNumber();
            deftabmdl.addRow(row);
        }
    }
    
    public void refreshTable() {
        DefaultTableModel deftabmdl = (DefaultTableModel) tblRestaurant.getModel();
        deftabmdl.setRowCount(0);
        for(Restaurant rstrnt : restaurantdirectory.getRestaurantDirectory()){
            Object [] row = new Object[4];
            row[0] = rstrnt;
            row[1] = rstrnt.getAddress();
            row[2] = rstrnt.getManagerName();
            row[3] = rstrnt.getPhoneNumber();
            deftabmdl.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleManageRestaurant = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRestaurant = new javax.swing.JTable();
        btnModify = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(151, 145, 151));

        titleManageRestaurant.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        titleManageRestaurant.setForeground(new java.awt.Color(255, 255, 255));
        titleManageRestaurant.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleManageRestaurant.setText("MANAGE RESTAURANT");

        tblRestaurant.setBorder(new javax.swing.border.MatteBorder(null));
        tblRestaurant.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Restaurant Name ", "Address", "Manager Name", "Mobile Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRestaurant);

        btnModify.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        btnModify.setText("MODIFY");
        btnModify.setActionCommand("");
        btnModify.setBorder(new javax.swing.border.MatteBorder(null));
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        btnCreate.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btnCreate.setText("CREATE");
        btnCreate.setBorder(new javax.swing.border.MatteBorder(null));
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        btnDelete.setText("Delete Restaurant");
        btnDelete.setActionCommand("DELETE");
        btnDelete.setBorder(new javax.swing.border.MatteBorder(null));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        btnBack.setText("BACK");
        btnBack.setBorder(new javax.swing.border.MatteBorder(null));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 47, Short.MAX_VALUE)
                        .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139)
                        .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(titleManageRestaurant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(titleManageRestaurant, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(194, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        // TODO add your handling code here:
       int selectedRow = tblRestaurant.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Restaurant restaurant = (Restaurant)tblRestaurant.getValueAt(selectedRow,0);
        ModifyRestaurantJPanel restrnt = new ModifyRestaurantJPanel(userProcessContainer, ecosystem, restaurantdirectory, restaurant);
        userProcessContainer.add("ModifyManagerJPanel",restrnt);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        CreateRestaurantJPanel crtrest = new CreateRestaurantJPanel(userProcessContainer, ecosystem, restaurantdirectory);
        userProcessContainer.add("CreateCustomersJPanel",crtrest);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblRestaurant.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Restaurant restaurant = (Restaurant) tblRestaurant.getValueAt(selectedRow, 0);
        restaurantdirectory.removeRestaurant(restaurant);
        populateTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnModify;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRestaurant;
    private javax.swing.JLabel titleManageRestaurant;
    // End of variables declaration//GEN-END:variables
}
