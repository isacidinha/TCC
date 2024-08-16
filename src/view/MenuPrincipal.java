/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;


import javax.swing.JOptionPane;

/**
 *
 * @author jao07
 */
public class MenuPrincipal extends javax.swing.JFrame {
    
    
    public MenuPrincipal() {
        initComponents();
    }
    
 
    @SuppressWarnings("unchecked") 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_cadastrar = new javax.swing.JMenu();
        Cad_Paciente = new javax.swing.JMenuItem();
        Cad_Medicamentos = new javax.swing.JMenuItem();
        Cad_Medico = new javax.swing.JMenuItem();
        Cad_Enfermeiro = new javax.swing.JMenuItem();
        Cad_Comorbidade = new javax.swing.JMenuItem();
        Cad_Patologia = new javax.swing.JMenuItem();
        Cad_Alergia = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        menu_registrar = new javax.swing.JMenu();
        Medicar = new javax.swing.JMenuItem();
        Rest_Alergia = new javax.swing.JMenuItem();
        Rest_Comorbidade = new javax.swing.JMenuItem();
        Rest_Patologia = new javax.swing.JMenuItem();
        menu_relatorio = new javax.swing.JMenu();
        Gera_Relat_Med = new javax.swing.JMenuItem();
        Gera_Relat_Paciente = new javax.swing.JMenuItem();
        menu_sair = new javax.swing.JMenu();
        Sair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de monitoramento de medicacao - V.01\n");
        setIconImages(null);

        jDesktopPane1.setAutoscrolls(true);
        jDesktopPane1.setPreferredSize(new java.awt.Dimension(750, 750));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 738, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 457, Short.MAX_VALUE)
        );

        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        menu_cadastrar.setText("Cadastro");
        menu_cadastrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        Cad_Paciente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Cad_Paciente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cad_Paciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-convidado-masculino-16.png"))); // NOI18N
        Cad_Paciente.setText("Paciente");
        Cad_Paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cad_PacienteActionPerformed(evt);
            }
        });
        menu_cadastrar.add(Cad_Paciente);

        Cad_Medicamentos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Cad_Medicamentos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cad_Medicamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-pílula-16.png"))); // NOI18N
        Cad_Medicamentos.setText("Medicamento");
        Cad_Medicamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cad_MedicamentosActionPerformed(evt);
            }
        });
        menu_cadastrar.add(Cad_Medicamentos);

        Cad_Medico.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cad_Medico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-médico-16.png"))); // NOI18N
        Cad_Medico.setText("Médico");
        Cad_Medico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cad_MedicoActionPerformed(evt);
            }
        });
        menu_cadastrar.add(Cad_Medico);

        Cad_Enfermeiro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cad_Enfermeiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-enfermeiro-16.png"))); // NOI18N
        Cad_Enfermeiro.setText("Enfermeiro");
        Cad_Enfermeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cad_EnfermeiroActionPerformed(evt);
            }
        });
        menu_cadastrar.add(Cad_Enfermeiro);

        Cad_Comorbidade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cad_Comorbidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-coração-com-pulso-16.png"))); // NOI18N
        Cad_Comorbidade.setText("Comorbidade");
        Cad_Comorbidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cad_ComorbidadeActionPerformed(evt);
            }
        });
        menu_cadastrar.add(Cad_Comorbidade);

        Cad_Patologia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cad_Patologia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-vírus-16.png"))); // NOI18N
        Cad_Patologia.setText("Patologia");
        Cad_Patologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cad_PatologiaActionPerformed(evt);
            }
        });
        menu_cadastrar.add(Cad_Patologia);

        Cad_Alergia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Cad_Alergia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-curativo-16.png"))); // NOI18N
        Cad_Alergia.setText("Alergia");
        Cad_Alergia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cad_AlergiaActionPerformed(evt);
            }
        });
        menu_cadastrar.add(Cad_Alergia);

        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-documentos-16.png"))); // NOI18N
        jMenuItem1.setText("Receita");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menu_cadastrar.add(jMenuItem1);

        jMenuBar1.add(menu_cadastrar);

        menu_registrar.setText("Registrar");
        menu_registrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        Medicar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Medicar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/medicar.png"))); // NOI18N
        Medicar.setText("Medicar");
        Medicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedicarActionPerformed(evt);
            }
        });
        menu_registrar.add(Medicar);

        Rest_Alergia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Rest_Alergia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-curativo-16.png"))); // NOI18N
        Rest_Alergia.setText("Restringir Alergia");
        Rest_Alergia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rest_AlergiaActionPerformed(evt);
            }
        });
        menu_registrar.add(Rest_Alergia);

        Rest_Comorbidade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Rest_Comorbidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-coração-com-pulso-16.png"))); // NOI18N
        Rest_Comorbidade.setText("Restringir Comorbidade");
        Rest_Comorbidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rest_ComorbidadeActionPerformed(evt);
            }
        });
        menu_registrar.add(Rest_Comorbidade);

        Rest_Patologia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Rest_Patologia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-vírus-16.png"))); // NOI18N
        Rest_Patologia.setText("Restringir Patologia");
        Rest_Patologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rest_PatologiaActionPerformed(evt);
            }
        });
        menu_registrar.add(Rest_Patologia);

        jMenuBar1.add(menu_registrar);

        menu_relatorio.setText("Relatório");
        menu_relatorio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        Gera_Relat_Med.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Gera_Relat_Med.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-documentos-16.png"))); // NOI18N
        Gera_Relat_Med.setText("Relatório de medicamentos");
        Gera_Relat_Med.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Gera_Relat_MedActionPerformed(evt);
            }
        });
        menu_relatorio.add(Gera_Relat_Med);

        Gera_Relat_Paciente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Gera_Relat_Paciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-grupo-de-usuário-homem-mulher-16.png"))); // NOI18N
        Gera_Relat_Paciente.setText("Relatório de pacientes");
        Gera_Relat_Paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Gera_Relat_PacienteActionPerformed(evt);
            }
        });
        menu_relatorio.add(Gera_Relat_Paciente);

        jMenuBar1.add(menu_relatorio);

        menu_sair.setText("Sair");
        menu_sair.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        Sair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Sair.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-cancelar-16.png"))); // NOI18N
        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        menu_sair.add(Sair);

        jMenuBar1.add(menu_sair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleName("Sistema de Monitoramento de Medicação - ver. 1 ");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
         int resp = JOptionPane.showConfirmDialog(null, 
                "Deseja realmente sair ? ", "Aviso de saida...",
                           JOptionPane.YES_NO_CANCEL_OPTION);

	// 0=yes, 1=no, 2=cancel
	System.out.println(resp);
        
        if (resp==0)
            System.exit(0);
    }//GEN-LAST:event_SairActionPerformed

    private void Gera_Relat_MedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Gera_Relat_MedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Gera_Relat_MedActionPerformed

    private void Gera_Relat_PacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Gera_Relat_PacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Gera_Relat_PacienteActionPerformed

    private void MedicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedicarActionPerformed
        Tela_Medicar x = new Tela_Medicar();
        jDesktopPane1.add(x);
        x.setVisible(true);
    }//GEN-LAST:event_MedicarActionPerformed

    private void Rest_AlergiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rest_AlergiaActionPerformed
        Tela_RestrAlergia x = new Tela_RestrAlergia();
        jDesktopPane1.add(x);
        x.setVisible(true);
    }//GEN-LAST:event_Rest_AlergiaActionPerformed

    private void Rest_ComorbidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rest_ComorbidadeActionPerformed
        Tela_RestrComorbidade x = new Tela_RestrComorbidade();
        jDesktopPane1.add(x);
        x.setVisible(true);
    }//GEN-LAST:event_Rest_ComorbidadeActionPerformed

    private void Rest_PatologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rest_PatologiaActionPerformed
        Tela_RestrPatologia x = new Tela_RestrPatologia();
        jDesktopPane1.add(x);
        x.setVisible(true);
    }//GEN-LAST:event_Rest_PatologiaActionPerformed

    private void Cad_EnfermeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cad_EnfermeiroActionPerformed
        Tela_CadEnfermeiro x = new Tela_CadEnfermeiro();
        jDesktopPane1.add(x);
        x.setVisible(true);
    }//GEN-LAST:event_Cad_EnfermeiroActionPerformed

    private void Cad_MedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cad_MedicoActionPerformed
        Tela_CadMedico x = new Tela_CadMedico();
        jDesktopPane1.add(x);
        x.setVisible(true);
    }//GEN-LAST:event_Cad_MedicoActionPerformed

    private void Cad_MedicamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cad_MedicamentosActionPerformed
        Tela_CadMedicamento x = new Tela_CadMedicamento();
        jDesktopPane1.add(x);
        x.setVisible(true);
    }//GEN-LAST:event_Cad_MedicamentosActionPerformed

    private void Cad_PacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cad_PacienteActionPerformed
        Tela_CadPaciente x = new Tela_CadPaciente();
        jDesktopPane1.add(x);
        x.setVisible(true);
    }//GEN-LAST:event_Cad_PacienteActionPerformed

    private void Cad_ComorbidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cad_ComorbidadeActionPerformed
        Tela_CadComorbidade x = new Tela_CadComorbidade();
        jDesktopPane1.add(x);
        x.setVisible(true);
    }//GEN-LAST:event_Cad_ComorbidadeActionPerformed

    private void Cad_PatologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cad_PatologiaActionPerformed
        Tela_CadPatologia x = new Tela_CadPatologia();
        jDesktopPane1.add(x);
        x.setVisible(true);
    }//GEN-LAST:event_Cad_PatologiaActionPerformed

    private void Cad_AlergiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cad_AlergiaActionPerformed
        Tela_CadAlergia x = new Tela_CadAlergia();
        jDesktopPane1.add(x);
        x.setVisible(true);
    }//GEN-LAST:event_Cad_AlergiaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Tela_CadReceita x = new Tela_CadReceita();
        jDesktopPane1.add(x);
        x.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
    private javax.swing.JMenuItem Cad_Alergia;
    private javax.swing.JMenuItem Cad_Comorbidade;
    private javax.swing.JMenuItem Cad_Enfermeiro;
    private javax.swing.JMenuItem Cad_Medicamentos;
    private javax.swing.JMenuItem Cad_Medico;
    private javax.swing.JMenuItem Cad_Paciente;
    private javax.swing.JMenuItem Cad_Patologia;
    private javax.swing.JMenuItem Gera_Relat_Med;
    private javax.swing.JMenuItem Gera_Relat_Paciente;
    private javax.swing.JMenuItem Medicar;
    private javax.swing.JMenuItem Rest_Alergia;
    private javax.swing.JMenuItem Rest_Comorbidade;
    private javax.swing.JMenuItem Rest_Patologia;
    private javax.swing.JMenuItem Sair;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu menu_cadastrar;
    private javax.swing.JMenu menu_registrar;
    private javax.swing.JMenu menu_relatorio;
    private javax.swing.JMenu menu_sair;
    // End of variables declaration//GEN-END:variables
}
