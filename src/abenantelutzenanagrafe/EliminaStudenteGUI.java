/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package abenantelutzenanagrafe;

public class EliminaStudenteGUI extends javax.swing.JFrame {

    private AnagrafeGUI anagrafeGUI;

    public EliminaStudenteGUI(AnagrafeGUI anagrafeGUI) {
        this.anagrafeGUI = anagrafeGUI;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        lblMatricola = new javax.swing.JLabel();
        txtMatricola = new javax.swing.JTextField();
        btnElimina = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblMatricola.setFont(new java.awt.Font("Lucida Bright", 0, 12));
        lblMatricola.setText("Matricola dello studente");

        btnElimina.setBackground(new java.awt.Color(204, 0, 0));
        btnElimina.setFont(new java.awt.Font("Lucida Bright", 1, 12));
        btnElimina.setText("Elimina");
        btnElimina.addActionListener(evt -> btnEliminaActionPerformed(evt));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18,18,18).addComponent(lblMatricola)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,40,Short.MAX_VALUE)
                .addComponent(txtMatricola,javax.swing.GroupLayout.PREFERRED_SIZE,71,javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31,31,31))
            .addGroup(layout.createSequentialGroup()
                .addGap(105,105,105)
                .addComponent(btnElimina,javax.swing.GroupLayout.PREFERRED_SIZE,86,javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60,60,60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMatricola)
                    .addComponent(txtMatricola,javax.swing.GroupLayout.PREFERRED_SIZE,javax.swing.GroupLayout.DEFAULT_SIZE,javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,71,Short.MAX_VALUE)
                .addComponent(btnElimina,javax.swing.GroupLayout.PREFERRED_SIZE,44,javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41,41,41))
        );
        pack();
    }

    private void btnEliminaActionPerformed(java.awt.event.ActionEvent evt) {
        String matricola = txtMatricola.getText().trim();
        if (matricola.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Inserisci una matricola!");
            return;
        }

        // ✅ Usiamo l'anagrafeCondivisa
        boolean eliminato = AnagrafeGUI.a.eliminaStudente(matricola);
        if (eliminato) {
            anagrafeGUI.aggiornaTabella();
            javax.swing.JOptionPane.showMessageDialog(this, "Studente eliminato!");
            txtMatricola.setText("");
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Matricola non trovata!");
        }
    }

    private javax.swing.JButton btnElimina;
    private javax.swing.JLabel lblMatricola;
    private javax.swing.JTextField txtMatricola;
}