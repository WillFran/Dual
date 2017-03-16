/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dual.vistas;

import dual.modelos.FuncionObjetivo;
import dual.modelos.Restriccion;
import dual.modelos.Simplex;
import dual.modelos.SimplexDual;
import dual.modelos.SistemaEcuacion;
import ficheros.LectorFichero;
import java.io.File;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Hector
 */
public class MainView extends javax.swing.JFrame {

    FuncionObjetivo.Caso caso;
    FuncionObjetivo objetivo;
    SistemaEcuacion sistema;
    
    /**
     * Inicializa la ventana, inicia los validadores de inputs, componentes,
     * posicion y visibilidad de la ventana.
     */
    public MainView() {
        initComponents();
        buttonGroup.add(cbDual);
        buttonGroup.add(cbSimplex);

    }

    /**
     * Inicializa los validadores de inputs para que funcionen solo con datos 
     * enteros positivos.
     */
    private void inicializarFormatter(){
        PlainDocument document = (PlainDocument) tfNVar.getDocument();
        document.setDocumentFilter(new dual.vistas.tools.IntegerFilter());
        document = (PlainDocument) tfNRes.getDocument();
        document.setDocumentFilter(new dual.vistas.tools.IntegerFilter());
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        pObjetivo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        cbObjetivo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        tfNVar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        tfNRes = new javax.swing.JTextField();
        bLimpiar = new javax.swing.JButton();
        pCoeficientes = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbObjetivo = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCoeficientes = new javax.swing.JTable();
        bCoeficientesLimpiar = new javax.swing.JButton();
        bResolver = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        pSolucion = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        taSolucion = new javax.swing.JTextArea();
        pOpciones = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        bSalir = new javax.swing.JButton();
        bCargar = new javax.swing.JButton();
        bGuardar = new javax.swing.JButton();
        cbSimplex = new javax.swing.JRadioButton();
        cbDual = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Proyecto Dual Simplex");

        pObjetivo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jLabel1.setText("Caso");

        cbObjetivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MAX", "MIN" }));

        jLabel2.setText("Numero de variables");

        tfNVar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prepararTabla(evt);
            }
        });

        jLabel3.setText("Numero de restricciones");

        tfNRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prepararTabla(evt);
            }
        });

        bLimpiar.setText("Limpiar");
        bLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pObjetivoLayout = new javax.swing.GroupLayout(pObjetivo);
        pObjetivo.setLayout(pObjetivoLayout);
        pObjetivoLayout.setHorizontalGroup(
            pObjetivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pObjetivoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pObjetivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfNVar)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(cbObjetivo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(jSeparator3)
                    .addComponent(tfNRes)
                    .addComponent(bLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pObjetivoLayout.setVerticalGroup(
            pObjetivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pObjetivoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbObjetivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNVar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pCoeficientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        tbObjetivo.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tbObjetivo);

        jLabel4.setText("Restricciones");

        tbCoeficientes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbCoeficientes);

        bCoeficientesLimpiar.setText("Limpiar");
        bCoeficientesLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCoeficientesLimpiarActionPerformed(evt);
            }
        });

        bResolver.setText("Resolver");
        bResolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bResolverActionPerformed(evt);
            }
        });

        jLabel6.setText("F. Objetivo");

        javax.swing.GroupLayout pCoeficientesLayout = new javax.swing.GroupLayout(pCoeficientes);
        pCoeficientes.setLayout(pCoeficientesLayout);
        pCoeficientesLayout.setHorizontalGroup(
            pCoeficientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCoeficientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCoeficientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
                    .addComponent(jSeparator4)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCoeficientesLayout.createSequentialGroup()
                        .addComponent(bResolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bCoeficientesLimpiar))
                    .addComponent(jScrollPane2)
                    .addComponent(jSeparator7)
                    .addGroup(pCoeficientesLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pCoeficientesLayout.setVerticalGroup(
            pCoeficientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCoeficientesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pCoeficientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCoeficientesLimpiar)
                    .addComponent(bResolver))
                .addContainerGap())
        );

        pSolucion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jLabel5.setText("Solucion");

        taSolucion.setColumns(20);
        taSolucion.setRows(5);
        jScrollPane3.setViewportView(taSolucion);

        javax.swing.GroupLayout pSolucionLayout = new javax.swing.GroupLayout(pSolucion);
        pSolucion.setLayout(pSolucionLayout);
        pSolucionLayout.setHorizontalGroup(
            pSolucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pSolucionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pSolucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        pSolucionLayout.setVerticalGroup(
            pSolucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSolucionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3)
                .addContainerGap())
        );

        pOpciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jLabel7.setText("Opciones");

        bSalir.setText("Salir");
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });

        bCargar.setText("Cargar");
        bCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCargarActionPerformed(evt);
            }
        });

        bGuardar.setText("Guardar");

        cbSimplex.setText("Simplex");

        cbDual.setSelected(true);
        cbDual.setText("Dual");

        javax.swing.GroupLayout pOpcionesLayout = new javax.swing.GroupLayout(pOpciones);
        pOpciones.setLayout(pOpcionesLayout);
        pOpcionesLayout.setHorizontalGroup(
            pOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pOpcionesLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pOpcionesLayout.createSequentialGroup()
                        .addComponent(bSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pOpcionesLayout.createSequentialGroup()
                        .addGroup(pOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bCargar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbSimplex, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bGuardar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pOpcionesLayout.createSequentialGroup()
                                .addComponent(cbDual)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jSeparator6))
                        .addContainerGap())))
        );
        pOpcionesLayout.setVerticalGroup(
            pOpcionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pOpcionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbSimplex)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbDual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                .addComponent(bCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pObjetivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pCoeficientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pSolucion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pObjetivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pCoeficientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pOpciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pSolucion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void bLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLimpiarActionPerformed
        cbObjetivo.setSelectedItem(0);
        tfNVar.setText("");
        tfNRes.setText("");
        prepararTabla();
    }//GEN-LAST:event_bLimpiarActionPerformed

    private void bResolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bResolverActionPerformed
        TableModel model = tbObjetivo.getModel();
        float[] vector = new float[model.getColumnCount()];
        for(int j = 0; j < model.getColumnCount(); j++){
            vector[j] = (Float)(model.getValueAt(0, j));
        }
        objetivo = new FuncionObjetivo(caso, vector);
        sistema = new SistemaEcuacion(objetivo);
        model = tbCoeficientes.getModel();
        for(int i = 0; i < model.getRowCount(); i++){
            for(int j = 0; j < model.getColumnCount() - 2; j++){
                vector[j] = (Float)model.getValueAt(i, j);
            }
            sistema.agregarRestriccion( (Restriccion.Signo)(model.getValueAt(i, model.getColumnCount() - 2)), 
                                        vector, 
                                        (Float)model.getValueAt(i,  model.getColumnCount() - 1));
        }
        Simplex simplex = cbDual.isSelected()? new SimplexDual(sistema): new Simplex(sistema);
        do{
            taSolucion.append(simplex.toString() + "\n");
        }while(simplex.siguiente() == Simplex.TABLA_SFB);
        taSolucion.append(simplex.getResultado());
    }//GEN-LAST:event_bResolverActionPerformed

    private void bCoeficientesLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCoeficientesLimpiarActionPerformed
        prepararTabla();
    }//GEN-LAST:event_bCoeficientesLimpiarActionPerformed

    private void prepararTabla(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prepararTabla
        prepararTabla();
    }//GEN-LAST:event_prepararTabla

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bSalirActionPerformed

    private void bCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCargarActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(this);
        File f = chooser.getSelectedFile();
        sistema = LectorFichero.obtenerSistema(f.getAbsolutePath());
        cargarTabla();
        LectorFichero.leerFichero(f.getAbsolutePath());
    }//GEN-LAST:event_bCargarActionPerformed

    private void cargarTabla(){
        cbObjetivo.setSelectedIndex(sistema.getCaso().ordinal());
        tfNVar.setText(Integer.toString(sistema.getFuncionObjetivo().cantidad()));
        tfNRes.setText(Integer.toString(sistema.getRenglones()));
        prepararTabla();
        TableModel model = tbObjetivo.getModel();
        for(int j = 0; j < model.getColumnCount(); j++){
            model.setValueAt(sistema.getFuncionObjetivo().get(j),0, j);
        }
        model = tbCoeficientes.getModel();
        for(int i = 0; i < model.getRowCount(); i++){
            for(int j = 0; j < model.getColumnCount(); j++){
                if(j < model.getColumnCount() - 2){
                    model.setValueAt(sistema.getRestricciones().get(i).get(j),i, j);
                }else if(j == model.getColumnCount() - 2){
                    model.setValueAt(sistema.getRestricciones().get(i).getSigno(),i, j);
                }else{
                    model.setValueAt(sistema.getRestricciones().get(i).getLadoDerecho(),i, j);
                }
            }
        }
    }
    
    private void prepararTabla(){
        // Obteniendo el caso
        caso =
        FuncionObjetivo.Caso.valueOf((String) cbObjetivo.getSelectedItem());
        // Obteniendo el numero de variables y restricciones
        int nVar = 0;
        int nRes = 0;

        try{
            nVar = Integer.parseInt(tfNVar.getText());
            nRes = Integer.parseInt(tfNRes.getText());
        }catch(NumberFormatException ex){
            nVar = 2;
            nRes = 3;
        }

        // Preparando la tabla donde se ingresara los coeficientes
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnCount(nVar);
        model.setRowCount(1);
        tbObjetivo.setModel(model);
        // Asignando nombres a las columnas
        for(int i = 0; i < nVar; i++){ // Variables
            tbObjetivo.getColumnModel().getColumn(i).setHeaderValue("x" + (i+1));
        }
        // Preparando la tabla donde se ingresara los coeficientes
        model = new DefaultTableModel();
        model.setColumnCount(nVar + 2);
        model.setRowCount(nRes);
        tbCoeficientes.setModel(model);
        // Asignando nombres a las columnas
        for(int i = 0; i < nVar; i++){ // Variables
            tbCoeficientes.getColumnModel().getColumn(i).setHeaderValue("x" + (i+1));
        }
        tbCoeficientes.getColumnModel().getColumn(nVar).setHeaderValue("Desigualdad");
        tbCoeficientes.getColumnModel().getColumn(nVar + 1).setHeaderValue("Lado Derecho");
        // Incorporando combobox a la columna de desigualdad
        TableColumn columnaRestriccion = tbCoeficientes.getColumnModel().getColumn(nVar);
        JComboBox comboBox = new JComboBox();
        comboBox.addItem("IGUAL");
        comboBox.addItem("MAYOR_IGUAL");
        comboBox.addItem("MENOR_IGUAL");
        columnaRestriccion.setCellEditor(new DefaultCellEditor(comboBox));
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
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCargar;
    private javax.swing.JButton bCoeficientesLimpiar;
    private javax.swing.JButton bGuardar;
    private javax.swing.JButton bLimpiar;
    private javax.swing.JButton bResolver;
    private javax.swing.JButton bSalir;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JRadioButton cbDual;
    private javax.swing.JComboBox<String> cbObjetivo;
    private javax.swing.JRadioButton cbSimplex;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JPanel pCoeficientes;
    private javax.swing.JPanel pObjetivo;
    private javax.swing.JPanel pOpciones;
    private javax.swing.JPanel pSolucion;
    private javax.swing.JTextArea taSolucion;
    private javax.swing.JTable tbCoeficientes;
    private javax.swing.JTable tbObjetivo;
    private javax.swing.JTextField tfNRes;
    private javax.swing.JTextField tfNVar;
    // End of variables declaration//GEN-END:variables
}
