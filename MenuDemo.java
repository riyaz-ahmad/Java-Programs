/* 
 * This program demonstrates the concept of Swing Menus
 * This program illustrates the concept of following swing menus comments
       - JMenuBar
	   - JMenuItem
	   - JMenu
	   - Adding Mnemonics and Accelerators to MenuItems
	   - Add Images and ToolTips
	   - JRadioButtonMenuItem and JCheckBoxMenuItem
	   - Popup Menu
	   - ToolBar
	   - Use of Actions
*/

package myswing;


import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


class MenuDemo implements ActionListener{
	
	JLabel jlab;
	
	JMenuBar jmb;
	
	JToolBar jtb;
	
	JPopupMenu jpu;
	
	DebugAction setAct;
	DebugAction clearAct;
	DebugAction resumeAct;
	
	MenuDemo(){
		//create a new JFrame contaier
		JFrame f = new JFrame("Swing Menu");
		
		//use default border layout
		//setting the size of frame
		f.setSize(360,200);
		//terminate progran on exit
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//label for menu selection
		jlab = new JLabel();
		
		//create a menu bar
		jmb = new JMenuBar();
		
		//Make File Menu
		makeFileMenu();
		
		//construct degub actions
		makeActions();
		
		//make toolbar
		makeToolBar();
		
		//make options menu
		makeOptionsMenu();
		
		//make help menu
		makeHelpMenu();
		
		//Make the edit  Pop up Menu
		makeEditPUMenu();
		
		//add listener for popup trigger
		f.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent me){
				if(me.isPopupTrigger())
					jpu.show(me.getComponent(), me.getX(), me.getY());
			}
			
			public void mouseReleased(MouseEvent me){
				if(me.isPopupTrigger())
					jpu.show(me.getComponent(), me.getX(), me.getY());
			}
		});
		
		//Add Label to the center of content Pane
		f.add(jlab, SwingConstants.CENTER);
		
		//add toolbar at north position
		f.add(jtb, BorderLayout.NORTH);
		
		//add menu bar to the frame
		f.setJMenuBar(jmb);
		
		//display the frame
		f.setVisible(true);
		
		}
		
		//Handle menu item action events, this doesn't handle the debug options
		public void actionPerformed(ActionEvent ae){
			//get action command from the menu item'
			String comStr = ae.getActionCommand();
			
			//if user chooses Exit
			if(comStr.equals("Exit"))
				System.exit(0);
			
			//otherwise display the selection
			jlab.setText(comStr +" Selected");
		}
		
		//An Action class for debug menu and toolbar
		 class DebugAction extends AbstractAction{
			 public DebugAction(String name, Icon image, int mnem, int accel, String tTip){
				 super(name, image);
				 putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(accel, InputEvent.CTRL_DOWN_MASK));
				 putValue(MNEMONIC_KEY, mnem);
				 putValue(SHORT_DESCRIPTION, tTip);
			 }
			 
			 //handle events foe both toolbar and debug menu
			 public void actionPerformed(ActionEvent ae){
				 String comStr = ae.getActionCommand();
				 jlab.setText(comStr+ " Selected");
				 
				 //toggle the enable status of set and clear Breakpoint Options
				 if(comStr.equals("Set Breakpoint")){
					 clearAct.setEnabled(true);
					 setAct.setEnabled(false);
				 } else if(comStr.equals("Clear Breakpoint")){
					 clearAct.setEnabled(false);
					 setAct.setEnabled(true);
					 }

			 }
		 }
		 
		 //create File Menu with Mnemonics and Accelerators
		 void makeFileMenu(){
			 JMenu jmFile = new JMenu("File");
			 jmFile.setMnemonic(KeyEvent.VK_F);
			 
			 JMenuItem jmiOpen = new JMenuItem("Open", KeyEvent.VK_O);
			 jmiOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));
			 
			 JMenuItem jmiClose = new JMenuItem("Close", KeyEvent.VK_C);
			 jmiClose.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
			 
			 JMenuItem jmiSave  = new JMenuItem("Save", KeyEvent.VK_S);
			 jmiSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
			 
			 JMenuItem jmiExit = new JMenuItem("Exit", KeyEvent.VK_E);
			 jmiExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_DOWN_MASK));
			 
			 jmFile.add(jmiOpen);
			 jmFile.add(jmiClose);
			 jmFile.add(jmiSave);
			 jmFile.add(jmiExit);
			 
			 jmb.add(jmFile);
			 
			 //Add Action Listener for File Menu
			 jmiOpen.addActionListener(this);
			 jmiClose.addActionListener(this);
			 jmiSave.addActionListener(this);
			 jmiExit.addActionListener(this);
		 }
		 
		 //create the options menu
		 void makeOptionsMenu(){
			 JMenu jmOptions = new JMenu("Optioins");
			 
			 //create the colors sub menu
			 JMenu jmColors = new JMenu("Colors");
			 
			 //make check boxes for colors user can select more than one colors
			 JCheckBoxMenuItem jmiRed = new JCheckBoxMenuItem("Red");
			 JCheckBoxMenuItem jmiGreen = new JCheckBoxMenuItem("Green");
			 JCheckBoxMenuItem jmiBlue = new JCheckBoxMenuItem("Blue");
			 
			 //Add colors to Color Menu
			 jmColors.add(jmiRed);
			 jmColors.add(jmiGreen);
			 jmColors.add(jmiBlue);
			 
			 jmOptions.add(jmColors);
			 
			 //creater the priorty sub menu
			 JMenu jmPriority = new JMenu("Priority");
			 
			 //use radio buttons for priority i.e, user can select one priority
			 
			 JRadioButtonMenuItem jmiHigh = new JRadioButtonMenuItem("High", true);
			 JRadioButtonMenuItem jmiLow = new JRadioButtonMenuItem("Low");
			 
			 //add items to priority menu
			 jmPriority.add(jmiHigh);
			 jmPriority.add(jmiLow);
			 jmOptions.add(jmPriority);
			 
			 //create a button group for radio button
			 ButtonGroup bg = new ButtonGroup();
			 bg.add(jmiHigh);
			 bg.add(jmiLow);

			 //create degub sub menu under options and which uses actions
			 JMenu jmDebug = new JMenu("Debug");
			 
			 JMenuItem jmiSetBP = new JMenuItem(setAct);
			 JMenuItem jmiClearBP = new JMenuItem(clearAct);
			 JMenuItem jmiResume = new JMenuItem(resumeAct);
			 
			 //add items to debug menu
			 jmDebug.add(jmiSetBP);
			 jmDebug.add(jmiClearBP);
			 jmDebug.add(jmiResume);
			 
			 jmOptions.add(jmDebug);
			 
			 //create reset menu item
			 JMenuItem jmiReset = new JMenuItem("Reset");
			 jmOptions.addSeparator();
			 jmOptions.add(jmiReset);
			 
			 //add entore options menu to menu bar
			 jmb.add(jmOptions);
			 
			 //add Action Listeners fot the Options Menu except for debug
			 jmiRed.addActionListener(this);
			 jmiGreen.addActionListener(this);
			 jmiBlue.addActionListener(this);
			 jmiHigh.addActionListener(this);
			 jmiLow.addActionListener(this);
			 jmiReset.addActionListener(this);			 
		 }
		 
		 //create the help menu
		 void makeHelpMenu(){
			 JMenu jmHelp = new JMenu("Help");
			 //Add an icon
			 ImageIcon icon = new ImageIcon("AboutIcon.jpg");
			 JMenuItem jmiAbout = new JMenuItem("About", icon);
			 jmiAbout.setToolTipText("Info About Menu Demo Program");
			 jmHelp.add(jmiAbout);
			 jmb.add(jmHelp);
			 
			 //add action listener
			 jmiAbout.addActionListener(this);
		 }
		 
		 //construct actions needed by debug menu and toolbar
		 void makeActions(){
			 //Load images for the actions
			 ImageIcon setIcon = new ImageIcon("set.jpg");
			 ImageIcon clearIcon = new ImageIcon("clear.jpg");
			 ImageIcon resumeIcon = new ImageIcon("resume.jpg");
			 
			 //create action
			 setAct = new DebugAction("Set Breakpoint", setIcon, KeyEvent.VK_S,KeyEvent.VK_B ,"Set a Break Point" );
			 clearAct = new DebugAction("Clear Breakpoint", clearIcon, KeyEvent.VK_C, KeyEvent.VK_L, " clear a break point");
			 resumeAct = new DebugAction("Resume", resumeIcon, KeyEvent.VK_R, KeyEvent.VK_R, " Resume execution after break point");
			 
			 //initially disbale the clear begug
			 clearAct.setEnabled(false);
		 }
		 
		 //create debug tool bar
		 void makeToolBar(){
			 //create the toolbar bttons by usig actions
			 JButton jset = new JButton(setAct);
			 JButton jclear = new JButton(clearAct);
			 JButton jresume = new JButton(resumeAct);
			 
			 //create debug toolbar
			 jtb = new JToolBar("BreakPoints");
			 
			 //Add Buttons to Tool Bar
			 jtb.add(jset);
			 jtb.add(jclear);
			 jtb.add(jresume);
		 }
		 
		 //create edir popup menu
		 void makeEditPUMenu(){
			 jpu = new JPopupMenu();
			 //create popup menu items
			 JMenuItem jmiCut = new JMenuItem("Cut");
			 JMenuItem jmiCopy = new JMenuItem("Copy");
			 JMenuItem jmiPaste = new JMenuItem("Paste");
			 
			 //add items to popup menu
			 jpu.add(jmiCut);
			 jpu.add(jmiCopy);
			 jpu.add(jmiPaste);
			 
			 //add action listeners
			 jmiCut.addActionListener(this);
			 jmiCopy.addActionListener(this);
			 jmiPaste.addActionListener(this);
		 }
		 
		 public static void main(String [] args){
			 SwingUtilities.invokeLater(new Runnable(){
				 public void run(){
					 new MenuDemo();
				 }
			 });
		 }

}