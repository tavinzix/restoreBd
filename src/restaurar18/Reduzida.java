package restaurar18;

import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Reduzida extends javax.swing.JFrame {

    int flag = 0;
    boolean tempoFlag = false;

    public Reduzida() {
        initComponents();
        this.setLocationRelativeTo(null); //iniciar no centro
        this.setResizable(false);//tamanho fixo
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Quando fechar a janela, parar de executar o codigo
        this.setVisible(true); //deixar visivel
        this.setTitle("Restaura BD");
        tempo.setText("00:00:00");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        backup = new javax.swing.JTextField();
        selecionapsql = new javax.swing.JToggleButton();
        selecionapg = new javax.swing.JToggleButton();
        psql = new javax.swing.JTextField();
        pgrestore = new javax.swing.JTextField();
        senha = new javax.swing.JPasswordField();
        ip = new javax.swing.JTextField();
        base = new javax.swing.JTextField();
        selecionabkp = new javax.swing.JToggleButton();
        restaurar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultado = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        retirar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        tempo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Backup");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("psql.exe");

        backup.setEditable(false);

        selecionapsql.setText("..");
        selecionapsql.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionapsqlActionPerformed(evt);
            }
        });

        selecionapg.setText("..");
        selecionapg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionapgActionPerformed(evt);
            }
        });

        psql.setEditable(false);

        pgrestore.setEditable(false);

        senha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                senhaKeyPressed(evt);
            }
        });

        ip.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ip.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ipKeyPressed(evt);
            }
        });

        base.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                baseKeyPressed(evt);
            }
        });

        selecionabkp.setText("..");
        selecionabkp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionabkpActionPerformed(evt);
            }
        });

        restaurar.setText("Restaurar");
        restaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaurarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("pg_restore.exe");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Senha do banco");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("IP do banco");

        resultado.setEditable(false);
        resultado.setColumns(20);
        resultado.setRows(5);
        jScrollPane1.setViewportView(resultado);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Nome da base");

        retirar.setText("Retirar tabelas");
        retirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retirarActionPerformed(evt);
            }
        });

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        jLabel7.setText("Tempo de restauração:");

        tempo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(backup)
                                    .addComponent(pgrestore, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(selecionapg, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(selecionabkp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ip)
                                    .addComponent(base, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(psql, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(selecionapsql, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addComponent(retirar, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(restaurar)
                        .addGap(34, 34, 34)
                        .addComponent(cancelar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tempo, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(197, 197, 197))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tempo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selecionabkp)
                    .addComponent(backup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pgrestore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selecionapg))
                .addGap(18, 18, 18)
                .addComponent(retirar)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(base, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(psql, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selecionapsql))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(restaurar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selecionapsqlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionapsqlActionPerformed
        selecionaPsql();
    }//GEN-LAST:event_selecionapsqlActionPerformed

    private void selecionapgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionapgActionPerformed
        selecionaPg();
    }//GEN-LAST:event_selecionapgActionPerformed

    private void senhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_senhaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                Restaurar();
            } catch (IOException ex) {
                Logger.getLogger(Reduzida.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_senhaKeyPressed

    private void ipKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ipKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            base.requestFocus();
        }
    }//GEN-LAST:event_ipKeyPressed

    private void baseKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_baseKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            selecionabkp.requestFocus();
        }
    }//GEN-LAST:event_baseKeyPressed

    private void selecionabkpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionabkpActionPerformed
        selecionaBackup();
    }//GEN-LAST:event_selecionabkpActionPerformed

    private void restaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaurarActionPerformed
        try {
            Restaurar();

        } catch (IOException ex) {
            Logger.getLogger(Reduzida.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_restaurarActionPerformed

    private void retirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retirarActionPerformed
        try {
            RetirarTabela();
        } catch (IOException ex) {
            Logger.getLogger(Reduzida.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_retirarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        Cancelar();
    }//GEN-LAST:event_cancelarActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Reduzida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reduzida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reduzida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reduzida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reduzida().setVisible(true);
            }
        });
    }

    public File selecionaBackup() {
        JFileChooser chooser = new JFileChooser();
        UIManager.put("FileChooser.openDialogTitleText", "Seleçao de aquivos");
        UIManager.put("FileChooser.lookInLabelText", "Local");
        UIManager.put("FileChooser.openButtonText", "Abrir");
        UIManager.put("FileChooser.cancelButtonText", "Sair");
        UIManager.put("FileChooser.fileNameLabelText", "Nome do Arquivo");
        UIManager.put("FileChooser.filesOfTypeLabelText", "Tipo de Arquivo");
        UIManager.put("FileChooser.openButtonToolTipText", "Abrir Selecionado");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("backup ou bkp", "backup", "bkp");

        chooser.setFileFilter(filter);

        int retorno = chooser.showOpenDialog(null);

        File caminho = chooser.getSelectedFile().getAbsoluteFile();

        if (retorno == JFileChooser.APPROVE_OPTION) {
            this.backup.setText(String.valueOf(caminho));
        }
        return null;
    }

    public void selecionaPg() {
        JFileChooser chooser = new JFileChooser();
        UIManager.put("FileChooser.openDialogTitleText", "Seleçao de aquivos");
        UIManager.put("FileChooser.lookInLabelText", "Local");
        UIManager.put("FileChooser.openButtonText", "Abrir");
        UIManager.put("FileChooser.cancelButtonText", "Sair");
        UIManager.put("FileChooser.fileNameLabelText", "Nome do Arquivo");
        UIManager.put("FileChooser.filesOfTypeLabelText", "Tipo de Arquivo");
        UIManager.put("FileChooser.openButtonToolTipText", "Abrir Selecionado");
        chooser.addChoosableFileFilter(new javax.swing.filechooser.FileNameExtensionFilter(".exe", "exe"));

        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);

        int retorno = chooser.showOpenDialog(null);

        if (retorno == JFileChooser.APPROVE_OPTION) {
            File arquivoSelecionado = chooser.getSelectedFile();
            pgrestore.setText(arquivoSelecionado.getAbsolutePath());
        }
    }

    public void selecionaPsql() {
        JFileChooser chooser = new JFileChooser();
        UIManager.put("FileChooser.openDialogTitleText", "Seleçao de aquivos");
        UIManager.put("FileChooser.lookInLabelText", "Local");
        UIManager.put("FileChooser.openButtonText", "Abrir");
        UIManager.put("FileChooser.cancelButtonText", "Sair");
        UIManager.put("FileChooser.fileNameLabelText", "Nome do Arquivo");
        UIManager.put("FileChooser.filesOfTypeLabelText", "Tipo de Arquivo");
        UIManager.put("FileChooser.openButtonToolTipText", "Abrir Selecionado");
        chooser.addChoosableFileFilter(new javax.swing.filechooser.FileNameExtensionFilter(".exe", "exe"));

        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);

        int retorno = chooser.showOpenDialog(null);

        if (retorno == JFileChooser.APPROVE_OPTION) {
            File exe = chooser.getSelectedFile();
            psql.setText(exe.getAbsolutePath());
        }
    }

    public void Restaurar() throws IOException {
        if (ip.getText().matches("") || base.getText().matches("") || backup.getText().matches("")
                || pgrestore.getText().matches("") || senha.getText().matches("")) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos");
        } else {
            String caminhoPgRestore = pgrestore.getText().trim();
            String caminhoPsql = psql.getText().trim();

            File pgRestoreFile = new File(caminhoPgRestore);
            File psqlFile = new File(caminhoPsql);

            ProcessBuilder processoRestore = new ProcessBuilder();
            ProcessBuilder processoCreate = new ProcessBuilder();

            processoRestore.directory(pgRestoreFile.getParentFile());
            processoCreate.directory(psqlFile.getParentFile());

            List<String> comandoRestore = new ArrayList<>();
            comandoRestore.add(pgRestoreFile.getAbsolutePath());
            comandoRestore.add("--host");
            comandoRestore.add(ip.getText().trim());
            comandoRestore.add("--username");
            comandoRestore.add("postgres");
            comandoRestore.add("-O");
            comandoRestore.add("-L");
            comandoRestore.add("temp2.list");
            comandoRestore.add("-v");
            comandoRestore.add("--dbname");
            comandoRestore.add(base.getText().trim());
            comandoRestore.add(backup.getText().trim());

            String senhaT = this.senha.getText().trim();

            List<String> comandoCreate = new ArrayList<>();
            comandoCreate.add(psqlFile.getAbsolutePath());
            comandoCreate.add("--host");
            comandoCreate.add(ip.getText().trim());
            comandoCreate.add("--username");
            comandoCreate.add("postgres");
            comandoCreate.add("-c");
            comandoCreate.add("\"create database");
            comandoCreate.add(base.getText().trim() + "\"");

            System.out.println("Executando comando create: " + String.join(" ", comandoCreate));
            System.out.println("Executando comando restore: " + String.join(" ", comandoRestore));

            processoRestore.environment().put("PGPASSWORD", senhaT);
            processoCreate.environment().put("PGPASSWORD", senhaT);

            processoCreate.command("cmd.exe", "/c", String.join(" ", comandoCreate));
            processoRestore.command("cmd.exe", "/c", String.join(" ", comandoRestore));

            try {
                Process create = processoCreate.start();
                Thread.sleep(10000);
                Process process = processoRestore.start();
                Timer timer = new Timer();

                BufferedReader readerRestore = new BufferedReader(new InputStreamReader(process.getInputStream()));
                BufferedReader readerCreate = new BufferedReader(new InputStreamReader(create.getInputStream()));

                BufferedReader errorReaderRestore = new BufferedReader(new InputStreamReader(process.getErrorStream()));
                BufferedReader errorReaderCreate = new BufferedReader(new InputStreamReader(create.getErrorStream()));

                new Thread(() -> {
                    try {
                        String lineCreate;
                        String lineRestore;
                        String lineRestore2 = "";
                        restaurar.setEnabled(false);
                        retirar.setEnabled(false);
                        flag = 1;
                        tempoFlag = true;

                        while ((lineCreate = errorReaderCreate.readLine()) != null) {
                            resultado.setText(lineCreate);
                            this.resultado.setCaretPosition(this.resultado.getDocument().getLength());
                        }

                        while ((lineRestore = errorReaderRestore.readLine()) != null) {
                            lineRestore2 += lineRestore + "\n";
                            resultado.setText(lineRestore2);
                            this.resultado.setCaretPosition(this.resultado.getDocument().getLength());
                            //System.out.println("RESTORE erro" + flag);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    } finally {
                        flag = 0;
                        tempoFlag = false;
                        restaurar.setEnabled(true);
                        retirar.setEnabled(true);
                    }
                }).start();

                new Thread(() -> {
                    while (tempoFlag) {
                        tempo.setText(timer.toString(true));
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }).start();

                new Thread(() -> {
                    try {
                        String lineCreate;
                        String lineRestore;
                        String lineRestore2 = "";
                        restaurar.setEnabled(false);
                        retirar.setEnabled(false);
                        flag = 1;
                        tempoFlag = true;

                        while ((lineCreate = readerCreate.readLine()) != null) {
                            resultado.setText(lineCreate);
                            this.resultado.setCaretPosition(this.resultado.getDocument().getLength());
                        }

                        while ((lineRestore = readerRestore.readLine()) != null) {
                            lineRestore2 += lineRestore + "\n";
                            resultado.setText(lineRestore2);
                            this.resultado.setCaretPosition(this.resultado.getDocument().getLength());
                            System.out.println("RESTORE ok" + flag);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    } finally {
                        flag = 0;
                        tempoFlag = false;
                        restaurar.setEnabled(true);
                        retirar.setEnabled(true);
                    }
                }).start();

            } catch (IOException | InterruptedException ex) {
                Logger.getLogger(Completa.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void RetirarTabela() throws IOException {
        if (backup.getText().matches("") || pgrestore.getText().matches("")) {
            JOptionPane.showMessageDialog(null, "Preencha o backup e o pg_restore");
        } else {
            String caminhoPgRestore = pgrestore.getText().trim();
            File pgRestoreFile = new File(caminhoPgRestore);
            ProcessBuilder processoList = new ProcessBuilder();
            processoList.directory(pgRestoreFile.getParentFile());
            List<String> comandoList = new ArrayList<>();
            comandoList.add(pgRestoreFile.getAbsolutePath());
            comandoList.add("--list");
            comandoList.add(backup.getText().trim());
            comandoList.add(">");
            comandoList.add("temp.list");
            System.out.println("Executando comando restore: " + String.join(" ", comandoList));
            processoList.command("cmd.exe", "/c", String.join(" ", comandoList));

            try {
                Process list = processoList.start();
                Thread.sleep(2000);
                new Retirar(caminhoPgRestore).setVisible(true);
                BufferedReader readerList = new BufferedReader(new InputStreamReader(list.getInputStream()));
                new Thread(() -> {
                    try {
                        String lineCreate;
                        restaurar.setEnabled(false);

                        while ((lineCreate = readerList.readLine()) != null) {
                            resultado.setText(lineCreate);
                            this.resultado.setCaretPosition(this.resultado.getDocument().getLength());
                        }
                    } catch (IOException e) {
                    }
                    restaurar.setEnabled(true);

                }).start();
            } catch (IOException | InterruptedException ex) {
                Logger.getLogger(Reduzida.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void Cancelar() {
        System.exit(0);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField backup;
    private javax.swing.JTextField base;
    private javax.swing.JButton cancelar;
    public javax.swing.JTextField ip;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField pgrestore;
    private javax.swing.JTextField psql;
    private javax.swing.JButton restaurar;
    private javax.swing.JTextArea resultado;
    private javax.swing.JButton retirar;
    private javax.swing.JToggleButton selecionabkp;
    private javax.swing.JToggleButton selecionapg;
    private javax.swing.JToggleButton selecionapsql;
    private javax.swing.JPasswordField senha;
    private javax.swing.JLabel tempo;
    // End of variables declaration//GEN-END:variables
}
