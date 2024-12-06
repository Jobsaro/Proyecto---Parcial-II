
package ghost;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class EliminarCuenta extends JFrame {
    private Player jugador;  
    private menu_inicio menuInicio;  
    private JFrame ventanaDatos;  

    // Componentes de la interfaz
    private JButton eliminarButton;
    private JButton cancelarButton;

    // Constructor
    public EliminarCuenta(Player jugador, menu_inicio menuInicio, JFrame ventanaDatos) {
        this.jugador = jugador;
        this.menuInicio = menuInicio;  
        // Se recibe la referencia de menu_inicio
        this.ventanaDatos = ventanaDatos;  
        // Se recibe la referencia de la ventana "Mis Datos" o la ventana a cerrar

        // Configuracion basica de la ventana
        setTitle("Eliminar Cuenta");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crear panel y establecer el layout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1, 10, 10));  

        // Mensaje de confirmacion
        JLabel confirmacionLabel = new JLabel("Estas seguro de que deseas eliminar tu cuenta?");
        confirmacionLabel.setHorizontalAlignment(JLabel.CENTER);
        panel.add(confirmacionLabel);

        // Botton para eliminar la cuenta
        eliminarButton = new JButton("Eliminar Cuenta");
        panel.add(eliminarButton);

        // Botón para cancelar la accion
        cancelarButton = new JButton("Cancelar");
        panel.add(cancelarButton);

        // Añadir el panel al JFrame
        add(panel);

        // Hacer visible la ventana
        setVisible(true);

        // Accion para el boton de eliminar cuenta
        eliminarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eliminarCuenta();
            }
        });

        // Accion para el botn de cancelar (cerrar la ventana)
        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();  
// Cierra la ventana sin hacer cambios
            }
        });
    }

    private void eliminarCuenta() {
        // Pedir confirmación para eliminar la cuenta
        int confirm = JOptionPane.showConfirmDialog(this, 
                "Estas seguro de que deseas eliminar permanentemente tu cuenta?", 
                "Confirmación", JOptionPane.YES_NO_OPTION);

        // Si el usuario confirma la eliminación
        if (confirm == JOptionPane.YES_OPTION) {
            // Aquí realizarías el proceso de eliminar la cuenta. 
            // Para este ejemplo, simplemente mostramos un mensaje.
            JOptionPane.showMessageDialog(this, "Cuenta eliminada exitosamente.", 
                    "Exito", JOptionPane.INFORMATION_MESSAGE);

            // Cerrar la ventana de EliminarCuenta
            dispose();

            // Cerrar la ventana de Mis Datos
            if (ventanaDatos != null) {
                ventanaDatos.dispose();  // Cerramos la ventana de Mis Datos
            }

            // Crear una nueva instancia de menu_inicio y mostrarla
            menu_inicio menu = new menu_inicio();  
            // Crear una nueva instancia de menu_inicio
            menu.setVisible(true);  
        }
    }
}