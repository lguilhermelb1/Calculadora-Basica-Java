/*ser
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import javax.swing.JOptionPane;

/**
 *
 * @author Luis Guilherme Lourinho Bernardino
 */
public class telaLogin extends javax.swing.JFrame {

    /**
     * Creates new form telaLogin
     */
    public telaLogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entrar = new javax.swing.JButton();
        usuario = new javax.swing.JLabel();
        senha = new javax.swing.JLabel();
        logintxt = new javax.swing.JTextField();
        registro = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        senhatxt = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 0));

        entrar.setText("Entrar na calculadora");
        entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrarActionPerformed(evt);
            }
        });

        usuario.setText("Usuário:");

        senha.setText("Senha:");

        logintxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logintxtActionPerformed(evt);
            }
        });

        registro.setText("Registrar");
        registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registroActionPerformed(evt);
            }
        });

        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        senhatxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhatxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(entrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                .addComponent(registro))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(usuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(logintxt))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(senha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(senhatxt)))))
                .addGap(79, 79, 79))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usuario)
                    .addComponent(logintxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senha)
                    .addComponent(senhatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entrar)
                    .addComponent(registro))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public boolean checkLogin(String login, String senha){
        telaRegistro tr = new telaRegistro();
        return login.equals("user") && senha.equals("123");
    }
    
    
    private void entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrarActionPerformed
        // TODO add your handling code here:
        if(this.checkLogin(logintxt.getText(), new String(senhatxt.getPassword()))){
        Calculadora calculadora = new Calculadora();
        calculadora.setVisible(true);
        dispose();
        } else{
            JOptionPane.showMessageDialog(this, "Usuário ou senha incorreto");
        }
    }//GEN-LAST:event_entrarActionPerformed

    private void logintxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logintxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logintxtActionPerformed

    private void registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registroActionPerformed
        // TODO add your handling code here:
        telaRegistro tRegistro = new telaRegistro();
        tRegistro.setVisible(true);
        dispose();
    }//GEN-LAST:event_registroActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void senhatxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhatxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhatxtActionPerformed
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton entrar;
    private javax.swing.JButton jButton1;
    public javax.swing.JTextField logintxt;
    private javax.swing.JButton registro;
    private javax.swing.JLabel senha;
    private javax.swing.JPasswordField senhatxt;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
