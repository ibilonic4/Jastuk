/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ffos.View;

import ffos.controller.ObradaJastuka;
import ffos.controller.ObradaVlasnika;
import ffos.model.Jastuk;
import ffos.model.Vlasnik;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Ivor
 */
public class FormaJastuk extends javax.swing.JFrame implements ViewAktivnosti{
private ObradaVlasnika ov;
private ObradaJastuka oj;
    /**
     * Creates new form FormaJastuk
     */
    public FormaJastuk() {
        ov = new ObradaVlasnika();
        oj = new ObradaJastuka();
        initComponents();
        ucitajPodatke();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lst = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBoja = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtVrsta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtVelicina = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDatum = new javax.swing.JTextField();
        cmbVlasnik = new javax.swing.JComboBox<>();
        btnc = new javax.swing.JButton();
        btnu = new javax.swing.JButton();
        btnd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lst.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lst);

        jLabel1.setText("boja");

        jLabel2.setText("JASTUK");

        txtBoja.setText("                  ");

        jLabel3.setText("vrsta");

        jLabel4.setText("velicina");

        txtVelicina.setText("                                            ");

        jLabel5.setText("Datum");

        txtDatum.setText("                                                 ");

        btnc.setText("c");
        btnc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncActionPerformed(evt);
            }
        });

        btnu.setText("u");
        btnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnuActionPerformed(evt);
            }
        });

        btnd.setText("d");
        btnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel3))
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnu)
                                        .addGap(4, 4, 4)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtVelicina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtBoja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtVrsta, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnd)
                                        .addGap(56, 56, 56))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(cmbVlasnik, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(btnc)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtBoja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel1)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtVrsta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtVelicina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(cmbVlasnik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnc)
                    .addComponent(btnu)
                    .addComponent(btnd))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lstValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstValueChanged
if (evt.getValueIsAdjusting() || lst.getSelectedValue() == null) {
     postaviVrijednostiNaViewKontrole();
    
            return;}       }//GEN-LAST:event_lstValueChanged

    private void btncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncActionPerformed
        oj.setEntitet(new Jastuk());
        ucitajVrijednostiIzViewKontrola();
        try {
            oj.create();
            ucitajPodatke();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());}
    }//GEN-LAST:event_btncActionPerformed

    private void btnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuActionPerformed
        if(oj.getEntitet()==null){
            JOptionPane.showMessageDialog(this,"Prvo odaberite stavku");
            return;
        }
        ucitajVrijednostiIzViewKontrola();
        try {
            oj.update();
            ucitajPodatke();
        } catch (Exception e) {}
    }//GEN-LAST:event_btnuActionPerformed

    private void btndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndActionPerformed
        if(oj.getEntitet()==null){
            JOptionPane.showMessageDialog(this,"Prvo odaberite stavku");
            return;
        }
        try {
            oj.delete();
            ucitajPodatke();
        } catch (Exception e) {}
    }//GEN-LAST:event_btndActionPerformed

    @Override
    public void ucitajPodatke() {
DefaultListModel<Jastuk> jastuk = new DefaultListModel<>();
        jastuk.addAll(oj.read());
        lst.setModel(jastuk);
    
    
    DefaultComboBoxModel<Vlasnik> vlasnik = new DefaultComboBoxModel<>();
       vlasnik.addAll(ov.read());
        cmbVlasnik.setModel(vlasnik);
    
    }

    @Override
    public void postaviVrijednostiNaViewKontrole() {
oj.setEntitet(lst.getSelectedValue());   
    txtBoja.setText(lst.getSelectedValue().getBoja());
    txtVelicina.setText(lst.getSelectedValue().getVelicina());
    txtVrsta.setText(lst.getSelectedValue().getVrsta());
     txtDatum.setText(lst.getSelectedValue().getDatum().toString()); 
     cmbVlasnik.setSelectedItem(lst.getSelectedValue().getVlasnik());
            
    
    
    
    }

    @Override
    public void ucitajVrijednostiIzViewKontrola() {
oj.setData(txtDatum.getText(), txtVrsta.getText(), txtVelicina.getText(), txtBoja.getText());
 oj.getEntitet().setVlasnik((Vlasnik) cmbVlasnik.getSelectedItem());       
        }

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnc;
    private javax.swing.JButton btnd;
    private javax.swing.JButton btnu;
    private javax.swing.JComboBox<Vlasnik> cmbVlasnik;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Jastuk> lst;
    private javax.swing.JTextField txtBoja;
    private javax.swing.JTextField txtDatum;
    private javax.swing.JTextField txtVelicina;
    private javax.swing.JTextField txtVrsta;
    // End of variables declaration//GEN-END:variables
}
