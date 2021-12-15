import java.awt.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// menu
public class Beginning extends JFrame {
    JPanel panel = new JPanel();
	JLabel im = new JLabel(new ImageIcon("Images/1.png"));
	JLabel title = new JLabel("Arknights",JLabel.CENTER);
//	JPanel[] panels = new JPanel[4];
//	JButton[] buttons = {
//		new JButton("Start"),
//		new JButton ("Load"),
//		new JButton("Help"),
//        new JButton("Exit") };
	JFrame help = new JFrame();
	
	public Beginning(String name) {
		super(name);
		setLayout(new GridLayout(3,1));
		// Text Style
		title.setFont(new Font("GameName",Font.BOLD,150) );

		add(title);
		add(im);
		JMenuBar menubar = new JMenuBar();//
		JMenu menu = new JMenu("Game");//

		JMenuItem NewGame;
		JMenuItem Help;
		JMenuItem OpenGame;
		JMenuItem Exit;

		setJMenuBar(menubar);
		NewGame = NewGame();
		Help = Help();
		OpenGame = OpenGame();
		Exit = Exit();


		menu.add(NewGame);
		menu.add(OpenGame);
		menu.add(Help);

		menubar.add(menu);//
		menubar.add(Exit);//

		helpcre();

//		panel.setLayout(new GridLayout(3,2));
//		panel.add(new JPanel());
//		panel.add(new JPanel());
//		for(int index=0;index<buttons.length;index++){
//			buttons[index].addActionListener(new BeginLis());
//			panels[index]=new JPanel();
//			panels[index].add(buttons[index]);
//			panel.add(panels[index]);
//		}
//
//		getContentPane().add(panel);
	}

	private JMenuItem NewGame() {
		JMenuItem tmp = new JMenuItem("NewGame");
		class Newgame implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setVisible(false);
				run.frames[1].setVisible(true);
			}
		}
		tmp.addActionListener(new Newgame());
		return tmp;
	}
    //��������
	private JMenuItem Help(){
		JMenuItem tmp = new JMenuItem("Help");
		class savegame implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e) {
				help.setVisible(true);;
			}
		}
		tmp.addActionListener(new savegame());
		return tmp;
	}
	public void helpcre(){
		JTextArea d = new JTextArea();
    	d.setEditable(false);
		d.setOpaque(false);
		d.setLineWrap(true);
    	d.setFont(new Font("",0,25));
    	d.setText(
"һ����Ϸ����\n\n"+
"        ����Ŀ��һ���غ���RPG ��Ϸ�������˶������ǶԿ����࣬���ӳ�����԰��ʼ��һ·������Կ���������������Ѱ���¶���������壬�Ƶ����಻�ò���̸֮�У��������������˺�ƽЭ��Ĺ��¡���ҿ���ͨ��ȫ������ٿ���������Ϸ��   \n\n\n"+

"������Ϸ��������\n\n"+
"        1.��ʼ���ӵ��������ս��ɫ����ս������Area1��������غ󣬿���ƽ���ƽ�Area 2-1 2-2  2-3 �ĸ����ؿ���\n\n"+
"        2.������Area���ԵĲ�ͬ������ӵ��¶�Ա����������ʾ�����ܺ�����ڻ��ذ������������˳��\n\n"+
"        3.�ؿ���������䲻ͬƷ�ʵ�װ����Ҳ����ȥ�̵깺��������ǿ��ɫս������\n\n"+
"        4.����ȼ������ߣ�����װ��Ʒ�ʲ���п���ս��ʧ�ܣ������ظ���ս��ǰ�ؿ������ȼ�ʵ�������ܽ�Ǯ�����������ء�\n\n"+
"        5.Area 2 ȫ�������󣬽�������Area 3 �Ĺؿ���\n");
    	
    	JButton back = new JButton("Back");
    	back.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
		        help.setVisible(false);
	            }
    	});
    	JPanel s = new JPanel();
    	s.add(back);
    	
    	help.setLayout(new BorderLayout());
    	help.add(d,BorderLayout.CENTER);
    	help.add(s,BorderLayout.SOUTH);
    	
    	help.setPreferredSize(new Dimension(1000,900));
        run.screencentre(help);
        help.pack();
	}

	private JMenuItem OpenGame(){
		JMenuItem tmp = new JMenuItem("Load");
		class OpenGame implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setVisible(false);
				run.frames[1].setVisible(true);
				S_L.Load();
			}
		}
		tmp.addActionListener(new OpenGame());
		return tmp;
	}

	private JMenuItem Exit(){
		JMenuItem tmp = new JMenuItem("Exit");
		class Exit implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		}
		tmp.addActionListener(new Exit());
		return tmp;
	}

//    private class BeginLis implements ActionListener {
//
//	    public void actionPerformed(ActionEvent e) {
//            if(e.getSource()==buttons[0]){
//            	setVisible(false);
//            	run.frames[1].setVisible(true);
//            }
//            else if(e.getSource()==buttons[1]){
//            	setVisible(false);
//            	run.frames[1].setVisible(true);
//            	S_L.Load();
//            }
//            else if(e.getSource()==buttons[2]){
//                help.setVisible(true);
//            }
//            else if(e.getSource()==buttons[3]){
//            	System.exit(0);
//            }
//		}
//
//	}
}
