package igu;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import logica.ControladoraServicios;
import logica.Mascota;
import persistencia.exceptions.NonexistentEntityException;

public class DatosMascotas extends javax.swing.JFrame {

    private MenuPrincipal _menu = null;
    private ControladoraServicios _controladoraServicios = null;
    
    public DatosMascotas(MenuPrincipal menu, ControladoraServicios controladora) {

        _menu = menu;
        _controladoraServicios = controladora;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        PanelFondo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        panelTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMascotas = new javax.swing.JTable();
        lblTituloTabla = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnNavegarMenu = new javax.swing.JButton();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        lblTitulo.setText("Visualización de Datos");

        tableMascotas.setAutoCreateRowSorter(true);
        tableMascotas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tableMascotas.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        tableMascotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableMascotas.setShowGrid(true);
        jScrollPane1.setViewportView(tableMascotas);

        lblTituloTabla.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lblTituloTabla.setText("Datos de mascotas:");

        btnEliminar.setText("Eliminar");
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTablaLayout = new javax.swing.GroupLayout(panelTabla);
        panelTabla.setLayout(panelTablaLayout);
        panelTablaLayout.setHorizontalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTablaLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 963, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addGroup(panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)))
                    .addComponent(lblTituloTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        panelTablaLayout.setVerticalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTablaLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(lblTituloTabla)
                .addGroup(panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTablaLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelTablaLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        btnNavegarMenu.setText("Ir a menu");
        btnNavegarMenu.setToolTipText("Ir a menu");
        btnNavegarMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNavegarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNavegarMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelFondoLayout = new javax.swing.GroupLayout(PanelFondo);
        PanelFondo.setLayout(PanelFondoLayout);
        PanelFondoLayout.setHorizontalGroup(
            PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFondoLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelFondoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(193, 193, 193)
                        .addComponent(btnNavegarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))
                    .addGroup(PanelFondoLayout.createSequentialGroup()
                        .addComponent(panelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(28, Short.MAX_VALUE))))
        );
        PanelFondoLayout.setVerticalGroup(
            PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelFondoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(PanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNavegarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(panelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNavegarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNavegarMenuActionPerformed

        navegarMenuPrincipal();
    }//GEN-LAST:event_btnNavegarMenuActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        if (tableMascotas.getRowCount() > 0) {

            if (tableMascotas.getSelectedRow() != -1) {
                int numCliente = Integer.parseInt(String.valueOf(
                        tableMascotas.getValueAt(
                                tableMascotas.getSelectedRow(), 0)));

                try {

                    _controladoraServicios.eliminarMascota(numCliente);
                    mostrarMensaje(
                            "Eliminado correctamente",
                            "Info",
                            "Confirmación");
                    
                    cargarTabla();
                    
                } catch (NonexistentEntityException ex) {

                    Logger.getLogger(DatosMascotas.class.getName())
                            .log(Level.SEVERE, null, ex);
                }
            }
            else{
                
                mostrarMensaje(
                        "Debe seleccionar un registro",
                        "Error",
                        "Alerta");
            }

        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        
        if(tableMascotas.getRowCount() > 0){
            
            if(tableMascotas.getSelectedRow() != -1){
                
                int numCliente = Integer.parseInt(String.valueOf
                        (tableMascotas.getValueAt(
                                tableMascotas.getSelectedRow(), 0)));
                
                
                DatosMascotas nuevoDatosMascotas = new DatosMascotas(_menu, _controladoraServicios);
                FormularioEditarMascota formulario = new FormularioEditarMascota(
                        _menu, 
                        _controladoraServicios, 
                        numCliente,
                        nuevoDatosMascotas);
                
                formulario.setVisible(true);
                formulario.setLocationRelativeTo(this);
                this.dispose();
            }
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void navegarMenuPrincipal() {

        this.dispose();
        _menu.setVisible(true);
        _menu.setLocationRelativeTo(this);
    }

    private void cargarTabla() {

        DefaultTableModel tablaModelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        // nombres tabla
        String titulos[] = {
            "N° cliente",
            "Nombre",
            "Color",
            "Raza",
            "Alergico",
            "Att. Esp.",
            "Dueño",
            "Telefono"};

        tablaModelo.setColumnIdentifiers(titulos);

        //caga datos de la base de datos
        List<Mascota> listaMascotas = _controladoraServicios.traerMascotas();

        if (listaMascotas != null) {

            for (Mascota mascota : listaMascotas) {

                Object[] entidad = {
                    mascota.getNumCliente(),
                    mascota.getNombre(),
                    mascota.getColor(),
                    mascota.getRaza(),
                    mascota.getEsAlergico(),
                    mascota.getAttEspecial(),
                    mascota.getDuenio().getNombre(),
                    mascota.getDuenio().getTelefono()
                };

                tablaModelo.addRow(entidad);
            }

            tableMascotas.setModel(tablaModelo);
        }
    }

    private void mostrarMensaje(String mensaje, String tipo, String titulo) {
        
        if(tipo.toLowerCase().equals("info")){
            
            JOptionPane.showMessageDialog(
                this,
                mensaje,
                titulo,
                JOptionPane.INFORMATION_MESSAGE);
        }
        
        if (tipo.equals("Error")){
            
            JOptionPane.showMessageDialog(
                this,
                mensaje,
                titulo,
                JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelFondo;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNavegarMenu;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTituloTabla;
    private javax.swing.JPanel panelTabla;
    private javax.swing.JTable tableMascotas;
    // End of variables declaration//GEN-END:variables
}
