import javax.swing.*;
import javax.imageio.*;


import com.github.sarxos.webcam.*;
import java.io.*;
import java.awt.*;

public  class n extends JPanel
{
	Webcam webcam;
	WebcamPanel webcamPanel;
	public n()
	
	{
		setLayout(new BorderLayout());
		// setBackground(new Color(124,168,233));
		// Webcam webcam = Webcam.getDefault();
		// webcam.setViewSize(WebcamResolution.HD720);
		// WebcamPanel webcamPanel=new WebcamPanel(webcam);
		// webcamPanel.setImageSizeDisplayed(true);
		// add(webcamPanel);
		
		setBounds(900,100,400,400);
	}
	void cam()
	{
		webcam = Webcam.getDefault();
		
		webcamPanel=new WebcamPanel(webcam);
		webcamPanel.setImageSizeDisplayed(true);
		add(webcamPanel);
		
		
		// setBounds(100,100,100,100);
		setBounds(1300,100,400,400);
		
		// Webcam webcam = Webcam.getDefault();
		// webcam.setViewSize(webcamResolution.VGA.getSize());
		// WebcamPanel webcamPanel=new WebcamPanel(webcam);
		// webcamPanel.setImageSizeDisplayed(true);
		// add(webcamPanel);
		
		}
}
