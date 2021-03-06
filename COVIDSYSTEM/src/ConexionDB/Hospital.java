/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionDB;
import java.sql.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Daniel Xithe
 */
public class Hospital extends javax.swing.JFrame {

    /**
     * Creates new form DatosPersonales
     */
    public Hospital() {
        initComponents();
        setLocationRelativeTo(null);
        MostrarDatos();
        MostrarRegistrosTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtIngresosIRAG = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtEgresosIRAGDefuncion = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtEgresosIRAGAM = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtTotalEgresosIRAG = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtCamasSensables = new javax.swing.JTextField();
        txtCamasNoSensables = new javax.swing.JTextField();
        txtIdEncargado = new javax.swing.JTextField();
        txtTotalCamas = new javax.swing.JTextField();
        txtCamaVentilacion = new javax.swing.JTextField();
        txtTotalCamasIRAG = new javax.swing.JTextField();
        txtCarrosOcupados = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtPacienteIRAGSinCama = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtOcupacion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCovid = new javax.swing.JTable();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        Limpiar = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtIngresosIRAG.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel10.setText("Id Encargado");

        txtEgresosIRAGDefuncion.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel11.setText("Camas Sensables");

        txtEgresosIRAGAM.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Dialog", 3, 20)); // NOI18N
        jLabel12.setText("Camas no sensables");

        txtTotalEgresosIRAG.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Dialog", 3, 20)); // NOI18N
        jLabel13.setText("Total de camas");

        jLabel14.setFont(new java.awt.Font("Dialog", 3, 20)); // NOI18N
        jLabel14.setText("Camas con ventilacion");

        jLabel20.setFont(new java.awt.Font("Dialog", 3, 20)); // NOI18N
        jLabel20.setText("Total de egresos IRAG");

        jLabel22.setFont(new java.awt.Font("Dialog", 3, 20)); // NOI18N
        jLabel22.setText("Carros ocupados");

        jLabel23.setFont(new java.awt.Font("Dialog", 3, 20)); // NOI18N
        jLabel23.setText("Pacientes IRAG sin cama");

        txtCamasSensables.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txtCamasNoSensables.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txtIdEncargado.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtIdEncargado.setToolTipText("");

        txtTotalCamas.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txtCamaVentilacion.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txtTotalCamasIRAG.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtTotalCamasIRAG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalCamasIRAGActionPerformed(evt);
            }
        });

        txtCarrosOcupados.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Dialog", 3, 20)); // NOI18N
        jLabel15.setText("Total de camas IRAG");

        txtPacienteIRAGSinCama.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Dialog", 3, 20)); // NOI18N
        jLabel16.setText("Ocupacion");

        jLabel17.setFont(new java.awt.Font("Dialog", 3, 20)); // NOI18N
        jLabel17.setText("Ingresos IRAG");

        jLabel18.setFont(new java.awt.Font("Dialog", 3, 20)); // NOI18N
        jLabel18.setText("Egresos IRAG defuncion");

        jLabel19.setFont(new java.awt.Font("Dialog", 3, 20)); // NOI18N
        jLabel19.setText("Egresos IRAG alta medica");

        txtOcupacion.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtOcupacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOcupacionActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Dialog", 3, 26)); // NOI18N
        jLabel9.setText("DATOS DE HOSPITALES ");

        tblCovid.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        tblCovid.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblCovid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCovidMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCovid);

        btnGuardar.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnActualizar.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        Limpiar.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        Limpiar.setText("Limpiar");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Dialog", 3, 20)); // NOI18N
        jLabel24.setText("Id Reporte");

        txtId.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtId.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel24))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtTotalCamas, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                        .addComponent(txtCamasNoSensables, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtCamasSensables, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtId, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(txtIdEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel15))
                                        .addGap(1, 1, 1)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCamaVentilacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTotalCamasIRAG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtOcupacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel17))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtEgresosIRAGDefuncion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                    .addComponent(txtIngresosIRAG))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtEgresosIRAGAM, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTotalEgresosIRAG, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCarrosOcupados, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPacienteIRAGSinCama, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(173, 173, 173))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel9)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(419, 419, 419)
                .addComponent(btnGuardar)
                .addGap(156, 156, 156)
                .addComponent(btnEliminar)
                .addGap(202, 202, 202)
                .addComponent(btnActualizar)
                .addGap(97, 97, 97)
                .addComponent(Limpiar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel24)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(txtIdEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(txtCamasSensables, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtOcupacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCamaVentilacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtTotalCamasIRAG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(jLabel16))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel15))
                            .addComponent(jLabel14))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(txtCamasNoSensables, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(txtTotalCamas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(txtIngresosIRAG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18)
                                    .addComponent(txtEgresosIRAGDefuncion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(txtEgresosIRAGAM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(txtTotalEgresosIRAG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(txtCarrosOcupados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(txtPacienteIRAGSinCama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(85, 85, 85)))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnGuardar)
                        .addComponent(btnEliminar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Limpiar)
                        .addComponent(btnActualizar)))
                .addGap(58, 58, 58)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        try {
            Connection con1 = null;
            ConexionBase conectado = new ConexionBase();
            con1=conectado.getConnection();
            Statement st= con1.createStatement();
            String SQLGuardar ="INSERT INTO Hospital(Id_Hospital,Id_Encargado,CamasSen,CamasNoSen,TotalCamas,CamasVen,TotalCamasIRAG,Ocupacion,IngreIRAG,EgreIRAGDef,EgreIRAGAltaMedica,TotalEgreIRAG,CarrosOcupados,PacienIRAGsc)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst = con1.prepareCall(SQLGuardar);
            pst.setInt(1,Integer.parseInt(txtId.getText()));
            pst.setString(2,txtIdEncargado.getText());
            pst.setInt(3,Integer.parseInt(txtCamasSensables.getText()));
            pst.setInt(4,Integer.parseInt(txtCamasNoSensables.getText()));
            pst.setInt(5,Integer.parseInt(txtTotalCamas.getText()));
            pst.setInt(6,Integer.parseInt(txtCamaVentilacion.getText()));
            pst.setInt(7,Integer.parseInt(txtTotalCamasIRAG.getText()));
            pst.setInt(8,Integer.parseInt(txtOcupacion.getText()));
            pst.setInt(9,Integer.parseInt(txtIngresosIRAG.getText()));
            pst.setInt(10,Integer.parseInt(txtEgresosIRAGDefuncion.getText()));
            pst.setInt(11,Integer.parseInt(txtEgresosIRAGAM.getText()));
            pst.setInt(12,Integer.parseInt(txtTotalEgresosIRAG.getText()));
            pst.setInt(13,Integer.parseInt(txtCarrosOcupados.getText()));
            pst.setInt(14,Integer.parseInt(txtPacienteIRAGSinCama.getText()));
            int n= pst.executeUpdate();
            pst.close();
            if (n>0){
                JOptionPane.showMessageDialog(null, "Datos guardados exitosamente");
                limpiar();
                MostrarDatos();
                MostrarRegistrosTabla();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar los datos: "+e);
            System.out.println(e);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_LimpiarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        int fila= this.tblCovid.getSelectedRow();
        if(fila==-1){
            JOptionPane.showMessageDialog(null, "Seleccione para actualizar un registro");
        }else{
            try {
                Connection con2=null;
                ConexionBase conectado= new ConexionBase();
                con2=conectado.getConnection();
                Statement st= con2.createStatement();
                String SQLModificar ="UPDATE Hospital SET Id_Encargado = ?, CamasSen = ?, CamasNoSen = ?, TotalCamas = ?, CamasVen = ?, TotalCamasIRAG = ?, Ocupacion = ?, IngreIRAG = ?, EgreIRAGDef = ?, EgreIRAGAltaMedica = ?, TotalEgreIRAG = ?, CarrosOcupados = ?, PacienIRAGsc = ? WHERE Id_Hospital = ?";
                PreparedStatement pst=con2.prepareStatement(SQLModificar);
                pst.setInt(14, Integer.parseInt(txtId.getText()));
                pst.setString(1,txtIdEncargado.getText());
                pst.setInt(2, Integer.parseInt(txtCamasSensables.getText()));
                pst.setInt(3, Integer.parseInt(txtCamasNoSensables.getText()));
                pst.setInt(4, Integer.parseInt(txtTotalCamas.getText())); 
                pst.setInt(5, Integer.parseInt(txtCamaVentilacion.getText())); 
                pst.setInt(6, Integer.parseInt(txtTotalCamasIRAG.getText())); 
                pst.setInt(7, Integer.parseInt(txtOcupacion.getText())); 
                pst.setInt(8, Integer.parseInt(txtIngresosIRAG.getText())); 
                pst.setInt(9, Integer.parseInt(txtEgresosIRAGDefuncion.getText())); 
                pst.setInt(10, Integer.parseInt(txtEgresosIRAGAM.getText())); 
                pst.setInt(11, Integer.parseInt(txtTotalEgresosIRAG.getText())); 
                pst.setInt(12, Integer.parseInt(txtCarrosOcupados.getText())); 
                pst.setInt(13, Integer.parseInt(txtPacienteIRAGSinCama.getText())); 
                
                int s=pst.executeUpdate();
                pst.close();
                if(s>0){
                    JOptionPane.showMessageDialog(this, "Datos actualizados");
                    MostrarDatos();
                    MostrarRegistrosTabla();
                }
                
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Error al actualizar los datos"+ e);
            }
        }
        
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        int fila=tblCovid.getSelectedRow();
        if (fila==-1){
            JOptionPane.showMessageDialog(this,"Seleccione primero un registro para eliminarlo");
        }else{
            int Eliminar=JOptionPane.showConfirmDialog(null, "??Esta seguro de eliminarlo?","Pregunta",JOptionPane.ERROR_MESSAGE,JOptionPane.YES_NO_OPTION);
            if (Eliminar==JOptionPane.YES_OPTION){
                try {
                    Connection con3 = null;
                    ConexionBase Conexion = new ConexionBase();
                    con3=Conexion.getConnection();
                    Statement st= con3.createStatement();
                    String SQLElimina="DELETE * FROM Hospital WHERE Id_Hospital=?";
                    PreparedStatement pst=con3.prepareStatement(SQLElimina);
                    pst.setInt(1, Integer.parseInt(txtId.getText()));
                    int n=pst.executeUpdate();
                    if(n>0){
                        JOptionPane.showMessageDialog(this,"Registro eliminado");
                        limpiar();
                        MostrarDatos();
                        MostrarRegistrosTabla();
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this,"Error al eliminar datos: "+e);
                }
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void tblCovidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCovidMouseClicked
        // TODO add your handling code here:
        try {
            int fila = tblCovid.getSelectedRow();
            this.txtId.setText(tblCovid.getValueAt(fila, 0).toString());
            this.txtIdEncargado.setText(tblCovid.getValueAt(fila, 1).toString());
            this.txtCamasSensables.setText(tblCovid.getValueAt(fila, 2).toString());
            this.txtCamasNoSensables.setText(tblCovid.getValueAt(fila, 3).toString());
            this.txtTotalCamas.setText(tblCovid.getValueAt(fila, 4).toString());
            this.txtCamaVentilacion.setText(tblCovid.getValueAt(fila, 5).toString());
            this.txtTotalCamasIRAG.setText(tblCovid.getValueAt(fila, 6).toString());
            this.txtOcupacion.setText(tblCovid.getValueAt(fila, 7).toString());
            this.txtIngresosIRAG.setText(tblCovid.getValueAt(fila, 8).toString());
            this.txtEgresosIRAGDefuncion.setText(tblCovid.getValueAt(fila, 9).toString());
            this.txtEgresosIRAGAM.setText(tblCovid.getValueAt(fila, 10).toString());
            this.txtTotalEgresosIRAG.setText(tblCovid.getValueAt(fila, 11).toString());
            this.txtCarrosOcupados.setText(tblCovid.getValueAt(fila, 12).toString());
            this.txtPacienteIRAGSinCama.setText(tblCovid.getValueAt(fila, 13).toString());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al seleccionar datos"+ e);
        }
    }//GEN-LAST:event_tblCovidMouseClicked

    private void txtOcupacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOcupacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOcupacionActionPerformed

    private void txtTotalCamasIRAGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalCamasIRAGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalCamasIRAGActionPerformed

    public void MostrarDatos(){
        DefaultTableModel MiTabla=(DefaultTableModel)tblCovid.getModel();
        String EncabezadoTabla[]={"Id_Hospital","Id_Encargado","CamasSen","CamasNoSen","TotalCamas","CamasVen","TotCamIRAG","Ocupacion","IngreIRAG","EgreIRAGDefuncion","EgreIRAGAltaMedica","TotEgreIRAG","CarrosOcupados","PacienIRAGsc"};
        MiTabla= new DefaultTableModel(null,EncabezadoTabla);
        tblCovid.setModel(MiTabla);        
    }
    public void MostrarRegistrosTabla(){
    try {
        Connection conex=null;
        DefaultTableModel LaMismaTabla = (DefaultTableModel)tblCovid.getModel();
        ConexionBase conectame=new ConexionBase();
        conex=conectame.getConnection();
        String Registro[]= new String[15];
        String SQL="SELECT * FROM Hospital";
        Statement sentencia=conex.createStatement();
        ResultSet rst=sentencia.executeQuery(SQL);
        while(rst.next()){
            Registro[0]=rst.getString("Id_Hospital");
            Registro[1]=rst.getString("Id_Encargado");
            Registro[2]=rst.getString("CamasSen");
            Registro[3]=rst.getString("CamasNoSen");
            Registro[4]=rst.getString("TotalCamas");
            Registro[5]=rst.getString("CamasVen");
            Registro[6]=rst.getString("TotalCamasIRAG");
            Registro[7]=rst.getString("Ocupacion");
            Registro[8]=rst.getString("IngreIRAG");
            Registro[9]=rst.getString("EgreIRAGDef");
            Registro[10]=rst.getString("EgreIRAGAltaMedica");
            Registro[11]=rst.getString("TotalEgreIRAG");
            Registro[12]=rst.getString("CarrosOcupados");
            Registro[13]=rst.getString("PacienIRAGsc");
            
            
            LaMismaTabla.addRow(Registro);
        }
        tblCovid.setModel(LaMismaTabla);
          
    } catch (Exception e) {
        JOptionPane.showConfirmDialog(null, "se ha producido un error al cargar los datos: "+e);
    }
}
    
    
public void limpiar(){
    
    this.txtId.setText("");
    this.txtIdEncargado.setText("");
    this.txtCamasSensables.setText("");
    this.txtCamasNoSensables.setText("");
    this.txtTotalCamas.setText("");
    this.txtCamaVentilacion.setText("");
    this.txtTotalCamasIRAG.setText("");
    this.txtOcupacion.setText("");
    this.txtIngresosIRAG.setText("");
    this.txtEgresosIRAGDefuncion.setText("");
    this.txtEgresosIRAGAM.setText("");
    this.txtTotalEgresosIRAG.setText("");
    this.txtCarrosOcupados.setText("");
    this.txtPacienteIRAGSinCama.setText("");
}    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Hospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hospital().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Limpiar;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCovid;
    private javax.swing.JTextField txtCamaVentilacion;
    private javax.swing.JTextField txtCamasNoSensables;
    private javax.swing.JTextField txtCamasSensables;
    private javax.swing.JTextField txtCarrosOcupados;
    private javax.swing.JTextField txtEgresosIRAGAM;
    private javax.swing.JTextField txtEgresosIRAGDefuncion;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdEncargado;
    private javax.swing.JTextField txtIngresosIRAG;
    private javax.swing.JTextField txtOcupacion;
    private javax.swing.JTextField txtPacienteIRAGSinCama;
    private javax.swing.JTextField txtTotalCamas;
    private javax.swing.JTextField txtTotalCamasIRAG;
    private javax.swing.JTextField txtTotalEgresosIRAG;
    // End of variables declaration//GEN-END:variables
}
