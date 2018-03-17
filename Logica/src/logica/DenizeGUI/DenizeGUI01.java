package logica.DenizeGUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Font;

@SuppressWarnings("serial")
public class DenizeGUI01 extends JFrame implements ActionListener {
	private JPanel contentPane;
	private JLabel txtNome;
	private JTextField tfNome;
	private JLabel txtEnd;
	private JTextField tfEnd;
	private JButton btnSalvar;
	private JButton btnListar;
	private JButton btnSair;

	private List<Fornecedor> cadastro = new ArrayList<>();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DenizeGUI01 frame = new DenizeGUI01();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public DenizeGUI01() {
		setTitle("Cad. Fornecedor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 221);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		txtNome = new JLabel();
		txtNome.setText("Nome");
		
		tfNome = new JTextField();
		tfNome.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		tfNome.setColumns(10);
		
		txtEnd = new JLabel();
		txtEnd.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtEnd.setText("End.");
		
		tfEnd = new JTextField();
		tfEnd.setFont(new Font("Tahoma", Font.ITALIC, 11));
		tfEnd.setColumns(10);
		
		btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(this);
		
		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		
		btnSair = new JButton("Sair");
		btnSair.addActionListener(this);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(txtEnd, Alignment.LEADING, 0, 0, Short.MAX_VALUE)
								.addComponent(txtNome, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
							.addGap(27)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(tfNome, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 335, GroupLayout.PREFERRED_SIZE)
								.addComponent(tfEnd, GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnSalvar)
							.addPreferredGap(ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
							.addComponent(btnListar)
							.addGap(108)
							.addComponent(btnSair)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtNome)
						.addComponent(tfNome, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
					.addGap(33)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtEnd)
						.addComponent(tfEnd, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
					.addGap(42)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSair)
						.addComponent(btnSalvar)
						.addComponent(btnListar))
					.addContainerGap(104, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
		
		getRootPane().setDefaultButton(btnSalvar);
		
		setLocationRelativeTo(null);
	}

	public void actionPerformed(ActionEvent evento) {
		Object botao = evento.getSource();
		
		if (botao.equals(btnSalvar))  {
			String nome = tfNome.getText();
			String end  = tfEnd.getText();
			
			Fornecedor obj = new Fornecedor();
			obj.setNome(nome);
			obj.setEnd(end);
			
			cadastro.add(obj);
			
			tfNome.setText("");
			tfEnd.setText("");
			tfNome.requestFocus();
			
		} else if(botao.equals(btnListar)) {
			String msg = "Cad. Fornecedor\n\n";
			for (Fornecedor fornecedor : cadastro) {
				msg += fornecedor + "\n";
			}
			JOptionPane.showMessageDialog(this, msg);
		} else { 
			System.exit(0);
		}
	}
}
