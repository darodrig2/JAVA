package logica.DenizeGUI;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.AbstractButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import logica.DenizeGUI.Endereço;


@SuppressWarnings("serial")

public class DenizeGUI02 extends JFrame implements ActionListener {
    
    private JLabel lblNome;
	private JTextField textField;
	private JLabel lblLogr;
	private JTextField textField_1;
	private JLabel lblN;
	private JTextField textField_2;
	private JLabel lblBairro;
	private JTextField textField_3;
	private JLabel lblCep;
	private JTextField textField_4;
	private JButton btnSalvar;
	private JButton btnListar;
	private JButton btnSair;

	
	private List<Endereço> cadastro = new ArrayList<>();
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DenizeGUI02 frame = new DenizeGUI02();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

		public DenizeGUI02() {
			setTitle("Cad. Endereço");
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 453, 239);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		lblNome = new JLabel("Nome");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		lblLogr = new JLabel("Logr.");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		lblN = new JLabel("N°");
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		lblBairro = new JLabel("Bairro");
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		lblCep = new JLabel("CEP");
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		btnSalvar = new JButton("Salvar");
		
		btnListar = new JButton("Listar");
		
		btnSair = new JButton("Sair");
		GroupLayout gl_contentPane = new GroupLayout(getContentPane());
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblLogr)
						.addComponent(lblNome, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblBairro))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(textField, GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(lblN)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addContainerGap(12, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblCep)
							.addGap(35)
							.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(btnSalvar)
					.addGap(107)
					.addComponent(btnListar)
					.addGap(96)
					.addComponent(btnSair)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(19)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNome, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
					.addGap(14)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblLogr)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblN)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblBairro)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCep)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSalvar)
						.addComponent(btnSair)
						.addComponent(btnListar))
					.addContainerGap(76, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
			Object botao = evento.getSource();

			if (botao.equals(btnSalvar)) { 
				
				AbstractButton tfNome = null;
				String nome = tfNome.getText();
				
				AbstractButton tfEndereço = null;
				String endereço = tfEndereço.getText();

				Endereço obj = new Endereço();
				obj.setNome(nome);
				obj.setEndereço(endereço);
				
				
				cadastro.add(obj);
				
				tfNome.setText("");
				tfEndereço.setText("");
				tfNome.requestFocus();
			} else if(botao.equals(btnListar)) {
				String msg = "Cadastro de Clientes\n\n";
				for (Endereço endereço : cadastro) {
					msg += endereço + "\n";
				}
				JOptionPane.showMessageDialog(this, msg);
			} else if(botao.equals(btnSalvar)) {
	}
		
			
			Endereço tela = new Endereço();
			tela.setLocationRelativeTo(this);
			tela.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			tela.setVisible(true);
			
					}
			
}


