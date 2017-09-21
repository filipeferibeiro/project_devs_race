import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.util.Arrays;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class FazGrafico {

    public static void main(String[] args) {
        List<GraficoDeBarras.Dado> dados = Arrays.asList(
                new GraficoDeBarras.Dado(6, "Projeto_1"),
                new GraficoDeBarras.Dado(9, "Projeto_2"),
                new GraficoDeBarras.Dado(3, "Projeto_3"),
                new GraficoDeBarras.Dado(1, "Projeto_4"),
                new GraficoDeBarras.Dado(12, "Projeto_5"),
                new GraficoDeBarras.Dado(-1, "Projeto_6"));
        BufferedImage imagem = GraficoDeBarras.desenharTamanhoFixo(500, 180, dados);
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                mostraImagem(imagem);
            }
        });
    }

    private static void mostraImagem(BufferedImage imagem) {
        JFrame jf = new JFrame("Pontuação por projeto");
        JPanel jp = new JPanel() {
            @Override
            public void paintComponent(Graphics g) {
                g.drawImage(imagem, 0, 0, null);
            }
        };
        jf.add(jp, BorderLayout.CENTER);
        jp.setPreferredSize(new Dimension(imagem.getWidth(), imagem.getHeight()));
        jf.setResizable(false);
        jf.pack();
        jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        jf.setLocation((screen.width - jf.getWidth()) / 2, (screen.height - jf.getHeight()) / 2);
        jf.setVisible(true);
    }
}