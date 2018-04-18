package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.ImageIcon;
import java.awt.GridBagLayout;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.ButtonGroup;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.awt.Button;
import java.awt.Scrollbar;
import net.miginfocom.swing.MigLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.AbstractAction;

public class MenjacnicaGUI extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmNewMenuItem_2;
	private JMenu mnNewMenu_1;
	private JMenuItem mntmNewMenuItem_3;
	private JScrollPane scrollPane;
	private JPanel panel;
	private JPanel panel_1;
	private JButton btnNewButton_1;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JScrollPane scrollPane_1;
	private JEditorPane editorPane;
	private JButton btnNewButton;
	private JButton btnNewButton_2;
	private JTable table;
	DefaultTableModel model = new DefaultTableModel();
	private JPopupMenu popupMenu;
	private JMenuItem mntmDodajkurs;
	private JMenuItem mntmObrisikurs;
	private JMenuItem mntmIzvrsizamenu;
	private Action action;
	private MenjacnicaGUI menjacnica;
	public String tekst;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenjacnicaGUI frame = new MenjacnicaGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public void izlaz() {
		int opcija = 
				JOptionPane.showConfirmDialog(
					null, "Da li zelite da izadjete iz programa?",
					"Izlazak", JOptionPane.YES_NO_CANCEL_OPTION);
			
			if (opcija == JOptionPane.YES_OPTION)
				System.exit(0);
	}
	public MenjacnicaGUI() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				izlaz();
			}
		});
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenjacnicaGUI.class.getResource("/icons/logo.jpg")));
		setTitle("Menjacnica");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 534, 351);
		setJMenuBar(getMenuBar_1());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(getScrollPane(), BorderLayout.CENTER);
		contentPane.add(getPanel(), BorderLayout.EAST);
		contentPane.add(getPanel_1(), BorderLayout.SOUTH);
		this.menjacnica=this;
	}

	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMnNewMenu());
			menuBar.add(getMnNewMenu_1());
		}
		return menuBar;
	}
	private JMenu getMnNewMenu() {
		if (mnNewMenu == null) {
			mnNewMenu = new JMenu("File");
			mnNewMenu.add(getMntmNewMenuItem());
			mnNewMenu.add(getMntmNewMenuItem_2());
			mnNewMenu.add(getMntmNewMenuItem_1());
		}
		return mnNewMenu;
	}
	private JMenuItem getMntmNewMenuItem() {
		if (mntmNewMenuItem == null) {
			mntmNewMenuItem = new JMenuItem("Open");
			mntmNewMenuItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JFileChooser fc = new JFileChooser();
					
					int opcija = fc.showOpenDialog(null);
					
					if (opcija == JFileChooser.APPROVE_OPTION) {
						File f = fc.getSelectedFile(); 
						editorPane.setText(editorPane.getText()+"\n"+"ucitan fajl"+f.getName()+"ge je apsolutna putanja"+f.getAbsolutePath());
					}
				}
			});
			mntmNewMenuItem.setIcon(new ImageIcon(MenjacnicaGUI.class.getResource("/com/sun/java/swing/plaf/windows/icons/NewFolder.gif")));
			mntmNewMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
		}
		return mntmNewMenuItem;
	}
	private JMenuItem getMntmNewMenuItem_1() {
		if (mntmNewMenuItem_1 == null) {
			mntmNewMenuItem_1 = new JMenuItem("Exit");
			mntmNewMenuItem_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					izlaz();
				}
			});
			mntmNewMenuItem_1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.ALT_MASK));
		}
		return mntmNewMenuItem_1;
	}
	private JMenuItem getMntmNewMenuItem_2() {
		if (mntmNewMenuItem_2 == null) {
			mntmNewMenuItem_2 = new JMenuItem("Save");
			mntmNewMenuItem_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JFileChooser fc = new JFileChooser();
					
					int opcija = fc.showSaveDialog(null);
					
					if (opcija == JFileChooser.APPROVE_OPTION) {
						File f = fc.getSelectedFile();
						
						editorPane.setText(editorPane.getText()+"\n"+"sacuvan fajl"+f.getName()+"gde jeapssoluta putanja"+f.getAbsolutePath());
					}
				}
			});
			mntmNewMenuItem_2.setIcon(new ImageIcon(MenjacnicaGUI.class.getResource("/com/sun/java/swing/plaf/windows/icons/FloppyDrive.gif")));
			mntmNewMenuItem_2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		}
		return mntmNewMenuItem_2;
	}
	private JMenu getMnNewMenu_1() {
		if (mnNewMenu_1 == null) {
			mnNewMenu_1 = new JMenu("Help");
			mnNewMenu_1.add(getMntmNewMenuItem_3());
		}
		return mnNewMenu_1;
	}
	private JMenuItem getMntmNewMenuItem_3() {
		if (mntmNewMenuItem_3 == null) {
			mntmNewMenuItem_3 = new JMenuItem("About");
			mntmNewMenuItem_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null,
							"Autor Nikola Radivojevic",
							"Podaci o autoru",
							JOptionPane.INFORMATION_MESSAGE);
				}
			});
		}
		return mntmNewMenuItem_3;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			addPopup(scrollPane, getPopupMenu());
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setLayout(new MigLayout("", "[89px]", "[23px][][]"));
			panel.add(getBtnNewButton_1(), "cell 0 0,alignx left,aligny top");
			panel.add(getBtnNewButton(), "cell 0 1");
			panel.add(getBtnNewButton_2(), "cell 0 2");
		}
		return panel;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setBorder(new TitledBorder(null, "Status", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_1.setToolTipText("");
			panel_1.setLayout(new BorderLayout(0, 0));
			panel_1.add(getScrollPane_1(), BorderLayout.NORTH);
		}
		return panel_1;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("DodajKurs");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					DodajKursGUI novi=new DodajKursGUI(menjacnica);
					novi.setVisible(true);
				}
			});
			buttonGroup.add(btnNewButton_1);
		}
		return btnNewButton_1;
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
			component.addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					if (e.isPopupTrigger()) {
						showMenu(e);
					}
				}
				public void mouseReleased(MouseEvent e) {
					if (e.isPopupTrigger()) {
						showMenu(e);
					}
				}
				private void showMenu(MouseEvent e) {
					popup.show(e.getComponent(), e.getX(), e.getY());
				}
			});
		
	}
	private JScrollPane getScrollPane_1() {
		if (scrollPane_1 == null) {
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setViewportView(getEditorPane());
		}
		return scrollPane_1;
	}
	private JEditorPane getEditorPane() {
		if (editorPane == null) {
			editorPane = new JEditorPane();
		}
		return editorPane;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("ObrisiKurs");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ObrisiKursGUI obrisi=new ObrisiKursGUI(menjacnica);
					obrisi.setVisible(true);
				}
			});
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("IzvrsiZamenu");
		}
		return btnNewButton_2;
	}
	private JTable getTable() {
		String[] row=new String[6];
		if (table == null) {
			table = new JTable(model);
			model.addColumn("Sifra");
			model.addColumn("Skraceni naziv");
			model.addColumn("Prodajni");
			model.addColumn("Srednji");
			model.addColumn("Kupovni");
			model.addColumn("Naziv");
			model.addRow(row);
			model.addRow(row);
			model.addRow(row);
			model.addRow(row);
			model.addRow(row);
			model.addRow(row);
		}
		return table;
	}
	
	private JPopupMenu getPopupMenu() {
		if (popupMenu == null) {
			popupMenu = new JPopupMenu();
			popupMenu.addMouseListener(new MouseAdapter() {
			});
			popupMenu.add(getMntmDodajkurs());
			popupMenu.add(getMntmObrisikurs());
			popupMenu.add(getMntmIzvrsizamenu());
		}
		return popupMenu;
	}
	private JMenuItem getMntmDodajkurs() {
		if (mntmDodajkurs == null) {
			mntmDodajkurs = new JMenuItem("DodajKurs");
			mntmDodajkurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					DodajKursGUI novi=new DodajKursGUI(menjacnica);
					novi.setVisible(true);
				}
			});
		}
		return mntmDodajkurs;
	}
	private JMenuItem getMntmObrisikurs() {
		if (mntmObrisikurs == null) {
			mntmObrisikurs = new JMenuItem("ObrisiKurs");	
			mntmObrisikurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ObrisiKursGUI obrisi=new ObrisiKursGUI(menjacnica);
					obrisi.setVisible(true);
				}
			});
		}
		return mntmObrisikurs;
	}
	private JMenuItem getMntmIzvrsizamenu() {
		if (mntmIzvrsizamenu == null) {
			mntmIzvrsizamenu = new JMenuItem("IzvrsiZamenu");
		}
		return mntmIzvrsizamenu;
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private Action getAction() {
		if (action == null) {
			action = new SwingAction();
		}
		return action;
	}
	public void dodaj() {
		if(editorPane.getText().isEmpty()) {
			editorPane.setText(tekst);
			return;
		}
		editorPane.setText(editorPane.getText()+"\n"+tekst);
	}
}
