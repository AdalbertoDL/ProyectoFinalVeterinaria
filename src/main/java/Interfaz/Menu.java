package Interfaz;

import java.awt.CardLayout;


public class Menu extends javax.swing.JFrame {

    
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        pnlContenedor.setLayout(new CardLayout());
        pnlContenedor.add(pnlMenu, "menu");
        pnlContenedor.add(pnlNuevoCliente, "nuevoCliente");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContenedor = new javax.swing.JPanel();
        pnlMenu = new javax.swing.JPanel();
        tituloVeterinaria1 = new javax.swing.JLabel();
        btnNuevoCliente1 = new javax.swing.JToggleButton();
        btnVerClientes1 = new javax.swing.JButton();
        btnAgendarCita1 = new javax.swing.JButton();
        btnReportePagos1 = new javax.swing.JButton();
        btnReporteCitas1 = new javax.swing.JButton();
        btnReporteCliente1 = new javax.swing.JButton();
        pnlNuevoCliente = new javax.swing.JPanel();
        lblTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        lblCorreo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblDui = new javax.swing.JLabel();
        txtDui = new javax.swing.JTextField();
        btnAgregarCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Veterinaria");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        pnlContenedor.setLayout(new java.awt.CardLayout());

        tituloVeterinaria1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloVeterinaria1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloVeterinaria1.setText("Veterinaria UES");

        btnNuevoCliente1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnNuevoCliente1.setText("Añadir cliente");
        btnNuevoCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoCliente1ActionPerformed(evt);
            }
        });

        btnVerClientes1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVerClientes1.setText("Ver Clientes");
        btnVerClientes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerClientes1ActionPerformed(evt);
            }
        });

        btnAgendarCita1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAgendarCita1.setText("Agendar Cita");

        btnReportePagos1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnReportePagos1.setText("Reporte de pagos");

        btnReporteCitas1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnReporteCitas1.setText("Reporte de citas");

        btnReporteCliente1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnReporteCliente1.setText("Reporte de cliente");

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloVeterinaria1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevoCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerClientes1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgendarCita1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReportePagos1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReporteCitas1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReporteCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(173, Short.MAX_VALUE))
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloVeterinaria1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(btnNuevoCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnVerClientes1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAgendarCita1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReportePagos1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReporteCitas1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReporteCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        pnlContenedor.add(pnlMenu, "card2");

        lblTelefono.setText("Telefono");

        lblCorreo.setText("Correo Electronico");

        lblNombre.setText("Nombre");

        lblDui.setText("DUI");

        btnAgregarCliente.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnAgregarCliente.setText("Agregar");
        btnAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlNuevoClienteLayout = new javax.swing.GroupLayout(pnlNuevoCliente);
        pnlNuevoCliente.setLayout(pnlNuevoClienteLayout);
        pnlNuevoClienteLayout.setHorizontalGroup(
            pnlNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNuevoClienteLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(pnlNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDui, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombre)
                    .addComponent(txtDui)
                    .addComponent(txtTelefono)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNuevoClienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        pnlNuevoClienteLayout.setVerticalGroup(
            pnlNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNuevoClienteLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(pnlNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDui)
                    .addComponent(txtDui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefono)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreo)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 298, Short.MAX_VALUE)
                .addComponent(btnAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pnlContenedor.add(pnlNuevoCliente, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnlContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnlContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoCliente1ActionPerformed
        CardLayout cl = (CardLayout) pnlContenedor.getLayout();
        cl.show(pnlContenedor, "nuevoCliente");
    }//GEN-LAST:event_btnNuevoCliente1ActionPerformed

    private void btnVerClientes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerClientes1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVerClientes1ActionPerformed

    private void btnAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClienteActionPerformed
        CardLayout cl = (CardLayout) pnlContenedor.getLayout();
        cl.show(pnlContenedor, "menu");
    }//GEN-LAST:event_btnAgregarClienteActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgendarCita1;
    private javax.swing.JButton btnAgregarCliente;
    private javax.swing.JToggleButton btnNuevoCliente1;
    private javax.swing.JButton btnReporteCitas1;
    private javax.swing.JButton btnReporteCliente1;
    private javax.swing.JButton btnReportePagos1;
    private javax.swing.JButton btnVerClientes1;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblDui;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JPanel pnlContenedor;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlNuevoCliente;
    private javax.swing.JLabel tituloVeterinaria1;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDui;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

}
