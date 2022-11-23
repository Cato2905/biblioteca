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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        txtIdSoc.setVisible(false);
        txtIdLibro.setVisible(false);
        txtIdDocumento.setVisible(false);
        txtIdUser.setVisible(false);
        txtIdPrestamo.setVisible(false);
        txtIdLibPrest.setVisible(false);
        txtIdLAutor.setVisible(false);
        txtIdLEdi.setVisible(false);
        txtIdLMat.setVisible(false);
        MenuPrestamo.setEnabled(false);
        cbxSocio.removeAllItems();
        cbxLibros.removeAllItems();

        llenarSocio();
        llenarLibros();
        limpiarPrestamo();
        AutoCompleteDecorator.decorate(cbxSocio);
        AutoCompleteDecorator.decorate(cbxLibros);

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
        jScrollPane8 = new javax.swing.JScrollPane();
        txtResumen = new javax.swing.JTextArea();
        btnRecLib = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblLibros = new javax.swing.JTable();
        jLabel33 = new javax.swing.JLabel();
        txtBuscarLibro = new javax.swing.JTextField();
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
        txtSocio = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btnRegSocio = new javax.swing.JButton();
        btnEliSoc = new javax.swing.JButton();
        txtIdSoc = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        btnNuevoSoc = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        txtContrasena = new javax.swing.JPasswordField();
        jLabel38 = new javax.swing.JLabel();
        txtNacimiento = new com.toedter.calendar.JDateChooser();
        txtApellidoM = new javax.swing.JTextField();
        txtApellidoP = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        txtComuna = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        btnRecSoc = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblSocios = new javax.swing.JTable();
        jLabel31 = new javax.swing.JLabel();
        txtBuscarSoc = new javax.swing.JTextField();
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
        txtIdLibPrest = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblPrestamo = new javax.swing.JTable();
        jLabel30 = new javax.swing.JLabel();
        txtBuscarPrestamo = new javax.swing.JTextField();
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
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuUser = new javax.swing.JMenuItem();
        MenuContactos = new javax.swing.JMenuItem();
        MenuSoc = new javax.swing.JMenu();
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
        if (tblUsuarios.getColumnModel().getColumnCount() > 0) {
            tblUsuarios.getColumnModel().getColumn(0).setMaxWidth(70);
        }

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtBuscarUser, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
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
        if (tblEditorial.getColumnModel().getColumnCount() > 0) {
            tblEditorial.getColumnModel().getColumn(0).setMaxWidth(70);
        }

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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtBuscarEditorial, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
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
        if (tblAutor.getColumnModel().getColumnCount() > 0) {
            tblAutor.getColumnModel().getColumn(0).setMaxWidth(70);
        }

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
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(181, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(txtBuscarAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
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

        jLabel13.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel13.setText("ISBN");

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

        txtResumen.setColumns(20);
        txtResumen.setRows(5);
        jScrollPane8.setViewportView(txtResumen);

        btnRecLib.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png"))); // NOI18N
        btnRecLib.setText("Recuperar");
        btnRecLib.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRecLib.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecLibActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 1201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 5, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(cbxAutor, javax.swing.GroupLayout.Alignment.LEADING, 0, 270, Short.MAX_VALUE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtTitulo, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel43))
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addComponent(cbxEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel14)
                                                    .addComponent(txtCodBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel13)
                                                .addComponent(txtIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtIdLAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtIdLEdi, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIdLMat, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(txtIdLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnNuevoLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGap(283, 283, 283)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                                .addComponent(cbxDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel11)
                                                    .addComponent(jLabel10))
                                                .addGap(144, 144, 144)))
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addComponent(txtCantLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel8))
                                .addGap(324, 324, 324)
                                .addComponent(btnRegLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRecLib, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliLibro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
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
                                .addGap(6, 6, 6)))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNuevoLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRecLib, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRegLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(90, 90, 90)))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel43)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtIdLAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtIdLEdi, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtIdLMat, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                .addContainerGap())
        );

        tblLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Título", "Cantidad", "ISBN", "Codigo de barras", "", "Editorial", "", "Autor", "", "Tipo documento", "Resumen", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, true, true, true, true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLibros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLibrosMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblLibros);
        if (tblLibros.getColumnModel().getColumnCount() > 0) {
            tblLibros.getColumnModel().getColumn(0).setMaxWidth(70);
            tblLibros.getColumnModel().getColumn(12).setMinWidth(50);
            tblLibros.getColumnModel().getColumn(12).setPreferredWidth(50);
            tblLibros.getColumnModel().getColumn(12).setMaxWidth(50);
        }

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        jLabel33.setText("Buscar");

        txtBuscarLibro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarLibroKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBuscarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        if (tblDocumento.getColumnModel().getColumnCount() > 0) {
            tblDocumento.getColumnModel().getColumn(0).setMaxWidth(70);
        }

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
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(188, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtBuscarDocumento, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tipo de documento", jPanel9);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jPanel12.setBackground(new java.awt.Color(204, 204, 204));
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nuevo Socio", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N

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

        btnEliSoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        btnEliSoc.setText("Eliminar");
        btnEliSoc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEliSoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliSocActionPerformed(evt);
            }
        });

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        btnNuevoSoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo.png"))); // NOI18N
        btnNuevoSoc.setText("Nuevo");
        btnNuevoSoc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNuevoSoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoSocActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel37.setText("Contraseña");

        jLabel38.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel38.setText("Fecha nacimiento");

        jLabel29.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel29.setText("Apellido Paterno");

        jLabel50.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel50.setText("Apellido Materno");

        jLabel51.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel51.setText("Comuna");

        btnRecSoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png"))); // NOI18N
        btnRecSoc.setText("Recuperar");
        btnRecSoc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRecSoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecSocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(54, 54, 54)
                                .addComponent(txtIdSoc, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(56, 56, 56)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(txtSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(56, 56, 56)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(btnRegSocio)
                        .addGap(43, 43, 43)
                        .addComponent(btnNuevoSoc, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtComuna, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel51))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel37)
                                    .addComponent(jLabel38))
                                .addGap(94, 94, 94))
                            .addComponent(txtNacimiento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtContrasena, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(btnEliSoc)
                        .addGap(18, 18, 18)
                        .addComponent(btnRecSoc)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtIdSoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel29)
                    .addComponent(jLabel50)
                    .addComponent(jLabel38))
                .addGap(9, 9, 9)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtApellidoM, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtApellidoP, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel51)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtComuna, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliSoc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNuevoSoc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRecSoc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel37)))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel20)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblSocios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Rut", "Email", "Nombre", "Apellido Pat", "Apellido Mat", "Teléfono", "Direccion", "Comuna", "Fecha de nacimiento", "Contraseña", "Estado", "Posesion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, true, true, true, true, true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSocios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSociosMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tblSocios);
        if (tblSocios.getColumnModel().getColumnCount() > 0) {
            tblSocios.getColumnModel().getColumn(0).setMaxWidth(40);
            tblSocios.getColumnModel().getColumn(10).setMinWidth(0);
            tblSocios.getColumnModel().getColumn(10).setPreferredWidth(0);
            tblSocios.getColumnModel().getColumn(10).setMaxWidth(0);
            tblSocios.getColumnModel().getColumn(11).setMaxWidth(50);
            tblSocios.getColumnModel().getColumn(12).setMaxWidth(80);
        }

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        jLabel31.setText("Buscar");

        txtBuscarSoc.setToolTipText("");
        txtBuscarSoc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarSocKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscarSoc, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel31)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(txtBuscarSoc)
                        .addGap(5, 5, 5)))
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
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
        cbxLibros.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxLibrosItemStateChanged(evt);
            }
        });
        cbxLibros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxLibrosActionPerformed(evt);
            }
        });

        txtIdLibPrest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdLibPrestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(btnNuevoPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cbxSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel25)))
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCantPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGap(138, 138, 138)
                                .addComponent(btnPrestar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(142, 142, 142)
                                .addComponent(txtIdPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel26)
                                    .addComponent(cbxLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(80, 80, 80)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFechaDev, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdLibPrest, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxLibros, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(txtCantPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPrestar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNuevoPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdLibPrest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtFechaDev, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        tblPrestamo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Socio", "Documento", "Cantidad", "F. Prestamo", "F. Devolución", "Estado", "IdLibPres", "idSocPres"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, false, true, true
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
            tblPrestamo.getColumnModel().getColumn(0).setMaxWidth(70);
            tblPrestamo.getColumnModel().getColumn(6).setMinWidth(0);
            tblPrestamo.getColumnModel().getColumn(6).setPreferredWidth(0);
            tblPrestamo.getColumnModel().getColumn(6).setMaxWidth(0);
            tblPrestamo.getColumnModel().getColumn(7).setMinWidth(0);
            tblPrestamo.getColumnModel().getColumn(7).setPreferredWidth(0);
            tblPrestamo.getColumnModel().getColumn(7).setMaxWidth(0);
            tblPrestamo.getColumnModel().getColumn(8).setMinWidth(0);
            tblPrestamo.getColumnModel().getColumn(8).setPreferredWidth(0);
            tblPrestamo.getColumnModel().getColumn(8).setMaxWidth(0);
        }

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        jLabel30.setText("Buscar");

        txtBuscarPrestamo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarPrestamoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscarPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane7))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBuscarPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
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
                .addContainerGap(36, Short.MAX_VALUE)
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
                    .addComponent(txtIdEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(848, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
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

        MenuSoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/estudiante.png"))); // NOI18N
        MenuSoc.setText("Socios");
        MenuSoc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MenuSoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuSocMouseClicked(evt);
            }
        });
        MenuSoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSocActionPerformed(evt);
            }
        });
        jMenuBar1.add(MenuSoc);

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
                .addComponent(jTabbedPane1))
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
        MenuSoc.setEnabled(true);
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
        tblLibros.getColumnModel().getColumn(11).setMaxWidth(0);
        tblLibros.getColumnModel().getColumn(11).setMinWidth(0);
        tblLibros.getTableHeader().getColumnModel().getColumn(11).setMaxWidth(0);
        tblLibros.getTableHeader().getColumnModel().getColumn(11).setMinWidth(0);
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
        MenuSoc.setEnabled(true);
        MenuUser.setEnabled(true);
        MenuContactos.setEnabled(true);
        MenuEditorial.setEnabled(true);
        MenuAutor.setEnabled(true);
        MenuDocumento.setEnabled(true);
        MenuLibro.setEnabled(false);
    }//GEN-LAST:event_MenuLibroActionPerformed

    private void MenuEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuEditorialActionPerformed
        MenuPrestamo.setEnabled(true);
        MenuSoc.setEnabled(true);
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
        MenuSoc.setEnabled(true);
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
        txtIdSoc.setText(tblSocios.getValueAt(fila, 0).toString());
        txtRut.setText(tblSocios.getValueAt(fila, 1).toString());
        txtEmail.setText(tblSocios.getValueAt(fila, 2).toString());
        txtSocio.setText(tblSocios.getValueAt(fila, 3).toString());
        txtApellidoP.setText(tblSocios.getValueAt(fila, 4).toString());
        txtApellidoM.setText(tblSocios.getValueAt(fila, 5).toString());
        txtTelefono.setText(tblSocios.getValueAt(fila, 6).toString());
        txtDireccion.setText(tblSocios.getValueAt(fila, 7).toString());
        txtComuna.setText(tblSocios.getValueAt(fila, 8).toString());
//        try {
//
//            String pattern = "dd-MM-yyyy";
//            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
//            Date date = simpleDateFormat.parse((String) tblSocios.getValueAt(fila, 9));
//            txtNacimiento.setDateFormatString(pattern);
//            txtNacimiento.setDate(date);
////            Date date = new SimpleDateFormat("dd/MM/yyyy").parse((String)tblSocios.getValueAt(fila, 9).toString());
////            txtNacimiento.setDate(date);
//        } catch (ParseException ex) {
//            Logger.getLogger(FrmPanel.class.getName()).log(Level.SEVERE, null, ex);
//        }

        //txtNacimiento.setDate(tblSocios.getValueAt(fila, 9).toString().trim());
        txtContrasena.setText(tblSocios.getValueAt(fila, 10).toString());
        imgeditar(btnRegSocio);

        if (rootPaneCheckingEnabled) {

        }
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

    private void MenuSocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuSocMouseClicked
        // TODO add your handling code here:
        LimpiarTable();
        ListarSocios();
        jTabbedPane1.setSelectedIndex(5);
        MenuPrestamo.setEnabled(true);
        MenuSoc.setEnabled(false);
        MenuUser.setEnabled(true);
        MenuContactos.setEnabled(true);
        MenuEditorial.setEnabled(true);
        MenuAutor.setEnabled(true);
        MenuDocumento.setEnabled(true);
        MenuLibro.setEnabled(true);
    }//GEN-LAST:event_MenuSocMouseClicked

    private void MenuPrestamoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuPrestamoMouseClicked
        cbxSocio.removeAllItems();
        cbxLibros.removeAllItems();
        llenarSocio();
        llenarLibros();
        AutoCompleteDecorator.decorate(cbxSocio);
        AutoCompleteDecorator.decorate(cbxLibros);
        limpiarPrestamo();
        LimpiarTable();
        ListarPrestamo();
        jTabbedPane1.setSelectedIndex(6);
        MenuPrestamo.setEnabled(false);
        MenuSoc.setEnabled(true);
        MenuUser.setEnabled(true);
        MenuContactos.setEnabled(true);
        MenuEditorial.setEnabled(true);
        MenuAutor.setEnabled(true);
        MenuDocumento.setEnabled(true);
        MenuLibro.setEnabled(true);
    }//GEN-LAST:event_MenuPrestamoMouseClicked

    private void MenuContactosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuContactosActionPerformed
        MenuPrestamo.setEnabled(true);
        MenuSoc.setEnabled(true);
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

    private void btnEliSocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliSocActionPerformed
        if (txtIdSoc.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Seleccine una fila");
        } else {
            int pregunta = JOptionPane.showConfirmDialog(null, "¿ Esta seguro eliminar: ", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
            if (pregunta == 0) {
                if (sociosDao.eliminar(Integer.parseInt(txtIdSoc.getText()))) {
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
    }//GEN-LAST:event_btnEliSocActionPerformed

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

    private void btnNuevoSocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoSocActionPerformed
        limpiarSocios();
        imgregistrar(btnRegSocio);
    }//GEN-LAST:event_btnNuevoSocActionPerformed

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
                prestamo.setLibro(lb.getId());
                prestamo.setCantidad(Integer.parseInt(txtCantPrestamo.getText()));
                int idSoc = soc.getId();
                //tuve un errror al crear el constructor con el nombre de cantidad total, pero funciona asique no importa dicen 
                int limite = soc.getCantidadTotal();
                int id = lb.getId();
                int cantidad = Integer.parseInt(txtCantPrestamo.getText());
                int totalLimite = limite + cantidad;
                int cantidadTotal = lb.getCantidadTotal();
                int actual = cantidadTotal - cantidad;
                Date fecha = new Date();
                prestamo.setFecha_prestamo(new SimpleDateFormat("dd/MM/yyyy").format(fecha));
                prestamo.setFecha_dev(new SimpleDateFormat("dd/MM/yyyy").format(txtFechaDev.getDate()));
                if (totalLimite <= 3) {
                    if (cantidadTotal > 0 && cantidadTotal >= cantidad) {
                        if (prestamoDao.registrar(prestamo)) {
                            libroDao.actualizarStock(id, actual);
                            sociosDao.actualizarLimite(idSoc, totalLimite);
                            LimpiarTable();
                            ListarPrestamo();
                            limpiarPrestamo();
                            JOptionPane.showMessageDialog(null, "Prestamo Registrado");
                        } else {
                            JOptionPane.showMessageDialog(null, "Error");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Falta de stock");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Socio supero el limite de prestamos");
                }

                limpiarPrestamo();
                btnPrestar.setText("Prestar");
            }
        } else {
            int pregunta = JOptionPane.showConfirmDialog(null, "¿ Recibir Libro: ", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
            if (pregunta == 0) {
                if (prestamoDao.actualizar(Integer.parseInt(txtIdPrestamo.getText()))) {
                    Combo soc = (Combo) cbxSocio.getSelectedItem();
                    prestamo.setSocio(soc.getId());
                    Combo lb = (Combo) cbxLibros.getSelectedItem();
                    prestamo.setLibro(lb.getId());
                    prestamo.setCantidad(Integer.parseInt(txtCantPrestamo.getText()));
                    int idSoc = soc.getId();
                    //tuve un errror al crear el constructor con el nombre de cantidad total, pero funciona asique no importa dicen 
                    int limite = soc.getCantidadTotal();
                    int id = lb.getId();
                    int cantidad = Integer.parseInt(txtCantPrestamo.getText());
                    int totalLimite = limite - cantidad;
                    int cantidadTotal = lb.getCantidadTotal();
                    int actual = cantidadTotal + cantidad;
                    libroDao.actualizarStock(id, actual);
                    sociosDao.actualizarLimite(idSoc, totalLimite);
                    LimpiarTable();
                    ListarPrestamo();
                    limpiarPrestamo();
                    JOptionPane.showMessageDialog(null, "Prestamo Devuelto");
                } else {
                    JOptionPane.showMessageDialog(null, "Error");
                }
            }
            limpiarPrestamo();
            btnPrestar.setText("Prestar");
        }
    }//GEN-LAST:event_btnPrestarActionPerformed

    private void btnNuevoPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoPrestamoActionPerformed
        LimpiarTable();
        ListarPrestamo();
        limpiarPrestamo();
        btnPrestar.setText("Prestar");

    }//GEN-LAST:event_btnNuevoPrestamoActionPerformed

    private void tblPrestamoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPrestamoMouseClicked
        int fila = tblPrestamo.rowAtPoint(evt.getPoint());
        txtIdPrestamo.setText(tblPrestamo.getValueAt(fila, 0).toString());
        txtCantPrestamo.setText(tblPrestamo.getValueAt(fila, 3).toString());
        cbxLibros.setSelectedItem(tblPrestamo.getValueAt(fila, 2).toString());
        cbxSocio.setSelectedItem(tblPrestamo.getValueAt(fila, 1).toString());
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

    private void txtBuscarSocKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarSocKeyReleased
        LimpiarTable();
        ListarSocios();
    }//GEN-LAST:event_txtBuscarSocKeyReleased

    private void txtBuscarPrestamoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarPrestamoKeyReleased
        LimpiarTable();
        ListarPrestamo();
    }//GEN-LAST:event_txtBuscarPrestamoKeyReleased

    private void MenuDocumentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuDocumentoMouseClicked
        MenuPrestamo.setEnabled(true);
        MenuSoc.setEnabled(true);
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

    private void cbxLibrosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxLibrosItemStateChanged

    }//GEN-LAST:event_cbxLibrosItemStateChanged

    private void MenuSocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSocActionPerformed

    }//GEN-LAST:event_MenuSocActionPerformed

    private void btnRecSocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecSocActionPerformed
        if (txtIdSoc.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Seleccine una fila");
        } else {
            int pregunta = JOptionPane.showConfirmDialog(null, "¿ Esta seguro recuperar: ", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
            if (pregunta == 0) {
                if (sociosDao.recuperar(Integer.parseInt(txtIdSoc.getText()))) {
                    LimpiarTable();
                    limpiarSocios();
                    ListarSocios();
                    JOptionPane.showMessageDialog(null, "Recuperado");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Recuperar");
                }
                imgregistrar(btnRegSocio);
            }
        }
    }//GEN-LAST:event_btnRecSocActionPerformed

    private void btnRecLibActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecLibActionPerformed
        if (txtIdLibro.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Seleccine una fila");
        } else {
            int pregunta = JOptionPane.showConfirmDialog(null, "¿ Esta seguro recuperar: ", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
            if (pregunta == 0) {
                if (libroDao.recuperar(Integer.parseInt(txtIdLibro.getText()))) {
                    LimpiarTable();
                    limpiarLibros();
                    ListarLibros();
                    JOptionPane.showMessageDialog(null, "Recuperado");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Recuperar");
                }
                imgregistrar(btnRecLib);
            }
        }
    }//GEN-LAST:event_btnRecLibActionPerformed

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }

        if (txtTelefono.getText().trim().length() == 9) {
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtIdLibPrestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdLibPrestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdLibPrestActionPerformed

    private void cbxLibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxLibrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxLibrosActionPerformed

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
    private javax.swing.JMenuItem MenuLibro;
    private javax.swing.JMenu MenuPrestamo;
    private javax.swing.JMenu MenuSoc;
    private javax.swing.JMenuItem MenuUser;
    private javax.swing.JButton btnElUser;
    private javax.swing.JButton btnEliDocumento;
    private javax.swing.JButton btnEliEditorial;
    private javax.swing.JButton btnEliLibro;
    private javax.swing.JButton btnEliSoc;
    private javax.swing.JButton btnModificarEmpresa;
    private javax.swing.JButton btnNuevoAutor;
    private javax.swing.JButton btnNuevoDocumento;
    private javax.swing.JButton btnNuevoEditorial;
    private javax.swing.JButton btnNuevoLibro;
    private javax.swing.JButton btnNuevoPrestamo;
    private javax.swing.JButton btnNuevoSoc;
    private javax.swing.JButton btnNuevoUsuario;
    private javax.swing.JButton btnPrestar;
    private javax.swing.JButton btnRecLib;
    private javax.swing.JButton btnRecSoc;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
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
    private javax.swing.JTable tblAutor;
    private javax.swing.JTable tblDocumento;
    private javax.swing.JTable tblEditorial;
    private javax.swing.JTable tblLibros;
    private javax.swing.JTable tblPrestamo;
    private javax.swing.JTable tblSocios;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txtApellidoM;
    private javax.swing.JTextField txtApellidoP;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtBuscarAutor;
    private javax.swing.JTextField txtBuscarDocumento;
    private javax.swing.JTextField txtBuscarEditorial;
    private javax.swing.JTextField txtBuscarLibro;
    private javax.swing.JTextField txtBuscarPrestamo;
    private javax.swing.JTextField txtBuscarSoc;
    private javax.swing.JTextField txtBuscarUser;
    private javax.swing.JTextField txtCantLibro;
    private javax.swing.JTextField txtCantPrestamo;
    private javax.swing.JPasswordField txtClave;
    private javax.swing.JTextField txtCodBarra;
    private javax.swing.JTextField txtComuna;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtCorreoEmpresa;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDireccionEmpresa;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtEditorial;
    private javax.swing.JButton txtEliAutor;
    private javax.swing.JTextField txtEmail;
    private com.toedter.calendar.JDateChooser txtFechaDev;
    private javax.swing.JTextField txtIdAutor;
    private javax.swing.JTextField txtIdDocumento;
    private javax.swing.JTextField txtIdEditorial;
    private javax.swing.JTextField txtIdEmpresa;
    private javax.swing.JTextField txtIdLAutor;
    private javax.swing.JTextField txtIdLEdi;
    private javax.swing.JTextField txtIdLMat;
    private javax.swing.JTextField txtIdLibPrest;
    private javax.swing.JTextField txtIdLibro;
    private javax.swing.JTextField txtIdPrestamo;
    private javax.swing.JTextField txtIdSoc;
    private javax.swing.JTextField txtIdUser;
    private javax.swing.JTextField txtIsbn;
    private com.toedter.calendar.JDateChooser txtNacimiento;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreEmpresa;
    private javax.swing.JTextArea txtResumen;
    private javax.swing.JTextField txtRucEmpresa;
    private javax.swing.JTextField txtRut;
    private javax.swing.JTextField txtSocio;
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
        String id = txtIdSoc.getText();
        String rut = txtRut.getText();
        String email = txtEmail.getText();
        String nombre = txtSocio.getText();
        String ApellidoPat = txtApellidoP.getText();
        String ApellidoMat = txtApellidoM.getText();
        String telefono = txtTelefono.getText();
        String direccion = txtDireccion.getText();
        String comuna = txtComuna.getText();
        String contrasena = txtContrasena.getText();

        //Verificacion de campos vacios
        if (rut.equals("") || email.equals("") || nombre.equals("") || direccion.equals("")) {
            JOptionPane.showMessageDialog(null, "Todo los Campos son Requeridos");

        } else {
            if (SociosDao.validarRut(rut)) {

            } else {
                JOptionPane.showMessageDialog(null, " Rut mal ingresado");
                return;

            }

            if (sociosDao.verificarExistente(SociosDao.formatear(rut)) == false) {
                JOptionPane.showMessageDialog(null, " Rut repetido");
                return;
            } else {
//                JOptionPane.showMessageDialog(null, " rut bien ");

            }

            if (SociosDao.emailValidator(email)) {

            } else {
                JOptionPane.showMessageDialog(null, " Email Mal ingresado o Contiene Mayusculas");
                return;
            }

            socios.setRut(SociosDao.formatear(rut));
            socios.setEmail(email);
            socios.setNombre(nombre);
            socios.setApellidoPat(ApellidoPat);
            socios.setApellidoMat(ApellidoMat);
            socios.setTelefono(telefono);
            socios.setDireccion(direccion);
            socios.setComuna(comuna);
            socios.setNacimiento(new SimpleDateFormat("dd/MM/yyyy").format(txtNacimiento.getDate()));
            socios.setContrasena(contrasena);

            if (id.equals("")) {
                if (rootPaneCheckingEnabled) {
                    if (sociosDao.registrar(socios)) {
                        JOptionPane.showMessageDialog(null, "Socio Registrado");
                        limpiarSocios();
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al Registrar");
                    }
                } else {
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
            int limite = lista.get(i).getLimite();
            int estadoSoc = lista.get(i).getEstadoSoc();
            if (estadoSoc == 1) {
                String nombre = lista.get(i).getNombre();
                String apellidoP = lista.get(i).getApellidoPat();
                String apellidoM = lista.get(i).getApellidoMat();
                String rut = lista.get(i).getRut();
                cbxSocio.addItem(new Combo(id, nombre + " " + apellidoP + " | Rut: " + rut + " | Posee: " + limite, limite));
            }

        }
    }

    private void llenarLibros() {
        List<Libros> lista = libroDao.Listar("");
        for (int i = 0; i < lista.size(); i++) {
            int id = lista.get(i).getId();
            int stock = lista.get(i).getStock();
            int cantidadTotal = lista.get(i).getCantidadTotal();
            String nombre = lista.get(i).getTitulo();

            cbxLibros.addItem(new Combo(id, nombre + " | " + "Stock: " + stock, stock));
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
            libro.setCantidadTotal(Integer.parseInt(cantidad));
            libro.setIsbn(isbn);
            libro.setCodigo(codigo_bar);
            libro.setResumen(res);
            libro.setStock(Integer.parseInt(cantidad));
            if (id.equals("")) {
                if (libroDao.registrar(libro)) {
                    JOptionPane.showMessageDialog(null, "Registro Completado");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al Registrar");
                }
            } else {
                libro.setId(Integer.parseInt(id));
                if (libroDao.actualizar(libro)) {
                    JOptionPane.showMessageDialog(null, "Registro Modificado");
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
        Object[] ob = new Object[13];
        boolean estadoLib;
        for (int i = 0; i < Listar.size(); i++) {
            ob[0] = Listar.get(i).getId();
            ob[1] = Listar.get(i).getTitulo();
            ob[2] = Listar.get(i).getCantidadTotal();
            ob[3] = Listar.get(i).getIsbn();
            ob[4] = Listar.get(i).getCodigo();
            ob[5] = Listar.get(i).getEditorial();
            ob[6] = Listar.get(i).getEditorial_nombre();
            ob[7] = Listar.get(i).getAutor();
            ob[8] = Listar.get(i).getAutor_nombre();
            ob[9] = Listar.get(i).getDocumento();
            ob[10] = Listar.get(i).getDocumento_nombre();
            ob[11] = Listar.get(i).getResumen();
            estadoLib = Listar.get(i).getEstadoLib() == 1;
            ob[12] = estadoLib;
            modelo.addRow(ob);
        }
        tblLibros.setModel(modelo);
        color(tblLibros);
    }

    private void ListarSocios() {
        List<Socios> Listar = sociosDao.Listar(txtBuscarSoc.getText());
        modelo = (DefaultTableModel) tblSocios.getModel();
        Object[] ob = new Object[13];
        boolean estadoSoc;
        for (int i = 0; i < Listar.size(); i++) {
            ob[0] = Listar.get(i).getId();
            ob[1] = Listar.get(i).getRut();
            ob[2] = Listar.get(i).getEmail();
            ob[3] = Listar.get(i).getNombre();
            ob[4] = Listar.get(i).getApellidoPat();
            ob[5] = Listar.get(i).getApellidoMat();
            ob[6] = Listar.get(i).getTelefono();
            ob[7] = Listar.get(i).getDireccion();
            ob[8] = Listar.get(i).getComuna();
            ob[9] = Listar.get(i).getNacimiento();
            ob[10] = Listar.get(i).getContrasena();
            estadoSoc = Listar.get(i).getEstadoSoc() == 1;
            ob[11] = estadoSoc;
            ob[12] = Listar.get(i).getLimite();
            modelo.addRow(ob);
        }
        tblSocios.setModel(modelo);
        color(tblSocios);
    }

    private void ListarPrestamo() {
        List<Prestamos> Listar = prestamoDao.Listar(txtBuscarPrestamo.getText());
        modelo = (DefaultTableModel) tblPrestamo.getModel();
        Object[] ob = new Object[9];
        boolean estado;
        for (int i = 0; i < Listar.size(); i++) {
            ob[0] = Listar.get(i).getId();
            ob[1] = Listar.get(i).getNombre_soc();
            ob[2] = Listar.get(i).getTitulo();
            ob[3] = Listar.get(i).getCantidad();
            ob[4] = Listar.get(i).getFecha_prestamo();
            ob[5] = Listar.get(i).getFecha_dev();
            estado = Listar.get(i).getEstado() == 1;
            ob[6] = estado;
            ob[7] = Listar.get(i).getLibro();
            ob[8] = Listar.get(i).getSocio();

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
        txtIdSoc.setText("");
        txtSocio.setText("");
        txtRut.setText("");
        txtEmail.setText("");
        txtTelefono.setText("");
        txtDireccion.setText("");
        txtContrasena.setText("");
        txtApellidoM.setText("");
        txtApellidoP.setText("");
        txtComuna.setText("");

    }

    private void limpiarLibros() {
        txtIdLibro.setText("");
        txtTitulo.setText("");
        txtCantLibro.setText("");
        txtIsbn.setText("");
        txtCodBarra.setText("");
        txtResumen.setText("");
    }

    private void limpiarPrestamo() {
        txtIdPrestamo.setText("");
        txtCantPrestamo.setText("");
        cbxSocio.removeAllItems();
        cbxLibros.removeAllItems();
        llenarSocio();
        llenarLibros();
        AutoCompleteDecorator.decorate(cbxSocio);
        AutoCompleteDecorator.decorate(cbxLibros);
        LimpiarTable();
        ListarPrestamo();
    }
}
