package com.google.resources;

/**
 *
 * @author Yura Hilevich
 */
public class Contact_Jframe extends javax.swing.JFrame {

	/**
	 * Creates new form Contact_Jframe
	 */
	public Contact_Jframe() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 */

	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jRadioButton1 = new javax.swing.JRadioButton();
		jRadioButton2 = new javax.swing.JRadioButton();
		jRadioButton3 = new javax.swing.JRadioButton();
		jRadioButton4 = new javax.swing.JRadioButton();
		jTextField2 = new javax.swing.JTextField();
		jTextField3 = new javax.swing.JTextField();
		jTextField1 = new javax.swing.JTextField();
		jTextField4 = new javax.swing.JTextField();

		// setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setBackground(new java.awt.Color(240, 240, 240));

		jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\юра\\Desktop\\Проект\\Site\\imeges\\UF5nFsb_lbc.jpg")); // NOI18N

		jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jRadioButton1.setText("Phone");
		jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jRadioButton1ActionPerformed(evt);
			}
		});

		jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jRadioButton2.setText("Email");
		jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jRadioButton2ActionPerformed(evt);
			}
		});

		jRadioButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jRadioButton3.setText("Skype");
		jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jRadioButton3ActionPerformed(evt);
			}
		});

		jRadioButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jRadioButton4.setText("vk.com");
		jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jRadioButton4ActionPerformed(evt);
			}
		});

		jTextField2.setBackground(new java.awt.Color(240, 240, 240));
		jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jTextField2.setText("***");
		jTextField2.setBorder(null);
		jTextField2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
		jTextField2.setEnabled(false);

		jTextField1.setBackground(new java.awt.Color(240, 240, 240));
		jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jTextField1.setText("***");
		jTextField1.setBorder(null);
		jTextField1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
		jTextField1.setEnabled(false);

		jTextField3.setBackground(new java.awt.Color(240, 240, 240));
		jTextField3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jTextField3.setText("***");
		jTextField3.setBorder(null);
		jTextField3.setDisabledTextColor(new java.awt.Color(0, 0, 0));
		jTextField3.setEnabled(false);

		jTextField4.setBackground(new java.awt.Color(240, 240, 240));
		jTextField4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
		jTextField4.setText("***");
		jTextField4.setBorder(null);
		jTextField4.setDisabledTextColor(new java.awt.Color(0, 0, 0));
		jTextField4.setEnabled(false);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addContainerGap()
				.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addGap(21, 21, 21)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jTextField2)
						.addComponent(jRadioButton2, javax.swing.GroupLayout.Alignment.TRAILING,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)
						.addComponent(jRadioButton1, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jRadioButton3, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jRadioButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
						.addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING).addComponent(jTextField1)
						.addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING))
				.addGap(31, 31, 31)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
						.addGroup(layout.createSequentialGroup().addComponent(jRadioButton1)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18).addComponent(jRadioButton2)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18).addComponent(jRadioButton3)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(25, 25, 25).addComponent(jRadioButton4)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 21,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 256,
								javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(33, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>

	private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		if (jRadioButton2.isSelected()) {

			jTextField3.setText("busk.yura@gmail.com");

		} else {

			jTextField3.setText("***");

		}

	}

	private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		if (jRadioButton3.isSelected()) {

			jTextField1.setText("yura_hilevich");

		} else {

			jTextField1.setText("***");

		}
	}

	private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		if (jRadioButton1.isSelected()) {

			jTextField2.setText("+380989791073");

		} else {

			jTextField2.setText("***");

		}
	}

	private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		if (jRadioButton4.isSelected()) {

			jTextField4.setText("https://vk.com/yura_hilevich");

		} else {

			jTextField4.setText("***");

		}
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public void contact_JframeMain() {

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Contact_Jframe.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Contact_Jframe.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Contact_Jframe.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Contact_Jframe.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Contact_Jframe().setVisible(true);
			}
		});
	}

	private javax.swing.JLabel jLabel1;
	private javax.swing.JRadioButton jRadioButton1;
	private javax.swing.JRadioButton jRadioButton2;
	private javax.swing.JRadioButton jRadioButton3;
	private javax.swing.JRadioButton jRadioButton4;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;

}
