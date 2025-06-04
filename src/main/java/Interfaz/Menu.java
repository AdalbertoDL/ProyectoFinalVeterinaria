package Interfaz;

import java.awt.CardLayout;


public class Menu extends javax.swing.JFrame {

    
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        pnlContenedor.setLayout(new CardLayout());
        pnlContenedor.add(pnlMenu, "menu");
        pnlContenedor.add(pnlNuevoCliente, "nuevoCliente");
<<<<<<< HEAD
        pnlContenedor.add(pnlAgendarCita, "AgendarCita");
        pnlContenedor.add(pnlVerClientes, "VerClientes");
        pnlContenedor.add(pnlReporteDePago, "ReporteDePago");
=======
        pnlContenedor.add(pnlAgendarCita, "agendarCita");
        pnlContenedor.add(pnlReporteCitas, "reporteCitas");
>>>>>>> parent of 33f90d3 (Creación interfaz Reporte de clientes)
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
        pnlVerClientes = new javax.swing.JPanel();
        jlbVerClientes = new javax.swing.JLabel();
        jlbBuscar = new javax.swing.JLabel();
        txtBuscarCliente = new javax.swing.JTextField();
        btnBuscarCliente = new javax.swing.JButton();
        btnRefrescar = new javax.swing.JButton();
        jListadoclientes = new javax.swing.JScrollPane();
        jtVerClientes = new javax.swing.JTable();
        btnSalirListado = new javax.swing.JButton();
        pnlReporteDePago = new javax.swing.JPanel();
        jlbReporteDePago = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
<<<<<<< HEAD
        tlbTablaDeReporteDeReporte = new javax.swing.JTable();
        jlbBuscarReporteDePago = new javax.swing.JLabel();
        txtNombreReporteDePago = new javax.swing.JTextField();
        btnBuscarReporteDePago = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
=======
        tblReporteCitas = new javax.swing.JTable();
        btnVolverReporteCitas = new javax.swing.JButton();
>>>>>>> parent of 33f90d3 (Creación interfaz Reporte de clientes)

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
        btnAgendarCita1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendarCita1ActionPerformed(evt);
            }
        });

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
<<<<<<< HEAD
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
=======
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuLayout.createSequentialGroup()
                .addContainerGap(385, Short.MAX_VALUE)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
>>>>>>> parent of 33f90d3 (Creación interfaz Reporte de clientes)
                    .addComponent(tituloVeterinaria1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevoCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerClientes1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgendarCita1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReportePagos1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReporteCitas1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReporteCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(193, Short.MAX_VALUE))
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloVeterinaria1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 195, Short.MAX_VALUE)
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
<<<<<<< HEAD
                .addGap(31, 31, 31))
=======
                .addContainerGap(60, Short.MAX_VALUE))
>>>>>>> parent of 33f90d3 (Creación interfaz Reporte de clientes)
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
<<<<<<< HEAD
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
=======
                .addGap(23, 23, 23)
                .addGroup(pnlNuevoClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlNuevoClienteLayout.createSequentialGroup()
                        .addComponent(lblCorreo)
                        .addGap(18, 18, 18)
                        .addComponent(txtCorreo))
                    .addGroup(pnlNuevoClienteLayout.createSequentialGroup()
                        .addComponent(lblNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
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
>>>>>>> parent of 33f90d3 (Creación interfaz Reporte de clientes)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 481, Short.MAX_VALUE)
                .addComponent(btnAgregarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pnlContenedor.add(pnlNuevoCliente, "card2");

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

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

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
<<<<<<< HEAD
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
                .addContainerGap(130, Short.MAX_VALUE))
=======
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 819, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMotivodeconsulta))))
                .addContainerGap(79, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAgendarCitaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addGap(18, 18, 18)
                .addComponent(btnAgendar)
                .addGap(17, 17, 17))
>>>>>>> parent of 33f90d3 (Creación interfaz Reporte de clientes)
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
<<<<<<< HEAD
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                .addGroup(pnlAgendarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgendar)
                    .addComponent(btnCancelar))
                .addGap(59, 59, 59))
=======
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlAgendarCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgendar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
>>>>>>> parent of 33f90d3 (Creación interfaz Reporte de clientes)
        );

        pnlContenedor.add(pnlAgendarCita, "card4");

        pnlVerClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jlbVerClientes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jlbVerClientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbVerClientes.setText("Ver Clientes");
        jlbVerClientes.setToolTipText("");
        jlbVerClientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jlbBuscar.setText("Buscar:");

        btnBuscarCliente.setText("Buscar");

        btnRefrescar.setText("Refrescar");

        jtVerClientes.setModel(new javax.swing.table.DefaultTableModel(
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
        jListadoclientes.setViewportView(jtVerClientes);

        btnSalirListado.setText("Salir");

<<<<<<< HEAD
        javax.swing.GroupLayout pnlVerClientesLayout = new javax.swing.GroupLayout(pnlVerClientes);
        pnlVerClientes.setLayout(pnlVerClientesLayout);
        pnlVerClientesLayout.setHorizontalGroup(
            pnlVerClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVerClientesLayout.createSequentialGroup()
                .addGroup(pnlVerClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlVerClientesLayout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jlbVerClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlVerClientesLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(pnlVerClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(pnlVerClientesLayout.createSequentialGroup()
                                .addComponent(btnSalirListado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRefrescar))
                            .addComponent(jListadoclientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlVerClientesLayout.createSequentialGroup()
                                .addComponent(jlbBuscar)
                                .addGap(18, 18, 18)
                                .addComponent(txtBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBuscarCliente)))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        pnlVerClientesLayout.setVerticalGroup(
            pnlVerClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVerClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbVerClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(pnlVerClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbBuscar)
                    .addComponent(txtBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCliente))
                .addGap(36, 36, 36)
                .addComponent(jListadoclientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
=======
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblReporteCitas);
        if (tblReporteCitas.getColumnModel().getColumnCount() > 0) {
            tblReporteCitas.getColumnModel().getColumn(0).setResizable(false);
            tblReporteCitas.getColumnModel().getColumn(1).setResizable(false);
            tblReporteCitas.getColumnModel().getColumn(2).setResizable(false);
            tblReporteCitas.getColumnModel().getColumn(3).setResizable(false);
            tblReporteCitas.getColumnModel().getColumn(4).setResizable(false);
            tblReporteCitas.getColumnModel().getColumn(5).setResizable(false);
        }

        btnVolverReporteCitas.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
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
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(pnlReporteCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlReporteCitasLayout.createSequentialGroup()
                        .addComponent(lblTituloCita)
                        .addGap(381, 381, 381))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlReporteCitasLayout.createSequentialGroup()
                        .addGroup(pnlReporteCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnVolverReporteCitas, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 905, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))))
        );
        pnlReporteCitasLayout.setVerticalGroup(
            pnlReporteCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlReporteCitasLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblTituloCita)
>>>>>>> parent of 33f90d3 (Creación interfaz Reporte de clientes)
                .addGap(18, 18, 18)
                .addGroup(pnlVerClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRefrescar)
                    .addComponent(btnSalirListado))
                .addContainerGap(121, Short.MAX_VALUE))
        );

        pnlContenedor.add(pnlVerClientes, "card5");

        jlbReporteDePago.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbReporteDePago.setText("Reporte de Pagos");

        tlbTablaDeReporteDeReporte.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tlbTablaDeReporteDeReporte);

        jlbBuscarReporteDePago.setText("Buscar");

        btnBuscarReporteDePago.setText("Buscar");

        btnActualizar.setText("Actualizar");

        btnSalir.setText("Salir");

        javax.swing.GroupLayout pnlReporteDePagoLayout = new javax.swing.GroupLayout(pnlReporteDePago);
        pnlReporteDePago.setLayout(pnlReporteDePagoLayout);
        pnlReporteDePagoLayout.setHorizontalGroup(
            pnlReporteDePagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlReporteDePagoLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(pnlReporteDePagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlReporteDePagoLayout.createSequentialGroup()
                        .addComponent(jlbBuscarReporteDePago, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreReporteDePago, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarReporteDePago)))
                .addGap(35, 35, 35))
            .addGroup(pnlReporteDePagoLayout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(jlbReporteDePago, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlReporteDePagoLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(btnActualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(75, 75, 75))
        );
        pnlReporteDePagoLayout.setVerticalGroup(
            pnlReporteDePagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlReporteDePagoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbReporteDePago, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(pnlReporteDePagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbBuscarReporteDePago)
                    .addComponent(txtNombreReporteDePago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarReporteDePago))
                .addGap(47, 47, 47)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
<<<<<<< HEAD
                .addGap(37, 37, 37)
                .addGroup(pnlReporteDePagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar)
                    .addComponent(btnSalir))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pnlContenedor.add(pnlReporteDePago, "card6");
=======
                .addGap(18, 18, 18)
                .addComponent(btnVolverReporteCitas, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pnlContenedor.add(pnlReporteCitas, "cardReporteCitas");
>>>>>>> parent of 33f90d3 (Creación interfaz Reporte de clientes)

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 15, Short.MAX_VALUE)
                .addComponent(pnlContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
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
        cl.show(pnlContenedor, "AgendarCita");
    }//GEN-LAST:event_btnAgendarCita1ActionPerformed

    private void btnAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendarActionPerformed
         CardLayout cl = (CardLayout) pnlContenedor.getLayout();
        cl.show(pnlContenedor, "menu");
    }//GEN-LAST:event_btnAgendarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        CardLayout cl = (CardLayout) pnlContenedor.getLayout();
        cl.show(pnlContenedor, "menu");
    }//GEN-LAST:event_btnCancelarActionPerformed

<<<<<<< HEAD
=======
    private void btnVolverReporteCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverReporteCitasActionPerformed
        CardLayout cl = (CardLayout) pnlContenedor.getLayout();
        cl.show(pnlContenedor, "menu");
    }//GEN-LAST:event_btnVolverReporteCitasActionPerformed

    private void btnReporteCitas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteCitas1ActionPerformed
        CardLayout cl = (CardLayout) pnlContenedor.getLayout();
        cl.show(pnlContenedor, "reporteCitas");
    }//GEN-LAST:event_btnReporteCitas1ActionPerformed

>>>>>>> parent of 33f90d3 (Creación interfaz Reporte de clientes)
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
<<<<<<< HEAD
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarReporteDePago;
=======
>>>>>>> parent of 33f90d3 (Creación interfaz Reporte de clientes)
    private javax.swing.JButton btnCancelar;
    private javax.swing.JToggleButton btnNuevoCliente1;
    private javax.swing.JButton btnRefrescar;
    private javax.swing.JButton btnReporteCitas1;
    private javax.swing.JButton btnReporteCliente1;
    private javax.swing.JButton btnReportePagos1;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSalirListado;
    private javax.swing.JButton btnVerClientes1;
    private javax.swing.JComboBox<String> cbxHora;
<<<<<<< HEAD
    private javax.swing.JScrollPane jListadoclientes;
=======
>>>>>>> parent of 33f90d3 (Creación interfaz Reporte de clientes)
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private com.toedter.calendar.JCalendar jclCalendario;
    private javax.swing.JLabel jlbBuscar;
    private javax.swing.JLabel jlbBuscarReporteDePago;
    private javax.swing.JLabel jlbReporteDePago;
    private javax.swing.JLabel jlbVerClientes;
    private javax.swing.JTable jtVerClientes;
    private javax.swing.JLabel lblAgendarCita;
    private javax.swing.JLabel lblCalendario;
    private javax.swing.JLabel lblCliente;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblDui;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblMascota;
    private javax.swing.JLabel lblMotivodeconsulta;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JPanel pnlAgendarCita;
    private javax.swing.JPanel pnlContenedor;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlNuevoCliente;
<<<<<<< HEAD
    private javax.swing.JPanel pnlReporteDePago;
    private javax.swing.JPanel pnlVerClientes;
    private javax.swing.JLabel tituloVeterinaria1;
    private javax.swing.JTable tlbTablaDeReporteDeReporte;
    private javax.swing.JTextField txtBuscarCliente;
=======
    private javax.swing.JPanel pnlReporteCitas;
    private javax.swing.JTable tblReporteCitas;
    private javax.swing.JLabel tituloVeterinaria1;
>>>>>>> parent of 33f90d3 (Creación interfaz Reporte de clientes)
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDui;
    private javax.swing.JTextField txtMascota;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreReporteDePago;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

}
