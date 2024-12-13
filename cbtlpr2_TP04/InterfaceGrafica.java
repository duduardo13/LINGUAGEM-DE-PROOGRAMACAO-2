import javax.swing.*;
import java.awt.*;

public class InterfaceGrafica {
    public static void main(String[] args) {
        // Criação do frame principal
        JFrame frame = new JFrame("Trabalho Prático 04");
        frame.setSize(500, 400); // Aumentar tamanho da janela para acomodar o campo maior
        frame.setLayout(new BorderLayout());

        // Painel superior para o campo de busca
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        JLabel nomeLabel = new JLabel("Nome:");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.LINE_END;
        topPanel.add(nomeLabel, gbc);

        JTextField nomeField = new JTextField(23); // Campo de busca maior
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.LINE_START;
        topPanel.add(nomeField, gbc);

        JButton pesquisarButton = new JButton("Pesquisar");
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.weightx = 1.0;
        topPanel.add(pesquisarButton, gbc);

        // Painel central para os campos de detalhes
        JPanel centerPanel = new JPanel(new GridLayout(3, 2, 5, 5));
        JLabel labelNome = new JLabel("Nome:");
        JTextField fieldNome = new JTextField(20); // Campos de detalhes maiores
        JLabel labelSalario = new JLabel("Salário:");
        JTextField fieldSalario = new JTextField(20);
        JLabel labelCargo = new JLabel("Cargo:");
        JTextField fieldCargo = new JTextField(20);

        centerPanel.add(labelNome);
        centerPanel.add(fieldNome);
        centerPanel.add(labelSalario);
        centerPanel.add(fieldSalario);
        centerPanel.add(labelCargo);
        centerPanel.add(fieldCargo);

        // Painel inferior para os botões de navegação
        JPanel bottomPanel = new JPanel(new GridLayout(1, 2, 10, 10));
        JButton anteriorButton = new JButton("Anterior");
        JButton proximoButton = new JButton("Próximo");

        // Tornar os botões mais largos
        anteriorButton.setPreferredSize(new Dimension(150, 30));
        proximoButton.setPreferredSize(new Dimension(150, 30));

        bottomPanel.add(anteriorButton);
        bottomPanel.add(proximoButton);

        // Adicionando os painéis ao frame principal
        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(centerPanel, BorderLayout.CENTER);
        frame.add(bottomPanel, BorderLayout.SOUTH);

        // Método para fechar a janela quando clicar no "X" usando a classe WindowCloseListener
        frame.addWindowListener(new WindowCloseListener());

        // Tornar o frame visível
        frame.setVisible(true);
    }
}
