package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JLabel;

public class ObrisiKursGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JCheckBox CheckBox;
	private MenjacnicaGUI menjacnica;
	private JLabel lblSifra;
	private JLabel lblNaziv;
	private JLabel lblProdajniKurs;
	private JLabel lblKupovniKurs;
	private JLabel lblSrenjiKurs;
	private JLabel lblSkraceniNaziv;
	

	/**
	 * Create the frame.
	 */
	public ObrisiKursGUI(MenjacnicaGUI menjacnica) {
		setResizable(false);
		setTitle("ObrisiKurs");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getTextField());
		contentPane.add(getTextField_1());
		contentPane.add(getTextField_2());
		contentPane.add(getTextField_3());
		contentPane.add(getTextField_4());
		contentPane.add(getTextField_5());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnNewButton_1());
		contentPane.add(getCheckBox());
		contentPane.add(getLblSifra());
		contentPane.add(getLblNaziv());
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getLblKupovniKurs());
		contentPane.add(getLblSrenjiKurs());
		contentPane.add(getLblSkraceniNaziv());
		this.menjacnica=menjacnica;
	}

	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(10, 49, 86, 20);
			textField.setColumns(10);
		}
		return textField;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setBounds(251, 49, 86, 20);
			textField_1.setColumns(10);
		}
		return textField_1;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setBounds(10, 115, 86, 20);
			textField_2.setColumns(10);
		}
		return textField_2;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setBounds(251, 115, 86, 20);
			textField_3.setColumns(10);
		}
		return textField_3;
	}
	private JTextField getTextField_4() {
		if (textField_4 == null) {
			textField_4 = new JTextField();
			textField_4.setBounds(10, 171, 86, 20);
			textField_4.setColumns(10);
		}
		return textField_4;
	}
	private JTextField getTextField_5() {
		if (textField_5 == null) {
			textField_5 = new JTextField();
			textField_5.setBounds(251, 171, 86, 20);
			textField_5.setColumns(10);
		}
		return textField_5;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("obrisi");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					menjacnica.tekst="obrisan kurs "+"sifra:"+textField.getText()+" naziv:"+textField_1.getText()+" prodajni kurs:"+textField_2.getText()+
							" kupovni kurs:"+textField_3.getText()+" srednj kurs:"+textField_4.getText()+" skraceni naziv:"+textField_5.getText();
					menjacnica.dodaj();
					dispose();
				}
			});
			btnNewButton.setEnabled(false);
			btnNewButton.setBounds(10, 226, 89, 23);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("odustani");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnNewButton_1.setBounds(248, 226, 89, 23);
		}
		return btnNewButton_1;
	}
	private JCheckBox getCheckBox() {
		if (CheckBox == null) {
			CheckBox = new JCheckBox("zaista obrisi kurs");
			CheckBox.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(CheckBox.isSelected())
						btnNewButton.setEnabled(true);
					else
						btnNewButton.setEnabled(false);
				}
			});
			CheckBox.setBounds(10, 198, 162, 23);
			
				
		}
		return CheckBox;
	}
	private JLabel getLblSifra() {
		if (lblSifra == null) {
			lblSifra = new JLabel("Sifra");
			lblSifra.setBounds(10, 24, 46, 14);
		}
		return lblSifra;
	}
	private JLabel getLblNaziv() {
		if (lblNaziv == null) {
			lblNaziv = new JLabel("naziv");
			lblNaziv.setBounds(251, 24, 46, 14);
		}
		return lblNaziv;
	}
	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setBounds(10, 91, 86, 14);
		}
		return lblProdajniKurs;
	}
	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
			lblKupovniKurs.setBounds(251, 90, 108, 14);
		}
		return lblKupovniKurs;
	}
	private JLabel getLblSrenjiKurs() {
		if (lblSrenjiKurs == null) {
			lblSrenjiKurs = new JLabel("Srenji kurs");
			lblSrenjiKurs.setBounds(10, 146, 86, 14);
		}
		return lblSrenjiKurs;
	}
	private JLabel getLblSkraceniNaziv() {
		if (lblSkraceniNaziv == null) {
			lblSkraceniNaziv = new JLabel("Skraceni naziv");
			lblSkraceniNaziv.setBounds(251, 146, 108, 14);
		}
		return lblSkraceniNaziv;
	}
}
