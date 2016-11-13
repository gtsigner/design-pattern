package org.oeynet.design.client;

import org.oeynet.design.builder.BMWCarBuilder;
import org.oeynet.design.builder.BenZCarBuilder;
import org.oeynet.design.builder.BuilderFactory;
import org.oeynet.design.builder.CarBuilder;
import org.oeynet.design.entity.CarEntity;
import org.oeynet.design.entity.CarDirector;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class CarBuyerGUI extends JPanel {
    private JScrollPane btnPane;
    private JScrollPane carInfoPane;
    private JSplitPane upSplitPane;
    private JSplitPane bigSplitPane;

    private JTextArea txtCarInfo;
    private JPanel downPanel;
    private JComboBox<String> cmbCarType;
    private JPanel buttonPanel;
    private JPanel carOptPanel;
    private ButtonHandler bh;
    private CarBuilder builder;
    private JPanel jIcon;

    public static final String SUBMIT = "Submit";
    public static final String EXIT = "Exit";
    public static final String BMW_Car = "BMW CarEntity";
    public static final String BENZ_Car = "BenZ CarEntity";
    public static final String BLANK = "Choose CarEntity";

    public CarBuyerGUI() {
        super(new GridLayout(1, 0));
        txtCarInfo = new JTextArea(6, 20);
        txtCarInfo.setFont(new Font("Arial", Font.BOLD, 14));
        txtCarInfo.setLineWrap(true);
        txtCarInfo.setBackground(Color.pink);
        txtCarInfo.setText("CarEntity Information");
        bh = new ButtonHandler();
        setupLowerPanel();
        setupUpperLeftPanel();
        buildUpScrollGUI();
    }

    private void setupLowerPanel() {
        downPanel = new JPanel();
        downPanel.setBackground(Color.gray);
        JButton btnSubmit = new JButton(CarBuyerGUI.SUBMIT);
        btnSubmit.setMnemonic(KeyEvent.VK_G);
        JButton btnExit = new JButton(CarBuyerGUI.EXIT);
        btnExit.setMnemonic(KeyEvent.VK_X);
        btnSubmit.addActionListener(bh);
        btnExit.addActionListener(bh);

        downPanel.add(btnSubmit);
        downPanel.add(btnExit);
    }

    private void setupUpperLeftPanel() {
        cmbCarType = new JComboBox<String>();
        cmbCarType.addItem(BLANK);
        cmbCarType.addItem(BMW_Car);
        cmbCarType.addItem(BENZ_Car);

        cmbCarType.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    String s = (String) cmbCarType.getSelectedItem();
                    System.out.println(s);
                    if (s.equals(BMW_Car)) {
                        CarBuyerGUI.this.builder = BuilderFactory.getBuilder("BMW");
                    }
                    if (s.equals(BENZ_Car)) {
                        CarBuyerGUI.this.builder = BuilderFactory.getBuilder("BENZ");
                    }
                }
            }
        });

        JLabel lblHouseType = new JLabel("CarEntity Type:");
        JLabel lblHouseOptions = new JLabel("Options:");
        cmbCarType.addActionListener(bh);

        //For layout purposes, put the buttons in a separate panel
        buttonPanel = new JPanel();
        // carOptPanel is an empty panel for holding a HouseGUI dynamically
        // carOptPanel will be put on buttonPanel
        carOptPanel = new JPanel();
        carOptPanel.setPreferredSize(new Dimension(360, 180));


        jIcon = new JPanel();
        jIcon.setPreferredSize(new Dimension(100, 100));

        //****************************************************
        GridBagLayout gridbag = new GridBagLayout();

        buttonPanel.setLayout(gridbag);
        GridBagConstraints gbc = new GridBagConstraints();

        buttonPanel.add(cmbCarType);
        buttonPanel.add(carOptPanel);

        gbc.insets.top = 5;
        gbc.insets.bottom = 5;
        gbc.insets.left = 5;
        gbc.insets.right = 5;

        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gridbag.setConstraints(cmbCarType, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gridbag.setConstraints(carOptPanel, gbc);
    }

    public void showCarInfo(String str) {
        txtCarInfo.setText(str);
    }

    public void displayNewGUI(JPanel panel) {
        carOptPanel.removeAll();
        carOptPanel.add(panel);
        carOptPanel.validate();
        validate();
    }

    private void buildUpScrollGUI() {
        btnPane = new JScrollPane(buttonPanel);
        btnPane.setMinimumSize(new Dimension(230, 200));
        carInfoPane = new JScrollPane(txtCarInfo);

        upSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        upSplitPane.setDividerLocation(390);
        upSplitPane.setPreferredSize(new Dimension(600, 280));

        upSplitPane.setLeftComponent(btnPane);
        upSplitPane.setRightComponent(carInfoPane);
        bigSplitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, upSplitPane, downPanel);
        bigSplitPane.setDividerLocation(280);

        add(bigSplitPane);
        setSize(new Dimension(600, 300));
        setVisible(true);
    }

    private static void createAndShowGUI() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Builder Pattern-CarEntity Sale Software");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CarBuyerGUI newContentPane = new CarBuyerGUI();
        newContentPane.setOpaque(true);
        frame.setContentPane(newContentPane);

        frame.pack();
        frame.setVisible(true);
    }

    static public void main(String argv[]) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    class ButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getActionCommand().equals(EXIT)) {
                System.exit(1);
            }
            if (e.getActionCommand().equals(SUBMIT)) {
                if (builder != null) {

                    CarDirector director = new CarDirector();
                    director.setCarBuilder(builder);
                    director.buildCar();
                    String usrRequest = builder.getUserRequest();
                    showCarInfo(usrRequest);
                    CarEntity carObj = director.buildCar();
                    float housePrice = carObj.getTotalPrice();
                    txtCarInfo.append("\n CarEntity Price: " + housePrice);
                }
            }

        }
    }

    //更新GUI
    private void updateGUI() {

    }
}

