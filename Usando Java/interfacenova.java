import javax.swing.*; // Para interface
import java.awt.event.*;

public class interfacenova {

    public static void main(String[] args) {
        // Cria a janela
        JFrame frame = new JFrame("Interface");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cria o painel principal com layout vertical
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Cria os textos
        JLabel text1 = new JLabel("Olá, Pedro!");
        JLabel text2 = new JLabel("Como você está? Responda: S/N");
        JTextField input1 = new JTextField();
        JLabel text3 = new JLabel("");
        input1.setMaximumSize(new java.awt.Dimension(300, 30));

        // É uma estrutura que chama o 'enter' da pessoa ao fazer um input.
        // Nele se encontra cada situação usando o .equals que é o mesmo que '==' no python
        // O texto 3 recebe um novo texto caso cumpra a condição; 
        
        input1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String textoDigitado = input1.getText();  
                if (textoDigitado.equalsIgnoreCase("S")) {
                    text3.setText("Que bom! Fico feliz em ler isso.");
                }else if(textoDigitado.equalsIgnoreCase("N")){
                    text3.setText("Que péssimo! Fico triste em ler isso.");
                }else{
                    text3.setText("Você digitou errado. Você digitou: " + textoDigitado + "Só pode digitar: S ou N.");
                }
            }
        });

        // Centraliza os textos no painel
        text1.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        text2.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        input1.setAlignmentX(JTextField.CENTER_ALIGNMENT);
        text3.setAlignmentX(JLabel.CENTER_ALIGNMENT);

        // Adiciona espaçamento entre os textos
        panel.add(Box.createVerticalStrut(20)); // espaço antes do texto1
        panel.add(text1);
        panel.add(Box.createVerticalStrut(10)); // espaço entre os textos
        panel.add(text2);
        panel.add(input1);
        panel.add(text3);

        // Adiciona o painel à janela, e atualiza as variáveis de texto com .setText()
        frame.setContentPane(panel);
        frame.setVisible(true);
        panel.revalidate();
        panel.repaint();

    }
}