package Interfaz;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloVeterinaria = new javax.swing.JLabel();
        btnNuevoCliente = new javax.swing.JToggleButton();
        btnVerClientes = new javax.swing.JButton();
        btnAgendarCita = new javax.swing.JButton();
        btnReportePagos = new javax.swing.JButton();
        btnReporteCitas = new javax.swing.JButton();
        btnReporteCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 550));
        setResizable(false);

        tituloVeterinaria.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tituloVeterinaria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloVeterinaria.setText("Veterinaria UES");

        btnNuevoCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnNuevoCliente.setText("Añadir cliente");

        btnVerClientes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnVerClientes.setText("Ver Clientes");
        btnVerClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerClientesActionPerformed(evt);
            }
        });

        btnAgendarCita.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAgendarCita.setText("Agendar Cita");

        btnReportePagos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnReportePagos.setText("Reporte de pagos");

        btnReporteCitas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnReporteCitas.setText("Reporte de citas");

        btnReporteCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnReporteCliente.setText("Reporte de cliente");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tituloVeterinaria, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgendarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVerClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 155, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnReporteCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReporteCitas, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReportePagos, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloVeterinaria, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVerClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgendarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReportePagos, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReporteCitas, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReporteCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        btnNuevoCliente.getAccessibleContext().setAccessibleName("nuevoCliente");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerClientesActionPerformed
        
    }//GEN-LAST:event_btnVerClientesActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgendarCita;
    private javax.swing.JToggleButton btnNuevoCliente;
    private javax.swing.JButton btnReporteCitas;
    private javax.swing.JButton btnReporteCliente;
    private javax.swing.JButton btnReportePagos;
    private javax.swing.JButton btnVerClientes;
    private javax.swing.JLabel tituloVeterinaria;
    // End of variables declaration//GEN-END:variables
}
