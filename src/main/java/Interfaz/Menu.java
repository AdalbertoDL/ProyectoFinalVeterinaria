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
        pnlContenedor.add(pnlVerClientes, "VerClientes");
        pnlContenedor.add(pnlReportePagos, "ReporteDePago");
        pnlContenedor.add(pnlReporteCitas, "ReporteCitas");
        pnlContenedor.add(pnlReporteCliente, "ReporteCliente");
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
        lblNuevoCliente = new javax.swing.JLabel();
        lblDatosMascota = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblAñadirMascotas = new javax.swing.JTable();
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
        txtaMotivoConsulta = new javax.swing.JTextArea();
        lblMotivodeconsulta = new javax.swing.JLabel();
        pnlVerClientes = new javax.swing.JPanel();
        lblVerClientes = new javax.swing.JLabel();
        jlbBuscar = new javax.swing.JLabel();
        txtBuscarCliente = new javax.swing.JTextField();
        btnBuscarCliente = new javax.swing.JButton();
        btnRefrescar = new javax.swing.JButton();
        jListadoclientes = new javax.swing.JScrollPane();
        tblVerClientes = new javax.swing.JTable();
        btnSalirListado = new javax.swing.JButton();
        btnVolverVerClientes = new javax.swing.JButton();
        pnlReportePagos = new javax.swing.JPanel();
        jlbReporteDePago = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTablaDeReporteDeReporte = new javax.swing.JTable();
        jlbBuscarReporteDePago = new javax.swing.JLabel();
        txtNombreReporteDePago = new javax.swing.JTextField();
        btnBuscarReporteDePago = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnVolverReportePagos = new javax.swing.JToggleButton();
        pnlReporteCitas = new javax.swing.JPanel();
        lblReporteCitas = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblReporteCitas = new javax.swing.JTable();
        btnVolverReporteCitas = new javax.swing.JButton();
        pnlReporteCliente = new javax.swing.JPanel();
        lblReporteCliente = new javax.swing.JLabel();
        lblBuscarPor = new javax.swing.JLabel();
        cmbBuscarPor = new javax.swing.JComboBox<>();
        txtBuscarReporteCliente = new javax.swing.JTextField();
        btnBuscarReporteCliente = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtaReporteCliente = new javax.swing.JTextArea();
        btnVolverReporteCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Veterinaria");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

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
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(365, 365, 365)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnReporteCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevoCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloVeterinaria1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerClientes1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgendarCita1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReportePagos1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReporteCitas1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(391, Short.MAX_VALUE))
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloVeterinaria1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnNuevoCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVerClientes1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAgendarCita1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReportePagos1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReporteCitas1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReporteCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pnlContenedor.add(pnlMenu, "card2");

        pnlNuevoCliente.setPreferredSize(new java.awt.Dimension(960, 565));

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

        lblNuevoCliente.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblNuevoCliente.setText("Añadir nuevo cliente");

        lblDatosMascota.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblDatosMascota.setText("Datos de mascota");

        tblAñadirMascotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane6.setViewportView(tblAñadirMascotas);

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
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(pnlNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNuevoClienteLayout.createSequentialGroup()
                        .addComponent(lblNuevoCliente)
                        .addGap(342, 342, 342))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNuevoClienteLayout.createSequentialGroup()
                        .addComponent(lblDatosMascota)
                        .addGap(404, 404, 404))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNuevoClienteLayout.createSequentialGroup()
                        .addComponent(btnAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNuevoClienteLayout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 855, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))))
        );
        pnlNuevoClienteLayout.setVerticalGroup(
            pnlNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNuevoClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNuevoCliente)
                .addGap(33, 33, 33)
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
                .addGap(27, 27, 27)
                .addComponent(lblDatosMascota)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pnlContenedor.add(pnlNuevoCliente, "card2");

        pnlAgendarCita.setPreferredSize(new java.awt.Dimension(960, 565));

        lblAgendarCita.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblAgendarCita.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgendarCita.setText("Angendar Cita");

        lblCalendario.setText("Fecha");

        lblHora.setText("Hora");

        cbxHora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8.00 AM", "8:30 AM", "9:00 AM", "9:30 AM", "10:00 AM", "10:30 AM", "11:00 AM", "11:30 AM", "1:00 PM", "1:30 PM", "2:00 PM", "2:30 PM", "3:00 PM", "3:30 PM", "4:00 PM", "4:30 PM", " ", " ", " " }));

        lblCliente.setText("Cliente");

        lblMascota.setText("Nombre de la Mascota");

        btnAgendar.setText("Agendar");
        btnAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtaMotivoConsulta.setColumns(20);
        txtaMotivoConsulta.setRows(5);
        jScrollPane1.setViewportView(txtaMotivoConsulta);

        lblMotivodeconsulta.setText("Motivo de consulta");

        javax.swing.GroupLayout pnlAgendarCitaLayout = new javax.swing.GroupLayout(pnlAgendarCita);
        pnlAgendarCita.setLayout(pnlAgendarCitaLayout);
        pnlAgendarCitaLayout.setHorizontalGroup(
            pnlAgendarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAgendarCitaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addGap(139, 139, 139))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAgendarCitaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAgendar)
                .addGap(26, 26, 26))
            .addGroup(pnlAgendarCitaLayout.createSequentialGroup()
                .addGroup(pnlAgendarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlAgendarCitaLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(pnlAgendarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMotivodeconsulta)
                            .addGroup(pnlAgendarCitaLayout.createSequentialGroup()
                                .addComponent(lblCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addGroup(pnlAgendarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jclCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAgendarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlAgendarCitaLayout.createSequentialGroup()
                                .addGroup(pnlAgendarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblHora, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlAgendarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(pnlAgendarCitaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblMascota)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(557, Short.MAX_VALUE))
        );
        pnlAgendarCitaLayout.setVerticalGroup(
            pnlAgendarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAgendarCitaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAgendarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlAgendarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jclCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCalendario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAgendarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHora)
                    .addComponent(cbxHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(pnlAgendarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCliente)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAgendarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMascota))
                .addGap(18, 18, 18)
                .addComponent(lblMotivodeconsulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(pnlAgendarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgendar)
                    .addComponent(btnCancelar))
                .addGap(59, 59, 59))
        );

        pnlContenedor.add(pnlAgendarCita, "card4");

        pnlVerClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlVerClientes.setPreferredSize(new java.awt.Dimension(960, 565));

        lblVerClientes.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblVerClientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblVerClientes.setText("Ver Clientes");
        lblVerClientes.setToolTipText("");
        lblVerClientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jlbBuscar.setText("Buscar:");

        btnBuscarCliente.setText("Buscar");

        btnRefrescar.setText("Refrescar");

        tblVerClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "DUI", "Telefono", "Correo electronico"
            }
        ));
        jListadoclientes.setViewportView(tblVerClientes);

        btnSalirListado.setText("Salir");

        btnVolverVerClientes.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btnVolverVerClientes.setText("Volver");

        javax.swing.GroupLayout pnlVerClientesLayout = new javax.swing.GroupLayout(pnlVerClientes);
        pnlVerClientes.setLayout(pnlVerClientesLayout);
        pnlVerClientesLayout.setHorizontalGroup(
            pnlVerClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVerClientesLayout.createSequentialGroup()
                .addGroup(pnlVerClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlVerClientesLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(pnlVerClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlVerClientesLayout.createSequentialGroup()
                                .addComponent(btnSalirListado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRefrescar))
                            .addGroup(pnlVerClientesLayout.createSequentialGroup()
                                .addComponent(jlbBuscar)
                                .addGap(18, 18, 18)
                                .addComponent(txtBuscarCliente)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscarCliente)
                                .addGap(394, 394, 394))))
                    .addGroup(pnlVerClientesLayout.createSequentialGroup()
                        .addGap(400, 400, 400)
                        .addComponent(lblVerClientes)))
                .addGap(67, 67, 67))
            .addGroup(pnlVerClientesLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(pnlVerClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnVolverVerClientes)
                    .addComponent(jListadoclientes, javax.swing.GroupLayout.PREFERRED_SIZE, 851, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        pnlVerClientesLayout.setVerticalGroup(
            pnlVerClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVerClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblVerClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(pnlVerClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbBuscar)
                    .addComponent(txtBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCliente))
                .addGap(18, 18, 18)
                .addComponent(jListadoclientes, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVolverVerClientes)
                .addGap(54, 54, 54)
                .addGroup(pnlVerClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRefrescar)
                    .addComponent(btnSalirListado))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlContenedor.add(pnlVerClientes, "card5");

        pnlReportePagos.setPreferredSize(new java.awt.Dimension(960, 565));

        jlbReporteDePago.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jlbReporteDePago.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbReporteDePago.setText("Reporte de Pagos");

        tblTablaDeReporteDeReporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Cliente", "Mascota", "Monto "
            }
        ));
        jScrollPane2.setViewportView(tblTablaDeReporteDeReporte);

        jlbBuscarReporteDePago.setText("Buscar");

        btnBuscarReporteDePago.setText("Buscar");

        btnActualizar.setText("Actualizar");

        btnSalir.setText("Salir");

        btnVolverReportePagos.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btnVolverReportePagos.setText("Volver");

        javax.swing.GroupLayout pnlReportePagosLayout = new javax.swing.GroupLayout(pnlReportePagos);
        pnlReportePagos.setLayout(pnlReportePagosLayout);
        pnlReportePagosLayout.setHorizontalGroup(
            pnlReportePagosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlReportePagosLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(btnActualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(75, 75, 75))
            .addGroup(pnlReportePagosLayout.createSequentialGroup()
                .addGroup(pnlReportePagosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnVolverReportePagos)
                    .addGroup(pnlReportePagosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlReportePagosLayout.createSequentialGroup()
                            .addGap(64, 64, 64)
                            .addComponent(jlbBuscarReporteDePago, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtNombreReporteDePago, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnBuscarReporteDePago))
                        .addGroup(pnlReportePagosLayout.createSequentialGroup()
                            .addGap(353, 353, 353)
                            .addComponent(jlbReporteDePago, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnlReportePagosLayout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 908, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        pnlReportePagosLayout.setVerticalGroup(
            pnlReportePagosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlReportePagosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbReporteDePago, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(pnlReportePagosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbBuscarReporteDePago)
                    .addComponent(txtNombreReporteDePago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarReporteDePago))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVolverReportePagos)
                .addGap(89, 89, 89)
                .addGroup(pnlReportePagosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar)
                    .addComponent(btnSalir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlContenedor.add(pnlReportePagos, "card6");

        pnlReporteCitas.setPreferredSize(new java.awt.Dimension(960, 565));

        lblReporteCitas.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblReporteCitas.setText("Reporte de citas");

        tblReporteCitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Hora", "Veterinario", "Mascota", "Dueño", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblReporteCitas);

        btnVolverReporteCitas.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btnVolverReporteCitas.setText("Volver");
        btnVolverReporteCitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverReporteCitasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlReporteCitasLayout = new javax.swing.GroupLayout(pnlReporteCitas);
        pnlReporteCitas.setLayout(pnlReporteCitasLayout);
        pnlReporteCitasLayout.setHorizontalGroup(
            pnlReporteCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlReporteCitasLayout.createSequentialGroup()
                .addGroup(pnlReporteCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnVolverReporteCitas)
                    .addGroup(pnlReporteCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlReporteCitasLayout.createSequentialGroup()
                            .addGap(398, 398, 398)
                            .addComponent(lblReporteCitas))
                        .addGroup(pnlReporteCitasLayout.createSequentialGroup()
                            .addGap(39, 39, 39)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 867, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        pnlReporteCitasLayout.setVerticalGroup(
            pnlReporteCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlReporteCitasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblReporteCitas)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVolverReporteCitas)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pnlContenedor.add(pnlReporteCitas, "card7");

        pnlReporteCliente.setPreferredSize(new java.awt.Dimension(960, 565));

        lblReporteCliente.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblReporteCliente.setText("Reporte de Cliente");

        lblBuscarPor.setText("Buscar por:");

        cmbBuscarPor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre cliente", "Nombre Mascota" }));

        btnBuscarReporteCliente.setText("🔍");

        txtaReporteCliente.setColumns(20);
        txtaReporteCliente.setRows(5);
        jScrollPane4.setViewportView(txtaReporteCliente);

        btnVolverReporteCliente.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        btnVolverReporteCliente.setText("Volver");
        btnVolverReporteCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverReporteClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlReporteClienteLayout = new javax.swing.GroupLayout(pnlReporteCliente);
        pnlReporteCliente.setLayout(pnlReporteClienteLayout);
        pnlReporteClienteLayout.setHorizontalGroup(
            pnlReporteClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlReporteClienteLayout.createSequentialGroup()
                .addGroup(pnlReporteClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlReporteClienteLayout.createSequentialGroup()
                        .addGap(355, 355, 355)
                        .addComponent(lblReporteCliente))
                    .addGroup(pnlReporteClienteLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(pnlReporteClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnVolverReporteCliente)
                            .addGroup(pnlReporteClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnlReporteClienteLayout.createSequentialGroup()
                                    .addComponent(txtBuscarReporteCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnBuscarReporteCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnlReporteClienteLayout.createSequentialGroup()
                                    .addComponent(lblBuscarPor)
                                    .addGap(18, 18, 18)
                                    .addComponent(cmbBuscarPor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 862, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        pnlReporteClienteLayout.setVerticalGroup(
            pnlReporteClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlReporteClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblReporteCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlReporteClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBuscarPor)
                    .addComponent(cmbBuscarPor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(pnlReporteClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarReporteCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarReporteCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVolverReporteCliente)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pnlContenedor.add(pnlReporteCliente, "card8");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnlContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        
    private void btnAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClienteActionPerformed
        
        CardLayout cl = (CardLayout) pnlContenedor.getLayout();
        cl.show(pnlContenedor, "menu");
        
    }//GEN-LAST:event_btnAgregarClienteActionPerformed

    private void btnAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendarActionPerformed
        CardLayout cl = (CardLayout) pnlContenedor.getLayout();
        cl.show(pnlContenedor, "menu");
    }//GEN-LAST:event_btnAgendarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        CardLayout cl = (CardLayout) pnlContenedor.getLayout();
        cl.show(pnlContenedor, "menu");
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAgendarCita1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendarCita1ActionPerformed
        CardLayout cl = (CardLayout) pnlContenedor.getLayout();
        cl.show(pnlContenedor, "AgendarCita");
    }//GEN-LAST:event_btnAgendarCita1ActionPerformed

    private void btnVerClientes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerClientes1ActionPerformed
        CardLayout cl = (CardLayout) pnlContenedor.getLayout();
        cl.show(pnlContenedor, "VerClientes");
    }//GEN-LAST:event_btnVerClientes1ActionPerformed

    private void btnNuevoCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoCliente1ActionPerformed
        CardLayout cl = (CardLayout) pnlContenedor.getLayout();
        cl.show(pnlContenedor, "nuevoCliente");
    }//GEN-LAST:event_btnNuevoCliente1ActionPerformed

    private void btnVolverReporteCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverReporteCitasActionPerformed
        CardLayout cl = (CardLayout) pnlContenedor.getLayout();
        cl.show(pnlContenedor, "menu");
    }//GEN-LAST:event_btnVolverReporteCitasActionPerformed

    private void btnVolverReporteClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverReporteClienteActionPerformed
        CardLayout cl = (CardLayout) pnlContenedor.getLayout();
        cl.show(pnlContenedor, "menu");
    }//GEN-LAST:event_btnVolverReporteClienteActionPerformed

    private void btnReporteCitas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteCitas1ActionPerformed
        CardLayout cl = (CardLayout) pnlContenedor.getLayout();
        cl.show(pnlContenedor, "ReporteCitas");
    }//GEN-LAST:event_btnReporteCitas1ActionPerformed

    private void btnReporteCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteCliente1ActionPerformed
        CardLayout cl = (CardLayout) pnlContenedor.getLayout();
        cl.show(pnlContenedor, "ReporteCliente");
    }//GEN-LAST:event_btnReporteCliente1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgendar;
    private javax.swing.JButton btnAgendarCita1;
    private javax.swing.JButton btnAgregarCliente;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarReporteCliente;
    private javax.swing.JButton btnBuscarReporteDePago;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JToggleButton btnNuevoCliente1;
    private javax.swing.JButton btnRefrescar;
    private javax.swing.JButton btnReporteCitas1;
    private javax.swing.JButton btnReporteCliente1;
    private javax.swing.JButton btnReportePagos1;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSalirListado;
    private javax.swing.JButton btnVerClientes1;
    private javax.swing.JButton btnVolverReporteCitas;
    private javax.swing.JButton btnVolverReporteCliente;
    private javax.swing.JToggleButton btnVolverReportePagos;
    private javax.swing.JButton btnVolverVerClientes;
    private javax.swing.JComboBox<String> cbxHora;
    private javax.swing.JComboBox<String> cmbBuscarPor;
    private javax.swing.JScrollPane jListadoclientes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private com.toedter.calendar.JCalendar jclCalendario;
    private javax.swing.JLabel jlbBuscar;
    private javax.swing.JLabel jlbBuscarReporteDePago;
    private javax.swing.JLabel jlbReporteDePago;
    private javax.swing.JLabel lblAgendarCita;
    private javax.swing.JLabel lblBuscarPor;
    private javax.swing.JLabel lblCalendario;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblDatosMascota;
    private javax.swing.JLabel lblDui;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblMascota;
    private javax.swing.JLabel lblMotivodeconsulta;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNuevoCliente;
    private javax.swing.JLabel lblReporteCitas;
    private javax.swing.JLabel lblReporteCliente;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblVerClientes;
    private javax.swing.JPanel pnlAgendarCita;
    private javax.swing.JPanel pnlContenedor;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlNuevoCliente;
    private javax.swing.JPanel pnlReporteCitas;
    private javax.swing.JPanel pnlReporteCliente;
    private javax.swing.JPanel pnlReportePagos;
    private javax.swing.JPanel pnlVerClientes;
    private javax.swing.JTable tblAñadirMascotas;
    private javax.swing.JTable tblReporteCitas;
    private javax.swing.JTable tblTablaDeReporteDeReporte;
    private javax.swing.JTable tblVerClientes;
    private javax.swing.JLabel tituloVeterinaria1;
    private javax.swing.JTextField txtBuscarCliente;
    private javax.swing.JTextField txtBuscarReporteCliente;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDui;
    private javax.swing.JTextField txtMascota;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreReporteDePago;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextArea txtaMotivoConsulta;
    private javax.swing.JTextArea txtaReporteCliente;
    // End of variables declaration//GEN-END:variables

}
