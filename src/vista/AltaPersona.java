/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import dao.PersonaDAO;
import dao.imp.PersonaDAOImp;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import dominio.Persona;
import util.mensajero;

/**
 *
 * @author dario
 */
public class AltaPersona extends javax.swing.JDialog {

    String padre;
    private String seraCura;
    Persona persona;
    boolean modificar = false;
    boolean agregado = false;

    /**
     * Creates new form AltaPersonas
     */
    public boolean isAgregado() {
        return agregado;
    }

    public void setAgregado(boolean agregado) {
        this.agregado = agregado;
    }

    public AltaPersona(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.seraCura = seraCura;
        initComponents();
        setLocationRelativeTo(parent);
        this.setVisible(true);
    }

    public AltaPersona(java.awt.Frame parent, boolean modal, Persona persona) {
        super(parent, modal);
        initComponents();
        this.persona = persona;
        // indico que se utiliza este formulario para modificar datos
        modificar = true;

        // cambiar las etiquetas para que mensionen q se hara una actualizacion de datos
        btnGuardarAltaPersona.setText("Modificar");
        this.setTitle("Actualizar Datos de la Persona");
        // cargar la persona en el formulario para qeu se edite
        txtApellido.setText(persona.getApellido());
        txtBario.setText(persona.getBarrio());
        txtDni.setText(String.valueOf(persona.getDni()));
        txtDomicilio.setText(persona.getDomicilio());
        txtLugarNac.setText(persona.getLugarNacimiento());
        txtNacionalidad.setText(persona.getNacionalidad());
        txtNombre.setText(persona.getNombre());
        txtTelCel.setText(persona.getTelefonoCelular());
        txtTelFijo.setText(persona.getTelefonoFijo());
        dateFechaNacim.setDate(persona.getFechaNaciemiento());
        cmbTipoHijo.setSelectedItem(persona.getTipoDeHijo());
        cmbSexo.setSelectedItem(persona.getSexo());
        // si toma una cadena q no esta en el combo
        cmbProvincia.setSelectedItem(persona.getProvNacimiento());

        setLocationRelativeTo(parent);
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtLugarNac = new javax.swing.JTextField();
        cmbProvincia = new javax.swing.JComboBox();
        txtNacionalidad = new javax.swing.JTextField();
        btnGuardarAltaPersona = new javax.swing.JButton();
        cmbSexo = new javax.swing.JComboBox();
        btnCancelarAltaPersona = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtDomicilio = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtBario = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtTelFijo = new javax.swing.JTextField();
        txtTelCel = new javax.swing.JTextField();
        cmbTipoHijo = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        dateFechaNacim = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alta de Persona");
        setBackground(new java.awt.Color(255, 255, 204));
        setForeground(new java.awt.Color(255, 255, 204));
        setMaximumSize(new java.awt.Dimension(665, 440));
        setMinimumSize(new java.awt.Dimension(665, 440));
        setPreferredSize(new java.awt.Dimension(665, 440));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Agregar a una Persona Nueva", 1, 0, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jLabel1.setText("Apellido/s:*");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 84, 110, 20);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nombre/s:*");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(323, 82, 80, 14);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Sexo:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(341, 114, 70, 14);

        jLabel4.setText(" Fecha de Nacimiento:*");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(8, 116, 130, 14);

        jLabel5.setText("Lugar de Nacimiento:*");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 180, 130, 14);

        jLabel6.setText("Pcia de Nacimiento:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(16, 214, 130, 14);

        jLabel7.setText("Nacionalidad:*");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(16, 145, 120, 14);

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombre);
        txtNombre.setBounds(413, 79, 149, 20);
        jPanel1.add(txtLugarNac);
        txtLugarNac.setBounds(160, 180, 150, 20);

        cmbProvincia.setEditable(true);
        cmbProvincia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Jujuy", "Catamarca", "Chaco", "Chubut", "Córdoba", "Corrientes", "Entre Ríos", "Formosa", "La Pampa", "La Rioja", "Mendoza", "Misiones", "Neuquén", "Río Negro", "Salta", "San Juan", "San Luis", "Santa Cruz", "Santa Fe", "Santiago del Estero", "Tucumán", "Tierra del Fuego", "Buenos Aires" }));
        jPanel1.add(cmbProvincia);
        cmbProvincia.setBounds(160, 210, 150, 20);
        jPanel1.add(txtNacionalidad);
        txtNacionalidad.setBounds(160, 250, 150, 20);

        btnGuardarAltaPersona.setText("Guardar");
        btnGuardarAltaPersona.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardarAltaPersona.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnGuardarAltaPersona.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardarAltaPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarAltaPersonaActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardarAltaPersona);
        btnGuardarAltaPersona.setBounds(199, 329, 104, 23);

        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Femenino", "Masculino" }));
        cmbSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSexoActionPerformed(evt);
            }
        });
        jPanel1.add(cmbSexo);
        cmbSexo.setBounds(415, 111, 147, 20);

        btnCancelarAltaPersona.setText("Cancelar");
        btnCancelarAltaPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarAltaPersonaActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelarAltaPersona);
        btnCancelarAltaPersona.setBounds(303, 329, 100, 23);

        jLabel8.setText("D.N.I.:*");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 50, 100, 14);

        txtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniActionPerformed(evt);
            }
        });
        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });
        jPanel1.add(txtDni);
        txtDni.setBounds(160, 50, 150, 20);

        jLabel9.setText("Domicilio:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(22, 252, 110, 14);
        jPanel1.add(txtDomicilio);
        txtDomicilio.setBounds(160, 140, 150, 20);

        jLabel10.setText("Barrio:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(371, 252, 32, 14);

        txtBario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtBario);
        txtBario.setBounds(407, 249, 155, 20);

        jLabel11.setText("Teléfono Fijo:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(16, 278, 120, 14);

        jLabel12.setText("Celular:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(366, 278, 37, 14);

        txtTelFijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelFijoActionPerformed(evt);
            }
        });
        jPanel1.add(txtTelFijo);
        txtTelFijo.setBounds(160, 280, 150, 20);
        jPanel1.add(txtTelCel);
        txtTelCel.setBounds(407, 275, 155, 20);

        cmbTipoHijo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Legitimo", "Union Civil", "Natural", "Natural Reconocido" }));
        cmbTipoHijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoHijoActionPerformed(evt);
            }
        });
        jPanel1.add(cmbTipoHijo);
        cmbTipoHijo.setBounds(415, 142, 147, 20);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Tipo de Hijo:");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(341, 142, 70, 20);

        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });
        jPanel1.add(txtApellido);
        txtApellido.setBounds(160, 80, 150, 20);
        jPanel1.add(dateFechaNacim);
        dateFechaNacim.setBounds(160, 110, 150, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 10, 600, 370);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logosite.png"))); // NOI18N
        getContentPane().add(jLabel14);
        jLabel14.setBounds(550, 350, 80, 60);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo3.png"))); // NOI18N
        getContentPane().add(jLabel15);
        jLabel15.setBounds(0, 0, 650, 400);

        getAccessibleContext().setAccessibleName("Agregar una¨Persona");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void cmbTipoHijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoHijoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbTipoHijoActionPerformed

    private void txtTelFijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelFijoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelFijoActionPerformed

    private void txtBarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBarioActionPerformed

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniActionPerformed

    private void btnCancelarAltaPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarAltaPersonaActionPerformed
        setAgregado(false);
        this.dispose();

    }//GEN-LAST:event_btnCancelarAltaPersonaActionPerformed

    private void cmbSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSexoActionPerformed

    private void btnGuardarAltaPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarAltaPersonaActionPerformed
        int dniOriginal;
        PersonaDAO personaDAO = new PersonaDAOImp();
//        Persona persona;
        if (!modificar) {
            //si se ingresa un nueva persona
            persona = new Persona();
            dniOriginal = 0;
        } else {
            dniOriginal = persona.getDni();
        }


        try {
            boolean cA, cN, cD, cLN = false;
            cA = txtApellido.getText().trim().isEmpty();
            cN = txtNombre.getText().trim().isEmpty();
            cD = txtDni.getText().trim().isEmpty();
            cLN = txtLugarNac.getText().trim().isEmpty();





            //corroboro que no este vacio
            if (cA || cLN || cN || cD) {
                //falta llenar campos
                JOptionPane.showMessageDialog(null, "Debes completar  los campos Obligatorios *");

            } else {

                persona.setApellido(txtApellido.getText().toUpperCase().trim());

                persona.setNombre(txtNombre.getText().toUpperCase().trim());
                persona.setDni(Integer.parseInt(txtDni.getText().trim()));
                persona.setSexo(cmbSexo.getSelectedItem().toString());
                persona.setTipoDeHijo(cmbTipoHijo.getSelectedItem().toString());
                persona.setFechaNaciemiento(dateFechaNacim.getDate());
                persona.setLugarNacimiento(txtLugarNac.getText().toUpperCase().trim());
                persona.setProvNacimiento(cmbProvincia.getSelectedItem().toString());
                persona.setNacionalidad(txtNacionalidad.getText().toUpperCase().trim());
                persona.setDomicilio(txtDomicilio.getText().toUpperCase().trim());
                persona.setBarrio(txtBario.getText().toUpperCase().trim());
                persona.setTelefonoFijo(txtTelFijo.getText().toUpperCase().trim());
                persona.setTelefonoCelular(txtTelCel.getText().toUpperCase().trim());

                boolean b = false;
                setAgregado(true);
                if (modificar) {
                    // entro a modificar el dni
                    if (persona.getDni() == dniOriginal) {
                        // no modifico el dni 
                        personaDAO.update(persona);
                        JOptionPane.showMessageDialog(null, "Se cargo correctamente...");
                        modificar = false;
                        this.dispose();

                    } else {
                        //modifico el dni
                        try {

                            //tira error si no existe la persona una persona dni
                            int pVerificar = new PersonaDAOImp().getPersona(persona.getDni()).getDni();


                        } catch (Exception e) {
                            // Si no existe la persona entonces se borra la persona y se cre nuevo con el dni  mofiiciado
                            b = true;
                            Persona personaOriginal = new PersonaDAOImp().getPersona(dniOriginal);
                            new PersonaDAOImp().delete(personaOriginal);
                            //creo una nueva persona con el nuevo dni modificado
                            new PersonaDAOImp().insert(persona);
                            System.out.println(" cambio el dni pero la persona no existe asi q todo ok");

                            JOptionPane.showMessageDialog(null, "Se cargo correctamente...");
                            modificar = false;
                            this.dispose();
                        }

                        if (!b) {
                            JOptionPane.showMessageDialog(null, "Error la Persona Ya Existe , por favor corrija el DNI 2");
                           
                        }


                    }

                } else {
                    // una persona nueva
                    personaDAO.insert(persona);
                    JOptionPane.showMessageDialog(null, "Se cargo correctamente...");
                    modificar = false;
                    this.dispose();
                }

            }

        } catch (org.hibernate.exception.ConstraintViolationException dniRepetido) {
            JOptionPane.showMessageDialog(null, "La Persona Ya Existe, por favor corrija el DNI ");

        } catch (org.hibernate.PropertyValueException e) {
            JOptionPane.showMessageDialog(null, "Debes ingresar la Fecha de Nacimiento");

        }







    }//GEN-LAST:event_btnGuardarAltaPersonaActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped
        consumirLetras(evt);
        if (txtDni.getText().length() == 8) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDniKeyTyped

    public boolean validacion() {
        boolean vacio = true;
        ArrayList<JTextField> listaTxt = new ArrayList();
        listaTxt.add(txtApellido);
        listaTxt.add(txtNombre);
        listaTxt.add(txtDni);
        listaTxt.add(txtDomicilio);
        listaTxt.add(txtBario);
//        listaTxt.add(txtTelFijo);listaTxt.add(txtTelCel);
        listaTxt.add(txtLugarNac);
        listaTxt.add(txtNacionalidad);
        for (Iterator<JTextField> it = listaTxt.iterator(); it.hasNext();) {
            JTextField jTextField = it.next();
            if (jTextField.getText().equals("")) {
                jTextField.setBackground(Color.red);
                vacio = true;
                break;
            } else {
                vacio = false;
            }
        }
        return vacio;
    }

    public void consumirLetras(java.awt.event.KeyEvent evt) {
        // conusmir los caracteres del legajo excepto los numeros
        char caracter = evt.getKeyChar();
        if (((caracter < '0')
                || (caracter > '9'))
                && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
            evt.consume();  // ignorar el evento de teclado
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarAltaPersona;
    private javax.swing.JButton btnGuardarAltaPersona;
    private javax.swing.JComboBox cmbProvincia;
    private javax.swing.JComboBox cmbSexo;
    private javax.swing.JComboBox cmbTipoHijo;
    private com.toedter.calendar.JDateChooser dateFechaNacim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtBario;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtDomicilio;
    private javax.swing.JTextField txtLugarNac;
    private javax.swing.JTextField txtNacionalidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelCel;
    private javax.swing.JTextField txtTelFijo;
    // End of variables declaration//GEN-END:variables
}
