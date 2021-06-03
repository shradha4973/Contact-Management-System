import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JOptionPane; 
import javax.swing.KeyStroke;
import javax.swing.border.TitledBorder; 
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import java.awt.GridLayout;
public class GUI extends GUIException implements ActionListener 
{
     private JFrame frame;
     private JMenuBar menu_bar; 
     private JMenu File; 
     private JMenu Edit;
     private JMenu Help;
     private JMenuItem clear_Menu;
     private JMenuItem search_Menu;
     private JMenuItem add_Menu;
     private JMenuItem remove_Menu;
     private JMenuItem Exit;
     private JMenuItem About;
     private JPanel panel;
     private JPanel pan_1;
     private JPanel pan_2;
     private JPanel pan_3;
     private JPanel pan_4;
     private JTable table;
     private JScrollPane scroll;
     private DefaultTableModel model;
     private JLabel fname;
     private JLabel lname;
     private JLabel phoneNO;
     private JCheckBox pvt;
     private JLabel Validfname;
     private JLabel Validlname;
     private JLabel ValidPhone;
     private JLabel Emp1;
     private JLabel Emp2;
     private JLabel Emp3;
     private JTextField txt_1;
     private JTextField txt_2;      
     private JTextField txt_3;
     private JLabel file;
     private JRadioButton rbtn_1;
     private JRadioButton rbtn_2;
     private ButtonGroup bg;   
     private JButton clear;
     private JButton search;
     private JButton add;
     private JButton remove;         
   public GUI()
   {
        try
        {
          frame=new JFrame("Phone book");
          menu_bar=new JMenuBar();
          frame.setJMenuBar(menu_bar);
          
          //File menu of menu_bar
          File=new JMenu("File");
          menu_bar.add(File);
          
          //Exit menu_item of File_menu
          Exit=new JMenuItem("Exit", KeyEvent.VK_E);
          Exit.setMnemonic(KeyEvent.VK_E);
          Exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.ALT_MASK));
          Exit.setToolTipText("Click to exit");
          File.add(Exit);
          Exit.addActionListener(this);
          
          //Edit menu of menu_bar
          Edit=new JMenu("Edit");
          menu_bar.add(Edit);
          
          //clear menu_item of Edit_menu
          clear_Menu=new JMenuItem("Clear", KeyEvent.VK_C);
          clear_Menu.setMnemonic(KeyEvent.VK_C);
          clear_Menu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.ALT_MASK));
          clear_Menu.setToolTipText("Click to clear the textfield");          
          clear_Menu.addActionListener(this);
          Edit.add(clear_Menu);
          
          
          //search menu_item of edit menu
          search_Menu=new JMenuItem("Search",KeyEvent.VK_S);
          search_Menu.setMnemonic(KeyEvent.VK_S);
          search_Menu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
          search_Menu.setToolTipText("Click to search");           
          Edit.add(search_Menu);
          search_Menu.addActionListener(this);
          
          //add menu_item of edit menu
          add_Menu=new JMenuItem("Add", KeyEvent.VK_H);
          add_Menu.setMnemonic(KeyEvent.VK_H);
          add_Menu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, ActionEvent.ALT_MASK)); 
          add_Menu.setToolTipText("Click to add the values from textfield");           
          Edit.add(add_Menu);
          add_Menu.addActionListener(this);
          
          //remove menu_item of edit menu
          remove_Menu=new JMenuItem("Remove",KeyEvent.VK_X);
          remove_Menu.setMnemonic(KeyEvent.VK_X);
          remove_Menu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.ALT_MASK));
          remove_Menu.setToolTipText("Click to remove the values from table");           
          Edit.add(remove_Menu);
          remove_Menu.addActionListener(this);
          
          //Help menu in menu_bar
          Help=new JMenu("Help");
          menu_bar.add(Help);
          
          //about menu_item of Help_menu
          About=new JMenuItem("About",KeyEvent.VK_R);
          About.setMnemonic(KeyEvent.VK_X);
          About.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.ALT_MASK));
          About.setToolTipText("About Us");          
          Help.add(About);
          About.addActionListener(this);
          
          //for JTable
          frame.setLayout(new GridLayout(1,2));
          table=new JTable();
          Object[] columns={" "," "," "," "};
          model=new DefaultTableModel(columns,100);
          model.setColumnIdentifiers(columns);
          table.setModel(model);
          scroll=new JScrollPane(table);
          frame.add(scroll);
          
          //JPanel for Name 
          pan_1=new JPanel();
          pan_1.setBorder(new TitledBorder("Name "));
          pan_1.setLayout(new GridLayout(1,0));
          pan_1.add(scroll);
          frame.add(pan_1);
          
          //JPanel for info
          panel=new JPanel();
          panel.setLayout(new GridLayout(3,1));
          frame.add(panel);
          pan_2=new JPanel();
          pan_2.setLayout(new GridLayout(7,2));
          pan_2.setBorder(new TitledBorder("Info: "));
          
          //JLabel for firstname
          fname=new JLabel("First Name");
          pan_2.add(fname);
          txt_1=new JTextField(5);//JTextField for value input of firstname
          pan_2.add(txt_1);
          //JLabel for displaying invalid message of firstname
          Validfname=new JLabel("");
          Emp1=new JLabel();
          pan_2.add(Emp1);
          pan_2.add(Validfname);
          
          //JLablel for secondname
          lname=new JLabel("Second Name");
          pan_2.add(lname);
          txt_2=new JTextField(5);//JTextField for value input of secondname
          pan_2.add(txt_2);
          //JLabel for displaying invalid message of secondname
          Validlname=new JLabel("");
          Emp2=new JLabel();
          pan_2.add(Emp2);
          pan_2.add(Validlname);
          
          //JLabel for Phone_Number
          phoneNO=new JLabel("Phone");
          pan_2.add(phoneNO);
          txt_3=new JTextField(5);//JTextField for value input of phone_number
          pan_2.add(txt_3);
          //JLabel for displaying invalid message of phone_Number
          ValidPhone=new JLabel("");
          Emp3=new JLabel(); 
          pan_2.add(Emp3);
          pan_2.add(ValidPhone);
          
          //JCheckBox for private
          pvt=new JCheckBox("private");
          pan_2.add(pvt);
          panel.add(pan_2);
          
          //JPanel for Radiobutton
          pan_3=new JPanel();
          pan_3.setLayout(new GridLayout(2,1));
          pan_3.setBorder(new TitledBorder("File as:")); //JLabel for file as:
          //JRadioButton for surname and forename
          rbtn_1=new JRadioButton("Surname, Forename");
          pan_3.add(rbtn_1);
          rbtn_1.addActionListener(this);
          
          //JRadioButton for forename and surname
          rbtn_2=new JRadioButton("Forename, Surname");
          pan_3.add(rbtn_2);
          rbtn_2.addActionListener(this);
          panel.add(pan_3);
          bg = new ButtonGroup();
          bg.add(rbtn_1);
          bg.add(rbtn_2);
          
          //JPanel for Buttons
          pan_4=new JPanel();
          pan_4.setLayout(new GridLayout(2,2));
          
          //JButton for clear_button
          clear=new JButton("Clear");
          clear.setToolTipText("This is the textfield's tooltip");          
          pan_4.add(clear);
          clear.addActionListener(this);
          
          //JButton for search_button
          search =new JButton("Search");
          search.setToolTipText("This is the search button tooltip");          
          pan_4.add(search);
          search.addActionListener(this);
          
          //JButton for add_button
          add=new JButton("Add");
          add.setToolTipText("This is the textfield's tooltip");          
          add.addActionListener(this);
          pan_4.add(add);
          
          //JButton for remove_button
          remove=new JButton("Remove");
          remove.setToolTipText("This is the remove button tooltip");
          pan_4.add(remove);
          remove.addActionListener(this);
          panel.add(pan_4);
                    
          Object[]row=new Object[4];
          frame.setSize(700,500);
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.pack();
          frame.setResizable(false);
          frame.setVisible(true);
        }catch(NullPointerException e)
        {
           System.out.print("error: "+e.getMessage());
        }
        catch(Exception e1)
        {
           System.out.print("error: "+e1.getMessage());
        }
   }
   int n =0;  
   @Override
   public void actionPerformed (ActionEvent e)
   {
       //actionPerformed to clear the values from JTextField
      try
      {
      if(e.getSource()==clear || e.getSource()==clear_Menu)
      {
             txt_1.setText("");  
             txt_2.setText("");
             txt_3.setText("");
             pvt.setSelected(false);
      }
      
       //actionPerformed to search values 
      if(e.getSource()==search || e.getSource()==search_Menu)
      {
           JOptionPane.showMessageDialog(frame,"Search functionality will be supported in the professional version");   
      }
      
       //actionPerformed to add values from JTextField to JTable 
      try
      {
         if(e.getSource()==add|| e.getSource()==add_Menu)
         {
          String fname=txt_1.getText(); 
          String lname=txt_2.getText();
          String phone=txt_3.getText();
          
         //for textfield validation
         if(fname.isEmpty())
         {
             Validfname.setText("Please enter your firstname");
             Validlname.setText("");
             ValidPhone.setText("");
             throw new GUIException();
         }else if (!(fname.matches("^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$")))
         {
	     Validfname.setText("invalid firstname");
             Validlname.setText("");
             ValidPhone.setText("");
             throw new  GUIException();
         }else if(lname.isEmpty())
         {
             Validlname.setText("Please enter your Secondname");
             Validfname.setText("");
             ValidPhone.setText("");
             throw new  GUIException();
         }else if(!(lname.matches("^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$")))
         {
	     Validlname.setText("invalid Secondname");
             Validfname.setText("");
             ValidPhone.setText("");
             throw new  GUIException();
         }else if(phone.isEmpty())
         {
             ValidPhone.setText("Please enter your phonenumber");
             Validfname.setText("");
             Validlname.setText("");
             throw new  GUIException(); 
         }else if(!(phone.matches("^(?=(?:[8-9]){1})(?=[0-9]{10}).*")))
         {
             ValidPhone.setText("invalid phonenumber");
             Validlname.setText("");
             Validfname.setText("");
             throw new  GUIException();
         }else
         {
            Validfname.setText("");
            Validlname.setText("");
            ValidPhone.setText("");
         }         
         String priv=pvt.isSelected()?"Private":"";
         //actionListener for JRadiobutton
         if((rbtn_1.isSelected()==false)&&(rbtn_2.isSelected()==false))
         {
             JOptionPane.showMessageDialog(frame,"please select any of the radiobutton");    
         }else if(rbtn_1.isSelected())
         {
              table.setValueAt(fname, n, 1);
              table.setValueAt(lname, n, 0);
              table.setValueAt(phone, n, 2);
              table.setValueAt(priv, n, 3);
              n++;
              rbtn_1.setEnabled(false);
              rbtn_2.setEnabled(false);  
         }else if(rbtn_2.isSelected())
         {
            table.setValueAt(fname, n, 0);
            table.setValueAt(lname, n, 1);
            table.setValueAt(phone, n, 2);
            table.setValueAt(priv, n, 3);
            n++;
            rbtn_1.setEnabled(false);
            rbtn_2.setEnabled(false);
          }       
        }
      }catch(NumberFormatException ex)
      {
            System.out.print("Error: "+ex.getMessage());
      }
      
      //actionPerformed to remove values of selected row from JTable
      int i=table.getSelectedRow(); 
      if(e.getSource()==remove || e.getSource()==remove_Menu)
      {
        if(i>=0)
        {
              model.removeRow(i);
              n--;
        }
      }
      
      //actonPerformed by JMenuItem to exit the application       
      if(e.getSource()==Exit)
      {
           System.exit(0);
      } 
      
      //actionPerformed by JMenuItem to display the message about the application
      if(e.getSource()==About)
      {
           JOptionPane.showMessageDialog(frame,"It is still in trial version! ");
      } 
    }catch(Exception e1)
    {
        System.out.println("error: "+e1.getMessage());
    }
  }
  public static void main (String[]args)
  {   
         new GUI (); 
  }
} 
          
          
          
          
          
          
          
          
       
 