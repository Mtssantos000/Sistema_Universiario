
/**
 *
 * @author Matheus Dos Santos
 */
import java.awt.CardLayout;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class Menu_Princ extends javax.swing.JFrame {

    ArrayList<Livro> ListaLivro;
    String o;

    
    
    public String getO() {
        return o;
    }

    /**
     * Creates new form Menu_Princ
     */
    public void setO(String o) {
        this.o = o;
    }

    private void removerL() {
        try {
            File arquivo = new File("Livro.txt");
            FileReader ler = new FileReader(arquivo);
            BufferedReader organizar = new BufferedReader(ler);
            ArrayList<String> linhas = new ArrayList();
            boolean buscar = false;
            int i = 0;

            while (organizar.ready()) {
                linhas.add(i, organizar.readLine());
                i++;
            }
            String Titu_livro = Rec_Titu.getText();
            for (int j = 0; j < linhas.size(); j++) {
                if (linhas.get(j).equals(Titu_livro)) {
                    linhas.remove(j);
                    linhas.remove(j);
                    linhas.remove(j);
                    linhas.remove(j);
                    linhas.remove(j);
                    buscar = true;
                }//Fim do if
            }///Fim do for

            if (buscar == false) {
                JOptionPane.showMessageDialog(null, "O Livro não foi encontrado");
            }

            FileWriter escrever = new FileWriter(arquivo);
            BufferedWriter organizar2 = new BufferedWriter(escrever);
            for (int j = 0; j < linhas.size(); j++) {
                organizar2.write(linhas.get(j));
                organizar2.newLine();
            }
            organizar2.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Menu_Princ.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Menu_Princ.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    private void salvarAluno() {
        try {
            File fw = new File("Alunos.txt");
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

    public void LoadTabelaLivros() {
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Titulo", "Autor", "Editora", "ID", "Quantidade"}, 0);

        for (int i = 0; i < ListaLivro.size(); i++) {
            Object[] linha = new Object[]{ListaLivro.get(i).getTitulo(),
                ListaLivro.get(i).getAutor(),
                ListaLivro.get(i).getEditora(),
                ListaLivro.get(i).getId(),
                ListaLivro.get(i).getQuantidade()};

            modelo.addRow(linha);
        }

        TableLivros.setModel(modelo);

    }

    public void PegarInfo() {
        int ind = TableLivros.getSelectedRow();

        //----------VERIFICAR SE O IND >=0 E MENOR QUE A QUANTIDADE TOTAL DA LISTA DE PRODUTOS------------------
        if (ind >= 0 && ind < ListaLivro.size()) {
            //
            Livro Pro = ListaLivro.get(ind);
            //-------------String.valueOf É PARA RETORNAR UM VALOR DO TIPO STRING

            Rec_Titu.setText(Pro.getTitulo());
            Rec_Autor.setText(Pro.getAutor());
            Rec_Edi.setText(Pro.getEditora());
            Rec_Id.setText(String.valueOf(Pro.getId()));
            Rec_Quant.setText(String.valueOf(Pro.getQuantidade()));

        }
    }
    
    

    public void remover() {
        int in = TableLivros.getSelectedRow();
        if (in >= 0 && in < ListaLivro.size()) {
            ListaLivro.remove(in);

        }

        LoadTabelaLivros();
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

    private void salvarlivro() {
        try {
            File fw = new File("Livro.txt");
            Random gerador = new Random();
//    TRUE PARA NAO SOBRESCREVER OS ARQUIVOS
            FileWriter escrever = new FileWriter(fw, true);
            BufferedWriter org = new BufferedWriter(escrever);
            /**
             * org.write(gerador.nextInt(200)+1); 
             * org.newLine(); *
             */
            org.write(Rec_Titu.getText());
            org.newLine();
            org.write(Rec_Autor.getText());
            org.newLine();
            org.write(Rec_Edi.getText());
            org.newLine();
            org.write(Rec_Id.getText());
            org.newLine();
            org.write(Rec_Quant.getText());
            org.newLine();
            org.close();
            //JOptionPane.showMessageDialog(null, "Livro cadastrado");
            Rec_Autor.setText(null);
            Rec_Titu.setText(null);
            Rec_Edi.setText(null);
            Rec_Quant.setText(null);
            Rec_Id.setText(null);
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

    public Menu_Princ() {
        initComponents();
        ListaLivro = new ArrayList();
    }

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
        BtAlterar_Aluno = new javax.swing.JButton();
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
        BtExcluir_Prof = new javax.swing.JButton();
        BtAlterar_Prof = new javax.swing.JButton();
        Livrooo = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        Rec_Titu = new javax.swing.JTextField();
        Rec_Autor = new javax.swing.JTextField();
        Rec_Edi = new javax.swing.JTextField();
        BotaoEnviar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableLivros = new javax.swing.JTable();
        Rec_Quant = new javax.swing.JTextField();
        BotaoExcluir = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        Rec_Id = new javax.swing.JTextField();
        BtAlterarLivro = new javax.swing.JButton();
        Bt_Emprestar = new javax.swing.JButton();
        TxRec_emprestimo = new javax.swing.JTextField();
        Bt_Devolver = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        Bolsista = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        TipoPro = new javax.swing.JComboBox<>();
        TxRec_Mat = new javax.swing.JTextField();
        TxRec_TituPro = new javax.swing.JTextField();
        TxRec_Dura = new javax.swing.JTextField();
        Bt_vol = new javax.swing.JButton();
        BtCadBols1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TxEx_Bol = new javax.swing.JTextArea();
        Bt_excluirbol = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        base.setLayout(new java.awt.CardLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("Estruturas de Dados");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel2.setText("UFPA - Castanhal");

        Bt_Cad_Alu.setFont(new java.awt.Font("Dialog", 2, 24)); // NOI18N
        Bt_Cad_Alu.setText("Aluno");
        Bt_Cad_Alu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_Cad_AluActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Exotc350 Bd BT", 0, 36)); // NOI18N
        jLabel15.setText("O que deseja fazer?");

        Bt_Cad_Prof.setFont(new java.awt.Font("Dialog", 2, 24)); // NOI18N
        Bt_Cad_Prof.setText("Professor");
        Bt_Cad_Prof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_Cad_ProfActionPerformed(evt);
            }
        });

        Bt_Cad_Livro.setFont(new java.awt.Font("Dialog", 2, 24)); // NOI18N
        Bt_Cad_Livro.setText("Livro");
        Bt_Cad_Livro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_Cad_LivroActionPerformed(evt);
            }
        });

        Bt_Cad_Bolsista.setFont(new java.awt.Font("Dialog", 2, 24)); // NOI18N
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
                .addGap(57, 57, 57)
                .addComponent(Bt_Cad_Alu)
                .addGap(18, 18, 18)
                .addComponent(Bt_Cad_Prof)
                .addGap(18, 18, 18)
                .addComponent(Bt_Cad_Livro)
                .addGap(18, 18, 18)
                .addComponent(Bt_Cad_Bolsista)
                .addGap(0, 95, Short.MAX_VALUE))
            .addGroup(inicioLayout.createSequentialGroup()
                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inicioLayout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inicioLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(16, 16, 16))))
                    .addGroup(inicioLayout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jLabel15)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        inicioLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Bt_Cad_Alu, Bt_Cad_Bolsista, Bt_Cad_Livro, Bt_Cad_Prof});

        inicioLayout.setVerticalGroup(
            inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicioLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addGap(96, 96, 96)
                .addGroup(inicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bt_Cad_Alu)
                    .addComponent(Bt_Cad_Prof)
                    .addComponent(Bt_Cad_Livro)
                    .addComponent(Bt_Cad_Bolsista))
                .addContainerGap(272, Short.MAX_VALUE))
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

        BtConsultar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
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

        BtAlterar_Aluno.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        BtAlterar_Aluno.setText("Alterar");
        BtAlterar_Aluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtAlterar_AlunoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Cad_AluLayout = new javax.swing.GroupLayout(Cad_Alu);
        Cad_Alu.setLayout(Cad_AluLayout);
        Cad_AluLayout.setHorizontalGroup(
            Cad_AluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                        .addGroup(Cad_AluLayout.createSequentialGroup()
                                            .addGroup(Cad_AluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(TxtRec_Nome1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(Cad_AluLayout.createSequentialGroup()
                                                    .addComponent(jLabel20)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(TxtRec_RG2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(BtAlterar_Aluno))))))
                        .addContainerGap(121, Short.MAX_VALUE))))
            .addGroup(Cad_AluLayout.createSequentialGroup()
                .addGap(302, 302, 302)
                .addComponent(jLabel16)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Cad_AluLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {BtCad1, BtExcluirAluno, BtVoltar2});

        Cad_AluLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {BtAlterar_Aluno, BtConsultar});

        Cad_AluLayout.setVerticalGroup(
            Cad_AluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Cad_AluLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
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
                        .addGroup(Cad_AluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtRec_Nome1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtAlterar_Aluno))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(Cad_AluLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtCad1)
                    .addComponent(BtVoltar2)
                    .addComponent(BtExcluirAluno))
                .addGap(21, 21, 21))
        );

        base.add(Cad_Alu, "Cad_Alu");

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

        BtExcluir_Prof.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        BtExcluir_Prof.setText("Excluir");
        BtExcluir_Prof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtExcluir_ProfActionPerformed(evt);
            }
        });

        BtAlterar_Prof.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        BtAlterar_Prof.setText("Alterar");
        BtAlterar_Prof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtAlterar_ProfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Cad_ProfLayout = new javax.swing.GroupLayout(Cad_Prof);
        Cad_Prof.setLayout(Cad_ProfLayout);
        Cad_ProfLayout.setHorizontalGroup(
            Cad_ProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Cad_ProfLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Cad_ProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Cad_ProfLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Cad_ProfLayout.createSequentialGroup()
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
                    .addGroup(Cad_ProfLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtF_Cpf)
                        .addGap(88, 88, 88)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtF_Rg, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(BtAlterar_Prof)
                        .addGap(113, 113, 113))
                    .addGroup(Cad_ProfLayout.createSequentialGroup()
                        .addGroup(Cad_ProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(Cad_ProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtRec_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtRec_Titula, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtCons_Prof)
                        .addGap(113, 113, 113))
                    .addGroup(Cad_ProfLayout.createSequentialGroup()
                        .addComponent(BtVoltar)
                        .addGap(183, 183, 183)
                        .addComponent(BtExcluir_Prof)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtCad_Prof)
                        .addGap(111, 111, 111))))
            .addGroup(Cad_ProfLayout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Cad_ProfLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {TxtRec_Nome, TxtRec_Titula});

        Cad_ProfLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {BtCad_Prof, BtExcluir_Prof, BtVoltar});

        Cad_ProfLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {BtAlterar_Prof, BtCons_Prof});

        Cad_ProfLayout.setVerticalGroup(
            Cad_ProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Cad_ProfLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addGroup(Cad_ProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Cad_ProfLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(BtCons_Prof))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Cad_ProfLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(Cad_ProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtRec_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(Cad_ProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtRec_Titula, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(Cad_ProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(Cad_ProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel10)
                                .addGroup(Cad_ProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TxtF_Rg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BtAlterar_Prof))
                                .addComponent(TxtF_Cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(Cad_ProfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtCad_Prof)
                    .addComponent(BtVoltar)
                    .addComponent(BtExcluir_Prof))
                .addGap(21, 21, 21))
        );

        Cad_ProfLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {TxtRec_Nome, TxtRec_Titula});

        base.add(Cad_Prof, "Cad_Prof");

        jLabel30.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel30.setText("Titulo");

        jLabel31.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel31.setText("Autor:");

        jLabel32.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel32.setText("Editora");

        jLabel33.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel33.setText("ID");

        jLabel34.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel34.setText("Quantidade");

        Rec_Titu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Rec_TituKeyTyped(evt);
            }
        });

        Rec_Autor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Rec_AutorKeyTyped(evt);
            }
        });

        Rec_Edi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Rec_EdiKeyTyped(evt);
            }
        });

        BotaoEnviar.setText("Cadastrar");
        BotaoEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEnviarActionPerformed(evt);
            }
        });

        TableLivros.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        TableLivros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Titulo", "Autor", "Editora", "ID", "Quantidade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableLivros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableLivrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableLivros);

        Rec_Quant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Rec_QuantKeyTyped(evt);
            }
        });

        BotaoExcluir.setText("Excluir");
        BotaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoExcluirActionPerformed(evt);
            }
        });

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        Rec_Id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Rec_IdKeyTyped(evt);
            }
        });

        BtAlterarLivro.setText("Alterar");
        BtAlterarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtAlterarLivroActionPerformed(evt);
            }
        });

        Bt_Emprestar.setText("Emprestar");
        Bt_Emprestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_EmprestarActionPerformed(evt);
            }
        });

        Bt_Devolver.setText("Devolver");
        Bt_Devolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_DevolverActionPerformed(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel35.setText("Insira um valor para devolver/emprestar livro(s)");

        javax.swing.GroupLayout LivroooLayout = new javax.swing.GroupLayout(Livrooo);
        Livrooo.setLayout(LivroooLayout);
        LivroooLayout.setHorizontalGroup(
            LivroooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LivroooLayout.createSequentialGroup()
                .addGroup(LivroooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LivroooLayout.createSequentialGroup()
                        .addGroup(LivroooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LivroooLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(LivroooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LivroooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(LivroooLayout.createSequentialGroup()
                                            .addComponent(BotaoEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(BotaoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(BtAlterarLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel30)
                                        .addComponent(jLabel31)
                                        .addComponent(jLabel32)
                                        .addComponent(jLabel34)
                                        .addComponent(jLabel33))
                                    .addComponent(Rec_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Rec_Quant, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Rec_Titu, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Rec_Autor, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Rec_Edi, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(LivroooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Bt_Emprestar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Bt_Devolver, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(LivroooLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TxRec_emprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(LivroooLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButtonSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18))
                    .addGroup(LivroooLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        LivroooLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {BotaoEnviar, BotaoExcluir, BtAlterarLivro});

        LivroooLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Rec_Autor, Rec_Edi, Rec_Id, Rec_Quant, Rec_Titu, TxRec_emprestimo});

        LivroooLayout.setVerticalGroup(
            LivroooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LivroooLayout.createSequentialGroup()
                .addGroup(LivroooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LivroooLayout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addGap(2, 2, 2)
                        .addComponent(Rec_Titu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Rec_Autor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Rec_Edi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Rec_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Rec_Quant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(LivroooLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotaoEnviar)
                            .addComponent(BotaoExcluir)
                            .addComponent(BtAlterarLivro))
                        .addGap(42, 42, 42)
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxRec_emprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Bt_Emprestar)
                        .addGap(18, 18, 18)
                        .addComponent(Bt_Devolver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                        .addComponent(jButtonSair))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        base.add(Livrooo, "Livro");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setText("Matricula");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel7.setText("Bolsista");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel8.setText("Titulo do projeto");

        jLabel29.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel29.setText("Duração");

        TipoPro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo de projeto", "Pesquisa", "Extensão" }));

        Bt_vol.setText("Voltar");
        Bt_vol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_volActionPerformed(evt);
            }
        });

        BtCadBols1.setText("Cadastrar");
        BtCadBols1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCadBols1ActionPerformed(evt);
            }
        });

        TxEx_Bol.setColumns(20);
        TxEx_Bol.setRows(5);
        jScrollPane2.setViewportView(TxEx_Bol);

        Bt_excluirbol.setText("Excluir");
        Bt_excluirbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_excluirbolActionPerformed(evt);
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
                        .addGroup(BolsistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(BolsistaLayout.createSequentialGroup()
                                .addComponent(Bt_excluirbol)
                                .addGap(33, 33, 33)
                                .addComponent(BtCadBols1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(BolsistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel8)
                                .addComponent(TxRec_TituPro, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxRec_Mat, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel29)
                                .addComponent(TxRec_Dura, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TipoPro, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7)))
                        .addGap(88, 88, 88)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Bt_vol))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BolsistaLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {BtCadBols1, Bt_excluirbol, Bt_vol});

        BolsistaLayout.setVerticalGroup(
            BolsistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BolsistaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BolsistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BolsistaLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel6)
                        .addGap(11, 11, 11)
                        .addComponent(TxRec_Mat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxRec_TituPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxRec_Dura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TipoPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addGroup(BolsistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtCadBols1)
                            .addComponent(Bt_excluirbol))
                        .addGap(0, 147, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Bt_vol)
                .addGap(33, 33, 33))
        );

        base.add(Bolsista, "Bolsista");

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(base, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
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

    private void Bt_Cad_ProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_Cad_ProfActionPerformed
        // TODO add your handling code here:
        CardLayout tela = (CardLayout) base.getLayout();
        tela.show(base, "Cad_Prof");
    }//GEN-LAST:event_Bt_Cad_ProfActionPerformed

    private void Bt_Cad_LivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_Cad_LivroActionPerformed
        // TODO add your handling code here:
        CardLayout tela = (CardLayout) base.getLayout();
        tela.show(base, "Livro");

    }//GEN-LAST:event_Bt_Cad_LivroActionPerformed

    private void BtConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtConsultarActionPerformed

        try {
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

    private void BtExcluirAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtExcluirAlunoActionPerformed
        // TODO add your handling code here:
        int q = JOptionPane.showConfirmDialog(null, "Você deseja mesmo exluir esse aluno?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (q == JOptionPane.YES_OPTION) {

            try {
                File arquivo = new File("Alunos.txt");
                FileReader ler;
                ler = new FileReader(arquivo);
                BufferedReader organizar = new BufferedReader(ler);
                ArrayList<String> linhas = new ArrayList();
                boolean buscar = false;
                int i = 0;

                while (organizar.ready()) {
                    linhas.add(i, organizar.readLine());
                    i++;
                }
                String Matricula_Aluno = TxtRec_Mat1.getText();
                for (int j = 0; j < linhas.size(); j++) {
                    if (linhas.get(j).equals(Matricula_Aluno)) {
                        linhas.remove(j);
                        linhas.remove(j);
                        linhas.remove(j);
                        linhas.remove(j);
                        linhas.remove(j);
                        linhas.remove(j);
                        linhas.remove(j);
                        linhas.remove(j);
                        linhas.remove(j);

                        buscar = true;
                    }//Fim do if
                }///Fim do for

                if (buscar == false) {
                    JOptionPane.showMessageDialog(null, "O aluno não foi enocntrado");
                }

                FileWriter escrever = new FileWriter(arquivo);
                BufferedWriter organizar2 = new BufferedWriter(escrever);
                for (int j = 0; j < linhas.size(); j++) {
                    organizar2.write(linhas.get(j));
                    organizar2.newLine();
                }
                organizar2.close();
                TxtRec_Mat1.setText(null);
                TxtRec_Nome1.setText(null);
                TxtRec_CPF2.setText(null);
                TxtRec_RG2.setText(null);
                TxtRec_End1.setText(null);
                TxtRec_Cidade1.setText(null);
                TxtRec_Bairro1.setText(null);
                TxtRec_DN2.setText(null);
                curso.setSelectedIndex(0);

            } catch (FileNotFoundException ex) {
                Logger.getLogger(Menu_Princ.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Menu_Princ.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }//GEN-LAST:event_BtExcluirAlunoActionPerformed

    private void BtExcluir_ProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtExcluir_ProfActionPerformed
        // TODO add your handling code here:
        int q = JOptionPane.showConfirmDialog(null, "Você deseja mesmo exluir esse professor?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (q == JOptionPane.YES_OPTION) {
            try {
                File arquivo = new File("Prof.txt");
                FileReader ler;
                ler = new FileReader(arquivo);
                BufferedReader organizar = new BufferedReader(ler);
                ArrayList<String> linhas = new ArrayList();
                boolean buscar = false;
                int i = 0;

                while (organizar.ready()) {
                    linhas.add(i, organizar.readLine());
                    i++;
                }
                String Titulação_Prof = TxtRec_Titula.getText();
                for (int j = 0; j < linhas.size(); j++) {
                    if (linhas.get(j).equals(Titulação_Prof)) {
                        linhas.remove(j);
                        linhas.remove(j);
                        linhas.remove(j);
                        linhas.remove(j);
                        linhas.remove(j);
                        linhas.remove(j);
                        linhas.remove(j);
                        linhas.remove(j);

                        buscar = true;
                    }//Fim do if
                }///Fim do for

                if (buscar == false) {
                    JOptionPane.showMessageDialog(null, "O aluno não foi enocntrado");
                }

                FileWriter escrever = new FileWriter(arquivo);
                BufferedWriter organizar2 = new BufferedWriter(escrever);
                for (int j = 0; j < linhas.size(); j++) {
                    organizar2.write(linhas.get(j));
                    organizar2.newLine();
                }
                organizar2.close();
                TxtRec_Titula.setText(null);
                TxtRec_Nome.setText(null);
                TxtF_Cpf.setText(null);
                TxtF_Rg.setText(null);
                TxtRec_End.setText(null);
                TxtRec_Cidade.setText(null);
                TxtRec_Bairro.setText(null);
                TxtF_Dn.setText(null);

            } catch (FileNotFoundException ex) {
                Logger.getLogger(Menu_Princ.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Menu_Princ.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//GEN-LAST:event_BtExcluir_ProfActionPerformed

    private void BotaoEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoEnviarActionPerformed
        // TODO add your handling code here:
        if ("".equals(Rec_Titu.getText()) || "".equals(Rec_Autor.getText()) || "".equals(Rec_Edi.getText()) || "".equals(Rec_Id.getText()) || "".equals(Rec_Quant.getText())) {
            JOptionPane.showMessageDialog(null, "Verifique se os campos estão preenchidos", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
            int quant = Integer.parseInt(Rec_Quant.getText());
            int ID = Integer.parseInt(Rec_Id.getText());
            Livro ObjLivro = new Livro(Rec_Titu.getText(), Rec_Autor.getText(), Rec_Edi.getText(), ID, quant);
            ListaLivro.add(ObjLivro);
            salvarlivro();

            Rec_Titu.setText(null);
            Rec_Autor.setText(null);
            Rec_Edi.setText(null);
            Rec_Id.setText(null);
            Rec_Quant.setText(null);
            Rec_Titu.requestFocus();

            LoadTabelaLivros();
        }

    }//GEN-LAST:event_BotaoEnviarActionPerformed

    public ArrayList<Livro> getListaLivro() {
        return ListaLivro;
    }

    public void setListaLivro(ArrayList<Livro> ListaLivro) {
        this.ListaLivro = ListaLivro;
    }

    private void BotaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoExcluirActionPerformed
        // TODO add your handling code here:
        int q = JOptionPane.showConfirmDialog(null, "Você deseja mesmo exluir?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (q == JOptionPane.YES_OPTION) {

            remover();
            removerL();

            Rec_Titu.setText(null);
            Rec_Autor.setText(null);
            Rec_Edi.setText(null);
            Rec_Id.setText(null);
            Rec_Quant.setText(null);
            Rec_Titu.requestFocus();

        }


    }//GEN-LAST:event_BotaoExcluirActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        CardLayout tela = (CardLayout) base.getLayout();
        tela.show(base, "inicio");

    }//GEN-LAST:event_jButtonSairActionPerformed

    private void Rec_TituKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Rec_TituKeyTyped
        // TODO add your handling code here
        String valores = "0123456789@!#$%^&*";
        if (valores.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_Rec_TituKeyTyped

    private void Rec_AutorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Rec_AutorKeyTyped
        // TODO add your handling code here:
        String valores = "0123456789@!#$%^&*";
        if (valores.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_Rec_AutorKeyTyped

    private void Rec_EdiKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Rec_EdiKeyTyped
        // TODO add your handling code here:
        String valores = "0123456789@!#$%^&*";
        if (valores.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_Rec_EdiKeyTyped

    private void Rec_IdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Rec_IdKeyTyped
        // TODO add your handling code here:
        String valores = "0123456789";
        if (!valores.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_Rec_IdKeyTyped

    private void Rec_QuantKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Rec_QuantKeyTyped
        // TODO add your handling code here:
        String valores = "0123456789";
        if (!valores.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_Rec_QuantKeyTyped

    private void TableLivrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableLivrosMouseClicked
        // TODO add your handling code here:
        PegarInfo();
        setO(Rec_Titu.getText());
       
    }//GEN-LAST:event_TableLivrosMouseClicked

    private void BtAlterar_AlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAlterar_AlunoActionPerformed
        // TODO add your handling code here:
        if ("".equals(TxtRec_RG2.getText())) {
            JOptionPane.showMessageDialog(null, "Consulte uma matricula");

        } else {

            int q = JOptionPane.showConfirmDialog(null, "Você deseja mesmo alterar?", "Atenção", JOptionPane.YES_NO_OPTION);
            if (q == JOptionPane.YES_OPTION) {
                try {
                    File arquivo = new File("Alunos.txt");
                    FileReader ler = new FileReader(arquivo);
                    BufferedReader org1 = new BufferedReader(ler);
                    ArrayList<String> linhas = new ArrayList<>();
                    boolean buscar = false;
                    int i = 0;
                    while (org1.ready()) {
                        linhas.add(i, org1.readLine());
                        i++;
                    }

                    for (int j = 0; j < linhas.size(); j++) {
                        if (linhas.get(j).equals(TxtRec_Mat1.getText())) {
                            linhas.set(j, TxtRec_Mat1.getText());
                            linhas.set(j + 1, TxtRec_Nome1.getText());
                            linhas.set(j + 2, TxtRec_CPF2.getText());
                            linhas.set(j + 3, TxtRec_RG2.getText());
                            linhas.set(j + 4, TxtRec_End1.getText());
                            linhas.set(j + 5, TxtRec_Cidade1.getText());
                            linhas.set(j + 6, TxtRec_Bairro1.getText());
                            linhas.set(j + 7, TxtRec_DN2.getText());
                            if (curso.getSelectedIndex() == 1) {
                                linhas.set(j + 8, "1");
                            }
                            if (curso.getSelectedIndex() == 2) {
                                linhas.set(j + 8, "2");
                            }
                            if (curso.getSelectedIndex() == 3) {
                                linhas.set(j + 8, "3");
                            }

                            buscar = true;
                        }//Fim do if
                    }///Fim do for
                    if (buscar == false) {
                        JOptionPane.showMessageDialog(null, "Aluno não encontrado");
                    }
                    FileWriter escrever = new FileWriter(arquivo);
                    BufferedWriter organizar2 = new BufferedWriter(escrever);
                    for (int j = 0; j < linhas.size(); j++) {
                        organizar2.write(linhas.get(j));
                        organizar2.newLine();
                    }
                    organizar2.close();
                    TxtRec_Mat1.setText(null);
                    TxtRec_Nome1.setText(null);
                    TxtRec_CPF2.setText(null);
                    TxtRec_RG2.setText(null);
                    TxtRec_End1.setText(null);
                    TxtRec_Cidade1.setText(null);
                    TxtRec_Bairro1.setText(null);
                    TxtRec_DN2.setText(null);
                    curso.setSelectedIndex(0);
                    JOptionPane.showMessageDialog(null, "As alterações foram salvas");
                } catch (Exception erro) {
                }
            }

        }

    }//GEN-LAST:event_BtAlterar_AlunoActionPerformed

    private void BtAlterar_ProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAlterar_ProfActionPerformed
        // TODO add your handling code here:

        if ("".equals(TxtRec_Nome.getText())) {
            JOptionPane.showMessageDialog(null, "Consulte uma Titulação");

        } else {

            int q = JOptionPane.showConfirmDialog(null, "Você deseja mesmo alterar?", "Atenção", JOptionPane.YES_NO_OPTION);
            if (q == JOptionPane.YES_OPTION) {
                try {
                    File arquivo = new File("Prof.txt");
                    FileReader ler = new FileReader(arquivo);
                    BufferedReader org1 = new BufferedReader(ler);
                    ArrayList<String> linhas = new ArrayList();
                    boolean buscar = false;
                    int i = 0;
                    while (org1.ready()) {
                        linhas.add(i, org1.readLine());
                        i++;
                    }

                    for (int j = 0; j < linhas.size(); j++) {
                        if (linhas.get(j).equals(TxtRec_Titula.getText())) {
                            linhas.set(j, TxtRec_Titula.getText());
                            linhas.set(j + 1, TxtRec_Nome.getText());
                            linhas.set(j + 2, TxtF_Cpf.getText());
                            linhas.set(j + 3, TxtF_Rg.getText());
                            linhas.set(j + 4, TxtRec_End.getText());
                            linhas.set(j + 5, TxtRec_Cidade.getText());
                            linhas.set(j + 6, TxtRec_Bairro.getText());
                            linhas.set(j + 7, TxtF_Dn.getText());

                            buscar = true;
                        }//Fim do if
                    }///Fim do for
                    if (buscar == false) {
                        JOptionPane.showMessageDialog(null, "Professor não encontrado");
                    }
                    FileWriter escrever = new FileWriter(arquivo);
                    BufferedWriter organizar2 = new BufferedWriter(escrever);
                    for (int j = 0; j < linhas.size(); j++) {
                        organizar2.write(linhas.get(j));
                        organizar2.newLine();
                    }
                    organizar2.close();
                    TxtRec_Titula.setText(null);
                    TxtRec_Nome.setText(null);
                    TxtF_Cpf.setText(null);
                    TxtF_Rg.setText(null);
                    TxtRec_End.setText(null);
                    TxtRec_Cidade.setText(null);
                    TxtRec_Bairro.setText(null);
                    TxtF_Dn.setText(null);
                    JOptionPane.showMessageDialog(null, "As alterações foram salvas");
                } catch (Exception erro) {
                }
            }

        }
    }//GEN-LAST:event_BtAlterar_ProfActionPerformed

    private void BtAlterarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAlterarLivroActionPerformed
        // TODO add your handling code here:
        int q = JOptionPane.showConfirmDialog(null, "Você deseja mesmo alterar?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (q == JOptionPane.YES_OPTION) {
            
            
            
            int quant = Integer.parseInt(Rec_Quant.getText());
            int ID = Integer.parseInt(Rec_Id.getText());
            Livro ObjLivro = new Livro(Rec_Titu.getText(), Rec_Autor.getText(), Rec_Edi.getText(), ID, quant);
            ListaLivro.add(ObjLivro);
            salvarlivro();
            
            Rec_Titu.setText(getO());
            remover();
            removerL();
            

            LoadTabelaLivros();
            JOptionPane.showMessageDialog(null, "O livro foi alterado");

            Rec_Titu.requestFocus();

        }

    }//GEN-LAST:event_BtAlterarLivroActionPerformed

    private void Bt_EmprestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_EmprestarActionPerformed
        // TODO add your handling code here:

        if ("".equals(TxRec_emprestimo.getText())) {
            JOptionPane.showMessageDialog(null, "Escolha um livro para emprestar");
        } else {
            PegarInfo();
            int quant = Integer.parseInt(Rec_Quant.getText());
            int a = Integer.parseInt(TxRec_emprestimo.getText());
            int b = quant - a;
            if (a > quant) {
                JOptionPane.showMessageDialog(null, "Você não pode emprestar essa quantidade");

            } else {
                try {
                    File arquivo = new File("Livro.txt");
                    FileReader ler = new FileReader(arquivo);
                    BufferedReader org = new BufferedReader(ler);
                    ArrayList<String> linhas = new ArrayList();
                    while (org.ready()) {
                        linhas.add(org.readLine());
                    }

                    boolean buscar = false;
                    for (int i = 0; i < linhas.size(); i++) {
                        if (Rec_Titu.getText().equals(linhas.get(i))) {
                            b = quant - a;
                            JOptionPane.showMessageDialog(null, "Emprestimo feito com sucesso!!! \n" + "O livro " + Rec_Titu.getText() + " está com " + b + " livros");
                            if (b <= quant) {
                                remover();
                                removerL();
                                Rec_Quant.setText(String.valueOf(b));
                                int k = Integer.parseInt(Rec_Quant.getText());
                                int ID = Integer.parseInt(Rec_Id.getText());
                                Livro ObjLivro = new Livro(Rec_Titu.getText(), Rec_Autor.getText(), Rec_Edi.getText(), ID, k);
                                ListaLivro.add(ObjLivro);
                                salvarlivro();

                                TxRec_emprestimo.setText(null);
                                Rec_Titu.requestFocus();

                                LoadTabelaLivros();
                            }
                            buscar = true;
                            break;
                        }
                    }
                    if (buscar == false) {
                        JOptionPane.showMessageDialog(null, "Erro no empresmtimo");
                    }

                } catch (Exception erro) {
                    JOptionPane.showMessageDialog(null, "mds que dificil ser feliz");
                }
            }

        }

    }//GEN-LAST:event_Bt_EmprestarActionPerformed

    private void Bt_DevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_DevolverActionPerformed
        // TODO add your handling code here:
        if ("".equals(TxRec_emprestimo.getText())) {
            JOptionPane.showMessageDialog(null, "Insira um valor para devolver");
        } else {

            if ("".equals(TxRec_emprestimo.getText())) {
                JOptionPane.showMessageDialog(null, "Escolha um livro para devolver");
            } else {
                PegarInfo();
                int quant = Integer.parseInt(Rec_Quant.getText());
                int a = Integer.parseInt(TxRec_emprestimo.getText());
                int b = quant + a;

                try {
                    File arquivo = new File("Livro.txt");
                    FileReader ler = new FileReader(arquivo);
                    BufferedReader org = new BufferedReader(ler);
                    ArrayList<String> linhas = new ArrayList();
                    while (org.ready()) {
                        linhas.add(org.readLine());
                    }

                    boolean buscar = false;
                    for (int i = 0; i < linhas.size(); i++) {
                        if (Rec_Titu.getText().equals(linhas.get(i))) {
                            b = quant + a;
                            JOptionPane.showMessageDialog(null, "Devolução feita com sucesso!!! \n" + "O livro " + Rec_Titu.getText() + " está com " + b + " livros");
                            
                                remover();
                                removerL();
                                Rec_Quant.setText(String.valueOf(b));
                                int k = Integer.parseInt(Rec_Quant.getText());
                                int ID = Integer.parseInt(Rec_Id.getText());
                                Livro ObjLivro = new Livro(Rec_Titu.getText(), Rec_Autor.getText(), Rec_Edi.getText(), ID, k);
                                ListaLivro.add(ObjLivro);
                                salvarlivro();

                                TxRec_emprestimo.setText(null);
                                Rec_Titu.requestFocus();

                                LoadTabelaLivros();
                            
                            buscar = true;
                            break;
                        }
                    }
                    if (buscar == false) {
                        JOptionPane.showMessageDialog(null, "Erro na devolução");
                    }

                } catch (Exception erro) {
                    JOptionPane.showMessageDialog(null, "mds que dificil ser feliz");
                }

            }

        }
    }//GEN-LAST:event_Bt_DevolverActionPerformed

    private void BtCadBols1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCadBols1ActionPerformed
        // TODO add your handling code here:
        
         try{
        File arquivo = new File("Alunos.txt");
        FileReader ler = new FileReader(arquivo);
        BufferedReader org = new BufferedReader(ler);
        ArrayList<String> linhas2 = new ArrayList();
        File arquivo2 = new File("Bolsista.txt");
        FileWriter escrever = new FileWriter(arquivo2, true);
        BufferedWriter abc = new BufferedWriter(escrever);
         while(org.ready()){
        linhas2.add(org.readLine());
         }
        boolean buscar = false;
      for(int i=0; i < linhas2.size(); i++){
      if(TxRec_Mat.getText().equals(linhas2.get(i))){
         abc.write(linhas2.get(i));
         abc.newLine();
         abc.write(linhas2.get(i+1));
         abc.newLine();
         abc.write(linhas2.get(i+2));
         abc.newLine();
         abc.write(TxRec_TituPro.getText());
         abc.newLine();
         abc.write(TxRec_Dura.getText());
         abc.newLine();         
         String curs="";
         if(TipoPro.getSelectedIndex()==1){
             curs="Pesquisa";
         }
         if(TipoPro.getSelectedIndex()==2){
             curs="Extensão";
         }
         abc.write(curs);
         abc.newLine();         
         TxEx_Bol.append("Matricula: "+linhas2.get(i)+"\n");
         TxEx_Bol.append("Nome: "+linhas2.get(i+1)+"\n");
         TxEx_Bol.append("CPF: "+linhas2.get(i+2)+"\n");
         TxEx_Bol.append("RG: "+linhas2.get(i+3)+"\n");
         TxEx_Bol.append("Nome do projeto: "+TxRec_TituPro.getText()+"\n");
         TxEx_Bol.append("Duração do projeto: "+TxRec_Dura.getText()+"\n");
         if(TipoPro.getSelectedIndex()==1){
         TxEx_Bol.append("Tipo de projeto: Pequisa"+"\n");
             
         }
         else if(TipoPro.getSelectedIndex()==2){
         TxEx_Bol.append("Tipo de projeto: Extensão"+"\n");
             
         }
         abc.close();
         JOptionPane.showMessageDialog(null, "Bolsista cadastrado");
         TxRec_Mat.setText(null);
         TxRec_TituPro.setText(null);
         TxRec_Dura.setText(null);
         TipoPro.setSelectedIndex(0);
         buscar = true;
         break;
         }        
      } 
     if(buscar == false){
    JOptionPane.showMessageDialog(null, "Não foi encontrado o cadastro");
      }
        }
        catch(Exception Erro){
            
            }
    }//GEN-LAST:event_BtCadBols1ActionPerformed

    private void Bt_excluirbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_excluirbolActionPerformed
        // TODO add your handling code here:
        if("".equals(TxRec_Mat.getText())){
            JOptionPane.showMessageDialog(null, "Insira uma matricula pra poder remover");
        }
        else{

            try {
                File arquivo = new File("Bolsista.txt");
                FileReader ler = new FileReader(arquivo);
                BufferedReader org = new BufferedReader(ler);
                ArrayList<String> Linhas = new ArrayList();
                boolean busca =false;
                int i=0;
                while (org.ready()) {
                    Linhas.add(org.readLine());
                    i++;
                }

                boolean buscar = false;
                for (int j = 0; j < Linhas.size(); j++) {
                    if (TxRec_Mat.getText().equals(Linhas.get(i))) {
                        TxRec_TituPro.setText(Linhas.get(i + 3));
                        TxRec_Dura.setText(Linhas.get(i + 4));
                        if (Linhas.get(i + 5).equals("Pesquisa")) {
                            TipoPro.setSelectedIndex(1);
                        }
                        if (Linhas.get(i + 5).equals("Extensão")) {
                            TipoPro.setSelectedIndex(2);
                        }

                        Linhas.remove(j);
                        Linhas.remove(j);
                        Linhas.remove(j);
                        Linhas.remove(j);
                        Linhas.remove(j);
                        Linhas.remove(j);
                        
                        TxRec_Mat.setText(null);
                        TxRec_Dura.setText(null);
                        TxRec_TituPro.setText(null);
                        TipoPro.setSelectedIndex(0);

                        busca = true;
                        break;
                    }
                }
                if (buscar == false) {
                    JOptionPane.showMessageDialog(null, "Matricula nao encontrado!");
                }

            } catch (Exception erro) {
                JOptionPane.showMessageDialog(null, "Erro");
            }
        }
    }//GEN-LAST:event_Bt_excluirbolActionPerformed

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
            java.util.logging.Logger.getLogger(Menu_Princ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Princ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Princ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Princ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Princ().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bolsista;
    private javax.swing.JButton BotaoEnviar;
    private javax.swing.JButton BotaoExcluir;
    private javax.swing.JButton BtAlterarLivro;
    private javax.swing.JButton BtAlterar_Aluno;
    private javax.swing.JButton BtAlterar_Prof;
    private javax.swing.JButton BtCad1;
    private javax.swing.JButton BtCadBols1;
    private javax.swing.JButton BtCad_Prof;
    private javax.swing.JButton BtCons_Prof;
    private javax.swing.JButton BtConsultar;
    private javax.swing.JButton BtExcluirAluno;
    private javax.swing.JButton BtExcluir_Prof;
    private javax.swing.JButton BtVoltar;
    private javax.swing.JButton BtVoltar2;
    private javax.swing.JButton Bt_Cad_Alu;
    private javax.swing.JButton Bt_Cad_Bolsista;
    private javax.swing.JButton Bt_Cad_Livro;
    private javax.swing.JButton Bt_Cad_Prof;
    private javax.swing.JButton Bt_Devolver;
    private javax.swing.JButton Bt_Emprestar;
    private javax.swing.JButton Bt_excluirbol;
    private javax.swing.JButton Bt_vol;
    private javax.swing.JPanel Cad_Alu;
    private javax.swing.JPanel Cad_Prof;
    private javax.swing.JPanel Livrooo;
    private javax.swing.JTextField Rec_Autor;
    private javax.swing.JTextField Rec_Edi;
    private javax.swing.JTextField Rec_Id;
    private javax.swing.JTextField Rec_Quant;
    private javax.swing.JTextField Rec_Titu;
    private javax.swing.JTable TableLivros;
    private javax.swing.JComboBox<String> TipoPro;
    private javax.swing.JTextArea TxEx_Bol;
    private javax.swing.JTextField TxRec_Dura;
    private javax.swing.JTextField TxRec_Mat;
    private javax.swing.JTextField TxRec_TituPro;
    private javax.swing.JTextField TxRec_emprestimo;
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
    private javax.swing.JButton jButtonSair;
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
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private BufferedReader BufferedReader(FileWriter escrever) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private BufferedWriter BufferedWriter(FileWriter escrever) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
