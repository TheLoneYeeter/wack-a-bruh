import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WackAMole extends JFrame {
	static int mole = (int)(Math.random() * 32 + 1);
	
	private JButton btnBruh1;
	private JButton btnBruh2;
	private JButton btnBruh3;
	private JButton btnBruh4;
	private JButton btnBruh5;
	private JButton btnBruh6;
	private JButton btnBruh7;
	private JButton btnBruh8;
	private JButton btnBruh9;
	private JButton btnBruh10;
	private JButton btnBruh11;
	private JButton btnBruh12;
	private JButton btnBruh13;
	private JButton btnBruh14;
	private JButton btnBruh15;
	private JButton btnBruh16;
	private JButton btnBruh17;
	private JButton btnBruh18;
	private JButton btnBruh19;
	private JButton btnBruh20;
	private JButton btnBruh21;
	private JButton btnBruh22;
	private JButton btnBruh23;
	private JButton btnBruh24;
	private JButton btnBruh25;
	private JButton btnBruh26;
	private JButton btnBruh27;
	private JButton btnBruh28;
	private JButton btnBruh29;
	private JButton btnBruh30;
	private JButton btnBruh31;
	private JButton btnBruh32;

	public void MoleWack() {
		mole = (int)(Math.random() * 32 + 1);
		if (mole == 1) {
			btnBruh1.setVisible(true);
		}
		else if (mole == 2) {
			btnBruh2.setVisible(true);
		}
		else if (mole == 3) {
			btnBruh3.setVisible(true);
		}
		else if (mole == 4) {
			btnBruh4.setVisible(true);
		}
		else if (mole == 5) {
			btnBruh5.setVisible(true);
		}
		else if (mole == 6) {
			btnBruh6.setVisible(true);
		}
		else if (mole == 7) {
			btnBruh7.setVisible(true);
		}
		else if (mole == 8) {
			btnBruh8.setVisible(true);
		}
		else if (mole == 9) {
			btnBruh9.setVisible(true);
		}
		else if (mole == 10) {
			btnBruh10.setVisible(true);
		}
		else if (mole == 11) {
			btnBruh11.setVisible(true);
		}
		else if (mole == 12) {
			btnBruh12.setVisible(true);
		}
		else if (mole == 13) {
			btnBruh13.setVisible(true);
		}
		else if (mole == 14) {
			btnBruh14.setVisible(true);
		}
		else if (mole == 14) {
			btnBruh14.setVisible(true);
		}
		else if (mole == 15) {
			btnBruh15.setVisible(true);
		}
		else if (mole == 16) {
			btnBruh16.setVisible(true);
		}
		else if (mole == 17) {
			btnBruh17.setVisible(true);
		}
		else if (mole == 18) {
			btnBruh18.setVisible(true);
		}
		else if (mole == 19) {
			btnBruh19.setVisible(true);
		}
		else if (mole == 20) {
			btnBruh20.setVisible(true);
		}
		else if (mole == 21) {
			btnBruh21.setVisible(true);
		}
		else if (mole == 22) {
			btnBruh22.setVisible(true);
		}
		else if (mole == 23) {
			btnBruh23.setVisible(true);
		}
		else if (mole == 24) {
			btnBruh24.setVisible(true);
		}
		else if (mole == 25) {
			btnBruh25.setVisible(true);
		}
		else if (mole == 26) {
			btnBruh26.setVisible(true);
		}
		else if (mole == 26) {
			btnBruh26.setVisible(true);
		}
		else if (mole == 27) {
			btnBruh27.setVisible(true);
		}
		else if (mole == 28) {
			btnBruh28.setVisible(true);
		}
		else if (mole == 29) {
			btnBruh29.setVisible(true);
		}
		else if (mole == 30) {
			btnBruh30.setVisible(true);
		}
		else if (mole == 31) {
			btnBruh31.setVisible(true);
		}
		else if (mole == 32) {
			btnBruh32.setVisible(true);
		}
	}
	public WackAMole() {
		setTitle("Wack-a-Bruh");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblTitle = new JLabel("<html><u>Wack-a-Mole</u></html>");
		lblTitle.setToolTipText("You know what to do");
		lblTitle.setFont(new Font("Ubuntu", Font.BOLD, 18));
		lblTitle.setBounds(10, 11, 268, 23);
		getContentPane().add(lblTitle);
		
		JButton btnBruh1 = new JButton("bruh");
		btnBruh1.setVisible(true);
		btnBruh1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MoleWack();
			}
		});
		btnBruh1.setFont(new Font("Ubuntu", Font.PLAIN, 14));
		btnBruh1.setBounds(10, 175, 89, 23);
		getContentPane().add(btnBruh1);
		
		JButton btnBruh2 = new JButton("bruh");
		btnBruh2.setVisible(false);
		btnBruh2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MoleWack();
			}
		});
		btnBruh2.setFont(new Font("Ubuntu", Font.PLAIN, 14));
		btnBruh2.setBounds(10, 201, 89, 23);
		getContentPane().add(btnBruh2);
		
		JButton btnBruh3 = new JButton("bruh");
		btnBruh3.setVisible(false);
		btnBruh3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MoleWack();
			}
		});
		btnBruh3.setFont(new Font("Ubuntu", Font.PLAIN, 14));
		btnBruh3.setBounds(118, 175, 89, 23);
		getContentPane().add(btnBruh3);
		
		JButton btnBruh4 = new JButton("bruh");
		btnBruh4.setVisible(false);
		btnBruh4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MoleWack();
			}
		});
		btnBruh4.setFont(new Font("Ubuntu", Font.PLAIN, 14));
		btnBruh4.setBounds(118, 201, 89, 23);
		getContentPane().add(btnBruh4);
		
		JButton btnBruh5 = new JButton("bruh");
		btnBruh5.setVisible(false);
		btnBruh5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MoleWack();
			}
		});
		btnBruh5.setFont(new Font("Ubuntu", Font.PLAIN, 14));
		btnBruh5.setBounds(226, 201, 89, 23);
		getContentPane().add(btnBruh5);
		
		JButton btnBruh6 = new JButton("bruh");
		btnBruh6.setVisible(false);
		btnBruh6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MoleWack();
			}
		});
		btnBruh6.setFont(new Font("Ubuntu", Font.PLAIN, 14));
		btnBruh6.setBounds(226, 175, 89, 23);
		getContentPane().add(btnBruh6);
		
		JButton btnBruh7 = new JButton("bruh");
		btnBruh7.setVisible(false);
		btnBruh7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MoleWack();
			}
		});
		btnBruh7.setFont(new Font("Ubuntu", Font.PLAIN, 14));
		btnBruh7.setBounds(335, 175, 89, 23);
		getContentPane().add(btnBruh7);
		
		JButton btnBruh8 = new JButton("bruh");
		btnBruh8.setVisible(false);
		btnBruh8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MoleWack();
			}
		});
		btnBruh8.setFont(new Font("Ubuntu", Font.PLAIN, 14));
		btnBruh8.setBounds(335, 201, 89, 23);
		getContentPane().add(btnBruh8);
		
		JButton btnBruh9 = new JButton("bruh");
		btnBruh9.setVisible(false);
		btnBruh9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MoleWack();
			}
		});
		btnBruh9.setFont(new Font("Ubuntu", Font.PLAIN, 14));
		btnBruh9.setBounds(10, 227, 89, 23);
		getContentPane().add(btnBruh9);
		
		JButton btnBruh10 = new JButton("bruh");
		btnBruh10.setVisible(false);
		btnBruh10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MoleWack();
			}
		});
		btnBruh10.setFont(new Font("Ubuntu", Font.PLAIN, 14));
		btnBruh10.setBounds(118, 227, 89, 23);
		getContentPane().add(btnBruh10);
		
		JButton btnBruh11 = new JButton("bruh");
		btnBruh11.setVisible(false);
		btnBruh11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MoleWack();
			}
		});
		btnBruh11.setFont(new Font("Ubuntu", Font.PLAIN, 14));
		btnBruh11.setBounds(226, 227, 89, 23);
		getContentPane().add(btnBruh11);
		
		JButton btnBruh12 = new JButton("bruh");
		btnBruh12.setVisible(false);
		btnBruh12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MoleWack();
			}
		});
		btnBruh12.setFont(new Font("Ubuntu", Font.PLAIN, 14));
		btnBruh12.setBounds(335, 227, 89, 23);
		getContentPane().add(btnBruh12);
		
		JButton btnBruh13 = new JButton("bruh");
		btnBruh13.setVisible(false);
		btnBruh13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MoleWack();
			}
		});
		btnBruh13.setFont(new Font("Ubuntu", Font.PLAIN, 14));
		btnBruh13.setBounds(10, 98, 89, 23);
		getContentPane().add(btnBruh13);
		
		JButton btnBruh14 = new JButton("bruh");
		btnBruh14.setVisible(false);
		btnBruh14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MoleWack();
			}
		});
		btnBruh14.setFont(new Font("Ubuntu", Font.PLAIN, 14));
		btnBruh14.setBounds(118, 98, 89, 23);
		getContentPane().add(btnBruh14);
		
		JButton btnBruh15 = new JButton("bruh");
		btnBruh15.setVisible(false);
		btnBruh15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MoleWack();
			}
		});
		btnBruh15.setFont(new Font("Ubuntu", Font.PLAIN, 14));
		btnBruh15.setBounds(10, 124, 89, 23);
		getContentPane().add(btnBruh15);
		
		JButton btnBruh16 = new JButton("bruh");
		btnBruh16.setVisible(false);
		btnBruh16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MoleWack();
			}
		});
		btnBruh16.setFont(new Font("Ubuntu", Font.PLAIN, 14));
		btnBruh16.setBounds(118, 124, 89, 23);
		getContentPane().add(btnBruh16);
		
		JButton btnBruh17 = new JButton("bruh");
		btnBruh17.setVisible(false);
		btnBruh17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MoleWack();
			}
		});
		btnBruh17.setFont(new Font("Ubuntu", Font.PLAIN, 14));
		btnBruh17.setBounds(10, 150, 89, 23);
		getContentPane().add(btnBruh17);
		
		JButton btnBruh18 = new JButton("bruh");
		btnBruh18.setVisible(false);
		btnBruh18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MoleWack();
			}
		});
		btnBruh18.setFont(new Font("Ubuntu", Font.PLAIN, 14));
		btnBruh18.setBounds(118, 150, 89, 23);
		getContentPane().add(btnBruh18);
		
		JButton btnBruh19 = new JButton("bruh");
		btnBruh19.setVisible(false);
		btnBruh19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MoleWack();
			}
		});
		btnBruh19.setFont(new Font("Ubuntu", Font.PLAIN, 14));
		btnBruh19.setBounds(226, 150, 89, 23);
		getContentPane().add(btnBruh19);
		
		JButton btnBruh20 = new JButton("bruh");
		btnBruh20.setVisible(false);
		btnBruh20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MoleWack();
			}
		});
		btnBruh20.setFont(new Font("Ubuntu", Font.PLAIN, 14));
		btnBruh20.setBounds(226, 124, 89, 23);
		getContentPane().add(btnBruh20);
		
		JButton btnBruh21 = new JButton("bruh");
		btnBruh21.setVisible(false);
		btnBruh21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MoleWack();
			}
		});
		btnBruh21.setFont(new Font("Ubuntu", Font.PLAIN, 14));
		btnBruh21.setBounds(226, 98, 89, 23);
		getContentPane().add(btnBruh21);
		
		JButton btnBruh22 = new JButton("bruh");
		btnBruh22.setVisible(false);
		btnBruh22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MoleWack();
			}
		});
		btnBruh22.setFont(new Font("Ubuntu", Font.PLAIN, 14));
		btnBruh22.setBounds(335, 98, 89, 23);
		getContentPane().add(btnBruh22);
		
		JButton btnBruh23 = new JButton("bruh");
		btnBruh23.setVisible(false);
		btnBruh23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MoleWack();
			}
		});
		btnBruh23.setFont(new Font("Ubuntu", Font.PLAIN, 14));
		btnBruh23.setBounds(335, 124, 89, 23);
		getContentPane().add(btnBruh23);
		
		JButton btnBruh24 = new JButton("bruh");
		btnBruh24.setVisible(false);
		btnBruh24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MoleWack();
			}
		});
		btnBruh24.setFont(new Font("Ubuntu", Font.PLAIN, 14));
		btnBruh24.setBounds(335, 150, 89, 23);
		getContentPane().add(btnBruh24);
		
		JButton btnBruh25 = new JButton("bruh");
		btnBruh25.setVisible(false);
		btnBruh25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MoleWack();
			}
		});
		btnBruh25.setFont(new Font("Ubuntu", Font.PLAIN, 14));
		btnBruh25.setBounds(10, 72, 89, 23);
		getContentPane().add(btnBruh25);
		
		JButton btnBruh26 = new JButton("bruh");
		btnBruh26.setVisible(false);
		btnBruh26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MoleWack();
			}
		});
		btnBruh26.setFont(new Font("Ubuntu", Font.PLAIN, 14));
		btnBruh26.setBounds(118, 72, 89, 23);
		getContentPane().add(btnBruh26);
		
		JButton btnBruh27 = new JButton("bruh");
		btnBruh27.setVisible(false);
		btnBruh27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MoleWack();
			}
		});
		btnBruh27.setFont(new Font("Ubuntu", Font.PLAIN, 14));
		btnBruh27.setBounds(226, 72, 89, 23);
		getContentPane().add(btnBruh27);
		
		JButton btnBruh28 = new JButton("bruh");
		btnBruh28.setVisible(false);
		btnBruh28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MoleWack();
			}
		});
		btnBruh28.setFont(new Font("Ubuntu", Font.PLAIN, 14));
		btnBruh28.setBounds(335, 72, 89, 23);
		getContentPane().add(btnBruh28);
		
		JButton btnBruh29 = new JButton("bruh");
		btnBruh29.setVisible(false);
		btnBruh29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MoleWack();
			}
		});
		btnBruh29.setFont(new Font("Ubuntu", Font.PLAIN, 14));
		btnBruh29.setBounds(10, 45, 89, 23);
		getContentPane().add(btnBruh29);
		
		JButton btnBruh30 = new JButton("bruh");
		btnBruh30.setVisible(false);
		btnBruh30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MoleWack();
			}
		});
		btnBruh30.setFont(new Font("Ubuntu", Font.PLAIN, 14));
		btnBruh30.setBounds(118, 45, 89, 23);
		getContentPane().add(btnBruh30);
		
		JButton btnBruh31 = new JButton("bruh");
		btnBruh31.setVisible(false);
		btnBruh31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MoleWack();
			}
		});
		btnBruh31.setFont(new Font("Ubuntu", Font.PLAIN, 14));
		btnBruh31.setBounds(226, 45, 89, 23);
		getContentPane().add(btnBruh31);
		
		JButton btnBruh32 = new JButton("bruh");
		btnBruh32.setVisible(false);
		btnBruh32.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MoleWack();
			}
		});
		btnBruh32.setFont(new Font("Ubuntu", Font.PLAIN, 14));
		btnBruh32.setBounds(335, 45, 89, 23);
		getContentPane().add(btnBruh32);
		
		JLabel lblWacks = new JLabel("Wacks:");
		lblWacks.setFont(new Font("Ubuntu", Font.PLAIN, 15));
		lblWacks.setBounds(334, 20, 48, 14);
		getContentPane().add(lblWacks);
		
		JLabel lblWackNum = new JLabel("0");
		lblWackNum.setFont(new Font("Ubuntu", Font.PLAIN, 15));
		lblWackNum.setBounds(385, 20, 39, 14);
		getContentPane().add(lblWackNum);
	}
	
	public static void main(String[] args) {
		WackAMole wackABruh = new WackAMole();
		wackABruh.setSize(new Dimension(450,300));
		wackABruh.setVisible(true);
		System.out.println(mole);
	}
}
