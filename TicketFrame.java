
package za.ac.tut.ticketframe;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;


public class TicketFrame extends JFrame{
    private JPanel headingPnl;
    private JPanel namePnl;
    private JPanel surnamePnl;
    private JPanel cellphonePnl;
    private JPanel customerDetailsPnl;
    private JPanel homeTeamPnl;
    private JPanel awayTeamPnl;
    private JPanel ticketCostPnl;
    private JPanel numTicketsPnl;
    private JPanel totAmntDuePnl;
    private JPanel ticketsPnl;
    private JPanel btnsPnl;
    private JPanel ticketsBtnsCombinedPnl;
    private JPanel mainPnl;

    private JLabel headingLbl;
    private JLabel nameLbl;
    private JLabel surnameLbl;
    private JLabel cellphoneLbl; 
    private JLabel homeTeamLbl;
    private JLabel awayTeamLbl;
    private JLabel ticketCostLbl;
    private JLabel numTicketLbl;
    private JLabel totAmntDueLbl;
    
    private JTextField nameTxtF;
    private JTextField surnameTxtF;
    private JTextField cellphoneTxtF;
    private JTextField homeTeamTxtF;
    private JTextField awayTeamTxtF;
    private JTextField ticketCostTxtF;
    private JTextField totAmntDueTxtF;
    
    private JSlider numTicketsSld;
    
    private JButton buyBtn;
    private JButton clearBtn;
    private JButton exitBtn;
    
    public TicketFrame()
    {
        setTitle("Ticket sales");
        setSize(600,650);
        setResizable(true);
        setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        headingPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        namePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        surnamePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        cellphonePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        customerDetailsPnl = new JPanel(new GridLayout(3,1,1,1));
        customerDetailsPnl.setBorder(new TitledBorder(new LineBorder(Color.BLUE,2),"Customer Details"));
        
        homeTeamPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        awayTeamPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        ticketCostPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        numTicketsPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        totAmntDuePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        ticketsPnl = new JPanel(new GridLayout(5,1,1,1));
        ticketsPnl.setBorder(new TitledBorder(new LineBorder(Color.BLUE,2),"Ticket Details"));
        
        btnsPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        ticketsBtnsCombinedPnl = new JPanel(new BorderLayout());
        mainPnl = new JPanel(new BorderLayout());
        
        headingLbl = new JLabel("Soccer Match Tickets");
        headingLbl.setFont(new Font(Font.SERIF, Font.BOLD + Font.ITALIC,40));
        headingLbl.setForeground(Color.CYAN);
        
        nameLbl = new JLabel("Name:     ");
        surnameLbl = new JLabel("Surname:     ");
        cellphoneLbl = new JLabel("Cellphone:     ");
        homeTeamLbl = new JLabel("Home Team:     ");
        awayTeamLbl = new JLabel("Away Team:     ");
        ticketCostLbl = new JLabel("Cost price:     ");
        numTicketLbl = new JLabel("Number of tickets required:     ");
        totAmntDueLbl = new JLabel("Total Amout Due:     R");
        
        nameTxtF = new JTextField(10);
        nameTxtF.setFocusable(true);
        
        surnameTxtF = new JTextField(10);
        cellphoneTxtF = new JTextField(10);
        homeTeamTxtF = new JTextField(10);
        awayTeamTxtF = new JTextField(10);
        ticketCostTxtF = new JTextField(10);
      
        totAmntDueTxtF = new JTextField(20);
        totAmntDueTxtF.setText("To be calculated later.");
        totAmntDueTxtF.setEditable(false);
        
        numTicketsSld = new JSlider(1,20);
        
        buyBtn = new JButton("Buy");
        clearBtn = new JButton("Clear");
        exitBtn = new JButton("Exit");
        
        headingPnl.add(headingLbl);
        
        namePnl.add(nameLbl);
        namePnl.add(nameTxtF);
        
        surnamePnl.add(surnameLbl);
        surnamePnl.add(surnameTxtF);   
        
        cellphonePnl.add(cellphoneLbl);
        cellphonePnl.add(cellphoneTxtF); 
        
        customerDetailsPnl.add(namePnl);
        customerDetailsPnl.add(surnamePnl);
        customerDetailsPnl.add(cellphonePnl);
        
        homeTeamPnl.add(homeTeamLbl);
        homeTeamPnl.add(homeTeamTxtF);
        
        awayTeamPnl.add(awayTeamLbl);
        awayTeamPnl.add(awayTeamTxtF);
        
        ticketCostPnl.add(ticketCostLbl);
        ticketCostPnl.add(ticketCostTxtF);
        
        numTicketsPnl.add(numTicketLbl);
        numTicketsPnl.add(numTicketsSld);
        
        totAmntDuePnl.add(totAmntDueLbl);
        totAmntDuePnl.add(totAmntDueTxtF);
        
        ticketsPnl.add(homeTeamPnl);
        ticketsPnl.add(awayTeamPnl);
        ticketsPnl.add(ticketCostPnl);
        ticketsPnl.add(numTicketsPnl);
        ticketsPnl.add(totAmntDuePnl);
        
        btnsPnl.add(buyBtn);
        btnsPnl.add(clearBtn);
        btnsPnl.add(exitBtn);
        
        ticketsBtnsCombinedPnl.add(ticketsPnl, BorderLayout.CENTER);
        ticketsBtnsCombinedPnl.add(btnsPnl, BorderLayout.SOUTH);
        
        mainPnl.add(headingPnl, BorderLayout.NORTH);
        mainPnl.add(customerDetailsPnl, BorderLayout.CENTER);
        mainPnl.add(ticketsBtnsCombinedPnl, BorderLayout.SOUTH);
        
        add(mainPnl);
        pack();
        
        setVisible(true);
        
    }
    
    
    
}
