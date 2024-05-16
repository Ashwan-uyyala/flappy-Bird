import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        int bordwidth=360;
        int bordheight=640;
        JFrame frame =new JFrame("Flappy Bird");
        //frame.setVisible(true);
        frame.setSize(bordwidth,bordheight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     

        FlappyBird flappybird=new FlappyBird();
        frame.add(flappybird);
        frame.pack();
        flappybird.requestFocus();
        frame.setVisible(true);
    }
}
