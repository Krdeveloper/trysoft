package kr.or.dgit.trysoft;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import kr.or.dgit.trysoft.dto.Client;
import kr.or.dgit.trysoft.service.ClientService;

public class AddClient extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField tFclntNo;
	private JTextField tFclntName;
	private JTextField tFclntAddr;
	private JTextField tFclntTel;
	private JTable table;
	private JButton btnAdd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddClient frame = new AddClient();
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
	public AddClient() {
		setTitle("고객 등록");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel pClNo = new JPanel();
		contentPane.add(pClNo);
		pClNo.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblClntNo = new JLabel("고객번호");
		pClNo.add(lblClntNo);
		
		tFclntNo = new JTextField();
		pClNo.add(tFclntNo);
		tFclntNo.setColumns(10);
		
		JPanel pClName = new JPanel();
		contentPane.add(pClName);
		pClName.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblClntName = new JLabel("상호명");
		pClName.add(lblClntName);
		
		tFclntName = new JTextField();
		pClName.add(tFclntName);
		tFclntName.setColumns(10);
		
		JPanel pClAdr = new JPanel();
		contentPane.add(pClAdr);
		pClAdr.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblClntAddr = new JLabel("주  소");
		pClAdr.add(lblClntAddr);
		
		tFclntAddr = new JTextField();
		pClAdr.add(tFclntAddr);
		tFclntAddr.setColumns(10);
		
		JPanel pTel = new JPanel();
		contentPane.add(pTel);
		pTel.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblClntTel = new JLabel("전화번호");
		pTel.add(lblClntTel);
		
		tFclntTel = new JTextField();
		pTel.add(tFclntTel);
		tFclntTel.setColumns(10);
		
		JPanel pBtn = new JPanel();
		contentPane.add(pBtn);
		pBtn.setLayout(new GridLayout(0, 4, 0, 0));
		
		btnAdd = new JButton("등록");
		btnAdd.addActionListener(this);
		pBtn.add(btnAdd);
		
		JButton btnUpdate = new JButton("수정");
		pBtn.add(btnUpdate);
		
		JButton btnDelete = new JButton("삭제");
		pBtn.add(btnDelete);
		
		JButton btnClose = new JButton("닫기");
		pBtn.add(btnClose);
		
		JPanel pTable = new JPanel();
		contentPane.add(pTable);
		pTable.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		pTable.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		scrollPane.setViewportView(table);
	}
	
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnAdd) {
			actionPerformedBtnAdd(arg0);
		}
	}
	protected void actionPerformedBtnAdd(ActionEvent arg0) {
		ClientService service = new ClientService();
		//service.setAddClient(this);
		Client client = getItem();
		System.out.println("dddd; "+client);
		service.insertClient(client);
	}
	
	
	public String getTfValueText(JTextField jtf){
		return jtf.getText().trim();
	}
	public void isEmptyCheck(JTextField jtf) throws Exception{
		if(getTfValueText(jtf).equals("")){
			throw new Exception("공백 존재");
		}
	}
	public  boolean validCheck() {
		try {
			isEmptyCheck(tFclntNo);						
			return true;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			return false;
		}
	}
	
	
	public Client getItem() {
		String clntNo = getTfValueText(tFclntNo).trim();	
		String clntName1 = getTfValueText(tFclntName).trim();
		String clntAddr = getTfValueText(tFclntAddr).trim();
		String clntTel = getTfValueText(tFclntTel).trim();
		return new Client(clntNo, clntName1, clntAddr, clntTel);
	
	}
	/*public Sale getItem() {
		String code = pCode.getTfValueText().trim();
		String name = pName.getTfValueText().trim();
		
		int price = Integer.valueOf(pPrice.getTfValueText().trim());
		int saleCnt = Integer.valueOf(pCnt.getTfValueText().trim());
		int marginRate = Integer.valueOf(pMargin.getTfValueText().trim());
		return new Sale(new Product(code, name), price, saleCnt, marginRate);
	}*/
	
}
