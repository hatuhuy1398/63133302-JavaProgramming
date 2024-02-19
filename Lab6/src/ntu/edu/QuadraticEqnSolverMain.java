package ntu.edu;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class QuadraticEqnSolverMain extends JFrame implements ActionListener {
		
	private static final int NUMBEROFCOLUMNS = 4;
	private static final String STRXCUBE = "x^3 + ";
	private static final String STRXSQUARED = "x^2 + ";
	private static final String STRX = "x +";
	private static final String STREQUALSZERO = "= 0";
	private static final String STRJBSOLVE = "GiaiPhuongTrinh!";
	private static final String STRNOREALROOTS = "Khong co nghiem ";
	private static final String STRINTREALROOTS = "Vo so co nghiem ";
	private static final String STRANSWERPARTONE = "x1 = ";
	private static final String STRANSWERPARTTWO = " va x2 = ";
	private static final String STRANSWERPARTTHREE = " va x3 = ";
	
	private JTextField jtfCoeffA;
	private JTextField jtfCoeffB;
	private JTextField jtfCoeffC;
	private JTextField jtfCoeffD;
	
	private JPanel jpMainPanel;
	
	private JPanel jpSubPanelUpper;
	
	private JButton jbSolve;
	
	
	
	private JLabel jlSolution;
	
	/**
	 * Constructor class
	 */
	public QuadraticEqnSolverMain(){
		setTitle("Giai Phuong Trinh Bac 1,2,3");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		initialiseComponents();
		pack();
	}
	
	/**
	 * Sets up GUI
	 */
	void initialiseComponents(){
		jpMainPanel = new JPanel(new GridLayout(5,1));
		
		jpSubPanelUpper = new JPanel();
		
		jtfCoeffA = new JTextField(NUMBEROFCOLUMNS);
		jpSubPanelUpper.add(jtfCoeffA);
		
		jpSubPanelUpper.add(new JLabel(STRXCUBE));
		
		jtfCoeffB = new JTextField(NUMBEROFCOLUMNS);
		jpSubPanelUpper.add(jtfCoeffB);

		jpSubPanelUpper.add(new JLabel(STRXSQUARED));
		
		jtfCoeffC = new JTextField(NUMBEROFCOLUMNS);
		jpSubPanelUpper.add(jtfCoeffC);
		
		jpSubPanelUpper.add(new JLabel(STRX));
		
		jtfCoeffD = new JTextField(NUMBEROFCOLUMNS);
		jpSubPanelUpper.add(jtfCoeffD);
		
		jpSubPanelUpper.add(new JLabel(STREQUALSZERO));
		
		jpMainPanel.add(jpSubPanelUpper);
		
		jbSolve = new JButton(STRJBSOLVE);
		jbSolve.addActionListener(this);
		
		jpMainPanel.add(jbSolve);
		
		jlSolution = new JLabel("");
		
		jpMainPanel.add(jlSolution);
		
		setAllTextFieldsToZero();
		
		this.add(jpMainPanel);
	}
	
	/**
	 * Self-explanatory
	 */
	void setAllTextFieldsToZero(){
		jtfCoeffA.setText("0");
		jtfCoeffB.setText("0");
		jtfCoeffC.setText("0");
		jtfCoeffD.setText("0");
	}
	
	/**
	 * Method invoked upon button press
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		
		double b = Integer.parseInt(jtfCoeffB.getText());
		double a = Integer.parseInt(jtfCoeffA.getText());
		double c = Integer.parseInt(jtfCoeffC.getText());
		double d = Integer.parseInt(jtfCoeffD.getText());
		
           
            if (a==0) {
            	if (b==0) {
            		if (c == 0) {
                        if (d == 0) {
                        	jlSolution.setText(STRINTREALROOTS);
                        } else {
                        	jlSolution.setText(STRNOREALROOTS);
                        }
                    } else {
                        double x = -d / c;
                        String answer= STRANSWERPARTONE+(x);
                        jlSolution.setText(answer);
                    }
            	}
            	else {
            	double delta = c * c - 4 * b * d;

            	if (delta > 0) {
                    double root1 = (-c + Math.sqrt(delta)) / (2 * b);
                    double root2 = (-c - Math.sqrt(delta)) / (2 * b);
                    String answer= STRANSWERPARTONE+(root1);
                    String answer1= STRANSWERPARTTWO+(root2);
                    jlSolution.setText(answer+answer1);
                } else if (delta == 0) {
                    double root = -c / (2 * b);
                    String answer= STRANSWERPARTONE+(root);
                    jlSolution.setText(answer);
                } else {
                    double realPart = -c / (2 * b);
                    double imaginaryPart = Math.sqrt(Math.abs(delta)) / (2 * b);
                    String answer= STRANSWERPARTONE+(realPart)+(imaginaryPart)+("i");
                    String answer1= STRANSWERPARTTWO+(realPart)+("-")+(imaginaryPart)+("i");
                    jlSolution.setText(answer +answer1);
                }
            	}
            }
            else {
            double delta = b * b * c * c - 4 * a * c * c * c - 4 * b * b * b * d - 27 * a * a * d * d + 18 * a * b * c * d;
            if (delta > 0) {
                double deltaCubed = Math.cbrt(delta + Math.sqrt(delta * delta - 4 * Math.pow(c, 3) * delta));
                double x1 = (-1 / (2 * a)) * (b + deltaCubed) + Math.cbrt(deltaCubed);
                double x2 = (-1 / (2 * a)) * (b - 0.5 * deltaCubed + (Math.sqrt(3) / 2) * Math.sqrt(4 * a * c - b * b + deltaCubed));
                double x3 = (-1 / (2 * a)) * (b - 0.5 * deltaCubed - (Math.sqrt(3) / 2) * Math.sqrt(4 * a * c - b * b + deltaCubed));
                String answer1= STRANSWERPARTONE+(x1);
                String answer2= STRANSWERPARTTWO+(x2);
                String answer3= STRANSWERPARTTHREE+(x3);
                jlSolution.setText(answer1 +answer2 +answer3);
               
            } else if (delta == 0) {
                double x1 = (-1 / (2 * a)) * (b + Math.signum(b) * Math.cbrt(c / Math.pow(Math.abs(b), 3) * 27 * a * a * a));
                double x2 = (-1 / (2 * a)) * (b - Math.signum(b) * Math.cbrt(c / Math.pow(Math.abs(b), 3) * 27 * a * a * a));
                double x3 = (-1 / (2 * a)) * (b - Math.signum(b) * Math.cbrt(c / Math.pow(Math.abs(b), 3) * 27 * a * a * a));

                String answer1= STRANSWERPARTONE+(x1);
                String answer2= STRANSWERPARTTWO+(x2);
                String answer3= STRANSWERPARTTHREE+(x3);
                jlSolution.setText(answer1 +answer2 +answer3);
            } else {
                double x1 = (-1 / (2 * a)) * (b + Math.cbrt(-1) * c / Math.cbrt(27 * a * a * a));
                double x2 = (-1 / (2 * a)) * (b - Math.cbrt(-1) * c / Math.cbrt(27 * a * a * a));
                double x3 = (-1 / (2 * a)) * (b - Math.cbrt(-1) * c / Math.cbrt(27 * a * a * a));
                String answer1= STRANSWERPARTONE+(x1);
                String answer2= STRANSWERPARTTWO+(x2)+("+i")+(Math.sqrt(3) / 2) * Math.cbrt(27 * a * a * a);
                String answer3= STRANSWERPARTTHREE+(x3)+("-i")+(Math.sqrt(3) / 2) * Math.cbrt(27 * a * a * a);
                jlSolution.setText(answer1 +answer2 +answer3);
               
            }
            }
       
		
	}
	
	public static void main(String[] args){
		SwingUtilities.invokeLater(new Runnable() {
			public void run(){
				new QuadraticEqnSolverMain().setVisible(true);
			}
		});
	}

}
