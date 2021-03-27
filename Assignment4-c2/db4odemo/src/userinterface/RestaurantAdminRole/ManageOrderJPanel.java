/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.EcoSystem;
import Business.Menu.MenuDirectory;
import Business.Order.Order;
import Business.Order.OrderDirectory;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Divya Sharma
 */
public class ManageOrderJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageOrderJPanel
     */
    
    private JPanel userProcessContainer;
    private UserAccount useraccount;
    private EcoSystem ecosystem;
    private RestaurantDirectory restaurantdirectory;
    private MenuDirectory menudirectory;
    private OrderDirectory orderdirectory;
    
    
    
    public ManageOrderJPanel(JPanel userProcessContainer,UserAccount useraccount, EcoSystem ecosystem, RestaurantDirectory restaurantdirectory, MenuDirectory menudirectory, OrderDirectory orderdirectory) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.useraccount = useraccount;
        this.restaurantdirectory = ecosystem.getRestaurantDirectory();
        this.menudirectory = ecosystem.getMenuDirectory();
        this.orderdirectory = ecosystem.getOrderDirectory();
        populateTable();
    }
    
    public void populateTable() {
        DefaultTableModel deftabmdl = (DefaultTableModel) tblOrder.getModel();
        deftabmdl.setRowCount(0);
        
        for(Order order : ecosystem.getOrderDirectory().getOrderDirectory()) {
            System.out.println(" Rest  " + useraccount.getEmployee().getName() + "  " + order.getRestaurant().getRestaurantName());
            if(useraccount.getEmployee().getName().equals(order.getRestaurant().getRestaurantName())) {
                Object [] row = new Object[5];
                row[0] = order;
                row[1] = order.getMenu().getItemName();
                row[2] = order.getQuantity();
                row[3] = order.getQuantity() * order.getMenu().getPrice();
                row[4] = order.getOrderStatus();
                deftabmdl.addRow(row);
            }
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

        titleManageOrder = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrder = new javax.swing.JTable();
        btnBackMO = new javax.swing.JButton();
        btnAcceptMO = new javax.swing.JButton();
        btnCompleteMO = new javax.swing.JButton();

        setBackground(new java.awt.Color(151, 145, 151));

        titleManageOrder.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        titleManageOrder.setForeground(new java.awt.Color(255, 255, 255));
        titleManageOrder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleManageOrder.setText("MANAGE ORDER");

        tblOrder.setBorder(new javax.swing.border.MatteBorder(null));
        tblOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ORDER ID", "ITEM NAME", "QUANTITY", "PRICE", "ORDER STATUS"
            }
        ));
        jScrollPane1.setViewportView(tblOrder);

        btnBackMO.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        btnBackMO.setText("BACK");
        btnBackMO.setBorder(new javax.swing.border.MatteBorder(null));
        btnBackMO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackMOActionPerformed(evt);
            }
        });

        btnAcceptMO.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        btnAcceptMO.setText("ACCEPT");
        btnAcceptMO.setBorder(new javax.swing.border.MatteBorder(null));
        btnAcceptMO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptMOActionPerformed(evt);
            }
        });

        btnCompleteMO.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        btnCompleteMO.setText("COMPLETE");
        btnCompleteMO.setBorder(new javax.swing.border.MatteBorder(null));
        btnCompleteMO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteMOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleManageOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(btnBackMO, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAcceptMO, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnCompleteMO, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(titleManageOrder)
                .addGap(40, 40, 40)
                .addComponent(btnBackMO, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAcceptMO, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCompleteMO, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(187, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCompleteMOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompleteMOActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblOrder.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Order order = (Order)tblOrder.getValueAt(selectedRow, 0);
        if(order.getOrderStatus().equals("Order Accepted")) {
            order.setOrderStatus("Order Ready for Pick up");
            order.setAssign(true);
        }
        
        else if(order.getOrderStatus().equals("Order Placed")) {
            JOptionPane.showMessageDialog(null, "Order is should be accepted first");
            return;
        }
        
        else {
            JOptionPane.showMessageDialog(null, "Order is already ready for pick up");
            return;
        }
        
        populateTable();
    }//GEN-LAST:event_btnCompleteMOActionPerformed

    private void btnAcceptMOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptMOActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblOrder.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please Select a row from table first", "Warining", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Order order = (Order)tblOrder.getValueAt(selectedRow, 0);
        if(order.getOrderStatus().equals("Order Placed")) {
            order.setOrderStatus("Order Accepted");
        }
        
        else {
            JOptionPane.showMessageDialog(null, "Order is already accepted or Completed");
            return;
        }
        
        populateTable();
    }//GEN-LAST:event_btnAcceptMOActionPerformed

    private void btnBackMOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackMOActionPerformed
        // TODO add your handling code here:
        
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackMOActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcceptMO;
    private javax.swing.JButton btnBackMO;
    private javax.swing.JButton btnCompleteMO;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblOrder;
    private javax.swing.JLabel titleManageOrder;
    // End of variables declaration//GEN-END:variables
}
