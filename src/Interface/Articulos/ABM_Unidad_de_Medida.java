/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Articulos;

import Interface.Acceso;
import Interface.GUIM;
import LN.Articulos.Unidad_de_Medida;
import LN.Varios.Hosteria;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Lukas
 */
public class ABM_Unidad_de_Medida extends javax.swing.JPanel {

    /**
     * Creates new form ABM_Unidad_de_Medida
     */
    public ABM_Unidad_de_Medida(Hosteria unaHosteria) {
        this.unaHosteria = unaHosteria;
        initComponents();

        List<Unidad_de_Medida> unidades = unaHosteria.getUnidadesDeMedida();
        GUIM.cargarTablaUnidades(tbl_unidades, unidades);

        tbl_unidades.getSelectionModel().addListSelectionListener(
                new ListSelectionListener() {
                    @Override
                    public void valueChanged(ListSelectionEvent e) {
                        tbl_unidadesMouseClicked(null);

                    }
                });

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        panelRect1 = new org.edisoncor.gui.panel.PanelRect();
        btn_agregarPais = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_nombreUnidad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_abrUnidad = new javax.swing.JTextField();
        pnl_resultado = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_unidades = new javax.swing.JTable();
        txt_searchUM = new org.jdesktop.swingx.JXSearchField();

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(153, 153, 153));
        jTextField1.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("Gestor de Unidades de Medida");
        jTextField1.setFocusable(false);

        panelRect1.setBackground(new java.awt.Color(255, 255, 255));
        panelRect1.setForeground(new java.awt.Color(255, 255, 255));
        panelRect1.setColorPrimario(new java.awt.Color(255, 255, 255));
        panelRect1.setColorSecundario(new java.awt.Color(102, 102, 102));
        panelRect1.setPreferredSize(new java.awt.Dimension(150, 184));

        btn_agregarPais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Guardar_2.png"))); // NOI18N
        btn_agregarPais.setText("  Guardar");
        btn_agregarPais.setDisabledIcon(null);
        btn_agregarPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarPaisActionPerformed(evt);
            }
        });

        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recyclebin-Empty.png"))); // NOI18N
        btn_eliminar.setText("   Eliminar");
        btn_eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_eliminarMouseClicked(evt);
            }
        });
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/postits.png"))); // NOI18N
        btn_modificar.setText("Modificar");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRect1Layout = new javax.swing.GroupLayout(panelRect1);
        panelRect1.setLayout(panelRect1Layout);
        panelRect1Layout.setHorizontalGroup(
            panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRect1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_agregarPais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_modificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        panelRect1Layout.setVerticalGroup(
            panelRect1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRect1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btn_agregarPais, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_eliminar)
                .addGap(18, 18, 18)
                .addComponent(btn_modificar)
                .addContainerGap(152, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 3, 12)); // NOI18N
        jLabel1.setText("Nombre:");

        txt_nombreUnidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreUnidadKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 3, 12)); // NOI18N
        jLabel2.setText("Abreviación:");

        txt_abrUnidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_abrUnidadKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnl_resultadoLayout = new javax.swing.GroupLayout(pnl_resultado);
        pnl_resultado.setLayout(pnl_resultadoLayout);
        pnl_resultadoLayout.setHorizontalGroup(
            pnl_resultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnl_resultadoLayout.setVerticalGroup(
            pnl_resultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_nombreUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_abrUnidad, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(pnl_resultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_nombreUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txt_abrUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setAutoscrolls(true);

        jScrollPane1.setBorder(null);
        jScrollPane1.setAutoscrolls(true);
        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        tbl_unidades.setBorder(null);
        tbl_unidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Unidad de Medida", "Abreviación"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_unidades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_unidadesMouseClicked(evt);
            }
        });
        tbl_unidades.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tbl_unidadesKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_unidades);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        txt_searchUM.setPrompt("Nombre de la Unidad de Medida");
        txt_searchUM.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txt_searchUMCaretUpdate(evt);
            }
        });
        txt_searchUM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_searchUMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_searchUM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRect1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jTextField1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_searchUM, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelRect1, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarPaisActionPerformed
        String nombreUnidad = txt_nombreUnidad.getText();
        String abreviacionUnidad = txt_abrUnidad.getText();
        try {
            unaHosteria.altaUM(nombreUnidad, abreviacionUnidad);
            GUIM.mostrarSms(pnl_resultado, 0, "La unidad " + nombreUnidad + " se ha cargado correctamente");

            GUIM.cargarTablaUnidades(tbl_unidades, unaHosteria.getUnidadesDeMedida());
            unaHosteria.crearAuditoria("ADD", "Agrego la Unidad de Medida: " + nombreUnidad, Acceso.getUsuario(), GUIM.getHoraActual());
            if (this.getParent().getParent().getParent().getParent() instanceof JDialog) {
                SwingUtilities.getWindowAncestor(this).dispose();
            }
        } catch (Exception ex) {
            GUIM.mostrarSms(pnl_resultado, 2, ex.getMessage());
        }


    }//GEN-LAST:event_btn_agregarPaisActionPerformed

    private void btn_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eliminarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_eliminarMouseClicked

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        String nombreUM = txt_nombreUnidad.getText();
        int res = JOptionPane.showConfirmDialog(this, "Esta seguro de eliminar la Unidad de Medida seleccionada",
                "Advertencia", JOptionPane.YES_NO_OPTION);
        if (res == JOptionPane.YES_OPTION) {
            try {
                unaHosteria.eliminarUM((Unidad_de_Medida) tbl_unidades.getValueAt(tbl_unidades.getSelectedRow(), 0));
                unaHosteria.crearAuditoria("DEL", "Eliminó la Unidad de Medida: " + nombreUM, Acceso.getUsuario(), GUIM.getHoraActual());
                GUIM.mostrarSms(pnl_resultado, 0, "La Unidad de Medida: " + nombreUM + " ha sido Eliminada");
            } catch (Exception e) {
                GUIM.mostrarSms(pnl_resultado, 2, e.getMessage());
            }
        }
        txt_nombreUnidad.setText("");
        txt_abrUnidad.setText("");
        txt_searchUM.setText("");
        GUIM.cargarTablaUnidades(tbl_unidades, unaHosteria.getUnidadesDeMedida());

    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        if (txt_nombreUnidad.getText() != null) {

            Unidad_de_Medida unaUnidad = (Unidad_de_Medida) tbl_unidades.getValueAt(tbl_unidades.getSelectedRow(), 0);

            String nombre = unaUnidad.getNombre();
            String abv = unaUnidad.getAbreviacion();

            try {
                unaHosteria.modificarUM(unaUnidad, txt_nombreUnidad.getText(), txt_abrUnidad.getText());
                txt_nombreUnidad.setText("");
                txt_abrUnidad.setText("");

                GUIM.cargarTablaUnidades(tbl_unidades, unaHosteria.getUnidadesDeMedida());

                unaHosteria.crearAuditoria("MOD", "Modificó la Unidad de Medida: " + nombre + " (" + abv + ") hacia: " + txt_nombreUnidad.getText() + " (" + txt_abrUnidad.getText() + ")", Acceso.getUsuario(), GUIM.getHoraActual());



            } catch (Exception ex) {
                Logger.getLogger(ABM_Unidad_de_Medida.class.getName()).log(Level.SEVERE, null, ex);
            }



        }
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void txt_searchUMCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txt_searchUMCaretUpdate

        List<Unidad_de_Medida> unidades = unaHosteria.getUnidadesDeMedida();
        List<Unidad_de_Medida> filtro = new LinkedList<>();
        if (!txt_searchUM.getText().isEmpty()) {
            for (Unidad_de_Medida unaUnidad : unidades) {
                if (unaUnidad.getNombre().toUpperCase().startsWith(txt_searchUM.getText().toUpperCase())) {
                    filtro.add(unaUnidad);
                }
                GUIM.cargarTablaUnidades(tbl_unidades, filtro);

            }
        } else {
            GUIM.cargarTablaUnidades(tbl_unidades, unidades);
        }
    }//GEN-LAST:event_txt_searchUMCaretUpdate

    private void txt_searchUMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchUMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchUMActionPerformed

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void tbl_unidadesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_unidadesKeyTyped
    }//GEN-LAST:event_tbl_unidadesKeyTyped

    private void tbl_unidadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_unidadesMouseClicked
        if (tbl_unidades.getSelectedRowCount() != 0) {
            txt_nombreUnidad.setText(tbl_unidades.getValueAt(tbl_unidades.getSelectedRow(), 0).toString());
            txt_abrUnidad.setText(tbl_unidades.getValueAt(tbl_unidades.getSelectedRow(), 1).toString());
        } else {
            txt_nombreUnidad.setText("");
            txt_abrUnidad.setText("");
        }
    }//GEN-LAST:event_tbl_unidadesMouseClicked

    private void txt_abrUnidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_abrUnidadKeyTyped
        if (!GUIM.esLetra(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_abrUnidadKeyTyped

    private void txt_nombreUnidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreUnidadKeyTyped
        if (!GUIM.esLetra(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txt_nombreUnidadKeyTyped
    private Hosteria unaHosteria;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregarPais;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private org.edisoncor.gui.panel.PanelRect panelRect1;
    private javax.swing.JPanel pnl_resultado;
    private javax.swing.JTable tbl_unidades;
    private javax.swing.JTextField txt_abrUnidad;
    private javax.swing.JTextField txt_nombreUnidad;
    private org.jdesktop.swingx.JXSearchField txt_searchUM;
    // End of variables declaration//GEN-END:variables
}