/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package unsirseCrearMVC;

import java.awt.Color;
import registroMVC.ControladorRegistro;
import registroMVC.ViewRegistro;

/**
 *
 * @author julli
 */
public class VistaUnirse extends javax.swing.JFrame {

    /**
     * Creates new form VistaUnirse
     */
    public VistaUnirse() {
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

        btnStart = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnStart.setText("Start");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(194, Short.MAX_VALUE)
                .addComponent(btnStart)
                .addGap(134, 134, 134))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(224, Short.MAX_VALUE)
                .addComponent(btnStart)
                .addGap(53, 53, 53))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        // TODO add your handling code here:
        // Obtener la instancia del controlador (Singleton)
//        ControladorRegistro controlador = ControladorRegistro.getInsatnce();
//        ViewRegistro vistaRegistro = new ViewRegistro(controlador);  // Asegúrate de que "View" sea tu clase de vista correcta
//        controlador.setView(vistaRegistro);  // Asignar la vista al controlador
//
//        // Mostrar la vista asociada
//        controlador.mostrarVista();
        ControladorUnirse controladorUnirse = ControladorUnirse.getInstancia();
        controladorUnirse.unirseAPartidaView("Carlitos");
        this.dispose();
//        // Datos que se pasan al controlador, estos pueden ser capturados de la vista (por ejemplo, text fields)
//        String nombreJugador = "NombreEjemplo";  // Aquí pondrías la forma de obtener el nombre del jugador
//        String avatarJugador = "AvatarEjemplo";  // Y el avatar
//        Color color1 = Color.RED;                // Y los colores que el jugador elija
//        Color color2 = Color.BLUE;
//        Color color3 = Color.GREEN;
//        Color color4 = Color.YELLOW;
//
//        // Llamar al método del controlador para crear un jugador con los datos obtenidos
//        controlador.crearJugador(nombreJugador, avatarJugador, color1, color2, color3, color4);
//
//        // Aquí puedes realizar otras acciones, como navegar a otra vista, etc.
//        System.out.println("Jugador creado y acción realizada desde el botón Start.");
    }//GEN-LAST:event_btnStartActionPerformed

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
            java.util.logging.Logger.getLogger(VistaUnirse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaUnirse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaUnirse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaUnirse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaUnirse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStart;
    // End of variables declaration//GEN-END:variables
}
