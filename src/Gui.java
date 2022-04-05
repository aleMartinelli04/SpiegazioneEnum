import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Gui extends JFrame {
    private JPanel panel;
    private JTextField nomeEventoField;
    // specifico che la combo box deve contenere giorni
    private JComboBox<Giorni> giornoEventoField;
    private JTextArea displayEventi;
    private JButton mostraEventiButton;
    private JButton aggiungiEventoButton;


    private final ArrayList<Evento> eventi;

    public Gui() {
        super("Spiegazione enum");

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setSize(Toolkit.getDefaultToolkit().getScreenSize().width / 3, Toolkit.getDefaultToolkit().getScreenSize().height / 3);
        setLocationRelativeTo(null);

        setContentPane(panel);

        // aggiungo i giorni alla combo box
        for (Giorni giorno : Giorni.values()) {
            giornoEventoField.addItem(giorno);
        }

        this.eventi = new ArrayList<>();

        aggiungiEventoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Giorni giorno = (Giorni) giornoEventoField.getSelectedItem();

                Evento evento = new Evento(nomeEventoField.getText(), giorno);

                eventi.add(evento);

                nomeEventoField.setText("");
                giornoEventoField.setSelectedIndex(0);
            }
        });


        mostraEventiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayEventi.setText("");

                for (Evento evento : eventi) {
                    displayEventi.append(evento.toString() + "\n");
                }
            }
        });
    }
}
