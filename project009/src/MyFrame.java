import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyFrame extends JFrame {

    Calendar calendar;
    SimpleDateFormat timeFormat;
    JLabel timeLabel;
    String time;



    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("My clock program");
        this.setLayout(new FlowLayout());
        this.setSize(350,200);
        this.setResizable(false);
        thetime();
        this.setVisible(true);
        setTime();
    }
    public  void setTime(){
       while (true) {
           time = timeFormat.format(Calendar.getInstance().getTime());
           timeLabel.setText(time);
           System.out.println(time);
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }

    }
    public void thetime(){
        timeFormat = new SimpleDateFormat("hh:mm:ss a");//use the oracle web site for format the time
        timeLabel = new JLabel();

        this.add(timeLabel);

    }
}
