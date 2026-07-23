
import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ddaym
 */
public class Planner extends JFrame{
    
    private JPanel formPanel;
    private JPanel buttonPanel;
    private JPanel outputPanel;
    
    private JLabel lblName;
    private JLabel lblType;
    private JLabel lblGuests;
    private JLabel lblServices;
    
    private JTextField tfName;
    private JComboBox eventType;
    private JSpinner questsSpn;
    
    private JCheckBox ckCatering;
    private JCheckBox ckPhoto;
    private JCheckBox ckDJ;
    
    public Planner(){
        setTitle("Event Planner Pro");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(350,500);
        setLocationRelativeTo(null);
        
        lblName = new JLabel("Event Name");
        tfName = new JTextField(15);
        lblType = new JLabel("Event type");
        String[] events = {"Conference","Social picnic","School Meeting"};
        eventType = new JComboBox<String>(events);
        lblGuests = new JLabel("Number of Guests");
        SpinnerNumberModel guests = new SpinnerNumberModel(150, 150, 300, 1);
        questsSpn = new JSpinner(guests);
        formPanel = new JPanel();
        
        //Check boxes with options
        lblServices = new JLabel("Optional Services");
        ckCatering = new JCheckBox("Catering");
        ckPhoto = new JCheckBox("Photography");
        ckDJ = new JCheckBox("DJ");
        
        //What will be displayed
        formPanel.add(lblName);formPanel.add(lblType);formPanel.add(lblGuests);
        formPanel.add(tfName);formPanel.add(eventType);formPanel.add(questsSpn);
        formPanel.add(lblServices);
        formPanel.add(ckCatering);formPanel.add(ckPhoto);formPanel.add(ckDJ);
        add(formPanel);
    }
    
}
