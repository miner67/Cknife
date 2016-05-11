package com.ms509.ui;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JTabbedPane;

import com.ms509.ui.config.panel.HttpHeaderPanel;
import com.ms509.ui.config.panel.ProxyPanel;

public class ConfigDialog extends JDialog{

	public ConfigDialog() {
		super(MainFrame.main,"Cknife 设置",true);
		this.setComponent();
		this.setVisible(true);
	}
	private void setComponent()
	{
		Toolkit t = Toolkit.getDefaultToolkit();
		Dimension d = t.getScreenSize();
		this.setResizable(false);
		this.setSize(450, 240);
		this.setLocation((d.width - this.getWidth()) / 2,
				(d.height - this.getHeight()) / 2);
		this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		JTabbedPane pane = new JTabbedPane();
		pane.addTab("代 理", new ProxyPanel());
		pane.addTab("Http头", new HttpHeaderPanel());
		this.getContentPane().add(pane);
	}
}
