
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
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
    
    private JButton btnSummary;
    private JButton btnClear;
 
    private JTextArea tSummary;
    
    private JScrollPane scrollPane;
    
    public Planner(){
        setTitle("Event Planner Pro");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,600);
        setLocationRelativeTo(null);
        
        
        //The Form Panel
        lblName = new JLabel("Event Name");
        tfName = new JTextField(15);
        lblType = new JLabel("Event type");
        String[] events = {"Conference","Social picnic","School Meeting"};
        eventType = new JComboBox<String>(events);
        lblGuests = new JLabel("Number of Guests");
        SpinnerNumberModel guests = new SpinnerNumberModel(100, 50, 200, 1);
        questsSpn = new JSpinner(guests);
        
        
        //Check boxes with options
        lblServices = new JLabel("Optional Services");
        ckCatering = new JCheckBox("Catering");
        ckPhoto = new JCheckBox("Photography");
        ckDJ = new JCheckBox("DJ");
        
        btnSummary = new JButton("Generate Summary");
        btnClear = new JButton("Clear");
        
        
        tSummary = new JTextArea(12,25);
        scrollPane = new JScrollPane(tSummary);
        
        
        //What will be displayed
        formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(0,1));
        formPanel.add(lblName);
        formPanel.add(tfName);
        
        formPanel.add(lblType);
        formPanel.add(eventType);
        
        formPanel.add(lblGuests);
        formPanel.add(questsSpn);
        
        formPanel.add(lblServices);
        formPanel.add(ckCatering);
        formPanel.add(ckPhoto);
        
        formPanel.add(ckDJ);
        
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(btnSummary);
        buttonPanel.add(btnClear);
        
        //The Summary
        outputPanel = new JPanel();
        //outputPanel.add(tSummary);
        outputPanel.add(scrollPane);
        
        setLayout(new BorderLayout());
                
        add(formPanel,BorderLayout.NORTH);
        add(outputPanel, BorderLayout.SOUTH);
        add(buttonPanel, BorderLayout.CENTER);
        
        setVisible(true);
    }
    
}
