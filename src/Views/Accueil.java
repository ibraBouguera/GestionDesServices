/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.JTable;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author NetShadow
 */
public class Accueil extends javax.swing.JFrame {
    
    Connection conn = Main.Main.con;
    Statement statement = null;
    ResultSet resultat;


    /**
     * Creates new form Accueil
     */
    public Accueil() {
        initComponents();
        ChangeListener changeListener = new ChangeListener() {
            public void stateChanged(ChangeEvent changeEvent) {
                JTabbedPane sourceTabbedPane = (JTabbedPane) changeEvent.getSource();
                int index = sourceTabbedPane.getSelectedIndex();
                if(sourceTabbedPane.getTitleAt(index).equals("Matriel")){
                    try {
                        matriel_client_combo.removeAllItems(); 
                        statement = (Statement) conn.createStatement();
                        String sql = "SELECT * FROM client";
                        resultat = statement.executeQuery(sql);
                        while(resultat.next()){
                            int id = Integer.parseInt(resultat.getString("id"));
                                matriel_client_combo.addItem(resultat.getString("nom")); 
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(Accueil.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if(sourceTabbedPane.getTitleAt(index).equals("Facture")){
                    try {
                        facture_client_combo.removeAllItems(); 
                        statement = (Statement) conn.createStatement();
                        String sql = "SELECT * FROM client";
                        resultat = statement.executeQuery(sql);
                        while(resultat.next()){
                            int id = Integer.parseInt(resultat.getString("id"));
                                facture_client_combo.addItem(resultat.getString("nom")); 
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(Accueil.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                if(sourceTabbedPane.getTitleAt(index).equals("Panne")){
                    try {
                        panne_matriel_combo.removeAllItems();
                        panne_technicien_combo.removeAllItems();
                        statement = (Statement) conn.createStatement();
                        String sql = "SELECT * FROM matriel";
                        resultat = statement.executeQuery(sql);
                        while(resultat.next()){
                            int id = Integer.parseInt(resultat.getString("id"));
                                panne_matriel_combo.addItem(resultat.getString("nom")); 
                        }
                        statement = (Statement) conn.createStatement();
                        sql = "SELECT * FROM technicien";
                        resultat = statement.executeQuery(sql);
                        while(resultat.next()){
                            int id = Integer.parseInt(resultat.getString("id"));
                                panne_technicien_combo.addItem(resultat.getString("nom")); 
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(Accueil.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                
            }
        };
        jTabbedPane1.addChangeListener(changeListener);
        update_table(TechnicienList,"technicien");
        update_table(ClientList,"client");
        update_table(EchangeList,"echange");
        update_table(MatrielList,"matriel");
        update_table(PanneList,"panne");
        update_table(FactureList,"facture");
        technicien_id.setEnabled(false);
        client_id.setEnabled(false);
        echange_id.setEnabled(false);
        matriel_id.setEnabled(false);
        panne_id.setEnabled(false);
        facture_id.setEnabled(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        technicien_id = new javax.swing.JTextField();
        technicien_prenom = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        technicien_login = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        technicien_password = new javax.swing.JTextField();
        Technicien_save = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        technicien_nom = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TechnicienList = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ClientList = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        client_id = new javax.swing.JTextField();
        client_prenom = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        client_phone = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        client_address = new javax.swing.JTextField();
        client_save = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        client_nom = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        PanneList = new javax.swing.JTable();
        jPanel14 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        panne_id = new javax.swing.JTextField();
        Matriel = new javax.swing.JLabel();
        Technicien_save7 = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        panne_nature = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        panne_technicien_combo = new javax.swing.JComboBox<>();
        Technicien = new javax.swing.JLabel();
        panne_matriel_combo = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        MatrielList = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        matriel_id = new javax.swing.JTextField();
        matriel_num_serie = new javax.swing.JTextField();
        numserie1 = new javax.swing.JLabel();
        model1 = new javax.swing.JLabel();
        matriel_model = new javax.swing.JTextField();
        Technicien_save2 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        matriel_nom = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        matriel_client_combo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        EchangeList = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        echange_id = new javax.swing.JTextField();
        echange_num_serie = new javax.swing.JTextField();
        numserie = new javax.swing.JLabel();
        model = new javax.swing.JLabel();
        echange_model = new javax.swing.JTextField();
        Technicien_save1 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        echange_nom = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        FactureList = new javax.swing.JTable();
        jPanel16 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        facture_id = new javax.swing.JTextField();
        Technicien_save9 = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        facture_montant = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        facture_client_combo = new javax.swing.JComboBox<>();
        Technicien2 = new javax.swing.JLabel();
        Technicien_save10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("id");

        jLabel3.setText("Prenom");

        jLabel4.setText("Login");

        jLabel5.setText("Password");

        Technicien_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add.jpg"))); // NOI18N
        Technicien_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Technicien_saveActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel6.setText("Ajouter Technicien");

        jLabel7.setText("Nom");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/clear.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.png"))); // NOI18N
        jButton3.setMaximumSize(new java.awt.Dimension(30, 20));
        jButton3.setMinimumSize(new java.awt.Dimension(30, 20));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(53, 53, 53)
                        .addComponent(technicien_password, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(technicien_login, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(technicien_id, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(technicien_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(technicien_prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Technicien_save, javax.swing.GroupLayout.PREFERRED_SIZE, 71, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(technicien_id, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(technicien_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(technicien_prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(technicien_login, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(Technicien_save)))
                .addGap(57, 57, 57)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(technicien_password, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TechnicienList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "nom", "prenom", "login", "password"
            }
        ));
        TechnicienList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TechnicienListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TechnicienList);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Technicien", jPanel1);

        ClientList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        ClientList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClientListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ClientList);

        jLabel8.setText("id");

        jLabel9.setText("Prenom");

        jLabel10.setText("Telephone");

        jLabel11.setText("Address");

        client_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add.jpg"))); // NOI18N
        client_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                client_saveActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel12.setText("Ajouter CLIENT");

        jLabel13.setText("Nom");

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/clear.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.png"))); // NOI18N
        jButton5.setMaximumSize(new java.awt.Dimension(30, 20));
        jButton5.setMinimumSize(new java.awt.Dimension(30, 20));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(53, 53, 53)
                        .addComponent(client_address, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(client_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel13)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(client_id, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(client_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(client_prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(client_save, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(14, 14, 14)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(client_id, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(client_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(client_prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(client_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(client_save)))
                .addGap(57, 57, 57)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(client_address, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Client", jPanel2);

        PanneList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        PanneList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanneListMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(PanneList);

        jLabel36.setText("id");

        Matriel.setText("Matriel");

        Technicien_save7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add.jpg"))); // NOI18N
        Technicien_save7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Technicien_save7ActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel37.setText("Ajouter pane");

        jLabel38.setText("Nature");

        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/clear.png"))); // NOI18N
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.png"))); // NOI18N
        jButton19.setMaximumSize(new java.awt.Dimension(30, 20));
        jButton19.setMinimumSize(new java.awt.Dimension(30, 20));
        jButton19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton19MouseClicked(evt);
            }
        });
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        panne_technicien_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        Technicien.setText("client");

        panne_matriel_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36)
                            .addComponent(jLabel38))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panne_id, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panne_nature, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Matriel)
                            .addComponent(Technicien))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panne_technicien_combo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panne_matriel_combo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(Technicien_save7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jLabel37)
                .addGap(25, 25, 25)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton18)
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel36)
                        .addComponent(panne_id, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(Technicien_save7))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(panne_nature, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Matriel)
                            .addComponent(panne_matriel_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Technicien)
                            .addComponent(panne_technicien_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(188, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane5))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Panne", jPanel4);

        MatrielList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        MatrielList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MatrielListMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(MatrielList);

        jLabel15.setText("id");

        numserie1.setText("num serie");

        model1.setText("model");

        Technicien_save2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add.jpg"))); // NOI18N
        Technicien_save2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Technicien_save2ActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel20.setText("Ajouter matriel");

        jLabel21.setText("Nom");

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/clear.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.png"))); // NOI18N
        jButton9.setMaximumSize(new java.awt.Dimension(30, 20));
        jButton9.setMinimumSize(new java.awt.Dimension(30, 20));
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        matriel_client_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("client");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel21)
                            .addComponent(numserie1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(matriel_id, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(matriel_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(matriel_num_serie, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(model1)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(matriel_model, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                            .addComponent(matriel_client_combo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(Technicien_save2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel20)
                .addGap(25, 25, 25)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton8)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(matriel_id, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(matriel_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(matriel_num_serie, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numserie1))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(matriel_model, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(model1))
                        .addGap(84, 84, 84)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(matriel_client_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(Technicien_save2)))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 77, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Matriel", jPanel5);

        EchangeList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        EchangeList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EchangeListMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(EchangeList);

        jLabel14.setText("id");

        numserie.setText("num serie");

        model.setText("model");

        Technicien_save1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add.jpg"))); // NOI18N
        Technicien_save1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Technicien_save1ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel18.setText("Ajouter Rechange");

        jLabel19.setText("Nom");

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/clear.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.png"))); // NOI18N
        jButton7.setMaximumSize(new java.awt.Dimension(30, 20));
        jButton7.setMinimumSize(new java.awt.Dimension(30, 20));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(model)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(echange_model, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel19)
                            .addComponent(numserie))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(echange_id, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(echange_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(echange_num_serie, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(Technicien_save1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel18)
                .addGap(25, 25, 25)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(echange_id, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(echange_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(echange_num_serie, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numserie))))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(echange_model, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(model)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(Technicien_save1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Piece de Rechange", jPanel6);

        FactureList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        FactureList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FactureListMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(FactureList);

        jLabel42.setText("id");

        Technicien_save9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/add.jpg"))); // NOI18N
        Technicien_save9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Technicien_save9ActionPerformed(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel43.setText("Ajouter Facture");

        jLabel44.setText("montant");

        jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/clear.png"))); // NOI18N
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.png"))); // NOI18N
        jButton23.setMaximumSize(new java.awt.Dimension(30, 20));
        jButton23.setMinimumSize(new java.awt.Dimension(30, 20));
        jButton23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton23MouseClicked(evt);
            }
        });
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        facture_client_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        Technicien2.setText("client");

        Technicien_save10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/mony.jpg"))); // NOI18N
        Technicien_save10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Technicien_save10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel42)
                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(facture_id, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(facture_montant, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                        .addComponent(Technicien2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addComponent(facture_client_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(Technicien_save9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(Technicien_save10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(jLabel43)
                .addGap(25, 25, 25)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton22)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel42)
                        .addComponent(facture_id, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(Technicien_save9))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(facture_montant, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel44))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(facture_client_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Technicien2))))
                .addGap(18, 18, 18)
                .addComponent(Technicien_save10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Facture", jPanel10);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Technicien_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Technicien_saveActionPerformed
        // TODO add your handling code here:
        
        try {
            String sql;
            PreparedStatement preparedStmt;
            if(technicien_id.getText().equals("")){
                sql = "Insert into technicien(nom,prenom,login,password) values(?,?,?,?) ";
                preparedStmt = conn.prepareStatement(sql);
                preparedStmt.setString (1, technicien_nom.getText());
                preparedStmt.setString (2, technicien_prenom.getText());
                preparedStmt.setString   (3, technicien_login.getText());
                preparedStmt.setString(4, technicien_password.getText());
            }else{
                sql = "update technicien set nom =?,prenom=?,login=?,password=? where id =? ";
                preparedStmt = conn.prepareStatement(sql);
                preparedStmt.setString (1, technicien_nom.getText());
                preparedStmt.setString (2, technicien_prenom.getText());
                preparedStmt.setString   (3, technicien_login.getText());
                preparedStmt.setString(4, technicien_password.getText());
                preparedStmt.setString(5, technicien_id.getText());
            }
            preparedStmt.execute();
            update_table(TechnicienList,"technicien");
            technicien_id.setText("");
            technicien_nom.setText("");
            technicien_prenom.setText("");
            technicien_login.setText("");
            technicien_password.setText("");
            JOptionPane.showMessageDialog(null,"Success ! ","Success",1);
        } catch (SQLException ex) {
            Logger.getLogger(Accueil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Technicien_saveActionPerformed

    private void TechnicienListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TechnicienListMouseClicked
        // TODO add your handling code here:
        JTable source = (JTable)evt.getSource();
            int row = source.rowAtPoint( evt.getPoint() );
            int column = source.columnAtPoint( evt.getPoint() );
            technicien_id.setText(source.getModel().getValueAt(source.getSelectedRow(), 0)+"");
            technicien_nom.setText(source.getModel().getValueAt(source.getSelectedRow(), 1)+"");
            technicien_prenom.setText(source.getModel().getValueAt(source.getSelectedRow(), 2)+"");
            technicien_login.setText(source.getModel().getValueAt(source.getSelectedRow(), 3)+"");
            technicien_password.setText(source.getModel().getValueAt(source.getSelectedRow(), 4)+"");
            //JOptionPane.showMessageDialog(null, s);
    }//GEN-LAST:event_TechnicienListMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String sql;
        PreparedStatement preparedStmt;
        sql = "Delete From technicien where id =?";
        try {
            preparedStmt = conn.prepareStatement(sql);
            preparedStmt.setInt (1, Integer.parseInt(technicien_id.getText()) );
            preparedStmt.execute();
            update_table(TechnicienList,"technicien");
            technicien_id.setText("");
            technicien_nom.setText("");
            technicien_prenom.setText("");
            technicien_login.setText("");
            technicien_password.setText("");
            JOptionPane.showMessageDialog(null,"Delete Success ! ","Success",1);
        } catch (SQLException ex) {
            Logger.getLogger(Accueil.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        technicien_id.setText("");
        technicien_nom.setText("");
        technicien_prenom.setText("");
        technicien_login.setText("");
        technicien_password.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void client_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_client_saveActionPerformed
        // TODO add your handling code here:
         try {
            String sql;
            PreparedStatement preparedStmt;
            if(client_id.getText().equals("")){
                sql = "Insert into client(nom,prenom,telephone,address) values(?,?,?,?) ";
                preparedStmt = conn.prepareStatement(sql);
                preparedStmt.setString (1, client_nom.getText());
                preparedStmt.setString (2, client_prenom.getText());
                preparedStmt.setString   (3, client_phone.getText());
                preparedStmt.setString(4, client_address.getText());
            }else{
                sql = "update client set nom =?,prenom=?,telephone=?,address=? where id =? ";
                preparedStmt = conn.prepareStatement(sql);
                preparedStmt.setString (1, client_nom.getText());
                preparedStmt.setString (2, client_prenom.getText());
                preparedStmt.setString   (3, client_phone.getText());
                preparedStmt.setString(4, client_address.getText());
                preparedStmt.setString(5, client_id.getText());
            }
            preparedStmt.execute();
            update_table(ClientList,"client");
            client_id.setText("");
            client_nom.setText("");
            client_prenom.setText("");
            client_phone.setText("");
            client_address.setText("");
            JOptionPane.showMessageDialog(null,"Success ! ","Success",1);
        } catch (SQLException ex) {
            Logger.getLogger(Accueil.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_client_saveActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        client_id.setText("");
        client_nom.setText("");
        client_prenom.setText("");
        client_phone.setText("");
        client_address.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String sql;
        PreparedStatement preparedStmt;
        sql = "Delete From client where id =?";
        try {
            preparedStmt = conn.prepareStatement(sql);
            preparedStmt.setInt (1, Integer.parseInt(client_id.getText()) );
            preparedStmt.execute();
            update_table(ClientList,"client");
            client_id.setText("");
            client_nom.setText("");
            client_prenom.setText("");
            client_phone.setText("");
            client_address.setText("");
            JOptionPane.showMessageDialog(null,"Delete Success ! ","Success",1);
        } catch (SQLException ex) {
            Logger.getLogger(Accueil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void ClientListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClientListMouseClicked
        // TODO add your handling code here:
        JTable source = (JTable)evt.getSource();
            int row = source.rowAtPoint( evt.getPoint() );
            int column = source.columnAtPoint( evt.getPoint() );
            client_id.setText(source.getModel().getValueAt(source.getSelectedRow(), 0)+"");
            client_nom.setText(source.getModel().getValueAt(source.getSelectedRow(), 1)+"");
            client_prenom.setText(source.getModel().getValueAt(source.getSelectedRow(), 2)+"");
            client_phone.setText(source.getModel().getValueAt(source.getSelectedRow(), 3)+"");
            client_address.setText(source.getModel().getValueAt(source.getSelectedRow(), 4)+"");
    }//GEN-LAST:event_ClientListMouseClicked

    private void Technicien_save1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Technicien_save1ActionPerformed
        // TODO add your handling code here:
        try {
            String sql;
            PreparedStatement preparedStmt;
            if(echange_id.getText().equals("")){
                sql = "Insert into echange(nom,num_serie,model) values(?,?,?) ";
                preparedStmt = conn.prepareStatement(sql);
                preparedStmt.setString (1, echange_nom.getText());
                preparedStmt.setString (2, echange_num_serie.getText());
                preparedStmt.setString   (3, echange_model.getText());
            }else{
                sql = "update echange set nom =?,num_serie=?,model=? where id =? ";
                preparedStmt = conn.prepareStatement(sql);
                preparedStmt.setString (1, echange_nom.getText());
                preparedStmt.setString (2, echange_num_serie.getText());
                preparedStmt.setString   (3, echange_model.getText());
                preparedStmt.setString(4, echange_id.getText());
            }
            preparedStmt.execute();
            update_table(EchangeList,"echange");
            echange_id.setText("");
            echange_nom.setText("");
            echange_num_serie.setText("");
            echange_model.setText("");
            JOptionPane.showMessageDialog(null,"Success ! ","Success",1);
        } catch (SQLException ex) {
            Logger.getLogger(Accueil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Technicien_save1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        echange_id.setText("");
        echange_nom.setText("");
        echange_num_serie.setText("");
        echange_model.setText("");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        String sql;
        PreparedStatement preparedStmt;
        sql = "Delete From echange where id =?";
        try {
            preparedStmt = conn.prepareStatement(sql);
            preparedStmt.setInt (1, Integer.parseInt(echange_id.getText()) );
            preparedStmt.execute();
            update_table(EchangeList,"echange");
            echange_id.setText("");
            echange_nom.setText("");
            echange_num_serie.setText("");
            echange_model.setText("");
            JOptionPane.showMessageDialog(null,"Delete Success ! ","Success",1);
        } catch (SQLException ex) {
            Logger.getLogger(Accueil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void EchangeListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EchangeListMouseClicked
        // TODO add your handling code here:
        JTable source = (JTable)evt.getSource();
            int row = source.rowAtPoint( evt.getPoint() );
            int column = source.columnAtPoint( evt.getPoint() );
            echange_id.setText(source.getModel().getValueAt(source.getSelectedRow(), 0)+"");
            echange_nom.setText(source.getModel().getValueAt(source.getSelectedRow(), 1)+"");
            echange_num_serie.setText(source.getModel().getValueAt(source.getSelectedRow(), 2)+"");
            echange_model.setText(source.getModel().getValueAt(source.getSelectedRow(), 3)+"");
           
    }//GEN-LAST:event_EchangeListMouseClicked

    private void Technicien_save2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Technicien_save2ActionPerformed
        // TODO add your handling code here:
        try {
            String sql;
            PreparedStatement preparedStmt;
            if(matriel_id.getText().equals("")){
                sql = "Insert into matriel(nom,num_serie,model,id_client) values(?,?,?,?) ";
                preparedStmt = conn.prepareStatement(sql);
                preparedStmt.setString (1, matriel_nom.getText());
                preparedStmt.setString (2, matriel_num_serie.getText());
                preparedStmt.setString   (3, matriel_model.getText());
                preparedStmt.setInt(4, getClientIDFromName(matriel_client_combo.getSelectedItem().toString()));
            }else{
                sql = "update matriel set nom =?,num_serie=?,model=?,id_client=? where id =? ";
                preparedStmt = conn.prepareStatement(sql);
                preparedStmt.setString (1, matriel_nom.getText());
                preparedStmt.setString (2, matriel_num_serie.getText());
                preparedStmt.setString   (3, matriel_model.getText());
                preparedStmt.setInt(4, getClientIDFromName(matriel_client_combo.getSelectedItem().toString()));
                preparedStmt.setString(5, matriel_id.getText());
                
            }
            preparedStmt.execute();
            update_table(MatrielList,"matriel");
            matriel_id.setText("");
            matriel_nom.setText("");
            matriel_num_serie.setText("");
            matriel_model.setText("");
            JOptionPane.showMessageDialog(null,"Success ! ","Success",1);
        } catch (SQLException ex) {
            Logger.getLogger(Accueil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Technicien_save2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
            matriel_id.setText("");
            matriel_nom.setText("");
            matriel_num_serie.setText("");
            matriel_model.setText("");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
         String sql;
        PreparedStatement preparedStmt;
        sql = "Delete From matriel where id =?";
        try {
            preparedStmt = conn.prepareStatement(sql);
            preparedStmt.setInt (1, Integer.parseInt(matriel_id.getText()) );
            preparedStmt.execute();
            update_table(MatrielList,"matriel");
            matriel_id.setText("");
            matriel_nom.setText("");
            matriel_num_serie.setText("");
            matriel_model.setText("");
            JOptionPane.showMessageDialog(null,"Delete Success ! ","Success",1);
        } catch (SQLException ex) {
            Logger.getLogger(Accueil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9MouseClicked

    private void MatrielListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MatrielListMouseClicked
        // TODO add your handling code here:
         JTable source = (JTable)evt.getSource();
            int row = source.rowAtPoint( evt.getPoint() );
            int column = source.columnAtPoint( evt.getPoint() );
            matriel_id.setText(source.getModel().getValueAt(source.getSelectedRow(), 0)+"");
            matriel_nom.setText(source.getModel().getValueAt(source.getSelectedRow(), 1)+"");
            matriel_num_serie.setText(source.getModel().getValueAt(source.getSelectedRow(), 2)+"");
            matriel_model.setText(source.getModel().getValueAt(source.getSelectedRow(), 3)+"");
    }//GEN-LAST:event_MatrielListMouseClicked

    private void Technicien_save7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Technicien_save7ActionPerformed
        // TODO add your handling code here:
        try {
            String sql;
            PreparedStatement preparedStmt;
            if(panne_id.getText().equals("")){
                sql = "Insert into panne(nature,date_diagnostique,etat,id_matriel,id_technicien) values(?,?,?,?,?) ";
                preparedStmt = conn.prepareStatement(sql);
                preparedStmt.setString (1, panne_nature.getText());
                preparedStmt.setString (2, new SimpleDateFormat("dd-MM-yyyy").format(Calendar.getInstance().getTime()));
                preparedStmt.setString   (3, "panne");
                preparedStmt.setInt(4, getMatrielIDFromName(panne_matriel_combo.getSelectedItem().toString()));
                preparedStmt.setInt(5, getTechnicienIDFromName(panne_technicien_combo.getSelectedItem().toString()));
            }else{
                sql = "update panne set nature =?,date_diagnostique=?,etat=?,id_matriel=?,id_technicien=? where id =? ";
                preparedStmt = conn.prepareStatement(sql);
                preparedStmt.setString (1, panne_nature.getText());
                preparedStmt.setString (2, new SimpleDateFormat("dd-MM-yyyy").format(Calendar.getInstance().getTime()));
                preparedStmt.setString   (3, "panne");
                preparedStmt.setInt(4, getMatrielIDFromName(panne_matriel_combo.getSelectedItem().toString()));
                preparedStmt.setInt(5, getTechnicienIDFromName(panne_technicien_combo.getSelectedItem().toString()));
                preparedStmt.setString (6, panne_id.getText());
                
            }
            preparedStmt.execute();
            update_table(PanneList,"panne");
            panne_id.setText("");
            panne_nature.setText("");
            JOptionPane.showMessageDialog(null,"Success ! ","Success",1);
        } catch (SQLException ex) {
            Logger.getLogger(Accueil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Technicien_save7ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        panne_id.setText("");
        panne_nature.setText("");
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton19MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton19MouseClicked

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        String sql;
        PreparedStatement preparedStmt;
        sql = "Delete From panne where id =?";
        try {
            preparedStmt = conn.prepareStatement(sql);
            preparedStmt.setInt (1, Integer.parseInt(panne_id.getText()) );
            preparedStmt.execute();
            update_table(PanneList,"panne");
            panne_id.setText("");
            panne_nature.setText("");
            JOptionPane.showMessageDialog(null,"Delete Success ! ","Success",1);
        } catch (SQLException ex) {
            Logger.getLogger(Accueil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton19ActionPerformed

    private void PanneListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanneListMouseClicked
        // TODO add your handling code here:
        JTable source = (JTable)evt.getSource();
            int row = source.rowAtPoint( evt.getPoint() );
            int column = source.columnAtPoint( evt.getPoint() );
            panne_id.setText(source.getModel().getValueAt(source.getSelectedRow(), 0)+"");
            panne_nature.setText(source.getModel().getValueAt(source.getSelectedRow(), 1)+"");
    }//GEN-LAST:event_PanneListMouseClicked

    private void Technicien_save9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Technicien_save9ActionPerformed
        // TODO add your handling code here:
        try {
            String sql;
            PreparedStatement preparedStmt;
            if(facture_id.getText().equals("")){
                System.out.println("hhhhh");
                sql = "Insert into facture (data_facture,montant,id_client) values(?,?,?) ";
                preparedStmt = conn.prepareStatement(sql);
                preparedStmt.setString (1, new SimpleDateFormat("dd-MM-yyyy").format(Calendar.getInstance().getTime()));
                preparedStmt.setString (2, facture_montant.getText());
                preparedStmt.setInt(3, getClientIDFromName(facture_client_combo.getSelectedItem().toString()));
            }else{
                sql = "update facture set data_facture =?,montant=?,id_client=? where id =? ";
                preparedStmt = conn.prepareStatement(sql);
                preparedStmt.setString (1, new SimpleDateFormat("dd-MM-yyyy").format(Calendar.getInstance().getTime()));
                preparedStmt.setString (2, facture_montant.getText());
                preparedStmt.setInt(3, getClientIDFromName(facture_client_combo.getSelectedItem().toString()));
                preparedStmt.setString (4, facture_id.getText());
                
            }
            preparedStmt.execute();
            update_table(FactureList,"facture");
            facture_id.setText("");
            facture_montant.setText("");
            JOptionPane.showMessageDialog(null,"Success ! ","Success",1);
        } catch (SQLException ex) {
            Logger.getLogger(Accueil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Technicien_save9ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton23MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton23MouseClicked

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton23ActionPerformed

    private void Technicien_save10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Technicien_save10ActionPerformed
        // TODO add your handling code here:
        if(facture_id.getText().equals("")){}else{
            Object[] possibilities = {"ham", "spam", "yam"};
            String[] payements = { "check", "versement", "liquide" };
            String s = (String) JOptionPane.showInputDialog(null, 
            "Payement Methode",
            "Payement",
            JOptionPane.QUESTION_MESSAGE, 
            null, 
            payements, 
            payements[0]);
            if(s != null){
                PreparedStatement preparedStmt;
                String sql = "update facture set date_paiement =?,mode_paiement=? where id =? ";
                try {
                    preparedStmt = conn.prepareStatement(sql);
                    preparedStmt.setString (1, new SimpleDateFormat("dd-MM-yyyy").format(Calendar.getInstance().getTime()));
                    preparedStmt.setString (2, s);
                    preparedStmt.setString (3, facture_id.getText());
                    JOptionPane.showMessageDialog(null,"Success ! ","Success",1);
                    preparedStmt.execute();
                    update_table(FactureList,"facture");
                    facture_id.setText("");
                    facture_montant.setText("");
                } catch (SQLException ex) {
                    Logger.getLogger(Accueil.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        }
        
        
    }//GEN-LAST:event_Technicien_save10ActionPerformed

    private void FactureListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FactureListMouseClicked
        // TODO add your handling code here:
        JTable source = (JTable)evt.getSource();
            int row = source.rowAtPoint( evt.getPoint() );
            int column = source.columnAtPoint( evt.getPoint() );
            facture_id.setText(source.getModel().getValueAt(source.getSelectedRow(), 0)+"");
            facture_montant.setText(source.getModel().getValueAt(source.getSelectedRow(), 4)+"");
    }//GEN-LAST:event_FactureListMouseClicked

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
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Accueil().setVisible(true);
            }
        });
    }
    
    void update_table(JTable table , String tableName){
        try {
            statement = (Statement) conn.createStatement();
            String sql = "SELECT * FROM "+tableName;
            if(tableName.equals("matriel")){
                sql = "SELECT matriel.id,matriel.nom,matriel.num_serie,matriel.model,client.nom as client_nom FROM matriel INNER JOIN client ON client.id = matriel.id_client";
            }
            if(tableName.equals("panne")){
                sql = "SELECT panne.id,panne.nature,panne.date_diagnostique,panne.date_resolution,panne.etat,matriel.nom as matriel,technicien.nom as technicien FROM panne INNER JOIN matriel ON panne.id_matriel = matriel.id INNER JOIN technicien ON panne.id_technicien = technicien.id";
            }
            if(tableName.equals("facture")){
                sql = "SELECT facture.id,facture.data_facture,facture.date_paiement,facture.mode_paiement,facture.montant,client.nom as Client FROM facture INNER JOIN client ON facture.id_client = client.id";
            }
            resultat = statement.executeQuery(sql);
            table.setModel(DbUtils.resultSetToTableModel(resultat));
        } catch (SQLException ex) {
            Logger.getLogger(Accueil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    int getClientIDFromName(String nom){
        try {
            // TODO add your handling code here:
            statement = (Statement) conn.createStatement();
           
            String sql = "SELECT id FROM client WHERE nom ='"+nom+"'";
            resultat = statement.executeQuery(sql);
            if(resultat.next()){
                return resultat.getInt("id");
            }else{
                return 0;
            }
            
        }catch(Exception ex){
            Logger.getLogger(Accueil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    int getMatrielIDFromName(String nom){
        try {
            // TODO add your handling code here:
            statement = (Statement) conn.createStatement();
           
            String sql = "SELECT id FROM matriel WHERE nom ='"+nom+"'";
            resultat = statement.executeQuery(sql);
            if(resultat.next()){
                return resultat.getInt("id");
            }else{
                return 0;
            }
            
        }catch(Exception ex){
            Logger.getLogger(Accueil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    int getTechnicienIDFromName(String nom){
        try {
            // TODO add your handling code here:
            statement = (Statement) conn.createStatement();
           
            String sql = "SELECT id FROM technicien WHERE nom ='"+nom+"'";
            resultat = statement.executeQuery(sql);
            if(resultat.next()){
                return resultat.getInt("id");
            }else{
                return 0;
            }
            
        }catch(Exception ex){
            Logger.getLogger(Accueil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ClientList;
    private javax.swing.JTable EchangeList;
    private javax.swing.JTable FactureList;
    private javax.swing.JLabel Matriel;
    private javax.swing.JLabel Matriel1;
    private javax.swing.JTable MatrielList;
    private javax.swing.JTable PanneList;
    private javax.swing.JLabel Technicien;
    private javax.swing.JLabel Technicien1;
    private javax.swing.JLabel Technicien2;
    private javax.swing.JTable TechnicienList;
    private javax.swing.JButton Technicien_save;
    private javax.swing.JButton Technicien_save1;
    private javax.swing.JButton Technicien_save10;
    private javax.swing.JButton Technicien_save2;
    private javax.swing.JButton Technicien_save7;
    private javax.swing.JButton Technicien_save8;
    private javax.swing.JButton Technicien_save9;
    private javax.swing.JTextField client_address;
    private javax.swing.JTextField client_id;
    private javax.swing.JTextField client_nom;
    private javax.swing.JTextField client_phone;
    private javax.swing.JTextField client_prenom;
    private javax.swing.JButton client_save;
    private javax.swing.JTextField echange_id;
    private javax.swing.JTextField echange_model;
    private javax.swing.JTextField echange_nom;
    private javax.swing.JTextField echange_num_serie;
    private javax.swing.JComboBox<String> facture_client_combo;
    private javax.swing.JTextField facture_id;
    private javax.swing.JTextField facture_montant;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox<String> matriel_client_combo;
    private javax.swing.JTextField matriel_id;
    private javax.swing.JTextField matriel_model;
    private javax.swing.JTextField matriel_nom;
    private javax.swing.JTextField matriel_num_serie;
    private javax.swing.JLabel model;
    private javax.swing.JLabel model1;
    private javax.swing.JLabel numserie;
    private javax.swing.JLabel numserie1;
    private javax.swing.JTextField panne_id;
    private javax.swing.JTextField panne_id1;
    private javax.swing.JComboBox<String> panne_matriel_combo;
    private javax.swing.JComboBox<String> panne_matriel_combo1;
    private javax.swing.JTextField panne_nature;
    private javax.swing.JTextField panne_nature1;
    private javax.swing.JComboBox<String> panne_technicien_combo;
    private javax.swing.JComboBox<String> panne_technicien_combo1;
    private javax.swing.JTextField technicien_id;
    private javax.swing.JTextField technicien_login;
    private javax.swing.JTextField technicien_nom;
    private javax.swing.JTextField technicien_password;
    private javax.swing.JTextField technicien_prenom;
    // End of variables declaration//GEN-END:variables
}
