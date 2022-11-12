package common;

import javax.swing.*;
import java.net.URL;

public class AllBackGround {

    public static void setBackGround(JFrame jFrame){
        // 设置背景
        JLabel lblBackground = new JLabel(); // 创建一个标签组件对象
        URL resource = jFrame.getClass().getResource("../images/student.png"); // 获取背景图片路径
        ImageIcon icon = new ImageIcon(resource); // 创建背景图片对象
        lblBackground.setIcon(icon); // 设置标签组件要显示的图标
        lblBackground.setBounds(0, 0, icon.getIconWidth(), icon.getIconHeight()); // 设置组件的显示位置及大小
        jFrame.getContentPane().add(lblBackground); // 将组件添加到面板
    }
}
