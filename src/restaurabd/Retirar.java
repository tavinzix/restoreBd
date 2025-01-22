package restaurabd;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Retirar extends JFrame {
    public Retirar(String pg_restore) {
        File file = new File(pg_restore);
        String caminhoDaPasta = file.getParent();

        setTitle("Exclusão de tabelas");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(600, 500);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        setIcon();
     
        JPanel tabelas = new JPanel();
        tabelas.setLayout(new BorderLayout());
        JLabel label1 = new JLabel("Tabelas");
        label1.setBorder(BorderFactory.createEmptyBorder(20, 75, 10, 10));
        tabelas.add(label1, BorderLayout.NORTH);

        JPanel tabelasExcluidas = new JPanel();
        tabelasExcluidas.setLayout(new BorderLayout());
        JLabel label2 = new JLabel("Tabelas Excluídas");
        label2.setBorder(BorderFactory.createEmptyBorder(20, 75, 10, 10));
        tabelasExcluidas.add(label2, BorderLayout.NORTH);

        DefaultListModel<String> listaTabelas = new DefaultListModel<>();
        JList<String> list1 = new JList<>(listaTabelas);
        JScrollPane scrollPane1 = new JScrollPane(list1);
        tabelas.add(scrollPane1, BorderLayout.CENTER);
        scrollPane1.setPreferredSize(new Dimension(200, scrollPane1.getPreferredSize().height));

        DefaultListModel<String> listaTabelasExcluidas = new DefaultListModel<>();
        JList<String> list2 = new JList<>(listaTabelasExcluidas);
        JScrollPane scrollPane2 = new JScrollPane(list2);
        tabelasExcluidas.add(scrollPane2, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.X_AXIS));
        mainPanel.add(tabelas);
        mainPanel.add(buttonPanel);
        mainPanel.add(tabelasExcluidas);

        add(mainPanel, BorderLayout.CENTER);

        JPanel savePanel = new JPanel();
        add(savePanel, BorderLayout.SOUTH);
        savePanel.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 70));

        JButton adicionar = new JButton("->");
        adicionar.setFont(new Font("Tahoma", Font.BOLD, 16));

        adicionar.addActionListener((ActionEvent e) -> {
            for (String selectedValue : list1.getSelectedValuesList()) {
                listaTabelasExcluidas.addElement(selectedValue);
                listaTabelas.removeElement(selectedValue);
                System.out.println(selectedValue);
            }
        });

        JButton voltar = new JButton("<-");
        voltar.setFont(new Font("Tahoma", Font.BOLD, 16));

        voltar.addActionListener((ActionEvent e) -> {
            for (String selectedValue : list2.getSelectedValuesList()) {

                listaTabelas.addElement(selectedValue);
                listaTabelasExcluidas.removeElement(selectedValue);

                System.out.println(selectedValue);
                System.out.println(caminhoDaPasta);
            }
        });

        JButton salvar = new JButton("Salvar");
        salvar.setFont(new Font("Tahoma", Font.BOLD, 16));

        salvar.addActionListener((ActionEvent e) -> {

            FileReader fileReader = null;
            FileWriter fileWriter = null;
            BufferedReader leitor = null;

            String original = caminhoDaPasta + "\\temp.list";
            String modificado = caminhoDaPasta + "\\temp2.list";
            String line;

            try {
                fileReader = new FileReader(new File(original));
                fileWriter = new FileWriter(new File(modificado));
                leitor = new BufferedReader(fileReader);
                line = "";

                while ((line = leitor.readLine()) != null) {
                    boolean excluirLinha = false;

                    for (int i = 0; i < listaTabelasExcluidas.getSize(); i++) {
                        String tabela = (String) listaTabelasExcluidas.getElementAt(i);
                        String texto = " TABLE DATA public " + tabela;
                        if (line.trim().contains(texto.trim())) {
                            excluirLinha = true;
                            break;
                        }
                    }

                    if (!excluirLinha) {
                        fileWriter.write(line + "\r\n");
                    }
                }
                dispose();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Retirar.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Retirar.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    if (fileWriter != null) {
                        fileWriter.close();

                    }
                    if (fileReader != null) {
                        fileReader.close();

                    }
                } catch (IOException ex) {
                    Logger.getLogger(Retirar.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });

        buttonPanel.add(adicionar);
        buttonPanel.add(voltar);
        savePanel.add(salvar);
        carregarDadosDoArquivo(listaTabelas, caminhoDaPasta);

    }

    private void carregarDadosDoArquivo(DefaultListModel<String> listaTabelas, String caminhoDaPasta) {
        File arquivo = new File(caminhoDaPasta, "temp.list");

        try ( BufferedReader br = new BufferedReader(new FileReader(arquivo))) {

            String line;
            listaTabelas.clear();

            while ((line = br.readLine()) != null) {
                String[] partes = line.split(" TABLE DATA public ");

                if (partes.length > 1) {
                    String texto = partes[1];
                    try {
                        String fim = texto.substring(0, texto.length() - 8);
                        listaTabelas.addElement(fim);
                    } catch (Exception e) {
                    }
                }
            }
        } catch (IOException e) {
        }
    }

    public static void main(String[] args) {

    }
    
    public void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("ico.png")));
    }
    
}
