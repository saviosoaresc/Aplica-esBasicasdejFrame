
package questao6;
import java.util.Random;
public class questao6JF extends javax.swing.JFrame {
    Random random = new Random(); 
    int numeroaleatorio= random.nextInt(100) + 1;
    
    
    public questao6JF() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbchute = new javax.swing.JLabel();
        tfvalor = new javax.swing.JTextField();
        lbheader = new javax.swing.JLabel();
        lbfooter = new javax.swing.JLabel();
        btnnewgame = new javax.swing.JButton();
        lbnotification = new javax.swing.JLabel();
        btnconfirme = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbchute.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbchute.setText("Entre com seu chute:");

        tfvalor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfvalorMouseClicked(evt);
            }
        });

        lbheader.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbheader.setText("Eu tenho um número entre 0 e 100, você pode adivinhá-lo?");

        lbfooter.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbfooter.setText("O número está entre 0 e 100");

        btnnewgame.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnnewgame.setText("Novo Jogo");
        btnnewgame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnnewgameMouseClicked(evt);
            }
        });
        btnnewgame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewgameActionPerformed(evt);
            }
        });

        lbnotification.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbnotification.setForeground(new java.awt.Color(255, 0, 0));

        btnconfirme.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnconfirme.setText("Confirmar");
        btnconfirme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconfirmeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbfooter)
                        .addGap(67, 67, 67)
                        .addComponent(btnnewgame, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(210, 210, 210)
                                .addComponent(btnconfirme, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbheader))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(lbchute)
                .addGap(18, 18, 18)
                .addComponent(tfvalor, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbnotification, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbheader)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbnotification, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbchute)
                        .addComponent(tfvalor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnconfirme, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbfooter)
                    .addComponent(btnnewgame, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnconfirmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconfirmeActionPerformed
        int num = Integer.valueOf(tfvalor.getText());
        if(num == numeroaleatorio){
            lbfooter.setText("Correto!");
            lbnotification.setText("");
            tfvalor.setEditable(false);
            btnconfirme.setEnabled(false);
            btnnewgame.setEnabled(true);
        }else{
            int numeroaleatorio2= random.nextInt(7);
            int numeroaleatorio3= random.nextInt(18);
            lbfooter.setText(String.valueOf("O número está entre " + ((numeroaleatorio-1) - numeroaleatorio2)+
    " e " + ((numeroaleatorio+1)+numeroaleatorio3)));
            lbnotification.setText("Tente Novamente");
            tfvalor.setText("");
            btnnewgame.setEnabled(false);
            System.out.println(numeroaleatorio);
        }
    
    }//GEN-LAST:event_btnconfirmeActionPerformed

    private void btnnewgameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewgameActionPerformed
    //Pegar o método Gerar(); que mudará o numero aleatório
    numeroaleatorio = random.nextInt(100);
    tfvalor.setEditable(true);
    tfvalor.setText("");
    btnconfirme.setEnabled(true);
    btnnewgame.setEnabled(false);
    }//GEN-LAST:event_btnnewgameActionPerformed

    private void tfvalorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfvalorMouseClicked
       lbnotification.setText("");
    }//GEN-LAST:event_tfvalorMouseClicked

    private void btnnewgameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnnewgameMouseClicked
    }//GEN-LAST:event_btnnewgameMouseClicked

   
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
            java.util.logging.Logger.getLogger(questao6JF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(questao6JF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(questao6JF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(questao6JF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new questao6JF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnconfirme;
    private javax.swing.JButton btnnewgame;
    private javax.swing.JLabel lbchute;
    private javax.swing.JLabel lbfooter;
    private javax.swing.JLabel lbheader;
    private javax.swing.JLabel lbnotification;
    private javax.swing.JTextField tfvalor;
    // End of variables declaration//GEN-END:variables
}
