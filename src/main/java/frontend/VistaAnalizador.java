/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import archivos.ManejoArchivos;
import funcionalidad.Analizador;
import funcionalidad.Busqueda;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.text.BadLocationException;
import elementos.ErrorLexico;
import elementos.Token;
import java.io.IOException;
import javax.swing.ImageIcon;
/**
 *
 * @author CIROSS
 */
public class VistaAnalizador extends javax.swing.JFrame {

    private Analizador analizador = new Analizador();
        
    /**
     * Creates new form Analizador
     */
    public VistaAnalizador() {
        initComponents();
        
        setLocationRelativeTo(null);
        setResizable(false);
        getIcono();
        numeracionArea = new JTextArea();
        jScrollPane.setRowHeaderView(mostrarNumeroFilas());      
        
        
    }
    
    /**
     * Método que asigna el ícono general del juego
     */
    public void getIcono(){
        ImageIcon icono = new ImageIcon(getClass().getResource("/frontend/images/AnalizarIcon.png"));
        setIconImage(icono.getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelGeneral = new javax.swing.JPanel();
        jPanelCentral = new javax.swing.JPanel();
        jScrollPane = new javax.swing.JScrollPane();
        jTextAreaEdicion = new javax.swing.JTextArea();
        jPanelResultados = new javax.swing.JPanel();
        jPanelSuperior = new javax.swing.JPanel();
        jPanelHeader = new javax.swing.JPanel();
        jPanelBotones = new javax.swing.JPanel();
        jButtonNuevo = new javax.swing.JButton();
        jButtonAbrir = new javax.swing.JButton();
        jButtonGuardar = new javax.swing.JButton();
        jButtonAnalizar = new javax.swing.JButton();
        jPanelBuscar = new javax.swing.JPanel();
        jTextFieldBuscar = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Analizador Léxico");
        setBackground(new java.awt.Color(0, 0, 0));

        jPanelGeneral.setBackground(new java.awt.Color(50, 50, 50));
        jPanelGeneral.setLayout(new java.awt.BorderLayout());

        jPanelCentral.setOpaque(false);
        jPanelCentral.setLayout(new java.awt.GridLayout(1, 0));

        jScrollPane.setBorder(null);

        jTextAreaEdicion.setBackground(new java.awt.Color(204, 204, 204));
        jTextAreaEdicion.setColumns(20);
        jTextAreaEdicion.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jTextAreaEdicion.setRows(5);
        jTextAreaEdicion.setBorder(null);
        jTextAreaEdicion.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                jTextAreaEdicionCaretUpdate(evt);
            }
        });
        jScrollPane.setViewportView(jTextAreaEdicion);

        jPanelCentral.add(jScrollPane);

        jPanelResultados.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanelResultados.setOpaque(false);
        jPanelResultados.setLayout(new java.awt.GridLayout(1, 0));
        jPanelCentral.add(jPanelResultados);

        jPanelGeneral.add(jPanelCentral, java.awt.BorderLayout.CENTER);

        jPanelSuperior.setOpaque(false);

        jPanelHeader.setBackground(new java.awt.Color(0, 0, 0));
        jPanelHeader.setOpaque(false);
        jPanelHeader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelBotones.setBackground(new java.awt.Color(0, 0, 0));
        jPanelBotones.setOpaque(false);
        jPanelBotones.setLayout(new javax.swing.BoxLayout(jPanelBotones, javax.swing.BoxLayout.LINE_AXIS));

        jButtonNuevo.setBackground(new java.awt.Color(51, 51, 51));
        jButtonNuevo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonNuevo.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frontend/images/Nuevo.png"))); // NOI18N
        jButtonNuevo.setText("Nuevo  ");
        jButtonNuevo.setBorder(null);
        jButtonNuevo.setPreferredSize(new java.awt.Dimension(72, 30));
        jButtonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoActionPerformed(evt);
            }
        });
        jPanelBotones.add(jButtonNuevo);

        jButtonAbrir.setBackground(new java.awt.Color(51, 51, 51));
        jButtonAbrir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonAbrir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frontend/images/Abrir.png"))); // NOI18N
        jButtonAbrir.setText("Abrir  ");
        jButtonAbrir.setBorder(null);
        jButtonAbrir.setPreferredSize(new java.awt.Dimension(72, 30));
        jButtonAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAbrirActionPerformed(evt);
            }
        });
        jPanelBotones.add(jButtonAbrir);

        jButtonGuardar.setBackground(new java.awt.Color(51, 51, 51));
        jButtonGuardar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frontend/images/Guardar.png"))); // NOI18N
        jButtonGuardar.setText("Guardar  ");
        jButtonGuardar.setBorder(null);
        jButtonGuardar.setPreferredSize(new java.awt.Dimension(72, 30));
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        jPanelBotones.add(jButtonGuardar);

        jButtonAnalizar.setBackground(new java.awt.Color(51, 51, 51));
        jButtonAnalizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonAnalizar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAnalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frontend/images/Analizar.png"))); // NOI18N
        jButtonAnalizar.setText("Analizar  ");
        jButtonAnalizar.setBorder(null);
        jButtonAnalizar.setPreferredSize(new java.awt.Dimension(72, 30));
        jButtonAnalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnalizarActionPerformed(evt);
            }
        });
        jPanelBotones.add(jButtonAnalizar);

        jPanelHeader.add(jPanelBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 50));

        jPanelBuscar.setBackground(new java.awt.Color(0, 153, 51));
        jPanelBuscar.setOpaque(false);
        jPanelBuscar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldBuscar.setPreferredSize(new java.awt.Dimension(100, 20));
        jPanelBuscar.add(jTextFieldBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 200, 30));

        jButtonBuscar.setBackground(new java.awt.Color(51, 51, 51));
        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frontend/images/Buscar.png"))); // NOI18N
        jButtonBuscar.setBorder(null);
        jButtonBuscar.setPreferredSize(new java.awt.Dimension(60, 30));
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        jPanelBuscar.add(jButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 50, 50));

        jPanelHeader.add(jPanelBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 340, 50));

        javax.swing.GroupLayout jPanelSuperiorLayout = new javax.swing.GroupLayout(jPanelSuperior);
        jPanelSuperior.setLayout(jPanelSuperiorLayout);
        jPanelSuperiorLayout.setHorizontalGroup(
            jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelSuperiorLayout.setVerticalGroup(
            jPanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSuperiorLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanelHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelGeneral.add(jPanelSuperior, java.awt.BorderLayout.PAGE_START);

        jPanel3.setOpaque(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanelGeneral.add(jPanel3, java.awt.BorderLayout.PAGE_END);

        jPanel4.setOpaque(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 615, Short.MAX_VALUE)
        );

        jPanelGeneral.add(jPanel4, java.awt.BorderLayout.LINE_END);

        jPanel5.setOpaque(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 615, Short.MAX_VALUE)
        );

        jPanelGeneral.add(jPanel5, java.awt.BorderLayout.LINE_START);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        
        if (jTextFieldBuscar.getText().isEmpty() || jTextAreaEdicion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "NO HAY TEXTO PARA REALIZAR LA BUSQUEDA");
        } else {
            
            PanelBusquedaResultados pnlBusqueda = new PanelBusquedaResultados();
            pnlBusqueda.getjTextAreaBusqueda().append(jTextAreaEdicion.getText());
            pnlBusqueda.setVisible(true);
            
            Busqueda.buscar(pnlBusqueda.getjTextAreaBusqueda(), jTextFieldBuscar.getText());
            jPanelResultados.removeAll();
            
            jPanelResultados.add(pnlBusqueda);
            jPanelResultados.repaint();
            jPanelResultados.revalidate();
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAbrirActionPerformed
        archivos.ManejoArchivos.abrirArchivo(this, jTextAreaEdicion);
    }//GEN-LAST:event_jButtonAbrirActionPerformed

    private void jButtonAnalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnalizarActionPerformed
        
        analizador.Analizar(jTextAreaEdicion.getText()+" ");
        manejarPaneles();
    }//GEN-LAST:event_jButtonAnalizarActionPerformed

    private void jTextAreaEdicionCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_jTextAreaEdicionCaretUpdate
        int pos = evt.getDot(); //mira los pasos del puntero

//        try {
//            int fil = jTextArea1.getLineOfOffset(pos) + 1; //devuelve la fila
//            int col = pos - jTextArea1.getLineStartOffset(fil - 1) + 1; //devuelve la columna
//            this.jLabel5.setText(col + "");
//            this.jLabel3.setText(fil + "");
            actualizarNumeroFila();

//        } catch (BadLocationException exc) {
//            System.out.println(exc);
//        }
    }//GEN-LAST:event_jTextAreaEdicionCaretUpdate

    private void jButtonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoActionPerformed
        //Preguntar si desea guardar el anterior
        jTextAreaEdicion.setText("");
        ManejoArchivos.archivo = null;
        jButtonAnalizarActionPerformed(evt);
    }//GEN-LAST:event_jButtonNuevoActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed

            ManejoArchivos.guardarArchivo(this, jTextAreaEdicion);      
    }//GEN-LAST:event_jButtonGuardarActionPerformed

   
    private void manejarPaneles() {
        
        jPanelResultados.removeAll();
        jPanelResultados.setOpaque(false);
        
        if ("".equals(jTextAreaEdicion.getText())) {
            JLabel label = new JLabel("Ingrese un texto para analizar", SwingConstants.CENTER);
            label.setForeground(Color.WHITE);
            label.setFont(new Font("Consolas",0, 18));
            jPanelResultados.add(label);
            
        } else if (analizador.getListaErrores().isEmpty()) {
            PanelTokens pnlToken = new PanelTokens(analizador.getListaTokens());
            pnlToken.setVisible(true);
            jPanelResultados.add(pnlToken);
            
        } else {
            PanelErrores pnlError = new PanelErrores(analizador.getListaErrores());
            pnlError.setVisible(true);
            jPanelResultados.add(pnlError);
            
        }
        
        jPanelResultados.repaint();
        jPanelResultados.revalidate();
    }
    
    int tFilas = 0;
    private void actualizarNumeroFila() {
            
        //tFilas = jTextAreaEdicion.getLineCount();
        numeracionArea.setText("");
        for (int i = 0; i < jTextAreaEdicion.getLineCount(); i++) {
        //for (int i = 0; i < tFilas; i++) {
            numeracionArea.append(" "+(i+1)+"\n");
            
        }

    }
    
    private JTextArea numeracionArea;
    
    private JTextArea mostrarNumeroFilas() {
        
        numeracionArea.setFont(new java.awt.Font("Consolas", 0, 14));
        numeracionArea.setBackground(new Color(50, 50, 50));
        numeracionArea.setForeground(Color.GRAY);        
        numeracionArea.setEditable(false);
        numeracionArea.append(" 1");
        
        return numeracionArea;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAbrir;
    private javax.swing.JButton jButtonAnalizar;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonNuevo;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelBotones;
    private javax.swing.JPanel jPanelBuscar;
    private javax.swing.JPanel jPanelCentral;
    private javax.swing.JPanel jPanelGeneral;
    private javax.swing.JPanel jPanelHeader;
    private javax.swing.JPanel jPanelResultados;
    private javax.swing.JPanel jPanelSuperior;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTextArea jTextAreaEdicion;
    private javax.swing.JTextField jTextFieldBuscar;
    // End of variables declaration//GEN-END:variables

}
