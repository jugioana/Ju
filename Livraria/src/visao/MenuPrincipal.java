package visao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author StudioSalas
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuAcesso = new javax.swing.JMenu();
        jMenuItemLogin = new javax.swing.JMenuItem();
        jMenuItemLogout = new javax.swing.JMenuItem();
        jMenuCadastros = new javax.swing.JMenu();
        jMenuItemUsuarios = new javax.swing.JMenuItem();
        jMenuItemClientes = new javax.swing.JMenuItem();
        jMenuItemFornecedores = new javax.swing.JMenuItem();
        jMenuItemColaboradores = new javax.swing.JMenuItem();
        jMenuItemProdutos = new javax.swing.JMenuItem();
        jMenuMovimentacao = new javax.swing.JMenu();
        jMenuItemVendas = new javax.swing.JMenuItem();
        jMenuItemCompras = new javax.swing.JMenuItem();
        jMenuItemDevolucoes = new javax.swing.JMenuItem();
        jMenuRelatorio = new javax.swing.JMenu();
        jMenuItemRelVendas = new javax.swing.JMenuItem();
        jMenuItemRelCompras = new javax.swing.JMenuItem();
        jMenuItemRelDevoluções = new javax.swing.JMenuItem();
        jMenuItemRelColaboradores = new javax.swing.JMenuItem();
        jMenuItemRelClientes = new javax.swing.JMenuItem();
        jMenuItemRelFornecedores = new javax.swing.JMenuItem();
        jMenuItemRelEstoque = new javax.swing.JMenuItem();
        jMenuSeguranca = new javax.swing.JMenu();
        jMenuItemSegCopia = new javax.swing.JMenuItem();
        jMenuItemSegRecup = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();
        jMenuItemConfirmacaoSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenuAcesso.setText("Acesso");
        jMenuAcesso.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jMenuItemLogin.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItemLogin.setText("Login");
        jMenuItemLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLoginActionPerformed(evt);
            }
        });
        jMenuAcesso.add(jMenuItemLogin);

        jMenuItemLogout.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItemLogout.setText("Logout");
        jMenuItemLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLogoutActionPerformed(evt);
            }
        });
        jMenuAcesso.add(jMenuItemLogout);

        jMenuBar1.add(jMenuAcesso);

        jMenuCadastros.setText("Cadastros");
        jMenuCadastros.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jMenuItemUsuarios.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItemUsuarios.setText("Usuários");
        jMenuCadastros.add(jMenuItemUsuarios);

        jMenuItemClientes.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItemClientes.setText("Clientes");
        jMenuCadastros.add(jMenuItemClientes);

        jMenuItemFornecedores.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItemFornecedores.setText("Fornecedores");
        jMenuItemFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFornecedoresActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemFornecedores);

        jMenuItemColaboradores.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItemColaboradores.setText("Colaboradores");
        jMenuItemColaboradores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemColaboradoresActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemColaboradores);

        jMenuItemProdutos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItemProdutos.setText("Produtos");
        jMenuItemProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProdutosActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jMenuItemProdutos);

        jMenuBar1.add(jMenuCadastros);

        jMenuMovimentacao.setText("Movimentação");
        jMenuMovimentacao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jMenuItemVendas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItemVendas.setText("Vendas");
        jMenuMovimentacao.add(jMenuItemVendas);

        jMenuItemCompras.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItemCompras.setText("Compras");
        jMenuItemCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemComprasActionPerformed(evt);
            }
        });
        jMenuMovimentacao.add(jMenuItemCompras);

        jMenuItemDevolucoes.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItemDevolucoes.setText("Devoluções");
        jMenuMovimentacao.add(jMenuItemDevolucoes);

        jMenuBar1.add(jMenuMovimentacao);

        jMenuRelatorio.setText("Relatório");
        jMenuRelatorio.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jMenuItemRelVendas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItemRelVendas.setText("Vendas");
        jMenuRelatorio.add(jMenuItemRelVendas);

        jMenuItemRelCompras.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItemRelCompras.setText("Compras");
        jMenuItemRelCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRelComprasActionPerformed(evt);
            }
        });
        jMenuRelatorio.add(jMenuItemRelCompras);

        jMenuItemRelDevoluções.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItemRelDevoluções.setText("Devoluções");
        jMenuRelatorio.add(jMenuItemRelDevoluções);

        jMenuItemRelColaboradores.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItemRelColaboradores.setText("Colaboradores");
        jMenuItemRelColaboradores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRelColaboradoresActionPerformed(evt);
            }
        });
        jMenuRelatorio.add(jMenuItemRelColaboradores);

        jMenuItemRelClientes.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItemRelClientes.setText("Clientes");
        jMenuItemRelClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRelClientesActionPerformed(evt);
            }
        });
        jMenuRelatorio.add(jMenuItemRelClientes);

        jMenuItemRelFornecedores.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItemRelFornecedores.setText("Fornecedores");
        jMenuRelatorio.add(jMenuItemRelFornecedores);

        jMenuItemRelEstoque.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItemRelEstoque.setText("Estoque");
        jMenuRelatorio.add(jMenuItemRelEstoque);

        jMenuBar1.add(jMenuRelatorio);

        jMenuSeguranca.setText("Segurança");
        jMenuSeguranca.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jMenuItemSegCopia.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItemSegCopia.setText("Cópia de Segurança");
        jMenuSeguranca.add(jMenuItemSegCopia);

        jMenuItemSegRecup.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jMenuItemSegRecup.setText("Recuperação de Dados");
        jMenuSeguranca.add(jMenuItemSegRecup);

        jMenuBar1.add(jMenuSeguranca);

        jMenuSair.setText("Sair");
        jMenuSair.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jMenuItemConfirmacaoSair.setText("Confirmação");
        jMenuItemConfirmacaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConfirmacaoSairActionPerformed(evt);
            }
        });
        jMenuSair.add(jMenuItemConfirmacaoSair);

        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 404, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(420, 340));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemColaboradoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemColaboradoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemColaboradoresActionPerformed

    private void jMenuItemProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProdutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemProdutosActionPerformed

    private void jMenuItemComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemComprasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemComprasActionPerformed

    private void jMenuItemRelComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRelComprasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemRelComprasActionPerformed

    private void jMenuItemRelColaboradoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRelColaboradoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemRelColaboradoresActionPerformed

    private void jMenuItemRelClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRelClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemRelClientesActionPerformed

    private void jMenuItemConfirmacaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConfirmacaoSairActionPerformed
       System.exit(1);
               
    }//GEN-LAST:event_jMenuItemConfirmacaoSairActionPerformed

    private void jMenuItemFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFornecedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemFornecedoresActionPerformed

    private void jMenuItemLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLoginActionPerformed
       TelaLogin tela = new  TelaLogin ();
       tela.setVisible(true);
       dispose ();
    }//GEN-LAST:event_jMenuItemLoginActionPerformed

    private void jMenuItemLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLogoutActionPerformed
       TelaLogout tela = new TelaLogout ();
       tela.setVisible(true);
       dispose ();
    }//GEN-LAST:event_jMenuItemLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenuAcesso;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastros;
    private javax.swing.JMenuItem jMenuItemClientes;
    private javax.swing.JMenuItem jMenuItemColaboradores;
    private javax.swing.JMenuItem jMenuItemCompras;
    private javax.swing.JMenuItem jMenuItemConfirmacaoSair;
    private javax.swing.JMenuItem jMenuItemDevolucoes;
    private javax.swing.JMenuItem jMenuItemFornecedores;
    private javax.swing.JMenuItem jMenuItemLogin;
    private javax.swing.JMenuItem jMenuItemLogout;
    private javax.swing.JMenuItem jMenuItemProdutos;
    private javax.swing.JMenuItem jMenuItemRelClientes;
    private javax.swing.JMenuItem jMenuItemRelColaboradores;
    private javax.swing.JMenuItem jMenuItemRelCompras;
    private javax.swing.JMenuItem jMenuItemRelDevoluções;
    private javax.swing.JMenuItem jMenuItemRelEstoque;
    private javax.swing.JMenuItem jMenuItemRelFornecedores;
    private javax.swing.JMenuItem jMenuItemRelVendas;
    private javax.swing.JMenuItem jMenuItemSegCopia;
    private javax.swing.JMenuItem jMenuItemSegRecup;
    private javax.swing.JMenuItem jMenuItemUsuarios;
    private javax.swing.JMenuItem jMenuItemVendas;
    private javax.swing.JMenu jMenuMovimentacao;
    private javax.swing.JMenu jMenuRelatorio;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JMenu jMenuSeguranca;
    // End of variables declaration//GEN-END:variables
}
