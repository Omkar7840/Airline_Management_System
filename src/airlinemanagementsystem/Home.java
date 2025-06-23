package airlinemanagementsystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Home extends JFrame implements ActionListener {
   
    
    public Home(){
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("airlinemanagementsystem/icons/front.jpg"));
        JLabel image = new JLabel(i1);    
        image.setBounds(0,0,1600,800);
        add(image);
        
        JLabel heading = new JLabel("AIR INDIA WELCOMES YOU");
        heading.setBounds(500,40,1000,40);
        image.add(heading);
        heading.setForeground(Color.BLUE);
        heading.setFont(new Font("Tahoma", Font.PLAIN , 36));
        
        JMenuBar menubar = new JMenuBar();
        setJMenuBar(menubar);
        
        JMenu details = new JMenu("Details");
        menubar.add(details);
        
        JMenuItem flightdetails = new JMenuItem("Flight Details");
        flightdetails.addActionListener(this);
        details.add(flightdetails);
        
        JMenuItem customerdetails = new JMenuItem("Add Customer Details");
        customerdetails.addActionListener(this);
        details.add(customerdetails);
        
        JMenuItem reservationdetails = new JMenuItem("Reservation Details");
        details.add(reservationdetails);
        
        JMenuItem bookflight = new JMenuItem("Book Flight");
        bookflight.addActionListener(this);
        details.add(bookflight);
        
        JMenuItem journeydetails = new JMenuItem("Journey Details");
        journeydetails.addActionListener(this);
        details.add(journeydetails);
        
        JMenuItem ticketcancelation = new JMenuItem("Ticket Cancelation");
        ticketcancelation.addActionListener(this);
        details.add(ticketcancelation);       
        
        JMenu ticket = new JMenu("Ticket");
        menubar.add(ticket);
        
        JMenuItem boardingpass = new JMenuItem("Boarding Pass");
        boardingpass.addActionListener(this);
        ticket.add(boardingpass);
        
        
        setExtendedState(JFrame.MAXIMIZED_BOTH); 
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
       String text = ae.getActionCommand();
       
       if(text.equals("Add Customer Details")){
           new AddCustomer();
       }else if(text.equals("Flight Details")){
           new FlightInfo();
       }else if(text.equals("Book Flight")){
           new BookFlight();
       }else if (text.equals("Journey Details")){
           new JourneyDetails();      
       }else if (text.equals("Ticket Cancelation")){
           new Cancel();
       }else if(text.equals("Boarding Pass")){
           new BoardingPass();
       }
       
    }
public static void main(String[] args){
    new Home();   
}
}
