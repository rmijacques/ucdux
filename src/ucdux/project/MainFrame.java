/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ucdux.project;

import java.awt.Cursor;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author remi
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {

        
        initComponents();
        
        //BurgerMenu icon
        ImageIcon image = new ImageIcon(getClass().getResource("hamburger-icon.png"));
        Image before = image.getImage();
        Image scalled = before.getScaledInstance(burgerMenu.getWidth(), burgerMenu.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon rez = new ImageIcon(scalled);
        burgerMenu.setIcon(rez);
        burgerMenu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        //CHaussure icon
        image = new ImageIcon(getClass().getResource("chaussures.jpg"));
        before = image.getImage();
        scalled = before.getScaledInstance(imageChaussures.getWidth(), imageChaussures.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon rezChaussures = new ImageIcon(scalled);
        imageChaussures.setIcon(rezChaussures);
        
        //CHaussure icon
        image = new ImageIcon(getClass().getResource("newMessage.png"));
        before = image.getImage();
        scalled = before.getScaledInstance(newMessage.getWidth(), newMessage.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon rezNewMessage = new ImageIcon(scalled);
        newMessage.setIcon(rezNewMessage);
        newMessage.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
                //CHaussure icon
        image = new ImageIcon(getClass().getResource("cart.png"));
        before = image.getImage();
        scalled = before.getScaledInstance(cart.getWidth(), cart.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon rezCart = new ImageIcon(scalled);
        cart.setIcon(rezCart);
        cart.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        image = new ImageIcon(getClass().getResource("search.png"));
        before = image.getImage();
        scalled = before.getScaledInstance(search.getWidth(), search.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon rezSearch = new ImageIcon(scalled);
        search.setIcon(rezSearch);
        search.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pannelNavBar = new javax.swing.JPanel();
        pageName = new javax.swing.JLabel();
        burgerMenu = new javax.swing.JLabel();
        newMessage = new javax.swing.JLabel();
        cart = new javax.swing.JLabel();
        search = new javax.swing.JLabel();
        panelMainContent = new javax.swing.JPanel();
        pannelInmanquables = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        imageChaussures = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pannelNavBar.setBackground(new java.awt.Color(255, 255, 255));

        pageName.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        pageName.setForeground(new java.awt.Color(0, 0, 0));
        pageName.setText("Accueil");

        search.setBackground(new java.awt.Color(0, 0, 0));
        search.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout pannelNavBarLayout = new javax.swing.GroupLayout(pannelNavBar);
        pannelNavBar.setLayout(pannelNavBarLayout);
        pannelNavBarLayout.setHorizontalGroup(
            pannelNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannelNavBarLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(burgerMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pageName)
                .addGap(194, 194, 194)
                .addComponent(newMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cart, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pannelNavBarLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {burgerMenu, cart, newMessage});

        pannelNavBarLayout.setVerticalGroup(
            pannelNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannelNavBarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pannelNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pannelNavBarLayout.createSequentialGroup()
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pannelNavBarLayout.createSequentialGroup()
                        .addGroup(pannelNavBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(burgerMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(pageName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(newMessage, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                            .addComponent(cart, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))))
        );

        pannelNavBarLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {burgerMenu, cart, newMessage});

        panelMainContent.setBackground(new java.awt.Color(255, 255, 255));

        pannelInmanquables.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Les inmanquables");

        javax.swing.GroupLayout pannelInmanquablesLayout = new javax.swing.GroupLayout(pannelInmanquables);
        pannelInmanquables.setLayout(pannelInmanquablesLayout);
        pannelInmanquablesLayout.setHorizontalGroup(
            pannelInmanquablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannelInmanquablesLayout.createSequentialGroup()
                .addGroup(pannelInmanquablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pannelInmanquablesLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel1))
                    .addGroup(pannelInmanquablesLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(imageChaussures, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        pannelInmanquablesLayout.setVerticalGroup(
            pannelInmanquablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannelInmanquablesLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(imageChaussures, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelMainContentLayout = new javax.swing.GroupLayout(panelMainContent);
        panelMainContent.setLayout(panelMainContentLayout);
        panelMainContentLayout.setHorizontalGroup(
            panelMainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainContentLayout.createSequentialGroup()
                .addComponent(pannelInmanquables, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE))
        );
        panelMainContentLayout.setVerticalGroup(
            panelMainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainContentLayout.createSequentialGroup()
                .addComponent(pannelInmanquables, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 356, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pannelNavBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(panelMainContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pannelNavBar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1030, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(63, 63, 63)
                    .addComponent(panelMainContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(189, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel burgerMenu;
    private javax.swing.JLabel cart;
    private javax.swing.JLabel imageChaussures;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel newMessage;
    private javax.swing.JLabel pageName;
    private javax.swing.JPanel panelMainContent;
    private javax.swing.JPanel pannelInmanquables;
    private javax.swing.JPanel pannelNavBar;
    private javax.swing.JLabel search;
    // End of variables declaration//GEN-END:variables
}
