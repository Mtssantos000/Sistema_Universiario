/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author josejailtonjunior
 */
import java.awt.CardLayout;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    private void salvarAluno() {
        try {
            File fw = new File("Alunos.txt");
//    TRUE PARA NAO SOBRESCREVER OS ARQUIVOS
            FileWriter escrever = new FileWriter(fw, true);
            BufferedWriter org = new BufferedWriter(escrever);
            org.write(TxtRec_Mat1.getText());
            org.newLine();
            org.write(TxtRec_Nome1.getText());
            org.newLine();
            org.write(TxtRec_CPF2.getText());
            org.newLine();
            org.write(TxtRec_RG2.getText());
            org.newLine();
            org.write(TxtRec_End1.getText());
            org.newLine();
            org.write(TxtRec_Cidade1.getText());
            org.newLine();
            org.write(TxtRec_Bairro1.getText());
            org.newLine();
            org.write(TxtRec_DN2.getText());
            org.newLine();
            String course = "";
            if (curso.getSelectedIndex() == 1) {
                course = "1";
            }
            if (curso.getSelectedIndex() == 2) {
                course = "2";
            }
            if (curso.getSelectedIndex() == 3) {
                course = "3";
            }
            org.write(course);
            org.newLine();
            org.close();
            JOptionPane.showMessageDialog(null, "Aluno Cadastrado");
            TxtRec_Mat1.setText(null);
            TxtRec_Nome1.setText(null);
            TxtRec_CPF2.setText(null);
            TxtRec_RG2.setText(null);
            TxtRec_End1.setText(null);
            TxtRec_Cidade1.setText(null);
            TxtRec_Bairro1.setText(null);
            TxtRec_DN2.setText(null);
            curso.setSelectedIndex(0);

        }// TRYYYYYYYYYY
        catch (Exception erro) {

        }
    }

    private void salvarBolsista() {

        try {
            File fw = new File("Bolsista.txt");
//    TRUE PARA NAO SOBRESCREVER OS ARQUIVOS
            FileWriter escrever = new FileWriter(fw, true);
            BufferedWriter org = new BufferedWriter(escrever);
            org.write(TxRec_Mat.getText());
            org.newLine();
            org.write(TxRec_TituPro.getText());
            org.newLine();
            org.write(TxRec_Dura.getText());
            org.newLine();
            String course = "";
            if (TipoPro.getSelectedIndex() == 1) {
                course = "1";
            }
            if (TipoPro.getSelectedIndex() == 2) {
                course = "2";
            }
            if (TipoPro.getSelectedIndex() == 3) {
                course = "3";
            }
            org.write(course);
            org.newLine();
            org.close();
            JOptionPane.showMessageDialog(null, "Bolsista Cadastrado");
            TxRec_Mat.setText(null);
            TxRec_TituPro.setText(null);
            TxRec_Dura.setText(null);
            TipoPro.setSelectedIndex(0);
        }// TRYYYYYYYYYY
        catch (Exception erro) {

        }

    }

    private void salvarlivro(){
         try {
            File fw = new File("Livro.txt");
//    TRUE PARA NAO SOBRESCREVER OS ARQUIVOS
            FileWriter escrever = new FileWriter(fw, true);
            BufferedWriter org = new BufferedWriter(escrever);
            org.write(TxRec_Autor.getText());
            org.newLine();
            org.write(TxRec_Cod.getText());
            org.newLine();
            org.write(TxRec_Titu.getText());
            org.newLine();
            org.write(TxRec_Edi.getText());
            org.newLine();
            org.write(TxRec_Qua.getText());
            org.newLine();            
            org.close();
            JOptionPane.showMessageDialog(null, "Livro cadastrado");
            TxRec_Autor.setText(null);
            TxRec_Cod.setText(null);
            TxRec_Titu.setText(null);
            TxRec_Edi.setText(null);
            TxRec_Qua.setText(null);
        }// TRYYYYYYYYYY
        catch (Exception erro) {

        }
    }
    private void salvarProf() {
        try {
            File fw = new File("Prof.txt");
//    TRUE PARA NAO SOBRESCREVER OS ARQUIVOS
            FileWriter escrever = new FileWriter(fw, true);
            BufferedWriter org = new BufferedWriter(escrever);
            org.write(TxtRec_Titula.getText());
            org.newLine();
            org.write(TxtRec_Nome.getText());
            org.newLine();
            org.write(TxtF_Cpf.getText());
            org.newLine();
            org.write(TxtF_Rg.getText());
            org.newLine();
            org.write(TxtRec_End.getText());
            org.newLine();
            org.write(TxtRec_Cidade.getText());
            org.newLine();
            org.write(TxtRec_Bairro.getText());
            org.newLine();
            org.write(TxtF_Dn.getText());
            org.newLine();
            org.close();
            JOptionPane.showMessageDialog(null, "Professor cadastrado");
            TxtRec_Titula.setText(null);
            TxtRec_Nome.setText(null);
            TxtF_Cpf.setText(null);
            TxtF_Rg.setText(null);
            TxtRec_End.setText(null);
            TxtRec_Cidade.setText(null);
            TxtRec_Bairro.setText(null);
            TxtF_Dn.setText(null);

        }// TRYYYYYYYYYY
        catch (Exception erro) {

        }
    }

    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        base = new javax.swing.JPanel();
        inicio = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Bt_Cad_Alu = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        Bt_Cad_Prof = new javax.swing.JButton();
        Bt_Cad_Livro = new javax.swing.JButton();
        Bt_Cad_Bolsista = new javax.swing.JButton();
        Cad_Alu = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        TxtRec_Mat1 = new javax.swing.JTextField();
        TxtRec_Nome1 = new javax.swing.JTextField();
        BtCad1 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        TxtRec_End1 = new javax.swing.JTextField();
        TxtRec_Cidade1 = new javax.swing.JTextField();
        TxtRec_Bairro1 = new javax.swing.JTextField();
        BtVoltar2 = new javax.swing.JButton();
        BtConsultar = new javax.swing.JButton();
        TxtRec_DN2 = new javax.swing.JFormattedTextField();
        TxtRec_CPF2 = new javax.swing.JFormattedTextField();
        TxtRec_RG2 = new javax.swing.JFormattedTextField();
        curso = new javax.swing.JComboBox<>();
        BtExcluirAluno = new javax.swing.JButton();
        Cad_Livro = new javax.swing.JPanel();
        H1 = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        TxRec_Autor = new javax.swing.JTextField();
        TxRec_Titu = new javax.swing.JTextField();
        TxRec_Edi = new javax.swing.JTextField();
        TxRec_Qua = new javax.swing.JTextField();
        TxRec_Cod = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Cad_Prof = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TxtRec_Titula = new javax.swing.JTextField();
        TxtRec_Nome = new javax.swing.JTextField();
        BtCad_Prof = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        TxtRec_End = new javax.swing.JTextField();
        TxtRec_Cidade = new javax.swing.JTextField();
        TxtRec_Bairro = new javax.swing.JTextField();
        BtVoltar = new javax.swing.JButton();
        TxtF_Cpf = new javax.swing.JFormattedTextField();
        TxtF_Rg = new javax.swing.JFormattedTextField();
        TxtF_Dn = new javax.swing.JFormattedTextField();
        BtCons_Prof = new javax.swing.JButton();
        Bolsista = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        TipoPro = new javax.swing.JComboBox<>();
        TxRec_Mat = new javax.swing.JTextField();
        TxRec_TituPro = new javax.swing.JTextField();
        TxRec_Dura = new javax.swing.JTextField();
        BtCadBols = new javax.swing.JButton();
        Bt_vol = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        Menu_Item_CadAlu = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        Menu_Item_CadProf = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        base.setLayout(new java.awt.CardLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("Estruturas de Dados");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel2.setText("UFPA - Castanhal");

        Bt_Cad_Alu.setText("Aluno");
        Bt_Cad_Alu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_Cad_AluActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Exotc350 Bd BT", 0, 36)); // NOI18N
        jLabel15.setText("O que deseja fazer?");

        Bt_Cad_Prof.setText("Professor");
        Bt_Cad_Prof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_Cad_ProfActionPerformed(evt);
            }
        });

        Bt_Cad_Livro.setText("Livro");
        Bt_Cad_Livro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_Cad_LivroActionPerformed(evt);
            }
        });

        Bt_Cad_Bolsista.setText("Bolsista");
        Bt_Cad_Bolsista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_Cad_BolsistaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout inicioLayout = new javax.swing.GroupLayout(inicio);
        inicio.setLayout(inicioLayout);
        inicioLayout.setHorizontalGroup(
            inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicioLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(Bt_Cad_Alu)
                .addGap(18, 18, 18)
                .addComponent(Bt_Cad_Prof)
                .addGap(18, 18, 18)
                .addComponent(Bt_Cad_Livro)
                .addGap(18, 18, 18)
                .addComponent(Bt_Cad_Bolsista)
                .addContainerGap(142, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inicioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inicioLayout.createSequentialGroup()
                        .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inicioLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(16, 16, 16)))
                        .addGap(197, 197, 197))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inicioLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(173, 173, 173))))
        );

        inicioLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Bt_Cad_Alu, Bt_Cad_Bolsista, Bt_Cad_Livro, Bt_Cad_Prof});

        inicioLayout.setVerticalGroup(
            inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicioLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addGap(85, 85, 85)
                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bt_Cad_Alu)
                    .addComponent(Bt_Cad_Prof)
                    .addComponent(Bt_Cad_Livro)
                    .addComponent(Bt_Cad_Bolsista))
                .addContainerGap(282, Short.MAX_VALUE))
        );

        base.add(inicio, "inicio");

        jLabel16.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel16.setText("Aluno");

        jLabel17.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel17.setText("Matrícula:");

        jLabel18.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel18.setText("CPF");

        TxtRec_Mat1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        TxtRec_Mat1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtRec_Mat1KeyTyped(evt);
            }
        });

        TxtRec_Nome1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        TxtRec_Nome1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtRec_Nome1KeyTyped(evt);
            }
        });

        BtCad1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        BtCad1.setText("Cadastrar");
        BtCad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCad1ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel19.setText("Nome:");

        jLabel20.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel20.setText("RG");

        jLabel21.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel21.setText("Data de nascimento");

        jLabel22.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel22.setText("Endereço");

        jLabel23.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel23.setText("Cidade");

        jLabel24.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel24.setText("Bairro");

        TxtRec_Cidade1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtRec_Cidade1KeyTyped(evt);
            }
        });

        TxtRec_Bairro1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtRec_Bairro1KeyTyped(evt);
            }
        });

        BtVoltar2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        BtVoltar2.setText("Voltar");
        BtVoltar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtVoltar2ActionPerformed(evt);
            }
        });

        BtConsultar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BtConsultar.setText("Consultar");
        BtConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtConsultarActionPerformed(evt);
            }
        });

        try {
            TxtRec_DN2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TxtRec_DN2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtRec_DN2.setText("       /  /    ");
        TxtRec_DN2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtRec_DN2KeyTyped(evt);
            }
        });

        try {
            TxtRec_CPF2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TxtRec_CPF2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtRec_CPF2.setToolTipText("");

        try {
            TxtRec_RG2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TxtRec_RG2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        curso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o Curso", "Engenharia da computação", "Engenharia da pesca", "Sistema de informação" }));

        BtExcluirAluno.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        BtExcluirAluno.setText("Excluir");
        BtExcluirAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtExcluirAlunoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Cad_AluLayout = new javax.swing.GroupLayout(Cad_Alu);
        Cad_Alu.setLayout(Cad_AluLayout);
        Cad_AluLayout.setHorizontalGroup(
            Cad_AluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Cad_AluLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(288, 288, 288))
            .addGroup(Cad_AluLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Cad_AluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Cad_AluLayout.createSequentialGroup()
                        .addGroup(Cad_AluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel19)
                            .addComponent(TxtRec_End1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24)
                            .addGroup(Cad_AluLayout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TxtRec_DN2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Cad_AluLayout.createSequentialGroup()
                                .addGroup(Cad_AluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23)
                                    .addGroup(Cad_AluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(TxtRec_Bairro1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TxtRec_Cidade1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)))
                                .addGap(26, 26, 26)
                                .addComponent(curso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(Cad_AluLayout.createSequentialGroup()
                        .addGroup(Cad_AluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Cad_AluLayout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TxtRec_CPF2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel22)
                            .addGroup(Cad_AluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(Cad_AluLayout.createSequentialGroup()
                                    .addComponent(BtVoltar2)
                                    .addGap(125, 125, 125)
                                    .addComponent(BtExcluirAluno)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BtCad1))
                                .addGroup(Cad_AluLayout.createSequentialGroup()
                                    .addComponent(jLabel17)
                                    .addGap(18, 18, 18)
                                    .addGroup(Cad_AluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(Cad_AluLayout.createSequentialGroup()
                                            .addComponent(TxtRec_Mat1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(BtConsultar))
                                        .addGroup(Cad_AluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(TxtRec_Nome1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(Cad_AluLayout.createSequentialGroup()
                                                .addComponent(jLabel20)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(TxtRec_RG2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addContainerGap(31, Short.MAX_VALUE))))
        );

        Cad_AluLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {BtCad1, BtExcluirAluno, BtVoltar2});

        Cad_AluLayout.setVerticalGroup(
            Cad_AluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Cad_AluLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Cad_AluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(TxtRec_Mat1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtConsultar))
                .addGroup(Cad_AluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Cad_AluLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel19))
                    .addGroup(Cad_AluLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(TxtRec_Nome1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(Cad_AluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Cad_AluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18)
                        .addComponent(TxtRec_CPF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Cad_AluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel20)
                        .addComponent(TxtRec_RG2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(Cad_AluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(TxtRec_DN2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtRec_End1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Cad_AluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(curso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Cad_AluLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(TxtRec_Cidade1, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtRec_Bairro1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(Cad_AluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtCad1)
                    .addComponent(BtVoltar2)
                    .addComponent(BtExcluirAluno))
                .addGap(21, 21, 21))
        );

        base.add(Cad_Alu, "Cad_Alu");

        H1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        H1.setText("Cadastrar livro");

        Titulo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Titulo.setText("Titulo");

        jLabel25.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel25.setText("Autor");

        jLabel26.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel26.setText("Editora");

        jLabel27.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel27.setText("Quantidade");

        jLabel28.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel28.setText("Codigo");

        jButton1.setText("Cadastrar Livro");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Voltar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Cad_LivroLayout = new javax.swing.GroupLayout(Cad_Livro);
        Cad_Livro.setLayout(Cad_LivroLayout);
        Cad_LivroLayout.setHorizontalGroup(
            Cad_LivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Cad_LivroLayout.createSequentialGroup()
                .addGroup(Cad_LivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(Cad_LivroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(Cad_LivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Cad_LivroLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(Titulo))
                        .addGroup(Cad_LivroLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel26))
                        .addGroup(Cad_LivroLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel27))
                        .addGroup(Cad_LivroLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel28))
                        .addGroup(Cad_LivroLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel25))
                        .addGroup(Cad_LivroLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(TxRec_Edi, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(Cad_LivroLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(TxRec_Autor, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(Cad_LivroLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(TxRec_Titu, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(Cad_LivroLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(TxRec_Qua, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(Cad_LivroLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(TxRec_Cod, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(Cad_LivroLayout.createSequentialGroup()
                            .addGap(184, 184, 184)
                            .addComponent(H1))))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        Cad_LivroLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton3});

        Cad_LivroLayout.setVerticalGroup(
            Cad_LivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Cad_LivroLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(H1)
                .addGap(18, 18, 18)
                .addComponent(Titulo)
                .addGap(8, 8, 8)
                .addComponent(TxRec_Titu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxRec_Autor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TxRec_Edi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel27)
                .addGap(18, 18, 18)
                .addComponent(TxRec_Qua, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxRec_Cod, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(Cad_LivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        base.add(Cad_Livro, "Cad_Livro");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel3.setText("Professor");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setText("Titulação");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel5.setText("CPF");

        TxtRec_Titula.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        TxtRec_Titula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtRec_TitulaKeyTyped(evt);
            }
        });

        TxtRec_Nome.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        TxtRec_Nome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtRec_NomeKeyTyped(evt);
            }
        });

        BtCad_Prof.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        BtCad_Prof.setText("Cadastrar");
        BtCad_Prof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCad_ProfActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel9.setText("Nome:");

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel10.setText("RG");

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel11.setText("Data de nascimento");

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel12.setText("Endereço");

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel13.setText("Cidade");

        jLabel14.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel14.setText("Bairro");

        TxtRec_Cidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtRec_CidadeKeyTyped(evt);
            }
        });

        TxtRec_Bairro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtRec_BairroKeyTyped(evt);
            }
        });

        BtVoltar.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        BtVoltar.setText("Voltar");
        BtVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtVoltarActionPerformed(evt);
            }
        });

        try {
            TxtF_Cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TxtF_Cpf.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        try {
            TxtF_Rg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TxtF_Rg.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        try {
            TxtF_Dn.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TxtF_Dn.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        BtCons_Prof.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        BtCons_Prof.setText("Consultar");
        BtCons_Prof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCons_ProfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Cad_ProfLayout = new javax.swing.GroupLayout(Cad_Prof);
        Cad_Prof.setLayout(Cad_ProfLayout);
        Cad_ProfLayout.setHorizontalGroup(
            Cad_ProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Cad_ProfLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Cad_ProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Cad_ProfLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addContainerGap(555, Short.MAX_VALUE))
                    .addGroup(Cad_ProfLayout.createSequentialGroup()
                        .addGroup(Cad_ProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtRec_End, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Cad_ProfLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TxtF_Dn, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addGroup(Cad_ProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(TxtRec_Bairro, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TxtRec_Cidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Cad_ProfLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(Cad_ProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(Cad_ProfLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TxtF_Cpf)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TxtF_Rg, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Cad_ProfLayout.createSequentialGroup()
                                .addGroup(Cad_ProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(Cad_ProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtRec_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtRec_Titula, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtCons_Prof)
                        .addGap(25, 25, 25))
                    .addGroup(Cad_ProfLayout.createSequentialGroup()
                        .addComponent(BtVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtCad_Prof)
                        .addGap(151, 151, 151))))
            .addGroup(Cad_ProfLayout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Cad_ProfLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {TxtRec_Nome, TxtRec_Titula});

        Cad_ProfLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {BtCad_Prof, BtVoltar});

        Cad_ProfLayout.setVerticalGroup(
            Cad_ProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Cad_ProfLayout.createSequentialGroup()
                .addGroup(Cad_ProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Cad_ProfLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Cad_ProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtRec_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(Cad_ProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtRec_Titula, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(BtCons_Prof))
                        .addGap(18, 18, 18)
                        .addGroup(Cad_ProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Cad_ProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(jLabel10))
                            .addComponent(TxtF_Cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Cad_ProfLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TxtF_Rg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Cad_ProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(TxtF_Dn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtRec_End, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtRec_Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addGap(10, 10, 10)
                .addComponent(TxtRec_Bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(Cad_ProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtCad_Prof)
                    .addComponent(BtVoltar))
                .addGap(21, 21, 21))
        );

        Cad_ProfLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {TxtRec_Nome, TxtRec_Titula});

        base.add(Cad_Prof, "Cad_Prof");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setText("Matricula");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel7.setText("Bolsista");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel8.setText("Titulo do projeto");

        jLabel29.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel29.setText("Duração");

        TipoPro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo de projeto", "Pesquisa", "Extensão" }));

        BtCadBols.setText("Cadastrar");
        BtCadBols.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCadBolsActionPerformed(evt);
            }
        });

        Bt_vol.setText("Voltar");
        Bt_vol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_volActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BolsistaLayout = new javax.swing.GroupLayout(Bolsista);
        Bolsista.setLayout(BolsistaLayout);
        BolsistaLayout.setHorizontalGroup(
            BolsistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BolsistaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BolsistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BolsistaLayout.createSequentialGroup()
                        .addGroup(BolsistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(TxRec_TituPro, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(BolsistaLayout.createSequentialGroup()
                        .addGroup(BolsistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addComponent(TxRec_Dura, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BolsistaLayout.createSequentialGroup()
                        .addGroup(BolsistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(BolsistaLayout.createSequentialGroup()
                                .addComponent(TxRec_Mat, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                                .addComponent(TipoPro, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(BolsistaLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(Bt_vol)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtCadBols, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(47, 47, 47))))
            .addGroup(BolsistaLayout.createSequentialGroup()
                .addGap(219, 219, 219)
                .addComponent(jLabel7)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        BolsistaLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {BtCadBols, Bt_vol});

        BolsistaLayout.setVerticalGroup(
            BolsistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BolsistaLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel7)
                .addGap(27, 27, 27)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BolsistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TxRec_Mat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TipoPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxRec_TituPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxRec_Dura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 239, Short.MAX_VALUE)
                .addGroup(BolsistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtCadBols)
                    .addComponent(Bt_vol))
                .addGap(33, 33, 33))
        );

        base.add(Bolsista, "Bolsista");

        jMenu1.setText("Arquivo");

        jMenu2.setText("Aluno");

        Menu_Item_CadAlu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Menu_Item_CadAlu.setText("Cadastrar");
        Menu_Item_CadAlu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_Item_CadAluActionPerformed(evt);
            }
        });
        jMenu2.add(Menu_Item_CadAlu);

        jMenuItem2.setText("Alterar informações");
        jMenu2.add(jMenuItem2);

        jMenuItem4.setText("Remover");
        jMenu2.add(jMenuItem4);

        jMenuItem13.setText("Consultar");
        jMenu2.add(jMenuItem13);

        jMenu1.add(jMenu2);

        jMenu3.setText("Professor");

        Menu_Item_CadProf.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Menu_Item_CadProf.setText("Cadastrar");
        Menu_Item_CadProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_Item_CadProfActionPerformed(evt);
            }
        });
        jMenu3.add(Menu_Item_CadProf);

        jMenuItem6.setText("Alterar");
        jMenu3.add(jMenuItem6);

        jMenuItem7.setText("Remover");
        jMenu3.add(jMenuItem7);

        jMenu1.add(jMenu3);

        jMenu4.setText("Biblioteca");

        jMenuItem8.setText("Cadastrar");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);

        jMenuItem9.setText("Emprestar");
        jMenu4.add(jMenuItem9);

        jMenuItem10.setText("Consultar");
        jMenu4.add(jMenuItem10);

        jMenuItem11.setText("Devolução");
        jMenu4.add(jMenuItem11);

        jMenu1.add(jMenu4);

        jMenuItem12.setText("Bolsista");
        jMenu1.add(jMenuItem12);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(base, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(base, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtCad_ProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCad_ProfActionPerformed
        // TODO add your handling code here:
        salvarProf();
    }//GEN-LAST:event_BtCad_ProfActionPerformed

    private void TxtRec_TitulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtRec_TitulaKeyTyped
        // TODO add your handling code here:
        String valores = "0123456789";
        if (!valores.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_TxtRec_TitulaKeyTyped

    private void TxtRec_NomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtRec_NomeKeyTyped
        // TODO add your handling code here:
        String valores = "0123456789@!#$%^&*";
        if (valores.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_TxtRec_NomeKeyTyped

    private void Menu_Item_CadAluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_Item_CadAluActionPerformed
        // TODO add your handling code here:
        CardLayout tela = (CardLayout) base.getLayout();
        tela.show(base, "Cad_Alu");
    }//GEN-LAST:event_Menu_Item_CadAluActionPerformed

    private void Bt_Cad_AluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_Cad_AluActionPerformed
        // TODO add your handling code here:
        CardLayout tela = (CardLayout) base.getLayout();
        tela.show(base, "Cad_Alu");
    }//GEN-LAST:event_Bt_Cad_AluActionPerformed

    private void BtVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtVoltarActionPerformed
        // TODO add your handling code here:
        CardLayout tela = (CardLayout) base.getLayout();
        tela.show(base, "inicio");
    }//GEN-LAST:event_BtVoltarActionPerformed

    private void TxtRec_CidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtRec_CidadeKeyTyped
        // TODO add your handling code here:
        String valores = "0123456789@!#$%^&*";
        if (valores.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_TxtRec_CidadeKeyTyped

    private void TxtRec_BairroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtRec_BairroKeyTyped
        // TODO add your handling code here:
        String valores = "0123456789@!#$%^&*";
        if (valores.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_TxtRec_BairroKeyTyped

    private void TxtRec_Mat1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtRec_Mat1KeyTyped
        // TODO add your handling code here:
        String valores = "0123456789";
        if (!valores.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_TxtRec_Mat1KeyTyped

    private void TxtRec_Nome1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtRec_Nome1KeyTyped
        // TODO add your handling code here:
        String valores = "0123456789@!#$%^&*";
        if (valores.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }

    }//GEN-LAST:event_TxtRec_Nome1KeyTyped

    private void BtCad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCad1ActionPerformed
        // TODO add your handling code here:
        salvarAluno();
    }//GEN-LAST:event_BtCad1ActionPerformed

    private void TxtRec_Cidade1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtRec_Cidade1KeyTyped
        // TODO add your handling code here:
        String valores = "0123456789@!#$%^&*";
        if (valores.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_TxtRec_Cidade1KeyTyped

    private void TxtRec_Bairro1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtRec_Bairro1KeyTyped
        // TODO add your handling code here:
        String valores = "0123456789@!#$%^&*";
        if (valores.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }

    }//GEN-LAST:event_TxtRec_Bairro1KeyTyped

    private void BtVoltar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtVoltar2ActionPerformed
        // TODO add your handling code here:
        CardLayout tela = (CardLayout) base.getLayout();
        tela.show(base, "inicio");
    }//GEN-LAST:event_BtVoltar2ActionPerformed

    private void Menu_Item_CadProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_Item_CadProfActionPerformed
        // TODO add your handling code here:
        CardLayout tela = (CardLayout) base.getLayout();
        tela.show(base, "Cad_Prof");
    }//GEN-LAST:event_Menu_Item_CadProfActionPerformed

    private void Bt_Cad_ProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_Cad_ProfActionPerformed
        // TODO add your handling code here:
        CardLayout tela = (CardLayout) base.getLayout();
        tela.show(base, "Cad_Prof");
    }//GEN-LAST:event_Bt_Cad_ProfActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        CardLayout tela = (CardLayout) base.getLayout();
        tela.show(base, "inicio");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        CardLayout tela = (CardLayout) base.getLayout();
        tela.show(base, "Cad_Livro");
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void Bt_Cad_LivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_Cad_LivroActionPerformed
        // TODO add your handling code here:
        CardLayout tela = (CardLayout) base.getLayout();
        tela.show(base, "Cad_Livro");

    }//GEN-LAST:event_Bt_Cad_LivroActionPerformed

    private void BtConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtConsultarActionPerformed

        try {
//            ARQUIVO QUE EU QUERO LER
//            QUISER MUDAR O DIRETORIO (COLOQUE O CAMINHO: ./CAMINHOAQUI/NOMEDOARQUIVO)
            File arquivo = new File("Alunos.txt");
//            PROCESSO DE LEITURA - 
            FileReader ler = new FileReader(arquivo);
            BufferedReader org = new BufferedReader(ler);
            ArrayList<String> Linhas = new ArrayList();
//            LER DA PRIMEIRA A ULTIMA LINHA DO ARQUIVO - EQUANTO ESSE ARQUIVO TIVER LINHA
//            READY SABE A QUANTIDADES DE LINHAS DO ARQUIVO, PARECIDO COM O SIZE DO ARRAYLIST
            while (org.ready()) {
//                READLINE RESPONSAVEL POR LER CADA LINHA DO ARQUIVO
                Linhas.add(org.readLine());
            }

            boolean buscar = false;
            for (int i = 0; i < Linhas.size(); i++) {
                if (TxtRec_Mat1.getText().equals(Linhas.get(i))) {
                    TxtRec_Nome1.setText(Linhas.get(i + 1));
                    TxtRec_CPF2.setText(Linhas.get(i + 2));
                    TxtRec_RG2.setText(Linhas.get(i + 3));
                    TxtRec_End1.setText(Linhas.get(i + 4));
                    TxtRec_Cidade1.setText(Linhas.get(i + 5));
                    TxtRec_Bairro1.setText(Linhas.get(i + 6));
                    TxtRec_DN2.setText(Linhas.get(i + 7));
                    if (Linhas.get(i + 8).equals("1")) {
                        curso.setSelectedIndex(1);
                    }
                    if (Linhas.get(i + 8).equals("2")) {
                        curso.setSelectedIndex(2);
                    }
                    if (Linhas.get(i + 8).equals("3")) {
                        curso.setSelectedIndex(3);
                    }
                    buscar = true;
                    break;
                }
            }
            if (buscar == false) {
                JOptionPane.showMessageDialog(null, "Matricula nao encontrado!");
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro");
        }

    }//GEN-LAST:event_BtConsultarActionPerformed

    private void TxtRec_DN2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtRec_DN2KeyTyped
        // TODO add your handling code here:
        String valores = "0123456789";
        if (!valores.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_TxtRec_DN2KeyTyped

    private void BtCons_ProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCons_ProfActionPerformed
        // TODO add your handling code here:

        try {
//            ARQUIVO QUE EU QUERO LER
//            QUISER MUDAR O DIRETORIO (COLOQUE O CAMINHO: ./CAMINHOAQUI/NOMEDOARQUIVO)
            File arquivo = new File("Prof.txt");
//            PROCESSO DE LEITURA - 
            FileReader ler = new FileReader(arquivo);
            BufferedReader org = new BufferedReader(ler);
            ArrayList<String> Linhas = new ArrayList();
//            LER DA PRIMEIRA A ULTIMA LINHA DO ARQUIVO - EQUANTO ESSE ARQUIVO TIVER LINHA
//            READY SABE A QUANTIDADES DE LINHAS DO ARQUIVO, PARECIDO COM O SIZE DO ARRAYLIST
            while (org.ready()) {
//                READLINE RESPONSAVEL POR LER CADA LINHA DO ARQUIVO
                Linhas.add(org.readLine());
            }

            boolean buscar = false;
            for (int i = 0; i < Linhas.size(); i++) {
                if (TxtRec_Titula.getText().equals(Linhas.get(i))) {
                    TxtRec_Nome.setText(Linhas.get(i + 1));
                    TxtF_Cpf.setText(Linhas.get(i + 2));
                    TxtF_Rg.setText(Linhas.get(i + 3));
                    TxtRec_End.setText(Linhas.get(i + 4));
                    TxtRec_Cidade.setText(Linhas.get(i + 5));
                    TxtRec_Bairro.setText(Linhas.get(i + 6));
                    TxtF_Dn.setText(Linhas.get(i + 7));

                    buscar = true;
                    break;
                }
            }
            if (buscar == false) {
                JOptionPane.showMessageDialog(null, "Matricula nao encontrado!");
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro");
        }
    }//GEN-LAST:event_BtCons_ProfActionPerformed

    private void BtCadBolsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCadBolsActionPerformed
        // TODO add your handling code here:
        salvarBolsista();

    }//GEN-LAST:event_BtCadBolsActionPerformed

    private void Bt_Cad_BolsistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_Cad_BolsistaActionPerformed
        // TODO add your handling code here:
        CardLayout tela = (CardLayout) base.getLayout();
        tela.show(base, "Bolsista");
    }//GEN-LAST:event_Bt_Cad_BolsistaActionPerformed

    private void Bt_volActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_volActionPerformed
        // TODO add your handling code here:
        CardLayout tela = (CardLayout) base.getLayout();
        tela.show(base, "inicio");
    }//GEN-LAST:event_Bt_volActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        salvarlivro();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BtExcluirAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtExcluirAlunoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_BtExcluirAlunoActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bolsista;
    private javax.swing.JButton BtCad1;
    private javax.swing.JButton BtCadBols;
    private javax.swing.JButton BtCad_Prof;
    private javax.swing.JButton BtCons_Prof;
    private javax.swing.JButton BtConsultar;
    private javax.swing.JButton BtExcluirAluno;
    private javax.swing.JButton BtVoltar;
    private javax.swing.JButton BtVoltar2;
    private javax.swing.JButton Bt_Cad_Alu;
    private javax.swing.JButton Bt_Cad_Bolsista;
    private javax.swing.JButton Bt_Cad_Livro;
    private javax.swing.JButton Bt_Cad_Prof;
    private javax.swing.JButton Bt_vol;
    private javax.swing.JPanel Cad_Alu;
    private javax.swing.JPanel Cad_Livro;
    private javax.swing.JPanel Cad_Prof;
    private javax.swing.JLabel H1;
    private javax.swing.JMenuItem Menu_Item_CadAlu;
    private javax.swing.JMenuItem Menu_Item_CadProf;
    private javax.swing.JComboBox<String> TipoPro;
    private javax.swing.JLabel Titulo;
    private javax.swing.JTextField TxRec_Autor;
    private javax.swing.JTextField TxRec_Cod;
    private javax.swing.JTextField TxRec_Dura;
    private javax.swing.JTextField TxRec_Edi;
    private javax.swing.JTextField TxRec_Mat;
    private javax.swing.JTextField TxRec_Qua;
    private javax.swing.JTextField TxRec_Titu;
    private javax.swing.JTextField TxRec_TituPro;
    private javax.swing.JFormattedTextField TxtF_Cpf;
    private javax.swing.JFormattedTextField TxtF_Dn;
    private javax.swing.JFormattedTextField TxtF_Rg;
    private javax.swing.JTextField TxtRec_Bairro;
    private javax.swing.JTextField TxtRec_Bairro1;
    private javax.swing.JFormattedTextField TxtRec_CPF2;
    private javax.swing.JTextField TxtRec_Cidade;
    private javax.swing.JTextField TxtRec_Cidade1;
    private javax.swing.JFormattedTextField TxtRec_DN2;
    private javax.swing.JTextField TxtRec_End;
    private javax.swing.JTextField TxtRec_End1;
    private javax.swing.JTextField TxtRec_Mat1;
    private javax.swing.JTextField TxtRec_Nome;
    private javax.swing.JTextField TxtRec_Nome1;
    private javax.swing.JFormattedTextField TxtRec_RG2;
    private javax.swing.JTextField TxtRec_Titula;
    private javax.swing.JPanel base;
    private javax.swing.JComboBox<String> curso;
    private javax.swing.JPanel inicio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}
