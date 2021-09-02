package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entities.Student;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;
import javax.swing.DropMode;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Image;
import java.awt.Window.Type;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class SimplePresentationScreen extends JFrame {

	private JPanel contentPane;
	private JPanel tabInformation;
	private JTabbedPane tabbedPane;
	private Student studentData;
	private JTextField txtH;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	public SimplePresentationScreen(Student studentData) {
		setResizable(false);
		this.studentData = studentData;
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0)); 
		
		setTitle("TdP-DCIC-UNS 2021 :: Pantalla de presentacion");
		setIconImage(Toolkit.getDefaultToolkit().getImage(SimplePresentationScreen.class.getResource("/images/tdp.png"))); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(626, 285));
		setContentPane(contentPane);
		
		init();
		 	
		//Para obtener la hora actual 
		DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	    Date date = new Date(); // String
	    String actualTime = dateFormat.format(date);
	    
	    //Para obtener fecha actual
	    Calendar calendario = Calendar.getInstance();
	    String dayOfMonth = String.valueOf(calendario.get(Calendar.DAY_OF_MONTH));
	    //Los meses van de 0 a 11, por eso se suma 1 
	    String month = String.valueOf(calendario.get(Calendar.MONTH) + 1);
	    String year = String.valueOf(calendario.get(Calendar.YEAR));
	    String actualDate = dayOfMonth + "/" + month + "/" + year;
	   
	    
		//LU
		txtH = new JTextField();
		txtH.setBackground(new Color(255, 255, 255));
		txtH.setEditable(false);
		txtH.setText(String.valueOf(studentData.getId()));
		txtH.setBounds(98, 11, 289, 20);
		tabInformation.add(txtH);
		txtH.setColumns(10);
		
		//Apellido
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(255, 255, 255));
		textField_1.setEditable(false);
		textField_1.setText(studentData.getLastName());
    	textField_1.setBounds(98, 42, 289, 20);
		tabInformation.add(textField_1);
		textField_1.setColumns(10);		
		
		//Nombre
		textField_2 = new JTextField();
		textField_2.setBackground(new Color(255, 255, 255));
		textField_2.setEditable(false);
		textField_2.setText(studentData.getFirstName());
		textField_2.setBounds(98, 73, 289, 20);
		tabInformation.add(textField_2);
		textField_2.setColumns(10);
		
		//E-mail
		textField_3 = new JTextField();
		textField_3.setBackground(new Color(255, 255, 255));
		textField_3.setEditable(false);
		textField_3.setText(studentData.getMail());
	    textField_3.setBounds(97, 104, 290, 20);
		tabInformation.add(textField_3);
		textField_3.setColumns(10);
		
		//Github URL
		textField_4 = new JTextField();
		textField_4.setBackground(new Color(255, 255, 255));
		textField_4.setEditable(false);
		textField_4.setText(studentData.getGithubURL());
		textField_4.setBounds(98, 135, 289, 20);
		tabInformation.add(textField_4);
		textField_4.setColumns(10);
				
		JTextPane txtpnLu = new JTextPane();
		txtpnLu.setEditable(false);
		txtpnLu.setFont(new Font("Tahoma", Font.BOLD, 11));
	    txtpnLu.setText("LU");
		txtpnLu.setBackground(SystemColor.control);
		txtpnLu.setBounds(10, 11, 78, 20);
		tabInformation.add(txtpnLu);
				
		JTextPane txtpnApellido = new JTextPane();
		txtpnApellido.setEditable(false);
		txtpnApellido.setText("Apellido");
		txtpnApellido.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtpnApellido.setBackground(SystemColor.menu);
		txtpnApellido.setBounds(10, 42, 78, 20);
		tabInformation.add(txtpnApellido);
				
		JTextPane txtpnNombre = new JTextPane();
		txtpnNombre.setEditable(false);
		txtpnNombre.setText("Nombre");
		txtpnNombre.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtpnNombre.setBackground(SystemColor.menu);
		txtpnNombre.setBounds(10, 73, 78, 20);
		tabInformation.add(txtpnNombre);
				
		JTextPane txtpnEmail = new JTextPane();
		txtpnEmail.setEditable(false);
		txtpnEmail.setText("E-mail");
		txtpnEmail.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtpnEmail.setBackground(SystemColor.menu);
		txtpnEmail.setBounds(10, 104, 77, 20);
		tabInformation.add(txtpnEmail);
				
		JTextPane txtpnGithubUrl = new JTextPane();
		txtpnGithubUrl.setEditable(false);
		txtpnGithubUrl.setText("Github URL");
		txtpnGithubUrl.setFont(new Font("Tahoma", Font.BOLD, 11));
		txtpnGithubUrl.setBackground(SystemColor.menu);
		txtpnGithubUrl.setBounds(10, 135, 78, 20);
		tabInformation.add(txtpnGithubUrl);
		contentPane.add(tabbedPane, BorderLayout.WEST);
		
		JLabel lblNewLabel = new JLabel("Esta ventana fue generada el " + actualDate + " a las: " + actualTime);
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		contentPane.add(lblNewLabel, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(SimplePresentationScreen.class.getResource("/images/foto.png")));
		contentPane.add(lblNewLabel_1, BorderLayout.CENTER);
		
		
		
	}
	
	private void init() {
		// Tabbed Pane to student personal data
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setForeground(Color.BLACK);
		tabInformation = new JPanel();
		tabInformation.setForeground(Color.BLACK);
		tabInformation.setPreferredSize(new Dimension(425, 220));
		tabInformation.setLayout(null);
		
		tabbedPane.addTab("Informacion del alumno", null, tabInformation, "Muestra la informacion declarada por el alumno");
		
		
	}
}
