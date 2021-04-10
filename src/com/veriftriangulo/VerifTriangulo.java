/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.veriftriangulo;

/**
 *
 * @author RAFAEL
 */
public class VerifTriangulo extends javax.swing.JFrame {

    /**
     * Creates new form VerifTriangulo
     */
    public VerifTriangulo() {
        initComponents();
        tEquilatero.setVisible(false);  
        tEscaleno.setVisible(false);    //As imagens dos triângulos não 
        tIsosceles.setVisible(false);   //aparecem no início do programa
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txTriangulo = new javax.swing.JLabel();
        slideA = new javax.swing.JSlider();
        slideB = new javax.swing.JSlider();
        slideC = new javax.swing.JSlider();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        botaoVerif = new javax.swing.JButton();
        tEquilatero = new javax.swing.JLabel();
        tEscaleno = new javax.swing.JLabel();
        tIsosceles = new javax.swing.JLabel();
        triangulo = new javax.swing.JLabel();
        segmentoA = new javax.swing.JLabel();
        segmentoB = new javax.swing.JLabel();
        segmentoC = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Verificação de triângulo");
        setResizable(false);

        txTriangulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txTriangulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        slideA.setMaximum(50);
        slideA.setValue(0);
        slideA.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slideAStateChanged(evt);
            }
        });

        slideB.setMaximum(50);
        slideB.setValue(0);
        slideB.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slideBStateChanged(evt);
            }
        });

        slideC.setMaximum(50);
        slideC.setValue(0);
        slideC.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slideCStateChanged(evt);
            }
        });

        jLabel3.setText("Segmento a");

        jLabel4.setText("Segmento b");

        jLabel5.setText("Segmento c");

        botaoVerif.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        botaoVerif.setText("Verificação");
        botaoVerif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVerifActionPerformed(evt);
            }
        });

        tEquilatero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagens/equilátero.png"))); // NOI18N

        tEscaleno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagens/escaleno.png"))); // NOI18N

        tIsosceles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagens/isosceles.png"))); // NOI18N

        triangulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagens/triangulo.png"))); // NOI18N

        segmentoA.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        segmentoA.setText("0");

        segmentoB.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        segmentoB.setText("0");

        segmentoC.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        segmentoC.setText("0");

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("Atribua valores aos segmentos:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(12, 12, 12)
                                .addComponent(slideA, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(12, 12, 12)
                                .addComponent(slideB, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(13, 13, 13)
                                .addComponent(slideC, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(tEquilatero))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(tIsosceles))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(tEscaleno))
                            .addComponent(segmentoA, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(segmentoB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(triangulo))
                            .addComponent(segmentoC, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(botaoVerif)
                        .addGap(40, 40, 40)
                        .addComponent(txTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tEquilatero)
                            .addComponent(tIsosceles)
                            .addComponent(tEscaleno)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(segmentoB, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(triangulo))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(segmentoC, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(slideA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(slideB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(slideC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(segmentoA, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoVerif, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void slideAStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slideAStateChanged
        segmentoA.setText(Integer.toString(slideA.getValue())); //O texto do segmentoA muda para o valor do slideA
    }//GEN-LAST:event_slideAStateChanged

    private void slideBStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slideBStateChanged
        segmentoB.setText(Integer.toString(slideB.getValue())); //O texto do segmentoB muda para o valor do slideB
    }//GEN-LAST:event_slideBStateChanged

    private void slideCStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slideCStateChanged
        segmentoC.setText(Integer.toString(slideC.getValue())); //O texto do segmentoC muda para o valor do slideC
    }//GEN-LAST:event_slideCStateChanged

    private void botaoVerifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVerifActionPerformed
        int segA = slideA.getValue();   
        int segB = slideB.getValue();   //Variáveis do tipo inteiro recebem valores dos slides
        int segC = slideC.getValue();   
        if(segA<(segB+segC) && segB<(segA+segC) && segC<(segA+segB)){   //Verifica se medidas podem formar um triângulo
            if(segA==segB && segB==segC){   //Se os 3 segmentos forem iguais
                txTriangulo.setText("Triângulo equilátero");    //Informa o tipo do triângulo
                tIsosceles.setVisible(false);   
                tEscaleno.setVisible(false);
                triangulo.setVisible(false);    //Imagens desaparecem da janela
                tEquilatero.setVisible(true);   //Imagem aparece na janela
            }else if(segA==segB || segB==segC || segC==segA){   //Se 2 lados forem iguais
                txTriangulo.setText("Triângulo isósceles");     //Informa o tipo do triângulo
                tEquilatero.setVisible(false);
                tEscaleno.setVisible(false);
                triangulo.setVisible(false);    //Imagens desaparecem da janela
                tIsosceles.setVisible(true);    //Imagem aparece na janela               
            }else if(segA!=segB && segB!=segC && segC!=segA){   //Se todos os lados forem diferentes
                txTriangulo.setText("Triângulo escaleno");      //Informa o tipo do triângulo
                tEquilatero.setVisible(false);
                tIsosceles.setVisible(false);
                triangulo.setVisible(false);    //Imagens desaparecem da janela
                tEscaleno.setVisible(true);     //Imagem aparece na janela
            }
        }else{      //Caso as medidas não possam formar um triângulo
            txTriangulo.setText("Não é um triângulo");  //Informa na janela
            tEquilatero.setVisible(false);
            tEscaleno.setVisible(false);
            tIsosceles.setVisible(false);   //Imagens desaparecem da janela
            triangulo.setVisible(true);     //Imagem padrão aparece na janela 
        }
    }//GEN-LAST:event_botaoVerifActionPerformed

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
            java.util.logging.Logger.getLogger(VerifTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VerifTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VerifTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VerifTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VerifTriangulo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoVerif;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel segmentoA;
    private javax.swing.JLabel segmentoB;
    private javax.swing.JLabel segmentoC;
    private javax.swing.JSlider slideA;
    private javax.swing.JSlider slideB;
    private javax.swing.JSlider slideC;
    private javax.swing.JLabel tEquilatero;
    private javax.swing.JLabel tEscaleno;
    private javax.swing.JLabel tIsosceles;
    private javax.swing.JLabel triangulo;
    private javax.swing.JLabel txTriangulo;
    // End of variables declaration//GEN-END:variables
}