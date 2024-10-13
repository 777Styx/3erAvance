package tableMVC;

import utils.PanelRound;

/**
 *
 * @author carlo
 */
public class View extends javax.swing.JFrame {

    private Controlador controlador;

    /**
     * Creates new form View
     */
    public View(Controlador controlador) {
        initComponents();
        this.controlador = controlador;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ventanaPrincipal = new javax.swing.JPanel();
        playerNickname1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        panelRound14 = new utils.PanelRound();
        btnCombinacion = new utils.Btn();
        panelRound1 = new utils.PanelRound();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tomarFichaBtn = new utils.Btn();
        contenedorFichas = new javax.swing.JPanel();
        panelRound13 = new utils.PanelRound();
        jLabel5 = new javax.swing.JLabel();
        panelRound21 = new utils.PanelRound();
        jLabel6 = new javax.swing.JLabel();
        panelRound22 = new utils.PanelRound();
        jLabel7 = new javax.swing.JLabel();
        panelRound23 = new utils.PanelRound();
        jLabel8 = new javax.swing.JLabel();
        panelRound24 = new utils.PanelRound();
        jLabel9 = new javax.swing.JLabel();
        panelRound25 = new utils.PanelRound();
        jLabel10 = new javax.swing.JLabel();
        panelRound26 = new utils.PanelRound();
        panelRound27 = new utils.PanelRound();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ventanaPrincipal.setBackground(new java.awt.Color(33, 142, 64));
        ventanaPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        playerNickname1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        playerNickname1.setForeground(new java.awt.Color(255, 255, 255));
        playerNickname1.setText("amos");
        ventanaPrincipal.add(playerNickname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 239, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TeLesheo");
        ventanaPrincipal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Wilber");
        ventanaPrincipal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(705, 241, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("hiiramsan");
        ventanaPrincipal.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, -1, -1));

        panelRound14.setBackground(new java.awt.Color(255, 255, 255));
        panelRound14.setRoundBottomLeft(10);
        panelRound14.setRoundBottomRight(10);
        panelRound14.setRoundTopLeft(10);
        panelRound14.setRoundTopRight(10);

        javax.swing.GroupLayout panelRound14Layout = new javax.swing.GroupLayout(panelRound14);
        panelRound14.setLayout(panelRound14Layout);
        panelRound14Layout.setHorizontalGroup(
            panelRound14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );
        panelRound14Layout.setVerticalGroup(
            panelRound14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        ventanaPrincipal.add(panelRound14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        btnCombinacion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCombinacion.setText("Hacer combinación");
        btnCombinacion.setRadius(10);
        btnCombinacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCombinacionActionPerformed(evt);
            }
        });
        ventanaPrincipal.add(btnCombinacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 430, 130, 30));

        panelRound1.setRoundBottomLeft(10);
        panelRound1.setRoundBottomRight(10);
        panelRound1.setRoundTopLeft(10);
        panelRound1.setRoundTopRight(10);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Tablero");

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(jLabel11)
                .addContainerGap(186, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(174, Short.MAX_VALUE))
        );

        ventanaPrincipal.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 370, 200));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Turno: hiiramsan");
        ventanaPrincipal.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, -1, -1));

        tomarFichaBtn.setBackground(new java.awt.Color(102, 0, 0));
        tomarFichaBtn.setForeground(new java.awt.Color(255, 255, 255));
        tomarFichaBtn.setText("Tomar ficha");
        tomarFichaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tomarFichaBtnActionPerformed(evt);
            }
        });
        ventanaPrincipal.add(tomarFichaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 100, 40));

        contenedorFichas.setBackground(new java.awt.Color(33, 142, 64));
        contenedorFichas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        panelRound13.setBackground(new java.awt.Color(0, 51, 204));
        panelRound13.setRoundBottomLeft(10);
        panelRound13.setRoundBottomRight(10);
        panelRound13.setRoundTopLeft(10);
        panelRound13.setRoundTopRight(10);
        panelRound13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelRound13MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("5");

        javax.swing.GroupLayout panelRound13Layout = new javax.swing.GroupLayout(panelRound13);
        panelRound13.setLayout(panelRound13Layout);
        panelRound13Layout.setHorizontalGroup(
            panelRound13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        panelRound13Layout.setVerticalGroup(
            panelRound13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound13Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        panelRound21.setBackground(new java.awt.Color(51, 255, 51));
        panelRound21.setRoundBottomLeft(10);
        panelRound21.setRoundBottomRight(10);
        panelRound21.setRoundTopLeft(10);
        panelRound21.setRoundTopRight(10);
        panelRound21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelRound21MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("2");

        javax.swing.GroupLayout panelRound21Layout = new javax.swing.GroupLayout(panelRound21);
        panelRound21.setLayout(panelRound21Layout);
        panelRound21Layout.setHorizontalGroup(
            panelRound21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        panelRound21Layout.setVerticalGroup(
            panelRound21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound21Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        panelRound22.setBackground(new java.awt.Color(255, 0, 0));
        panelRound22.setRoundBottomLeft(10);
        panelRound22.setRoundBottomRight(10);
        panelRound22.setRoundTopLeft(10);
        panelRound22.setRoundTopRight(10);
        panelRound22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelRound22MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("5");

        javax.swing.GroupLayout panelRound22Layout = new javax.swing.GroupLayout(panelRound22);
        panelRound22.setLayout(panelRound22Layout);
        panelRound22Layout.setHorizontalGroup(
            panelRound22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        panelRound22Layout.setVerticalGroup(
            panelRound22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound22Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        panelRound23.setBackground(new java.awt.Color(255, 0, 0));
        panelRound23.setRoundBottomLeft(10);
        panelRound23.setRoundBottomRight(10);
        panelRound23.setRoundTopLeft(10);
        panelRound23.setRoundTopRight(10);
        panelRound23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelRound23MouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("6");

        javax.swing.GroupLayout panelRound23Layout = new javax.swing.GroupLayout(panelRound23);
        panelRound23.setLayout(panelRound23Layout);
        panelRound23Layout.setHorizontalGroup(
            panelRound23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        panelRound23Layout.setVerticalGroup(
            panelRound23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound23Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        panelRound24.setBackground(new java.awt.Color(255, 204, 0));
        panelRound24.setRoundBottomLeft(10);
        panelRound24.setRoundBottomRight(10);
        panelRound24.setRoundTopLeft(10);
        panelRound24.setRoundTopRight(10);
        panelRound24.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                panelRound24KeyPressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("8");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelRound24Layout = new javax.swing.GroupLayout(panelRound24);
        panelRound24.setLayout(panelRound24Layout);
        panelRound24Layout.setHorizontalGroup(
            panelRound24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        panelRound24Layout.setVerticalGroup(
            panelRound24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound24Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        panelRound25.setBackground(new java.awt.Color(0, 51, 204));
        panelRound25.setRoundBottomLeft(10);
        panelRound25.setRoundBottomRight(10);
        panelRound25.setRoundTopLeft(10);
        panelRound25.setRoundTopRight(10);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("8");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelRound25Layout = new javax.swing.GroupLayout(panelRound25);
        panelRound25.setLayout(panelRound25Layout);
        panelRound25Layout.setHorizontalGroup(
            panelRound25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(11, Short.MAX_VALUE))
        );
        panelRound25Layout.setVerticalGroup(
            panelRound25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound25Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout contenedorFichasLayout = new javax.swing.GroupLayout(contenedorFichas);
        contenedorFichas.setLayout(contenedorFichasLayout);
        contenedorFichasLayout.setHorizontalGroup(
            contenedorFichasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorFichasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRound13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(panelRound21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(panelRound22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(panelRound23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(panelRound24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(panelRound25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contenedorFichasLayout.setVerticalGroup(
            contenedorFichasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorFichasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenedorFichasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRound13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRound21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRound22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRound23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRound24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRound25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        ventanaPrincipal.add(contenedorFichas, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, 190, 60));

        panelRound26.setBackground(new java.awt.Color(255, 255, 255));
        panelRound26.setRoundBottomLeft(10);
        panelRound26.setRoundBottomRight(10);
        panelRound26.setRoundTopLeft(10);
        panelRound26.setRoundTopRight(10);

        javax.swing.GroupLayout panelRound26Layout = new javax.swing.GroupLayout(panelRound26);
        panelRound26.setLayout(panelRound26Layout);
        panelRound26Layout.setHorizontalGroup(
            panelRound26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );
        panelRound26Layout.setVerticalGroup(
            panelRound26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        ventanaPrincipal.add(panelRound26, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, -1, -1));

        panelRound27.setBackground(new java.awt.Color(255, 255, 255));
        panelRound27.setRoundBottomLeft(10);
        panelRound27.setRoundBottomRight(10);
        panelRound27.setRoundTopLeft(10);
        panelRound27.setRoundTopRight(10);

        javax.swing.GroupLayout panelRound27Layout = new javax.swing.GroupLayout(panelRound27);
        panelRound27.setLayout(panelRound27Layout);
        panelRound27Layout.setHorizontalGroup(
            panelRound27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );
        panelRound27Layout.setVerticalGroup(
            panelRound27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );

        ventanaPrincipal.add(panelRound27, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 280, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ventanaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 827, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ventanaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCombinacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCombinacionActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnCombinacionActionPerformed

    private void tomarFichaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tomarFichaBtnActionPerformed
        // hola?
        // controlDeck controlChip = new controlDeck();
        // controlChip.generateChip();
        controlador.tomarFicha();

    }//GEN-LAST:event_tomarFichaBtnActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        System.out.println("Selecciono carta ");
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        System.out.println("Selecciono carta");
    }//GEN-LAST:event_jLabel10MouseClicked

    private void panelRound13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRound13MouseClicked
        // TODO add your handling code here:
        System.out.println("Selecciono carta");
    }//GEN-LAST:event_panelRound13MouseClicked

    private void panelRound21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRound21MouseClicked
        // TODO add your handling code here:
        System.out.println("Selecciono carta");
    }//GEN-LAST:event_panelRound21MouseClicked

    private void panelRound22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRound22MouseClicked
        // TODO add your handling code here:
        System.out.println("Selecciono carta");
    }//GEN-LAST:event_panelRound22MouseClicked

    private void panelRound23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelRound23MouseClicked
        // TODO add your handling code here:
        System.out.println("Selecciono carta");
    }//GEN-LAST:event_panelRound23MouseClicked

    private void panelRound24KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panelRound24KeyPressed
        // TODO add your handling code here:
        System.out.println("Selecciono carta");
    }//GEN-LAST:event_panelRound24KeyPressed

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
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //       new View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private utils.Btn btnCombinacion;
    private javax.swing.JPanel contenedorFichas;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private utils.PanelRound panelRound1;
    private utils.PanelRound panelRound13;
    private utils.PanelRound panelRound14;
    private utils.PanelRound panelRound21;
    private utils.PanelRound panelRound22;
    private utils.PanelRound panelRound23;
    private utils.PanelRound panelRound24;
    private utils.PanelRound panelRound25;
    private utils.PanelRound panelRound26;
    private utils.PanelRound panelRound27;
    private javax.swing.JLabel playerNickname1;
    private utils.Btn tomarFichaBtn;
    private javax.swing.JPanel ventanaPrincipal;
    // End of variables declaration//GEN-END:variables
}
