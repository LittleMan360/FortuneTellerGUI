import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
import java.awt.event.ActionEvent;
public class FortuneTellerFrame extends JFrame
{
    // variables
    JPanel mainPnl;
    JPanel topPnl;
    JPanel middlePnl;
    JPanel bottomPnl;

    ImageIcon icon;
    JLabel titleLbl;

    JButton tellFortuneBtn;
    JLabel fortuneLbl;

    JButton quitBtn;


    // constructor
    public FortuneTellerFrame()
    {
        // create panels
        mainPnl = new JPanel();
        topPnl = new JPanel();
        middlePnl = new JPanel();
        bottomPnl = new JPanel();

        // set layout
        mainPnl = new JPanel();
        mainPnl.setLayout(new BorderLayout());

        // create components
        createTopPanel();
        mainPnl.add(topPnl, BorderLayout.NORTH);

        createMiddlePanel();
        mainPnl.add(middlePnl, BorderLayout.CENTER);

        createBottomPanel();
        mainPnl.add(bottomPnl, BorderLayout.SOUTH);

        // add main panel to frame
        add(mainPnl);
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);



        // add action listeners
        tellFortuneBtn.addActionListener(e -> {
            // create array list of fortunes
            ArrayList<String> fortunes = new ArrayList<>();
            // add fortunes to array list
            fortunes.add("You will find happiness with a new love.");
            fortunes.add("You will have a great day!");
            fortunes.add("You will have a bad hair day.");
            fortunes.add("You will find a new friend.");
            fortunes.add("You will find a new enemy.");
            fortunes.add("You will find a new job.");
            fortunes.add("You will forget your keys.");
            fortunes.add("You will find a new hobby.");
            fortunes.add("You will stub your toe.");
            fortunes.add("You will find a new favorite food.");
            fortunes.add("You will drop your phone.");
            fortunes.add("You will find a new favorite song.");

            // create random number generator
            Random rand = new Random();
            int index = rand.nextInt(fortunes.size());
            fortuneLbl.setText("Your fortune: " + fortunes.get(index));
        });

        // set up frame
        setTitle("Fortune Teller");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    // methods
    // create top panel
    private void createTopPanel()
    {
        // create components
        topPnl = new JPanel();
        //set image icon
        icon= new ImageIcon("src/FortuneTeller.jpg");
        titleLbl = new JLabel("Fortune Teller", icon, JLabel.CENTER);
        titleLbl.setHorizontalTextPosition(JLabel.CENTER);
        titleLbl.setVerticalTextPosition(JLabel.BOTTOM);

        topPnl.add(titleLbl);
    }

    // create middle panel
    private void createMiddlePanel()
    {
        // create components
        middlePnl = new JPanel();
        middlePnl.setLayout(new FlowLayout());
        fortuneLbl = new JLabel("Your fortune: ");
        middlePnl.add(fortuneLbl);

    }
    // create bottom panel
    private void createBottomPanel()
    {
        // create components
        bottomPnl = new JPanel();
        bottomPnl.setLayout(new GridLayout(1, 2));

        // create buttons
        tellFortuneBtn = new JButton("Tell Fortune");

        quitBtn = new JButton("Quit");

        // add buttons to panel
        bottomPnl.add(tellFortuneBtn);
        bottomPnl.add(quitBtn);

        // add action listeners
        quitBtn.addActionListener((ActionEvent ae) -> System.exit(0));

    }
}