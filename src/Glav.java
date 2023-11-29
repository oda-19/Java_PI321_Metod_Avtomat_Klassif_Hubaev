import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.SystemColor;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.DefaultCellEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JTextArea;
import java.awt.Panel;
import java.awt.GridLayout;
import net.miginfocom.swing.MigLayout;
import java.awt.FlowLayout;
import javax.swing.border.EtchedBorder;

public class Glav extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	
	int obectN = 0;
	int priznakN = 0;
	int deyatelnostN = 0;
	int maxZnach1 = 0;
	int kakouKlass11 = 0;
	int kakouKlass22 = 0;
	int kolKlassov1 = 0;
	int diapazon = 0;
	int diapazon1 = 0;
	int diapazon2 = 0;
	int max = 0;
	
	int xA1 = 0;
	int xA2 = 0;
	int xA3 = 0;
	int xA5 = 0;
	int xA6 = 0;
	
	int xB1 = 0;
	int xB2 = 0;
	int xB3 = 0;
	int xB5 = 0;
	int xB6 = 0;
	
	int xC1 = 0;
	int xC2 = 0;
	int xC3 = 0;
	int xC5 = 0;
	int xC6 = 0;

	int maxZnach11 = 0;
	int maxZnach22 = 0;

	int l = 0;

	int mA1 = 0;
	double mA2 = 0;
	int mA3 = 0;
	double mA4 = 0;
	double mA5 = 0;
	double mA6 = 0;
	
	int mB1 = 0;
	double mB2 = 0;
	int mB3 = 0;
	double mB4 = 0;
	double mB5 = 0;
	double mB6 = 0;
	
	int mC1 = 0;
	double mC2 = 0;
	int mC3 = 0;
	double mC4 = 0;
	double mC5 = 0;
	double mC6 = 0;
	
	int mkiMat1 = 0;
	double mkiMat11 = 0;
	
	double dshkiMat1 = 0;
	
	int xAI = 0;
	double xAI1 = 0;
	int xBI = 0;
	double xBI1 = 0;
	int xCI = 0;
	double xCI1 = 0;
	
	int number1 = 0;
	int number2 = 0;
	int number3 = 0;
	int number4 = 0;
	int number5 = 0;
	int sumM = 0;
	
	int aA = 0;
	int bB = 0;
	int cC = 0;
	
	double aA1 = 0;
	double bB1 = 0;
	double cC1 = 0;
	
	ArrayList<JTextField> matrica = new ArrayList<JTextField>();
	
	ArrayList<JTextField> mkiMatrica = new ArrayList<JTextField>();
	ArrayList<String> mkiMat = new ArrayList<String>();
	
	ArrayList<JTextField> dshkiMatrica = new ArrayList<JTextField>();
	ArrayList<JTextField> maxMatrica = new ArrayList<JTextField>();
	ArrayList<JTextField> diapazonMassiv = new ArrayList<JTextField>();
	ArrayList<JTextField> A = new ArrayList<JTextField>();
	ArrayList<String> xA = new ArrayList<String>();
	ArrayList<JTextField> B = new ArrayList<JTextField>();
	ArrayList<String> xB = new ArrayList<String>();
	ArrayList<JTextField> C = new ArrayList<JTextField>();
	ArrayList<String> xC = new ArrayList<String>();

	ArrayList<String> mA = new ArrayList<String>();
	ArrayList<String> mB = new ArrayList<String>();
	ArrayList<String> mC = new ArrayList<String>();
	
	ArrayList<String> mA11 = new ArrayList<String>();
	ArrayList<String> mB11 = new ArrayList<String>();
	ArrayList<String> mC11 = new ArrayList<String>();
	
	ArrayList<String> mA22 = new ArrayList<String>();
	ArrayList<String> mB22 = new ArrayList<String>();
	ArrayList<String> mC22 = new ArrayList<String>();
	
	ArrayList<String> mA33 = new ArrayList<String>();
	ArrayList<String> mB33 = new ArrayList<String>();
	ArrayList<String> mC33 = new ArrayList<String>();
	
	ArrayList<String> mA44 = new ArrayList<String>();
	ArrayList<String> mB44 = new ArrayList<String>();
	ArrayList<String> mC44 = new ArrayList<String>();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Glav frame = new Glav();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Glav() {	
		
		// --- Окно --- //
		setForeground(SystemColor.control);
		setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		setTitle("Методы автоматической классификации");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 900, 715);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLACK);
		contentPane.setBackground(Color.WHITE);
		setContentPane(contentPane);

		// --- Убрать подсветку кнопок --- //
		//UIManager.put("Button.select", SystemColor.info);
		
		// --- CardLayout --- //
		CardLayout cl = new CardLayout();
		contentPane.setLayout(cl);
		
		///////////////////////////
		// --- Первая панель --- //
		///////////////////////////
		JPanel panelFirst = new JPanel();
		panelFirst.setForeground(Color.BLACK);
		panelFirst.setBackground(new Color(248, 248, 255));
		panelFirst.setLayout(null);
		contentPane.add(panelFirst, "1");
		
		JLabel lblNewLabel = new JLabel("Количество объектов:");
		lblNewLabel.setFont(new Font("Malgun Gothic", Font.PLAIN, 16));
		lblNewLabel.setBounds(304, 203, 171, 30);
		panelFirst.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Malgun Gothic", Font.PLAIN, 14));
		textField.setBounds(485, 204, 90, 30);
		panelFirst.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Количество признаков:");
		lblNewLabel_1.setFont(new Font("Malgun Gothic", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(299, 244, 178, 30);
		panelFirst.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Malgun Gothic", Font.PLAIN, 14));
		textField_1.setBounds(490, 245, 90, 30);
		panelFirst.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("На сколько классов поделить исходную совокупность объектов:");
		lblNewLabel_2.setFont(new Font("Malgun Gothic", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(141, 285, 500, 30);
		panelFirst.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Malgun Gothic", Font.PLAIN, 14));
		textField_2.setBounds(651, 286, 90, 30);
		panelFirst.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Показатель, в соответствии с которым надо поделить на классы:");
		lblNewLabel_3.setFont(new Font("Malgun Gothic", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(136, 326, 505, 30);
		panelFirst.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Malgun Gothic", Font.PLAIN, 14));
		textField_3.setBounds(656, 327, 90, 30);
		panelFirst.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Количество значений показателей деятельности объектов:");
		lblNewLabel_4.setFont(new Font("Malgun Gothic", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(172, 367, 453, 30);
		panelFirst.add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Malgun Gothic", Font.PLAIN, 14));
		textField_4.setBounds(635, 368, 90, 30);
		panelFirst.add(textField_4);
		textField_4.setColumns(10);
		
		///////////////////////////
		// --- Вторая панель --- //
		///////////////////////////
		JPanel panelSecond = new JPanel();
		panelSecond.setBackground(new Color(248, 248, 255));
		panelSecond.setLayout(null);
		contentPane.add(panelSecond, "2");
		
		JLabel lblNewLabel_5 = new JLabel("Введите значения признаков объектов:");
		lblNewLabel_5.setFont(new Font("Malgun Gothic", Font.PLAIN, 16));
		lblNewLabel_5.setBounds(81, 125, 302, 30);
		panelSecond.add(lblNewLabel_5);
		
		JPanel panel = new JPanel();
		panel.setBounds(94, 191, 300, 300);
		panelSecond.add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
         
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(94, 166, 300, 25);
		panelSecond.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(69, 191, 25, 300);
		panelSecond.add(panel_2);
			
		JLabel lblNewLabel_6 = new JLabel("Введите значения деятельности объектов:");
		lblNewLabel_6.setFont(new Font("Malgun Gothic", Font.PLAIN, 16));
		lblNewLabel_6.setBounds(474, 144, 325, 30);
		panelSecond.add(lblNewLabel_6);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(464, 185, 25, 95);
		panelSecond.add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(489, 185, 320, 95);
		panelSecond.add(panel_4);
		
		JLabel lblNewLabel_7 = new JLabel("Введите весовые коэффициенты:");
		lblNewLabel_7.setFont(new Font("Malgun Gothic", Font.PLAIN, 16));
		lblNewLabel_7.setBounds(464, 308, 256, 30);
		panelSecond.add(lblNewLabel_7);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(529, 349, 65, 125);
		panelSecond.add(panel_5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(594, 349, 57, 125);
		panelSecond.add(panel_6);
		
		///////////////////////////
		// --- Третья панель --- //
		///////////////////////////
		JPanel panelThird = new JPanel();
		panelThird.setBackground(new Color(248, 248, 255));
		panelThird.setLayout(null);
		contentPane.add(panelThird, "3");
		
		JLabel lblNewLabel_8 = new JLabel("Решение:");
		lblNewLabel_8.setFont(new Font("Malgun Gothic", Font.PLAIN, 16));
		lblNewLabel_8.setBounds(400, 15, 71, 30);
		panelThird.add(lblNewLabel_8);
		
		JLabel lblNewLabel_10 = new JLabel("Вычисление координат центров тяжести:");
		lblNewLabel_10.setFont(new Font("Malgun Gothic", Font.PLAIN, 16));
		lblNewLabel_10.setBounds(282, 45, 318, 30);
		panelThird.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Алгоритмы классификации:");
		lblNewLabel_11.setFont(new Font("Malgun Gothic", Font.PLAIN, 16));
		lblNewLabel_11.setBounds(340, 105, 209, 30);
		panelThird.add(lblNewLabel_11);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBounds(50, 75, 790, 30);
		panelThird.add(panel_7);
		panel_7.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_12 = new JLabel("1) Классификация (распознавание) от объектов до центров тяжести объектов:");
		lblNewLabel_12.setFont(new Font("Malgun Gothic", Font.PLAIN, 16));
		lblNewLabel_12.setBounds(146, 135, 607, 30);
		panelThird.add(lblNewLabel_12);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(50, 165, 790, 30);
		panelThird.add(panel_8);
		panel_8.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel_9 = new JPanel();
		panel_9.setBounds(50, 195, 790, 30);
		panelThird.add(panel_9);
		panel_9.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_9 = new JLabel("2) Классификация от объектов до центров тяжести классов с учетом весовых коэффициентов:");
		lblNewLabel_9.setFont(new Font("Malgun Gothic", Font.PLAIN, 16));
		lblNewLabel_9.setBounds(74, 225, 736, 30);
		panelThird.add(lblNewLabel_9);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBounds(50, 255, 790, 30);
		panelThird.add(panel_10);
		panel_10.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel_11 = new JPanel();
		panel_11.setBounds(50, 285, 790, 30);
		panelThird.add(panel_11);
		panel_11.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_13 = new JLabel("3) Классификация по скалярному произведению:");
		lblNewLabel_13.setFont(new Font("Malgun Gothic", Font.PLAIN, 16));
		lblNewLabel_13.setBounds(263, 315, 376, 30);
		panelThird.add(lblNewLabel_13);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBounds(50, 345, 790, 30);
		panelThird.add(panel_12);
		panel_12.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel_13 = new JPanel();
		panel_13.setBounds(50, 375, 790, 30);
		panelThird.add(panel_13);
		panel_13.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_14 = new JLabel("4) Классификация с использованием корреляционного метода:");
		lblNewLabel_14.setFont(new Font("Malgun Gothic", Font.PLAIN, 16));
		lblNewLabel_14.setBounds(204, 405, 486, 30);
		panelThird.add(lblNewLabel_14);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBounds(50, 435, 790, 30);
		panelThird.add(panel_14);
		panel_14.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel_15 = new JPanel();
		panel_15.setBounds(50, 465, 790, 30);
		panelThird.add(panel_15);
		panel_15.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_15 = new JLabel("5) Классификация по углу между векторами объекта и центра тяжести классов:");
		lblNewLabel_15.setFont(new Font("Malgun Gothic", Font.PLAIN, 16));
		lblNewLabel_15.setBounds(138, 495, 615, 30);
		panelThird.add(lblNewLabel_15);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBounds(50, 525, 790, 60);
		panelThird.add(panel_16);
		panel_16.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel_17 = new JPanel();
		panel_17.setBounds(50, 585, 790, 30);
		panelThird.add(panel_17);
		panel_17.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnNewButton_3 = new JButton("Назад");
		btnNewButton_3.setBounds(427, 626, 73, 30);
		panelThird.add(btnNewButton_3);
		btnNewButton_3.setFont(new Font("Malgun Gothic", Font.PLAIN, 16));
		btnNewButton_3.setFocusPainted(false);
		btnNewButton_3.setFocusable(false);
		btnNewButton_3.setBackground(Color.LIGHT_GRAY);
		btnNewButton_3.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnNewButton_3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				cl.show(contentPane, "2");
			}
		});
		
		JButton btnNewButton = new JButton("ОК");
		btnNewButton.setFont(new Font("Malgun Gothic", Font.PLAIN, 16));
		btnNewButton.setFocusPainted(false);
		btnNewButton.setFocusable(false);
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
                String obect = textField.getText();
	            obectN = Integer.parseInt(obect);
	            panel_1.setLayout(new GridLayout(0, obectN));
	            for (int i = 1; i <= obectN; i++) {
	            	JTextArea textArea = new JTextArea();
	            	textArea.setFont(new Font("Malgun Gothic", Font.PLAIN, 14));
	            	textArea.setEditable(false);
	            	textArea.append("X" + String.valueOf(i));
	    			panel_1.add(textArea);
	    		}
	            
	            String priznak = textField_1.getText();
	            priznakN = Integer.parseInt(priznak);
	            panel_2.setLayout(new GridLayout(priznakN, 0));
	            for (int i = 1; i <= priznakN; i++) {
	            	JTextArea textArea = new JTextArea();
	            	textArea.setFont(new Font("Malgun Gothic", Font.PLAIN, 14));
	            	textArea.setEditable(false);
	            	textArea.append(String.valueOf(i));
	    			panel_2.add(textArea);
	    		}

	    		panel.setLayout(new GridLayout(priznakN, obectN, 3, 3));
	    	    for (int i = 0; i < obectN; i++) {
	    	    	for(int j = 0; j < priznakN; j++) {
	    	        	JTextField textField = new JTextField();
	    	        	textField.setFont(new Font("Malgun Gothic", Font.PLAIN, 14));
	    	            panel.add(textField);
	    	            matrica.add(textField);
	    	        }
	    	    }

	    	    String deyatelnost = textField_4.getText();
	    	    deyatelnostN = Integer.parseInt(deyatelnost);
	            panel_3.setLayout(new GridLayout(deyatelnostN, 0));
	            for (int i = 1; i <= deyatelnostN; i++) {
	            	JTextArea textArea = new JTextArea();
	            	textArea.setFont(new Font("Malgun Gothic", Font.PLAIN, 14));
	            	textArea.setEditable(false);
	            	textArea.append("M" + String.valueOf(i) +":");
	    			panel_3.add(textArea);
	    		}

	    		panel_4.setLayout(new GridLayout(deyatelnostN, obectN - 1, 3, 3));
	    	    for (int i = 0; i < deyatelnostN; i++) {
	    	        for (int j = 1; j <= obectN - 1; j++) {
	    	        	JTextArea textArea = new JTextArea();
	    	        	textArea.setFont(new Font("Malgun Gothic", Font.PLAIN, 14));
	    	        	textArea.setEditable(false);
		            	textArea.append("X" + String.valueOf(j) +" = ");
	    	            panel_4.add(textArea);
	    	            
	    	        	JTextField textField = new JTextField();
	    	        	textField.setFont(new Font("Malgun Gothic", Font.PLAIN, 14));
	    	            panel_4.add(textField);
	    	            mkiMatrica.add(textField);
	    	        }
	    	    }
	    	    
	            panel_5.setLayout(new GridLayout(obectN - 1, 0));
	            for (int i = 1; i <= obectN - 1; i++) {
	            	JTextArea textArea = new JTextArea();
	            	textArea.setFont(new Font("Malgun Gothic", Font.PLAIN, 14));
	            	textArea.setEditable(false);
	            	textArea.append("X" + String.valueOf(i) +" - d" + String.valueOf(i) + " =");
	    			panel_5.add(textArea);
	    		}

	    		panel_6.setLayout(new GridLayout(obectN - 1, 0, 3, 3));
	    		for (int i = 1; i <= obectN - 1; i++) {
	    			JTextField textField = new JTextField();
	    			textField.setFont(new Font("Malgun Gothic", Font.PLAIN, 14));
	    	        panel_6.add(textField);
	    	        dshkiMatrica.add(textField);
	    	    }
	    	    
				cl.show(contentPane, "2");
			}
		});
		btnNewButton.setBounds(344, 408, 50, 30);
		panelFirst.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("ОК");
		btnNewButton_1.setFont(new Font("Malgun Gothic", Font.PLAIN, 16));
		btnNewButton_1.setFocusPainted(false);
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int i = 0;
				int j = 0;
				int z = 0;
				int y = 0;
				int yy = 0;
				maxMatrica.add(textField_3);
				String kakouKlass1 = maxMatrica.get(0).getText();
				kakouKlass11 = Integer.parseInt(kakouKlass1);
				kakouKlass11 = kakouKlass11 - 1;
				for (i = kakouKlass11; i < matrica.size(); i++) {
					String maxZnach1 = matrica.get(i).getText();
					maxZnach11 = Integer.parseInt(maxZnach1);
					if (max < maxZnach11) {
						max = maxZnach11;
					}
					i = i + kakouKlass11;
				}
				
				//System.out.println(textFields.get(0).getText());
				
				diapazonMassiv.add(textField_2);
				String kolKlassov = diapazonMassiv.get(0).getText();
				kolKlassov1 = Integer.parseInt(kolKlassov);
				diapazon = max / kolKlassov1;
			
				for (z = 0; z < kakouKlass11; z++) {
					if (z == 0)
					{
						Povtor0(i, matrica, j, kakouKlass11, maxZnach22, diapazon, xA2, xA3, A, textField_2, xA5, kolKlassov1, xA);
					}
					if (z == 1) {
						Povtor1(i, matrica, j, kakouKlass11, maxZnach22, diapazon, xA2, xA3, A, textField_2, xA5, kolKlassov1, xA);
					}
					if (z == 2) {
						Povtor2(i, matrica, j, kakouKlass11, maxZnach22, diapazon, xA2, xA3, A, textField_2, xA5, kolKlassov1, xA);
					}
					if (z == 3) {
						Povtor3(i, matrica, j, kakouKlass11, maxZnach22, diapazon, xA2, xA3, A, textField_2, xA5, kolKlassov1, xA);
					}
					if (z == 4) {
						Povtor4(i, matrica, j, kakouKlass11, maxZnach22, diapazon, xA2, xA3, A, textField_2, xA5, kolKlassov1, xA);
					}
				}
				
				for (z = 0; z < kakouKlass11; z++) {
					diapazon1 = diapazon;
					diapazon2 = diapazon * 2;
					if (z == 0)
					{
						Povtor00(i, matrica, j, kakouKlass11, maxZnach22, diapazon1, diapazon2, xB2, xB3, B, textField_2, xB5, kolKlassov1, xB);
					}
					if (z == 1) {
						Povtor11(i, matrica, j, kakouKlass11, maxZnach22, diapazon1, diapazon2, xB2, xB3, B, textField_2, xB5, kolKlassov1, xB);
					}
					if (z == 2) {
						Povtor22(i, matrica, j, kakouKlass11, maxZnach22, diapazon1, diapazon2, xB2, xB3, B, textField_2, xB5, kolKlassov1, xB);
					}
					if (z == 3) {
						Povtor33(i, matrica, j, kakouKlass11, maxZnach22, diapazon1, diapazon2, xB2, xB3, B, textField_2, xB5, kolKlassov1, xB);
					}
					if (z == 4) {
						Povtor44(i, matrica, j, kakouKlass11, maxZnach22, diapazon1, diapazon2, xB2, xB3, B, textField_2, xB5, kolKlassov1, xB);
					}
				}

				for (z = 0; z < kakouKlass11; z++) {
					diapazon1 = diapazon * 2;
					diapazon2 = diapazon * 3;
					if (z == 0)
					{
						Povtor00(i, matrica, j, kakouKlass11, maxZnach22, diapazon1, diapazon2, xC2, xC3, C, textField_2, xC5, kolKlassov1, xC);
					}
					if (z == 1) {
						Povtor11(i, matrica, j, kakouKlass11, maxZnach22, diapazon1, diapazon2, xC2, xC3, C, textField_2, xC5, kolKlassov1, xC);
					}
					if (z == 2) {
						Povtor22(i, matrica, j, kakouKlass11, maxZnach22, diapazon1, diapazon2, xC2, xC3, C, textField_2, xC5, kolKlassov1, xC);
					}
					if (z == 3) {
						Povtor33(i, matrica, j, kakouKlass11, maxZnach22, diapazon1, diapazon2, xC2, xC3, C, textField_2, xC5, kolKlassov1, xC);
					}
					if (z == 4) {
						Povtor44(i, matrica, j, kakouKlass11, maxZnach22, diapazon1, diapazon2, xC2, xC3, C, textField_2, xC5, kolKlassov1, xC);
					}
				}

				if (xA != null && xA.size() != 0) {
					JLabel label1 = new JLabel();
					label1.setFont(new Font("Malgun Gothic", Font.PLAIN, 14));
					panel_7.add(label1);
					label1.setText("A(");
					for (int b = 0; b != xA.size(); b++) {
						JLabel label = new JLabel();
						label.setFont(new Font("Malgun Gothic", Font.PLAIN, 14));
						panel_7.add(label);
						label.setText(xA.get(b));
					}
					JLabel label2 = new JLabel();
					label2.setFont(new Font("Malgun Gothic", Font.PLAIN, 14));
					panel_7.add(label2);
					label2.setText(")");
				}
					
				if (xB != null && xB.size() != 0) {
					JLabel label1 = new JLabel();
					label1.setFont(new Font("Malgun Gothic", Font.PLAIN, 14));
					panel_7.add(label1);
					label1.setText("B(");
					for (int b = 0; b != xB.size(); b++) {
						JLabel label = new JLabel();
						label.setFont(new Font("Malgun Gothic", Font.PLAIN, 14));
						panel_7.add(label);
						label.setText(xB.get(b));
					}
					JLabel label2 = new JLabel();
					label2.setFont(new Font("Malgun Gothic", Font.PLAIN, 14));
					panel_7.add(label2);
					label2.setText(")");
				}
				
				if (xC != null && xC.size() != 0) {
					JLabel label1 = new JLabel();
					label1.setFont(new Font("Malgun Gothic", Font.PLAIN, 14));
					panel_7.add(label1);
					label1.setText("C(");
					for (int b = 0; b != xC.size(); b++) {
						JLabel label = new JLabel();
						label.setFont(new Font("Malgun Gothic", Font.PLAIN, 14));
						panel_7.add(label);
						label.setText(xC.get(b));
					}
					JLabel label2 = new JLabel();
					label2.setFont(new Font("Malgun Gothic", Font.PLAIN, 14));
					panel_7.add(label2);
					label2.setText(")");
				}
				
				/////////////
				// Метод 1 //
				/////////////
				
				String mkiMat = mkiMatrica.get(y).getText();
				mkiMat1 = Integer.parseInt(mkiMat);
				
				number1 = kakouKlass11;
				if (deyatelnostN == 1 || deyatelnostN == 2 || deyatelnostN == 3 || deyatelnostN == 4 || deyatelnostN == 5) {
					if (xA != null && xA.size() != 0) {
						Metod1(i, number1, xA, xAI, y, mkiMatrica, mkiMat1, mA1, mA);
					}
					if (xB != null && xB.size() != 0) {
						Metod1(i, number1, xB, xBI, y, mkiMatrica, mkiMat1, mB1, mB);
					}
					if (xC != null && xC.size() != 0) {
						Metod1(i, number1, xC, xCI, y, mkiMatrica, mkiMat1, mC1, mC);
					}
				}

				if (deyatelnostN == 2 || deyatelnostN == 3 || deyatelnostN == 4 || deyatelnostN == 5) {
					if (xA != null && xA.size() != 0) {
						Metod2(i, number1, xA, xAI, y, mkiMatrica, mkiMat1, mA1, mA);
					}
					if (xB != null && xB.size() != 0) {
						Metod2(i, number1, xB, xBI, y, mkiMatrica, mkiMat1, mB1, mB);
					}
					if (xC != null && xC.size() != 0) {
						Metod2(i, number1, xC, xCI, y, mkiMatrica, mkiMat1, mC1, mC);
					}
				}
				
				number1 = kakouKlass11 * 2;
				if (deyatelnostN == 3 || deyatelnostN == 4 || deyatelnostN == 5) {
					if (xA != null && xA.size() != 0) {
						Metod2(i, number1, xA, xAI, y, mkiMatrica, mkiMat1, mA1, mA);
					}
					if (xB != null && xB.size() != 0) {
						Metod2(i, number1, xB, xBI, y, mkiMatrica, mkiMat1, mB1, mB);
					}
					if (xC != null && xC.size() != 0) {
						Metod2(i, number1, xC, xCI, y, mkiMatrica, mkiMat1, mC1, mC);
					}
				}
				
				number1 = kakouKlass11 * 3;
				if (deyatelnostN == 4 || deyatelnostN == 5) {
					if (xA != null && xA.size() != 0) {
						Metod2(i, number1, xA, xAI, y, mkiMatrica, mkiMat1, mA1, mA);
					}
					if (xB != null && xB.size() != 0) {
						Metod2(i, number1, xB, xBI, y, mkiMatrica, mkiMat1, mB1, mB);
					}
					if (xC != null && xC.size() != 0) {
						Metod2(i, number1, xC, xCI, y, mkiMatrica, mkiMat1, mC1, mC);
					}
				}
				
				number1 = kakouKlass11 * 4;
				if (deyatelnostN == 5) {
					if (xA != null && xA.size() != 0) {
						Metod2(i, number1, xA, xAI, y, mkiMatrica, mkiMat1, mA1, mA);
					}
					if (xB != null && xB.size() != 0) {
						Metod2(i, number1, xB, xBI, y, mkiMatrica, mkiMat1, mB1, mB);
					}
					if (xC != null && xC.size() != 0) {
						Metod2(i, number1, xC, xCI, y, mkiMatrica, mkiMat1, mC1, mC);
					}
				}
				
				if (mA != null && mA.size() != 0 && mB != null && mB.size() != 0 && mC != null && mC.size() != 0) {
					for (int b = 0; b != mA.size() - 2 && b != mB.size() - 2 && b != mC.size() - 2; b++) {
						Metod111(panel_8, mA, mB, mC, b);
					}
					for (int b = 1; b != mA.size() - 1 && b != mB.size() - 1 && b != mC.size() - 1; b++) {
						Metod111(panel_8, mA, mB, mC, b);
					}
					for (int b = 2; b != mA.size() && b != mB.size() && b != mC.size(); b++) {
						Metod111(panel_8, mA, mB, mC, b);
					}
				}

				for (i = 0; i < mA.size(); i++) {
					if (mA != null && mA.size() != 0) {
						aA = Integer.parseInt(mA.get(i));
					}
					else aA = 0;
					
					if (mB != null && mB.size() != 0) {
						bB = Integer.parseInt(mB.get(i));
					}
					else bB = 0;
							
					if (mC != null && mC.size() != 0) {
						cC = Integer.parseInt(mC.get(i));
					}
					else cC = 0;
					
					if (aA < bB && aA < cC) {
						Metod11(panel_9, i);
						JLabel label1 = new JLabel();
						label1.setFont(new Font("Malgun Gothic", Font.PLAIN, 14));
						panel_9.add(label1);
						label1.setText("A");
					}
					
					if (bB < aA && bB < cC) {
						Metod11(panel_9, i);
						JLabel label1 = new JLabel();
						label1.setFont(new Font("Malgun Gothic", Font.PLAIN, 14));
						panel_9.add(label1);
						label1.setText("B");
					}
					
					if (cC < aA && cC < bB) {
						Metod11(panel_9, i);
						JLabel label1 = new JLabel();
						label1.setFont(new Font("Malgun Gothic", Font.PLAIN, 14));
						panel_9.add(label1);
						label1.setText("C");
					}
				}
	
				/////////////
				// Метод 2 //
				/////////////
				
				String dshkiMat = dshkiMatrica.get(yy).getText();
				dshkiMat1 = Double.parseDouble(dshkiMat);
				
				number1 = kakouKlass11;
				if (deyatelnostN == 1 || deyatelnostN == 2 || deyatelnostN == 3 || deyatelnostN == 4 || deyatelnostN == 5) {
					if (xA != null && xA.size() != 0) {
						Metod3(i, number1, xA, xAI1, yy, y, dshkiMatrica, dshkiMat1, mkiMatrica, mkiMat1, mA2, mA11);
					}
					if (xB != null && xB.size() != 0) {
						Metod3(i, number1, xB, xBI1, yy, y, dshkiMatrica, dshkiMat1, mkiMatrica, mkiMat1, mB2, mB11);
					}
					if (xC != null && xC.size() != 0) {
						Metod3(i, number1, xC, xCI1, yy, y, dshkiMatrica, dshkiMat1, mkiMatrica, mkiMat1, mC2, mC11);
					}
				}

				
				
				if (mA11 != null && mA11.size() != 0 && mB11 != null && mB11.size() != 0 && mC11 != null && mC11.size() != 0) {
					for (int b = 0; b != mA11.size() - 2 && b != mB11.size() - 2 && b != mC11.size() - 2; b++) {
						Metod111(panel_10, mA11, mB11, mC11, b);
					}
					for (int b = 1; b != mA11.size() - 1 && b != mB11.size() - 1 && b != mC11.size() - 1; b++) {
						Metod111(panel_10, mA11, mB11, mC11, b);
					}
					for (int b = 2; b != mA11.size() && b != mB11.size() && b != mC11.size(); b++) {
						Metod111(panel_10, mA11, mB11, mC11, b);
					}
				}

				for (i = 0; i < mA11.size(); i++) {
					if (mA11 != null && mA11.size() != 0) {
						aA1 = Double.parseDouble(mA11.get(i));
					}
					else aA1 = 0;
					
					if (mB11 != null && mB11.size() != 0) {
						bB1 = Double.parseDouble(mB11.get(i));
					}
					else bB1 = 0;
							
					if (mC11 != null && mC11.size() != 0) {
						cC1 = Double.parseDouble(mC11.get(i));
					}
					else cC1 = 0;
					
					if (aA1 < bB1 && aA1 < cC1) {
						Metod11(panel_11, i);
						JLabel label1 = new JLabel();
						label1.setFont(new Font("Malgun Gothic", Font.PLAIN, 14));
						panel_11.add(label1);
						label1.setText("A");
					}
					
					if (bB1 < aA1 && bB1 < cC1) {
						Metod11(panel_11, i);
						JLabel label1 = new JLabel();
						label1.setFont(new Font("Malgun Gothic", Font.PLAIN, 14));
						panel_11.add(label1);
						label1.setText("B");
					}
					
					if (cC1 < aA1 && cC1 < bB1) {
						Metod11(panel_11, i);
						JLabel label1 = new JLabel();
						label1.setFont(new Font("Malgun Gothic", Font.PLAIN, 14));
						panel_11.add(label1);
						label1.setText("C");
					}
				}
				
				/////////////
				// Метод 3 //
				/////////////

				
					
				if (mA22 != null && mA22.size() != 0 && mB22 != null && mB22.size() != 0 && mC22 != null && mC22.size() != 0) {
					for (int b = 0; b != mA22.size() - 2 && b != mB22.size() - 2 && b != mB22.size() - 2; b++) {
						Metod111(panel_12, mA22, mB22, mC22, b);
					}
					for (int b = 1; b != mA22.size() - 1 && b != mB22.size() - 1 && b != mC22.size() - 1; b++) {
						Metod111(panel_12, mA22, mB22, mC22, b);
					}
					for (int b = 2; b != mA22.size() && b != mB22.size() && b != mC22.size(); b++) {
						Metod111(panel_12, mA22, mB22, mC22, b);
					}
				}

				for (i = 0; i < mA22.size(); i++) {
					if (mA22 != null && mA22.size() != 0) {
						aA = Integer.parseInt(mA22.get(i));
					}
					else aA = 0;
					
					if (mB22 != null && mB22.size() != 0) {
						bB = Integer.parseInt(mB22.get(i));
					}
					else bB = 0;
								
					if (mC22 != null && mC22.size() != 0) {
						cC = Integer.parseInt(mC22.get(i));
					}
					else cC = 0;
					
					if (aA > bB && aA > cC) {
						Metod11(panel_13, i);
						JLabel label1 = new JLabel();
						label1.setFont(new Font("Malgun Gothic", Font.PLAIN, 14));
						panel_13.add(label1);
						label1.setText("A");
					}
						
					if (bB > aA && bB > cC) {
						Metod11(panel_13, i);
						JLabel label1 = new JLabel();
						label1.setFont(new Font("Malgun Gothic", Font.PLAIN, 14));
						panel_13.add(label1);
						label1.setText("B");
					}
						
					if (cC > aA && cC > bB) {
						Metod11(panel_13, i);
						JLabel label1 = new JLabel();
						label1.setFont(new Font("Malgun Gothic", Font.PLAIN, 14));
						panel_13.add(label1);
						label1.setText("C");
					}
				}
				
				/////////////
				// Метод 4 //
				/////////////

			
						
				if (mA33 != null && mA33.size() != 0 && mB33 != null && mB33.size() != 0 && mC33 != null && mC33.size() != 0) {
					for (int b = 0; b != mA33.size() - 2 && b != mB33.size() - 2 && b != mB33.size() - 2; b++) {
						Metod111(panel_14, mA33, mB33, mC33, b);
					}
					for (int b = 1; b != mA33.size() - 1 && b != mB33.size() - 1 && b != mC33.size() - 1; b++) {
						Metod111(panel_14, mA33, mB33, mC33, b);
					}
					for (int b = 2; b != mA33.size() && b != mB33.size() && b != mC33.size(); b++) {
						Metod111(panel_14, mA33, mB33, mC33, b);
					}
				}

				for (i = 0; i < mA33.size(); i++) {
					if (mA33 != null && mA33.size() != 0) {
						aA1 = Double.parseDouble(mA33.get(i));
					}
					else aA1 = 0;
					
					if (mB33 != null && mB33.size() != 0) {
						bB1 = Double.parseDouble(mB33.get(i));
					}
					else bB1 = 0;
									
					if (mC33 != null && mC33.size() != 0) {
						cC1 = Double.parseDouble(mC33.get(i));
					}
					else cC1 = 0;
						
					if (aA1 > bB1 && aA1 > cC1) {
						Metod11(panel_15, i);
						JLabel label1 = new JLabel();
						label1.setFont(new Font("Malgun Gothic", Font.PLAIN, 14));
						panel_15.add(label1);
						label1.setText("A");
					}
							
					if (bB1 > aA1 && bB1 > cC1) {
						Metod11(panel_15, i);
						JLabel label1 = new JLabel();
						label1.setFont(new Font("Malgun Gothic", Font.PLAIN, 14));
						panel_15.add(label1);
						label1.setText("B");
					}
							
					if (cC1 > aA1 && cC1 > bB1) {
						Metod11(panel_15, i);
						JLabel label1 = new JLabel();
						label1.setFont(new Font("Malgun Gothic", Font.PLAIN, 14));
						panel_15.add(label1);
						label1.setText("C");
					}
				}
				
				/////////////
				// Метод 5 //
				/////////////

			
						
				if (mA44 != null && mA44.size() != 0 && mB44 != null && mB44.size() != 0 && mC44 != null && mC44.size() != 0) {
					for (int b = 0; b != mA44.size() - 2 && b != mB44.size() - 2 && b != mB44.size() - 2; b++) {
						Metod111(panel_16, mA44, mB44, mC44, b);
					}
					for (int b = 1; b != mA44.size() - 1 && b != mB44.size() - 1 && b != mC44.size() - 1; b++) {
						Metod111(panel_16, mA44, mB44, mC44, b);
					}
					for (int b = 2; b != mA44.size() && b != mB44.size() && b != mC44.size(); b++) {
						Metod111(panel_16, mA44, mB44, mC44, b);
					}
				}

				for (i = 0; i < mA44.size(); i++) {
					if (mA44 != null && mA44.size() != 0) {
						aA1 = Double.parseDouble(mA44.get(i));
					}
					else aA1 = 0;
					
					if (mB44 != null && mB44.size() != 0) {
						bB1 = Double.parseDouble(mB44.get(i));
					}
					else bB1 = 0;
									
					if (mC44 != null && mC44.size() != 0) {
						cC1 = Double.parseDouble(mC44.get(i));
					}
					else cC1 = 0;
						
					if (aA1 > bB1 && aA1 > cC1) {
						Metod11(panel_17, i);
						JLabel label1 = new JLabel();
						label1.setFont(new Font("Malgun Gothic", Font.PLAIN, 14));
						panel_17.add(label1);
						label1.setText("A");
					}
							
					if (bB1 > aA1 && bB1 > cC1) {
						Metod11(panel_17, i);
						JLabel label1 = new JLabel();
						label1.setFont(new Font("Malgun Gothic", Font.PLAIN, 14));
						panel_17.add(label1);
						label1.setText("B");
					}
							
					if (cC1 > aA1 && cC1 > bB1) {
						Metod11(panel_17, i);
						JLabel label1 = new JLabel();
						label1.setFont(new Font("Malgun Gothic", Font.PLAIN, 14));
						panel_17.add(label1);
						label1.setText("C");
					}
				}
				
				cl.show(contentPane, "3");
				
			}
		});
		btnNewButton_1.setBounds(304, 502, 50, 30);
		panelSecond.add(btnNewButton_1);
		
		JButton btnNewButton_4 = new JButton("Вперед");
		btnNewButton_4.setFont(new Font("Malgun Gothic", Font.PLAIN, 16));
		btnNewButton_4.setFocusPainted(false);
		btnNewButton_4.setFocusable(false);
		btnNewButton_4.setBackground(Color.LIGHT_GRAY);
		btnNewButton_4.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnNewButton_4.setBounds(449, 408, 84, 30);
		btnNewButton_4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				cl.show(contentPane, "2");
			}
		});
		panelFirst.add(btnNewButton_4);
		
		JButton btnNewButton_2 = new JButton("Назад");
		btnNewButton_2.setFont(new Font("Malgun Gothic", Font.PLAIN, 16));
		btnNewButton_2.setFocusPainted(false);
		btnNewButton_2.setFocusable(false);
		btnNewButton_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnNewButton_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				cl.show(contentPane, "1");
			}
		});
		btnNewButton_2.setBounds(395, 502, 73, 30);
		panelSecond.add(btnNewButton_2);
		
		JButton btnNewButton_5 = new JButton("Вперед");
		btnNewButton_5.setFont(new Font("Malgun Gothic", Font.PLAIN, 16));
		btnNewButton_5.setFocusPainted(false);
		btnNewButton_5.setFocusable(false);
		btnNewButton_5.setBackground(Color.LIGHT_GRAY);
		btnNewButton_5.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnNewButton_5.setBounds(510, 502, 84, 30);
		btnNewButton_5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				cl.show(contentPane, "3");
			}
		});
		panelSecond.add(btnNewButton_5);
		
		cl.show(contentPane, "1");
	}
	
	public static void Povtor0(int i, ArrayList<JTextField> matrica, int j, int kakouKlass11, int maxZnach22, int diapazon, int xA2, int xA3,
			ArrayList<JTextField> A, JTextField textField_2, int xA5, int kolKlassov1, ArrayList<String> xA) {
		for (i = 0; i < matrica.size(); i++) {
			for (j = kakouKlass11; j < matrica.size(); j++) {
				String maxZnach2 = matrica.get(j).getText();
				maxZnach22 = Integer.parseInt(maxZnach2);
				if (maxZnach22 <= diapazon) {
					String xA1 = matrica.get(i).getText();
					xA2 = Integer.parseInt(xA1);
					xA3 = xA3 + xA2;
					j = j + kakouKlass11;
					i = i + kakouKlass11 + 1;
				}
				else {
					j = j + kakouKlass11;
					i = i + kakouKlass11 + 1;
				}
			}
			System.out.println(xA3);
		}
		if (xA3 != 0) {
			xA5 = xA3 / kolKlassov1;
			String xA6 = Integer.toString(xA5);
			xA.add(xA6);
			xA3 = 0;
			xA5 = 0;
		}
	}
	public static void Povtor1(int i, ArrayList<JTextField> matrica, int j, int kakouKlass11, int maxZnach22, int diapazon, int xA2, int xA3,
			ArrayList<JTextField> A, JTextField textField_2, int xA5, int kolKlassov1, ArrayList<String> xA) {
		for (i = 1; i < matrica.size() - 1; i++) {
			for (j = kakouKlass11; j < matrica.size(); j++) {
				String maxZnach2 = matrica.get(j).getText();
				maxZnach22 = Integer.parseInt(maxZnach2);
				if (maxZnach22 <= diapazon) {
					String xA1 = matrica.get(i).getText();
					xA2 = Integer.parseInt(xA1);
					xA3 = xA3 + xA2;
					j = j + kakouKlass11;
					i = i + kakouKlass11 + 1;
				}
				else {
					j = j + kakouKlass11;
					i = i + kakouKlass11 + 1;
				}						
			}
			System.out.println(xA3);
		}
		if (xA3 != 0) {
			xA5 = xA3 / kolKlassov1;
			String xA6 = Integer.toString(xA5);
			xA.add(xA6);
			xA3 = 0;
			xA5 = 0;
		}
	}
	public static void Povtor2(int i, ArrayList<JTextField> matrica, int j, int kakouKlass11, int maxZnach22, int diapazon, int xA2, int xA3,
			ArrayList<JTextField> A, JTextField textField_2, int xA5, int kolKlassov1, ArrayList<String> xA) {
		for (i = 2; i < matrica.size() - 2; i++) {
			for (j = kakouKlass11; j < matrica.size(); j++) {
				String maxZnach2 = matrica.get(j).getText();
				maxZnach22 = Integer.parseInt(maxZnach2);
				if (maxZnach22 <= diapazon) {
					String xA1 = matrica.get(i).getText();
					xA2 = Integer.parseInt(xA1);
					xA3 = xA3 + xA2;
					j = j + kakouKlass11;
					i = i + kakouKlass11 + 1;
				}
				else {
					j = j + kakouKlass11;
					i = i + kakouKlass11 + 1;
				}
			}
			System.out.println(xA3);
		}
		if (xA3 != 0) {
			xA5 = xA3 / kolKlassov1;
			String xA6 = Integer.toString(xA5);
			xA.add(xA6);
			xA3 = 0;
			xA5 = 0;
		}
	}
	public static void Povtor3(int i, ArrayList<JTextField> matrica, int j, int kakouKlass11, int maxZnach22, int diapazon, int xA2, int xA3,
			ArrayList<JTextField> A, JTextField textField_2, int xA5, int kolKlassov1, ArrayList<String> xA) {
		for (i = 3; i < matrica.size() - 3; i++) {
			for (j = kakouKlass11; j < matrica.size(); j++) {
				String maxZnach2 = matrica.get(j).getText();
				maxZnach22 = Integer.parseInt(maxZnach2);
				if (maxZnach22 <= diapazon) {
					String xA1 = matrica.get(i).getText();
					xA2 = Integer.parseInt(xA1);
					xA3 = xA3 + xA2;
					j = j + kakouKlass11;
					i = i + kakouKlass11 + 1;
				}
				else {
					j = j + kakouKlass11;
					i = i + kakouKlass11 + 1;
				}
			}
			System.out.println(xA3);
		}
		if (xA3 != 0) {
			xA5 = xA3 / kolKlassov1;
			String xA6 = Integer.toString(xA5);
			xA.add(xA6);
			xA3 = 0;
			xA5 = 0;
		}
	}
	public static void Povtor4(int i, ArrayList<JTextField> matrica, int j, int kakouKlass11, int maxZnach22, int diapazon, int xA2, int xA3,
			ArrayList<JTextField> A, JTextField textField_2, int xA5, int kolKlassov1, ArrayList<String> xA) {
		for (i = 4; i < matrica.size() - 4; i++) {
			for (j = kakouKlass11; j < matrica.size(); j++) {
				String maxZnach2 = matrica.get(j).getText();
				maxZnach22 = Integer.parseInt(maxZnach2);
				if (maxZnach22 <= diapazon) {
					String xA1 = matrica.get(i).getText();
					xA2 = Integer.parseInt(xA1);
					xA3 = xA3 + xA2;
					j = j + kakouKlass11;
					i = i + kakouKlass11 + 1;
				}
				else {
					j = j + kakouKlass11;
					i = i + kakouKlass11 + 1;
				}
			}
			System.out.println(xA3);
		}
		if (xA3 != 0) {
			xA5 = xA3 / kolKlassov1;
			String xA6 = Integer.toString(xA5);
			xA.add(xA6);
			xA3 = 0;
			xA5 = 0;
		}
	}

	public static void Povtor00(int i, ArrayList<JTextField> matrica, int j, int kakouKlass11, int maxZnach22, int diapazon1, int diapazon2, int xB2, int xB3,
			ArrayList<JTextField> B, JTextField textField_2, int xB5, int kolKlassov1, ArrayList<String> xB) {
		for (i = 0; i < matrica.size(); i++) {
			for (j = kakouKlass11; j < matrica.size(); j++) {
				String maxZnach2 = matrica.get(j).getText();
				maxZnach22 = Integer.parseInt(maxZnach2);
				if (maxZnach22 > diapazon1 && maxZnach22 <= diapazon2) {
					String xB1 = matrica.get(i).getText();
					xB2 = Integer.parseInt(xB1);
					xB3 = xB3 + xB2;
					j = j + kakouKlass11;
					i = i + kakouKlass11 + 1;
				}
				else {
					j = j + kakouKlass11;
					i = i + kakouKlass11 + 1;
				}
			}
			System.out.println(xB3);
		}
		if (xB3 != 0) {
			xB5 = xB3 / kolKlassov1;
			String xB6 = Integer.toString(xB5);
			xB.add(xB6);
			xB3 = 0;
			xB5 = 0;
		}
	}
	public static void Povtor11(int i, ArrayList<JTextField> matrica, int j, int kakouKlass11, int maxZnach22, int diapazon1, int diapazon2, int xB2, int xB3,
			ArrayList<JTextField> B, JTextField textField_2, int xB5, int kolKlassov1, ArrayList<String> xB) {
		for (i = 1; i < matrica.size() - 1; i++) {
			for (j = kakouKlass11; j < matrica.size(); j++) {
				String maxZnach2 = matrica.get(j).getText();
				maxZnach22 = Integer.parseInt(maxZnach2);
				if (maxZnach22 > diapazon1 && maxZnach22 <= diapazon2) {
					String xB1 = matrica.get(i).getText();
					xB2 = Integer.parseInt(xB1);
					xB3 = xB3 + xB2;
					j = j + kakouKlass11;
					i = i + kakouKlass11 + 1;
				}
				else {
					j = j + kakouKlass11;
					i = i + kakouKlass11 + 1;
				}	
			}
			System.out.println(xB3);
		}
		if (xB3 != 0) {
			xB5 = xB3 / kolKlassov1;
			String xB6 = Integer.toString(xB5);
			xB.add(xB6);
			xB3 = 0;
			xB5 = 0;
		}
	}
	public static void Povtor22(int i, ArrayList<JTextField> matrica, int j, int kakouKlass11, int maxZnach22, int diapazon1, int diapazon2, int xB2, int xB3,
			ArrayList<JTextField> B, JTextField textField_2, int xB5, int kolKlassov1, ArrayList<String> xB) {
		for (i = 2; i < matrica.size() - 2; i++) {
			for (j = kakouKlass11; j < matrica.size(); j++) {
				String maxZnach2 = matrica.get(j).getText();
				maxZnach22 = Integer.parseInt(maxZnach2);
				if (maxZnach22 > diapazon1 && maxZnach22 <= diapazon2) {
					String xB1 = matrica.get(i).getText();
					xB2 = Integer.parseInt(xB1);
					xB3 = xB3 + xB2;
					j = j + kakouKlass11;
					i = i + kakouKlass11 + 1;
				}
				else {
					j = j + kakouKlass11;
					i = i + kakouKlass11 + 1;
				}	
			}
			System.out.println(xB3);
		}
		if (xB3 != 0) {
			xB5 = xB3 / kolKlassov1;
			String xB6 = Integer.toString(xB5);
			xB.add(xB6);
			xB3 = 0;
			xB5 = 0;
		}
	}
	public static void Povtor33(int i, ArrayList<JTextField> matrica, int j, int kakouKlass11, int maxZnach22, int diapazon1, int diapazon2, int xB2, int xB3,
			ArrayList<JTextField> B, JTextField textField_2, int xB5, int kolKlassov1, ArrayList<String> xB) {
		for (i = 3; i < matrica.size() - 3; i++) {
			for (j = kakouKlass11; j < matrica.size(); j++) {
				String maxZnach2 = matrica.get(j).getText();
				maxZnach22 = Integer.parseInt(maxZnach2);
				if (maxZnach22 > diapazon1 && maxZnach22 <= diapazon2) {
					String xB1 = matrica.get(i).getText();
					xB2 = Integer.parseInt(xB1);
					xB3 = xB3 + xB2;
					j = j + kakouKlass11;
					i = i + kakouKlass11 + 1;
				}
				else {
					j = j + kakouKlass11;
					i = i + kakouKlass11 + 1;
				}
			}
			System.out.println(xB3);
		}
		if (xB3 != 0) {
			xB5 = xB3 / kolKlassov1;
			String xB6 = Integer.toString(xB5);
			xB.add(xB6);
			xB3 = 0;
			xB5 = 0;
		}
	}
	public static void Povtor44(int i, ArrayList<JTextField> matrica, int j, int kakouKlass11, int maxZnach22, int diapazon1, int diapazon2, int xB2, int xB3,
			ArrayList<JTextField> B, JTextField textField_2, int xB5, int kolKlassov1, ArrayList<String> xB) {
		for (i = 4; i < matrica.size() - 4; i++) {
			for (j = kakouKlass11; j < matrica.size(); j++) {
				String maxZnach2 = matrica.get(j).getText();
				maxZnach22 = Integer.parseInt(maxZnach2);
				if (maxZnach22 > diapazon1 && maxZnach22 <= diapazon2) {
					String xB1 = matrica.get(i).getText();
					xB2 = Integer.parseInt(xB1);
					xB3 = xB3 + xB2;
					j = j + kakouKlass11;
					i = i + kakouKlass11 + 1;
				}
				else {
					j = j + kakouKlass11;
					i = i + kakouKlass11 + 1;
				}
			}
			System.out.println(xB3);
		}
		if (xB3 != 0) {
			xB5 = xB3 / kolKlassov1;
			String xB6 = Integer.toString(xB5);
			xB.add(xB6);
			xB3 = 0;
			xB5 = 0;
		}
	}
	
	public static void Metod1(int i, int number1, ArrayList<String> xA, int xAI, int y, ArrayList<JTextField> mkiMatrica, int mkiMat1, int mA1,
			ArrayList<String> mA) {
		for (i = 0; i < xA.size(); i++) {
			String xAS = xA.get(i);
			xAI = Integer.parseInt(xAS);
			y = i;
			String mkiMat = mkiMatrica.get(y).getText();
			mkiMat1 = Integer.parseInt(mkiMat);
			mA1 = mA1 + (xAI - mkiMat1) * (xAI - mkiMat1);
		}
		String xASS = Integer.toString(mA1);
		mA.add(xASS);				
		mA1 = 0;
		xAI = 0;
	}
	public static void Metod2(int i, int number1, ArrayList<String> xA, int xAI, int y, ArrayList<JTextField> mkiMatrica, int mkiMat1, int mA1,
			ArrayList<String> mA) {
		for (i = 0; i < xA.size(); i++) {
			String xAS = xA.get(i);
			xAI = Integer.parseInt(xAS);
			y = i + number1;
			String mkiMat = mkiMatrica.get(y).getText();
			mkiMat1 = Integer.parseInt(mkiMat);
			mA1 = mA1 + (xAI - mkiMat1) * (xAI - mkiMat1);
		}
		String xASS = Integer.toString(mA1);
		mA.add(xASS);				
		mA1 = 0;
		xAI = 0;
	}
	
	public static void Metod11(JPanel panel_9, int i) {
		JLabel label = new JLabel();
		label.setFont(new Font("Malgun Gothic", Font.PLAIN, 14));
		panel_9.add(label);
		if (i == 0) {
		label.setText("M1 ∈");
		}
		if (i == 1) {
			label.setText("M2 ∈");
		}
		if (i == 2) {
			label.setText("M3 ∈");
		}
		if (i == 3) {
			label.setText("M4 ∈");
		}
		if (i == 4) {
			label.setText("M5 ∈");
		}
	}
	
	public static void Metod111(JPanel panel_8, ArrayList<String> mA, ArrayList<String> mB, ArrayList<String> mC, int b) {
		JLabel label1 = new JLabel();
		label1.setFont(new Font("Malgun Gothic", Font.PLAIN, 14));
		panel_8.add(label1);
		label1.setText("(");
			
		JLabel label11 = new JLabel();
		label11.setFont(new Font("Malgun Gothic", Font.PLAIN, 14));
		panel_8.add(label11);
		label11.setText(mA.get(b));
		
		JLabel label111 = new JLabel();
		label111.setFont(new Font("Malgun Gothic", Font.PLAIN, 14));
		panel_8.add(label111);
		label111.setText(mB.get(b));
						
		JLabel label1111 = new JLabel();
		label1111.setFont(new Font("Malgun Gothic", Font.PLAIN, 14));
		panel_8.add(label1111);
		label1111.setText(mC.get(b));

		JLabel label11111 = new JLabel();
		label11111.setFont(new Font("Malgun Gothic", Font.PLAIN, 14));
		panel_8.add(label11111);
		label11111.setText(")");
	}
	
	public static void Metod3(int i, int number1, ArrayList<String> xA, double xAI1, int yy, int y, ArrayList<JTextField> dshkiMatrica, double dshkiMat1,
			ArrayList<JTextField> mkiMatrica, double mkiMat1, double mA2, ArrayList<String> mA11) {
		for (i = 0; i < xA.size(); i++) {
			String xAS = xA.get(i);
			xAI1 = Double.parseDouble(xAS);
			yy = y = i;
			String dshkiMat = dshkiMatrica.get(yy).getText();
			dshkiMat1 = Double.parseDouble(dshkiMat);
			String mkiMat = mkiMatrica.get(y).getText();
			mkiMat1 = Double.parseDouble(mkiMat);	
			mA2 = mA2 + (dshkiMat1 * (xAI1 - mkiMat1) * (xAI1 - mkiMat1));
		}
		String xASS = Double.toString(mA2);
		mA11.add(xASS);				
		mA2 = 0;
		xAI1 = 0;
	}
}