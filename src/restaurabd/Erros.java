package restaurabd;

import java.awt.Toolkit;
import java.util.List;
import javax.swing.JFrame;

public class Erros extends javax.swing.JFrame {

    public Erros(List<String> errorLines) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setTitle("Erros da restauração");
        setIcon();
        mostraErros(errorLines);
    }
    
      public void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("ico.png")));
    }

    private Erros() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        viewErro = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        viewErro.setEditable(false);
        viewErro.setColumns(20);
        viewErro.setRows(5);
        jScrollPane1.setViewportView(viewErro);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Erros().setVisible(true);
            }
        }
        );
    }

    private void mostraErros(List<String> errorLines) {
        String errorLine2 = "";

        for (String errorLine : errorLines) {
            errorLine2 += errorLine + "\n";
            viewErro.setText(errorLine2);
            this.viewErro.setCaretPosition(this.viewErro.getDocument().getLength());
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea viewErro;
    // End of variables declaration//GEN-END:variables
}
