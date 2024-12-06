package ghost;

import ghost.Player;
import javax.swing.*;
import java.awt.*;

public class MostrarDatosJugador extends JFrame {

    public MostrarDatosJugador(Player jugador) {
        // Configuracion de la ventana
        setTitle("Datos del Jugador");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crear un panel principal con un diseño de caja vertical
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Agregar datos basicos del jugador
        panel.add(createLabel("Nombre de Usuario: " + jugador.getUsername()));
        panel.add(createLabel("Puntos: " + jugador.getPuntos()));
        panel.add(createLabel("Partidas Ganadas: " + jugador.getPartidasGanadas()));

        // Mostrar la contraseña de manera oculta
        panel.add(createLabel("Contraseña: ******** "));

        // el panel principal al JFrame
        add(panel);

        // Hacer visible la ventana
        setVisible(true);
    }

    // Método auxiliar para crear etiquetas con un estilo consistente
    private JLabel createLabel(String text) {
        JLabel label = new JLabel(text);
        label.setAlignmentX(Component.CENTER_ALIGNMENT); // Centra la etiqueta
        return label;
    }
}