package questao1;

import javax.swing.DefaultListModel;
import java.util.ArrayList;

public class questao1 extends javax.swing.JFrame {
    DefaultListModel listModel = new DefaultListModel();
    private final ArrayList<Contato> contatos;
    Contato c;
    int id = 0;
    
public questao1() {
        initComponents();
        contatos = new ArrayList<>();
        this.Atualizar();
    }
 public final void Atualizar() {
        for (int i = 0; i < contatos.size(); i++) {
            listModel.addElement(contatos.get(i).getNome());
        }
        lista.setModel(listModel);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        inputnome = new javax.swing.JTextField();
        inputtel = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtextarea = new javax.swing.JTextArea();
        buttonadi = new javax.swing.JButton();
        buttonatu = new javax.swing.JButton();
        buttonrem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Nome:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Telefone:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Detalhes:");

        lista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lista);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel4.setText("AGENDA");

        jtextarea.setColumns(20);
        jtextarea.setRows(5);
        jScrollPane2.setViewportView(jtextarea);

        buttonadi.setText("Adicionar");
        buttonadi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonadiActionPerformed(evt);
            }
        });

        buttonatu.setText("Atualizar");
        buttonatu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonatuActionPerformed(evt);
            }
        });

        buttonrem.setText("Remover");
        buttonrem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonremActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(inputnome)
                                        .addComponent(inputtel)
                                        .addComponent(jScrollPane2))
                                    .addGap(20, 20, 20))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(buttonadi)
                                    .addGap(28, 28, 28)
                                    .addComponent(buttonrem)
                                    .addGap(18, 18, 18)
                                    .addComponent(buttonatu)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(jLabel4)))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(inputnome, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(inputtel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonatu)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buttonadi)
                        .addComponent(buttonrem)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonadiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonadiActionPerformed
       String nome = inputnome.getText();
        String telefone = inputtel.getText();
        String detalhes = jtextarea.getText();

            id = id + 1;
            c = new Contato(id, nome, telefone, detalhes);
            contatos.add(c);

            inputnome.setText("");
            inputtel.setText("");
            jtextarea.setText("");

            listModel.clear();
            lista.setModel(listModel);
            this.Atualizar();
    }//GEN-LAST:event_buttonadiActionPerformed

    private void buttonremActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonremActionPerformed
        int index = lista.getSelectedIndex();
        contatos.remove(index);
        listModel.clear();
        lista.setModel(listModel);
        inputnome.setText("");
        inputtel.setText("");
        jtextarea.setText("");
        this.Atualizar();
    }//GEN-LAST:event_buttonremActionPerformed

    private void buttonatuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonatuActionPerformed
        String nome = inputnome.getText();
        String telefone = inputtel.getText();
        String detalhes = jtextarea.getText();

            int index = lista.getSelectedIndex();

            contatos.get(index).setNome(nome);
            contatos.get(index).setTelefone(telefone);
            contatos.get(index).setDetalhes(detalhes);
            
            inputnome.setText("");
            inputnome.setText("");
            inputtel.setText("");
            jtextarea.setText("");

            listModel.clear();
            lista.setModel(listModel);
            this.Atualizar();
        
    }//GEN-LAST:event_buttonatuActionPerformed

    private void listaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaMouseClicked
   int index = lista.getSelectedIndex();

        if (index < 0) {
        } else {
            inputnome.setText(contatos.get(index).getNome());
            inputtel.setText(contatos.get(index).getTelefone());
            jtextarea.setText(contatos.get(index).getDetalhes());
        }
    }//GEN-LAST:event_listaMouseClicked

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
            java.util.logging.Logger.getLogger(questao1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(questao1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(questao1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(questao1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new questao1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonadi;
    private javax.swing.JButton buttonatu;
    private javax.swing.JButton buttonrem;
    private javax.swing.JTextField inputnome;
    private javax.swing.JTextField inputtel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jtextarea;
    private javax.swing.JList<String> lista;
    // End of variables declaration//GEN-END:variables
}
