/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ghost;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

/**
 *
 * @author DELL
 */
public class CambiarPassword extends JFrame {
    private Player jugador;  // El jugador cuyo password se va a cambiar

    // Componentes de la interfaz
    private JPasswordField passwordActualField;
    private JPasswordField nuevaPasswordField;
    private JPasswordField confirmarPasswordField;
    private JButton cambiarButton;
    private JButton cancelarButton;

    public CambiarPassword(Player jugador) {
        this.jugador = jugador;

        // Configuración básica de la ventana
        setTitle("Cambiar Contraseña");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crear panel y establecer layout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 10, 10));  // GridLayout para organizar los campos

        // Etiquetas y campos para las contraseñas
        panel.add(new JLabel("Contraseña Actual:"));
        passwordActualField = new JPasswordField();
        panel.add(passwordActualField);

        panel.add(new JLabel("Nueva Contraseña:"));
        nuevaPasswordField = new JPasswordField();
        panel.add(nuevaPasswordField);

        panel.add(new JLabel("Confirmar Contraseña:"));
        confirmarPasswordField = new JPasswordField();
        panel.add(confirmarPasswordField);

        // Botones
        cambiarButton = new JButton("Cambiar Contraseña");
        panel.add(cambiarButton);
        
        cancelarButton = new JButton("Cancelar");
        panel.add(cancelarButton);

        // Añadir el panel al JFrame
        add(panel);

        // Hacer visible la ventana
        setVisible(true);

        // Acción para el botón de cambiar contraseña
        cambiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarContraseña();
            }
        });

        // Acción para el botón de cancelar (cerrar la ventana)
        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();  // Cierra la ventana sin hacer cambios
            }
        });
    }

    private void cambiarContraseña() {
        // Obtener las contraseñas ingresadas
        String passwordActual = new String(passwordActualField.getPassword());
        String nuevaPassword = new String(nuevaPasswordField.getPassword());
        String confirmarPassword = new String(confirmarPasswordField.getPassword());

        // Verificar que la contraseña actual coincida con la almacenada
        if (!passwordActual.equals(jugador.getPassword())) {
            JOptionPane.showMessageDialog(this, "La contraseña actual es incorrecta.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Verificar que las nuevas contraseñas coincidan
        if (!nuevaPassword.equals(confirmarPassword)) {
            JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Actualizar la contraseña
        jugador.setPassword(nuevaPassword);
        JOptionPane.showMessageDialog(this, "Contraseña cambiada con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);

        // Cerrar la ventana después de cambiar la contraseña
        dispose();
    }
}