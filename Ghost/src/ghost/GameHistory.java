package ghost;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class GameHistory {
    // Clase para representar un juego
    public static class Game {
        private final String jugador1;
        private final String jugador2;
        private final String resultado;

        public Game(String jugador1, String jugador2, String resultado) {
            this.jugador1 = jugador1;
            this.jugador2 = jugador2;
            this.resultado = resultado;
        }

        @Override
        public String toString() {
            return "Jugador 1: " + jugador1 + " vs Jugador 2: " + jugador2 + " - Resultado: " + resultado;
        }
    }

    // Arreglo para almacenar hasta 10 juegos
    private final Game[] games;
    private int size; 
    private int start; 

    public GameHistory() {
        this.games = new Game[10];
        this.size = 0;
        this.start = 0;
    }

    // Metodo para agregar un juego
    public void agregarJuego(String jugador1, String jugador2, boolean ganaste) {
        String resultado = ganaste ? "Ganaste" : "Perdiste";
        Game nuevoJuego = new Game(jugador1, jugador2, resultado);

        // Insertar en el siguiente espacio disponible o sobrescribir el mas antiguo
        int nextIndex = (start + size) % games.length;
        games[nextIndex] = nuevoJuego;

        if (size < games.length) {
            size++;
        } else {
            // Mover el inicio si sobrescribimos el juego mas antiguo
            start = (start + 1) % games.length;
        }
    }

    // Metodo para mostrar los últimos juegos en un JFrame
    public void mostrarHistorialSwing() {
        // Crear el JFrame para mostrar el historial
        JFrame frame = new JFrame("Historial de Juegos");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 300);

        // Crear un JTextArea para mostrar el historial
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);

        if (size == 0) {
            textArea.setText("No hay juegos registrados.");
        } else {
            StringBuilder historial = new StringBuilder("Historial de los últimos 10 juegos:\n");
            for (int i = 0; i < size; i++) {
                int index = (start + i) % games.length;
                historial.append(games[index].toString()).append("\n");
            }
            textArea.setText(historial.toString());
        }

        // Añadir el JTextArea a un JScrollPane
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Hacer visible el JFrame
        frame.setVisible(true);
    }
}