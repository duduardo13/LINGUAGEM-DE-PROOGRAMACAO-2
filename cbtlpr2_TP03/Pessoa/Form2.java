//Aluna: Laysa Bernardes Campos da Rocha - CB3024873 
//Aluno: Lucas Lopes Cruz - CB3025284 

package Pessoa;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Form2 extends JFrame implements ActionListener {
    private JTextField campoNome, campoIdade;
    private JComboBox<String> comboSexo;
    private JLabel labelNumero;
    private List<Pessoa> pessoas;

    public Form2() {
        setTitle("Versao 2.0");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        pessoas = new ArrayList<>();

        JPanel painelCampos = new JPanel(new GridLayout(4,
                2));

        painelCampos.add(new JLabel("Numero:"));
        labelNumero = new JLabel(String.valueOf(Pessoa.getKp()));
        painelCampos.add(labelNumero);

        painelCampos.add(new JLabel("Nome:"));
        campoNome = new JTextField();
        painelCampos.add(campoNome);

        painelCampos.add(new JLabel("Sexo:"));
        comboSexo = new JComboBox<>(new String[] { "M", "F" });
        painelCampos.add(comboSexo);

        painelCampos.add(new JLabel("Idade:"));
        campoIdade = new JTextField();
        painelCampos.add(campoIdade);

        add(painelCampos, BorderLayout.CENTER);
        
        JPanel painelBotoes = new JPanel();
        painelBotoes.setLayout(new FlowLayout(FlowLayout.LEFT));
        JButton btnOk = new JButton("OK");
        btnOk.addActionListener(this);
        painelBotoes.add(btnOk);
        JButton btnMostrar = new JButton("Mostrar");
        btnMostrar.addActionListener(this);
        painelBotoes.add(btnMostrar);
        JButton btnLimpar = new JButton("Limpar");
        btnLimpar.addActionListener(this);
        painelBotoes.add(btnLimpar);
        JButton btnSair = new JButton("Sair");
        btnSair.addActionListener(this);
        painelBotoes.add(btnSair);
        add(painelBotoes, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();

        if (comando.equals("OK")) {
            String nome = campoNome.getText();
            String sexoStr = (String) comboSexo.getSelectedItem();
            String idadeStr = campoIdade.getText();

            if (nome.isEmpty() || sexoStr.isEmpty() || idadeStr.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Todos os campos sao obrigatorios!");
                return;
            }

            try {
                int idade = Integer.parseInt(idadeStr);
                char sexo = sexoStr.charAt(0);

                Pessoa novaPessoa = new Pessoa(nome, sexo, idade);
                pessoas.add(novaPessoa);

                labelNumero.setText(String.valueOf(Pessoa.getKp()));

                JOptionPane.showMessageDialog(this, "Dados salvos com sucesso!");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Idade deve ser um número valido.");
            }
        } else if (comando.equals("Mostrar")) {
            if (pessoas.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Nenhuma pessoa cadastrada.");
            } else {
                StringBuilder dados = new StringBuilder("Pessoas cadastradas:\n");
                for (Pessoa pessoa : pessoas) {
                    dados.append("Nome: ").append(pessoa.getNome())
                            .append(", Sexo: ").append(pessoa.getSexo())
                            .append(", Idade: ").append(pessoa.getIdade())
                            .append("\n");
                }
                dados.append("\nTotal de pessoas: ").append(Pessoa.getKp());
                JOptionPane.showMessageDialog(this, dados.toString());
            }
        } else if (comando.equals("Limpar")) {
            campoNome.setText("");
            comboSexo.setSelectedIndex(0);
            campoIdade.setText("");
            JOptionPane.showMessageDialog(this, "Campos limpos!");
        } else if (comando.equals("Sair")) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        Form2 form = new Form2();
        form.setVisible(true);
    }
}