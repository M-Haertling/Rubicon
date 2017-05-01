/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package rubicon.menus;

import java.text.DecimalFormat;
import rubicon.Data;


/**
 *
 * @author user
 */
public class DataView extends javax.swing.JPanel {

    /**
     * Creates new form DataView
     */
    public DataView() {
        initComponents();
    }

    public void update(Data d){
        money.setText(d.getMoney()+"");
        DecimalFormat dec = new DecimalFormat("#.##");
        distanceRecord.setText(dec.format(d.getHighScoreDist())+"");
        moneyRecord.setText(dec.format(d.getHighScoreMoney())+"");
        lastMoney.setText(dec.format(d.getLastRunMoney())+"");
        lastDistance.setText(dec.format(d.getLastRunDistance())+"");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        money = new javax.swing.JLabel();
        distanceRecord = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        moneyRecord = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lastDistance = new javax.swing.JLabel();
        lastMoney = new javax.swing.JLabel();

        setOpaque(false);

        jLabel1.setBackground(new java.awt.Color(51, 255, 255));
        jLabel1.setFont(new java.awt.Font("Silom", 0, 18));
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("Most Money In a Single Run:");

        jLabel2.setBackground(new java.awt.Color(51, 255, 255));
        jLabel2.setFont(new java.awt.Font("Silom", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        jLabel2.setText("Farthest Distance In a Single Run:");

        money.setBackground(new java.awt.Color(51, 255, 255));
        money.setFont(new java.awt.Font("Silom", 0, 18));
        money.setForeground(new java.awt.Color(0, 255, 255));
        money.setText("$$$");

        distanceRecord.setBackground(new java.awt.Color(51, 255, 255));
        distanceRecord.setFont(new java.awt.Font("Silom", 0, 18)); // NOI18N
        distanceRecord.setForeground(new java.awt.Color(0, 255, 255));
        distanceRecord.setText("000");

        jLabel3.setBackground(new java.awt.Color(51, 255, 255));
        jLabel3.setFont(new java.awt.Font("Silom", 0, 18));
        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setText("Money:");

        moneyRecord.setBackground(new java.awt.Color(51, 255, 255));
        moneyRecord.setFont(new java.awt.Font("Silom", 0, 18));
        moneyRecord.setForeground(new java.awt.Color(0, 255, 255));
        moneyRecord.setText("$$$");

        jLabel4.setBackground(new java.awt.Color(51, 255, 255));
        jLabel4.setFont(new java.awt.Font("Silom", 0, 18));
        jLabel4.setForeground(new java.awt.Color(0, 255, 255));
        jLabel4.setText("Distance Fallen Last Round:");

        jLabel5.setBackground(new java.awt.Color(51, 255, 255));
        jLabel5.setFont(new java.awt.Font("Silom", 0, 18));
        jLabel5.setForeground(new java.awt.Color(0, 255, 255));
        jLabel5.setText("Money Collected Last Round:");

        lastDistance.setBackground(new java.awt.Color(51, 255, 255));
        lastDistance.setFont(new java.awt.Font("Silom", 0, 18));
        lastDistance.setForeground(new java.awt.Color(0, 255, 255));
        lastDistance.setText("000");

        lastMoney.setBackground(new java.awt.Color(51, 255, 255));
        lastMoney.setFont(new java.awt.Font("Silom", 0, 18));
        lastMoney.setForeground(new java.awt.Color(0, 255, 255));
        lastMoney.setText("$$$");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jLabel3)
                    .add(jLabel5)
                    .add(jLabel4)
                    .add(jLabel1)
                    .add(jLabel2))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(moneyRecord, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .add(lastMoney, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .add(money, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .add(lastDistance, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .add(distanceRecord, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3)
                    .add(money))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel5)
                    .add(lastMoney))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel4)
                    .add(lastDistance))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(moneyRecord))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(distanceRecord))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel distanceRecord;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lastDistance;
    private javax.swing.JLabel lastMoney;
    private javax.swing.JLabel money;
    private javax.swing.JLabel moneyRecord;
    // End of variables declaration//GEN-END:variables
}
