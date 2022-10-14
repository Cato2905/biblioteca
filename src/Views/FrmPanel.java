package Views;

import Models.Autor;
import Models.AutorDao;
import Models.Combo;
import Models.Editorial;
import Models.EditorialDao;
import Models.Empresa;
import Models.Socios;
import Models.SociosDao;
import Models.Libros;
import Models.LibrosDao;
import Models.Documentos;
import Models.DocumentosDao;
import Models.Prestamos;
import Models.PrestamosDao;
import Models.Usuarios;
import Models.UsuariosDao;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public final class FrmPanel extends javax.swing.JFrame {

    Usuarios user = new Usuarios();
    UsuariosDao usuarioDao = new UsuariosDao();
    Editorial editorial = new Editorial();
    EditorialDao editorialDao = new EditorialDao();
    Autor autor = new Autor();
    AutorDao autorDao = new AutorDao();
    Documentos documento = new Documentos();
    DocumentosDao documentosDao = new DocumentosDao();
    Socios socios = new Socios();
    SociosDao sociosDao = new SociosDao();
    Libros libro = new Libros();
    LibrosDao libroDao = new LibrosDao();
    Prestamos prestamo = new Prestamos();
    PrestamosDao prestamoDao = new PrestamosDao();
    DefaultTableModel modelo = new DefaultTableModel();

    public FrmPanel(String user) {
        initComponents();
        this.setLocationRelativeTo(null);
        jTabbedPane1.setSelectedIndex(6);
        jTabbedPane1.setEnabledAt(0, false);
        jTabbedPane1.setEnabledAt(1, false);
        jTabbedPane1.setEnabledAt(2, false);
        jTabbedPane1.setEnabledAt(3, false);
        jTabbedPane1.setEnabledAt(4, false);
        jTabbedPane1.setEnabledAt(5, false);
        jTabbedPane1.setEnabledAt(6, false);
        jTabbedPane1.setEnabledAt(7, false);
        txtIdAutor.setVisible(false);
        txtIdEditorial.setVisible(false);
        txtIdEmpresa.setVisible(false);
        txtIdEst.setVisible(false);
        txtIdLibro.setVisible(false);
        txtIdDocumento.setVisible(false);
        txtIdUser.setVisible(false);
        txtIdPrestamo.setVisible(false);
        txtIdLAutor.setVisible(false);
        txtIdLEdi.setVisible(false);
        txtIdLMat.setVisible(false);
        MenuPrestamo.setEnabled(false);
        cbxSocio.removeAllItems();
        cbxLibros.removeAllItems();
        cbxLibros1.removeAllItems();
        cbxLibros2.removeAllItems();
        llenarSocio();
        llenarLibros();
        AutoCompleteDecorator.decorate(cbxSocio);
        AutoCompleteDecorator.decorate(cbxLibros);
        AutoCompleteDecorator.decorate(cbxLibros1);
        AutoCompleteDecorator.decorate(cbxLibros2);
        LimpiarTable();
        ListarPrestamo();
        Calendar c2 = new GregorianCalendar();
        txtFechaDev.setCalendar(c2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnRegUser = new javax.swing.JButton();
        btnElUser = new javax.swing.JButton();
        txtClave = new javax.swing.JPasswordField();
        txtIdUser = new javax.swing.JTextField();
        btnNuevoUsuario = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        jLabel36 = new javax.swing.JLabel();
        txtBuscarUser = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        txtEditorial = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtIdEditorial = new javax.swing.JTextField();
        btnRegEditorial = new javax.swing.JButton();
        btnEliEditorial = new javax.swing.JButton();
        btnNuevoEditorial = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEditorial = new javax.swing.JTable();
        jLabel35 = new javax.swing.JLabel();
        txtBuscarEditorial = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblAutor = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        txtAutor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtIdAutor = new javax.swing.JTextField();
        btnRegAutor = new javax.swing.JButton();
        txtEliAutor = new javax.swing.JButton();
        btnNuevoAutor = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        txtBuscarAutor = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cbxAutor = new javax.swing.JComboBox<>();
        cbxEditorial = new javax.swing.JComboBox<>();
        cbxDocumento = new javax.swing.JComboBox<>();
        txtCantLibro = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtIsbn = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtCodBarra = new javax.swing.JTextField();
        btnRegLibro = new javax.swing.JButton();
        btnEliLibro = new javax.swing.JButton();
        txtIdLibro = new javax.swing.JTextField();
        btnNuevoLibro = new javax.swing.JButton();
        txtIdLAutor = new javax.swing.JTextField();
        txtIdLEdi = new javax.swing.JTextField();
        txtIdLMat = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        txtBuscarLibro = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        txtResumen = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblLibros = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        txtDocumento = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtIdDocumento = new javax.swing.JTextField();
        btnRegDocumento = new javax.swing.JButton();
        btnEliDocumento = new javax.swing.JButton();
        btnNuevoDocumento = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblDocumento = new javax.swing.JTable();
        jLabel32 = new javax.swing.JLabel();
        txtBuscarDocumento = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        txtRut = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtEstudiante = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btnRegSocio = new javax.swing.JButton();
        btnEliEst = new javax.swing.JButton();
        txtIdEst = new javax.swing.JTextField();
        txtCarrera = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        btnNuevoEst = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        txtContrasena = new javax.swing.JPasswordField();
        jLabel38 = new javax.swing.JLabel();
        txtNacimiento = new com.toedter.calendar.JDateChooser();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblSocios = new javax.swing.JTable();
        jLabel31 = new javax.swing.JLabel();
        txtBuscarEst = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        txtCantPrestamo = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        btnPrestar = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        btnNuevoPrestamo = new javax.swing.JButton();
        cbxSocio = new javax.swing.JComboBox<>();
        cbxLibros = new javax.swing.JComboBox<>();
        txtFechaDev = new com.toedter.calendar.JDateChooser();
        txtIdPrestamo = new javax.swing.JTextField();
        txtBuscarPrestamo = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        cbxLibros1 = new javax.swing.JComboBox<>();
        txtCantPrestamo1 = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        cbxLibros2 = new javax.swing.JComboBox<>();
        txtCantPrestamo2 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        stock = new javax.swing.JTextField();
        stock1 = new javax.swing.JTextField();
        stock2 = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblPrestamo = new javax.swing.JTable();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        txtRucEmpresa = new javax.swing.JTextField();
        txtNombreEmpresa = new javax.swing.JTextField();
        txtTelefonoEmpresa = new javax.swing.JTextField();
        txtCorreoEmpresa = new javax.swing.JTextField();
        txtDireccionEmpresa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        btnModificarEmpresa = new javax.swing.JButton();
        txtIdEmpresa = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuUser = new javax.swing.JMenuItem();
        MenuContactos = new javax.swing.JMenuItem();
        MenuEst = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        MenuEditorial = new javax.swing.JMenuItem();
        MenuAutor = new javax.swing.JMenuItem();
        MenuLibro = new javax.swing.JMenuItem();
        MenuDocumento = new javax.swing.JMenu();
        MenuPrestamo = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Biblioteca");
        setBackground(new java.awt.Color(255, 255, 255));
        setExtendedState(6);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nuevo usuario", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel1.setText("Usuario");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel3.setText("Correo");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel4.setText("Contraseña");

        btnRegUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        btnRegUser.setText("Guardar");
        btnRegUser.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegUserActionPerformed(evt);
            }
        });

        btnElUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        btnElUser.setText("Eliminar");
        btnElUser.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnElUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElUserActionPerformed(evt);
            }
        });

        btnNuevoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo.png"))); // NOI18N
        btnNuevoUsuario.setText("Nuevo");
        btnNuevoUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCorreo)
                    .addComponent(txtClave)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(185, 185, 185)
                                .addComponent(txtIdUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addComponent(btnNuevoUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addComponent(btnRegUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(38, 38, 38)
                        .addComponent(btnElUser, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegUser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnElUser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnNuevoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Usuario", "Nombre", "Correo"
            }
        ));
        tblUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblUsuarios);

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        jLabel36.setText("Buscar");

        txtBuscarUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarUserKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addGap(9, 9, 9)
                        .addComponent(txtBuscarUser, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1037, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtBuscarUser, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );

        jTabbedPane1.addTab("Usuarios", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nueva Editorial", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel6.setText("Nombre");

        btnRegEditorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        btnRegEditorial.setText("Registrar");
        btnRegEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegEditorialActionPerformed(evt);
            }
        });

        btnEliEditorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        btnEliEditorial.setText("Eliminar");
        btnEliEditorial.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEliEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliEditorialActionPerformed(evt);
            }
        });

        btnNuevoEditorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo.png"))); // NOI18N
        btnNuevoEditorial.setText("Nuevo");
        btnNuevoEditorial.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNuevoEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoEditorialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEditorial)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtIdEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btnRegEditorial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addComponent(btnEliEditorial))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnNuevoEditorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(txtEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegEditorial)
                    .addComponent(btnEliEditorial))
                .addGap(18, 18, 18)
                .addComponent(btnNuevoEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(txtIdEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(220, Short.MAX_VALUE))
        );

        tblEditorial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Editorial"
            }
        ));
        tblEditorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEditorialMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblEditorial);

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        jLabel35.setText("Buscar");

        txtBuscarEditorial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarEditorialKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscarEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1036, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtBuscarEditorial, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );

        jTabbedPane1.addTab("Editorial", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tblAutor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Autor"
            }
        ));
        tblAutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAutorMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblAutor);

        jPanel7.setBackground(new java.awt.Color(204, 204, 204));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nuevo Autor", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel7.setText("Nombre");

        btnRegAutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        btnRegAutor.setText("Registrar");
        btnRegAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegAutorActionPerformed(evt);
            }
        });

        txtEliAutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        txtEliAutor.setText("Eliminar");
        txtEliAutor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtEliAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEliAutorActionPerformed(evt);
            }
        });

        btnNuevoAutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo.png"))); // NOI18N
        btnNuevoAutor.setText("Nuevo");
        btnNuevoAutor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNuevoAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoAutorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtIdAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel7)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                            .addComponent(btnRegAutor)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtEliAutor))
                        .addComponent(txtAutor)
                        .addComponent(btnNuevoAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEliAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(btnNuevoAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(txtIdAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(233, Short.MAX_VALUE))
        );

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        jLabel34.setText("Buscar");

        txtBuscarAutor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarAutorKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addGap(38, 38, 38)
                        .addComponent(txtBuscarAutor))
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 970, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(txtBuscarAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );

        jTabbedPane1.addTab("Autor", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel8.setBackground(new java.awt.Color(204, 204, 204));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nuevo Libro", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel8.setText("Título");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel9.setText("Autor");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel10.setText("Editorial");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel11.setText("Documento");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel12.setText("Cantidad");

        cbxAutor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxAutorItemStateChanged(evt);
            }
        });

        cbxEditorial.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxEditorialItemStateChanged(evt);
            }
        });

        cbxDocumento.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxDocumentoItemStateChanged(evt);
            }
        });
        cbxDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxDocumentoActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel13.setText("ISBN");

        txtIsbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIsbnActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel14.setText("Codigo de barras");

        btnRegLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        btnRegLibro.setText("Registrar");
        btnRegLibro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegLibroActionPerformed(evt);
            }
        });

        btnEliLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        btnEliLibro.setText("Eliminar");
        btnEliLibro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEliLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliLibroActionPerformed(evt);
            }
        });

        btnNuevoLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo.png"))); // NOI18N
        btnNuevoLibro.setText("Nuevo");
        btnNuevoLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoLibroActionPerformed(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel43.setText("Resumen");

        txtBuscarLibro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarLibroKeyReleased(evt);
            }
        });

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        jLabel33.setText("Buscar");

        txtResumen.setColumns(20);
        txtResumen.setRows(5);
        jScrollPane8.setViewportView(txtResumen);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 1369, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cbxAutor, javax.swing.GroupLayout.Alignment.LEADING, 0, 270, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTitulo, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(txtIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(cbxEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCodBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGap(283, 283, 283)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cbxDocumento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel10)))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14)
                                            .addComponent(txtCantLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addGap(78, 78, 78)
                                                .addComponent(jLabel13))))
                                    .addComponent(jLabel8))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(txtBuscarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel33)
                                .addGap(76, 76, 76)))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnNuevoLibro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRegLibro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(btnEliLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdLAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdLEdi, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdLMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel43)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13))
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtIdLAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnEliLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbxDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCantLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel10)
                                                    .addComponent(jLabel14))
                                                .addGap(6, 6, 6))))))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtIdLMat, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIdLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIdLEdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel33)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBuscarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel43))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRegLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnNuevoLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                .addContainerGap())
        );

        tblLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Título", "Cantidad", "ISBN", "Codigo de barras", "", "Editorial", "", "Autor", "", "Tipo documento", "Title 12"
            }
        ));
        tblLibros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLibrosMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblLibros);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 1389, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Libros", jPanel4);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nuevo Tipo de Documento", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel15.setText("Tipo de documento");

        btnRegDocumento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        btnRegDocumento.setText("Registrar");
        btnRegDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegDocumentoActionPerformed(evt);
            }
        });

        btnEliDocumento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        btnEliDocumento.setText("Eliminar");
        btnEliDocumento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEliDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliDocumentoActionPerformed(evt);
            }
        });

        btnNuevoDocumento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo.png"))); // NOI18N
        btnNuevoDocumento.setText("Nuevo");
        btnNuevoDocumento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNuevoDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoDocumentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnNuevoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel10Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel10Layout.createSequentialGroup()
                                    .addComponent(btnRegDocumento)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEliDocumento))
                                .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel10Layout.createSequentialGroup()
                                    .addGap(109, 109, 109)
                                    .addComponent(txtIdDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnNuevoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(txtIdDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(162, Short.MAX_VALUE))
        );

        tblDocumento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Tipo de documento"
            }
        ));
        tblDocumento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDocumentoMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tblDocumento);

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        jLabel32.setText("Buscar");

        txtBuscarDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarDocumentoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtBuscarDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 996, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtBuscarDocumento, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );

        jTabbedPane1.addTab("Tipo de documento", jPanel9);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jPanel12.setBackground(new java.awt.Color(204, 204, 204));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nuevo Socio", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N

        txtRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRutActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel16.setText("Rut");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel17.setText("Email");

        jLabel18.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel18.setText("Nombre");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel19.setText("Teléfono");

        jLabel20.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel20.setText("Direccion");

        btnRegSocio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        btnRegSocio.setText("Guardar");
        btnRegSocio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegSocioActionPerformed(evt);
            }
        });

        btnEliEst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        btnEliEst.setText("Eliminar");
        btnEliEst.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEliEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliEstActionPerformed(evt);
            }
        });

        txtCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCarreraActionPerformed(evt);
            }
        });

        btnNuevoEst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo.png"))); // NOI18N
        btnNuevoEst.setText("Nuevo");
        btnNuevoEst.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNuevoEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoEstActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel37.setText("Contraseña");

        jLabel38.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel38.setText("Fecha nacimiento");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtContrasena, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRut, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCarrera, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNuevoEst, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEstudiante, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel12Layout.createSequentialGroup()
                        .addComponent(btnRegSocio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliEst))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(210, 210, 210)
                                .addComponent(txtIdEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jLabel37)
                            .addComponent(jLabel38))
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtIdEst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(txtNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btnEliEst, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNuevoEst, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tblSocios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Rut", "Email", "Nombre", "Teléfono", "Direccion", "Fecha de nacimiento"
            }
        ));
        tblSocios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSociosMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tblSocios);

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        jLabel31.setText("Buscar");

        txtBuscarEst.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarEstKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscarEst, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 1037, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(txtBuscarEst))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Socios", jPanel11);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        jPanel16.setBackground(new java.awt.Color(204, 204, 204));
        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nuevo Prestamo", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 14))); // NOI18N

        jLabel25.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        jLabel25.setText("Socio");

        jLabel26.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        jLabel26.setText("Libro");

        jLabel27.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel27.setText("Fecha Devolución");

        btnPrestar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/prestamo.png"))); // NOI18N
        btnPrestar.setText("Prestar");
        btnPrestar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPrestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrestarActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel28.setText("Cantidad");

        btnNuevoPrestamo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo.png"))); // NOI18N
        btnNuevoPrestamo.setText("Nuevo");
        btnNuevoPrestamo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNuevoPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoPrestamoActionPerformed(evt);
            }
        });

        cbxSocio.setEditable(true);

        cbxLibros.setEditable(true);
        cbxLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxLibrosActionPerformed(evt);
            }
        });

        txtBuscarPrestamo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarPrestamoKeyReleased(evt);
            }
        });

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        jLabel30.setText("Buscar");

        cbxLibros1.setEditable(true);
        cbxLibros1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxLibros1ActionPerformed(evt);
            }
        });

        jLabel44.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel44.setText("Cantidad");

        jLabel45.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        jLabel45.setText("Libro");

        cbxLibros2.setEditable(true);
        cbxLibros2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxLibros2ActionPerformed(evt);
            }
        });

        jLabel46.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel46.setText("Cantidad");

        jLabel47.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        jLabel47.setText("Libro");

        jLabel39.setText("Stock");

        jLabel48.setText("Stock");

        jLabel49.setText("Stock");

        stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBuscarPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel16Layout.createSequentialGroup()
                                    .addComponent(jLabel27)
                                    .addGap(4, 4, 4)
                                    .addComponent(txtFechaDev, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel16Layout.createSequentialGroup()
                                    .addGap(16, 16, 16)
                                    .addComponent(jLabel25)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbxSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(txtIdPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPrestar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCantPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stock, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNuevoPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCantPrestamo1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxLibros1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stock1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel46)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCantPrestamo2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxLibros2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stock2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jLabel39)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(stock, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel25)
                                    .addComponent(cbxSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel26))
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel16Layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(jLabel27))
                                    .addGroup(jPanel16Layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtCantPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel28)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFechaDev, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnPrestar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBuscarPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addComponent(txtIdPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbxLibros1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel45))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCantPrestamo1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel44)))
                            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel16Layout.createSequentialGroup()
                                    .addComponent(jLabel48)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(stock2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(57, 57, 57))
                                .addGroup(jPanel16Layout.createSequentialGroup()
                                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cbxLibros2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel47))
                                    .addGap(25, 25, 25)
                                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtCantPrestamo2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel46))))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jLabel49)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(stock1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNuevoPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        tblPrestamo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Socio", "Libro 1", "Cant 1", "Libro 2", "Cant 2", "Libro 3", "Cant 3", "F. Prestamo", "F. Devolución", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, true, true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPrestamo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPrestamoMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tblPrestamo);
        if (tblPrestamo.getColumnModel().getColumnCount() > 0) {
            tblPrestamo.getColumnModel().getColumn(0).setHeaderValue("Id");
            tblPrestamo.getColumnModel().getColumn(1).setHeaderValue("Socio");
            tblPrestamo.getColumnModel().getColumn(2).setHeaderValue("Libro 1");
            tblPrestamo.getColumnModel().getColumn(3).setHeaderValue("Cant 1");
            tblPrestamo.getColumnModel().getColumn(4).setHeaderValue("Libro 2");
            tblPrestamo.getColumnModel().getColumn(5).setHeaderValue("Cant 2");
            tblPrestamo.getColumnModel().getColumn(6).setHeaderValue("Libro 3");
            tblPrestamo.getColumnModel().getColumn(7).setHeaderValue("Cant 3");
            tblPrestamo.getColumnModel().getColumn(8).setHeaderValue("F. Prestamo");
            tblPrestamo.getColumnModel().getColumn(9).setHeaderValue("F. Devolución");
            tblPrestamo.getColumnModel().getColumn(10).setHeaderValue("Estado");
        }

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 1389, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        jTabbedPane1.addTab("Prestamos", jPanel13);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        jPanel15.setBackground(new java.awt.Color(204, 204, 204));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de Contacto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 3, 18))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel5.setText("Ruc");

        jLabel21.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel21.setText("Nombre");

        jLabel22.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel22.setText("Teléfono");

        jLabel23.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel23.setText("Correo");

        jLabel24.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel24.setText("Dirección");

        btnModificarEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png"))); // NOI18N
        btnModificarEmpresa.setText("Modificar");
        btnModificarEmpresa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnModificarEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarEmpresaActionPerformed(evt);
            }
        });

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editorial.png"))); // NOI18N

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/materia.png"))); // NOI18N

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/libro.png"))); // NOI18N

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel24)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23)
                            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel42)
                                .addComponent(jLabel21)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtIdEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)))
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel41))
                    .addComponent(txtRucEmpresa)
                    .addComponent(txtTelefonoEmpresa)
                    .addComponent(txtCorreoEmpresa)
                    .addComponent(txtDireccionEmpresa)
                    .addComponent(txtNombreEmpresa)
                    .addComponent(btnModificarEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRucEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(27, 27, 27)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtTelefonoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtCorreoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(txtDireccionEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificarEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(116, Short.MAX_VALUE))
        );

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/biblioteca.png"))); // NOI18N

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, 978, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 675, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Contactos", jPanel14);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/config.png"))); // NOI18N
        jMenu1.setText("Administración");

        MenuUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/usuario.png"))); // NOI18N
        MenuUser.setText("Usuarios");
        MenuUser.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MenuUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuUserActionPerformed(evt);
            }
        });
        jMenu1.add(MenuUser);

        MenuContactos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/contactos.png"))); // NOI18N
        MenuContactos.setText("Contactos");
        MenuContactos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MenuContactos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuContactosActionPerformed(evt);
            }
        });
        jMenu1.add(MenuContactos);

        jMenuBar1.add(jMenu1);

        MenuEst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/estudiante.png"))); // NOI18N
        MenuEst.setText("Socios");
        MenuEst.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MenuEst.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuEstMouseClicked(evt);
            }
        });
        jMenuBar1.add(MenuEst);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/libro.png"))); // NOI18N
        jMenu5.setText("Libros");

        MenuEditorial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editorial.png"))); // NOI18N
        MenuEditorial.setText("Editorial");
        MenuEditorial.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MenuEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuEditorialActionPerformed(evt);
            }
        });
        jMenu5.add(MenuEditorial);

        MenuAutor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/autor.png"))); // NOI18N
        MenuAutor.setText("Autor");
        MenuAutor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MenuAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAutorActionPerformed(evt);
            }
        });
        jMenu5.add(MenuAutor);

        MenuLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/libros.png"))); // NOI18N
        MenuLibro.setText("Libros");
        MenuLibro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MenuLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuLibroActionPerformed(evt);
            }
        });
        jMenu5.add(MenuLibro);

        jMenuBar1.add(jMenu5);

        MenuDocumento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/materia.png"))); // NOI18N
        MenuDocumento.setText("Tipo de documento");
        MenuDocumento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MenuDocumento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuDocumentoMouseClicked(evt);
            }
        });
        jMenuBar1.add(MenuDocumento);

        MenuPrestamo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/prestamo.png"))); // NOI18N
        MenuPrestamo.setText("Prestamos");
        MenuPrestamo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MenuPrestamo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuPrestamoMouseClicked(evt);
            }
        });
        jMenuBar1.add(MenuPrestamo);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuUserActionPerformed
        MenuPrestamo.setEnabled(true);
        MenuEst.setEnabled(true);
        MenuUser.setEnabled(false);
        MenuContactos.setEnabled(true);
        MenuEditorial.setEnabled(true);
        MenuAutor.setEnabled(true);
        MenuDocumento.setEnabled(true);
        MenuLibro.setEnabled(true);
        LimpiarTable();
        ListarUsuarios();
        jTabbedPane1.setSelectedIndex(0);
        txtClave.setEnabled(true);
    }//GEN-LAST:event_MenuUserActionPerformed

    private void MenuLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuLibroActionPerformed
        tblLibros.getColumnModel().getColumn(5).setMaxWidth(0);
        tblLibros.getColumnModel().getColumn(5).setMinWidth(0);
        tblLibros.getTableHeader().getColumnModel().getColumn(5).setMaxWidth(0);
        tblLibros.getTableHeader().getColumnModel().getColumn(5).setMinWidth(0);
        tblLibros.getColumnModel().getColumn(7).setMaxWidth(0);
        tblLibros.getColumnModel().getColumn(7).setMinWidth(0);
        tblLibros.getTableHeader().getColumnModel().getColumn(7).setMaxWidth(0);
        tblLibros.getTableHeader().getColumnModel().getColumn(7).setMinWidth(0);
        tblLibros.getColumnModel().getColumn(9).setMaxWidth(0);
        tblLibros.getColumnModel().getColumn(9).setMinWidth(0);
        tblLibros.getTableHeader().getColumnModel().getColumn(9).setMaxWidth(0);
        tblLibros.getTableHeader().getColumnModel().getColumn(9).setMinWidth(0);
        cbxAutor.removeAllItems();
        llenarAutor();
        cbxEditorial.removeAllItems();
        llenarEditorial();
        cbxDocumento.removeAllItems();
        llenarDocumento();
        LimpiarTable();
        ListarLibros();
        jTabbedPane1.setSelectedIndex(3);
        MenuPrestamo.setEnabled(true);
        MenuEst.setEnabled(true);
        MenuUser.setEnabled(true);
        MenuContactos.setEnabled(true);
        MenuEditorial.setEnabled(true);
        MenuAutor.setEnabled(true);
        MenuDocumento.setEnabled(true);
        MenuLibro.setEnabled(false);
    }//GEN-LAST:event_MenuLibroActionPerformed

    private void MenuEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuEditorialActionPerformed
        MenuPrestamo.setEnabled(true);
        MenuEst.setEnabled(true);
        MenuUser.setEnabled(true);
        MenuContactos.setEnabled(true);
        MenuEditorial.setEnabled(false);
        MenuAutor.setEnabled(true);
        MenuDocumento.setEnabled(true);
        MenuLibro.setEnabled(true);
        LimpiarTable();
        ListarEditorial();
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_MenuEditorialActionPerformed

    private void MenuAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAutorActionPerformed
        MenuPrestamo.setEnabled(true);
        MenuEst.setEnabled(true);
        MenuUser.setEnabled(true);
        MenuContactos.setEnabled(true);
        MenuEditorial.setEnabled(true);
        MenuAutor.setEnabled(false);
        MenuDocumento.setEnabled(true);
        MenuLibro.setEnabled(true);
        LimpiarTable();
        ListarAutor();
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_MenuAutorActionPerformed

    private void btnRegUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegUserActionPerformed
        // TODO add your handling code here:
        registrarUsuario();
        LimpiarTable();
        ListarUsuarios();
    }//GEN-LAST:event_btnRegUserActionPerformed

    private void btnRegEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegEditorialActionPerformed
        registrarEditorial();
        LimpiarTable();
        ListarEditorial();
        limpiarEditorial();
    }//GEN-LAST:event_btnRegEditorialActionPerformed

    private void btnRegAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegAutorActionPerformed
        registrarAutor();
        LimpiarTable();
        ListarAutor();
        limpiarAutor();
    }//GEN-LAST:event_btnRegAutorActionPerformed

    private void btnRegLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegLibroActionPerformed
        registrarLibro();
        LimpiarTable();
        ListarLibros();
        limpiarLibros();
    }//GEN-LAST:event_btnRegLibroActionPerformed

    private void btnRegDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegDocumentoActionPerformed
        registrarDocumento();
        LimpiarTable();
        ListarDocumentos();
        limpiarDocumento();
    }//GEN-LAST:event_btnRegDocumentoActionPerformed

    private void btnRegSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegSocioActionPerformed
        registrarSocio();
        LimpiarTable();
        ListarSocios();
        limpiarSocios();
    }//GEN-LAST:event_btnRegSocioActionPerformed

    private void tblUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsuariosMouseClicked
        int fila = tblUsuarios.rowAtPoint(evt.getPoint());
        txtIdUser.setText(tblUsuarios.getValueAt(fila, 0).toString());
        txtUsuario.setText(tblUsuarios.getValueAt(fila, 1).toString());
        txtNombre.setText(tblUsuarios.getValueAt(fila, 2).toString());
        txtCorreo.setText(tblUsuarios.getValueAt(fila, 3).toString());
        txtClave.setEnabled(false);
        imgeditar(btnRegUser);
    }//GEN-LAST:event_tblUsuariosMouseClicked

    private void tblEditorialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEditorialMouseClicked
        int fila = tblEditorial.rowAtPoint(evt.getPoint());
        txtIdEditorial.setText(tblEditorial.getValueAt(fila, 0).toString());
        txtEditorial.setText(tblEditorial.getValueAt(fila, 1).toString());
        imgeditar(btnRegEditorial);
    }//GEN-LAST:event_tblEditorialMouseClicked

    private void tblSociosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSociosMouseClicked
        int fila = tblSocios.rowAtPoint(evt.getPoint());
        txtIdEst.setText(tblSocios.getValueAt(fila, 0).toString());
        txtRut.setText(tblSocios.getValueAt(fila, 1).toString());
        txtEmail.setText(tblSocios.getValueAt(fila, 2).toString());
        txtEstudiante.setText(tblSocios.getValueAt(fila, 3).toString());
        txtTelefono.setText(tblSocios.getValueAt(fila, 4).toString());
        txtCarrera.setText(tblSocios.getValueAt(fila, 5).toString());
        // txtNacimiento.setDate(tblSocios.getValueAt(fila, 6).toString());
        imgeditar(btnRegSocio);
    }//GEN-LAST:event_tblSociosMouseClicked

    private void tblDocumentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDocumentoMouseClicked
        int fila = tblDocumento.rowAtPoint(evt.getPoint());
        txtIdDocumento.setText(tblDocumento.getValueAt(fila, 0).toString());
        txtDocumento.setText(tblDocumento.getValueAt(fila, 1).toString());
        imgeditar(btnRegDocumento);
    }//GEN-LAST:event_tblDocumentoMouseClicked

    private void tblLibrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLibrosMouseClicked
        int fila = tblLibros.rowAtPoint(evt.getPoint());
        txtIdLibro.setText(tblLibros.getValueAt(fila, 0).toString());
        txtTitulo.setText(tblLibros.getValueAt(fila, 1).toString());
        txtCantLibro.setText(tblLibros.getValueAt(fila, 2).toString());
        txtIsbn.setText(tblLibros.getValueAt(fila, 3).toString());
        txtCodBarra.setText(tblLibros.getValueAt(fila, 4).toString());
        txtIdLEdi.setText(tblLibros.getValueAt(fila, 5).toString());
        cbxEditorial.setSelectedItem(tblLibros.getValueAt(fila, 6).toString());
        txtIdLAutor.setText(tblLibros.getValueAt(fila, 7).toString());
        cbxAutor.setSelectedItem(tblLibros.getValueAt(fila, 8).toString());
        txtIdLMat.setText(tblLibros.getValueAt(fila, 9).toString());
        cbxDocumento.setSelectedItem(tblLibros.getValueAt(fila, 10).toString());
        txtResumen.setText(tblLibros.getValueAt(fila, 11).toString());
        imgeditar(btnRegLibro);
    }//GEN-LAST:event_tblLibrosMouseClicked

    private void tblAutorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAutorMouseClicked
        int fila = tblAutor.rowAtPoint(evt.getPoint());
        txtIdAutor.setText(tblAutor.getValueAt(fila, 0).toString());
        txtAutor.setText(tblAutor.getValueAt(fila, 1).toString());
        imgeditar(btnRegAutor);
    }//GEN-LAST:event_tblAutorMouseClicked

    private void MenuEstMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuEstMouseClicked
        // TODO add your handling code here:
        LimpiarTable();
        ListarSocios();
        jTabbedPane1.setSelectedIndex(5);
        MenuPrestamo.setEnabled(true);
        MenuEst.setEnabled(false);
        MenuUser.setEnabled(true);
        MenuContactos.setEnabled(true);
        MenuEditorial.setEnabled(true);
        MenuAutor.setEnabled(true);
        MenuDocumento.setEnabled(true);
        MenuLibro.setEnabled(true);
    }//GEN-LAST:event_MenuEstMouseClicked

    private void MenuPrestamoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuPrestamoMouseClicked
        cbxSocio.removeAllItems();
        cbxLibros.removeAllItems();
        cbxLibros1.removeAllItems();
        cbxLibros2.removeAllItems();
        llenarSocio();
        llenarLibros();
        AutoCompleteDecorator.decorate(cbxSocio);
        AutoCompleteDecorator.decorate(cbxLibros);
        AutoCompleteDecorator.decorate(cbxLibros1);
        AutoCompleteDecorator.decorate(cbxLibros2);
        LimpiarTable();
        ListarPrestamo();
        jTabbedPane1.setSelectedIndex(6);
        MenuPrestamo.setEnabled(false);
        MenuEst.setEnabled(true);
        MenuUser.setEnabled(true);
        MenuContactos.setEnabled(true);
        MenuEditorial.setEnabled(true);
        MenuAutor.setEnabled(true);
        MenuDocumento.setEnabled(true);
        MenuLibro.setEnabled(true);
    }//GEN-LAST:event_MenuPrestamoMouseClicked

    private void MenuContactosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuContactosActionPerformed
        MenuPrestamo.setEnabled(true);
        MenuEst.setEnabled(true);
        MenuUser.setEnabled(true);
        MenuContactos.setEnabled(false);
        MenuEditorial.setEnabled(true);
        MenuAutor.setEnabled(true);
        MenuDocumento.setEnabled(true);
        MenuLibro.setEnabled(true);
        Empresa empresa = new Empresa();
        empresa = usuarioDao.getEmpresa();
        txtRucEmpresa.setText(empresa.getRuc());
        txtNombreEmpresa.setText(empresa.getNombre());
        txtTelefonoEmpresa.setText(empresa.getTelefono());
        txtCorreoEmpresa.setText(empresa.getCorreo());
        txtDireccionEmpresa.setText(empresa.getDireccion());
        txtIdEmpresa.setText("" + empresa.getId());
        jTabbedPane1.setSelectedIndex(7);
    }//GEN-LAST:event_MenuContactosActionPerformed

    private void btnEliEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliEstActionPerformed
        if (txtIdEst.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Seleccine una fila");
        } else {
            int pregunta = JOptionPane.showConfirmDialog(null, "¿ Esta seguro eliminar: ", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
            if (pregunta == 0) {
                if (sociosDao.eliminar(Integer.parseInt(txtIdEst.getText()))) {
                    LimpiarTable();
                    limpiarSocios();
                    ListarSocios();
                    JOptionPane.showMessageDialog(null, "Eliminado");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Eliminar");
                }
                imgregistrar(btnRegSocio);
            }
        }
    }//GEN-LAST:event_btnEliEstActionPerformed

    private void btnNuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoUsuarioActionPerformed
        limpiarUsuarios();
        imgregistrar(btnRegUser);
        txtClave.setEnabled(true);
    }//GEN-LAST:event_btnNuevoUsuarioActionPerformed

    private void btnNuevoEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoEditorialActionPerformed
        limpiarEditorial();
        imgregistrar(btnRegEditorial);
    }//GEN-LAST:event_btnNuevoEditorialActionPerformed

    private void btnNuevoAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoAutorActionPerformed
        limpiarAutor();
        imgregistrar(btnRegAutor);
    }//GEN-LAST:event_btnNuevoAutorActionPerformed

    private void btnNuevoLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoLibroActionPerformed
        limpiarLibros();
        imgregistrar(btnRegLibro);
    }//GEN-LAST:event_btnNuevoLibroActionPerformed

    private void btnNuevoDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoDocumentoActionPerformed
        limpiarDocumento();
        imgregistrar(btnRegDocumento);
    }//GEN-LAST:event_btnNuevoDocumentoActionPerformed

    private void btnNuevoEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoEstActionPerformed
        limpiarSocios();
        imgregistrar(btnRegSocio);
    }//GEN-LAST:event_btnNuevoEstActionPerformed

    private void btnElUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElUserActionPerformed
        if (txtIdUser.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Seleccine una fila");
        } else {
            int pregunta = JOptionPane.showConfirmDialog(null, "¿ Esta seguro eliminar: ", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
            if (pregunta == 0) {
                if (usuarioDao.eliminar(Integer.parseInt(txtIdUser.getText()))) {
                    LimpiarTable();
                    limpiarUsuarios();
                    ListarUsuarios();
                    JOptionPane.showMessageDialog(null, "Usuario Eliminado");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Eliminar");
                }
                imgregistrar(btnRegUser);
            }
        }
    }//GEN-LAST:event_btnElUserActionPerformed

    private void btnEliEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliEditorialActionPerformed
        if (txtIdEditorial.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Seleccine una fila");
        } else {
            int pregunta = JOptionPane.showConfirmDialog(null, "¿ Esta seguro eliminar: ", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
            if (pregunta == 0) {
                ;

                if (editorialDao.eliminar(Integer.parseInt(txtIdEditorial.getText()))) {
                    LimpiarTable();
                    limpiarEditorial();
                    ListarEditorial();
                    JOptionPane.showMessageDialog(null, "Editorial Eliminado");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Eliminar");
                }
                imgregistrar(btnRegEditorial);
            }
        }

    }//GEN-LAST:event_btnEliEditorialActionPerformed

    private void txtEliAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEliAutorActionPerformed
        if (txtIdAutor.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Seleccine una fila");
        } else {
            int pregunta = JOptionPane.showConfirmDialog(null, "¿ Esta seguro eliminar: ", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
            if (pregunta == 0) {
                if (autorDao.eliminar(Integer.parseInt(txtIdAutor.getText()))) {
                    LimpiarTable();
                    limpiarAutor();
                    ListarAutor();
                    JOptionPane.showMessageDialog(null, "Autor Eliminado");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Eliminar");
                }
                imgregistrar(btnRegAutor);
            }
        }
    }//GEN-LAST:event_txtEliAutorActionPerformed

    private void btnEliLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliLibroActionPerformed
        if (txtIdLibro.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Seleccine una fila");
        } else {
            int pregunta = JOptionPane.showConfirmDialog(null, "¿ Esta seguro eliminar: ", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
            if (pregunta == 0) {
                if (libroDao.eliminar(Integer.parseInt(txtIdLibro.getText()))) {
                    LimpiarTable();
                    limpiarLibros();
                    ListarLibros();
                    JOptionPane.showMessageDialog(null, "Libro Eliminado");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Eliminar");
                }
                imgregistrar(btnRegLibro);
            }
        }
    }//GEN-LAST:event_btnEliLibroActionPerformed

    private void btnEliDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliDocumentoActionPerformed
        if (txtIdDocumento.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Seleccine una fila");
        } else {
            int pregunta = JOptionPane.showConfirmDialog(null, "¿ Esta seguro eliminar: ", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
            if (pregunta == 0) {
                if (documentosDao.eliminar(Integer.parseInt(txtIdDocumento.getText()))) {
                    LimpiarTable();
                    limpiarDocumento();
                    ListarDocumentos();
                    JOptionPane.showMessageDialog(null, "Documento Eliminado");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Eliminar");
                }
                imgregistrar(btnRegDocumento);
            }
        }
    }//GEN-LAST:event_btnEliDocumentoActionPerformed

    private void btnModificarEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarEmpresaActionPerformed
        if (txtRucEmpresa.getText().equals("") || txtNombreEmpresa.getText().equals("") || txtTelefonoEmpresa.getText().equals("")
                || txtCorreoEmpresa.getText().equals("") || txtDireccionEmpresa.getText().equals("") || txtIdEmpresa.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Todo los campos son requeridos");
        } else {
            Empresa emp = new Empresa();
            emp.setRuc(txtRucEmpresa.getText());
            emp.setNombre(txtNombreEmpresa.getText());
            emp.setTelefono(txtTelefonoEmpresa.getText());
            emp.setCorreo(txtCorreoEmpresa.getText());
            emp.setDireccion(txtDireccionEmpresa.getText());
            emp.setId(Integer.parseInt(txtIdEmpresa.getText()));
            if (usuarioDao.modificarEmpresa(emp)) {
                JOptionPane.showMessageDialog(null, "Datos Actualizado");
            } else {
                JOptionPane.showMessageDialog(null, "Error al Actualizar");
            }
        }
    }//GEN-LAST:event_btnModificarEmpresaActionPerformed

    private void btnPrestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrestarActionPerformed
        if (txtIdPrestamo.getText().equals("")) {
            if (cbxSocio.getSelectedItem().toString().equals("") || cbxLibros.getSelectedItem().toString().equals("")
                    || txtCantPrestamo.getText().equals("") || txtFechaDev.getDate().toString().equals("")) {
                JOptionPane.showMessageDialog(null, "Todo los campos son requeridos");
            } else {
                Combo soc = (Combo) cbxSocio.getSelectedItem();
                prestamo.setSocio(soc.getId());
                Combo lb = (Combo) cbxLibros.getSelectedItem();
                Combo lb1 = (Combo) cbxLibros1.getSelectedItem();
                Combo lb2 = (Combo) cbxLibros2.getSelectedItem();
                prestamo.setLibro(lb.getId());
                prestamo.setCantidad(Integer.parseInt(txtCantPrestamo.getText()));
                prestamo.setLibro1(lb1.getId());
                prestamo.setCantidad1(Integer.parseInt(txtCantPrestamo1.getText()));
                prestamo.setLibro2(lb2.getId());
                prestamo.setCantidad2(Integer.parseInt(txtCantPrestamo2.getText()));
                Date fecha = new Date();
                prestamo.setFecha_prestamo(new SimpleDateFormat("dd/MM/yyyy").format(fecha));
                prestamo.setFecha_dev(new SimpleDateFormat("dd/MM/yyyy").format(txtFechaDev.getDate()));
                if (prestamoDao.registrar(prestamo)) {
                    LimpiarTable();
                    limpiarPrestamo();
                    ListarPrestamo();
                    JOptionPane.showMessageDialog(null, "Prestamo Registrado");
                } else {
                    JOptionPane.showMessageDialog(null, "Error");
                }
                btnPrestar.setText("Prestar");
            }
        } else {
            int pregunta = JOptionPane.showConfirmDialog(null, "¿ Recibir Libro: ", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
            if (pregunta == 0) {
                if (prestamoDao.actualizar(Integer.parseInt(txtIdPrestamo.getText()))) {
                    LimpiarTable();
                    limpiarPrestamo();
                    ListarPrestamo();
                    JOptionPane.showMessageDialog(null, "Prestamo Devuelto");
                } else {
                    JOptionPane.showMessageDialog(null, "Error");
                }
            }
            btnPrestar.setText("Prestar");
        }
    }//GEN-LAST:event_btnPrestarActionPerformed

    private void btnNuevoPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoPrestamoActionPerformed
        limpiarPrestamo();
        btnPrestar.setText("Prestar");
    }//GEN-LAST:event_btnNuevoPrestamoActionPerformed

    private void tblPrestamoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPrestamoMouseClicked
        int fila = tblPrestamo.rowAtPoint(evt.getPoint());
        txtIdPrestamo.setText(tblPrestamo.getValueAt(fila, 0).toString());
        txtCantPrestamo.setText(tblPrestamo.getValueAt(fila, 3).toString());
        btnPrestar.setText("Devolver");
    }//GEN-LAST:event_tblPrestamoMouseClicked

    private void txtBuscarUserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarUserKeyReleased
        LimpiarTable();
        ListarUsuarios();
    }//GEN-LAST:event_txtBuscarUserKeyReleased

    private void txtBuscarEditorialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarEditorialKeyReleased
        LimpiarTable();
        ListarEditorial();
    }//GEN-LAST:event_txtBuscarEditorialKeyReleased

    private void txtBuscarAutorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarAutorKeyReleased
        LimpiarTable();
        ListarAutor();
    }//GEN-LAST:event_txtBuscarAutorKeyReleased

    private void txtBuscarLibroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarLibroKeyReleased
        LimpiarTable();
        ListarLibros();
    }//GEN-LAST:event_txtBuscarLibroKeyReleased

    private void txtBuscarDocumentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarDocumentoKeyReleased
        LimpiarTable();
        ListarDocumentos();
    }//GEN-LAST:event_txtBuscarDocumentoKeyReleased

    private void txtBuscarEstKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarEstKeyReleased
        LimpiarTable();
        ListarSocios();
    }//GEN-LAST:event_txtBuscarEstKeyReleased

    private void txtBuscarPrestamoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarPrestamoKeyReleased
        LimpiarTable();
        ListarPrestamo();
    }//GEN-LAST:event_txtBuscarPrestamoKeyReleased

    private void MenuDocumentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuDocumentoMouseClicked
        MenuPrestamo.setEnabled(true);
        MenuEst.setEnabled(true);
        MenuUser.setEnabled(true);
        MenuContactos.setEnabled(true);
        MenuEditorial.setEnabled(true);
        MenuAutor.setEnabled(true);
        MenuDocumento.setEnabled(false);
        MenuLibro.setEnabled(true);
        LimpiarTable();
        ListarDocumentos();
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_MenuDocumentoMouseClicked

    private void cbxAutorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxAutorItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            Object item = evt.getItem();
            Combo combo = libroDao.getAutor(String.valueOf(item));
            txtIdLAutor.setText("" + combo.getId());
        }
    }//GEN-LAST:event_cbxAutorItemStateChanged

    private void cbxEditorialItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxEditorialItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            Object item = evt.getItem();
            Combo combo = libroDao.getEditorial(String.valueOf(item));
            txtIdLEdi.setText("" + combo.getId());
        }
    }//GEN-LAST:event_cbxEditorialItemStateChanged

    private void cbxDocumentoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxDocumentoItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            Object item = evt.getItem();
            Combo combo = libroDao.getDocumento(String.valueOf(item));
            txtIdLMat.setText("" + combo.getId());
        }
    }//GEN-LAST:event_cbxDocumentoItemStateChanged

    private void txtIsbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIsbnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIsbnActionPerformed

    private void txtCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCarreraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCarreraActionPerformed

    private void cbxDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxDocumentoActionPerformed

    private void txtRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRutActionPerformed

    private void cbxLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxLibrosActionPerformed
        libro.getCantidad();
    }//GEN-LAST:event_cbxLibrosActionPerformed

    private void stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockActionPerformed

    }//GEN-LAST:event_stockActionPerformed

    private void cbxLibros1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxLibros1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxLibros1ActionPerformed

    private void cbxLibros2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxLibros2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxLibros2ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuAutor;
    private javax.swing.JMenuItem MenuContactos;
    private javax.swing.JMenu MenuDocumento;
    private javax.swing.JMenuItem MenuEditorial;
    private javax.swing.JMenu MenuEst;
    private javax.swing.JMenuItem MenuLibro;
    private javax.swing.JMenu MenuPrestamo;
    private javax.swing.JMenuItem MenuUser;
    private javax.swing.JButton btnElUser;
    private javax.swing.JButton btnEliDocumento;
    private javax.swing.JButton btnEliEditorial;
    private javax.swing.JButton btnEliEst;
    private javax.swing.JButton btnEliLibro;
    private javax.swing.JButton btnModificarEmpresa;
    private javax.swing.JButton btnNuevoAutor;
    private javax.swing.JButton btnNuevoDocumento;
    private javax.swing.JButton btnNuevoEditorial;
    private javax.swing.JButton btnNuevoEst;
    private javax.swing.JButton btnNuevoLibro;
    private javax.swing.JButton btnNuevoPrestamo;
    private javax.swing.JButton btnNuevoUsuario;
    private javax.swing.JButton btnPrestar;
    private javax.swing.JButton btnRegAutor;
    private javax.swing.JButton btnRegDocumento;
    private javax.swing.JButton btnRegEditorial;
    private javax.swing.JButton btnRegLibro;
    private javax.swing.JButton btnRegSocio;
    private javax.swing.JButton btnRegUser;
    private javax.swing.JComboBox<Object> cbxAutor;
    private javax.swing.JComboBox<Object> cbxDocumento;
    private javax.swing.JComboBox<Object> cbxEditorial;
    private javax.swing.JComboBox<Object> cbxLibros;
    private javax.swing.JComboBox<Object> cbxLibros1;
    private javax.swing.JComboBox<Object> cbxLibros2;
    private javax.swing.JComboBox<Object> cbxSocio;
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
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField stock;
    private javax.swing.JTextField stock1;
    private javax.swing.JTextField stock2;
    private javax.swing.JTable tblAutor;
    private javax.swing.JTable tblDocumento;
    private javax.swing.JTable tblEditorial;
    private javax.swing.JTable tblLibros;
    private javax.swing.JTable tblPrestamo;
    private javax.swing.JTable tblSocios;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtBuscarAutor;
    private javax.swing.JTextField txtBuscarDocumento;
    private javax.swing.JTextField txtBuscarEditorial;
    private javax.swing.JTextField txtBuscarEst;
    private javax.swing.JTextField txtBuscarLibro;
    private javax.swing.JTextField txtBuscarPrestamo;
    private javax.swing.JTextField txtBuscarUser;
    private javax.swing.JTextField txtCantLibro;
    private javax.swing.JTextField txtCantPrestamo;
    private javax.swing.JTextField txtCantPrestamo1;
    private javax.swing.JTextField txtCantPrestamo2;
    private javax.swing.JTextField txtCarrera;
    private javax.swing.JPasswordField txtClave;
    private javax.swing.JTextField txtCodBarra;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtCorreoEmpresa;
    private javax.swing.JTextField txtDireccionEmpresa;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtEditorial;
    private javax.swing.JButton txtEliAutor;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEstudiante;
    private com.toedter.calendar.JDateChooser txtFechaDev;
    private javax.swing.JTextField txtIdAutor;
    private javax.swing.JTextField txtIdDocumento;
    private javax.swing.JTextField txtIdEditorial;
    private javax.swing.JTextField txtIdEmpresa;
    private javax.swing.JTextField txtIdEst;
    private javax.swing.JTextField txtIdLAutor;
    private javax.swing.JTextField txtIdLEdi;
    private javax.swing.JTextField txtIdLMat;
    private javax.swing.JTextField txtIdLibro;
    private javax.swing.JTextField txtIdPrestamo;
    private javax.swing.JTextField txtIdUser;
    private javax.swing.JTextField txtIsbn;
    private com.toedter.calendar.JDateChooser txtNacimiento;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreEmpresa;
    private javax.swing.JTextArea txtResumen;
    private javax.swing.JTextField txtRucEmpresa;
    private javax.swing.JTextField txtRut;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTelefonoEmpresa;
    private javax.swing.JTextField txtTitulo;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    private void registrarUsuario() {
        String id = txtIdUser.getText();
        String usuario = txtUsuario.getText();
        String nombre = txtNombre.getText();
        String correo = txtCorreo.getText();
        //Verificacion de campos vacios
        if (usuario.equals("") || nombre.equals("") || correo.equals("")) {
            JOptionPane.showMessageDialog(null, "Todo los Campos son Requeridos");
        } else {
            user.setUsuario(usuario);
            user.setNombre(nombre);
            user.setCorreo(correo);
            if (id.equals("")) {
                String clave = String.valueOf(txtClave.getPassword());
                user.setClave(clave);
                if (clave.equals("")) {
                    JOptionPane.showMessageDialog(null, "La Contraseña es requerido");
                } else {
                    if (usuarioDao.registrar(user)) {
                        JOptionPane.showMessageDialog(null, "Usuario Registrado");
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al Registrar");
                    }
                    limpiarUsuarios();
                }
            } else {
                user.setId(Integer.parseInt(id));
                if (usuarioDao.actualizar(user)) {
                    JOptionPane.showMessageDialog(null, "Usuario Modificado");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Modificar");
                }
                limpiarUsuarios();
            }
            imgregistrar(btnRegUser);
        }
    }

    private void registrarEditorial() {
        String id = txtIdEditorial.getText();
        String nombre = txtEditorial.getText();
        //Verificacion de campos vacios
        if (nombre.equals("")) {
            JOptionPane.showMessageDialog(null, "Todo los Campos son Requeridos");
        } else {
            editorial.setEditorial(nombre);
            if (id.equals("")) {
                if (editorialDao.registrar(editorial)) {
                    JOptionPane.showMessageDialog(null, "Editorial Registrado");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Registrar");
                }
            } else {
                editorial.setId(Integer.parseInt(id));
                if (editorialDao.actualizar(editorial)) {
                    JOptionPane.showMessageDialog(null, "Editorial Modificado");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Modificar");
                }
            }
            imgregistrar(btnRegEditorial);
        }
    }

    private void registrarAutor() {
        String id = txtIdAutor.getText();
        String nombre = txtAutor.getText();
        //Verificacion de campos vacios
        if (nombre.equals("")) {
            JOptionPane.showMessageDialog(null, "Todo los Campos son Requeridos");
        } else {
            autor.setAutor(nombre);
            if (id.equals("")) {
                if (autorDao.registrar(autor)) {
                    JOptionPane.showMessageDialog(null, "Autor Registrado");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Registrar");
                }
            } else {
                autor.setId(Integer.parseInt(id));
                if (autorDao.actualizar(autor)) {
                    JOptionPane.showMessageDialog(null, "Autor Modificado");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Modificar");
                }
            }
            imgregistrar(btnRegAutor);
        }
    }

    private void registrarDocumento() {
        String id = txtIdDocumento.getText();
        String nombre = txtDocumento.getText();
        //Verificacion de campos vacios
        if (nombre.equals("")) {
            JOptionPane.showMessageDialog(null, "Todo los Campos son Requeridos");
        } else {
            documento.setDocumento(nombre);
            if (id.equals("")) {
                if (documentosDao.registrar(documento)) {
                    JOptionPane.showMessageDialog(null, "Materia Registrado");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Registrar");
                }
            } else {
                documento.setId(Integer.parseInt(id));
                if (documentosDao.actualizar(documento)) {
                    JOptionPane.showMessageDialog(null, "Materia Modificado");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Modificar");
                }
            }
            imgregistrar(btnRegDocumento);
        }
    }

    private void registrarSocio() {
        String id = txtIdEst.getText();
        String rut = txtRut.getText();
        String email = txtEmail.getText();
        String nombre = txtEstudiante.getText();
        String telefono = txtTelefono.getText();
        String carrera = txtCarrera.getText();
//      String nacimiento = txtNacimiento.getText();
//      prestamo.setFecha_dev(new SimpleDateFormat("dd/MM/yyyy").format(txtFechaDev.getDate()));

        //Verificacion de campos vacios
        if (rut.equals("") || email.equals("") || nombre.equals("") || telefono.equals("") || carrera.equals("")) {
            JOptionPane.showMessageDialog(null, "Todo los Campos son Requeridos");

        } else {
            if (SociosDao.validarRut(rut)) {

            } else {
                JOptionPane.showMessageDialog(null, " Rut mal ingresado");
                return;
            }
            socios.setRut(rut);
            socios.setEmail(email);
            socios.setNombre(nombre);
            socios.setTelefono(telefono);
            socios.setDireccion(carrera);
            socios.setNacimiento(new SimpleDateFormat("dd/MM/yyyy").format(txtNacimiento.getDate()));

            if (id.equals("")) {
                if (sociosDao.registrar(socios)) {
                    JOptionPane.showMessageDialog(null, "Socio Registrado");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Registrar");
                }
            } else {
                socios.setId(Integer.parseInt(id));
                if (sociosDao.actualizar(socios)) {
                    JOptionPane.showMessageDialog(null, "Socio Modificado");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Modificar");
                }
            }
            imgregistrar(btnRegSocio);
        }
    }

    private void llenarAutor() {
        List<Autor> lista = autorDao.Listar(txtBuscarAutor.getText());
        for (int i = 0; i < lista.size(); i++) {
            cbxAutor.addItem(lista.get(i).getAutor());
        }
    }

    private void llenarEditorial() {
        List<Editorial> lista = editorialDao.Listar(txtBuscarEditorial.getText());
        for (int i = 0; i < lista.size(); i++) {
            cbxEditorial.addItem(lista.get(i).getEditorial());
        }
    }

    private void llenarDocumento() {
        List<Documentos> lista = documentosDao.Listar(txtBuscarDocumento.getText());
        for (int i = 0; i < lista.size(); i++) {
            cbxDocumento.addItem(lista.get(i).getDocumento());
        }
    }

    private void llenarSocio() {
        List<Socios> lista = sociosDao.Listar("");
        for (int i = 0; i < lista.size(); i++) {
            int id = lista.get(i).getId();
            String nombre = lista.get(i).getNombre();
            cbxSocio.addItem(new Combo(id, nombre));
        }
    }

    private void llenarLibros() {
        List<Libros> lista = libroDao.Listar("");
        for (int i = 0; i < lista.size(); i++) {
            int id = lista.get(i).getId();
            String nombre = lista.get(i).getTitulo();
            cbxLibros.addItem(new Combo(id, nombre));
            cbxLibros1.addItem(new Combo(id, nombre));
            cbxLibros2.addItem(new Combo(id, nombre));
        }
    }

    private void ListarUsuarios() {
        List<Usuarios> Listar = usuarioDao.Listar(txtBuscarUser.getText());
        modelo = (DefaultTableModel) tblUsuarios.getModel();
        Object[] ob = new Object[4];
        for (int i = 0; i < Listar.size(); i++) {
            ob[0] = Listar.get(i).getId();
            ob[1] = Listar.get(i).getUsuario();
            ob[2] = Listar.get(i).getNombre();
            ob[3] = Listar.get(i).getCorreo();
            modelo.addRow(ob);
        }
        tblUsuarios.setModel(modelo);
        color(tblUsuarios);
    }

    private void ListarAutor() {
        List<Autor> Listar = autorDao.Listar(txtBuscarAutor.getText());
        modelo = (DefaultTableModel) tblAutor.getModel();
        Object[] ob = new Object[2];
        for (int i = 0; i < Listar.size(); i++) {
            ob[0] = Listar.get(i).getId();
            ob[1] = Listar.get(i).getAutor();
            modelo.addRow(ob);
        }
        tblAutor.setModel(modelo);
        color(tblAutor);
    }

    private void ListarEditorial() {
        List<Editorial> Listar = editorialDao.Listar(txtBuscarEditorial.getText());
        modelo = (DefaultTableModel) tblEditorial.getModel();
        Object[] ob = new Object[2];
        for (int i = 0; i < Listar.size(); i++) {
            ob[0] = Listar.get(i).getId();
            ob[1] = Listar.get(i).getEditorial();
            modelo.addRow(ob);
        }
        tblEditorial.setModel(modelo);
        color(tblEditorial);
    }

    private void ListarDocumentos() {
        List<Documentos> Listar = documentosDao.Listar(txtBuscarDocumento.getText());
        modelo = (DefaultTableModel) tblDocumento.getModel();
        Object[] ob = new Object[2];
        for (int i = 0; i < Listar.size(); i++) {
            ob[0] = Listar.get(i).getId();
            ob[1] = Listar.get(i).getDocumento();
            modelo.addRow(ob);
        }
        tblDocumento.setModel(modelo);
        color(tblDocumento);
    }

    private void registrarLibro() {
        String id = txtIdLibro.getText();
        String titulo = txtTitulo.getText();
        String cantidad = txtCantLibro.getText();
        String isbn = txtIsbn.getText();
        String codigo_bar = txtCodBarra.getText();
        String aut = txtIdLAutor.getText();
        String edit = txtIdLEdi.getText();
        String mat = txtIdLMat.getText();
        String res = txtResumen.getText();
        //Verificacion de campos vacios
        if (titulo.equals("") || cantidad.equals("") || isbn.equals("") || codigo_bar.equals("") || aut.equals("") || edit.equals("") || mat.equals("")) {
            JOptionPane.showMessageDialog(null, "Todo los Campos son Requeridos");
        } else {
            libro.setTitulo(titulo);
            libro.setAutor(Integer.parseInt(aut));
            libro.setEditorial(Integer.parseInt(edit));
            libro.setDocumento(Integer.parseInt(mat));
            libro.setCantidad(Integer.parseInt(cantidad));
            libro.setIsbn(isbn);
            libro.setCodigo(codigo_bar);
            libro.setResumen(res);
            if (id.equals("")) {
                if (libroDao.registrar(libro)) {
                    JOptionPane.showMessageDialog(null, "Libro Registrado");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Registrar");
                }
            } else {
                libro.setId(Integer.parseInt(id));
                if (libroDao.actualizar(libro)) {
                    JOptionPane.showMessageDialog(null, "Libro Modificado");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Modificar");
                }
            }
            imgregistrar(btnRegLibro);
        }
    }

    private void ListarLibros() {
        List<Libros> Listar = libroDao.Listar(txtBuscarLibro.getText());
        modelo = (DefaultTableModel) tblLibros.getModel();
        Object[] ob = new Object[12];
        for (int i = 0; i < Listar.size(); i++) {
            ob[0] = Listar.get(i).getId();
            ob[1] = Listar.get(i).getTitulo();
            ob[2] = Listar.get(i).getCantidad();
            ob[3] = Listar.get(i).getIsbn();
            ob[4] = Listar.get(i).getCodigo();
            ob[5] = Listar.get(i).getEditorial();
            ob[6] = Listar.get(i).getEditorial_nombre();
            ob[7] = Listar.get(i).getAutor();
            ob[8] = Listar.get(i).getAutor_nombre();
            ob[9] = Listar.get(i).getDocumento();
            ob[10] = Listar.get(i).getDocumento_nombre();
            ob[11] = Listar.get(i).getResumen();
            modelo.addRow(ob);
        }
        tblLibros.setModel(modelo);
        color(tblLibros);
    }

    private void ListarSocios() {
        List<Socios> Listar = sociosDao.Listar(txtBuscarEst.getText());
        modelo = (DefaultTableModel) tblSocios.getModel();
        Object[] ob = new Object[7];
        for (int i = 0; i < Listar.size(); i++) {
            ob[0] = Listar.get(i).getId();
            ob[1] = Listar.get(i).getRut();
            ob[2] = Listar.get(i).getEmail();
            ob[3] = Listar.get(i).getNombre();
            ob[4] = Listar.get(i).getTelefono();
            ob[5] = Listar.get(i).getDireccion();
            ob[6] = Listar.get(i).getNacimiento();
            modelo.addRow(ob);
        }
        tblSocios.setModel(modelo);
        color(tblSocios);
    }

    private void ListarPrestamo() {
        List<Prestamos> Listar = prestamoDao.Listar(txtBuscarPrestamo.getText());
        modelo = (DefaultTableModel) tblPrestamo.getModel();
        Object[] ob = new Object[11];
        boolean estado;
        for (int i = 0; i < Listar.size(); i++) {
            ob[0] = Listar.get(i).getId();
            ob[1] = Listar.get(i).getNombre_soc();
            ob[2] = Listar.get(i).getTitulo();
            ob[3] = Listar.get(i).getCantidad();
            ob[4] = Listar.get(i).getTitulo1();
            ob[5] = Listar.get(i).getCantidad1();
            ob[6] = Listar.get(i).getTitulo2();
            ob[7] = Listar.get(i).getCantidad2();
            ob[8] = Listar.get(i).getFecha_prestamo();
            ob[9] = Listar.get(i).getFecha_dev();
            estado = Listar.get(i).getEstado() == 1;
            ob[10] = estado;
            modelo.addRow(ob);
        }
        tblPrestamo.setModel(modelo);
        color(tblPrestamo);
    }

    private void color(JTable tabla) {
        JTableHeader header = tabla.getTableHeader();
        header.setOpaque(false);
        header.setBackground(new Color(0, 110, 255));
        header.setForeground(Color.white);
    }

    private void imgeditar(JButton boton) {
        boton.setText("Modificar");
        ImageIcon editar = new ImageIcon(getClass().getResource("/img/editar.png"));
        boton.setIcon(editar);
    }

    private void imgregistrar(JButton boton) {
        boton.setText("Registrar");
        ImageIcon registrar = new ImageIcon(getClass().getResource("/img/save.png"));
        boton.setIcon(registrar);
    }

    public void LimpiarTable() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    private void limpiarDocumento() {
        txtIdDocumento.setText("");
        txtDocumento.setText("");
    }

    private void limpiarUsuarios() {
        txtIdUser.setText("");
        txtUsuario.setText("");
        txtNombre.setText("");
        txtCorreo.setText("");
        txtClave.setText("");
        txtClave.setEnabled(true);
    }

    private void limpiarEditorial() {
        txtIdEditorial.setText("");
        txtEditorial.setText("");
    }

    private void limpiarAutor() {
        txtIdAutor.setText("");
        txtAutor.setText("");
    }

    private void limpiarSocios() {
        txtIdEst.setText("");
        txtEstudiante.setText("");
        txtRut.setText("");
        txtEmail.setText("");
        txtTelefono.setText("");
        txtCarrera.setText("");
        txtContrasena.setText("");
    }

    private void limpiarLibros() {
        txtIdLibro.setText("");
        txtTitulo.setText("");
        txtCantLibro.setText("");
        txtIsbn.setText("");
        txtCodBarra.setText("");
    }

    private void limpiarPrestamo() {
        txtIdPrestamo.setText("");
        txtCantPrestamo.setText("");
        txtCantPrestamo1.setText("");
        txtCantPrestamo2.setText("");
    }
}
