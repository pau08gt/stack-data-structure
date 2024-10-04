import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JPanel {
    private JPanel principal;
    private JTextField txtCodigo;
    private JButton publicarButton;
    private JTextField txtTitulo;
    private JTextArea txtAMensaje;
    private JTextArea textUltimo;
    private JButton butUltimoPub;
    private JButton borrarButton;
    private JButton bntListar;
    private JButton button1;
    private Pila blog=new Pila();

    public Ventana(){

        publicarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int codigo= Integer.parseInt(txtCodigo.getText());
                String titulo=txtTitulo.getText();
                String mensaje= txtAMensaje.getText();
                Publicacion post=new Publicacion(codigo,titulo,mensaje);
                blog.push(post);
                JOptionPane.showMessageDialog(null, "Se ha agregado");
                txtCodigo.setText("");
                txtTitulo.setText("");
                txtAMensaje.setText("");
                textUltimo.setText("");
            }
        });
        butUltimoPub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Publicacion elemento=blog.top();
                    textUltimo.setText(elemento.toString());
                }
                catch (Exception ex)
                {
                JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });
        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Publicacion elemento=blog.pop();
                    JOptionPane.showMessageDialog(null, "Se ha borrado");
                    textUltimo.setText(null);
                }
                catch (Exception ex)
                {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });

        bntListar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    textUltimo.setText(blog.toString());
                }
                catch (Exception ex)
                {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana");
        frame.setContentPane(new Ventana().principal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        Dimension minTam= new Dimension(300,600);
        frame.setMinimumSize(minTam);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
