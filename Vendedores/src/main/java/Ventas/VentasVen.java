package Ventas;
import javax.swing.JOptionPane;

public class VentasVen extends javax.swing.JFrame {
    public VentasVen() {
        initComponents();
    }
    String  conta;
    String[] arti = new String[8];
    String[] nombre = new String[8];
    String[] ape = new String[8];
    String[] sueldos = new String[8];
    String[] sueldot = new String[8];
    double[] sueldo = new double[8];
    double[] sueldotot = new double[8];
    int [] art =new int[8];
    int cont=0, pago=125, pago2=145, pago3=165, pago4=175;
    double igss=0.1067;
    boolean encontrado=false;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nomap1 = new javax.swing.JTextField();
        cant1 = new javax.swing.JTextField();
        sueldo1 = new javax.swing.JTextField();
        cant2 = new javax.swing.JTextField();
        sueldo2 = new javax.swing.JTextField();
        nomap2 = new javax.swing.JTextField();
        cant3 = new javax.swing.JTextField();
        sueldor2 = new javax.swing.JTextField();
        nomap3 = new javax.swing.JTextField();
        sueldor1 = new javax.swing.JTextField();
        nomap4 = new javax.swing.JTextField();
        nomap5 = new javax.swing.JTextField();
        nomap6 = new javax.swing.JTextField();
        cant4 = new javax.swing.JTextField();
        cant5 = new javax.swing.JTextField();
        cant6 = new javax.swing.JTextField();
        sueldo3 = new javax.swing.JTextField();
        sueldo4 = new javax.swing.JTextField();
        sueldo5 = new javax.swing.JTextField();
        sueldo6 = new javax.swing.JTextField();
        sueldor4 = new javax.swing.JTextField();
        sueldor3 = new javax.swing.JTextField();
        sueldor5 = new javax.swing.JTextField();
        sueldor6 = new javax.swing.JTextField();
        nomap7 = new javax.swing.JTextField();
        nomap8 = new javax.swing.JTextField();
        cant7 = new javax.swing.JTextField();
        cant8 = new javax.swing.JTextField();
        sueldo7 = new javax.swing.JTextField();
        sueldo8 = new javax.swing.JTextField();
        sueldor7 = new javax.swing.JTextField();
        sueldor8 = new javax.swing.JTextField();
        ingreso = new javax.swing.JButton();
        buesqueda = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        vendemay = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        sueldor9 = new javax.swing.JTextField();
        sueldor10 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 204, 204));
        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jLabel1.setText("CONTROL DE VENTAS DE VENDEDORES");

        jLabel2.setBackground(new java.awt.Color(255, 204, 204));
        jLabel2.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel2.setText("NOMBRE Y APELLIDO");

        jLabel3.setBackground(new java.awt.Color(255, 204, 204));
        jLabel3.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel3.setText("CANTIDAD DE ARTICULOS");

        jLabel4.setBackground(new java.awt.Color(255, 204, 204));
        jLabel4.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel4.setText("SUELDO CALCULADO");

        jLabel5.setBackground(new java.awt.Color(255, 204, 204));
        jLabel5.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel5.setText("SUELDO A RECIBIR");

        nomap1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cant1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        sueldo1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cant2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        sueldo2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        nomap2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cant3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        sueldor2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        nomap3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        sueldor1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        nomap4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        nomap5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        nomap6.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cant4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cant5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cant6.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        sueldo3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        sueldo4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        sueldo5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        sueldo6.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        sueldor4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        sueldor3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        sueldor5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        sueldor6.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        nomap7.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        nomap8.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cant7.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cant8.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        sueldo7.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        sueldo8.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        sueldor7.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        sueldor8.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        ingreso.setBackground(new java.awt.Color(255, 204, 204));
        ingreso.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        ingreso.setText("INGRESO DE VENDEDORES");
        ingreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresoActionPerformed(evt);
            }
        });

        buesqueda.setBackground(new java.awt.Color(255, 204, 204));
        buesqueda.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        buesqueda.setText("BUSQUEDA");
        buesqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buesquedaActionPerformed(evt);
            }
        });

        limpiar.setBackground(new java.awt.Color(255, 204, 204));
        limpiar.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        limpiar.setText("LIMPIAR");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 204, 204));
        jButton4.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jButton4.setText("SALIR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        vendemay.setBackground(new java.awt.Color(255, 204, 204));
        vendemay.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        vendemay.setText("VENDEDOR CON MAYOR INGESO");
        vendemay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendemayActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 204, 204));
        jButton6.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jButton6.setText("VENDEDOR CON MENOR INGESO");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        sueldor9.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        sueldor10.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ingreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(vendemay, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6)
                            .addComponent(buesqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(nomap2)
                                        .addComponent(nomap1)
                                        .addComponent(nomap3, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(nomap5)
                                        .addComponent(nomap4)
                                        .addComponent(nomap6, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(nomap7)
                                        .addComponent(nomap8, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cant1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cant3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(cant2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(1, 1, 1)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cant4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cant6, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cant5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(1, 1, 1))))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(cant7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cant8, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sueldo1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sueldo2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sueldo3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sueldo4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(sueldo5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(sueldo7, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(sueldo8, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(sueldo6, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(1, 1, 1)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jLabel4)))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sueldor6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sueldor5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sueldor4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sueldor3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sueldor2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sueldor1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sueldor8, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sueldor7, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sueldor10, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(sueldor9, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 99, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nomap1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nomap2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nomap3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nomap4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nomap5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nomap6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nomap7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nomap8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cant1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cant2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cant3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cant4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cant5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cant6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cant7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cant8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sueldo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(sueldo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(sueldo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(sueldo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(sueldo5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(sueldo6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(sueldo7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sueldor10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(sueldor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(sueldor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(sueldor3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(sueldor4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(sueldor5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(sueldor6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(sueldor7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(sueldor8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sueldo8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sueldor9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(ingreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buesqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vendemay, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresoActionPerformed
       while(cont <= 2 || cont >= 9)
       {
            conta=JOptionPane.showInputDialog("Escriba el numero de vendedores a ingresar");
            cont=Integer.parseInt(conta);
       }
        for(int i =0; i<cont;i++)
        {
            nombre[i] =JOptionPane.showInputDialog("Ingrese el nombre del vendedor");
            ape[i] =JOptionPane.showInputDialog("Ingrese el apellido del vendedor");
           while(art[i]<=99 || art[i]>=1001 )
           {
               arti[i] =JOptionPane.showInputDialog("Ingrese cuantos articulos vendio");
               art[i] =Integer.parseInt(arti[i]);
           }
            try
            {
                if(art[i]>=100 && art[i]<=300)
                {
                    sueldo[i] = pago*art[i];
                    sueldotot[i]=sueldo[i]-(sueldo[i]*igss);
                    sueldos[i]=String.valueOf(sueldo[i]);
                    sueldot[i]=String.valueOf(sueldotot[i]);
                }
                else if (art[i]>=301 && art[i]<=500)
                {
                    sueldo[i] = pago2*art[i];
                    sueldotot[i]=sueldo[i]-(sueldo[i]*igss);
                    sueldos[i]=String.valueOf(sueldo[i]);
                    sueldot[i]=String.valueOf(sueldotot[i]);
                }
                else if(art[i]>=501 && art[i]<=800)
                {
                    sueldo[i] = pago3*art[i];
                    sueldotot[i]=sueldo[i]-(sueldo[i]*igss);
                    sueldos[i]=String.valueOf(sueldo[i]);
                    sueldot[i]=String.valueOf(sueldotot[i]);
                }
                else if(art[i]>=801 && art[i]<=1000)
                {
                    sueldo[i] = pago4*art[i];
                    sueldotot[i]=sueldo[i]-(sueldo[i]*igss);
                    sueldos[i]=String.valueOf(sueldo[i]);
                    sueldot[i]=String.valueOf(sueldotot[i]);
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "LOS ARTICULOS ESTAN FUERA DE RANGO....");
            }   
        }
        for(int i=0;i<8;i++)
        {
            if(nombre[i]==null && ape[i]==null && arti[i]==null && sueldos[i]==null && sueldot[i]==null)
            {
                nombre[i]=" ";
                ape[i]=" ";
                arti[i]=" ";
                sueldos[i]=" ";
                sueldot[i]=" ";
            }
        }
        nomap1.setText(nombre[0]+" "+ape[0]);
        nomap2.setText(nombre[1]+" "+ape[1]);
        nomap3.setText(nombre[2]+" "+ape[2]);
        nomap4.setText(nombre[3]+" "+ape[3]);
        nomap5.setText(nombre[4]+" "+ape[4]);
        nomap6.setText(nombre[5]+" "+ape[5]);
        nomap7.setText(nombre[6]+" "+ape[6]);
        nomap8.setText(nombre[7]+" "+ape[7]);
        
        cant1.setText(arti[0]);
        cant2.setText(arti[1]);
        cant3.setText(arti[2]);
        cant4.setText(arti[3]);
        cant5.setText(arti[4]);
        cant6.setText(arti[5]);
        cant7.setText(arti[6]);
        cant8.setText(arti[7]);
        
        sueldo1.setText(sueldos[0]);
        sueldo2.setText(sueldos[1]);
        sueldo3.setText(sueldos[2]);
        sueldo4.setText(sueldos[3]);
        sueldo5.setText(sueldos[4]);
        sueldo6.setText(sueldos[5]);
        sueldo7.setText(sueldos[6]);
        sueldo8.setText(sueldos[7]);
        
        sueldor10.setText(sueldot[0]);
        sueldor3.setText(sueldot[1]);
        sueldor4.setText(sueldot[2]);
        sueldor5.setText(sueldot[3]);
        sueldor6.setText(sueldot[4]);
        sueldor7.setText(sueldot[5]);
        sueldor8.setText(sueldot[6]);
        sueldor9.setText(sueldot[7]);

    }//GEN-LAST:event_ingresoActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        nomap1.setText(" "+" "+" ");
        nomap2.setText(" "+" "+" ");
        nomap3.setText(" "+" "+" ");
        nomap4.setText(" "+" "+" ");
        nomap5.setText(" "+" "+" ");
        nomap6.setText(" "+" "+" ");
        nomap7.setText(" "+" "+" ");
        nomap8.setText(" "+" "+" ");
        
        cant1.setText(" ");
        cant2.setText(" ");
        cant3.setText(" ");
        cant4.setText(" ");
        cant5.setText(" ");
        cant6.setText(" ");
        cant7.setText(" ");
        cant8.setText(" ");
        
        sueldo1.setText(" ");
        sueldo2.setText(" ");
        sueldo3.setText(" ");
        sueldo4.setText(" ");
        sueldo5.setText(" ");
        sueldo6.setText(" ");
        sueldo7.setText(" ");
        sueldo8.setText(" ");
        
        sueldor10.setText(" ");
        sueldor9.setText(" ");
        sueldor3.setText(" ");
        sueldor4.setText(" ");
        sueldor5.setText(" ");
        sueldor6.setText(" ");
        sueldor7.setText(" ");
        sueldor8.setText(" ");
        
        for(int i=0;i<8;i++)
        {
            nombre[i]=null;
            ape[i]=null;
            arti[i]=null;
            sueldos[i]=null;
            sueldot[i]=null;
        }
    }//GEN-LAST:event_limpiarActionPerformed

    private void buesquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buesquedaActionPerformed
        String auxnom;
        String auxape;
        int i=0;
        auxnom = JOptionPane.showInputDialog("Ingrese el nombre del vendedor a buscar:");
        auxape = JOptionPane.showInputDialog("Ingrese el apellido del vendedor a buscar:");
        encontrado = false;
        
        while(i<8)
        {
             if(auxnom.equals(nombre[i]) && auxape.equals(ape[i]))
            {
               JOptionPane.showMessageDialog(null, "Nombre y apellido del vendedor: "+nombre[i]+" "+ape[i]+"\n Cantidad vendida es: "+arti[i]
               +"\n El sueldo calculado es: "+sueldos[i]+"\n El liquido a recibir es: "+sueldot[i]);
               encontrado=true;
            }
            i++;
        }
        if(encontrado==false)
        {
            JOptionPane.showMessageDialog(null,"VENDEDOR NO ENCONTRADO...");
        }
    }//GEN-LAST:event_buesquedaActionPerformed
    double may=0.0;
    String auxmay=" ";
    int a=0;
    private void vendemayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendemayActionPerformed
        a=0;
        while(a<cont)
        {
            if(sueldotot[a]>may)
            {
                may=sueldotot[a];
            }
            a++;
        }
        a=0;
        auxmay=String.valueOf(may);
        while(a<cont)
        {
            if(auxmay.equals(sueldot[a]))
            {
               JOptionPane.showMessageDialog(null, "El vendedor con mayores ventas es"+"\nNombre y apellido del vendedor: "
               +nombre[a]+" "+ape[a]+"\n Cantidad vendida es: "+arti[a]
               +"\n El sueldo calculado es: "+sueldos[a]+"\n El liquido a recibir es: "+sueldot[a]);
            }
            a++;
        }       
    }//GEN-LAST:event_vendemayActionPerformed
    double min=160000.0;
    String auxmin=" ";
    
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        a=0;
        while(a<cont)
        {
            if(sueldotot[a]<min)
            {
                min=sueldotot[a];
            }
            a++;
        }
        a=0;
        auxmin=String.valueOf(min);
        while(a<cont)
        {
            if(auxmin.equals(sueldot[a]))
            {
               JOptionPane.showMessageDialog(null, "El vendedor con menores ventas es"+"\nNombre y apellido del vendedor: "
               +nombre[a]+" "+ape[a]+"\n Cantidad vendida es: "+arti[a]
               +"\n El sueldo calculado es: "+sueldos[a]+"\n El liquido a recibir es: "+sueldot[a]);
            }
            a++;
        }       
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(VentasVen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentasVen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentasVen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentasVen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentasVen().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buesqueda;
    private javax.swing.JTextField cant1;
    private javax.swing.JTextField cant2;
    private javax.swing.JTextField cant3;
    private javax.swing.JTextField cant4;
    private javax.swing.JTextField cant5;
    private javax.swing.JTextField cant6;
    private javax.swing.JTextField cant7;
    private javax.swing.JTextField cant8;
    private javax.swing.JButton ingreso;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton limpiar;
    private javax.swing.JTextField nomap1;
    private javax.swing.JTextField nomap2;
    private javax.swing.JTextField nomap3;
    private javax.swing.JTextField nomap4;
    private javax.swing.JTextField nomap5;
    private javax.swing.JTextField nomap6;
    private javax.swing.JTextField nomap7;
    private javax.swing.JTextField nomap8;
    private javax.swing.JTextField sueldo1;
    private javax.swing.JTextField sueldo2;
    private javax.swing.JTextField sueldo3;
    private javax.swing.JTextField sueldo4;
    private javax.swing.JTextField sueldo5;
    private javax.swing.JTextField sueldo6;
    private javax.swing.JTextField sueldo7;
    private javax.swing.JTextField sueldo8;
    private javax.swing.JTextField sueldor1;
    private javax.swing.JTextField sueldor10;
    private javax.swing.JTextField sueldor2;
    private javax.swing.JTextField sueldor3;
    private javax.swing.JTextField sueldor4;
    private javax.swing.JTextField sueldor5;
    private javax.swing.JTextField sueldor6;
    private javax.swing.JTextField sueldor7;
    private javax.swing.JTextField sueldor8;
    private javax.swing.JTextField sueldor9;
    private javax.swing.JButton vendemay;
    // End of variables declaration//GEN-END:variables
}
