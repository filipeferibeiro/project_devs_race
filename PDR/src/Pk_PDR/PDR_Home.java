package Pk_PDR;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PDR_Home extends javax.swing.JFrame {

    public PDR_Home() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        barraLateral = new javax.swing.JPanel();
        lblPDR = new javax.swing.JLabel();
        btProjetos = new javax.swing.JPanel();
        pnMarca = new javax.swing.JPanel();
        lblProjetosIcon = new javax.swing.JLabel();
        lblProjetosNome = new javax.swing.JLabel();
        btProjetos1 = new javax.swing.JPanel();
        pnMarca1 = new javax.swing.JPanel();
        lblPontGeral = new javax.swing.JLabel();
        lblPontGeralNome = new javax.swing.JLabel();
        btProjetos3 = new javax.swing.JPanel();
        pnMarca3 = new javax.swing.JPanel();
        lblOutDadosIcon = new javax.swing.JLabel();
        lblOutDadosNome = new javax.swing.JLabel();
        lbl_NewProject = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Project Devs Race");
        setPreferredSize(new java.awt.Dimension(1000, 600));
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setPreferredSize(new java.awt.Dimension(295, 300));

        barraLateral.setBackground(new java.awt.Color(18, 34, 81));
        barraLateral.setPreferredSize(new java.awt.Dimension(295, 491));

        lblPDR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pk_PDR/images/projectIcon.png"))); // NOI18N

        btProjetos.setBackground(new java.awt.Color(18, 56, 101));
        btProjetos.setPreferredSize(new java.awt.Dimension(250, 45));

        pnMarca.setBackground(new java.awt.Color(18, 92, 157));
        pnMarca.setPreferredSize(new java.awt.Dimension(3, 50));

        javax.swing.GroupLayout pnMarcaLayout = new javax.swing.GroupLayout(pnMarca);
        pnMarca.setLayout(pnMarcaLayout);
        pnMarcaLayout.setHorizontalGroup(
            pnMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        pnMarcaLayout.setVerticalGroup(
            pnMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        lblProjetosIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pk_PDR/images/icons8_Idea_25px.png"))); // NOI18N

        lblProjetosNome.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblProjetosNome.setForeground(new java.awt.Color(255, 255, 255));
        lblProjetosNome.setText("Projetos");

        javax.swing.GroupLayout btProjetosLayout = new javax.swing.GroupLayout(btProjetos);
        btProjetos.setLayout(btProjetosLayout);
        btProjetosLayout.setHorizontalGroup(
            btProjetosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btProjetosLayout.createSequentialGroup()
                .addComponent(pnMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblProjetosIcon)
                .addGap(4, 4, 4)
                .addComponent(lblProjetosNome)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btProjetosLayout.setVerticalGroup(
            btProjetosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnMarca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addGroup(btProjetosLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(btProjetosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblProjetosIcon)
                    .addComponent(lblProjetosNome)))
        );

        btProjetos1.setBackground(new java.awt.Color(18, 45, 87));
        btProjetos1.setPreferredSize(new java.awt.Dimension(250, 45));

        pnMarca1.setBackground(new java.awt.Color(18, 45, 87));
        pnMarca1.setPreferredSize(new java.awt.Dimension(3, 50));

        javax.swing.GroupLayout pnMarca1Layout = new javax.swing.GroupLayout(pnMarca1);
        pnMarca1.setLayout(pnMarca1Layout);
        pnMarca1Layout.setHorizontalGroup(
            pnMarca1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        pnMarca1Layout.setVerticalGroup(
            pnMarca1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        lblPontGeral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pk_PDR/images/icons8_Bar_Chart_25px.png"))); // NOI18N

        lblPontGeralNome.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblPontGeralNome.setForeground(new java.awt.Color(255, 255, 255));
        lblPontGeralNome.setText("Pontuação Geral");

        javax.swing.GroupLayout btProjetos1Layout = new javax.swing.GroupLayout(btProjetos1);
        btProjetos1.setLayout(btProjetos1Layout);
        btProjetos1Layout.setHorizontalGroup(
            btProjetos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btProjetos1Layout.createSequentialGroup()
                .addComponent(pnMarca1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPontGeral)
                .addGap(4, 4, 4)
                .addComponent(lblPontGeralNome)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btProjetos1Layout.setVerticalGroup(
            btProjetos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnMarca1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addGroup(btProjetos1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(btProjetos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPontGeral)
                    .addComponent(lblPontGeralNome)))
        );

        btProjetos3.setBackground(new java.awt.Color(18, 45, 87));
        btProjetos3.setPreferredSize(new java.awt.Dimension(250, 45));

        pnMarca3.setBackground(new java.awt.Color(18, 45, 87));
        pnMarca3.setPreferredSize(new java.awt.Dimension(3, 50));

        javax.swing.GroupLayout pnMarca3Layout = new javax.swing.GroupLayout(pnMarca3);
        pnMarca3.setLayout(pnMarca3Layout);
        pnMarca3Layout.setHorizontalGroup(
            pnMarca3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        pnMarca3Layout.setVerticalGroup(
            pnMarca3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        lblOutDadosIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pk_PDR/images/icons8_Combo_Chart_25px.png"))); // NOI18N

        lblOutDadosNome.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblOutDadosNome.setForeground(new java.awt.Color(255, 255, 255));
        lblOutDadosNome.setText("Outros Dados");

        javax.swing.GroupLayout btProjetos3Layout = new javax.swing.GroupLayout(btProjetos3);
        btProjetos3.setLayout(btProjetos3Layout);
        btProjetos3Layout.setHorizontalGroup(
            btProjetos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btProjetos3Layout.createSequentialGroup()
                .addComponent(pnMarca3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblOutDadosIcon)
                .addGap(4, 4, 4)
                .addComponent(lblOutDadosNome)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btProjetos3Layout.setVerticalGroup(
            btProjetos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnMarca3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
            .addGroup(btProjetos3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(btProjetos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblOutDadosIcon)
                    .addComponent(lblOutDadosNome)))
        );

        javax.swing.GroupLayout barraLateralLayout = new javax.swing.GroupLayout(barraLateral);
        barraLateral.setLayout(barraLateralLayout);
        barraLateralLayout.setHorizontalGroup(
            barraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraLateralLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblPDR)
                .addContainerGap(30, Short.MAX_VALUE))
            .addComponent(btProjetos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btProjetos1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btProjetos3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        barraLateralLayout.setVerticalGroup(
            barraLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraLateralLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblPDR)
                .addGap(20, 20, 20)
                .addComponent(btProjetos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btProjetos1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btProjetos3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(388, Short.MAX_VALUE))
        );

        lbl_NewProject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pk_PDR/images/newProject.png"))); // NOI18N
        lbl_NewProject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_NewProjectMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(barraLateral, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 695, Short.MAX_VALUE)
                .addComponent(lbl_NewProject)
                .addContainerGap())
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barraLateral, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_NewProject)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Ação para o botão de Novo Projeto
    private void lbl_NewProjectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_NewProjectMouseClicked
        JOptionPane.showMessageDialog(null, "Você ainda não pode adicionar um novo projeto...");
        //Projeto pj = new Projeto();
        //pj.setNome(jTextField1.getText());
        //System.out.println(pj.getNome());
    }//GEN-LAST:event_lbl_NewProjectMouseClicked
    
    
    
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
            java.util.logging.Logger.getLogger(PDR_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PDR_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PDR_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PDR_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PDR_Home().setVisible(true);
            }
        });

    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barraLateral;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel btProjetos;
    private javax.swing.JPanel btProjetos1;
    private javax.swing.JPanel btProjetos2;
    private javax.swing.JPanel btProjetos3;
    private javax.swing.JPanel btProjetos4;
    private javax.swing.JLabel lblOutDadosIcon;
    private javax.swing.JLabel lblOutDadosNome;
    private javax.swing.JLabel lblPDR;
    private javax.swing.JLabel lblPontGeral;
    private javax.swing.JLabel lblPontGeralNome;
    private javax.swing.JLabel lblProjetosIcon;
    private javax.swing.JLabel lblProjetosNome;
    private javax.swing.JLabel lbl_NewProject;
    private javax.swing.JPanel pnMarca;
    private javax.swing.JPanel pnMarca1;
    private javax.swing.JPanel pnMarca2;
    private javax.swing.JPanel pnMarca3;
    private javax.swing.JPanel pnMarca4;
    // End of variables declaration//GEN-END:variables
}