package projecten2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


        
public abstract class MeldingTest implements ActionListener{
    
    public static void main(String[] args){
        JLabel idMeldingLbl = new JLabel("idMelding: ");
        final JTextField idMeldingTxt = new JTextField(20);
         JLabel gebruikerIdLbl = new JLabel("gebruikerId: ");
        final JTextField gebruikerIdTxt = new JTextField(20);
        JLabel titelLbl = new JLabel("Titel: ");
        final JTextField titelTxt = new JTextField(20);
        JLabel typeLbl = new JLabel("Type: ");
        final JComboBox typeCBox = new JComboBox(SType.values());
        //typeCBox.setModel(new DefaultComboBoxModel(SType.values()));
         JLabel locatieLbl = new JLabel("locatie: ");
        final JTextField locatieTxt = new JTextField(20);
        JLabel omschrijvingLbl = new JLabel("Omschrijving: ");
        final JTextArea omschrijvingTArea = new JTextArea(5, 20);
         JLabel afbeeldingIdLbl = new JLabel("afbeeldingId: ");
        final JTextField afbeeldingIdTxt = new JTextField(20);
        JButton toevoegenBtn = new JButton("Toevoegen");
        
        
        JPanel pane = new JPanel();
        pane.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(3, 3, 3, 3);
        c.anchor = GridBagConstraints.LINE_END;
        
        c.gridx = 0;
        c.gridy = 0;
        c.weightx = 0;
        c.weighty = 0;
        c.fill = GridBagConstraints.NONE;
        pane.add(titelLbl, c);
        
        c.gridx = 1;
        c.gridy = 0;
        c.weightx = 1;
        c.weighty = 0;
        c.fill = GridBagConstraints.HORIZONTAL;
        pane.add(titelTxt, c);
        
        c.gridx = 0;
        c.gridy = 1;
        c.weightx = 0;
        c.weighty = 0;
        c.fill = GridBagConstraints.NONE;
        pane.add(typeLbl, c);
        
        c.gridx = 1;
        c.gridy = 1;
        c.weightx = 0;
        c.weighty = 0;
        c.fill = GridBagConstraints.HORIZONTAL;
        pane.add(typeCBox, c);
        
        c.gridx = 0;
        c.gridy = 2;
        c.weightx = 0;
        c.weighty = 0;
        c.fill = GridBagConstraints.NONE;
        pane.add(omschrijvingLbl, c);
        
        c.gridx = 1;
        c.gridy = 2;
        c.weightx = 0;
        c.weighty = 0;
        c.fill = GridBagConstraints.BOTH;
        pane.add(omschrijvingTArea, c);
        
        c.gridx = 1;
        c.gridy = 3;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 0;
        c.weighty = 0;
        c.fill = GridBagConstraints.NONE;
        pane.add(toevoegenBtn, c);
        
        JFrame frame = new JFrame("Situatie");
        frame.setContentPane(pane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.pack();
           
             //DBConnectie connectie = new DBConnectie();
          Situatie s = new Situatie(Integer.parseInt(idMeldingTxt.getText()), Integer.parseInt(gebruikerIdTxt.getText()),
                            titelTxt.getText(),(SType) typeCBox.getSelectedItem(), locatieTxt.getText(), omschrijvingTArea.getText());
          //connectie.addSituatie(s);
        toevoegenBtn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
              // Situatie situatie = new Situatie(titelTxt.getText(),
                //        (SType) typeCBox.getSelectedItem(), omschrijvingTArea.getText());
                
                //System.out.println("Situatie toegevoegd:" + situatie.getTitel() +", " + situatie.getType() +", " + situatie.getOmschrijving());
               //Databaseconnectie connectie = new Databaseconnectie();
           
              //  try {
                    //connectie.situatieToevoegen(situatie);
                  
                // catch (SQLException ex) {
                  //  Logger.getLogger(MeldingTest.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            //}  
               
        });
    }

    
    
}