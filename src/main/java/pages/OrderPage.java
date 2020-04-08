package pages;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Hendika
 */
public class OrderPage extends JFrame {

    /**
     * Creates new form OrderPage
     */
    public OrderPage() {
        super("Order Page");
        setSize(1280, 720);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        ElectronicItemPanel = new javax.swing.JPanel();
        ElectronicLabel = new javax.swing.JLabel();
        UtensilItemPanel = new javax.swing.JPanel();
        UtensilLabel = new javax.swing.JLabel();
        HouseholdApplianceItemPanel = new javax.swing.JPanel();
        HouseholdApplianceLabel = new javax.swing.JLabel();
        StationeryItemPanel = new javax.swing.JPanel();
        StationaryLabel = new javax.swing.JLabel();
        AccessoriesItemPanel = new javax.swing.JPanel();
        AccessoriesLabel = new javax.swing.JLabel();
        ItemsScrollPane = new javax.swing.JScrollPane();
        ItemsPanel = new javax.swing.JPanel();
        ElectronicCategory = new javax.swing.JPanel();
        CameraItemPanel = new javax.swing.JPanel();
        CameraIcon = new javax.swing.JLabel();
        CameraLabel = new javax.swing.JLabel();
        CameraCurrency = new javax.swing.JLabel();
        CameraPriceLabel = new javax.swing.JLabel();
        CameraQty = new javax.swing.JComboBox<>();
        CameraAddToCart = new javax.swing.JButton();
        MonitorItemPanel = new javax.swing.JPanel();
        MonitorIcon = new javax.swing.JLabel();
        MonitorLabel = new javax.swing.JLabel();
        MonitorCurrency = new javax.swing.JLabel();
        MonitorPriceLabel = new javax.swing.JLabel();
        MonitorQty = new javax.swing.JComboBox<>();
        MonitorAddToCart = new javax.swing.JButton();
        MouseItemPanel = new javax.swing.JPanel();
        MouseIcon = new javax.swing.JLabel();
        MouseLabel = new javax.swing.JLabel();
        MouseCurrency = new javax.swing.JLabel();
        MosuePriceLabel = new javax.swing.JLabel();
        MouseQty = new javax.swing.JComboBox<>();
        MouseAddToCart = new javax.swing.JButton();
        SmartphoneItemPanel = new javax.swing.JPanel();
        SmartphoneIcon = new javax.swing.JLabel();
        Smartphone11ProLabel = new javax.swing.JLabel();
        SmartphoneCurrency = new javax.swing.JLabel();
        SmartPhonePriceLabel = new javax.swing.JLabel();
        SmartphoneQty = new javax.swing.JComboBox<>();
        SmartphoneAddToCart = new javax.swing.JButton();
        SmartwatchItemPanel = new javax.swing.JPanel();
        SmartwatchIcon = new javax.swing.JLabel();
        SmartwatchLabel = new javax.swing.JLabel();
        SmartwatchCurrency = new javax.swing.JLabel();
        SmartwatchPriceLabel = new javax.swing.JLabel();
        SmartwatchQty = new javax.swing.JComboBox<>();
        SmartwatchAddToCart = new javax.swing.JButton();
        KeyboardItemPanel = new javax.swing.JPanel();
        KeyboardIcon = new javax.swing.JLabel();
        KeyboardLabel = new javax.swing.JLabel();
        KeyboardCurrency = new javax.swing.JLabel();
        KeyboardPriceLabel = new javax.swing.JLabel();
        KeyboardQty = new javax.swing.JComboBox<>();
        KeyboardAddToCart = new javax.swing.JButton();
        UtensilCategory = new javax.swing.JPanel();
        ForkItemPanel = new javax.swing.JPanel();
        ForkIcon = new javax.swing.JLabel();
        ForkLabel = new javax.swing.JLabel();
        ForkCurrency = new javax.swing.JLabel();
        ForkPriceLabel = new javax.swing.JLabel();
        ForkQty = new javax.swing.JComboBox<>();
        ForkAddToCart = new javax.swing.JButton();
        SpoonItemPanel = new javax.swing.JPanel();
        SpoonIcon = new javax.swing.JLabel();
        SpoonLabel = new javax.swing.JLabel();
        SpoonCurrency = new javax.swing.JLabel();
        SpoonPriceLabel = new javax.swing.JLabel();
        SpoonQty = new javax.swing.JComboBox<>();
        SpoonAddToCart = new javax.swing.JButton();
        KnifeItemPanel = new javax.swing.JPanel();
        KnifeIcon = new javax.swing.JLabel();
        KnifeLabel = new javax.swing.JLabel();
        KnifeCurrency = new javax.swing.JLabel();
        KnifePriceLabel = new javax.swing.JLabel();
        KnifeQty = new javax.swing.JComboBox<>();
        KnifeAddToCart = new javax.swing.JButton();
        PlateItemPanel = new javax.swing.JPanel();
        PlateIcon = new javax.swing.JLabel();
        PlateLabel = new javax.swing.JLabel();
        PlateCurrency = new javax.swing.JLabel();
        PlatePriceLabel = new javax.swing.JLabel();
        PlateQty = new javax.swing.JComboBox<>();
        PlateAddToCart = new javax.swing.JButton();
        HouseholdApplianceCategory = new javax.swing.JPanel();
        SawItemPanel = new javax.swing.JPanel();
        SawIcon = new javax.swing.JLabel();
        SawLabel = new javax.swing.JLabel();
        SawCurrency = new javax.swing.JLabel();
        SawPriceLabel = new javax.swing.JLabel();
        SawQty = new javax.swing.JComboBox<>();
        SawAddToCart = new javax.swing.JButton();
        WrenchItemPanel = new javax.swing.JPanel();
        WrenchIcon = new javax.swing.JLabel();
        WrenchLabel = new javax.swing.JLabel();
        WrenchCurrency = new javax.swing.JLabel();
        WrenchPriceLabel = new javax.swing.JLabel();
        WrenchQty = new javax.swing.JComboBox<>();
        WrenchAddToCart = new javax.swing.JButton();
        SwissArmyKnifeItemPanel = new javax.swing.JPanel();
        SwissArmyKnifeIcon = new javax.swing.JLabel();
        SwissArmyKnifeLabel = new javax.swing.JLabel();
        SwissArmyKnifeCurrency = new javax.swing.JLabel();
        SwissArmyKnifePriceLabel = new javax.swing.JLabel();
        SwissArmyKnifeQty = new javax.swing.JComboBox<>();
        SwissArmyKnifeAddToCart = new javax.swing.JButton();
        ScrewdriverItemPanel = new javax.swing.JPanel();
        ScrewdriverIcon = new javax.swing.JLabel();
        ScrewdriverLabel = new javax.swing.JLabel();
        ScrewdriverCurrency = new javax.swing.JLabel();
        ScrewdriverPriceLabel = new javax.swing.JLabel();
        ScrewdriverQty = new javax.swing.JComboBox<>();
        ScrewdriverAddToCart = new javax.swing.JButton();
        StationeryCategory = new javax.swing.JPanel();
        BookItemPanel = new javax.swing.JPanel();
        BookIcon = new javax.swing.JLabel();
        BookLabel = new javax.swing.JLabel();
        BookCurrency = new javax.swing.JLabel();
        BookPriceLabel = new javax.swing.JLabel();
        BookQty = new javax.swing.JComboBox<>();
        BookAddToCart = new javax.swing.JButton();
        MarkerItemPanel = new javax.swing.JPanel();
        MarkerIcon = new javax.swing.JLabel();
        MarkerLabel = new javax.swing.JLabel();
        MarkerCurrency = new javax.swing.JLabel();
        MarkerPriceLabel = new javax.swing.JLabel();
        MarkerQty = new javax.swing.JComboBox<>();
        MarkerAddToCart = new javax.swing.JButton();
        PencilItemPanel = new javax.swing.JPanel();
        PencilIcon = new javax.swing.JLabel();
        PencilLabel = new javax.swing.JLabel();
        PencilCurrency = new javax.swing.JLabel();
        PencilPriceLabel = new javax.swing.JLabel();
        PencilQty = new javax.swing.JComboBox<>();
        PencilAddToCart = new javax.swing.JButton();
        ScissorItemPanel = new javax.swing.JPanel();
        ScissorIcon = new javax.swing.JLabel();
        ScissorLabel = new javax.swing.JLabel();
        ScissorCurrency = new javax.swing.JLabel();
        ScissorPriceLabel = new javax.swing.JLabel();
        ScissorQty = new javax.swing.JComboBox<>();
        ScissorAddToCart = new javax.swing.JButton();
        AccessoryCategory = new javax.swing.JPanel();
        NecklaceItemPanel = new javax.swing.JPanel();
        NecklaceIcon = new javax.swing.JLabel();
        NecklaceLabel = new javax.swing.JLabel();
        NecklaceCurrency = new javax.swing.JLabel();
        NecklacePriceLabel = new javax.swing.JLabel();
        NecklaceQty = new javax.swing.JComboBox<>();
        NecklaceAddToCart = new javax.swing.JButton();
        WatchItemPanel = new javax.swing.JPanel();
        WatchIcon = new javax.swing.JLabel();
        WatchLabel = new javax.swing.JLabel();
        WatchCurrency = new javax.swing.JLabel();
        WatchPriceLabel = new javax.swing.JLabel();
        WatchQty = new javax.swing.JComboBox<>();
        WatchAddToCart = new javax.swing.JButton();
        BraceletItemPanel = new javax.swing.JPanel();
        BraceletIcon = new javax.swing.JLabel();
        BraceletLabel = new javax.swing.JLabel();
        BraceletCurrency = new javax.swing.JLabel();
        BraceletPriceLabel = new javax.swing.JLabel();
        BraceletQty = new javax.swing.JComboBox<>();
        BraceletAddToCart = new javax.swing.JButton();
        GlassesItemPanel = new javax.swing.JPanel();
        GlassesIcon = new javax.swing.JLabel();
        GlassesLabel = new javax.swing.JLabel();
        GlassesCurrency = new javax.swing.JLabel();
        GlassesPriceLabel = new javax.swing.JLabel();
        GlassesQty = new javax.swing.JComboBox<>();
        GlassesAddToCart = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        Background.setBackground(new java.awt.Color(153, 153, 153));
        Background.setPreferredSize(new java.awt.Dimension(1280, 720));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ElectronicItemPanel.setPreferredSize(new java.awt.Dimension(245, 41));
        ElectronicItemPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ElectronicItemPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ElectronicItemPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ElectronicItemPanelMouseExited(evt);
            }
        });

        ElectronicLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ElectronicLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ElectronicLabel.setText("Electronic");

        javax.swing.GroupLayout ElectronicItemPanelLayout = new javax.swing.GroupLayout(ElectronicItemPanel);
        ElectronicItemPanel.setLayout(ElectronicItemPanelLayout);
        ElectronicItemPanelLayout.setHorizontalGroup(
            ElectronicItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ElectronicItemPanelLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(ElectronicLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );
        ElectronicItemPanelLayout.setVerticalGroup(
            ElectronicItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ElectronicLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        Background.add(ElectronicItemPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 213, -1, -1));

        UtensilItemPanel.setPreferredSize(new java.awt.Dimension(245, 41));
        UtensilItemPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UtensilItemPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UtensilItemPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UtensilItemPanelMouseExited(evt);
            }
        });

        UtensilLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        UtensilLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UtensilLabel.setText("Utensil");

        javax.swing.GroupLayout UtensilItemPanelLayout = new javax.swing.GroupLayout(UtensilItemPanel);
        UtensilItemPanel.setLayout(UtensilItemPanelLayout);
        UtensilItemPanelLayout.setHorizontalGroup(
            UtensilItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UtensilItemPanelLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(UtensilLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );
        UtensilItemPanelLayout.setVerticalGroup(
            UtensilItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UtensilLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        Background.add(UtensilItemPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 213, -1, -1));

        HouseholdApplianceItemPanel.setPreferredSize(new java.awt.Dimension(245, 41));

        HouseholdApplianceLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        HouseholdApplianceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        HouseholdApplianceLabel.setText("Household Appliance");
        HouseholdApplianceLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HouseholdApplianceLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HouseholdApplianceLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HouseholdApplianceLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout HouseholdApplianceItemPanelLayout = new javax.swing.GroupLayout(HouseholdApplianceItemPanel);
        HouseholdApplianceItemPanel.setLayout(HouseholdApplianceItemPanelLayout);
        HouseholdApplianceItemPanelLayout.setHorizontalGroup(
            HouseholdApplianceItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HouseholdApplianceLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
        );
        HouseholdApplianceItemPanelLayout.setVerticalGroup(
            HouseholdApplianceItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HouseholdApplianceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        Background.add(HouseholdApplianceItemPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 213, -1, -1));

        StationeryItemPanel.setPreferredSize(new java.awt.Dimension(245, 41));

        StationaryLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        StationaryLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        StationaryLabel.setText("Stationery");
        StationaryLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StationaryLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                StationaryLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                StationaryLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout StationeryItemPanelLayout = new javax.swing.GroupLayout(StationeryItemPanel);
        StationeryItemPanel.setLayout(StationeryItemPanelLayout);
        StationeryItemPanelLayout.setHorizontalGroup(
            StationeryItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(StationaryLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
        );
        StationeryItemPanelLayout.setVerticalGroup(
            StationeryItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(StationaryLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        Background.add(StationeryItemPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(775, 213, -1, -1));

        AccessoriesItemPanel.setPreferredSize(new java.awt.Dimension(245, 41));

        AccessoriesLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AccessoriesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AccessoriesLabel.setText("Accessories");
        AccessoriesLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AccessoriesLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AccessoriesLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AccessoriesLabelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout AccessoriesItemPanelLayout = new javax.swing.GroupLayout(AccessoriesItemPanel);
        AccessoriesItemPanel.setLayout(AccessoriesItemPanelLayout);
        AccessoriesItemPanelLayout.setHorizontalGroup(
            AccessoriesItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AccessoriesLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
        );
        AccessoriesItemPanelLayout.setVerticalGroup(
            AccessoriesItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AccessoriesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        Background.add(AccessoriesItemPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 213, 240, -1));

        ItemsScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        ItemsScrollPane.setPreferredSize(new java.awt.Dimension(1260, 440));

        ItemsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CameraItemPanel.setBackground(new java.awt.Color(153, 153, 153));
        CameraItemPanel.setPreferredSize(new java.awt.Dimension(160, 160));

        CameraIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Camera.png"))); // NOI18N

        CameraLabel.setText("Camera");

        CameraCurrency.setText("RM");

        CameraPriceLabel.setText("2400");

        CameraQty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));

        CameraAddToCart.setText("add to cart");

        javax.swing.GroupLayout CameraItemPanelLayout = new javax.swing.GroupLayout(CameraItemPanel);
        CameraItemPanel.setLayout(CameraItemPanelLayout);
        CameraItemPanelLayout.setHorizontalGroup(
            CameraItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CameraItemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CameraItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CameraItemPanelLayout.createSequentialGroup()
                        .addComponent(CameraQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CameraAddToCart))
                    .addGroup(CameraItemPanelLayout.createSequentialGroup()
                        .addComponent(CameraCurrency)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CameraPriceLabel))
                    .addComponent(CameraLabel)
                    .addComponent(CameraIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        CameraItemPanelLayout.setVerticalGroup(
            CameraItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CameraItemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CameraIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CameraLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CameraItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CameraCurrency, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CameraPriceLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CameraItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CameraQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CameraAddToCart))
                .addContainerGap())
        );

        MonitorItemPanel.setBackground(new java.awt.Color(153, 153, 153));
        MonitorItemPanel.setPreferredSize(new java.awt.Dimension(160, 160));

        MonitorIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Monitor.png"))); // NOI18N

        MonitorLabel.setText("Monitor");

        MonitorCurrency.setText("RM");

        MonitorPriceLabel.setText("300");

        MonitorQty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));

        MonitorAddToCart.setText("add to cart");

        javax.swing.GroupLayout MonitorItemPanelLayout = new javax.swing.GroupLayout(MonitorItemPanel);
        MonitorItemPanel.setLayout(MonitorItemPanelLayout);
        MonitorItemPanelLayout.setHorizontalGroup(
            MonitorItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MonitorItemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MonitorItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MonitorItemPanelLayout.createSequentialGroup()
                        .addComponent(MonitorQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(MonitorAddToCart))
                    .addGroup(MonitorItemPanelLayout.createSequentialGroup()
                        .addGroup(MonitorItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MonitorItemPanelLayout.createSequentialGroup()
                                .addComponent(MonitorCurrency)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(MonitorPriceLabel))
                            .addComponent(MonitorLabel)
                            .addComponent(MonitorIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        MonitorItemPanelLayout.setVerticalGroup(
            MonitorItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MonitorItemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MonitorIcon)
                .addGap(17, 17, 17)
                .addComponent(MonitorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MonitorItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MonitorCurrency, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MonitorPriceLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MonitorItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MonitorQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MonitorAddToCart))
                .addContainerGap())
        );

        MouseItemPanel.setBackground(new java.awt.Color(153, 153, 153));
        MouseItemPanel.setPreferredSize(new java.awt.Dimension(160, 160));

        MouseIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Mouse.png"))); // NOI18N

        MouseLabel.setText("Mouse");

        MouseCurrency.setText("RM");

        MosuePriceLabel.setText("800");

        MouseQty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));

        MouseAddToCart.setText("add to cart");

        javax.swing.GroupLayout MouseItemPanelLayout = new javax.swing.GroupLayout(MouseItemPanel);
        MouseItemPanel.setLayout(MouseItemPanelLayout);
        MouseItemPanelLayout.setHorizontalGroup(
            MouseItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MouseItemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MouseItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MouseItemPanelLayout.createSequentialGroup()
                        .addComponent(MouseQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(MouseAddToCart))
                    .addGroup(MouseItemPanelLayout.createSequentialGroup()
                        .addGroup(MouseItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MouseItemPanelLayout.createSequentialGroup()
                                .addComponent(MouseCurrency)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(MosuePriceLabel))
                            .addComponent(MouseLabel)
                            .addComponent(MouseIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        MouseItemPanelLayout.setVerticalGroup(
            MouseItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MouseItemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MouseIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MouseLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MouseItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MouseCurrency, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MosuePriceLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MouseItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MouseQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MouseAddToCart))
                .addContainerGap())
        );

        SmartphoneItemPanel.setBackground(new java.awt.Color(153, 153, 153));
        SmartphoneItemPanel.setPreferredSize(new java.awt.Dimension(160, 160));

        SmartphoneIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Picture1.png"))); // NOI18N

        Smartphone11ProLabel.setText("Smartphone 11 Pro");

        SmartphoneCurrency.setText("RM");

        SmartPhonePriceLabel.setText("800");

        SmartphoneQty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));

        SmartphoneAddToCart.setText("add to cart");

        javax.swing.GroupLayout SmartphoneItemPanelLayout = new javax.swing.GroupLayout(SmartphoneItemPanel);
        SmartphoneItemPanel.setLayout(SmartphoneItemPanelLayout);
        SmartphoneItemPanelLayout.setHorizontalGroup(
            SmartphoneItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SmartphoneItemPanelLayout.createSequentialGroup()
                .addComponent(SmartphoneIcon)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(SmartphoneItemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SmartphoneItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SmartphoneItemPanelLayout.createSequentialGroup()
                        .addComponent(SmartphoneQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(SmartphoneAddToCart))
                    .addGroup(SmartphoneItemPanelLayout.createSequentialGroup()
                        .addGroup(SmartphoneItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SmartphoneItemPanelLayout.createSequentialGroup()
                                .addComponent(SmartphoneCurrency)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SmartPhonePriceLabel))
                            .addComponent(Smartphone11ProLabel))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        SmartphoneItemPanelLayout.setVerticalGroup(
            SmartphoneItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SmartphoneItemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SmartphoneIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Smartphone11ProLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SmartphoneItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SmartphoneItemPanelLayout.createSequentialGroup()
                        .addGroup(SmartphoneItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SmartphoneCurrency, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SmartPhonePriceLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SmartphoneQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SmartphoneItemPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(SmartphoneAddToCart)))
                .addContainerGap())
        );

        SmartwatchItemPanel.setBackground(new java.awt.Color(153, 153, 153));
        SmartwatchItemPanel.setPreferredSize(new java.awt.Dimension(160, 160));

        SmartwatchIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SmartWatch.png"))); // NOI18N

        SmartwatchLabel.setText("Smartwatch");

        SmartwatchCurrency.setText("RM");

        SmartwatchPriceLabel.setText("1300");

        SmartwatchQty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));

        SmartwatchAddToCart.setText("add to cart");

        javax.swing.GroupLayout SmartwatchItemPanelLayout = new javax.swing.GroupLayout(SmartwatchItemPanel);
        SmartwatchItemPanel.setLayout(SmartwatchItemPanelLayout);
        SmartwatchItemPanelLayout.setHorizontalGroup(
            SmartwatchItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SmartwatchItemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SmartwatchItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SmartwatchItemPanelLayout.createSequentialGroup()
                        .addGroup(SmartwatchItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SmartwatchItemPanelLayout.createSequentialGroup()
                                .addComponent(SmartwatchCurrency)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SmartwatchPriceLabel))
                            .addComponent(SmartwatchLabel)
                            .addComponent(SmartwatchIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(SmartwatchItemPanelLayout.createSequentialGroup()
                        .addComponent(SmartwatchQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(SmartwatchAddToCart)
                        .addGap(25, 25, 25))))
        );
        SmartwatchItemPanelLayout.setVerticalGroup(
            SmartwatchItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SmartwatchItemPanelLayout.createSequentialGroup()
                .addComponent(SmartwatchIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(SmartwatchLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SmartwatchItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SmartwatchCurrency, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SmartwatchPriceLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SmartwatchItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SmartwatchQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SmartwatchAddToCart))
                .addContainerGap())
        );

        KeyboardItemPanel.setBackground(new java.awt.Color(153, 153, 153));
        KeyboardItemPanel.setPreferredSize(new java.awt.Dimension(160, 160));

        KeyboardIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Keyboard.png"))); // NOI18N

        KeyboardLabel.setText("Keyboard");

        KeyboardCurrency.setText("RM");

        KeyboardPriceLabel.setText("1300");

        KeyboardQty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));

        KeyboardAddToCart.setText("add to cart");

        javax.swing.GroupLayout KeyboardItemPanelLayout = new javax.swing.GroupLayout(KeyboardItemPanel);
        KeyboardItemPanel.setLayout(KeyboardItemPanelLayout);
        KeyboardItemPanelLayout.setHorizontalGroup(
            KeyboardItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KeyboardItemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(KeyboardItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(KeyboardItemPanelLayout.createSequentialGroup()
                        .addComponent(KeyboardQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(KeyboardAddToCart))
                    .addGroup(KeyboardItemPanelLayout.createSequentialGroup()
                        .addGroup(KeyboardItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(KeyboardItemPanelLayout.createSequentialGroup()
                                .addComponent(KeyboardCurrency)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(KeyboardPriceLabel))
                            .addComponent(KeyboardLabel)
                            .addComponent(KeyboardIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        KeyboardItemPanelLayout.setVerticalGroup(
            KeyboardItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KeyboardItemPanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(KeyboardIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(KeyboardLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(KeyboardItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(KeyboardCurrency, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(KeyboardPriceLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(KeyboardItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(KeyboardQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KeyboardAddToCart))
                .addContainerGap())
        );

        javax.swing.GroupLayout ElectronicCategoryLayout = new javax.swing.GroupLayout(ElectronicCategory);
        ElectronicCategory.setLayout(ElectronicCategoryLayout);
        ElectronicCategoryLayout.setHorizontalGroup(
            ElectronicCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ElectronicCategoryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CameraItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MonitorItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MouseItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SmartphoneItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SmartwatchItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(KeyboardItemPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addGap(114, 114, 114))
        );
        ElectronicCategoryLayout.setVerticalGroup(
            ElectronicCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ElectronicCategoryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ElectronicCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(KeyboardItemPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                    .addComponent(SmartwatchItemPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                    .addComponent(SmartphoneItemPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                    .addComponent(MouseItemPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                    .addComponent(MonitorItemPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                    .addComponent(CameraItemPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                .addContainerGap())
        );

        ItemsPanel.add(ElectronicCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 200));

        ForkItemPanel.setBackground(new java.awt.Color(153, 153, 153));
        ForkItemPanel.setPreferredSize(new java.awt.Dimension(160, 160));

        ForkIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Fork.png"))); // NOI18N

        ForkLabel.setText("Fork");

        ForkCurrency.setText("RM");

        ForkPriceLabel.setText("2");

        ForkQty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));

        ForkAddToCart.setText("add to cart");

        javax.swing.GroupLayout ForkItemPanelLayout = new javax.swing.GroupLayout(ForkItemPanel);
        ForkItemPanel.setLayout(ForkItemPanelLayout);
        ForkItemPanelLayout.setHorizontalGroup(
            ForkItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ForkItemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ForkItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ForkItemPanelLayout.createSequentialGroup()
                        .addComponent(ForkQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(ForkAddToCart))
                    .addGroup(ForkItemPanelLayout.createSequentialGroup()
                        .addGroup(ForkItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ForkItemPanelLayout.createSequentialGroup()
                                .addComponent(ForkCurrency)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ForkPriceLabel))
                            .addComponent(ForkLabel)
                            .addComponent(ForkIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ForkItemPanelLayout.setVerticalGroup(
            ForkItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ForkItemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ForkIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ForkLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ForkItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ForkCurrency, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ForkPriceLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ForkItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ForkQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ForkAddToCart))
                .addContainerGap())
        );

        SpoonItemPanel.setBackground(new java.awt.Color(153, 153, 153));
        SpoonItemPanel.setPreferredSize(new java.awt.Dimension(160, 160));

        SpoonIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Spoon.png"))); // NOI18N

        SpoonLabel.setText("Spoon");

        SpoonCurrency.setText("RM");

        SpoonPriceLabel.setText("2");

        SpoonQty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));

        SpoonAddToCart.setText("add to cart");

        javax.swing.GroupLayout SpoonItemPanelLayout = new javax.swing.GroupLayout(SpoonItemPanel);
        SpoonItemPanel.setLayout(SpoonItemPanelLayout);
        SpoonItemPanelLayout.setHorizontalGroup(
            SpoonItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SpoonItemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SpoonItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SpoonItemPanelLayout.createSequentialGroup()
                        .addGroup(SpoonItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SpoonItemPanelLayout.createSequentialGroup()
                                .addComponent(SpoonCurrency)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SpoonPriceLabel))
                            .addComponent(SpoonLabel)
                            .addComponent(SpoonIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(SpoonItemPanelLayout.createSequentialGroup()
                        .addComponent(SpoonQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(SpoonAddToCart)))
                .addContainerGap())
        );
        SpoonItemPanelLayout.setVerticalGroup(
            SpoonItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SpoonItemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SpoonIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(SpoonLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SpoonItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SpoonCurrency, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SpoonPriceLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SpoonItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SpoonQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SpoonAddToCart))
                .addContainerGap())
        );

        KnifeItemPanel.setBackground(new java.awt.Color(153, 153, 153));
        KnifeItemPanel.setPreferredSize(new java.awt.Dimension(160, 160));

        KnifeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Knife.png"))); // NOI18N

        KnifeLabel.setText("Knife");

        KnifeCurrency.setText("RM");

        KnifePriceLabel.setText("6");

        KnifeQty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));

        KnifeAddToCart.setText("add to cart");

        javax.swing.GroupLayout KnifeItemPanelLayout = new javax.swing.GroupLayout(KnifeItemPanel);
        KnifeItemPanel.setLayout(KnifeItemPanelLayout);
        KnifeItemPanelLayout.setHorizontalGroup(
            KnifeItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KnifeItemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(KnifeItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(KnifeItemPanelLayout.createSequentialGroup()
                        .addGroup(KnifeItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(KnifeItemPanelLayout.createSequentialGroup()
                                .addComponent(KnifeCurrency)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(KnifePriceLabel))
                            .addComponent(KnifeLabel)
                            .addComponent(KnifeIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(KnifeItemPanelLayout.createSequentialGroup()
                        .addComponent(KnifeQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(KnifeAddToCart)))
                .addContainerGap())
        );
        KnifeItemPanelLayout.setVerticalGroup(
            KnifeItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KnifeItemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(KnifeIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(KnifeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(KnifeItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(KnifeCurrency, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(KnifePriceLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(KnifeItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(KnifeQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KnifeAddToCart))
                .addContainerGap())
        );

        PlateItemPanel.setBackground(new java.awt.Color(153, 153, 153));
        PlateItemPanel.setPreferredSize(new java.awt.Dimension(160, 160));

        PlateIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Plate.png"))); // NOI18N

        PlateLabel.setText("Plate");

        PlateCurrency.setText("RM");

        PlatePriceLabel.setText("8");

        PlateQty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));

        PlateAddToCart.setText("add to cart");

        javax.swing.GroupLayout PlateItemPanelLayout = new javax.swing.GroupLayout(PlateItemPanel);
        PlateItemPanel.setLayout(PlateItemPanelLayout);
        PlateItemPanelLayout.setHorizontalGroup(
            PlateItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlateItemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PlateItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PlateItemPanelLayout.createSequentialGroup()
                        .addComponent(PlateQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(PlateAddToCart))
                    .addGroup(PlateItemPanelLayout.createSequentialGroup()
                        .addGroup(PlateItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PlateItemPanelLayout.createSequentialGroup()
                                .addComponent(PlateCurrency)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PlatePriceLabel))
                            .addComponent(PlateLabel)
                            .addComponent(PlateIcon))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PlateItemPanelLayout.setVerticalGroup(
            PlateItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlateItemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PlateIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PlateLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PlateItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PlateCurrency, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PlatePriceLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PlateItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PlateQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PlateAddToCart))
                .addContainerGap())
        );

        javax.swing.GroupLayout UtensilCategoryLayout = new javax.swing.GroupLayout(UtensilCategory);
        UtensilCategory.setLayout(UtensilCategoryLayout);
        UtensilCategoryLayout.setHorizontalGroup(
            UtensilCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UtensilCategoryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ForkItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SpoonItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(KnifeItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PlateItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(479, Short.MAX_VALUE))
        );
        UtensilCategoryLayout.setVerticalGroup(
            UtensilCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UtensilCategoryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(UtensilCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(KnifeItemPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                    .addComponent(SpoonItemPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                    .addComponent(ForkItemPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                    .addComponent(PlateItemPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                .addContainerGap())
        );

        ItemsPanel.add(UtensilCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 1210, 200));

        SawItemPanel.setBackground(new java.awt.Color(153, 153, 153));
        SawItemPanel.setPreferredSize(new java.awt.Dimension(160, 160));

        SawIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Saw.png"))); // NOI18N

        SawLabel.setText("Saw");

        SawCurrency.setText("RM");

        SawPriceLabel.setText("60");

        SawQty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));

        SawAddToCart.setText("add to cart");

        javax.swing.GroupLayout SawItemPanelLayout = new javax.swing.GroupLayout(SawItemPanel);
        SawItemPanel.setLayout(SawItemPanelLayout);
        SawItemPanelLayout.setHorizontalGroup(
            SawItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SawItemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SawItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SawItemPanelLayout.createSequentialGroup()
                        .addComponent(SawQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(SawAddToCart))
                    .addGroup(SawItemPanelLayout.createSequentialGroup()
                        .addGroup(SawItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SawItemPanelLayout.createSequentialGroup()
                                .addComponent(SawCurrency)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SawPriceLabel))
                            .addComponent(SawLabel)
                            .addComponent(SawIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        SawItemPanelLayout.setVerticalGroup(
            SawItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SawItemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SawIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SawLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SawItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SawCurrency, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SawPriceLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SawItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SawQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SawAddToCart))
                .addGap(12, 12, 12))
        );

        WrenchItemPanel.setBackground(new java.awt.Color(153, 153, 153));
        WrenchItemPanel.setPreferredSize(new java.awt.Dimension(160, 160));

        WrenchIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Wrench.png"))); // NOI18N

        WrenchLabel.setText("Wrench");

        WrenchCurrency.setText("RM");

        WrenchPriceLabel.setText("30");

        WrenchQty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));

        WrenchAddToCart.setText("add to cart");

        javax.swing.GroupLayout WrenchItemPanelLayout = new javax.swing.GroupLayout(WrenchItemPanel);
        WrenchItemPanel.setLayout(WrenchItemPanelLayout);
        WrenchItemPanelLayout.setHorizontalGroup(
            WrenchItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WrenchItemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(WrenchItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(WrenchItemPanelLayout.createSequentialGroup()
                        .addComponent(WrenchQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(WrenchAddToCart))
                    .addGroup(WrenchItemPanelLayout.createSequentialGroup()
                        .addGroup(WrenchItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(WrenchItemPanelLayout.createSequentialGroup()
                                .addComponent(WrenchCurrency)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(WrenchPriceLabel))
                            .addComponent(WrenchLabel)
                            .addComponent(WrenchIcon))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        WrenchItemPanelLayout.setVerticalGroup(
            WrenchItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WrenchItemPanelLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(WrenchIcon)
                .addGap(17, 17, 17)
                .addComponent(WrenchLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(WrenchItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(WrenchCurrency, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(WrenchPriceLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(WrenchItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(WrenchQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WrenchAddToCart))
                .addGap(12, 12, 12))
        );

        SwissArmyKnifeItemPanel.setBackground(new java.awt.Color(153, 153, 153));
        SwissArmyKnifeItemPanel.setPreferredSize(new java.awt.Dimension(160, 160));

        SwissArmyKnifeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SwissArmyKnife.png"))); // NOI18N

        SwissArmyKnifeLabel.setText("Swiss Army Knife");

        SwissArmyKnifeCurrency.setText("RM");

        SwissArmyKnifePriceLabel.setText("70");

        SwissArmyKnifeQty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));

        SwissArmyKnifeAddToCart.setText("add to cart");

        javax.swing.GroupLayout SwissArmyKnifeItemPanelLayout = new javax.swing.GroupLayout(SwissArmyKnifeItemPanel);
        SwissArmyKnifeItemPanel.setLayout(SwissArmyKnifeItemPanelLayout);
        SwissArmyKnifeItemPanelLayout.setHorizontalGroup(
            SwissArmyKnifeItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SwissArmyKnifeItemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SwissArmyKnifeItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SwissArmyKnifeItemPanelLayout.createSequentialGroup()
                        .addComponent(SwissArmyKnifeQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(SwissArmyKnifeAddToCart))
                    .addGroup(SwissArmyKnifeItemPanelLayout.createSequentialGroup()
                        .addGroup(SwissArmyKnifeItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SwissArmyKnifeItemPanelLayout.createSequentialGroup()
                                .addComponent(SwissArmyKnifeCurrency)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SwissArmyKnifePriceLabel))
                            .addComponent(SwissArmyKnifeLabel)
                            .addComponent(SwissArmyKnifeIcon))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        SwissArmyKnifeItemPanelLayout.setVerticalGroup(
            SwissArmyKnifeItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SwissArmyKnifeItemPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(SwissArmyKnifeIcon)
                .addGap(17, 17, 17)
                .addComponent(SwissArmyKnifeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SwissArmyKnifeItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SwissArmyKnifeCurrency, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SwissArmyKnifePriceLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(SwissArmyKnifeItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SwissArmyKnifeQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SwissArmyKnifeAddToCart))
                .addGap(12, 12, 12))
        );

        ScrewdriverItemPanel.setBackground(new java.awt.Color(153, 153, 153));
        ScrewdriverItemPanel.setPreferredSize(new java.awt.Dimension(160, 160));

        ScrewdriverIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ScrewDriver.png"))); // NOI18N

        ScrewdriverLabel.setText("Screwdriver");

        ScrewdriverCurrency.setText("RM");

        ScrewdriverPriceLabel.setText("10");

        ScrewdriverQty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));

        ScrewdriverAddToCart.setText("add to cart");

        javax.swing.GroupLayout ScrewdriverItemPanelLayout = new javax.swing.GroupLayout(ScrewdriverItemPanel);
        ScrewdriverItemPanel.setLayout(ScrewdriverItemPanelLayout);
        ScrewdriverItemPanelLayout.setHorizontalGroup(
            ScrewdriverItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ScrewdriverItemPanelLayout.createSequentialGroup()
                .addGroup(ScrewdriverItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ScrewdriverItemPanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(ScrewdriverQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(ScrewdriverAddToCart))
                    .addGroup(ScrewdriverItemPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(ScrewdriverItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ScrewdriverItemPanelLayout.createSequentialGroup()
                                .addComponent(ScrewdriverCurrency)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ScrewdriverPriceLabel))
                            .addComponent(ScrewdriverLabel)
                            .addComponent(ScrewdriverIcon))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ScrewdriverItemPanelLayout.setVerticalGroup(
            ScrewdriverItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ScrewdriverItemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScrewdriverIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ScrewdriverLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ScrewdriverItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ScrewdriverCurrency, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ScrewdriverPriceLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ScrewdriverItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ScrewdriverQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ScrewdriverAddToCart))
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout HouseholdApplianceCategoryLayout = new javax.swing.GroupLayout(HouseholdApplianceCategory);
        HouseholdApplianceCategory.setLayout(HouseholdApplianceCategoryLayout);
        HouseholdApplianceCategoryLayout.setHorizontalGroup(
            HouseholdApplianceCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HouseholdApplianceCategoryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SawItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(WrenchItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SwissArmyKnifeItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ScrewdriverItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(482, Short.MAX_VALUE))
        );
        HouseholdApplianceCategoryLayout.setVerticalGroup(
            HouseholdApplianceCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HouseholdApplianceCategoryLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(HouseholdApplianceCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ScrewdriverItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SwissArmyKnifeItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WrenchItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SawItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        ItemsPanel.add(HouseholdApplianceCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 1210, 200));

        BookItemPanel.setBackground(new java.awt.Color(153, 153, 153));
        BookItemPanel.setPreferredSize(new java.awt.Dimension(160, 160));

        BookIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Book.png"))); // NOI18N

        BookLabel.setText("Book");

        BookCurrency.setText("RM");

        BookPriceLabel.setText("8");

        BookQty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));

        BookAddToCart.setText("add to cart");

        javax.swing.GroupLayout BookItemPanelLayout = new javax.swing.GroupLayout(BookItemPanel);
        BookItemPanel.setLayout(BookItemPanelLayout);
        BookItemPanelLayout.setHorizontalGroup(
            BookItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BookItemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BookItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BookItemPanelLayout.createSequentialGroup()
                        .addComponent(BookQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(BookAddToCart))
                    .addGroup(BookItemPanelLayout.createSequentialGroup()
                        .addGroup(BookItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BookItemPanelLayout.createSequentialGroup()
                                .addComponent(BookCurrency)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BookPriceLabel))
                            .addComponent(BookLabel)
                            .addComponent(BookIcon))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        BookItemPanelLayout.setVerticalGroup(
            BookItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BookItemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BookIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BookLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BookItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BookCurrency, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BookPriceLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BookItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BookQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BookAddToCart))
                .addGap(12, 12, 12))
        );

        MarkerItemPanel.setBackground(new java.awt.Color(153, 153, 153));
        MarkerItemPanel.setPreferredSize(new java.awt.Dimension(160, 160));

        MarkerIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Marker.png"))); // NOI18N

        MarkerLabel.setText("Marker");

        MarkerCurrency.setText("RM");

        MarkerPriceLabel.setText("3");

        MarkerQty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));

        MarkerAddToCart.setText("add to cart");

        javax.swing.GroupLayout MarkerItemPanelLayout = new javax.swing.GroupLayout(MarkerItemPanel);
        MarkerItemPanel.setLayout(MarkerItemPanelLayout);
        MarkerItemPanelLayout.setHorizontalGroup(
            MarkerItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MarkerItemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MarkerItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MarkerItemPanelLayout.createSequentialGroup()
                        .addComponent(MarkerQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(MarkerAddToCart))
                    .addGroup(MarkerItemPanelLayout.createSequentialGroup()
                        .addGroup(MarkerItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MarkerItemPanelLayout.createSequentialGroup()
                                .addComponent(MarkerCurrency)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(MarkerPriceLabel))
                            .addComponent(MarkerLabel)
                            .addComponent(MarkerIcon))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        MarkerItemPanelLayout.setVerticalGroup(
            MarkerItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MarkerItemPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(MarkerIcon)
                .addGap(34, 34, 34)
                .addComponent(MarkerLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MarkerItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MarkerCurrency, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MarkerPriceLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MarkerItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MarkerQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MarkerAddToCart))
                .addGap(12, 12, 12))
        );

        PencilItemPanel.setBackground(new java.awt.Color(153, 153, 153));
        PencilItemPanel.setPreferredSize(new java.awt.Dimension(160, 160));

        PencilIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pencil.png"))); // NOI18N

        PencilLabel.setText("Pencil");

        PencilCurrency.setText("RM");

        PencilPriceLabel.setText("2");

        PencilQty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));

        PencilAddToCart.setText("add to cart");

        javax.swing.GroupLayout PencilItemPanelLayout = new javax.swing.GroupLayout(PencilItemPanel);
        PencilItemPanel.setLayout(PencilItemPanelLayout);
        PencilItemPanelLayout.setHorizontalGroup(
            PencilItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PencilItemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PencilItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PencilItemPanelLayout.createSequentialGroup()
                        .addComponent(PencilQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(PencilAddToCart))
                    .addGroup(PencilItemPanelLayout.createSequentialGroup()
                        .addGroup(PencilItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PencilItemPanelLayout.createSequentialGroup()
                                .addComponent(PencilCurrency)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PencilPriceLabel))
                            .addComponent(PencilLabel)
                            .addComponent(PencilIcon))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PencilItemPanelLayout.setVerticalGroup(
            PencilItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PencilItemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PencilIcon)
                .addGap(26, 26, 26)
                .addComponent(PencilLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PencilItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PencilCurrency, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PencilPriceLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PencilItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PencilQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PencilAddToCart))
                .addGap(12, 12, 12))
        );

        ScissorItemPanel.setBackground(new java.awt.Color(153, 153, 153));
        ScissorItemPanel.setPreferredSize(new java.awt.Dimension(160, 160));

        ScissorIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Scissors.png"))); // NOI18N

        ScissorLabel.setText("Scissor");

        ScissorCurrency.setText("RM");

        ScissorPriceLabel.setText("4");

        ScissorQty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));

        ScissorAddToCart.setText("add to cart");

        javax.swing.GroupLayout ScissorItemPanelLayout = new javax.swing.GroupLayout(ScissorItemPanel);
        ScissorItemPanel.setLayout(ScissorItemPanelLayout);
        ScissorItemPanelLayout.setHorizontalGroup(
            ScissorItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ScissorItemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ScissorItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ScissorItemPanelLayout.createSequentialGroup()
                        .addComponent(ScissorQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ScissorAddToCart))
                    .addGroup(ScissorItemPanelLayout.createSequentialGroup()
                        .addGroup(ScissorItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ScissorItemPanelLayout.createSequentialGroup()
                                .addComponent(ScissorCurrency)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ScissorPriceLabel))
                            .addComponent(ScissorLabel)
                            .addComponent(ScissorIcon))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ScissorItemPanelLayout.setVerticalGroup(
            ScissorItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ScissorItemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScissorIcon)
                .addGap(34, 34, 34)
                .addComponent(ScissorLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ScissorItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ScissorCurrency, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ScissorPriceLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ScissorItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ScissorQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ScissorAddToCart)))
        );

        javax.swing.GroupLayout StationeryCategoryLayout = new javax.swing.GroupLayout(StationeryCategory);
        StationeryCategory.setLayout(StationeryCategoryLayout);
        StationeryCategoryLayout.setHorizontalGroup(
            StationeryCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StationeryCategoryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BookItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MarkerItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PencilItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ScissorItemPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addGap(482, 482, 482))
        );
        StationeryCategoryLayout.setVerticalGroup(
            StationeryCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StationeryCategoryLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(StationeryCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ScissorItemPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                    .addGroup(StationeryCategoryLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(StationeryCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PencilItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MarkerItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BookItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        ItemsPanel.add(StationeryCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 1210, 200));

        NecklaceItemPanel.setBackground(new java.awt.Color(153, 153, 153));
        NecklaceItemPanel.setPreferredSize(new java.awt.Dimension(160, 160));

        NecklaceIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Neckless.png"))); // NOI18N

        NecklaceLabel.setText("Necklace");

        NecklaceCurrency.setText("RM");

        NecklacePriceLabel.setText("220");

        NecklaceQty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));

        NecklaceAddToCart.setText("add to cart");

        javax.swing.GroupLayout NecklaceItemPanelLayout = new javax.swing.GroupLayout(NecklaceItemPanel);
        NecklaceItemPanel.setLayout(NecklaceItemPanelLayout);
        NecklaceItemPanelLayout.setHorizontalGroup(
            NecklaceItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NecklaceItemPanelLayout.createSequentialGroup()
                .addGroup(NecklaceItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NecklaceItemPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(NecklaceCurrency)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NecklacePriceLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(NecklaceItemPanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(NecklaceQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(NecklaceAddToCart)))
                .addContainerGap())
            .addGroup(NecklaceItemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NecklaceItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NecklaceIcon)
                    .addComponent(NecklaceLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        NecklaceItemPanelLayout.setVerticalGroup(
            NecklaceItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NecklaceItemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NecklaceIcon)
                .addGap(24, 24, 24)
                .addComponent(NecklaceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NecklaceItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NecklaceCurrency, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NecklacePriceLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NecklaceItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NecklaceQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NecklaceAddToCart))
                .addGap(6, 6, 6))
        );

        WatchItemPanel.setBackground(new java.awt.Color(153, 153, 153));
        WatchItemPanel.setPreferredSize(new java.awt.Dimension(160, 160));

        WatchIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Watch.png"))); // NOI18N

        WatchLabel.setText("Watch");

        WatchCurrency.setText("RM");

        WatchPriceLabel.setText("900");

        WatchQty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));

        WatchAddToCart.setText("add to cart");

        javax.swing.GroupLayout WatchItemPanelLayout = new javax.swing.GroupLayout(WatchItemPanel);
        WatchItemPanel.setLayout(WatchItemPanelLayout);
        WatchItemPanelLayout.setHorizontalGroup(
            WatchItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WatchItemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(WatchItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(WatchItemPanelLayout.createSequentialGroup()
                        .addComponent(WatchQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(WatchAddToCart))
                    .addGroup(WatchItemPanelLayout.createSequentialGroup()
                        .addGroup(WatchItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(WatchItemPanelLayout.createSequentialGroup()
                                .addComponent(WatchCurrency)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(WatchPriceLabel))
                            .addComponent(WatchLabel)
                            .addComponent(WatchIcon))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        WatchItemPanelLayout.setVerticalGroup(
            WatchItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WatchItemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(WatchIcon)
                .addGap(26, 26, 26)
                .addComponent(WatchLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(WatchItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(WatchCurrency, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(WatchPriceLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(WatchItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(WatchQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WatchAddToCart))
                .addGap(12, 12, 12))
        );

        BraceletItemPanel.setBackground(new java.awt.Color(153, 153, 153));
        BraceletItemPanel.setPreferredSize(new java.awt.Dimension(160, 160));

        BraceletIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Bracelet.png"))); // NOI18N

        BraceletLabel.setText("Bracelet");

        BraceletCurrency.setText("RM");

        BraceletPriceLabel.setText("300");

        BraceletQty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));

        BraceletAddToCart.setText("add to cart");

        javax.swing.GroupLayout BraceletItemPanelLayout = new javax.swing.GroupLayout(BraceletItemPanel);
        BraceletItemPanel.setLayout(BraceletItemPanelLayout);
        BraceletItemPanelLayout.setHorizontalGroup(
            BraceletItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BraceletItemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BraceletItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BraceletItemPanelLayout.createSequentialGroup()
                        .addComponent(BraceletQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(BraceletAddToCart))
                    .addGroup(BraceletItemPanelLayout.createSequentialGroup()
                        .addGroup(BraceletItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BraceletItemPanelLayout.createSequentialGroup()
                                .addComponent(BraceletCurrency)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BraceletPriceLabel))
                            .addComponent(BraceletLabel)
                            .addComponent(BraceletIcon))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        BraceletItemPanelLayout.setVerticalGroup(
            BraceletItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BraceletItemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BraceletIcon)
                .addGap(31, 31, 31)
                .addComponent(BraceletLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BraceletItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BraceletCurrency, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BraceletPriceLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BraceletItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BraceletQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BraceletAddToCart))
                .addGap(12, 12, 12))
        );

        GlassesItemPanel.setBackground(new java.awt.Color(153, 153, 153));
        GlassesItemPanel.setPreferredSize(new java.awt.Dimension(160, 160));

        GlassesIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Glasses.png"))); // NOI18N

        GlassesLabel.setText("Glasses");

        GlassesCurrency.setText("RM");

        GlassesPriceLabel.setText("150");

        GlassesQty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));

        GlassesAddToCart.setText("add to cart");

        javax.swing.GroupLayout GlassesItemPanelLayout = new javax.swing.GroupLayout(GlassesItemPanel);
        GlassesItemPanel.setLayout(GlassesItemPanelLayout);
        GlassesItemPanelLayout.setHorizontalGroup(
            GlassesItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GlassesItemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(GlassesItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GlassesItemPanelLayout.createSequentialGroup()
                        .addComponent(GlassesQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(GlassesAddToCart))
                    .addGroup(GlassesItemPanelLayout.createSequentialGroup()
                        .addGroup(GlassesItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(GlassesItemPanelLayout.createSequentialGroup()
                                .addComponent(GlassesCurrency)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(GlassesPriceLabel))
                            .addComponent(GlassesLabel)
                            .addComponent(GlassesIcon))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        GlassesItemPanelLayout.setVerticalGroup(
            GlassesItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GlassesItemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GlassesIcon)
                .addGap(26, 26, 26)
                .addComponent(GlassesLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(GlassesItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GlassesCurrency, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GlassesPriceLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(GlassesItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GlassesQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GlassesAddToCart))
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout AccessoryCategoryLayout = new javax.swing.GroupLayout(AccessoryCategory);
        AccessoryCategory.setLayout(AccessoryCategoryLayout);
        AccessoryCategoryLayout.setHorizontalGroup(
            AccessoryCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AccessoryCategoryLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NecklaceItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(WatchItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BraceletItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(GlassesItemPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addGap(482, 482, 482))
        );
        AccessoryCategoryLayout.setVerticalGroup(
            AccessoryCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AccessoryCategoryLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(AccessoryCategoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GlassesItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BraceletItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(WatchItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NecklaceItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        ItemsPanel.add(AccessoryCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 760, 1210, 200));

        ItemsScrollPane.setViewportView(ItemsPanel);

        Background.add(ItemsScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 272, -1, 440));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ElectronicItemPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ElectronicItemPanelMouseEntered
        ElectronicItemPanel.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_ElectronicItemPanelMouseEntered

    private void ElectronicItemPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ElectronicItemPanelMouseExited
       ElectronicItemPanel.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_ElectronicItemPanelMouseExited

    private void ElectronicItemPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ElectronicItemPanelMouseClicked
        ElectronicCategory.setVisible(true);
        UtensilCategory.setVisible(false);
        HouseholdApplianceCategory.setVisible(false);
        StationeryCategory.setVisible(false);
        AccessoryCategory.setVisible(false);
    }//GEN-LAST:event_ElectronicItemPanelMouseClicked

    private void UtensilItemPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UtensilItemPanelMouseEntered
        UtensilItemPanel.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_UtensilItemPanelMouseEntered

    private void UtensilItemPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UtensilItemPanelMouseExited
        UtensilItemPanel.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_UtensilItemPanelMouseExited

    private void UtensilItemPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UtensilItemPanelMouseClicked
        ElectronicCategory.setVisible(false);
        UtensilCategory.setVisible(true);
        HouseholdApplianceCategory.setVisible(false);
        StationeryCategory.setVisible(false);
        AccessoryCategory.setVisible(false);
        ElectronicCategory.setLocation(0, 190);
        UtensilCategory.setLocation(0, 0); // Double click to move ???
    }//GEN-LAST:event_UtensilItemPanelMouseClicked

    private void HouseholdApplianceLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HouseholdApplianceLabelMouseEntered
        HouseholdApplianceItemPanel.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_HouseholdApplianceLabelMouseEntered

    private void HouseholdApplianceLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HouseholdApplianceLabelMouseExited
        HouseholdApplianceItemPanel.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_HouseholdApplianceLabelMouseExited

    private void HouseholdApplianceLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HouseholdApplianceLabelMouseClicked
        ElectronicCategory.setVisible(false);
        UtensilCategory.setVisible(false);
        HouseholdApplianceCategory.setVisible(true);
        StationeryCategory.setVisible(false);
        AccessoryCategory.setVisible(false);
        HouseholdApplianceCategory.setLocation(0, 0); // Double click to move ???
    }//GEN-LAST:event_HouseholdApplianceLabelMouseClicked

    private void StationaryLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StationaryLabelMouseEntered
       StationeryItemPanel.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_StationaryLabelMouseEntered

    private void StationaryLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StationaryLabelMouseExited
        StationeryItemPanel.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_StationaryLabelMouseExited

    private void StationaryLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StationaryLabelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_StationaryLabelMouseClicked

    private void AccessoriesLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AccessoriesLabelMouseEntered
        AccessoriesItemPanel.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_AccessoriesLabelMouseEntered

    private void AccessoriesLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AccessoriesLabelMouseExited
        AccessoriesItemPanel.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_AccessoriesLabelMouseExited

    private void AccessoriesLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AccessoriesLabelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_AccessoriesLabelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AccessoriesItemPanel;
    private javax.swing.JLabel AccessoriesLabel;
    private javax.swing.JPanel AccessoryCategory;
    private javax.swing.JPanel Background;
    private javax.swing.JButton BookAddToCart;
    private javax.swing.JLabel BookCurrency;
    private javax.swing.JLabel BookIcon;
    private javax.swing.JPanel BookItemPanel;
    private javax.swing.JLabel BookLabel;
    private javax.swing.JLabel BookPriceLabel;
    private javax.swing.JComboBox<String> BookQty;
    private javax.swing.JButton BraceletAddToCart;
    private javax.swing.JLabel BraceletCurrency;
    private javax.swing.JLabel BraceletIcon;
    private javax.swing.JPanel BraceletItemPanel;
    private javax.swing.JLabel BraceletLabel;
    private javax.swing.JLabel BraceletPriceLabel;
    private javax.swing.JComboBox<String> BraceletQty;
    private javax.swing.JButton CameraAddToCart;
    private javax.swing.JLabel CameraCurrency;
    private javax.swing.JLabel CameraIcon;
    private javax.swing.JPanel CameraItemPanel;
    private javax.swing.JLabel CameraLabel;
    private javax.swing.JLabel CameraPriceLabel;
    private javax.swing.JComboBox<String> CameraQty;
    private javax.swing.JPanel ElectronicCategory;
    private javax.swing.JPanel ElectronicItemPanel;
    private javax.swing.JLabel ElectronicLabel;
    private javax.swing.JButton ForkAddToCart;
    private javax.swing.JLabel ForkCurrency;
    private javax.swing.JLabel ForkIcon;
    private javax.swing.JPanel ForkItemPanel;
    private javax.swing.JLabel ForkLabel;
    private javax.swing.JLabel ForkPriceLabel;
    private javax.swing.JComboBox<String> ForkQty;
    private javax.swing.JButton GlassesAddToCart;
    private javax.swing.JLabel GlassesCurrency;
    private javax.swing.JLabel GlassesIcon;
    private javax.swing.JPanel GlassesItemPanel;
    private javax.swing.JLabel GlassesLabel;
    private javax.swing.JLabel GlassesPriceLabel;
    private javax.swing.JComboBox<String> GlassesQty;
    private javax.swing.JPanel HouseholdApplianceCategory;
    private javax.swing.JPanel HouseholdApplianceItemPanel;
    private javax.swing.JLabel HouseholdApplianceLabel;
    private javax.swing.JPanel ItemsPanel;
    private javax.swing.JScrollPane ItemsScrollPane;
    private javax.swing.JButton KeyboardAddToCart;
    private javax.swing.JLabel KeyboardCurrency;
    private javax.swing.JLabel KeyboardIcon;
    private javax.swing.JPanel KeyboardItemPanel;
    private javax.swing.JLabel KeyboardLabel;
    private javax.swing.JLabel KeyboardPriceLabel;
    private javax.swing.JComboBox<String> KeyboardQty;
    private javax.swing.JButton KnifeAddToCart;
    private javax.swing.JLabel KnifeCurrency;
    private javax.swing.JLabel KnifeIcon;
    private javax.swing.JPanel KnifeItemPanel;
    private javax.swing.JLabel KnifeLabel;
    private javax.swing.JLabel KnifePriceLabel;
    private javax.swing.JComboBox<String> KnifeQty;
    private javax.swing.JButton MarkerAddToCart;
    private javax.swing.JLabel MarkerCurrency;
    private javax.swing.JLabel MarkerIcon;
    private javax.swing.JPanel MarkerItemPanel;
    private javax.swing.JLabel MarkerLabel;
    private javax.swing.JLabel MarkerPriceLabel;
    private javax.swing.JComboBox<String> MarkerQty;
    private javax.swing.JButton MonitorAddToCart;
    private javax.swing.JLabel MonitorCurrency;
    private javax.swing.JLabel MonitorIcon;
    private javax.swing.JPanel MonitorItemPanel;
    private javax.swing.JLabel MonitorLabel;
    private javax.swing.JLabel MonitorPriceLabel;
    private javax.swing.JComboBox<String> MonitorQty;
    private javax.swing.JLabel MosuePriceLabel;
    private javax.swing.JButton MouseAddToCart;
    private javax.swing.JLabel MouseCurrency;
    private javax.swing.JLabel MouseIcon;
    private javax.swing.JPanel MouseItemPanel;
    private javax.swing.JLabel MouseLabel;
    private javax.swing.JComboBox<String> MouseQty;
    private javax.swing.JButton NecklaceAddToCart;
    private javax.swing.JLabel NecklaceCurrency;
    private javax.swing.JLabel NecklaceIcon;
    private javax.swing.JPanel NecklaceItemPanel;
    private javax.swing.JLabel NecklaceLabel;
    private javax.swing.JLabel NecklacePriceLabel;
    private javax.swing.JComboBox<String> NecklaceQty;
    private javax.swing.JButton PencilAddToCart;
    private javax.swing.JLabel PencilCurrency;
    private javax.swing.JLabel PencilIcon;
    private javax.swing.JPanel PencilItemPanel;
    private javax.swing.JLabel PencilLabel;
    private javax.swing.JLabel PencilPriceLabel;
    private javax.swing.JComboBox<String> PencilQty;
    private javax.swing.JButton PlateAddToCart;
    private javax.swing.JLabel PlateCurrency;
    private javax.swing.JLabel PlateIcon;
    private javax.swing.JPanel PlateItemPanel;
    private javax.swing.JLabel PlateLabel;
    private javax.swing.JLabel PlatePriceLabel;
    private javax.swing.JComboBox<String> PlateQty;
    private javax.swing.JButton SawAddToCart;
    private javax.swing.JLabel SawCurrency;
    private javax.swing.JLabel SawIcon;
    private javax.swing.JPanel SawItemPanel;
    private javax.swing.JLabel SawLabel;
    private javax.swing.JLabel SawPriceLabel;
    private javax.swing.JComboBox<String> SawQty;
    private javax.swing.JButton ScissorAddToCart;
    private javax.swing.JLabel ScissorCurrency;
    private javax.swing.JLabel ScissorIcon;
    private javax.swing.JPanel ScissorItemPanel;
    private javax.swing.JLabel ScissorLabel;
    private javax.swing.JLabel ScissorPriceLabel;
    private javax.swing.JComboBox<String> ScissorQty;
    private javax.swing.JButton ScrewdriverAddToCart;
    private javax.swing.JLabel ScrewdriverCurrency;
    private javax.swing.JLabel ScrewdriverIcon;
    private javax.swing.JPanel ScrewdriverItemPanel;
    private javax.swing.JLabel ScrewdriverLabel;
    private javax.swing.JLabel ScrewdriverPriceLabel;
    private javax.swing.JComboBox<String> ScrewdriverQty;
    private javax.swing.JLabel SmartPhonePriceLabel;
    private javax.swing.JLabel Smartphone11ProLabel;
    private javax.swing.JButton SmartphoneAddToCart;
    private javax.swing.JLabel SmartphoneCurrency;
    private javax.swing.JLabel SmartphoneIcon;
    private javax.swing.JPanel SmartphoneItemPanel;
    private javax.swing.JComboBox<String> SmartphoneQty;
    private javax.swing.JButton SmartwatchAddToCart;
    private javax.swing.JLabel SmartwatchCurrency;
    private javax.swing.JLabel SmartwatchIcon;
    private javax.swing.JPanel SmartwatchItemPanel;
    private javax.swing.JLabel SmartwatchLabel;
    private javax.swing.JLabel SmartwatchPriceLabel;
    private javax.swing.JComboBox<String> SmartwatchQty;
    private javax.swing.JButton SpoonAddToCart;
    private javax.swing.JLabel SpoonCurrency;
    private javax.swing.JLabel SpoonIcon;
    private javax.swing.JPanel SpoonItemPanel;
    private javax.swing.JLabel SpoonLabel;
    private javax.swing.JLabel SpoonPriceLabel;
    private javax.swing.JComboBox<String> SpoonQty;
    private javax.swing.JLabel StationaryLabel;
    private javax.swing.JPanel StationeryCategory;
    private javax.swing.JPanel StationeryItemPanel;
    private javax.swing.JButton SwissArmyKnifeAddToCart;
    private javax.swing.JLabel SwissArmyKnifeCurrency;
    private javax.swing.JLabel SwissArmyKnifeIcon;
    private javax.swing.JPanel SwissArmyKnifeItemPanel;
    private javax.swing.JLabel SwissArmyKnifeLabel;
    private javax.swing.JLabel SwissArmyKnifePriceLabel;
    private javax.swing.JComboBox<String> SwissArmyKnifeQty;
    private javax.swing.JPanel UtensilCategory;
    private javax.swing.JPanel UtensilItemPanel;
    private javax.swing.JLabel UtensilLabel;
    private javax.swing.JButton WatchAddToCart;
    private javax.swing.JLabel WatchCurrency;
    private javax.swing.JLabel WatchIcon;
    private javax.swing.JPanel WatchItemPanel;
    private javax.swing.JLabel WatchLabel;
    private javax.swing.JLabel WatchPriceLabel;
    private javax.swing.JComboBox<String> WatchQty;
    private javax.swing.JButton WrenchAddToCart;
    private javax.swing.JLabel WrenchCurrency;
    private javax.swing.JLabel WrenchIcon;
    private javax.swing.JPanel WrenchItemPanel;
    private javax.swing.JLabel WrenchLabel;
    private javax.swing.JLabel WrenchPriceLabel;
    private javax.swing.JComboBox<String> WrenchQty;
    // End of variables declaration//GEN-END:variables
}
