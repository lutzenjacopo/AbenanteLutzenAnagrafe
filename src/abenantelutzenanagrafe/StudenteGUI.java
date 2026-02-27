/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package abenantelutzenanagrafe;

public class StudenteGUI extends javax.swing.JFrame {

    // ✅ Riferimento alla finestra principale per aggiornare la tabella
    private AnagrafeGUI anagrafeGUI;
    private Controlli c;

    public StudenteGUI(AnagrafeGUI anagrafeGUI) {
        this.anagrafeGUI = anagrafeGUI;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        txtMatricola = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtCognome = new javax.swing.JTextField();
        txtAnno = new javax.swing.JTextField();
        lblMatricola = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblCognome = new javax.swing.JLabel();
        lblAnno = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnAggiungi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblMatricola.setFont(new java.awt.Font("Lucida Bright", 0, 12));
        lblMatricola.setText("Matricola");
        lblNome.setFont(new java.awt.Font("Lucida Bright", 0, 12));
        lblNome.setText("Nome");
        lblCognome.setFont(new java.awt.Font("Lucida Bright", 0, 12));
        lblCognome.setText("Cognome");
        lblAnno.setFont(new java.awt.Font("Lucida Bright", 0, 12));
        lblAnno.setText("Anno");
        jLabel5.setFont(new java.awt.Font("Lucida Bright", 1, 24));
        jLabel5.setText("Dati dello studente");

        btnAggiungi.setFont(new java.awt.Font("Lucida Bright", 2, 12));
        btnAggiungi.setText("Aggiungi");
        btnAggiungi.addActionListener(evt -> btnAggiungiActionPerformed(evt));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68,68,68).addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38,38,38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMatricola,javax.swing.GroupLayout.PREFERRED_SIZE,64,javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNome,javax.swing.GroupLayout.PREFERRED_SIZE,37,javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCognome,javax.swing.GroupLayout.PREFERRED_SIZE,84,javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAnno,javax.swing.GroupLayout.PREFERRED_SIZE,37,javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40,40,40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMatricola,javax.swing.GroupLayout.PREFERRED_SIZE,71,javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCognome,javax.swing.GroupLayout.PREFERRED_SIZE,71,javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNome,javax.swing.GroupLayout.PREFERRED_SIZE,71,javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAnno,javax.swing.GroupLayout.PREFERRED_SIZE,71,javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(94,Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0,0,Short.MAX_VALUE).addComponent(btnAggiungi).addGap(28,28,28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap().addComponent(jLabel5).addGap(37,37,37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMatricola,javax.swing.GroupLayout.PREFERRED_SIZE,javax.swing.GroupLayout.DEFAULT_SIZE,javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMatricola))
                .addGap(18,18,18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome,javax.swing.GroupLayout.PREFERRED_SIZE,javax.swing.GroupLayout.DEFAULT_SIZE,javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome))
                .addGap(18,18,18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCognome,javax.swing.GroupLayout.PREFERRED_SIZE,javax.swing.GroupLayout.DEFAULT_SIZE,javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCognome))
                .addGap(18,18,18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAnno,javax.swing.GroupLayout.PREFERRED_SIZE,javax.swing.GroupLayout.DEFAULT_SIZE,javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAnno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,javax.swing.GroupLayout.DEFAULT_SIZE,Short.MAX_VALUE)
                .addComponent(btnAggiungi,javax.swing.GroupLayout.PREFERRED_SIZE,65,javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20,20,20))
        );
        pack();
    }

    private void btnAggiungiActionPerformed(java.awt.event.ActionEvent evt) {
        String matricola = txtMatricola.getText().trim();
        String nome = txtNome.getText().trim();
        String cognome = txtCognome.getText().trim();
        String anno = txtAnno.getText().trim();
        
        if (!c.controlloInt(txtAnno.getText().trim())){
            javax.swing.JOptionPane.showMessageDialog(this, "Errore: L'anno inserito non è un numero valido!");
            return;
        }
        if (c.controlloString(txtNome.getText().trim())){
            javax.swing.JOptionPane.showMessageDialog(this, "Errore: Il nome inserito non è un valore valido!");
            return;
        }
        if (c.controlloString(txtCognome.getText().trim())){
            javax.swing.JOptionPane.showMessageDialog(this, "Errore: Il cognome inserito non è un valore valido!");
            return;
        }
        
        if (!c.controlloNull(txtMatricola.getText().trim())||!c.controlloNull(txtNome.getText().trim())||!c.controlloNull(txtCognome.getText().trim())||!c.controlloNull(txtAnno.getText().trim())){
            javax.swing.JOptionPane.showMessageDialog(this, "Compila tutti i campi!");
            return;
        }

        Studente s = new Studente(matricola, nome, cognome, anno);

        // ✅ Usiamo l'anagrafeCondivisa (non una nuova Anagrafe!)
        boolean aggiunto = AnagrafeGUI.a.aggiungiStudente(s);

        if (aggiunto) {
            // ✅ Aggiorniamo la tabella nella finestra principale
            anagrafeGUI.aggiornaTabella();
            javax.swing.JOptionPane.showMessageDialog(this, "Studente aggiunto con successo!");
            // Puliamo i campi
            txtMatricola.setText("");
            txtNome.setText("");
            txtCognome.setText("");
            txtAnno.setText("");
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Matricola già esistente!");
        }
    }

    private javax.swing.JButton btnAggiungi;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblAnno;
    private javax.swing.JLabel lblCognome;
    private javax.swing.JLabel lblMatricola;
    private javax.swing.JLabel lblNome;
    private javax.swing.JTextField txtAnno;
    private javax.swing.JTextField txtCognome;
    private javax.swing.JTextField txtMatricola;
    private javax.swing.JTextField txtNome;
}