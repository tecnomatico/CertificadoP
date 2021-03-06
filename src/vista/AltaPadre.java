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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import util.mensajero;

/**
 *
 * @author AnahiAramayo
 */
public class AltaPadre extends javax.swing.JDialog {

    //String espadre;
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

    public AltaPadre(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.seraCura = seraCura;
        
        initComponents();
        SLetras(txtApellido);
        SLetras(txtNombre);
        SLetras(txtNacionalidad);
        SLetras(txtLugarNac);
//        SLetras(txtDomicilio);
        SLetras(txtBarrio);
        SNumeros(txtTelFijo);
        SNumeros(txtTelCel);
        
        setLocationRelativeTo(parent);
        /*txtDni.setEnabled(true);
        espadre = cmbTipoHijo.getSelectedItem().toString();
        System.out.println(espadre);
        System.out.println(espadre);
        System.out.println(espadre);
        System.out.println(espadre);
        if (espadre != null) {
            txtDni.setVisible(false);
        }*/
        this.setVisible(true);
        
        
    }
    
    /**
     * Este constructo es para que controle el alta de una padres o padrino con sexo masculino o femenino
     * en el alta automaticamente setea si es masculino o femenino y lo inabilita
     * @param parent
     * @param modal
     * @param sexo 
     */
    public AltaPadre(java.awt.Frame parent,boolean modal, String sexo) {
        super(parent, modal);
        this.seraCura = seraCura;
        
        initComponents();
        SLetras(txtApellido);
        SLetras(txtNombre);
        SLetras(txtNacionalidad);
        SLetras(txtLugarNac);
//        SLetras(txtDomicilio);
        SLetras(txtBarrio);
        SNumeros(txtTelFijo);
        SNumeros(txtTelCel);
        
        if (sexo.equals(cons.Constantes.SEXO_MASCULINO)) {
            System.out.println(cons.Constantes.SEXO_MASCULINO +"es igual "+ sexo);
            cmbSexo.setSelectedItem(cons.Constantes.SEXO_MASCULINO);
            cmbSexo.setEnabled(false);
        } else {
            System.out.println(cons.Constantes.SEXO_FEMENINO +"es igual "+ sexo);
            cmbSexo.setSelectedItem(cons.Constantes.SEXO_FEMENINO);
            cmbSexo.setEnabled(false);
        }
        setLocationRelativeTo(parent);
        
        this.setVisible(true);
        
        
    }

    public AltaPadre(java.awt.Frame parent, boolean modal, Persona persona) {
        super(parent, modal);
        initComponents();
       //txtDni.setEnabled(true);
        this.persona = persona;
        // indico que se utiliza este formulario para modificar datos
        modificar = true;
        // cambiar las etiquetas para que mensionen q se hara una actualizacion de datos
        btnGuardarAltaPersona.setText("Modificar");
        this.setTitle("Actualizar Datos de la Persona");
        
        
         SLetras(txtApellido);
        SLetras(txtNombre);
        SLetras(txtNacionalidad);
        SLetras(txtLugarNac);
//        SLetras(txtDomicilio);
        SLetras(txtBarrio);
        SNumeros(txtTelFijo);
        SNumeros(txtTelCel);
        // cargar la persona en el formulario para qeu se edite
        txtApellido.setText(persona.getApellido());
        txtBarrio.setText(persona.getBarrio());
//        txtDni.setText(String.valueOf(persona.getDni()));
        txtDomicilio.setText(persona.getDomicilio());
        txtLugarNac.setText(persona.getLugarNacimiento());
        txtNacionalidad.setText(persona.getNacionalidad());
        txtNombre.setText(persona.getNombre());
        txtTelCel.setText(persona.getTelefonoCelular());
        txtTelFijo.setText(persona.getTelefonoFijo());
        dateFechaNacim.setDate(persona.getFechaNaciemiento());
//        cmbTipoHijo.setSelectedItem(persona.getTipoDeHijo());
        
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
        jLabel9 = new javax.swing.JLabel();
        txtDomicilio = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtBarrio = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtTelFijo = new javax.swing.JTextField();
        txtTelCel = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        dateFechaNacim = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alta de Persona");
        setBackground(new java.awt.Color(255, 255, 204));
        setForeground(new java.awt.Color(255, 255, 204));
        setMaximumSize(new java.awt.Dimension(595, 390));
        setMinimumSize(new java.awt.Dimension(595, 390));
        setPreferredSize(new java.awt.Dimension(595, 390));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos personales ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel1.setMaximumSize(new java.awt.Dimension(530, 370));
        jPanel1.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Apellido/s:*");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nombre/s:*");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Sexo:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText(" Fecha de Nacimiento:*");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Lugar de Nacimiento:*");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Pcia de Nacimiento:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Nacionalidad:*");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        cmbProvincia.setEditable(true);
        cmbProvincia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "JUJUY", "CATAMARCA", "CHACO", "CHUBUT", "CÓRDOBA", "CORRIENTES", "ENTRE RÍOS", "FORMOSA", "LA PAMPA", "LA RIOJA", "MENDOZA", "MISIONES", "NEUQUÉN", "RÍO NEGRO", "SALTA", "SAN JUAN", "SAN LUIS", "SANTA CRUZ", "SANTA FE", "SANTIAGO DEL ESTERO", "TUCUMÁN", "TIERRA DEL FUEGO", "BUENOS AIRES" }));

        btnGuardarAltaPersona.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGuardarAltaPersona.setText("Guardar");
        btnGuardarAltaPersona.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGuardarAltaPersona.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnGuardarAltaPersona.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGuardarAltaPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarAltaPersonaActionPerformed(evt);
            }
        });

        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "FEMENINO", "MASCULINO" }));
        cmbSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSexoActionPerformed(evt);
            }
        });

        btnCancelarAltaPersona.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCancelarAltaPersona.setText("Cancelar");
        btnCancelarAltaPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarAltaPersonaActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Domicilio:");

        txtDomicilio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDomicilioActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Barrio:");

        txtBarrio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBarrioActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Teléfono Fijo:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Celular:");

        txtTelFijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelFijoActionPerformed(evt);
            }
        });

        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logosite.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateFechaNacim, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLugarNac, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGuardarAltaPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelFijo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCancelarAltaPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel10)
                                .addComponent(jLabel12))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtBarrio, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(txtTelCel)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(txtNombre)
                    .addComponent(jLabel2)
                    .addComponent(txtApellido)
                    .addComponent(jLabel1))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(dateFechaNacim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBarrio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelCel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtLugarNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelFijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCancelarAltaPersona)
                            .addComponent(btnGuardarAltaPersona))
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 560, 330);
        jPanel1.getAccessibleContext().setAccessibleName("Agregar/Modificar una Persona ");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo3.png"))); // NOI18N
        getContentPane().add(jLabel15);
        jLabel15.setBounds(0, 0, 580, 350);

        getAccessibleContext().setAccessibleName("Agregar una¨Persona");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtTelFijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelFijoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelFijoActionPerformed

    private void txtBarrioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBarrioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBarrioActionPerformed

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
//            cD = txtDni.getText().trim().isEmpty();
            cLN = txtLugarNac.getText().trim().isEmpty();

            //corroboro que no este vacio
            if (cA || cLN || cN ) {
                //falta llenar campos
                JOptionPane.showMessageDialog(null, "Debes completar  los campos Obligatorios *");

            } else {
                persona.setApellido(txtApellido.getText().toUpperCase().trim());
                persona.setNombre(txtNombre.getText().toUpperCase().trim());
//                persona.setDni(Integer.parseInt(txtDni.getText().trim()));
                persona.setSexo(cmbSexo.getSelectedItem().toString().toUpperCase());
//                persona.setTipoDeHijo(cmbTipoHijo.getSelectedItem().toString());
                persona.setFechaNaciemiento(dateFechaNacim.getDate());
                persona.setLugarNacimiento(txtLugarNac.getText().toUpperCase().trim());
                persona.setProvNacimiento(cmbProvincia.getSelectedItem().toString().toUpperCase());
                persona.setNacionalidad(txtNacionalidad.getText().toUpperCase().trim());
                persona.setDomicilio(txtDomicilio.getText().toUpperCase().trim());
                persona.setBarrio(txtBarrio.getText().toUpperCase().trim());
                persona.setTelefonoFijo(txtTelFijo.getText().toUpperCase().trim());
                persona.setTelefonoCelular(txtTelCel.getText().toUpperCase().trim());

                boolean b = false;
                setAgregado(true);
                if (modificar) {
                        
                            new PersonaDAOImp().update(persona);
                            System.out.println("  todo ok update");

                            JOptionPane.showMessageDialog(null, "Se cargo correctamente...");
                            modificar = false;
                            this.dispose();
                
                        

                       

                } else {
                    // una persona nueva
                    personaDAO.insert(persona);
                    JOptionPane.showMessageDialog(null, "Se cargo correctamente...");
                    modificar = false;
                    this.dispose();
                }

            }

        } catch (org.hibernate.PropertyValueException e) {
            JOptionPane.showMessageDialog(null, "Debes ingresar la Fecha de Nacimiento");

        }
    }//GEN-LAST:event_btnGuardarAltaPersonaActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtDomicilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDomicilioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDomicilioActionPerformed

    public boolean validacion() {
        boolean vacio = true;
        ArrayList<JTextField> listaTxt = new ArrayList();
        listaTxt.add(txtApellido);
        listaTxt.add(txtNombre);
//        listaTxt.add(txtDni);
        listaTxt.add(txtDomicilio);
        listaTxt.add(txtBarrio);
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
    public void SLetras(JTextField a){
    a.addKeyListener(new KeyAdapter() {
        @Override
        public void keyTyped(KeyEvent v){
            char c=v.getKeyChar();
            if (Character.isDigit(c)){
                getToolkit().beep();
                v.consume();
            }
        }
    });
            }
      public void SNumeros(JTextField a){
    a.addKeyListener(new KeyAdapter() {
        @Override
        public void keyTyped(KeyEvent v){
            char c=v.getKeyChar();
            if (!Character.isDigit(c)){
                getToolkit().beep();
                v.consume();
            }
        }
    });
            }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarAltaPersona;
    private javax.swing.JButton btnGuardarAltaPersona;
    private javax.swing.JComboBox cmbProvincia;
    private javax.swing.JComboBox cmbSexo;
    private com.toedter.calendar.JDateChooser dateFechaNacim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtBarrio;
    private javax.swing.JTextField txtDomicilio;
    private javax.swing.JTextField txtLugarNac;
    private javax.swing.JTextField txtNacionalidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelCel;
    private javax.swing.JTextField txtTelFijo;
    // End of variables declaration//GEN-END:variables
}
