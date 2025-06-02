package Interfaz;

import java.awt.CardLayout;


public class Menu extends javax.swing.JFrame {

    
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        pnlContenedor.setLayout(new CardLayout());
        pnlContenedor.add(pnlMenu, "menu");
        pnlContenedor.add(pnlNuevoCliente, "nuevoCliente");
        pnlContenedor.add(pnlAgendarCita, "AgendarCita");
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
        pnlAgendarCita = new javax.swing.JPanel();
        lblAgendarCita = new javax.swing.JLabel();
        lblCalendario = new javax.swing.JLabel();
        jclCalendario = new com.toedter.calendar.JCalendar();
        lblHora = new javax.swing.JLabel();
        cbxHora = new javax.swing.JComboBox<>();
        lblCliente = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        lblMascota = new javax.swing.JLabel();
        txtMascota = new javax.swing.JTextField();
        btnAgendar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        lblMotivodeconsulta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Veterinaria");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        pnlContenedor.setMaximumSize(new java.awt.Dimension(960, 565));
        pnlContenedor.setLayout(new java.awt.CardLayout());

        pnlMenu.setPreferredSize(new java.awt.Dimension(960, 565));

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
        btnAgendarCita1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendarCita1ActionPerformed(evt);
            }
        });

        btnReportePagos1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnReportePagos1.setText("Reporte de pagos");

        btnReporteCitas1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnReporteCitas1.setText("Reporte de citas");
        btnReporteCitas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteCitas1ActionPerformed(evt);
            }
        });

        btnReporteCliente1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnReporteCliente1.setText("Reporte de cliente");
        btnReporteCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteCliente1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuLayout.createSequentialGroup()
                .addContainerGap(560, Short.MAX_VALUE)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(tituloVeterinaria1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevoCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerClientes1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgendarCita1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReportePagos1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReporteCitas1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReporteCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(371, 371, 371))
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(tituloVeterinaria1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(btnNuevoCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVerClientes1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgendarCita1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReportePagos1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReporteCitas1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReporteCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pnlContenedor.add(pnlMenu, "cardMenu");

        pnlNuevoCliente.setPreferredSize(new java.awt.Dimension(960, 565));

        lblTelefono.setText("Telefono");

        lblCorreo.setText("Correo Electronico");

        lblNombre.setText("Nombre");

        lblDui.setText("DUI");

        btnAgregarCliente.setFont(new java.awt.Font("sansserif", 0, 15)); // NOI18N
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
                .addGap(23, 23, 23)
                .addGroup(pnlNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlNuevoClienteLayout.createSequentialGroup()
                        .addComponent(lblCorreo)
                        .addGap(18, 18, 18)
                        .addComponent(txtCorreo))
                    .addGroup(pnlNuevoClienteLayout.createSequentialGroup()
                        .addComponent(lblNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 247, Short.MAX_VALUE)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlNuevoClienteLayout.createSequentialGroup()
                        .addGroup(pnlNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlNuevoClienteLayout.createSequentialGroup()
                                .addComponent(lblTelefono)
                                .addGap(18, 18, 18)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlNuevoClienteLayout.createSequentialGroup()
                                .addComponent(lblDui)
                                .addGap(18, 18, 18)
                                .addComponent(txtDui)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(342, 342, 342))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNuevoClienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );

        pnlNuevoClienteLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblCorreo, lblDui, lblTelefono});

        pnlNuevoClienteLayout.setVerticalGroup(
            pnlNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNuevoClienteLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(pnlNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 375, Short.MAX_VALUE)
                .addComponent(btnAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        pnlContenedor.add(pnlNuevoCliente, "cardNuevoCLiente");

        pnlAgendarCita.setPreferredSize(new java.awt.Dimension(960, 565));

        lblAgendarCita.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblAgendarCita.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgendarCita.setText("Angendar Cita");

        lblCalendario.setText("Fecha");

        lblHora.setText("Hora");

        cbxHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8.00 AM", "8:30 AM", "9:00 AM", "9:30 AM", "10:00 AM", "10:30 AM", "11:00 AM", "11:30 AM", "1:00 PM", "1:30 PM", "2:00 PM", "2:30 PM", "3:00 PM", "3:30 PM", "4:00 PM", "4:30 PM", " ", " ", " " }));

        lblCliente.setText("Cliente");

        lblMascota.setText("Nombre de la Mascota");

        btnAgendar.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btnAgendar.setText("Agendar");
        btnAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        lblMotivodeconsulta.setText("Motivo de consulta");

        javax.swing.GroupLayout pnlAgendarCitaLayout = new javax.swing.GroupLayout(pnlAgendarCita);
        pnlAgendarCita.setLayout(pnlAgendarCitaLayout);
        pnlAgendarCitaLayout.setHorizontalGroup(
            pnlAgendarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAgendarCitaLayout.createSequentialGroup()
                .addGroup(pnlAgendarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAgendarCitaLayout.createSequentialGroup()
                        .addGroup(pnlAgendarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlAgendarCitaLayout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addGroup(pnlAgendarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblHora)
                                    .addComponent(lblCliente)))
                            .addGroup(pnlAgendarCitaLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblMascota)))
                        .addGap(26, 26, 26)
                        .addGroup(pnlAgendarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlAgendarCitaLayout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(pnlAgendarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbxHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAgendarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlAgendarCitaLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jclCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlAgendarCitaLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(lblCalendario))
                    .addGroup(pnlAgendarCitaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblMascota)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        pnlAgendarCitaLayout.setVerticalGroup(
            pnlAgendarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAgendarCitaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAgendarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlAgendarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAgendarCitaLayout.createSequentialGroup()
                        .addComponent(jclCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlAgendarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHora)
                            .addComponent(cbxHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAgendarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCalendario)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlAgendarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMascota)
                    .addComponent(txtMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(lblMotivodeconsulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(pnlAgendarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgendar)
                    .addComponent(btnCancelar))
                .addGap(59, 59, 59))
        );

        pnlContenedor.add(pnlAgendarCita, "card4");

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
        CardLayout cl = (CardLayout) pnlContenedor.getLayout();
        cl.show(pnlContenedor, "VerClientes");
    }//GEN-LAST:event_btnVerClientes1ActionPerformed

    private void btnAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClienteActionPerformed
        CardLayout cl = (CardLayout) pnlContenedor.getLayout();
        cl.show(pnlContenedor, "menu");
    }//GEN-LAST:event_btnAgregarClienteActionPerformed

    private void btnAgendarCita1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendarCita1ActionPerformed
        CardLayout cl = (CardLayout) pnlContenedor.getLayout();
        cl.show(pnlContenedor, "agendarCita");
    }//GEN-LAST:event_btnAgendarCita1ActionPerformed

    private void btnAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendarActionPerformed
        CardLayout cl = (CardLayout) pnlContenedor.getLayout();
        cl.show(pnlContenedor, "menu");
    }//GEN-LAST:event_btnAgendarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        CardLayout cl = (CardLayout) pnlContenedor.getLayout();
        cl.show(pnlContenedor, "menu");
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnVolverReporteCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverReporteCitasActionPerformed
        CardLayout cl = (CardLayout) pnlContenedor.getLayout();
        cl.show(pnlContenedor, "menu");
    }//GEN-LAST:event_btnVolverReporteCitasActionPerformed

    private void btnReporteCitas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteCitas1ActionPerformed
        CardLayout cl = (CardLayout) pnlContenedor.getLayout();
        cl.show(pnlContenedor, "reporteCitas");
    }//GEN-LAST:event_btnReporteCitas1ActionPerformed

    private void btnReporteCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteCliente1ActionPerformed
        CardLayout cl = (CardLayout) pnlContenedor.getLayout();
        cl.show(pnlContenedor, "reporteCliente");
    }//GEN-LAST:event_btnReporteCliente1ActionPerformed

    private void btnCancelarReporteClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarReporteClienteActionPerformed
        CardLayout cl = (CardLayout) pnlContenedor.getLayout();
        cl.show(pnlContenedor, "menu");
    }//GEN-LAST:event_btnCancelarReporteClienteActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgendar;
    private javax.swing.JButton btnAgendarCita1;
    private javax.swing.JButton btnAgregarCliente;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelarReporteCliente;
    private javax.swing.JToggleButton btnNuevoCliente1;
    private javax.swing.JButton btnRefrescar;
    private javax.swing.JButton btnReporteCitas1;
    private javax.swing.JButton btnReporteCliente1;
    private javax.swing.JButton btnReportePagos1;
    private javax.swing.JButton btnVerClientes1;
    private javax.swing.JButton btnVolverReporteCitas;
    private javax.swing.JComboBox<String> cbxHora;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private com.toedter.calendar.JCalendar jclCalendario;
    private javax.swing.JLabel jlbBuscar;
    private javax.swing.JLabel jlbVerClientes;
    private javax.swing.JTable jtVerClientes;
    private javax.swing.JLabel lblAgendarCita;
    private javax.swing.JLabel lblBuscadorReporteCliente;
    private javax.swing.JLabel lblBuscarPor;
    private javax.swing.JLabel lblCalendario;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblDui;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblMascota;
    private javax.swing.JLabel lblMotivodeconsulta;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblReporteCliente;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTituloCita;
    private javax.swing.JPanel pnlAgendarCita;
    private javax.swing.JPanel pnlContenedor;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlNuevoCliente;
    private javax.swing.JLabel tituloVeterinaria1;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDui;
    private javax.swing.JTextField txtMascota;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextArea txtaReporteCliente;
    // End of variables declaration//GEN-END:variables

}
