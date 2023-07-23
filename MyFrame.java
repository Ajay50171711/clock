package clockPackage;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame{

		Calendar calendar;
		SimpleDateFormat timeFormat;
		SimpleDateFormat dayFormat;
		SimpleDateFormat dateFormat;
		JLabel timelabel;
		JLabel daylabel;
		JLabel datelabel;
		String time;
		String day;
		String date;

		MyFrame()
		{
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setTitle("My Clock");
			this.setLayout(new FlowLayout());
			this.setSize(350,200);
			this.setResizable(rootPaneCheckingEnabled);
			
			timeFormat=new SimpleDateFormat("hh:mm:ss a");
			dayFormat=new SimpleDateFormat("EEEE");
			dateFormat=new SimpleDateFormat("MMMMM  dd  yyyy");
			
			
			timelabel = new JLabel();
			timelabel.setFont(new Font("verdana",Font.PLAIN,50));
			timelabel.setForeground(new Color(0x00FF00));
			timelabel.setBackground(Color.black);
			timelabel.setOpaque(true);
			
			daylabel = new JLabel();
			daylabel.setFont(new Font("Ink Free",Font.PLAIN,35));
			
			datelabel = new JLabel();
			datelabel.setFont(new Font("Ink Free",Font.PLAIN,35));
			
			time = timeFormat.format(Calendar.getInstance().getTime());
			timelabel.setText(time);
			
			this.add(timelabel);
			this.add(daylabel);
			this.add(datelabel);
			this.setVisible(rootPaneCheckingEnabled);
			
			setTime();
		}
		public void setTime()
		{
			while(true) {
			time = timeFormat.format(Calendar.getInstance().getTime());
			timelabel.setText(time);
			
			day = dayFormat.format(Calendar.getInstance().getTime());
			daylabel.setText(day);
			
			date = dateFormat.format(Calendar.getInstance().getTime());
			datelabel.setText(date);
			
			try 
			{
				Thread.sleep(1000);
			} 
			
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
	}

		}
		

}

		
	


