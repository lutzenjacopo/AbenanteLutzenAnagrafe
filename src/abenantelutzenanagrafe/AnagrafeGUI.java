/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package abenantelutzenanagrafe;
import java.util.*;
import javax.swing.table.DefaultTableModel;

public class AnagrafeGUI extends javax.swing.JFrame {

    //  Anagrafe condivisa tra tutte le finestre
    public static Anagrafe a = new Anagrafe();

    private static final java.util.logging.Logger logger =
        java.util.logging.Logger.getLogger(AnagrafeGUI.class.getName());

    public AnagrafeGUI() {
        initComponents();
        String[] colonne = {"Matricola", "Nome", "Cognome", "Anno"};//cambia i nomi delle colonne della tabella JTable
        DefaultTableModel model = new DefaultTableModel(colonne, 0);
        tblAnagrafe.setModel(model);
    }

    // Metodo pubblico per aggiornare la tabella dall'esterno (es. StudenteGUI)
    public void aggiornaTabella() {
        DefaultTableModel model = (DefaultTableModel) tblAnagrafe.getModel();
        model.setRowCount(0);
        for (Studente s : a.getTuttiStudenti()) {
            Object[] riga = {s.getMatricola(), s.getNome(), s.getCognome(), s.getAnno()};
            model.addRow(riga);
        }
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        btnCercaStudente = new javax.swing.JButton();
        btnElimina = new javax.swing.JButton();
        btnStudenteGUI = new javax.swing.JButton();
        btnCarica = new javax.swing.JButton();
        btnSalva = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAnagrafe = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCercaStudente.setBackground(new java.awt.Color(153, 153, 255));
        btnCercaStudente.setText("Cerca Studente");
        btnCercaStudente.addActionListener(evt -> btnCercaStudenteActionPerformed(evt));

        btnElimina.setBackground(new java.awt.Color(153, 153, 255));
        btnElimina.setText("Elimina Studente");
        btnElimina.addActionListener(evt -> btnEliminaActionPerformed(evt));

        btnStudenteGUI.setBackground(new java.awt.Color(153, 153, 255));
        btnStudenteGUI.setText("Aggiungi Studente");
        btnStudenteGUI.addActionListener(evt -> btnStudenteGUIActionPerformed(evt));

        btnCarica.setBackground(new java.awt.Color(153, 153, 255));
        btnCarica.setText("Carica File");
        btnCarica.addActionListener(evt -> btnCaricaActionPerformed(evt));

        btnSalva.setBackground(new java.awt.Color(153, 153, 255));
        btnSalva.setText("Salva File");
        btnSalva.addActionListener(evt -> btnSalvaActionPerformed(evt));

        tblAnagrafe.setBackground(new java.awt.Color(153, 204, 255));
        tblAnagrafe.setModel(new DefaultTableModel(
            new Object[][]{},
            new String[]{"Matricola", "Nome", "Cognome", "Anno"}
        ));
        jScrollPane1.setViewportView(tblAnagrafe);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61,61,61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCarica).addComponent(btnSalva))
                        .addGap(41,41,41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnStudenteGUI).addGap(21,21,21))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnElimina).addGap(30,30,30))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnCercaStudente, javax.swing.GroupLayout.PREFERRED_SIZE,130,javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33,33,33)))))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE,javax.swing.GroupLayout.DEFAULT_SIZE,javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0,16,Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36,36,36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE,javax.swing.GroupLayout.DEFAULT_SIZE,javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCercaStudente, javax.swing.GroupLayout.PREFERRED_SIZE,60,javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29,29,29)
                        .addComponent(btnElimina, javax.swing.GroupLayout.PREFERRED_SIZE,60,javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25,25,25)
                        .addComponent(btnStudenteGUI, javax.swing.GroupLayout.PREFERRED_SIZE,60,javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38,38,38)
                        .addComponent(btnCarica, javax.swing.GroupLayout.PREFERRED_SIZE,60,javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33,33,33)
                        .addComponent(btnSalva, javax.swing.GroupLayout.PREFERRED_SIZE,60,javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65,Short.MAX_VALUE))
        );
        pack();
    }
/**
 * bottone carica 
 * @param evt 
 */
    private void btnCaricaActionPerformed(java.awt.event.ActionEvent evt) {
        GestioneFile gf = new GestioneFile();// cera un oggetto gestione File 
        ArrayList<Studente> lista = gf.caricaDaFile("studenti.txt"); //g
        a = new Anagrafe();
        for (Studente s : lista) {
            a.aggiungiStudente(s);// per ogni studente aggiunge lo studente 
        }
        aggiornaTabella();// aggiorna la tabella 
        javax.swing.JOptionPane.showMessageDialog(this, "Caricamento completato! " + lista.size() + " studenti caricati."); // mostra un messaggio se è stato finito il caricamento
    }

    
    /**
     * bottone che richiama la GUI dello studente per aggiumgerlo
     * @param evt 
     */
    private void btnStudenteGUIActionPerformed(java.awt.event.ActionEvent evt) {
        //  Passa 'this' così StudenteGUI può aggiornare la tabella
        StudenteGUI g = new StudenteGUI(this);
        g.setVisible(true);
    }
/**
 * bottone che salva  il file
 * @param evt 
 */
    private void btnSalvaActionPerformed(java.awt.event.ActionEvent evt) {
        GestioneFile gf = new GestioneFile();
        gf.salvaSuFile("studenti.txt", a.getTuttiStudenti());
        javax.swing.JOptionPane.showMessageDialog(this, "Salvataggio completato!"); // qando lo salva arriva il messagio Salvataggio completato
    }
/**
 * 
 * @param evt 
 */
    private void btnEliminaActionPerformed(java.awt.event.ActionEvent evt) {
        //Passa 'this' così EliminaStudenteGUI può aggiornare la tabella
        EliminaStudenteGUI g = new EliminaStudenteGUI(this);
        g.setVisible(true);
    }

    private void btnCercaStudenteActionPerformed(java.awt.event.ActionEvent evt) {
        CercaStudenteGUI g = new CercaStudenteGUI();
        g.setVisible(true);
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> new AnagrafeGUI().setVisible(true));
    }

    private javax.swing.JButton btnCarica;
    private javax.swing.JButton btnCercaStudente;
    private javax.swing.JButton btnElimina;
    private javax.swing.JButton btnSalva;
    private javax.swing.JButton btnStudenteGUI;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAnagrafe;
}