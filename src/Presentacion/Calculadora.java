package Presentacion;

import Negocio.EnergiaCinetica;
import Negocio.EnergiaMecanica;
import Negocio.EnergiaPotencial;
import Negocio.Simulacion;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

public class Calculadora extends javax.swing.JFrame {

    public Calculadora() {
        initComponents();
        inicializarSimulacion();
    }
    
    private void inicializarSimulacion() {
        JFXPanel fxPanel = new JFXPanel();

        panelSimulacion.setLayout(new java.awt.BorderLayout());
        panelSimulacion.add(fxPanel, java.awt.BorderLayout.CENTER);

        Platform.runLater(() -> {
            Pane root = new Pane();

            Simulacion simulacion = new Simulacion();
            simulacion.iniciarSimulacion(root);

            Scene scene = new Scene(root, panelSimulacion.getWidth(), panelSimulacion.getHeight());
            fxPanel.setScene(scene);
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        txtMasa = new javax.swing.JSpinner();
        txtAltura = new javax.swing.JSpinner();
        txtGravedad = new javax.swing.JSpinner();
        btCalcular = new javax.swing.JButton();
        label5 = new java.awt.Label();
        btLimpiar = new javax.swing.JButton();
        txtResultado = new javax.swing.JTextField();
        btCerrar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        label14 = new java.awt.Label();
        label15 = new java.awt.Label();
        label16 = new java.awt.Label();
        label17 = new java.awt.Label();
        txtEP = new javax.swing.JSpinner();
        txtAltura1 = new javax.swing.JSpinner();
        txtGravedad1 = new javax.swing.JSpinner();
        calcularMasa = new javax.swing.JButton();
        label18 = new java.awt.Label();
        btLimpiar3 = new javax.swing.JButton();
        txtRMas = new javax.swing.JTextField();
        btCerrar3 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        label19 = new java.awt.Label();
        label20 = new java.awt.Label();
        label21 = new java.awt.Label();
        label22 = new java.awt.Label();
        label23 = new java.awt.Label();
        txtRAltura = new javax.swing.JTextField();
        txtGravedad2 = new javax.swing.JSpinner();
        txtAltura2 = new javax.swing.JSpinner();
        txtEP1 = new javax.swing.JSpinner();
        btCerrar4 = new javax.swing.JButton();
        calcularMasa1 = new javax.swing.JButton();
        btLimpiar4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        label6 = new java.awt.Label();
        btCalcular1 = new javax.swing.JButton();
        btLimpiar1 = new javax.swing.JButton();
        label7 = new java.awt.Label();
        txtMasa1 = new javax.swing.JSpinner();
        label8 = new java.awt.Label();
        txtVelocidad = new javax.swing.JSpinner();
        label9 = new java.awt.Label();
        txtResultado1 = new javax.swing.JTextField();
        btCerrar1 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        label24 = new java.awt.Label();
        calMasa = new javax.swing.JButton();
        btLimpiar5 = new javax.swing.JButton();
        label25 = new java.awt.Label();
        txtEC = new javax.swing.JSpinner();
        label26 = new java.awt.Label();
        txtVelocidad1 = new javax.swing.JSpinner();
        Masa = new java.awt.Label();
        txtRMasa = new javax.swing.JTextField();
        btCerrar5 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        label27 = new java.awt.Label();
        txtRVelocidad = new javax.swing.JTextField();
        label28 = new java.awt.Label();
        txtEC2 = new javax.swing.JSpinner();
        label29 = new java.awt.Label();
        txtMasa2 = new javax.swing.JSpinner();
        calVelocidad = new javax.swing.JButton();
        btLimpiar6 = new javax.swing.JButton();
        btCerrar6 = new javax.swing.JButton();
        label30 = new java.awt.Label();
        jPanel3 = new javax.swing.JPanel();
        btCalcular2 = new javax.swing.JButton();
        btLimpiar2 = new javax.swing.JButton();
        btCerrar2 = new javax.swing.JButton();
        label10 = new java.awt.Label();
        label11 = new java.awt.Label();
        label12 = new java.awt.Label();
        label13 = new java.awt.Label();
        txtResul = new javax.swing.JTextField();
        txtPotencial = new javax.swing.JSpinner();
        txtCinetica = new javax.swing.JSpinner();
        jPanel4 = new javax.swing.JPanel();
        panelSimulacion = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(36, 41, 48));

        label1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("Calculadora de Energía Potencial Gravitatoria");

        label2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setText("Masa (kg)");

        label3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setText("Altura (m)");

        label4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label4.setForeground(new java.awt.Color(255, 255, 255));
        label4.setText("Resultado");

        txtMasa.setModel(new javax.swing.SpinnerNumberModel(0.0f, null, null, 1.0f));
        txtMasa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtAltura.setModel(new javax.swing.SpinnerNumberModel(0.0f, null, null, 1.0f));

        txtGravedad.setModel(new javax.swing.SpinnerNumberModel(9.8f, null, null, 1.0f));

        btCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/igual.png"))); // NOI18N
        btCalcular.setText("Calcular");
        btCalcular.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCalcular.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCalcular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCalcularMouseClicked(evt);
            }
        });

        label5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label5.setForeground(new java.awt.Color(255, 255, 255));
        label5.setText("Gravedad");

        btLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/escoba.png"))); // NOI18N
        btLimpiar.setText("Limpiar");
        btLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btLimpiar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btLimpiarMouseClicked(evt);
            }
        });

        btCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrarC.png"))); // NOI18N
        btCerrar.setText("Cerrar");
        btCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCerrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCerrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtMasa, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtGravedad, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(btCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17))))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtMasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtGravedad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btCalcular)
                            .addComponent(btCerrar))
                        .addGap(5, 5, 5)
                        .addComponent(btLimpiar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jTabbedPane2.addTab("EP", jPanel5);

        jPanel6.setBackground(new java.awt.Color(36, 41, 48));
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));

        label14.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label14.setForeground(new java.awt.Color(255, 255, 255));
        label14.setText("Calcular masa");

        label15.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label15.setForeground(new java.awt.Color(255, 255, 255));
        label15.setText("Energía Potencial (J)");

        label16.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label16.setForeground(new java.awt.Color(255, 255, 255));
        label16.setText("Altura (m)");

        label17.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label17.setForeground(new java.awt.Color(255, 255, 255));
        label17.setText("Masa");

        txtEP.setModel(new javax.swing.SpinnerNumberModel(0.0f, null, null, 1.0f));
        txtEP.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtAltura1.setModel(new javax.swing.SpinnerNumberModel(0.0f, null, null, 1.0f));

        txtGravedad1.setModel(new javax.swing.SpinnerNumberModel(9.8f, null, null, 1.0f));

        calcularMasa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/igual.png"))); // NOI18N
        calcularMasa.setText("Calcular");
        calcularMasa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        calcularMasa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        calcularMasa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calcularMasaMouseClicked(evt);
            }
        });

        label18.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label18.setForeground(new java.awt.Color(255, 255, 255));
        label18.setText("Gravedad");

        btLimpiar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/escoba.png"))); // NOI18N
        btLimpiar3.setText("Limpiar");
        btLimpiar3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btLimpiar3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btLimpiar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btLimpiar3MouseClicked(evt);
            }
        });

        btCerrar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrarC.png"))); // NOI18N
        btCerrar3.setText("Cerrar");
        btCerrar3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCerrar3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCerrar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCerrar3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(label15, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEP, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addComponent(label14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(label17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtRMas, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(label18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(44, 44, 44)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtGravedad1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtAltura1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 136, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(calcularMasa, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btLimpiar3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btCerrar3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btCerrar3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(calcularMasa, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btLimpiar3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(label16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(txtAltura1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtGravedad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRMas, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        jTabbedPane2.addTab("Masa", jPanel6);

        jPanel7.setBackground(new java.awt.Color(36, 41, 48));

        label19.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label19.setForeground(new java.awt.Color(255, 255, 255));
        label19.setText("Calcular Altura");

        label20.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label20.setForeground(new java.awt.Color(255, 255, 255));
        label20.setText("Energía Potencial (J)");

        label21.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label21.setForeground(new java.awt.Color(255, 255, 255));
        label21.setText("Masa (kg)");

        label22.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label22.setForeground(new java.awt.Color(255, 255, 255));
        label22.setText("Gravedad");

        label23.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label23.setForeground(new java.awt.Color(255, 255, 255));
        label23.setText("Altura");

        txtGravedad2.setModel(new javax.swing.SpinnerNumberModel(9.8f, null, null, 1.0f));

        txtAltura2.setModel(new javax.swing.SpinnerNumberModel(0.0f, null, null, 1.0f));

        txtEP1.setModel(new javax.swing.SpinnerNumberModel(0.0f, null, null, 1.0f));
        txtEP1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btCerrar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrarC.png"))); // NOI18N
        btCerrar4.setText("Cerrar");
        btCerrar4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCerrar4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCerrar4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCerrar4MouseClicked(evt);
            }
        });

        calcularMasa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/igual.png"))); // NOI18N
        calcularMasa1.setText("Calcular");
        calcularMasa1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        calcularMasa1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        calcularMasa1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calcularMasa1MouseClicked(evt);
            }
        });

        btLimpiar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/escoba.png"))); // NOI18N
        btLimpiar4.setText("Limpiar");
        btLimpiar4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btLimpiar4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btLimpiar4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btLimpiar4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(label19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(label22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtGravedad2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addComponent(label21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(83, 83, 83)
                                    .addComponent(txtAltura2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(label23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(txtRAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(label20, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEP1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(calcularMasa1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btLimpiar4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btCerrar4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btCerrar4)
                    .addComponent(calcularMasa1)
                    .addComponent(btLimpiar4))
                .addGap(23, 23, 23)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEP1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtAltura2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtGravedad2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        jTabbedPane2.addTab("Altura", jPanel7);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        jTabbedPane1.addTab("Enegía Potencial", jPanel1);

        jPanel8.setBackground(new java.awt.Color(36, 41, 48));

        label6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label6.setForeground(new java.awt.Color(255, 255, 255));
        label6.setText("Calculadora de Energía Cinética");

        btCalcular1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/igual.png"))); // NOI18N
        btCalcular1.setText("Calcular");
        btCalcular1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCalcular1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCalcular1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCalcular1MouseClicked(evt);
            }
        });

        btLimpiar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/escoba.png"))); // NOI18N
        btLimpiar1.setText("Limpiar");
        btLimpiar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btLimpiar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btLimpiar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btLimpiar1MouseClicked(evt);
            }
        });

        label7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label7.setForeground(new java.awt.Color(255, 255, 255));
        label7.setText("Masa (kg)");

        txtMasa1.setModel(new javax.swing.SpinnerNumberModel(0.0f, null, null, 1.0f));
        txtMasa1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        label8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label8.setForeground(new java.awt.Color(255, 255, 255));
        label8.setText("Velocidad (m/s)");

        txtVelocidad.setModel(new javax.swing.SpinnerNumberModel(0.0f, null, null, 1.0f));
        txtVelocidad.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        label9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label9.setForeground(new java.awt.Color(255, 255, 255));
        label9.setText("Resultado");

        btCerrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrarC.png"))); // NOI18N
        btCerrar1.setText("Cerrar");
        btCerrar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCerrar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCerrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCerrar1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(txtResultado1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(txtMasa1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(btCalcular1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(btLimpiar1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btCerrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(99, 99, 99))
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(171, 171, 171)
                    .addComponent(txtVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btCerrar1)
                            .addComponent(btLimpiar1)
                            .addComponent(btCalcular1))
                        .addGap(23, 23, 23)
                        .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtMasa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtResultado1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addGap(180, 180, 180)
                    .addComponent(txtVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(79, Short.MAX_VALUE)))
        );

        jTabbedPane3.addTab("EPC", jPanel8);

        jPanel9.setBackground(new java.awt.Color(36, 41, 48));

        label24.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label24.setForeground(new java.awt.Color(255, 255, 255));
        label24.setText("Calcular Masa");

        calMasa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/igual.png"))); // NOI18N
        calMasa.setText("Calcular");
        calMasa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        calMasa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        calMasa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calMasaMouseClicked(evt);
            }
        });

        btLimpiar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/escoba.png"))); // NOI18N
        btLimpiar5.setText("Limpiar");
        btLimpiar5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btLimpiar5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btLimpiar5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btLimpiar5MouseClicked(evt);
            }
        });

        label25.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label25.setForeground(new java.awt.Color(255, 255, 255));
        label25.setText("Energía Cinética (J)");

        txtEC.setModel(new javax.swing.SpinnerNumberModel(0.0f, null, null, 1.0f));
        txtEC.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        label26.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label26.setForeground(new java.awt.Color(255, 255, 255));
        label26.setText("Velocidad (m/s)");

        txtVelocidad1.setModel(new javax.swing.SpinnerNumberModel(0.0f, null, null, 1.0f));
        txtVelocidad1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Masa.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Masa.setForeground(new java.awt.Color(255, 255, 255));
        Masa.setText("Masa (kg)");

        btCerrar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrarC.png"))); // NOI18N
        btCerrar5.setText("Cerrar");
        btCerrar5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCerrar5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCerrar5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCerrar5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtRMasa, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Masa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEC)
                            .addComponent(txtVelocidad1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(calMasa, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btLimpiar5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btCerrar5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(label24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(label24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btCerrar5)
                    .addComponent(calMasa)
                    .addComponent(btLimpiar5))
                .addGap(29, 29, 29)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVelocidad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(Masa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(txtRMasa, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Masa", jPanel9);

        jPanel10.setBackground(new java.awt.Color(36, 41, 48));

        label27.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label27.setForeground(new java.awt.Color(255, 255, 255));
        label27.setText("Velocidad");

        label28.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label28.setForeground(new java.awt.Color(255, 255, 255));
        label28.setText("Energía Cinética (J)");

        txtEC2.setModel(new javax.swing.SpinnerNumberModel(0.0f, null, null, 1.0f));
        txtEC2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        label29.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label29.setForeground(new java.awt.Color(255, 255, 255));
        label29.setText("Masa (kg)");

        txtMasa2.setModel(new javax.swing.SpinnerNumberModel(0.0f, null, null, 1.0f));
        txtMasa2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        calVelocidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/igual.png"))); // NOI18N
        calVelocidad.setText("Calcular");
        calVelocidad.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        calVelocidad.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        calVelocidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calVelocidadMouseClicked(evt);
            }
        });

        btLimpiar6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/escoba.png"))); // NOI18N
        btLimpiar6.setText("Limpiar");
        btLimpiar6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btLimpiar6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btLimpiar6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btLimpiar6MouseClicked(evt);
            }
        });

        btCerrar6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrarC.png"))); // NOI18N
        btCerrar6.setText("Cerrar");
        btCerrar6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCerrar6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCerrar6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCerrar6MouseClicked(evt);
            }
        });

        label30.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label30.setForeground(new java.awt.Color(255, 255, 255));
        label30.setText("Calcular Velocidad");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(calVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btLimpiar6, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btCerrar6, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addGap(62, 62, 62)
                                        .addComponent(txtMasa2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(txtRVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(label28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEC2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(label30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(calVelocidad)
                    .addComponent(btLimpiar6)
                    .addComponent(btCerrar6))
                .addGap(37, 37, 37)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEC2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMasa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(txtRVelocidad, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(19, Short.MAX_VALUE))))
        );

        jTabbedPane3.addTab("Velocidad", jPanel10);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );

        jTabbedPane1.addTab("Energía Cinética", jPanel2);

        jPanel3.setBackground(new java.awt.Color(36, 41, 48));

        btCalcular2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/igual.png"))); // NOI18N
        btCalcular2.setText("Calcular");
        btCalcular2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCalcular2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCalcular2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCalcular2MouseClicked(evt);
            }
        });

        btLimpiar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/escoba.png"))); // NOI18N
        btLimpiar2.setText("Limpiar");
        btLimpiar2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btLimpiar2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btLimpiar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btLimpiar2MouseClicked(evt);
            }
        });

        btCerrar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrarC.png"))); // NOI18N
        btCerrar2.setText("Cerrar");
        btCerrar2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCerrar2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCerrar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCerrar2MouseClicked(evt);
            }
        });

        label10.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label10.setForeground(new java.awt.Color(255, 255, 255));
        label10.setText("Calculadora Energía Mecánica Total");

        label11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label11.setForeground(new java.awt.Color(255, 255, 255));
        label11.setText("Energía Potencial (J)");

        label12.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label12.setForeground(new java.awt.Color(255, 255, 255));
        label12.setText("Energía Cinética (J)");

        label13.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        label13.setForeground(new java.awt.Color(255, 255, 255));
        label13.setText("Resultado");

        txtPotencial.setModel(new javax.swing.SpinnerNumberModel(0.0f, null, null, 1.0f));
        txtPotencial.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtCinetica.setModel(new javax.swing.SpinnerNumberModel(0.0f, null, null, 1.0f));
        txtCinetica.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(label13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtResul, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(label12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtCinetica, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btCalcular2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btLimpiar2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCerrar2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(label11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPotencial, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(78, 78, 78))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btCerrar2)
                    .addComponent(btLimpiar2)
                    .addComponent(btCalcular2))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPotencial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCinetica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtResul, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Energía Mecánica Total", jPanel3);

        javax.swing.GroupLayout panelSimulacionLayout = new javax.swing.GroupLayout(panelSimulacion);
        panelSimulacion.setLayout(panelSimulacionLayout);
        panelSimulacionLayout.setHorizontalGroup(
            panelSimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 457, Short.MAX_VALUE)
        );
        panelSimulacionLayout.setVerticalGroup(
            panelSimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 387, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSimulacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSimulacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Simulación", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCalcularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCalcularMouseClicked
        try {
            float masa = (float) txtMasa.getValue();
            float altura = (float) txtAltura.getValue();
            float gravedad = (float) txtGravedad.getValue();

            if (masa <= 0 || altura <= 0 || gravedad <= 0) {
                txtResultado.setText("Error: Valores deben ser mayores a 0");
                return;
            }

            EnergiaPotencial energia = new EnergiaPotencial();
            energia.setMasa(masa);
            energia.setAltura(altura);
            energia.setGravedad(gravedad);

            float total = masa * gravedad * altura;
            energia.setTotal(total);

            txtResultado.setText(String.format("%.2f", energia.getTotal()) + " J");
        } catch (Exception e) {
            txtResultado.setText("Error: Verifica los valores ingresados.");
        }
    }//GEN-LAST:event_btCalcularMouseClicked

    private void btLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btLimpiarMouseClicked
        txtMasa.setValue(0.0f);
        txtAltura.setValue(0.0f);
        txtGravedad.setValue(9.8f);
        txtResultado.setText("");
    }//GEN-LAST:event_btLimpiarMouseClicked

    private void btCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCerrarMouseClicked
        Principal pri = new Principal();
        pri.setVisible(true);
        dispose();
    }//GEN-LAST:event_btCerrarMouseClicked

    private void btCerrar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCerrar1MouseClicked
        Principal pri = new Principal();
        pri.setVisible(true);
        dispose();
    }//GEN-LAST:event_btCerrar1MouseClicked

    private void btCalcular1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCalcular1MouseClicked
        try {
            float masa = (float) txtMasa1.getValue();
            float velocidad = (float) txtVelocidad.getValue();

            if (masa <= 0 || velocidad <= 0) {
                txtResultado1.setText("Error: Valores deben ser mayores a 0");
                return;
            }

            EnergiaCinetica energia = new EnergiaCinetica();
            energia.setMasa(masa);
            energia.setVelocidad(velocidad);

            energia.calcularEnergiaCinetica();

            txtResultado1.setText(String.format("%.2f", energia.getTotal()) + " J");
        } catch (Exception e) {
            txtResultado1.setText("Error: Verifica los valores ingresados.");
        }
    }//GEN-LAST:event_btCalcular1MouseClicked

    private void btLimpiar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btLimpiar1MouseClicked
        txtMasa1.setValue(0.0f);
        txtVelocidad.setValue(0.0f);
        txtResultado1.setText("");
    }//GEN-LAST:event_btLimpiar1MouseClicked

    private void btCalcular2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCalcular2MouseClicked
        try {
            float energiaPotencial = (float) txtPotencial.getValue();
            float energiaCinetica = (float) txtCinetica.getValue();

            if (energiaPotencial < 0 || energiaCinetica < 0) {
                txtResul.setText("Error: Las energías deben ser positivas o cero.");
                return;
            }

            EnergiaMecanica energiaMecanica = new EnergiaMecanica(energiaPotencial, energiaCinetica);

            energiaMecanica.calcularEnergiaMecanica();

            txtResul.setText(String.format("%.2f", energiaMecanica.getEnergiaMecanica()) + " J");
        } catch (Exception e) {
            txtResul.setText("Error: Verifica los valores ingresados.");
        }
    }//GEN-LAST:event_btCalcular2MouseClicked

    private void btLimpiar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btLimpiar2MouseClicked
        txtPotencial.setValue(0.0f);
        txtCinetica.setValue(0.0f);
        txtResul.setText("");
    }//GEN-LAST:event_btLimpiar2MouseClicked

    private void btCerrar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCerrar2MouseClicked
        Principal pri = new Principal();
        pri.setVisible(true);
        dispose();
    }//GEN-LAST:event_btCerrar2MouseClicked

    private void calcularMasaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcularMasaMouseClicked
        try {
            float energiaPotencial = (float) txtEP.getValue();
            float altura = (float) txtAltura1.getValue();
            float gravedad = (float) txtGravedad1.getValue();

            if (energiaPotencial <= 0 || altura <= 0 || gravedad <= 0) {
                txtRMas.setText("Error: Valores deben ser mayores a 0");
                return;
            }

            float masa = energiaPotencial / (gravedad * altura);

            txtRMas.setText(String.format("%.2f kg", masa));
        } catch (Exception e) {
            txtRMas.setText("Error: Verifica los valores ingresados.");
        }
    }//GEN-LAST:event_calcularMasaMouseClicked

    private void btLimpiar3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btLimpiar3MouseClicked
        txtEP.setValue(0.0f);
        txtAltura1.setValue(0.0f);
        txtRMas.setText("");
    }//GEN-LAST:event_btLimpiar3MouseClicked

    private void btCerrar3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCerrar3MouseClicked
        Principal pri = new Principal();
        pri.setVisible(true);
        dispose();
    }//GEN-LAST:event_btCerrar3MouseClicked

    private void btCerrar4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCerrar4MouseClicked
        Principal pri = new Principal();
        pri.setVisible(true);
        dispose();
    }//GEN-LAST:event_btCerrar4MouseClicked

    private void calcularMasa1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcularMasa1MouseClicked
        try {
            float energiaPotencial = (float) txtEP1.getValue();
            float masa = (float) txtAltura2.getValue();
            float gravedad = (float) txtGravedad2.getValue();

            if (energiaPotencial <= 0 || masa <= 0 || gravedad <= 0) {
                txtRAltura.setText("Error: Valores deben ser mayores a 0");
                return;
            }

            float altura = energiaPotencial / (masa * gravedad);

            txtRAltura.setText(String.format("%.2f m", altura));
        } catch (Exception e) {
            txtRAltura.setText("Error: Verifica los valores ingresados.");
        }
    }//GEN-LAST:event_calcularMasa1MouseClicked

    private void btLimpiar4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btLimpiar4MouseClicked
        txtEP1.setValue(0.0f);
        txtAltura2.setValue(0.0f);
        txtRAltura.setText("");
    }//GEN-LAST:event_btLimpiar4MouseClicked

    private void calMasaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calMasaMouseClicked
        try {
            float energiaCinetica = (float) txtEC.getValue();
            float velocidad = (float) txtVelocidad.getValue();

            if (energiaCinetica <= 0 || velocidad <= 0) {
                txtRMasa.setText("Error: Valores deben ser mayores a 0");
                return;
            }

            float masa = (2 * energiaCinetica) / (velocidad * velocidad);

            txtRMasa.setText(String.format("%.2f kg", masa));
        } catch (Exception e) {
            txtRMasa.setText("Error: Verifica los valores ingresados.");
        }
    }//GEN-LAST:event_calMasaMouseClicked

    private void btLimpiar5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btLimpiar5MouseClicked
        txtEC.setValue(0.0f);
        txtVelocidad.setValue(0.0f);
        txtRMasa.setText("");
    }//GEN-LAST:event_btLimpiar5MouseClicked

    private void btCerrar5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCerrar5MouseClicked
        Principal pri = new Principal();
        pri.setVisible(true);
        dispose();
    }//GEN-LAST:event_btCerrar5MouseClicked

    private void calVelocidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calVelocidadMouseClicked
        try {
            float energiaCinetica = (float) txtEC2.getValue();
            float masa = (float) txtMasa2.getValue();

            if (energiaCinetica <= 0 || masa <= 0) {
                txtRVelocidad.setText("Error: Valores deben ser mayores a 0");
                return;
            }

            float velocidad = (float) Math.sqrt((2 * energiaCinetica) / masa);

            txtRVelocidad.setText(String.format("%.2f m/s", velocidad));
        } catch (Exception e) {
            txtRVelocidad.setText("Error: Verifica los valores ingresados.");
        }
    }//GEN-LAST:event_calVelocidadMouseClicked

    private void btLimpiar6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btLimpiar6MouseClicked
        txtEC2.setValue(0.0f);
        txtMasa2.setValue(0.0f);
        txtRVelocidad.setText("");
    }//GEN-LAST:event_btLimpiar6MouseClicked

    private void btCerrar6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCerrar6MouseClicked
        Principal pri = new Principal();
        pri.setVisible(true);
        dispose();
    }//GEN-LAST:event_btCerrar6MouseClicked

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label Masa;
    private javax.swing.JButton btCalcular;
    private javax.swing.JButton btCalcular1;
    private javax.swing.JButton btCalcular2;
    private javax.swing.JButton btCerrar;
    private javax.swing.JButton btCerrar1;
    private javax.swing.JButton btCerrar2;
    private javax.swing.JButton btCerrar3;
    private javax.swing.JButton btCerrar4;
    private javax.swing.JButton btCerrar5;
    private javax.swing.JButton btCerrar6;
    private javax.swing.JButton btLimpiar;
    private javax.swing.JButton btLimpiar1;
    private javax.swing.JButton btLimpiar2;
    private javax.swing.JButton btLimpiar3;
    private javax.swing.JButton btLimpiar4;
    private javax.swing.JButton btLimpiar5;
    private javax.swing.JButton btLimpiar6;
    private javax.swing.JButton calMasa;
    private javax.swing.JButton calVelocidad;
    private javax.swing.JButton calcularMasa;
    private javax.swing.JButton calcularMasa1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private java.awt.Label label1;
    private java.awt.Label label10;
    private java.awt.Label label11;
    private java.awt.Label label12;
    private java.awt.Label label13;
    private java.awt.Label label14;
    private java.awt.Label label15;
    private java.awt.Label label16;
    private java.awt.Label label17;
    private java.awt.Label label18;
    private java.awt.Label label19;
    private java.awt.Label label2;
    private java.awt.Label label20;
    private java.awt.Label label21;
    private java.awt.Label label22;
    private java.awt.Label label23;
    private java.awt.Label label24;
    private java.awt.Label label25;
    private java.awt.Label label26;
    private java.awt.Label label27;
    private java.awt.Label label28;
    private java.awt.Label label29;
    private java.awt.Label label3;
    private java.awt.Label label30;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Label label9;
    private javax.swing.JPanel panelSimulacion;
    private javax.swing.JSpinner txtAltura;
    private javax.swing.JSpinner txtAltura1;
    private javax.swing.JSpinner txtAltura2;
    private javax.swing.JSpinner txtCinetica;
    private javax.swing.JSpinner txtEC;
    private javax.swing.JSpinner txtEC2;
    private javax.swing.JSpinner txtEP;
    private javax.swing.JSpinner txtEP1;
    private javax.swing.JSpinner txtGravedad;
    private javax.swing.JSpinner txtGravedad1;
    private javax.swing.JSpinner txtGravedad2;
    private javax.swing.JSpinner txtMasa;
    private javax.swing.JSpinner txtMasa1;
    private javax.swing.JSpinner txtMasa2;
    private javax.swing.JSpinner txtPotencial;
    private javax.swing.JTextField txtRAltura;
    private javax.swing.JTextField txtRMas;
    private javax.swing.JTextField txtRMasa;
    private javax.swing.JTextField txtRVelocidad;
    private javax.swing.JTextField txtResul;
    private javax.swing.JTextField txtResultado;
    private javax.swing.JTextField txtResultado1;
    private javax.swing.JSpinner txtVelocidad;
    private javax.swing.JSpinner txtVelocidad1;
    // End of variables declaration//GEN-END:variables
}
