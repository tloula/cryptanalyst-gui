/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cryptanalyst.gui;

import java.awt.Color;

/**
 *
 * @author Trevor Loula
 */
public class cryptanalystGui extends javax.swing.JFrame {
    
    Monoalphabetic cipher;
    char[] map;
    
    Color Hover = new Color(61,0,0);
    Color MediumRed = new Color(108,42,42);

    /**
     * Creates new form cryptanalystGui
     */
    public cryptanalystGui() {
        initComponents();
        this.cipher = new Monoalphabetic("Init");
        this.map = new char[] {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
            'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
            'W', 'X', 'Y', 'Z'};
        this.setMappings();
    }
    
    public void update() {
        System.out.println(getMappings());
        cipher.setCiphertextMapping(getMappings());
        System.out.println(cipher.getCipherTextMapping());
        System.out.println(cipher.Decode());
        PlaintextTextArea.setText(cipher.Decode());
        this.setFrequencies();
    }
    
    public void setMappings() {
        final char[] tmp = this.map.clone();
        A_Combo.setSelectedItem((Object)String.valueOf(tmp[0]));
        B_Combo.setSelectedItem((Object)String.valueOf(tmp[1]));
        C_Combo.setSelectedItem((Object)String.valueOf(tmp[2]));
        D_Combo.setSelectedItem((Object)String.valueOf(tmp[3]));
        E_Combo.setSelectedItem((Object)String.valueOf(tmp[4]));
        F_Combo.setSelectedItem((Object)String.valueOf(tmp[5]));
        G_Combo.setSelectedItem((Object)String.valueOf(tmp[6]));
        H_Combo.setSelectedItem((Object)String.valueOf(tmp[7]));
        I_Combo.setSelectedItem((Object)String.valueOf(tmp[8]));
        J_Combo.setSelectedItem((Object)String.valueOf(tmp[9]));
        K_Combo.setSelectedItem((Object)String.valueOf(tmp[10]));
        L_Combo.setSelectedItem((Object)String.valueOf(tmp[11]));
        M_Combo.setSelectedItem((Object)String.valueOf(tmp[12]));
        N_Combo.setSelectedItem((Object)String.valueOf(tmp[13]));
        O_Combo.setSelectedItem((Object)String.valueOf(tmp[14]));
        P_Combo.setSelectedItem((Object)String.valueOf(tmp[15]));
        Q_Combo.setSelectedItem((Object)String.valueOf(tmp[16]));
        R_Combo.setSelectedItem((Object)String.valueOf(tmp[17]));
        S_Combo.setSelectedItem((Object)String.valueOf(tmp[18]));
        T_Combo.setSelectedItem((Object)String.valueOf(tmp[19]));
        U_Combo.setSelectedItem((Object)String.valueOf(tmp[20]));
        V_Combo.setSelectedItem((Object)String.valueOf(tmp[21]));
        W_Combo.setSelectedItem((Object)String.valueOf(tmp[22]));
        X_Combo.setSelectedItem((Object)String.valueOf(tmp[23]));
        Y_Combo.setSelectedItem((Object)String.valueOf(tmp[24]));
        Z_Combo.setSelectedItem((Object)String.valueOf(tmp[25]));
    }
    public char[] getMappings() {
        char[] temp = new char[26];
        temp[0] = A_Combo.getSelectedItem().toString().charAt(0);
        temp[1] = B_Combo.getSelectedItem().toString().charAt(0);
        temp[2] = C_Combo.getSelectedItem().toString().charAt(0);
        temp[3] = D_Combo.getSelectedItem().toString().charAt(0);
        temp[4] = E_Combo.getSelectedItem().toString().charAt(0);
        temp[5] = F_Combo.getSelectedItem().toString().charAt(0);
        temp[6] = G_Combo.getSelectedItem().toString().charAt(0);
        temp[7] = H_Combo.getSelectedItem().toString().charAt(0);
        temp[8] = I_Combo.getSelectedItem().toString().charAt(0);
        temp[9] = J_Combo.getSelectedItem().toString().charAt(0);
        temp[10] = K_Combo.getSelectedItem().toString().charAt(0);
        temp[11] = L_Combo.getSelectedItem().toString().charAt(0);
        temp[12] = M_Combo.getSelectedItem().toString().charAt(0);
        temp[13] = N_Combo.getSelectedItem().toString().charAt(0);
        temp[14] = O_Combo.getSelectedItem().toString().charAt(0);
        temp[15] = P_Combo.getSelectedItem().toString().charAt(0);
        temp[16] = Q_Combo.getSelectedItem().toString().charAt(0);
        temp[17] = R_Combo.getSelectedItem().toString().charAt(0);
        temp[18] = S_Combo.getSelectedItem().toString().charAt(0);
        temp[19] = T_Combo.getSelectedItem().toString().charAt(0);
        temp[20] = U_Combo.getSelectedItem().toString().charAt(0);
        temp[21] = V_Combo.getSelectedItem().toString().charAt(0);
        temp[22] = W_Combo.getSelectedItem().toString().charAt(0);
        temp[23] = X_Combo.getSelectedItem().toString().charAt(0);
        temp[24] = Y_Combo.getSelectedItem().toString().charAt(0);
        temp[25] = Z_Combo.getSelectedItem().toString().charAt(0);
        return temp;
    }
    
    public void setFrequencies() {
        int[] ciph = cipher.getCiphertextFrequency();
        int[] cali = cipher.getCalibratedFrequency();
        
        A_Frequency.setText(Integer.toString(ciph[0]) + "/" + Integer.toString(cali[A_Combo.getSelectedIndex()]));
        B_Frequency.setText(Integer.toString(ciph[1]) + "/" + Integer.toString(cali[B_Combo.getSelectedIndex()]));
        C_Frequency.setText(Integer.toString(ciph[2]) + "/" + Integer.toString(cali[C_Combo.getSelectedIndex()]));
        D_Frequency.setText(Integer.toString(ciph[3]) + "/" + Integer.toString(cali[D_Combo.getSelectedIndex()]));
        E_Frequency.setText(Integer.toString(ciph[4]) + "/" + Integer.toString(cali[E_Combo.getSelectedIndex()]));
        F_Frequency.setText(Integer.toString(ciph[5]) + "/" + Integer.toString(cali[F_Combo.getSelectedIndex()]));
        G_Frequency.setText(Integer.toString(ciph[6]) + "/" + Integer.toString(cali[G_Combo.getSelectedIndex()]));
        H_Frequency.setText(Integer.toString(ciph[7]) + "/" + Integer.toString(cali[H_Combo.getSelectedIndex()]));
        I_Frequency.setText(Integer.toString(ciph[8]) + "/" + Integer.toString(cali[I_Combo.getSelectedIndex()]));
        J_Frequency.setText(Integer.toString(ciph[9]) + "/" + Integer.toString(cali[J_Combo.getSelectedIndex()]));
        K_Frequency.setText(Integer.toString(ciph[10]) + "/" + Integer.toString(cali[K_Combo.getSelectedIndex()]));
        L_Frequency.setText(Integer.toString(ciph[11]) + "/" + Integer.toString(cali[L_Combo.getSelectedIndex()]));
        M_Frequency.setText(Integer.toString(ciph[12]) + "/" + Integer.toString(cali[M_Combo.getSelectedIndex()]));
        N_Frequency.setText(Integer.toString(ciph[13]) + "/" + Integer.toString(cali[N_Combo.getSelectedIndex()]));
        O_Frequency.setText(Integer.toString(ciph[14]) + "/" + Integer.toString(cali[O_Combo.getSelectedIndex()]));
        P_Frequency.setText(Integer.toString(ciph[15]) + "/" + Integer.toString(cali[P_Combo.getSelectedIndex()]));
        Q_Frequency.setText(Integer.toString(ciph[16]) + "/" + Integer.toString(cali[Q_Combo.getSelectedIndex()]));
        R_Frequency.setText(Integer.toString(ciph[17]) + "/" + Integer.toString(cali[R_Combo.getSelectedIndex()]));
        S_Frequency.setText(Integer.toString(ciph[18]) + "/" + Integer.toString(cali[S_Combo.getSelectedIndex()]));
        T_Frequency.setText(Integer.toString(ciph[19]) + "/" + Integer.toString(cali[T_Combo.getSelectedIndex()]));
        U_Frequency.setText(Integer.toString(ciph[20]) + "/" + Integer.toString(cali[U_Combo.getSelectedIndex()]));
        V_Frequency.setText(Integer.toString(ciph[21]) + "/" + Integer.toString(cali[V_Combo.getSelectedIndex()]));
        W_Frequency.setText(Integer.toString(ciph[22]) + "/" + Integer.toString(cali[W_Combo.getSelectedIndex()]));
        X_Frequency.setText(Integer.toString(ciph[23]) + "/" + Integer.toString(cali[X_Combo.getSelectedIndex()]));
        Y_Frequency.setText(Integer.toString(ciph[24]) + "/" + Integer.toString(cali[Y_Combo.getSelectedIndex()]));
        Z_Frequency.setText(Integer.toString(ciph[25]) + "/" + Integer.toString(cali[Z_Combo.getSelectedIndex()]));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        TitleBar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CiphertextLabel = new javax.swing.JLabel();
        Separator = new javax.swing.JSeparator();
        PlaintextLabel = new javax.swing.JLabel();
        Separator1 = new javax.swing.JSeparator();
        CalibrateButton = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LetterMappingPanelAM = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        A_Combo = new javax.swing.JComboBox<>();
        A_Frequency = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        B_Combo = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        B_Frequency = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        C_Combo = new javax.swing.JComboBox<>();
        jLabel43 = new javax.swing.JLabel();
        C_Frequency = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        D_Combo = new javax.swing.JComboBox<>();
        jLabel44 = new javax.swing.JLabel();
        D_Frequency = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        E_Combo = new javax.swing.JComboBox<>();
        E_Frequency = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        F_Combo = new javax.swing.JComboBox<>();
        jLabel46 = new javax.swing.JLabel();
        F_Frequency = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        G_Combo = new javax.swing.JComboBox<>();
        jLabel47 = new javax.swing.JLabel();
        G_Frequency = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        H_Combo = new javax.swing.JComboBox<>();
        jLabel48 = new javax.swing.JLabel();
        H_Frequency = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        I_Combo = new javax.swing.JComboBox<>();
        jLabel49 = new javax.swing.JLabel();
        I_Frequency = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        J_Combo = new javax.swing.JComboBox<>();
        jLabel50 = new javax.swing.JLabel();
        J_Frequency = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        L_Combo = new javax.swing.JComboBox<>();
        jLabel51 = new javax.swing.JLabel();
        L_Frequency = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        K_Combo = new javax.swing.JComboBox<>();
        jLabel52 = new javax.swing.JLabel();
        K_Frequency = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        M_Combo = new javax.swing.JComboBox<>();
        jLabel53 = new javax.swing.JLabel();
        M_Frequency = new javax.swing.JLabel();
        LetterMappingPanelMZ = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        N_Combo = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        N_Frequency = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        O_Combo = new javax.swing.JComboBox<>();
        O_Frequency = new javax.swing.JLabel();
        O_Label = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        P_Combo = new javax.swing.JComboBox<>();
        jLabel54 = new javax.swing.JLabel();
        P_Frequency = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        Q_Combo = new javax.swing.JComboBox<>();
        jLabel55 = new javax.swing.JLabel();
        Q_Frequency = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        R_Combo = new javax.swing.JComboBox<>();
        jLabel56 = new javax.swing.JLabel();
        R_Frequency = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        S_Combo = new javax.swing.JComboBox<>();
        S_Frequency = new javax.swing.JLabel();
        S_Label = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        T_Combo = new javax.swing.JComboBox<>();
        T_Frequency = new javax.swing.JLabel();
        T_Label = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        U_Combo = new javax.swing.JComboBox<>();
        U_Frequency = new javax.swing.JLabel();
        U_Label = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        V_Combo = new javax.swing.JComboBox<>();
        jLabel60 = new javax.swing.JLabel();
        V_Frequency = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        W_Combo = new javax.swing.JComboBox<>();
        jLabel61 = new javax.swing.JLabel();
        W_Frequency = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        Y_Combo = new javax.swing.JComboBox<>();
        jLabel62 = new javax.swing.JLabel();
        Y_Frequency = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        X_Combo = new javax.swing.JComboBox<>();
        jLabel63 = new javax.swing.JLabel();
        X_Frequency = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        Z_Combo = new javax.swing.JComboBox<>();
        jLabel64 = new javax.swing.JLabel();
        Z_Frequency = new javax.swing.JLabel();
        PlaintextScrollPane = new javax.swing.JScrollPane();
        PlaintextTextArea = new javax.swing.JTextArea();
        CiphertextScrollPane = new javax.swing.JScrollPane();
        CiphertextTextArea = new javax.swing.JTextArea();
        UpdateButton = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1450, 950));

        Background.setBackground(new java.awt.Color(39, 39, 39));
        Background.setMinimumSize(new java.awt.Dimension(1500, 1500));
        Background.setPreferredSize(new java.awt.Dimension(1600, 900));

        TitleBar.setBackground(new java.awt.Color(82, 21, 21));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Monoalphabetic Substitution Cipher Cryptanalyst");

        javax.swing.GroupLayout TitleBarLayout = new javax.swing.GroupLayout(TitleBar);
        TitleBar.setLayout(TitleBarLayout);
        TitleBarLayout.setHorizontalGroup(
            TitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitleBarLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TitleBarLayout.setVerticalGroup(
            TitleBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TitleBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addContainerGap())
        );

        CiphertextLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        CiphertextLabel.setForeground(new java.awt.Color(204, 204, 204));
        CiphertextLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CiphertextLabel.setText("Ciphertext");

        Separator.setPreferredSize(new java.awt.Dimension(1, 1));

        PlaintextLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        PlaintextLabel.setForeground(new java.awt.Color(204, 204, 204));
        PlaintextLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PlaintextLabel.setText("Plaintext");

        CalibrateButton.setBackground(new java.awt.Color(108, 42, 42));
        CalibrateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CalibrateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CalibrateButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CalibrateButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CalibrateButtonMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Calibrate Mappings");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cryptanalyst/gui/img/Settings_32px.png"))); // NOI18N

        javax.swing.GroupLayout CalibrateButtonLayout = new javax.swing.GroupLayout(CalibrateButton);
        CalibrateButton.setLayout(CalibrateButtonLayout);
        CalibrateButtonLayout.setHorizontalGroup(
            CalibrateButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CalibrateButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145))
        );
        CalibrateButtonLayout.setVerticalGroup(
            CalibrateButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CalibrateButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CalibrateButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        LetterMappingPanelAM.setBackground(new java.awt.Color(39, 39, 39));

        jPanel1.setBackground(new java.awt.Color(34, 38, 41));

        A_Combo.setBackground(new java.awt.Color(107, 110, 112));
        A_Combo.setEditable(true);
        A_Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));
        A_Combo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                A_ComboItemStateChanged(evt);
            }
        });
        A_Combo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                A_ComboMouseExited(evt);
            }
        });
        A_Combo.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                A_ComboInputMethodTextChanged(evt);
            }
        });
        A_Combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A_ComboActionPerformed(evt);
            }
        });

        A_Frequency.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        A_Frequency.setForeground(new java.awt.Color(255, 255, 255));
        A_Frequency.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        A_Frequency.setText("A");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("A");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(A_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(A_Frequency, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(A_Frequency)
                    .addComponent(jLabel21))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(34, 38, 41));

        B_Combo.setBackground(new java.awt.Color(34, 38, 41));
        B_Combo.setEditable(true);
        B_Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));
        B_Combo.setSelectedIndex(1);
        B_Combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_ComboActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("B");

        B_Frequency.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        B_Frequency.setForeground(new java.awt.Color(255, 255, 255));
        B_Frequency.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        B_Frequency.setText("B");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(B_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(B_Frequency, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(B_Frequency))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(34, 38, 41));

        C_Combo.setBackground(new java.awt.Color(107, 110, 112));
        C_Combo.setEditable(true);
        C_Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));
        C_Combo.setSelectedIndex(2);
        C_Combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C_ComboActionPerformed(evt);
            }
        });

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("C");

        C_Frequency.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        C_Frequency.setForeground(new java.awt.Color(255, 255, 255));
        C_Frequency.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        C_Frequency.setText("C");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(C_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(C_Frequency, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(C_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(C_Frequency))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(34, 38, 41));

        D_Combo.setBackground(new java.awt.Color(107, 110, 112));
        D_Combo.setEditable(true);
        D_Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));
        D_Combo.setSelectedIndex(3);
        D_Combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D_ComboActionPerformed(evt);
            }
        });

        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("D");

        D_Frequency.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        D_Frequency.setForeground(new java.awt.Color(255, 255, 255));
        D_Frequency.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        D_Frequency.setText("D");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(D_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(D_Frequency, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(D_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(D_Frequency))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(34, 38, 41));

        E_Combo.setBackground(new java.awt.Color(107, 110, 112));
        E_Combo.setEditable(true);
        E_Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));
        E_Combo.setSelectedIndex(4);
        E_Combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E_ComboActionPerformed(evt);
            }
        });

        E_Frequency.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        E_Frequency.setForeground(new java.awt.Color(255, 255, 255));
        E_Frequency.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        E_Frequency.setText("E");

        jLabel65.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel65.setText("E");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(E_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(E_Frequency, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(E_Frequency)
                    .addComponent(E_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel65))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(34, 38, 41));

        F_Combo.setBackground(new java.awt.Color(107, 110, 112));
        F_Combo.setEditable(true);
        F_Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));
        F_Combo.setSelectedIndex(5);
        F_Combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F_ComboActionPerformed(evt);
            }
        });

        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("F");

        F_Frequency.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        F_Frequency.setForeground(new java.awt.Color(255, 255, 255));
        F_Frequency.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        F_Frequency.setText("F");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(F_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(F_Frequency, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(F_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(F_Frequency))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(34, 38, 41));

        G_Combo.setBackground(new java.awt.Color(107, 110, 112));
        G_Combo.setEditable(true);
        G_Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));
        G_Combo.setSelectedIndex(6);
        G_Combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G_ComboActionPerformed(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("G");

        G_Frequency.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        G_Frequency.setForeground(new java.awt.Color(255, 255, 255));
        G_Frequency.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        G_Frequency.setText("G");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(G_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(G_Frequency, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(G_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G_Frequency))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(34, 38, 41));

        H_Combo.setBackground(new java.awt.Color(107, 110, 112));
        H_Combo.setEditable(true);
        H_Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));
        H_Combo.setSelectedIndex(7);
        H_Combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H_ComboActionPerformed(evt);
            }
        });

        jLabel48.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("H");

        H_Frequency.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        H_Frequency.setForeground(new java.awt.Color(255, 255, 255));
        H_Frequency.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        H_Frequency.setText("H");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(H_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(H_Frequency, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(H_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H_Frequency))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(34, 38, 41));

        I_Combo.setBackground(new java.awt.Color(107, 110, 112));
        I_Combo.setEditable(true);
        I_Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));
        I_Combo.setSelectedIndex(8);
        I_Combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I_ComboActionPerformed(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("I");

        I_Frequency.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        I_Frequency.setForeground(new java.awt.Color(255, 255, 255));
        I_Frequency.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        I_Frequency.setText("I");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(I_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(I_Frequency, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(I_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(I_Frequency))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(34, 38, 41));

        J_Combo.setBackground(new java.awt.Color(107, 110, 112));
        J_Combo.setEditable(true);
        J_Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));
        J_Combo.setSelectedIndex(9);
        J_Combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_ComboActionPerformed(evt);
            }
        });

        jLabel50.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("J");

        J_Frequency.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        J_Frequency.setForeground(new java.awt.Color(255, 255, 255));
        J_Frequency.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        J_Frequency.setText("J");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(J_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(J_Frequency, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(J_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(J_Frequency))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel11.setBackground(new java.awt.Color(34, 38, 41));

        L_Combo.setBackground(new java.awt.Color(107, 110, 112));
        L_Combo.setEditable(true);
        L_Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));
        L_Combo.setSelectedIndex(11);
        L_Combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L_ComboActionPerformed(evt);
            }
        });

        jLabel51.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("L");

        L_Frequency.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        L_Frequency.setForeground(new java.awt.Color(255, 255, 255));
        L_Frequency.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L_Frequency.setText("L");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L_Frequency, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(L_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L_Frequency))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(34, 38, 41));

        K_Combo.setBackground(new java.awt.Color(107, 110, 112));
        K_Combo.setEditable(true);
        K_Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));
        K_Combo.setSelectedIndex(10);
        K_Combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                K_ComboActionPerformed(evt);
            }
        });

        jLabel52.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("K");

        K_Frequency.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        K_Frequency.setForeground(new java.awt.Color(255, 255, 255));
        K_Frequency.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        K_Frequency.setText("K");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(K_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(K_Frequency, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(K_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(K_Frequency))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color(34, 38, 41));

        M_Combo.setBackground(new java.awt.Color(107, 110, 112));
        M_Combo.setEditable(true);
        M_Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));
        M_Combo.setSelectedIndex(12);
        M_Combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M_ComboActionPerformed(evt);
            }
        });

        jLabel53.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setText("M");

        M_Frequency.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        M_Frequency.setForeground(new java.awt.Color(255, 255, 255));
        M_Frequency.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        M_Frequency.setText("M");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(M_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(M_Frequency, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(M_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M_Frequency))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout LetterMappingPanelAMLayout = new javax.swing.GroupLayout(LetterMappingPanelAM);
        LetterMappingPanelAM.setLayout(LetterMappingPanelAMLayout);
        LetterMappingPanelAMLayout.setHorizontalGroup(
            LetterMappingPanelAMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetterMappingPanelAMLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LetterMappingPanelAMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        LetterMappingPanelAMLayout.setVerticalGroup(
            LetterMappingPanelAMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetterMappingPanelAMLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        LetterMappingPanelMZ.setBackground(new java.awt.Color(39, 39, 39));

        jPanel14.setBackground(new java.awt.Color(34, 38, 41));

        N_Combo.setBackground(new java.awt.Color(107, 110, 112));
        N_Combo.setEditable(true);
        N_Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));
        N_Combo.setSelectedIndex(13);
        N_Combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N_ComboActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("N");

        N_Frequency.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        N_Frequency.setForeground(new java.awt.Color(255, 255, 255));
        N_Frequency.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        N_Frequency.setText("N");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(N_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(N_Frequency, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(N_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(N_Frequency))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel15.setBackground(new java.awt.Color(34, 38, 41));

        O_Combo.setBackground(new java.awt.Color(34, 38, 41));
        O_Combo.setEditable(true);
        O_Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));
        O_Combo.setSelectedIndex(14);
        O_Combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                O_ComboActionPerformed(evt);
            }
        });

        O_Frequency.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        O_Frequency.setForeground(new java.awt.Color(255, 255, 255));
        O_Frequency.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        O_Frequency.setText("O");

        O_Label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        O_Label.setForeground(new java.awt.Color(255, 255, 255));
        O_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        O_Label.setText("O");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(O_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(O_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(O_Frequency, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(O_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(O_Frequency)
                    .addComponent(O_Label))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel16.setBackground(new java.awt.Color(34, 38, 41));

        P_Combo.setBackground(new java.awt.Color(107, 110, 112));
        P_Combo.setEditable(true);
        P_Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));
        P_Combo.setSelectedIndex(15);
        P_Combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P_ComboActionPerformed(evt);
            }
        });

        jLabel54.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText("P");

        P_Frequency.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        P_Frequency.setForeground(new java.awt.Color(255, 255, 255));
        P_Frequency.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        P_Frequency.setText("P");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(P_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(P_Frequency, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(P_Combo)
                    .addComponent(P_Frequency))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel17.setBackground(new java.awt.Color(34, 38, 41));

        Q_Combo.setBackground(new java.awt.Color(107, 110, 112));
        Q_Combo.setEditable(true);
        Q_Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));
        Q_Combo.setSelectedIndex(16);
        Q_Combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Q_ComboActionPerformed(evt);
            }
        });

        jLabel55.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setText("Q");

        Q_Frequency.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Q_Frequency.setForeground(new java.awt.Color(255, 255, 255));
        Q_Frequency.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Q_Frequency.setText("Q");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Q_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Q_Frequency, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(Q_Combo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Q_Frequency))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel18.setBackground(new java.awt.Color(34, 38, 41));

        R_Combo.setBackground(new java.awt.Color(107, 110, 112));
        R_Combo.setEditable(true);
        R_Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));
        R_Combo.setSelectedIndex(17);
        R_Combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R_ComboActionPerformed(evt);
            }
        });

        jLabel56.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setText("R");

        R_Frequency.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        R_Frequency.setForeground(new java.awt.Color(255, 255, 255));
        R_Frequency.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        R_Frequency.setText("R");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(R_Frequency, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(R_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R_Frequency))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel19.setBackground(new java.awt.Color(34, 38, 41));

        S_Combo.setBackground(new java.awt.Color(107, 110, 112));
        S_Combo.setEditable(true);
        S_Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));
        S_Combo.setSelectedIndex(18);
        S_Combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S_ComboActionPerformed(evt);
            }
        });

        S_Frequency.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        S_Frequency.setForeground(new java.awt.Color(255, 255, 255));
        S_Frequency.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        S_Frequency.setText("S");

        S_Label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        S_Label.setForeground(new java.awt.Color(255, 255, 255));
        S_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        S_Label.setText("S");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(S_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(S_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(S_Frequency, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(S_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(S_Frequency))
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(S_Label)))
                .addContainerGap())
        );

        jPanel20.setBackground(new java.awt.Color(34, 38, 41));

        T_Combo.setBackground(new java.awt.Color(107, 110, 112));
        T_Combo.setEditable(true);
        T_Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));
        T_Combo.setSelectedIndex(19);
        T_Combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T_ComboActionPerformed(evt);
            }
        });

        T_Frequency.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        T_Frequency.setForeground(new java.awt.Color(255, 255, 255));
        T_Frequency.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T_Frequency.setText("T");

        T_Label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        T_Label.setForeground(new java.awt.Color(255, 255, 255));
        T_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        T_Label.setText("T");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(T_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(T_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(T_Frequency, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(T_Frequency)
                    .addComponent(T_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T_Label))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel21.setBackground(new java.awt.Color(34, 38, 41));

        U_Combo.setBackground(new java.awt.Color(107, 110, 112));
        U_Combo.setEditable(true);
        U_Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));
        U_Combo.setSelectedIndex(20);
        U_Combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                U_ComboActionPerformed(evt);
            }
        });

        U_Frequency.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        U_Frequency.setForeground(new java.awt.Color(255, 255, 255));
        U_Frequency.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        U_Frequency.setText("U");

        U_Label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        U_Label.setForeground(new java.awt.Color(255, 255, 255));
        U_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        U_Label.setText("U");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(U_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(U_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(U_Frequency, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(U_Frequency)
                    .addComponent(U_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(U_Label))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel22.setBackground(new java.awt.Color(34, 38, 41));

        V_Combo.setBackground(new java.awt.Color(107, 110, 112));
        V_Combo.setEditable(true);
        V_Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));
        V_Combo.setSelectedIndex(21);
        V_Combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                V_ComboActionPerformed(evt);
            }
        });

        jLabel60.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel60.setText("V");

        V_Frequency.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        V_Frequency.setForeground(new java.awt.Color(255, 255, 255));
        V_Frequency.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        V_Frequency.setText("V");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(V_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(V_Frequency, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(V_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(V_Frequency))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel23.setBackground(new java.awt.Color(34, 38, 41));

        W_Combo.setBackground(new java.awt.Color(107, 110, 112));
        W_Combo.setEditable(true);
        W_Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));
        W_Combo.setSelectedIndex(22);
        W_Combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                W_ComboActionPerformed(evt);
            }
        });

        jLabel61.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel61.setText("W");

        W_Frequency.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        W_Frequency.setForeground(new java.awt.Color(255, 255, 255));
        W_Frequency.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        W_Frequency.setText("W");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(W_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(W_Frequency, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61)
                    .addComponent(W_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(W_Frequency))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel24.setBackground(new java.awt.Color(34, 38, 41));

        Y_Combo.setBackground(new java.awt.Color(107, 110, 112));
        Y_Combo.setEditable(true);
        Y_Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));
        Y_Combo.setSelectedIndex(24);
        Y_Combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Y_ComboActionPerformed(evt);
            }
        });

        jLabel62.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel62.setText("Y");

        Y_Frequency.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Y_Frequency.setForeground(new java.awt.Color(255, 255, 255));
        Y_Frequency.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Y_Frequency.setText("Y");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Y_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Y_Frequency, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62)
                    .addComponent(Y_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Y_Frequency))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel25.setBackground(new java.awt.Color(34, 38, 41));

        X_Combo.setBackground(new java.awt.Color(107, 110, 112));
        X_Combo.setEditable(true);
        X_Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));
        X_Combo.setSelectedIndex(23);
        X_Combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                X_ComboActionPerformed(evt);
            }
        });

        jLabel63.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel63.setText("X");

        X_Frequency.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        X_Frequency.setForeground(new java.awt.Color(255, 255, 255));
        X_Frequency.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        X_Frequency.setText("X");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(X_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(X_Frequency, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel63)
                    .addComponent(X_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(X_Frequency))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel26.setBackground(new java.awt.Color(34, 38, 41));

        Z_Combo.setBackground(new java.awt.Color(107, 110, 112));
        Z_Combo.setEditable(true);
        Z_Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z" }));
        Z_Combo.setSelectedIndex(25);
        Z_Combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Z_ComboActionPerformed(evt);
            }
        });

        jLabel64.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel64.setText("Z");

        Z_Frequency.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Z_Frequency.setForeground(new java.awt.Color(255, 255, 255));
        Z_Frequency.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Z_Frequency.setText("Z");

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel64, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Z_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Z_Frequency, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64)
                    .addComponent(Z_Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Z_Frequency))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout LetterMappingPanelMZLayout = new javax.swing.GroupLayout(LetterMappingPanelMZ);
        LetterMappingPanelMZ.setLayout(LetterMappingPanelMZLayout);
        LetterMappingPanelMZLayout.setHorizontalGroup(
            LetterMappingPanelMZLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetterMappingPanelMZLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LetterMappingPanelMZLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        LetterMappingPanelMZLayout.setVerticalGroup(
            LetterMappingPanelMZLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LetterMappingPanelMZLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PlaintextTextArea.setBackground(new java.awt.Color(46, 47, 48));
        PlaintextTextArea.setColumns(20);
        PlaintextTextArea.setForeground(new java.awt.Color(255, 255, 255));
        PlaintextTextArea.setLineWrap(true);
        PlaintextTextArea.setRows(5);
        PlaintextScrollPane.setViewportView(PlaintextTextArea);

        CiphertextTextArea.setBackground(new java.awt.Color(46, 47, 48));
        CiphertextTextArea.setColumns(20);
        CiphertextTextArea.setForeground(new java.awt.Color(255, 255, 255));
        CiphertextTextArea.setLineWrap(true);
        CiphertextTextArea.setRows(5);
        CiphertextTextArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CiphertextTextAreaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CiphertextTextAreaKeyTyped(evt);
            }
        });
        CiphertextScrollPane.setViewportView(CiphertextTextArea);

        UpdateButton.setBackground(new java.awt.Color(108, 42, 42));
        UpdateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UpdateButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UpdateButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UpdateButtonMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Update Mappings");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cryptanalyst/gui/img/Restart_32px.png"))); // NOI18N

        javax.swing.GroupLayout UpdateButtonLayout = new javax.swing.GroupLayout(UpdateButton);
        UpdateButton.setLayout(UpdateButtonLayout);
        UpdateButtonLayout.setHorizontalGroup(
            UpdateButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UpdateButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142))
        );
        UpdateButtonLayout.setVerticalGroup(
            UpdateButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpdateButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(UpdateButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TitleBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Separator, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CiphertextLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CiphertextScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(LetterMappingPanelAM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LetterMappingPanelMZ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(CalibrateButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(UpdateButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(16, 16, 16)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Separator1)
                    .addComponent(PlaintextLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PlaintextScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitleBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addComponent(PlaintextLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Separator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addComponent(CiphertextLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Separator, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(BackgroundLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(PlaintextScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BackgroundLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(CiphertextScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LetterMappingPanelAM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LetterMappingPanelMZ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(UpdateButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CalibrateButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, 1451, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void C_ComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C_ComboActionPerformed
    }//GEN-LAST:event_C_ComboActionPerformed

    private void B_ComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_ComboActionPerformed
    }//GEN-LAST:event_B_ComboActionPerformed

    private void A_ComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A_ComboActionPerformed
    }//GEN-LAST:event_A_ComboActionPerformed

    private void CalibrateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CalibrateButtonMouseClicked
        String ciphertext = CiphertextTextArea.getText();
        if (!ciphertext.isEmpty()) {
            cipher.setCalibratedFrequency(ciphertext);
            //cipher.initialMap();
            this.map = cipher.getCipherTextMapping();
            this.setMappings();
            this.setFrequencies();
        }
    }//GEN-LAST:event_CalibrateButtonMouseClicked

    private void D_ComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D_ComboActionPerformed
    }//GEN-LAST:event_D_ComboActionPerformed

    private void E_ComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E_ComboActionPerformed
    }//GEN-LAST:event_E_ComboActionPerformed

    private void F_ComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F_ComboActionPerformed
    }//GEN-LAST:event_F_ComboActionPerformed

    private void G_ComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G_ComboActionPerformed
    }//GEN-LAST:event_G_ComboActionPerformed

    private void H_ComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H_ComboActionPerformed
    }//GEN-LAST:event_H_ComboActionPerformed

    private void I_ComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I_ComboActionPerformed
    }//GEN-LAST:event_I_ComboActionPerformed

    private void J_ComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_ComboActionPerformed
    }//GEN-LAST:event_J_ComboActionPerformed

    private void L_ComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L_ComboActionPerformed
    }//GEN-LAST:event_L_ComboActionPerformed

    private void K_ComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_K_ComboActionPerformed
    }//GEN-LAST:event_K_ComboActionPerformed

    private void M_ComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M_ComboActionPerformed
    }//GEN-LAST:event_M_ComboActionPerformed

    private void N_ComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N_ComboActionPerformed
    }//GEN-LAST:event_N_ComboActionPerformed

    private void O_ComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_O_ComboActionPerformed
    }//GEN-LAST:event_O_ComboActionPerformed

    private void P_ComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P_ComboActionPerformed
    }//GEN-LAST:event_P_ComboActionPerformed

    private void Q_ComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Q_ComboActionPerformed
    }//GEN-LAST:event_Q_ComboActionPerformed

    private void R_ComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R_ComboActionPerformed
    }//GEN-LAST:event_R_ComboActionPerformed

    private void S_ComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S_ComboActionPerformed
    }//GEN-LAST:event_S_ComboActionPerformed

    private void T_ComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T_ComboActionPerformed
    }//GEN-LAST:event_T_ComboActionPerformed

    private void U_ComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_U_ComboActionPerformed
    }//GEN-LAST:event_U_ComboActionPerformed

    private void V_ComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_V_ComboActionPerformed
    }//GEN-LAST:event_V_ComboActionPerformed

    private void W_ComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_W_ComboActionPerformed
    }//GEN-LAST:event_W_ComboActionPerformed

    private void Y_ComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Y_ComboActionPerformed
    }//GEN-LAST:event_Y_ComboActionPerformed

    private void X_ComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_X_ComboActionPerformed
    }//GEN-LAST:event_X_ComboActionPerformed

    private void Z_ComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Z_ComboActionPerformed
    }//GEN-LAST:event_Z_ComboActionPerformed

    private void CiphertextTextAreaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CiphertextTextAreaKeyTyped

    }//GEN-LAST:event_CiphertextTextAreaKeyTyped

    private void CiphertextTextAreaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CiphertextTextAreaKeyReleased
        String ciphertext = CiphertextTextArea.getText();
        if (!ciphertext.isEmpty()) {
            cipher.setCipherText(ciphertext);
            PlaintextTextArea.setText(cipher.Decode());
            this.map = cipher.getCipherTextMapping();
            this.setMappings();
            this.setFrequencies();
        }
    }//GEN-LAST:event_CiphertextTextAreaKeyReleased

    private void A_ComboInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_A_ComboInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_A_ComboInputMethodTextChanged

    private void A_ComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_A_ComboItemStateChanged

    }//GEN-LAST:event_A_ComboItemStateChanged

    private void A_ComboMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A_ComboMouseExited

    }//GEN-LAST:event_A_ComboMouseExited

    private void CalibrateButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CalibrateButtonMouseEntered
        CalibrateButton.setBackground(Hover);
    }//GEN-LAST:event_CalibrateButtonMouseEntered

    private void CalibrateButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CalibrateButtonMouseExited
        CalibrateButton.setBackground(MediumRed);
    }//GEN-LAST:event_CalibrateButtonMouseExited

    private void UpdateButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateButtonMouseClicked
        this.update();
    }//GEN-LAST:event_UpdateButtonMouseClicked

    private void UpdateButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateButtonMouseEntered
        UpdateButton.setBackground(Hover);
    }//GEN-LAST:event_UpdateButtonMouseEntered

    private void UpdateButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateButtonMouseExited
        UpdateButton.setBackground(MediumRed);
    }//GEN-LAST:event_UpdateButtonMouseExited

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
            java.util.logging.Logger.getLogger(cryptanalystGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cryptanalystGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cryptanalystGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cryptanalystGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cryptanalystGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> A_Combo;
    private javax.swing.JLabel A_Frequency;
    private javax.swing.JComboBox<String> B_Combo;
    private javax.swing.JLabel B_Frequency;
    private javax.swing.JPanel Background;
    private javax.swing.JComboBox<String> C_Combo;
    private javax.swing.JLabel C_Frequency;
    private javax.swing.JPanel CalibrateButton;
    private javax.swing.JLabel CiphertextLabel;
    private javax.swing.JScrollPane CiphertextScrollPane;
    private javax.swing.JTextArea CiphertextTextArea;
    private javax.swing.JComboBox<String> D_Combo;
    private javax.swing.JLabel D_Frequency;
    private javax.swing.JComboBox<String> E_Combo;
    private javax.swing.JLabel E_Frequency;
    private javax.swing.JComboBox<String> F_Combo;
    private javax.swing.JLabel F_Frequency;
    private javax.swing.JComboBox<String> G_Combo;
    private javax.swing.JLabel G_Frequency;
    private javax.swing.JComboBox<String> H_Combo;
    private javax.swing.JLabel H_Frequency;
    private javax.swing.JComboBox<String> I_Combo;
    private javax.swing.JLabel I_Frequency;
    private javax.swing.JComboBox<String> J_Combo;
    private javax.swing.JLabel J_Frequency;
    private javax.swing.JComboBox<String> K_Combo;
    private javax.swing.JLabel K_Frequency;
    private javax.swing.JComboBox<String> L_Combo;
    private javax.swing.JLabel L_Frequency;
    private javax.swing.JPanel LetterMappingPanelAM;
    private javax.swing.JPanel LetterMappingPanelMZ;
    private javax.swing.JComboBox<String> M_Combo;
    private javax.swing.JLabel M_Frequency;
    private javax.swing.JComboBox<String> N_Combo;
    private javax.swing.JLabel N_Frequency;
    private javax.swing.JComboBox<String> O_Combo;
    private javax.swing.JLabel O_Frequency;
    private javax.swing.JLabel O_Label;
    private javax.swing.JComboBox<String> P_Combo;
    private javax.swing.JLabel P_Frequency;
    private javax.swing.JLabel PlaintextLabel;
    private javax.swing.JScrollPane PlaintextScrollPane;
    private javax.swing.JTextArea PlaintextTextArea;
    private javax.swing.JComboBox<String> Q_Combo;
    private javax.swing.JLabel Q_Frequency;
    private javax.swing.JComboBox<String> R_Combo;
    private javax.swing.JLabel R_Frequency;
    private javax.swing.JComboBox<String> S_Combo;
    private javax.swing.JLabel S_Frequency;
    private javax.swing.JLabel S_Label;
    private javax.swing.JSeparator Separator;
    private javax.swing.JSeparator Separator1;
    private javax.swing.JComboBox<String> T_Combo;
    private javax.swing.JLabel T_Frequency;
    private javax.swing.JLabel T_Label;
    private javax.swing.JPanel TitleBar;
    private javax.swing.JComboBox<String> U_Combo;
    private javax.swing.JLabel U_Frequency;
    private javax.swing.JLabel U_Label;
    private javax.swing.JPanel UpdateButton;
    private javax.swing.JComboBox<String> V_Combo;
    private javax.swing.JLabel V_Frequency;
    private javax.swing.JComboBox<String> W_Combo;
    private javax.swing.JLabel W_Frequency;
    private javax.swing.JComboBox<String> X_Combo;
    private javax.swing.JLabel X_Frequency;
    private javax.swing.JComboBox<String> Y_Combo;
    private javax.swing.JLabel Y_Frequency;
    private javax.swing.JComboBox<String> Z_Combo;
    private javax.swing.JLabel Z_Frequency;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
