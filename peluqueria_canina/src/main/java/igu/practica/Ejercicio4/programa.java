package igu.practica.Ejercicio4;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.util.Locale;

public class programa extends JFrame {
    private JPanel panel;
    private JTextField txtNombre;
    private JTextField txtApellidos;
    private JTextField txtEmail;
    private JTextField txtCelular;
    private JTextField txtDireccion;
    private JLabel lblDatos;
    private JLabel lblNombre;
    private JLabel lblApellidos;
    private JLabel lblEmail;
    private JLabel lblCelular;
    private JLabel lblDireccion;
    private JTable tabla;
    DefaultComboBoxModel<Persona> modelo;
    DefaultTableModel modeloTabla;
    JComboBox lista;
    private JButton btnInsertar;
    private JLabel lblPersona;

    public programa() {
        llenarModelo();
        llenarModeloTabla();
        $$$setupUI$$$();
        iniciarComponentes();
        setSize(new Dimension(600, 620));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
        setVisible(true);
    }

    public void iniciarComponentes() {
        setContentPane(panel);
    }

    public void llenarModelo() {
        modelo = new DefaultComboBoxModel<Persona>();
        modelo.addElement(new Persona("Fabio", "Escobar", "fabio@hotmail.com", "3006336107", "cra 8H #128-26"));
        modelo.addElement(new Persona("Yulieh", "Horta", "Yulieth@hotmail.com", "3504134640", "cra 8H #128-26"));
        modelo.addElement(new Persona("Alejandro", "Escobar", "alejandro@hotmail.com", "3006336107", "cra 8H #128-26"));
    }

    public void llenarModeloTabla() {
        modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Apellido");
        modeloTabla.addColumn("Email");
        modeloTabla.addColumn("Telefono");
        modeloTabla.addColumn("Direccion");
    }


    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        createUIComponents();
        panel = new JPanel();
        panel.setLayout(new com.intellij.uiDesigner.core.GridLayoutManager(14, 2, new Insets(30, 30, 30, 30), -1, -1));
        Font panelFont = this.$$$getFont$$$("Inter", Font.PLAIN, 16, panel.getFont());
        if (panelFont != null) panel.setFont(panelFont);
        lblDatos = new JLabel();
        Font lblDatosFont = this.$$$getFont$$$("Inter", Font.BOLD, 20, lblDatos.getFont());
        if (lblDatosFont != null) lblDatos.setFont(lblDatosFont);
        lblDatos.setText("Datos de la persona");
        panel.add(lblDatos, new com.intellij.uiDesigner.core.GridConstraints(6, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        lblNombre = new JLabel();
        Font lblNombreFont = this.$$$getFont$$$("Inter", Font.BOLD, 16, lblNombre.getFont());
        if (lblNombreFont != null) lblNombre.setFont(lblNombreFont);
        lblNombre.setText("Nombre");
        panel.add(lblNombre, new com.intellij.uiDesigner.core.GridConstraints(8, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        lblApellidos = new JLabel();
        Font lblApellidosFont = this.$$$getFont$$$("Inter", Font.BOLD, 16, lblApellidos.getFont());
        if (lblApellidosFont != null) lblApellidos.setFont(lblApellidosFont);
        lblApellidos.setText("Apellidos");
        panel.add(lblApellidos, new com.intellij.uiDesigner.core.GridConstraints(8, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        lblEmail = new JLabel();
        Font lblEmailFont = this.$$$getFont$$$("Inter", Font.BOLD, 16, lblEmail.getFont());
        if (lblEmailFont != null) lblEmail.setFont(lblEmailFont);
        lblEmail.setText("Email");
        panel.add(lblEmail, new com.intellij.uiDesigner.core.GridConstraints(10, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        lblCelular = new JLabel();
        Font lblCelularFont = this.$$$getFont$$$("Inter", Font.BOLD, 16, lblCelular.getFont());
        if (lblCelularFont != null) lblCelular.setFont(lblCelularFont);
        lblCelular.setText("Celular");
        panel.add(lblCelular, new com.intellij.uiDesigner.core.GridConstraints(10, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        lblDireccion = new JLabel();
        Font lblDireccionFont = this.$$$getFont$$$("Inter", Font.BOLD, 16, lblDireccion.getFont());
        if (lblDireccionFont != null) lblDireccion.setFont(lblDireccionFont);
        lblDireccion.setText("Dirección");
        panel.add(lblDireccion, new com.intellij.uiDesigner.core.GridConstraints(12, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        txtNombre = new JTextField();
        Font txtNombreFont = this.$$$getFont$$$("Inter", Font.PLAIN, 14, txtNombre.getFont());
        if (txtNombreFont != null) txtNombre.setFont(txtNombreFont);
        panel.add(txtNombre, new com.intellij.uiDesigner.core.GridConstraints(9, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, 30), null, 0, false));
        txtApellidos = new JTextField();
        Font txtApellidosFont = this.$$$getFont$$$("Inter", Font.PLAIN, 14, txtApellidos.getFont());
        if (txtApellidosFont != null) txtApellidos.setFont(txtApellidosFont);
        panel.add(txtApellidos, new com.intellij.uiDesigner.core.GridConstraints(9, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, 30), null, 0, false));
        txtEmail = new JTextField();
        Font txtEmailFont = this.$$$getFont$$$("Inter", Font.PLAIN, 14, txtEmail.getFont());
        if (txtEmailFont != null) txtEmail.setFont(txtEmailFont);
        panel.add(txtEmail, new com.intellij.uiDesigner.core.GridConstraints(11, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, 30), null, 0, false));
        txtCelular = new JTextField();
        Font txtCelularFont = this.$$$getFont$$$("Inter", Font.PLAIN, 14, txtCelular.getFont());
        if (txtCelularFont != null) txtCelular.setFont(txtCelularFont);
        panel.add(txtCelular, new com.intellij.uiDesigner.core.GridConstraints(11, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, 30), null, 0, false));
        txtDireccion = new JTextField();
        Font txtDireccionFont = this.$$$getFont$$$("Inter", Font.PLAIN, 14, txtDireccion.getFont());
        if (txtDireccionFont != null) txtDireccion.setFont(txtDireccionFont);
        panel.add(txtDireccion, new com.intellij.uiDesigner.core.GridConstraints(13, 0, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, new Dimension(150, 30), null, 0, false));
        Font tablaFont = this.$$$getFont$$$("Inter", Font.PLAIN, 14, tabla.getFont());
        if (tablaFont != null) tabla.setFont(tablaFont);
        tabla.setShowHorizontalLines(true);
        panel.add(tabla, new com.intellij.uiDesigner.core.GridConstraints(4, 0, 1, 2, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_BOTH, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(300, 200), null, 0, false));
        final com.intellij.uiDesigner.core.Spacer spacer1 = new com.intellij.uiDesigner.core.Spacer();
        panel.add(spacer1, new com.intellij.uiDesigner.core.GridConstraints(5, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_VERTICAL, 1, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(-1, 20), null, 0, false));
        lblPersona = new JLabel();
        Font lblPersonaFont = this.$$$getFont$$$("Inter", Font.BOLD, 20, lblPersona.getFont());
        if (lblPersonaFont != null) lblPersona.setFont(lblPersonaFont);
        lblPersona.setText("Persona");
        panel.add(lblPersona, new com.intellij.uiDesigner.core.GridConstraints(0, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_NONE, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        lista.setEditable(false);
        Font listaFont = this.$$$getFont$$$("Inter", Font.PLAIN, 16, lista.getFont());
        if (listaFont != null) lista.setFont(listaFont);
        panel.add(lista, new com.intellij.uiDesigner.core.GridConstraints(2, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_WEST, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        btnInsertar = new JButton();
        Font btnInsertarFont = this.$$$getFont$$$("Inter", Font.BOLD, 16, btnInsertar.getFont());
        if (btnInsertarFont != null) btnInsertar.setFont(btnInsertarFont);
        btnInsertar.setText("Insertar Persona");
        panel.add(btnInsertar, new com.intellij.uiDesigner.core.GridConstraints(2, 1, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_HORIZONTAL, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_SHRINK | com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_CAN_GROW, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final com.intellij.uiDesigner.core.Spacer spacer2 = new com.intellij.uiDesigner.core.Spacer();
        panel.add(spacer2, new com.intellij.uiDesigner.core.GridConstraints(3, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_VERTICAL, 1, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(-1, 15), null, 0, false));
        final com.intellij.uiDesigner.core.Spacer spacer3 = new com.intellij.uiDesigner.core.Spacer();
        panel.add(spacer3, new com.intellij.uiDesigner.core.GridConstraints(1, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_VERTICAL, 1, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(-1, 5), null, 0, false));
        final com.intellij.uiDesigner.core.Spacer spacer4 = new com.intellij.uiDesigner.core.Spacer();
        panel.add(spacer4, new com.intellij.uiDesigner.core.GridConstraints(7, 0, 1, 1, com.intellij.uiDesigner.core.GridConstraints.ANCHOR_CENTER, com.intellij.uiDesigner.core.GridConstraints.FILL_VERTICAL, 1, com.intellij.uiDesigner.core.GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(-1, 5), null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        Font font = new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
        boolean isMac = System.getProperty("os.name", "").toLowerCase(Locale.ENGLISH).startsWith("mac");
        Font fontWithFallback = isMac ? new Font(font.getFamily(), font.getStyle(), font.getSize()) : new StyleContext().getFont(font.getFamily(), font.getStyle(), font.getSize());
        return fontWithFallback instanceof FontUIResource ? fontWithFallback : new FontUIResource(fontWithFallback);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panel;
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        lista = new JComboBox();
        lista.setModel(modelo);
        tabla = new JTable();
        tabla.setModel(modeloTabla);

    }
}
