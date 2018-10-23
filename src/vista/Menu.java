
package vista;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VistaDeAsistenciaDiaria = new javax.swing.JDialog();
        panel1 = new org.edisoncor.gui.panel.Panel();
        btnIniciarJornada = new org.edisoncor.gui.button.ButtonTask();
        btnFinalizarJornada = new org.edisoncor.gui.button.ButtonTask();
        panel2 = new org.edisoncor.gui.panel.Panel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaDeAsistencia = new javax.swing.JTable();
        lblFecha = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBusquedaPorCedula = new org.edisoncor.gui.textField.TextFieldRectImage();
        btnEntrada = new org.edisoncor.gui.button.ButtonTask();
        btnSalida = new org.edisoncor.gui.button.ButtonTask();
        btnReporte = new org.edisoncor.gui.button.ButtonTask();
        jLabel1 = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblHoraInicio = new javax.swing.JLabel();
        lblHoraCierre = new javax.swing.JLabel();
        ReporteDeInasistenciaActual = new javax.swing.JDialog();
        panel3 = new org.edisoncor.gui.panel.Panel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaDeInasistenciasDiaria = new javax.swing.JTable();
        lblFechaDeInasistencia = new javax.swing.JLabel();
        NuevoEmpleado = new javax.swing.JDialog();
        panel6 = new org.edisoncor.gui.panel.Panel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombreEmpleado = new org.edisoncor.gui.textField.TextFieldRectImage();
        jLabel6 = new javax.swing.JLabel();
        txtApellidoEmpleado = new org.edisoncor.gui.textField.TextFieldRectImage();
        jLabel7 = new javax.swing.JLabel();
        txtDepartamentoAsignado = new org.edisoncor.gui.textField.TextFieldRectImage();
        btnGuardarEmpleado = new javax.swing.JButton();
        btnAgregarDepartamento = new javax.swing.JButton();
        txtCedula = new javax.swing.JTextField();
        VistaSeleccionarDepartamento = new javax.swing.JDialog();
        panel7 = new org.edisoncor.gui.panel.Panel();
        jScrollPane4 = new javax.swing.JScrollPane();
        listadoDeDepartamentos = new javax.swing.JTable();
        btnAsignarDepartamento = new javax.swing.JButton();
        Login = new javax.swing.JDialog();
        panel8 = new org.edisoncor.gui.panel.Panel();
        txtNombreDeUsuario = new org.edisoncor.gui.textField.TextFieldRoundImage();
        txtClave = new org.edisoncor.gui.passwordField.PasswordFieldRoundImage();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JButton();
        InasistenciaPersonal = new javax.swing.JDialog();
        panel9 = new org.edisoncor.gui.panel.Panel();
        jScrollPane6 = new javax.swing.JScrollPane();
        listaDeInasistenciaPorEmpleado = new javax.swing.JTable();
        btnCrearJustificacion = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        mesInasistencia = new com.toedter.calendar.JMonthChooser();
        jLabel12 = new javax.swing.JLabel();
        yearInasistencia = new com.toedter.calendar.JYearChooser();
        btnConsultarInasistencia = new javax.swing.JButton();
        btnVerJustificacion = new javax.swing.JButton();
        btnVerInasistenciasSemnalDeEmpleado = new javax.swing.JButton();
        VistaReporteDeAsistencia = new javax.swing.JDialog();
        panel12 = new org.edisoncor.gui.panel.Panel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tablaReportAsistencia = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        lblFechaEntradaSalida = new javax.swing.JLabel();
        VistaJustificacion = new javax.swing.JDialog();
        panel13 = new org.edisoncor.gui.panel.Panel();
        jScrollPane8 = new javax.swing.JScrollPane();
        areaObservacion = new javax.swing.JTextArea();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        lblHoraDeGeneracion = new javax.swing.JLabel();
        btnJustificar = new javax.swing.JButton();
        VistaBuscarEmpleado = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        btnBuscarEmpleado = new javax.swing.JButton();
        txtCedulaEmpleadoBuscar = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        VistaSubMenu = new javax.swing.JDialog();
        panelSubMenu = new javax.swing.JPanel();
        panelDeFunciones = new javax.swing.JPanel();
        btnInformacionPersonal = new org.edisoncor.gui.button.ButtonTask();
        btnInasistenciasDeEmpleado = new org.edisoncor.gui.button.ButtonTask();
        btnPermisosEmpleado = new org.edisoncor.gui.button.ButtonTask();
        btnSalirEmpleado = new org.edisoncor.gui.button.ButtonTask();
        panelInformacionDeEmpleado = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        lblNombreEmpleado = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        lblApellidosEmpleado = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        lblDepartamentoEmpleado = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        lblCedulaEmpleado = new javax.swing.JLabel();
        btnEditarEmpleado = new javax.swing.JButton();
        NuevoPermiso = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        lblFechaDeEmision = new javax.swing.JLabel();
        btnEmitir = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        fechaDeIncio = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        txtDiasDePermiso = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        chRemunerado = new javax.swing.JCheckBox();
        VistaInasistenciaSemanal = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaInasistenciaLunes = new javax.swing.JTable();
        jScrollPane12 = new javax.swing.JScrollPane();
        tablaInasistenciaMiercoles = new javax.swing.JTable();
        jScrollPane13 = new javax.swing.JScrollPane();
        tablaInasistenciaMartes = new javax.swing.JTable();
        jScrollPane14 = new javax.swing.JScrollPane();
        tablaInasistenciaJueves = new javax.swing.JTable();
        jScrollPane15 = new javax.swing.JScrollPane();
        tablaInasistenciaViernes = new javax.swing.JTable();
        lblFechaLunes = new javax.swing.JLabel();
        lblFechaMartes = new javax.swing.JLabel();
        lblFechaMiercoles = new javax.swing.JLabel();
        lblFechaJueves = new javax.swing.JLabel();
        lblFechaViernes = new javax.swing.JLabel();
        VistaSeleccionDeFecha = new javax.swing.JDialog();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        btnVerInasistenciaSemanal = new org.edisoncor.gui.button.ButtonTask();
        fechaInasistenciaSemanal = new com.toedter.calendar.JCalendar();
        VistaSeleccionDeMesYQuincena = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        mesReporteQuincenal = new com.toedter.calendar.JMonthChooser();
        anioReporteQuincenal = new com.toedter.calendar.JYearChooser();
        jLabel16 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        cmbQuincena = new javax.swing.JComboBox<>();
        buttonTask1 = new org.edisoncor.gui.button.ButtonTask();
        VistaVerJustificacion = new javax.swing.JDialog();
        jPanel8 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        lblFechaDeJustificacion = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        lblHoraDeJustificacion = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtObservacionJustificacion = new javax.swing.JTextArea();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        VistaSeleccionarFechaES = new javax.swing.JDialog();
        jPanel9 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        calendarFechaConsulta = new com.toedter.calendar.JDateChooser();
        btnVerReporteDeAsistencia = new org.edisoncor.gui.button.ButtonTask();
        VistaInasistenciasSemanalPersonal = new javax.swing.JDialog();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        listaDeInasistenciasSemanalDeEmpleado = new javax.swing.JList<>();
        jLabel38 = new javax.swing.JLabel();
        lblTotalInasistenciaSemanal = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        lblEmpleadoInasistenciaSemanal = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        lblCedulaInasistenciaSemanal = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        lblDepartamentoInasistenciaSemanal = new javax.swing.JLabel();
        VistaSeleccionarFechaInasistenciaSemanalPersonal = new javax.swing.JDialog();
        jPanel11 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        btnVerInasistenciaSemanalPersonal = new org.edisoncor.gui.button.ButtonTask();
        fechaInasistenciaSemanalPersonal = new com.toedter.calendar.JCalendar();
        Empleados = new javax.swing.JDialog();
        panel4 = new org.edisoncor.gui.panel.Panel();
        panel5 = new org.edisoncor.gui.panel.Panel();
        jScrollPane10 = new javax.swing.JScrollPane();
        listaDeEmpleados = new javax.swing.JTable();
        jLabel40 = new javax.swing.JLabel();
        txtEmpleadoABuscar = new org.edisoncor.gui.textField.TextFieldRectIcon();
        jLabel41 = new javax.swing.JLabel();
        cmbFiltrarPorDepartamento = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        barraEmpleado = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        barraRegistroDeAsistencias = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        barraEntradasSalidas = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        barraEmpleados = new javax.swing.JButton();
        barraDeMenu = new javax.swing.JMenuBar();
        Archivo = new javax.swing.JMenu();
        itemEmpleado = new javax.swing.JMenuItem();
        Control = new javax.swing.JMenu();
        itemAsistenciaDiaria = new javax.swing.JMenuItem();
        Consultas = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        itemEntradaSalida = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        itemInasistenciaSemanalGeneral = new javax.swing.JMenuItem();
        itemInasistenciaQuincenalGeneral = new javax.swing.JMenuItem();
        itemEmpleadosConsulta = new javax.swing.JMenuItem();
        Ayuda = new javax.swing.JMenu();
        itemManual = new javax.swing.JMenuItem();

        VistaDeAsistenciaDiaria.setTitle("Asistencia diaria");

        panel1.setColorPrimario(new java.awt.Color(255, 255, 255));
        panel1.setColorSecundario(new java.awt.Color(204, 204, 204));

        btnIniciarJornada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/png/glyphicons-56-stopwatch.png"))); // NOI18N
        btnIniciarJornada.setText("INICIAR JORNADA");
        btnIniciarJornada.setDescription("Nuevo día");

        btnFinalizarJornada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/png/glyphicons-533-stop-sign.png"))); // NOI18N
        btnFinalizarJornada.setText("FINALIZAR JORNADA");
        btnFinalizarJornada.setDescription("Fin del día");

        panel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Asistencia de hoy"));
        panel2.setColorPrimario(new java.awt.Color(204, 204, 204));
        panel2.setColorSecundario(new java.awt.Color(204, 204, 204));

        listaDeAsistencia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Empleado", "Departamento", "Hora de entrada", "Hora de salida"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listaDeAsistencia.setFocusable(false);
        listaDeAsistencia.setRowHeight(30);
        listaDeAsistencia.setShowHorizontalLines(false);
        listaDeAsistencia.setShowVerticalLines(false);
        listaDeAsistencia.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(listaDeAsistencia);
        if (listaDeAsistencia.getColumnModel().getColumnCount() > 0) {
            listaDeAsistencia.getColumnModel().getColumn(0).setResizable(false);
            listaDeAsistencia.getColumnModel().getColumn(1).setResizable(false);
            listaDeAsistencia.getColumnModel().getColumn(2).setResizable(false);
            listaDeAsistencia.getColumnModel().getColumn(3).setResizable(false);
            listaDeAsistencia.getColumnModel().getColumn(4).setResizable(false);
        }

        lblFecha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblFecha.setText("FECHA");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Búsqueda por cédula");

        txtBusquedaPorCedula.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(lblFecha)
                        .addGap(163, 163, 163)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBusquedaPorCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFecha)
                    .addComponent(jLabel2)
                    .addComponent(txtBusquedaPorCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        btnEntrada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/icon/if_check_59131.png"))); // NOI18N
        btnEntrada.setText("Entrada");
        btnEntrada.setDescription("Marcar");

        btnSalida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/icon/if_check_59131.png"))); // NOI18N
        btnSalida.setText("Salida");
        btnSalida.setDescription("Marcar");

        btnReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/icon/if_order-2_59180.png"))); // NOI18N
        btnReporte.setText("Reporte");
        btnReporte.setDescription("Relación de asistencia de hoy");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Jornada de hoy:");

        lblEstado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblEstado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEstado.setText("ESTADO");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setText("Hora de inicio:");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setText("Hora de cierre:");

        lblHoraInicio.setText("00:00:00");

        lblHoraCierre.setText("00:00:00");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(btnEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(193, 193, 193)
                                .addComponent(btnSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(231, 231, 231)
                                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblHoraInicio))
                                    .addGroup(panel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblHoraCierre)))))
                        .addContainerGap(125, Short.MAX_VALUE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(btnIniciarJornada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFinalizarJornada, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIniciarJornada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFinalizarJornada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(btnReporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lblEstado)))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(lblHoraInicio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(lblHoraCierre))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout VistaDeAsistenciaDiariaLayout = new javax.swing.GroupLayout(VistaDeAsistenciaDiaria.getContentPane());
        VistaDeAsistenciaDiaria.getContentPane().setLayout(VistaDeAsistenciaDiariaLayout);
        VistaDeAsistenciaDiariaLayout.setHorizontalGroup(
            VistaDeAsistenciaDiariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        VistaDeAsistenciaDiariaLayout.setVerticalGroup(
            VistaDeAsistenciaDiariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        ReporteDeInasistenciaActual.setTitle("Inasistencias de Hoy");

        panel3.setColorPrimario(new java.awt.Color(255, 255, 255));
        panel3.setColorSecundario(new java.awt.Color(204, 204, 204));

        listaDeInasistenciasDiaria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Cédula", "Empleado", "Motivo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listaDeInasistenciasDiaria.setFocusable(false);
        listaDeInasistenciasDiaria.setRowHeight(30);
        listaDeInasistenciasDiaria.setShowHorizontalLines(false);
        listaDeInasistenciasDiaria.setShowVerticalLines(false);
        listaDeInasistenciasDiaria.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(listaDeInasistenciasDiaria);
        if (listaDeInasistenciasDiaria.getColumnModel().getColumnCount() > 0) {
            listaDeInasistenciasDiaria.getColumnModel().getColumn(0).setResizable(false);
            listaDeInasistenciasDiaria.getColumnModel().getColumn(1).setResizable(false);
            listaDeInasistenciasDiaria.getColumnModel().getColumn(2).setResizable(false);
        }

        lblFechaDeInasistencia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblFechaDeInasistencia.setText("Fecha");

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(lblFechaDeInasistencia)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblFechaDeInasistencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        javax.swing.GroupLayout ReporteDeInasistenciaActualLayout = new javax.swing.GroupLayout(ReporteDeInasistenciaActual.getContentPane());
        ReporteDeInasistenciaActual.getContentPane().setLayout(ReporteDeInasistenciaActualLayout);
        ReporteDeInasistenciaActualLayout.setHorizontalGroup(
            ReporteDeInasistenciaActualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ReporteDeInasistenciaActualLayout.setVerticalGroup(
            ReporteDeInasistenciaActualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        NuevoEmpleado.setTitle("Nuevo empleado");

        panel6.setBackground(new java.awt.Color(182, 51, 45));
        panel6.setColorPrimario(new java.awt.Color(255, 255, 255));
        panel6.setColorSecundario(java.awt.Color.white);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Cédula");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Nombre");

        txtNombreEmpleado.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Apellido");

        txtApellidoEmpleado.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Departamento");

        txtDepartamentoAsignado.setEditable(false);
        txtDepartamentoAsignado.setBackground(new java.awt.Color(255, 255, 255));
        txtDepartamentoAsignado.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnGuardarEmpleado.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        btnGuardarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/png/glyphicons-199-ok-circle.png"))); // NOI18N
        btnGuardarEmpleado.setText("Guardar");

        btnAgregarDepartamento.setText("+");

        txtCedula.setEditable(false);
        txtCedula.setBackground(java.awt.Color.white);
        txtCedula.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout panel6Layout = new javax.swing.GroupLayout(panel6);
        panel6.setLayout(panel6Layout);
        panel6Layout.setHorizontalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel6Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel6Layout.createSequentialGroup()
                        .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombreEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtApellidoEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(txtCedula)))
                    .addGroup(panel6Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDepartamentoAsignado, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgregarDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardarEmpleado)
                .addGap(22, 22, 22))
        );
        panel6Layout.setVerticalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel6Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtApellidoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtDepartamentoAsignado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(btnGuardarEmpleado)
                .addContainerGap())
        );

        javax.swing.GroupLayout NuevoEmpleadoLayout = new javax.swing.GroupLayout(NuevoEmpleado.getContentPane());
        NuevoEmpleado.getContentPane().setLayout(NuevoEmpleadoLayout);
        NuevoEmpleadoLayout.setHorizontalGroup(
            NuevoEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        NuevoEmpleadoLayout.setVerticalGroup(
            NuevoEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        VistaSeleccionarDepartamento.setTitle("Lista de Departamentos");

        panel7.setColorPrimario(new java.awt.Color(255, 255, 255));
        panel7.setColorSecundario(new java.awt.Color(204, 204, 204));

        listadoDeDepartamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Departamento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listadoDeDepartamentos.setFocusable(false);
        listadoDeDepartamentos.setRowHeight(30);
        listadoDeDepartamentos.setShowHorizontalLines(false);
        listadoDeDepartamentos.setShowVerticalLines(false);
        listadoDeDepartamentos.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(listadoDeDepartamentos);
        if (listadoDeDepartamentos.getColumnModel().getColumnCount() > 0) {
            listadoDeDepartamentos.getColumnModel().getColumn(0).setResizable(false);
            listadoDeDepartamentos.getColumnModel().getColumn(1).setResizable(false);
        }

        btnAsignarDepartamento.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        btnAsignarDepartamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/png/glyphicons-153-check.png"))); // NOI18N
        btnAsignarDepartamento.setText("Asignar");

        javax.swing.GroupLayout panel7Layout = new javax.swing.GroupLayout(panel7);
        panel7.setLayout(panel7Layout);
        panel7Layout.setHorizontalGroup(
            panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel7Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAsignarDepartamento)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panel7Layout.setVerticalGroup(
            panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel7Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(btnAsignarDepartamento)
                .addContainerGap())
        );

        javax.swing.GroupLayout VistaSeleccionarDepartamentoLayout = new javax.swing.GroupLayout(VistaSeleccionarDepartamento.getContentPane());
        VistaSeleccionarDepartamento.getContentPane().setLayout(VistaSeleccionarDepartamentoLayout);
        VistaSeleccionarDepartamentoLayout.setHorizontalGroup(
            VistaSeleccionarDepartamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        VistaSeleccionarDepartamentoLayout.setVerticalGroup(
            VistaSeleccionarDepartamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Login.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        Login.setTitle("Login");

        panel8.setColorPrimario(new java.awt.Color(255, 255, 255));
        panel8.setColorSecundario(java.awt.Color.white);

        txtNombreDeUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtClave.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel17.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel17.setForeground(java.awt.Color.darkGray);
        jLabel17.setText("Usuario");

        jLabel18.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        jLabel18.setForeground(java.awt.Color.darkGray);
        jLabel18.setText("Contraseña");

        btnEntrar.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        btnEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/png/glyphicons-387-log-in.png"))); // NOI18N
        btnEntrar.setText("Entrar ");

        javax.swing.GroupLayout panel8Layout = new javax.swing.GroupLayout(panel8);
        panel8.setLayout(panel8Layout);
        panel8Layout.setHorizontalGroup(
            panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel8Layout.createSequentialGroup()
                .addGap(0, 204, Short.MAX_VALUE)
                .addComponent(btnEntrar)
                .addGap(30, 30, 30))
            .addGroup(panel8Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel17)
                    .addComponent(txtNombreDeUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18)
                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel8Layout.setVerticalGroup(
            panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel8Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNombreDeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(btnEntrar)
                .addContainerGap())
        );

        javax.swing.GroupLayout LoginLayout = new javax.swing.GroupLayout(Login.getContentPane());
        Login.getContentPane().setLayout(LoginLayout);
        LoginLayout.setHorizontalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        LoginLayout.setVerticalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        InasistenciaPersonal.setTitle("Inasistencias mensuales del empleado");

        panel9.setColorPrimario(new java.awt.Color(255, 255, 255));
        panel9.setColorSecundario(java.awt.Color.white);

        listaDeInasistenciaPorEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Día", "Motivo", "Justificada"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listaDeInasistenciaPorEmpleado.setFocusable(false);
        listaDeInasistenciaPorEmpleado.setRowHeight(30);
        listaDeInasistenciaPorEmpleado.setShowHorizontalLines(false);
        listaDeInasistenciaPorEmpleado.setShowVerticalLines(false);
        listaDeInasistenciaPorEmpleado.getTableHeader().setReorderingAllowed(false);
        jScrollPane6.setViewportView(listaDeInasistenciaPorEmpleado);
        if (listaDeInasistenciaPorEmpleado.getColumnModel().getColumnCount() > 0) {
            listaDeInasistenciaPorEmpleado.getColumnModel().getColumn(0).setResizable(false);
            listaDeInasistenciaPorEmpleado.getColumnModel().getColumn(1).setResizable(false);
            listaDeInasistenciaPorEmpleado.getColumnModel().getColumn(2).setResizable(false);
            listaDeInasistenciaPorEmpleado.getColumnModel().getColumn(3).setResizable(false);
        }

        btnCrearJustificacion.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        btnCrearJustificacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/png/glyphicons-151-edit.png"))); // NOI18N
        btnCrearJustificacion.setText("Crear justificación");

        jPanel7.setBackground(java.awt.Color.white);
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Seleccione una fecha"));

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel11.setText("Mes");

        mesInasistencia.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel12.setText("Año");

        btnConsultarInasistencia.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        btnConsultarInasistencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/png/glyphicons-28-search.png"))); // NOI18N
        btnConsultarInasistencia.setText("Consultar");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mesInasistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnConsultarInasistencia)
                            .addComponent(yearInasistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mesInasistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(yearInasistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConsultarInasistencia)
                .addContainerGap())
        );

        btnVerJustificacion.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        btnVerJustificacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/png/glyphicons-52-eye-open.png"))); // NOI18N
        btnVerJustificacion.setText("Ver justificación");

        btnVerInasistenciasSemnalDeEmpleado.setFont(new java.awt.Font("Ubuntu", 0, 16)); // NOI18N
        btnVerInasistenciasSemnalDeEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/png/glyphicons-52-eye-open.png"))); // NOI18N
        btnVerInasistenciasSemnalDeEmpleado.setText("Ver semanales");

        javax.swing.GroupLayout panel9Layout = new javax.swing.GroupLayout(panel9);
        panel9.setLayout(panel9Layout);
        panel9Layout.setHorizontalGroup(
            panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel9Layout.createSequentialGroup()
                        .addComponent(btnVerInasistenciasSemnalDeEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnVerJustificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCrearJustificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel9Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        panel9Layout.setVerticalGroup(
            panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel9Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearJustificacion)
                    .addComponent(btnVerJustificacion)
                    .addComponent(btnVerInasistenciasSemnalDeEmpleado))
                .addContainerGap())
        );

        javax.swing.GroupLayout InasistenciaPersonalLayout = new javax.swing.GroupLayout(InasistenciaPersonal.getContentPane());
        InasistenciaPersonal.getContentPane().setLayout(InasistenciaPersonalLayout);
        InasistenciaPersonalLayout.setHorizontalGroup(
            InasistenciaPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        InasistenciaPersonalLayout.setVerticalGroup(
            InasistenciaPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        VistaReporteDeAsistencia.setTitle("Entradas y Salidas");

        panel12.setColorPrimario(java.awt.Color.white);
        panel12.setColorSecundario(java.awt.Color.lightGray);

        tablaReportAsistencia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cédula", "Empleado", "Entró", "Salió", "Hrs. Trabajadas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaReportAsistencia.setFocusable(false);
        tablaReportAsistencia.setRowHeight(30);
        tablaReportAsistencia.setShowHorizontalLines(false);
        tablaReportAsistencia.setShowVerticalLines(false);
        tablaReportAsistencia.getTableHeader().setReorderingAllowed(false);
        jScrollPane7.setViewportView(tablaReportAsistencia);
        if (tablaReportAsistencia.getColumnModel().getColumnCount() > 0) {
            tablaReportAsistencia.getColumnModel().getColumn(0).setResizable(false);
            tablaReportAsistencia.getColumnModel().getColumn(1).setResizable(false);
            tablaReportAsistencia.getColumnModel().getColumn(2).setResizable(false);
            tablaReportAsistencia.getColumnModel().getColumn(3).setResizable(false);
            tablaReportAsistencia.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/png/glyphicons-46-calendar.png"))); // NOI18N

        lblFechaEntradaSalida.setText("fecha");

        javax.swing.GroupLayout panel12Layout = new javax.swing.GroupLayout(panel12);
        panel12.setLayout(panel12Layout);
        panel12Layout.setHorizontalGroup(
            panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel12Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel12Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFechaEntradaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        panel12Layout.setVerticalGroup(
            panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel12Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel19)
                    .addComponent(lblFechaEntradaSalida))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout VistaReporteDeAsistenciaLayout = new javax.swing.GroupLayout(VistaReporteDeAsistencia.getContentPane());
        VistaReporteDeAsistencia.getContentPane().setLayout(VistaReporteDeAsistenciaLayout);
        VistaReporteDeAsistenciaLayout.setHorizontalGroup(
            VistaReporteDeAsistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        VistaReporteDeAsistenciaLayout.setVerticalGroup(
            VistaReporteDeAsistenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        VistaJustificacion.setTitle("Justificar inasistencia");

        panel13.setBackground(java.awt.Color.white);
        panel13.setColorPrimario(java.awt.Color.white);
        panel13.setColorSecundario(java.awt.Color.white);

        areaObservacion.setColumns(20);
        areaObservacion.setRows(5);
        jScrollPane8.setViewportView(areaObservacion);

        jLabel20.setText("Observación");

        jLabel22.setText("Hora de generación:");

        lblHoraDeGeneracion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHoraDeGeneracion.setText("Hora");

        btnJustificar.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        btnJustificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/png/glyphicons-153-check.png"))); // NOI18N
        btnJustificar.setText("Justificar");

        javax.swing.GroupLayout panel13Layout = new javax.swing.GroupLayout(panel13);
        panel13.setLayout(panel13Layout);
        panel13Layout.setHorizontalGroup(
            panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel13Layout.createSequentialGroup()
                        .addGroup(panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblHoraDeGeneracion, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel13Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(95, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnJustificar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        panel13Layout.setVerticalGroup(
            panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel13Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(lblHoraDeGeneracion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(btnJustificar)
                .addContainerGap())
        );

        javax.swing.GroupLayout VistaJustificacionLayout = new javax.swing.GroupLayout(VistaJustificacion.getContentPane());
        VistaJustificacion.getContentPane().setLayout(VistaJustificacionLayout);
        VistaJustificacionLayout.setHorizontalGroup(
            VistaJustificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        VistaJustificacionLayout.setVerticalGroup(
            VistaJustificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        VistaBuscarEmpleado.setTitle("Buscar empleado");

        jPanel1.setBackground(java.awt.Color.white);

        jLabel23.setText("Cédula");

        btnBuscarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/icon/if_Black_Search_60944.png"))); // NOI18N
        btnBuscarEmpleado.setText("Buscar");

        txtCedulaEmpleadoBuscar.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel25.setText("Ej. 22222222");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCedulaEmpleadoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel25)
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBuscarEmpleado)
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtCedulaEmpleadoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(btnBuscarEmpleado)
                .addContainerGap())
        );

        javax.swing.GroupLayout VistaBuscarEmpleadoLayout = new javax.swing.GroupLayout(VistaBuscarEmpleado.getContentPane());
        VistaBuscarEmpleado.getContentPane().setLayout(VistaBuscarEmpleadoLayout);
        VistaBuscarEmpleadoLayout.setHorizontalGroup(
            VistaBuscarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        VistaBuscarEmpleadoLayout.setVerticalGroup(
            VistaBuscarEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelSubMenu.setBackground(java.awt.Color.white);

        panelDeFunciones.setBackground(java.awt.Color.white);
        panelDeFunciones.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Panel de opciones", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        panelDeFunciones.setLayout(new java.awt.GridLayout(4, 1));

        btnInformacionPersonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/icon/if_my-account_59177.png"))); // NOI18N
        btnInformacionPersonal.setText("Información");
        btnInformacionPersonal.setDescription("Datos del empleado");
        panelDeFunciones.add(btnInformacionPersonal);

        btnInasistenciasDeEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/icon/if_calendar_2_42176.png"))); // NOI18N
        btnInasistenciasDeEmpleado.setText("Inasistencias");
        btnInasistenciasDeEmpleado.setDescription("Semanal/Mensual");
        panelDeFunciones.add(btnInasistenciasDeEmpleado);

        btnPermisosEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/icon/if_order-2_59180.png"))); // NOI18N
        btnPermisosEmpleado.setText("Permisos");
        btnPermisosEmpleado.setDescription("Solicitudes");
        panelDeFunciones.add(btnPermisosEmpleado);

        btnSalirEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/icon/if_logout_59175.png"))); // NOI18N
        btnSalirEmpleado.setText("Salir");
        btnSalirEmpleado.setDescription("  ");
        panelDeFunciones.add(btnSalirEmpleado);

        panelInformacionDeEmpleado.setBackground(java.awt.Color.white);
        panelInformacionDeEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel27.setText("Nombre(es):");

        lblNombreEmpleado.setText("nombre");

        jLabel28.setText("Apellidos:");

        lblApellidosEmpleado.setText("apellidos");

        jLabel29.setText("Departamento:");

        lblDepartamentoEmpleado.setText("departamento");

        jLabel30.setText("Cédula:");

        lblCedulaEmpleado.setText("cedula");

        btnEditarEmpleado.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        btnEditarEmpleado.setText("Editar");

        javax.swing.GroupLayout panelInformacionDeEmpleadoLayout = new javax.swing.GroupLayout(panelInformacionDeEmpleado);
        panelInformacionDeEmpleado.setLayout(panelInformacionDeEmpleadoLayout);
        panelInformacionDeEmpleadoLayout.setHorizontalGroup(
            panelInformacionDeEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInformacionDeEmpleadoLayout.createSequentialGroup()
                .addGroup(panelInformacionDeEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInformacionDeEmpleadoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditarEmpleado))
                    .addGroup(panelInformacionDeEmpleadoLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(panelInformacionDeEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel30)
                            .addComponent(jLabel29)
                            .addComponent(jLabel27)
                            .addComponent(jLabel28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelInformacionDeEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblCedulaEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNombreEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblApellidosEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDepartamentoEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                        .addGap(0, 207, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelInformacionDeEmpleadoLayout.setVerticalGroup(
            panelInformacionDeEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInformacionDeEmpleadoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(panelInformacionDeEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(lblCedulaEmpleado))
                .addGap(18, 18, 18)
                .addGroup(panelInformacionDeEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(lblNombreEmpleado))
                .addGap(18, 18, 18)
                .addGroup(panelInformacionDeEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(lblApellidosEmpleado))
                .addGap(18, 18, 18)
                .addGroup(panelInformacionDeEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(lblDepartamentoEmpleado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEditarEmpleado)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelSubMenuLayout = new javax.swing.GroupLayout(panelSubMenu);
        panelSubMenu.setLayout(panelSubMenuLayout);
        panelSubMenuLayout.setHorizontalGroup(
            panelSubMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSubMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDeFunciones, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelInformacionDeEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelSubMenuLayout.setVerticalGroup(
            panelSubMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSubMenuLayout.createSequentialGroup()
                .addGroup(panelSubMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSubMenuLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(panelDeFunciones, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE))
                    .addGroup(panelSubMenuLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(panelInformacionDeEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout VistaSubMenuLayout = new javax.swing.GroupLayout(VistaSubMenu.getContentPane());
        VistaSubMenu.getContentPane().setLayout(VistaSubMenuLayout);
        VistaSubMenuLayout.setHorizontalGroup(
            VistaSubMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSubMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        VistaSubMenuLayout.setVerticalGroup(
            VistaSubMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSubMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.setBackground(java.awt.Color.white);

        lblFechaDeEmision.setText("Fecha de Emision");

        btnEmitir.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        btnEmitir.setText("Emitir");

        jLabel10.setText("Días de permiso");

        jLabel13.setText("Fecha de inicio");

        jLabel14.setText("Fecha de elaboración:");

        txtDiasDePermiso.setModel(new javax.swing.SpinnerNumberModel(0, 0, 3, 1));

        jLabel3.setText("Remunerado");

        chRemunerado.setText("Sí / No");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(lblFechaDeEmision)
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(btnEmitir)
                        .addContainerGap())))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel13)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fechaDeIncio, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiasDePermiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chRemunerado))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaDeEmision)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fechaDeIncio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiasDePermiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(chRemunerado))
                .addGap(13, 13, 13)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEmitir)
                .addContainerGap())
        );

        javax.swing.GroupLayout NuevoPermisoLayout = new javax.swing.GroupLayout(NuevoPermiso.getContentPane());
        NuevoPermiso.getContentPane().setLayout(NuevoPermisoLayout);
        NuevoPermisoLayout.setHorizontalGroup(
            NuevoPermisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        NuevoPermisoLayout.setVerticalGroup(
            NuevoPermisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        VistaInasistenciaSemanal.setTitle("Reporte de Inasistencia Semanal");

        jPanel3.setBackground(java.awt.Color.white);

        tablaInasistenciaLunes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Cédula", "Empleado", "Justificada"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaInasistenciaLunes.setRowHeight(30);
        tablaInasistenciaLunes.setShowHorizontalLines(false);
        tablaInasistenciaLunes.setShowVerticalLines(false);
        tablaInasistenciaLunes.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tablaInasistenciaLunes);
        if (tablaInasistenciaLunes.getColumnModel().getColumnCount() > 0) {
            tablaInasistenciaLunes.getColumnModel().getColumn(0).setResizable(false);
            tablaInasistenciaLunes.getColumnModel().getColumn(1).setResizable(false);
            tablaInasistenciaLunes.getColumnModel().getColumn(2).setResizable(false);
        }

        tablaInasistenciaMiercoles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "", "", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaInasistenciaMiercoles.setRowHeight(30);
        tablaInasistenciaMiercoles.setShowHorizontalLines(false);
        tablaInasistenciaMiercoles.setShowVerticalLines(false);
        tablaInasistenciaMiercoles.getTableHeader().setReorderingAllowed(false);
        jScrollPane12.setViewportView(tablaInasistenciaMiercoles);
        if (tablaInasistenciaMiercoles.getColumnModel().getColumnCount() > 0) {
            tablaInasistenciaMiercoles.getColumnModel().getColumn(0).setResizable(false);
            tablaInasistenciaMiercoles.getColumnModel().getColumn(1).setResizable(false);
            tablaInasistenciaMiercoles.getColumnModel().getColumn(2).setResizable(false);
        }

        tablaInasistenciaMartes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "", "", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaInasistenciaMartes.setRowHeight(30);
        tablaInasistenciaMartes.setShowHorizontalLines(false);
        tablaInasistenciaMartes.setShowVerticalLines(false);
        tablaInasistenciaMartes.getTableHeader().setReorderingAllowed(false);
        jScrollPane13.setViewportView(tablaInasistenciaMartes);
        if (tablaInasistenciaMartes.getColumnModel().getColumnCount() > 0) {
            tablaInasistenciaMartes.getColumnModel().getColumn(0).setResizable(false);
            tablaInasistenciaMartes.getColumnModel().getColumn(1).setResizable(false);
            tablaInasistenciaMartes.getColumnModel().getColumn(2).setResizable(false);
        }

        tablaInasistenciaJueves.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "", "", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaInasistenciaJueves.setRowHeight(30);
        tablaInasistenciaJueves.setShowHorizontalLines(false);
        tablaInasistenciaJueves.setShowVerticalLines(false);
        tablaInasistenciaJueves.getTableHeader().setReorderingAllowed(false);
        jScrollPane14.setViewportView(tablaInasistenciaJueves);
        if (tablaInasistenciaJueves.getColumnModel().getColumnCount() > 0) {
            tablaInasistenciaJueves.getColumnModel().getColumn(0).setResizable(false);
            tablaInasistenciaJueves.getColumnModel().getColumn(1).setResizable(false);
            tablaInasistenciaJueves.getColumnModel().getColumn(2).setResizable(false);
        }

        tablaInasistenciaViernes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "", "", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaInasistenciaViernes.setRowHeight(30);
        tablaInasistenciaViernes.setShowHorizontalLines(false);
        tablaInasistenciaViernes.setShowVerticalLines(false);
        tablaInasistenciaViernes.getTableHeader().setReorderingAllowed(false);
        jScrollPane15.setViewportView(tablaInasistenciaViernes);
        if (tablaInasistenciaViernes.getColumnModel().getColumnCount() > 0) {
            tablaInasistenciaViernes.getColumnModel().getColumn(0).setResizable(false);
            tablaInasistenciaViernes.getColumnModel().getColumn(1).setResizable(false);
            tablaInasistenciaViernes.getColumnModel().getColumn(2).setResizable(false);
        }

        lblFechaLunes.setText("No hubo!");

        lblFechaMartes.setText("No hubo!");

        lblFechaMiercoles.setText("No hubo!");

        lblFechaJueves.setText("No hubo!");

        lblFechaViernes.setText("No hubo!");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane15, javax.swing.GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane12))
                        .addGap(28, 28, 28))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFechaLunes, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFechaMartes, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFechaMiercoles, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFechaJueves, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFechaViernes, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFechaLunes)
                .addGap(7, 7, 7)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(lblFechaMartes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(lblFechaMiercoles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(lblFechaJueves)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblFechaViernes)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout VistaInasistenciaSemanalLayout = new javax.swing.GroupLayout(VistaInasistenciaSemanal.getContentPane());
        VistaInasistenciaSemanal.getContentPane().setLayout(VistaInasistenciaSemanalLayout);
        VistaInasistenciaSemanalLayout.setHorizontalGroup(
            VistaInasistenciaSemanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        VistaInasistenciaSemanalLayout.setVerticalGroup(
            VistaInasistenciaSemanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        VistaSeleccionDeFecha.setTitle("Seleccione una Fecha");

        jPanel5.setBackground(java.awt.Color.white);

        jLabel15.setText("Fecha");

        btnVerInasistenciaSemanal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/icon/if_calendar_2_42176.png"))); // NOI18N
        btnVerInasistenciaSemanal.setText("Ver");
        btnVerInasistenciaSemanal.setDescription("Detalle de semana");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVerInasistenciaSemanal, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(fechaInasistenciaSemanal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 52, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(fechaInasistenciaSemanal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(btnVerInasistenciaSemanal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout VistaSeleccionDeFechaLayout = new javax.swing.GroupLayout(VistaSeleccionDeFecha.getContentPane());
        VistaSeleccionDeFecha.getContentPane().setLayout(VistaSeleccionDeFechaLayout);
        VistaSeleccionDeFechaLayout.setHorizontalGroup(
            VistaSeleccionDeFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        VistaSeleccionDeFechaLayout.setVerticalGroup(
            VistaSeleccionDeFechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        VistaSeleccionDeMesYQuincena.setTitle("Seleccione una Fecha");

        jPanel6.setBackground(java.awt.Color.white);

        jLabel16.setText("Mes");

        jLabel21.setText("Año");

        jLabel24.setText("Quincena");

        cmbQuincena.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2" }));

        buttonTask1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/icon/if_calendar_2_42176.png"))); // NOI18N
        buttonTask1.setText("Ver");
        buttonTask1.setDescription("detalle de quincena");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel16))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel24)))
                .addGap(6, 6, 6)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mesReporteQuincenal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbQuincena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel21)
                .addGap(6, 6, 6)
                .addComponent(anioReporteQuincenal, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(buttonTask1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(jLabel16)
                    .addComponent(anioReporteQuincenal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mesReporteQuincenal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(cmbQuincena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(buttonTask1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout VistaSeleccionDeMesYQuincenaLayout = new javax.swing.GroupLayout(VistaSeleccionDeMesYQuincena.getContentPane());
        VistaSeleccionDeMesYQuincena.getContentPane().setLayout(VistaSeleccionDeMesYQuincenaLayout);
        VistaSeleccionDeMesYQuincenaLayout.setHorizontalGroup(
            VistaSeleccionDeMesYQuincenaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        VistaSeleccionDeMesYQuincenaLayout.setVerticalGroup(
            VistaSeleccionDeMesYQuincenaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        VistaVerJustificacion.setTitle("Detalle de Justificación");

        jPanel8.setBackground(java.awt.Color.white);

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/png/glyphicons-649-important-day.png"))); // NOI18N

        lblFechaDeJustificacion.setText("fecha");

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/png/glyphicons-54-alarm.png"))); // NOI18N

        lblHoraDeJustificacion.setText("hora");

        txtObservacionJustificacion.setEditable(false);
        txtObservacionJustificacion.setColumns(20);
        txtObservacionJustificacion.setRows(5);
        jScrollPane5.setViewportView(txtObservacionJustificacion);

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/png/glyphicons-151-edit.png"))); // NOI18N

        jLabel33.setText("Observación");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel33))
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblFechaDeJustificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblHoraDeJustificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblFechaDeJustificacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblHoraDeJustificacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel32)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout VistaVerJustificacionLayout = new javax.swing.GroupLayout(VistaVerJustificacion.getContentPane());
        VistaVerJustificacion.getContentPane().setLayout(VistaVerJustificacionLayout);
        VistaVerJustificacionLayout.setHorizontalGroup(
            VistaVerJustificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        VistaVerJustificacionLayout.setVerticalGroup(
            VistaVerJustificacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel9.setBackground(java.awt.Color.white);

        jLabel34.setText("Fecha");

        btnVerReporteDeAsistencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/icon/if_calendar_2_42176.png"))); // NOI18N
        btnVerReporteDeAsistencia.setText("Ver");
        btnVerReporteDeAsistencia.setDescription("Detalle del día");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel34)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(calendarFechaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(138, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVerReporteDeAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calendarFechaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnVerReporteDeAsistencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout VistaSeleccionarFechaESLayout = new javax.swing.GroupLayout(VistaSeleccionarFechaES.getContentPane());
        VistaSeleccionarFechaES.getContentPane().setLayout(VistaSeleccionarFechaESLayout);
        VistaSeleccionarFechaESLayout.setHorizontalGroup(
            VistaSeleccionarFechaESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        VistaSeleccionarFechaESLayout.setVerticalGroup(
            VistaSeleccionarFechaESLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        VistaInasistenciasSemanalPersonal.setTitle("Inasistencias Semanal Personal");

        jPanel10.setBackground(java.awt.Color.white);

        listaDeInasistenciasSemanalDeEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Días")));
        jScrollPane9.setViewportView(listaDeInasistenciasSemanalDeEmpleado);

        jLabel38.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel38.setText("Total de Inasistencias:");

        lblTotalInasistenciaSemanal.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        lblTotalInasistenciaSemanal.setText("total");

        jPanel12.setBackground(java.awt.Color.white);
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Empleado"));

        jLabel35.setText("Empleado:");

        lblEmpleadoInasistenciaSemanal.setText("empleado");

        jLabel36.setText("Cédula:");

        lblCedulaInasistenciaSemanal.setText("cedula");

        jLabel37.setText("Departamento:");

        lblDepartamentoInasistenciaSemanal.setText("departamento");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel37)
                    .addComponent(jLabel36)
                    .addComponent(jLabel35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblEmpleadoInasistenciaSemanal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCedulaInasistenciaSemanal, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDepartamentoInasistenciaSemanal, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(lblEmpleadoInasistenciaSemanal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCedulaInasistenciaSemanal)
                    .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(lblDepartamentoInasistenciaSemanal))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTotalInasistenciaSemanal))
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(lblTotalInasistenciaSemanal))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout VistaInasistenciasSemanalPersonalLayout = new javax.swing.GroupLayout(VistaInasistenciasSemanalPersonal.getContentPane());
        VistaInasistenciasSemanalPersonal.getContentPane().setLayout(VistaInasistenciasSemanalPersonalLayout);
        VistaInasistenciasSemanalPersonalLayout.setHorizontalGroup(
            VistaInasistenciasSemanalPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        VistaInasistenciasSemanalPersonalLayout.setVerticalGroup(
            VistaInasistenciasSemanalPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel11.setBackground(java.awt.Color.white);

        jLabel39.setText("Fecha");

        btnVerInasistenciaSemanalPersonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/icon/if_calendar_2_42176.png"))); // NOI18N
        btnVerInasistenciaSemanalPersonal.setText("Ver");
        btnVerInasistenciaSemanalPersonal.setDescription("Detalle de semana");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVerInasistenciaSemanalPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel39)
                            .addComponent(fechaInasistenciaSemanalPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 52, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel39)
                .addGap(18, 18, 18)
                .addComponent(fechaInasistenciaSemanalPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVerInasistenciaSemanalPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout VistaSeleccionarFechaInasistenciaSemanalPersonalLayout = new javax.swing.GroupLayout(VistaSeleccionarFechaInasistenciaSemanalPersonal.getContentPane());
        VistaSeleccionarFechaInasistenciaSemanalPersonal.getContentPane().setLayout(VistaSeleccionarFechaInasistenciaSemanalPersonalLayout);
        VistaSeleccionarFechaInasistenciaSemanalPersonalLayout.setHorizontalGroup(
            VistaSeleccionarFechaInasistenciaSemanalPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        VistaSeleccionarFechaInasistenciaSemanalPersonalLayout.setVerticalGroup(
            VistaSeleccionarFechaInasistenciaSemanalPersonalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Empleados.setTitle("Lista de Empleados");

        panel4.setColorPrimario(new java.awt.Color(255, 255, 255));
        panel4.setColorSecundario(java.awt.Color.white);

        panel5.setBackground(java.awt.Color.white);
        panel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Empleados"));
        panel5.setColorPrimario(java.awt.Color.white);
        panel5.setColorSecundario(java.awt.Color.white);

        listaDeEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cédula", "Nombre", "Apellido", "Departamento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listaDeEmpleados.setFocusable(false);
        listaDeEmpleados.setRowHeight(30);
        listaDeEmpleados.setRowMargin(3);
        listaDeEmpleados.setShowHorizontalLines(false);
        listaDeEmpleados.setShowVerticalLines(false);
        listaDeEmpleados.getTableHeader().setReorderingAllowed(false);
        jScrollPane10.setViewportView(listaDeEmpleados);

        jLabel40.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("Búsqueda por cédula");

        txtEmpleadoABuscar.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel41.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel41.setText("Departamento");

        cmbFiltrarPorDepartamento.setBackground(java.awt.Color.white);

        javax.swing.GroupLayout panel5Layout = new javax.swing.GroupLayout(panel5);
        panel5.setLayout(panel5Layout);
        panel5Layout.setHorizontalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel5Layout.createSequentialGroup()
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbFiltrarPorDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmpleadoABuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(panel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane10)
                        .addContainerGap())))
        );
        panel5Layout.setVerticalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(txtEmpleadoABuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41)
                    .addComponent(cmbFiltrarPorDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(panel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout EmpleadosLayout = new javax.swing.GroupLayout(Empleados.getContentPane());
        Empleados.getContentPane().setLayout(EmpleadosLayout);
        EmpleadosLayout.setHorizontalGroup(
            EmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        EmpleadosLayout.setVerticalGroup(
            EmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cacao Oderí");

        jPanel2.setBackground(java.awt.Color.white);

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        barraEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/png/glyphicons-25-parents.png"))); // NOI18N
        barraEmpleado.setText("Empleado");
        barraEmpleado.setFocusable(false);
        barraEmpleado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        barraEmpleado.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(barraEmpleado);
        jToolBar1.add(jSeparator2);

        barraRegistroDeAsistencias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/png/glyphicons-530-list-alt.png"))); // NOI18N
        barraRegistroDeAsistencias.setText("Registro de Asistencias");
        barraRegistroDeAsistencias.setFocusable(false);
        barraRegistroDeAsistencias.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        barraRegistroDeAsistencias.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(barraRegistroDeAsistencias);
        jToolBar1.add(jSeparator3);

        barraEntradasSalidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/png/glyphicons-622-businessman.png"))); // NOI18N
        barraEntradasSalidas.setText("Entradas y Salidas");
        barraEntradasSalidas.setFocusable(false);
        barraEntradasSalidas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        barraEntradasSalidas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(barraEntradasSalidas);
        jToolBar1.add(jSeparator4);

        barraEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/png/glyphicons-30-notes-2.png"))); // NOI18N
        barraEmpleados.setText("Empleados");
        barraEmpleados.setFocusable(false);
        barraEmpleados.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        barraEmpleados.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(barraEmpleados);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 208, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 497, Short.MAX_VALUE))
        );

        barraDeMenu.setForeground(java.awt.Color.white);
        barraDeMenu.setFocusable(false);

        Archivo.setText("Archivo");
        Archivo.setRequestFocusEnabled(false);

        itemEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/png/glyphicons-25-parents.png"))); // NOI18N
        itemEmpleado.setText("Empleado");
        Archivo.add(itemEmpleado);

        barraDeMenu.add(Archivo);

        Control.setText("Control");

        itemAsistenciaDiaria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/png/glyphicons-530-list-alt.png"))); // NOI18N
        itemAsistenciaDiaria.setText("Registro de Asistencias");
        Control.add(itemAsistenciaDiaria);

        barraDeMenu.add(Control);

        Consultas.setText("Consultas");

        jMenu1.setText("Asistencias");

        itemEntradaSalida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/png/glyphicons-622-businessman.png"))); // NOI18N
        itemEntradaSalida.setText("Entrada y Salida");
        jMenu1.add(itemEntradaSalida);

        Consultas.add(jMenu1);

        jMenu2.setText("Inasistencias");

        itemInasistenciaSemanalGeneral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/png/glyphicons-704-file-minus.png"))); // NOI18N
        itemInasistenciaSemanalGeneral.setText("Semanal");
        jMenu2.add(itemInasistenciaSemanalGeneral);

        itemInasistenciaQuincenalGeneral.setText("Quincenal");
        jMenu2.add(itemInasistenciaQuincenalGeneral);

        Consultas.add(jMenu2);

        itemEmpleadosConsulta.setText("Empleados");
        Consultas.add(itemEmpleadosConsulta);

        barraDeMenu.add(Consultas);

        Ayuda.setText("Ayuda");

        itemManual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/png/glyphicons-196-info-sign.png"))); // NOI18N
        itemManual.setText("Sobre la aplicación");
        Ayuda.add(itemManual);

        barraDeMenu.add(Ayuda);

        setJMenuBar(barraDeMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Archivo;
    private javax.swing.JMenu Ayuda;
    private javax.swing.JMenu Consultas;
    private javax.swing.JMenu Control;
    public javax.swing.JDialog Empleados;
    public javax.swing.JDialog InasistenciaPersonal;
    public javax.swing.JDialog Login;
    public javax.swing.JDialog NuevoEmpleado;
    public javax.swing.JDialog NuevoPermiso;
    public javax.swing.JDialog ReporteDeInasistenciaActual;
    public javax.swing.JDialog VistaBuscarEmpleado;
    public javax.swing.JDialog VistaDeAsistenciaDiaria;
    public javax.swing.JDialog VistaInasistenciaSemanal;
    public javax.swing.JDialog VistaInasistenciasSemanalPersonal;
    public javax.swing.JDialog VistaJustificacion;
    public javax.swing.JDialog VistaReporteDeAsistencia;
    public javax.swing.JDialog VistaSeleccionDeFecha;
    public javax.swing.JDialog VistaSeleccionDeMesYQuincena;
    public javax.swing.JDialog VistaSeleccionarDepartamento;
    public javax.swing.JDialog VistaSeleccionarFechaES;
    public javax.swing.JDialog VistaSeleccionarFechaInasistenciaSemanalPersonal;
    public javax.swing.JDialog VistaSubMenu;
    public javax.swing.JDialog VistaVerJustificacion;
    private com.toedter.calendar.JYearChooser anioReporteQuincenal;
    public javax.swing.JTextArea areaObservacion;
    private javax.swing.JMenuBar barraDeMenu;
    public javax.swing.JButton barraEmpleado;
    public javax.swing.JButton barraEmpleados;
    public javax.swing.JButton barraEntradasSalidas;
    public javax.swing.JButton barraRegistroDeAsistencias;
    public javax.swing.JButton btnAgregarDepartamento;
    public javax.swing.JButton btnAsignarDepartamento;
    public javax.swing.JButton btnBuscarEmpleado;
    public javax.swing.JButton btnConsultarInasistencia;
    public javax.swing.JButton btnCrearJustificacion;
    public javax.swing.JButton btnEditarEmpleado;
    public javax.swing.JButton btnEmitir;
    public org.edisoncor.gui.button.ButtonTask btnEntrada;
    public javax.swing.JButton btnEntrar;
    public org.edisoncor.gui.button.ButtonTask btnFinalizarJornada;
    public javax.swing.JButton btnGuardarEmpleado;
    public org.edisoncor.gui.button.ButtonTask btnInasistenciasDeEmpleado;
    public org.edisoncor.gui.button.ButtonTask btnInformacionPersonal;
    public org.edisoncor.gui.button.ButtonTask btnIniciarJornada;
    public javax.swing.JButton btnJustificar;
    public org.edisoncor.gui.button.ButtonTask btnPermisosEmpleado;
    public org.edisoncor.gui.button.ButtonTask btnReporte;
    public org.edisoncor.gui.button.ButtonTask btnSalida;
    public org.edisoncor.gui.button.ButtonTask btnSalirEmpleado;
    public org.edisoncor.gui.button.ButtonTask btnVerInasistenciaSemanal;
    public org.edisoncor.gui.button.ButtonTask btnVerInasistenciaSemanalPersonal;
    public javax.swing.JButton btnVerInasistenciasSemnalDeEmpleado;
    public javax.swing.JButton btnVerJustificacion;
    public org.edisoncor.gui.button.ButtonTask btnVerReporteDeAsistencia;
    private org.edisoncor.gui.button.ButtonTask buttonTask1;
    public com.toedter.calendar.JDateChooser calendarFechaConsulta;
    private javax.swing.JCheckBox chRemunerado;
    public javax.swing.JComboBox<String> cmbFiltrarPorDepartamento;
    public javax.swing.JComboBox<String> cmbQuincena;
    public com.toedter.calendar.JDateChooser fechaDeIncio;
    public com.toedter.calendar.JCalendar fechaInasistenciaSemanal;
    public com.toedter.calendar.JCalendar fechaInasistenciaSemanalPersonal;
    public javax.swing.JMenuItem itemAsistenciaDiaria;
    public javax.swing.JMenuItem itemEmpleado;
    public javax.swing.JMenuItem itemEmpleadosConsulta;
    public javax.swing.JMenuItem itemEntradaSalida;
    public javax.swing.JMenuItem itemInasistenciaQuincenalGeneral;
    public javax.swing.JMenuItem itemInasistenciaSemanalGeneral;
    private javax.swing.JMenuItem itemManual;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar jToolBar1;
    public javax.swing.JLabel lblApellidosEmpleado;
    public javax.swing.JLabel lblCedulaEmpleado;
    public javax.swing.JLabel lblCedulaInasistenciaSemanal;
    public javax.swing.JLabel lblDepartamentoEmpleado;
    public javax.swing.JLabel lblDepartamentoInasistenciaSemanal;
    public javax.swing.JLabel lblEmpleadoInasistenciaSemanal;
    public javax.swing.JLabel lblEstado;
    public javax.swing.JLabel lblFecha;
    public javax.swing.JLabel lblFechaDeEmision;
    public javax.swing.JLabel lblFechaDeInasistencia;
    public javax.swing.JLabel lblFechaDeJustificacion;
    public javax.swing.JLabel lblFechaEntradaSalida;
    public javax.swing.JLabel lblFechaJueves;
    public javax.swing.JLabel lblFechaLunes;
    public javax.swing.JLabel lblFechaMartes;
    public javax.swing.JLabel lblFechaMiercoles;
    public javax.swing.JLabel lblFechaViernes;
    public javax.swing.JLabel lblHoraCierre;
    public javax.swing.JLabel lblHoraDeGeneracion;
    public javax.swing.JLabel lblHoraDeJustificacion;
    public javax.swing.JLabel lblHoraInicio;
    public javax.swing.JLabel lblNombreEmpleado;
    public javax.swing.JLabel lblTotalInasistenciaSemanal;
    public javax.swing.JTable listaDeAsistencia;
    public javax.swing.JTable listaDeEmpleados;
    public javax.swing.JTable listaDeInasistenciaPorEmpleado;
    public javax.swing.JTable listaDeInasistenciasDiaria;
    public javax.swing.JList<String> listaDeInasistenciasSemanalDeEmpleado;
    public javax.swing.JTable listadoDeDepartamentos;
    public com.toedter.calendar.JMonthChooser mesInasistencia;
    private com.toedter.calendar.JMonthChooser mesReporteQuincenal;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.panel.Panel panel12;
    private org.edisoncor.gui.panel.Panel panel13;
    private org.edisoncor.gui.panel.Panel panel2;
    private org.edisoncor.gui.panel.Panel panel3;
    private org.edisoncor.gui.panel.Panel panel4;
    private org.edisoncor.gui.panel.Panel panel5;
    private org.edisoncor.gui.panel.Panel panel6;
    private org.edisoncor.gui.panel.Panel panel7;
    private org.edisoncor.gui.panel.Panel panel8;
    private org.edisoncor.gui.panel.Panel panel9;
    private javax.swing.JPanel panelDeFunciones;
    public javax.swing.JPanel panelInformacionDeEmpleado;
    private javax.swing.JPanel panelSubMenu;
    public javax.swing.JTable tablaInasistenciaJueves;
    public javax.swing.JTable tablaInasistenciaLunes;
    public javax.swing.JTable tablaInasistenciaMartes;
    public javax.swing.JTable tablaInasistenciaMiercoles;
    public javax.swing.JTable tablaInasistenciaViernes;
    public javax.swing.JTable tablaReportAsistencia;
    public org.edisoncor.gui.textField.TextFieldRectImage txtApellidoEmpleado;
    public org.edisoncor.gui.textField.TextFieldRectImage txtBusquedaPorCedula;
    public javax.swing.JTextField txtCedula;
    public javax.swing.JTextField txtCedulaEmpleadoBuscar;
    public org.edisoncor.gui.passwordField.PasswordFieldRoundImage txtClave;
    public org.edisoncor.gui.textField.TextFieldRectImage txtDepartamentoAsignado;
    public javax.swing.JSpinner txtDiasDePermiso;
    public org.edisoncor.gui.textField.TextFieldRectIcon txtEmpleadoABuscar;
    public org.edisoncor.gui.textField.TextFieldRoundImage txtNombreDeUsuario;
    public org.edisoncor.gui.textField.TextFieldRectImage txtNombreEmpleado;
    public javax.swing.JTextArea txtObservacionJustificacion;
    public com.toedter.calendar.JYearChooser yearInasistencia;
    // End of variables declaration//GEN-END:variables

}