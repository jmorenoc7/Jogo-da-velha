package jogodavelha;

/**
 *
 * @author iivnn
 */
public class tela extends javax.swing.JFrame {

    /**
     * Creates new form tela
     */
    
    Board tela = new Board();
    int ganhador = 0;
    
    public void updateSum(){
        sum0.setText(Integer.toString(tela.getSum()[0]));
        sum1.setText(Integer.toString(tela.getSum()[1]));
        sum2.setText(Integer.toString(tela.getSum()[2]));
        sum3.setText(Integer.toString(tela.getSum()[3]));
        sum4.setText(Integer.toString(tela.getSum()[4]));
        sum5.setText(Integer.toString(tela.getSum()[5]));
        sum6.setText(Integer.toString(tela.getSum()[6]));
        sum7.setText(Integer.toString(tela.getSum()[7]));
        
        
    }
    
    
    public tela() {
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

        casa0 = new javax.swing.JLabel();
        casa1 = new javax.swing.JLabel();
        casa2 = new javax.swing.JLabel();
        casa3 = new javax.swing.JLabel();
        casa4 = new javax.swing.JLabel();
        casa5 = new javax.swing.JLabel();
        casa6 = new javax.swing.JLabel();
        casa7 = new javax.swing.JLabel();
        casa8 = new javax.swing.JLabel();
        sum0 = new javax.swing.JLabel();
        sum1 = new javax.swing.JLabel();
        sum2 = new javax.swing.JLabel();
        sum3 = new javax.swing.JLabel();
        sum4 = new javax.swing.JLabel();
        sum5 = new javax.swing.JLabel();
        sum6 = new javax.swing.JLabel();
        sum7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        casa0.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        casa0.setText("0");
        casa0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        casa0.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                casa0MousePressed(evt);
            }
        });

        casa1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        casa1.setText("0");
        casa1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        casa1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                casa1MousePressed(evt);
            }
        });

        casa2.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        casa2.setText("0");
        casa2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        casa2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                casa2MousePressed(evt);
            }
        });

        casa3.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        casa3.setText("0");
        casa3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        casa3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                casa3MousePressed(evt);
            }
        });

        casa4.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        casa4.setText("0");
        casa4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        casa4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                casa4MousePressed(evt);
            }
        });

        casa5.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        casa5.setText("0");
        casa5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        casa5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                casa5MousePressed(evt);
            }
        });

        casa6.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        casa6.setText("0");
        casa6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        casa6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                casa6MousePressed(evt);
            }
        });

        casa7.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        casa7.setText("0");
        casa7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        casa7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                casa7MousePressed(evt);
            }
        });

        casa8.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        casa8.setText("0");
        casa8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        casa8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                casa8MousePressed(evt);
            }
        });

        sum0.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        sum0.setForeground(new java.awt.Color(153, 0, 51));
        sum0.setText("0");

        sum1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        sum1.setForeground(new java.awt.Color(153, 0, 51));
        sum1.setText("0");

        sum2.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        sum2.setForeground(new java.awt.Color(153, 0, 51));
        sum2.setText("0");

        sum3.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        sum3.setForeground(new java.awt.Color(153, 0, 51));
        sum3.setText("0");

        sum4.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        sum4.setForeground(new java.awt.Color(153, 0, 51));
        sum4.setText("0");

        sum5.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        sum5.setForeground(new java.awt.Color(153, 0, 51));
        sum5.setText("0");

        sum6.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        sum6.setForeground(new java.awt.Color(153, 0, 51));
        sum6.setText("0");

        sum7.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        sum7.setForeground(new java.awt.Color(153, 0, 51));
        sum7.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(sum7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(casa3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(casa4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(casa5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sum1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(casa0, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(casa1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(casa2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sum0, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(casa6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(casa7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(casa8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sum2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sum3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sum4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sum5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sum6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(casa0, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(casa1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(casa2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sum0, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(casa3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(casa4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(casa5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sum1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(casa6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(casa7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(casa8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sum2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sum3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sum4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sum5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sum6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sum7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void casa0MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_casa0MousePressed
        // TODO add your handling code here:
        this.tela.move(0,0);
        casa0.setText(Integer.toString(this.tela.getBoard()[0][0]));
        this.tela.sumAll();
        this.tela.findWinner();
        updateSum();
        ganhador = this.tela.findWinner();
    }//GEN-LAST:event_casa0MousePressed

    private void casa1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_casa1MousePressed
        // TODO add your handling code here:
        this.tela.move(0,1);
        casa1.setText(Integer.toString(this.tela.getBoard()[0][1]));
        this.tela.sumAll();
        this.tela.findWinner();
        updateSum();
        ganhador = this.tela.findWinner();
    }//GEN-LAST:event_casa1MousePressed

    private void casa2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_casa2MousePressed
        // TODO add your handling code here:
        this.tela.move(0,2);
        casa2.setText(Integer.toString(this.tela.getBoard()[0][2]));
        this.tela.sumAll();
        this.tela.findWinner();
        updateSum();
        ganhador = this.tela.findWinner();
    }//GEN-LAST:event_casa2MousePressed

    private void casa3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_casa3MousePressed
        // TODO add your handling code here:
        this.tela.move(1,0);
        casa3.setText(Integer.toString(this.tela.getBoard()[1][0]));
        this.tela.sumAll();
        this.tela.findWinner();
        updateSum();
        ganhador = this.tela.findWinner();
    }//GEN-LAST:event_casa3MousePressed

    private void casa4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_casa4MousePressed
        // TODO add your handling code here:
        this.tela.move(1,1);
        casa4.setText(Integer.toString(this.tela.getBoard()[1][1]));
        this.tela.sumAll();
        this.tela.findWinner();
        updateSum();
        ganhador = this.tela.findWinner();
    }//GEN-LAST:event_casa4MousePressed

    private void casa5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_casa5MousePressed
        // TODO add your handling code here:
        this.tela.move(1,2);
        casa5.setText(Integer.toString(this.tela.getBoard()[1][2]));
        this.tela.sumAll();
        this.tela.findWinner();
        updateSum();
        ganhador = this.tela.findWinner();
    }//GEN-LAST:event_casa5MousePressed

    private void casa6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_casa6MousePressed
        // TODO add your handling code here:
        this.tela.move(2,0);
        casa6.setText(Integer.toString(this.tela.getBoard()[2][0]));
        this.tela.sumAll();
        this.tela.findWinner();
        updateSum();
        ganhador = this.tela.findWinner();
    }//GEN-LAST:event_casa6MousePressed

    private void casa7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_casa7MousePressed
        // TODO add your handling code here:
        this.tela.move(2,1);
        casa7.setText(Integer.toString(this.tela.getBoard()[2][1]));
        this.tela.sumAll();
        this.tela.findWinner();
        updateSum();
        ganhador = this.tela.findWinner();
    }//GEN-LAST:event_casa7MousePressed

    private void casa8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_casa8MousePressed
        // TODO add your handling code here:
        this.tela.move(2,2);
        casa8.setText(Integer.toString(this.tela.getBoard()[2][2]));
        this.tela.sumAll();
        this.tela.findWinner();
        updateSum();
        ganhador = this.tela.findWinner();
    }//GEN-LAST:event_casa8MousePressed

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
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel casa0;
    private javax.swing.JLabel casa1;
    private javax.swing.JLabel casa2;
    private javax.swing.JLabel casa3;
    private javax.swing.JLabel casa4;
    private javax.swing.JLabel casa5;
    private javax.swing.JLabel casa6;
    private javax.swing.JLabel casa7;
    private javax.swing.JLabel casa8;
    private javax.swing.JLabel sum0;
    private javax.swing.JLabel sum1;
    private javax.swing.JLabel sum2;
    private javax.swing.JLabel sum3;
    private javax.swing.JLabel sum4;
    private javax.swing.JLabel sum5;
    private javax.swing.JLabel sum6;
    private javax.swing.JLabel sum7;
    // End of variables declaration//GEN-END:variables
}
