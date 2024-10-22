package unsirseCrearMVC;

import java.awt.Color;
import java.util.Observable;
import java.util.Observer;
import registroMVC.ControladorRegistro;
import registroMVC.ModeloRegistro;
import registroMVC.ViewRegistro;

/**
 *
 * @author julli
 */
public class VistaUnirse extends javax.swing.JFrame implements Observer {

    private ControladorUnirse controlador;

    /**
     * Creates new form VistaUnirse
     */
    public VistaUnirse(ControladorUnirse controlador) {
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

//        ControladorUnirse controladorUnirse = ControladorUnirse.getInstancia();
//        controladorUnirse.unirseAPartidaView("Carlitos");
//        this.dispose();
        System.out.println("control");
        controlador.crearJuego();
    }//GEN-LAST:event_btnStartActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStart;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("hola");

        if (o instanceof ModeloUnirse) {  // Asegura que o es ModeloUnirse
            ModeloUnirse modeloUnirse = (ModeloUnirse) o;

            if (modeloUnirse.getJuego() != null) {
                ModeloRegistro modeloRegistro = new ModeloRegistro();
                ControladorRegistro controlRegistro = new ControladorRegistro(modeloRegistro);
                ViewRegistro viewRegistro = new ViewRegistro(controlRegistro);

                java.awt.EventQueue.invokeLater(    () -> {
                    viewRegistro.setVisible(true);
                });
            }
        }
    }

}
