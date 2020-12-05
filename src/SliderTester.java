import java.awt.*;

import javax.swing.*;
public class SliderTester 
{
	private static final int width = 600;
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame();
		//to get the shape of the car drawn in class Carshape, creating an object 
		CarShape carIcon = new CarShape(600); 
		//putting the car image to the label of the frame
		JLabel label = new JLabel(carIcon);
		
		//creating a slider to change the size of the car 
		JSlider slider = new JSlider(0,width,600);
		//once the user moves the slider the shape needs to change so addlistener to call the event  
		slider.addChangeListener((e)->{
			carIcon.setWidth(slider.getValue());
			label.repaint();
		});
		slider.setPreferredSize(new Dimension(width, width/2));
		
		frame.setLayout(new BorderLayout(2,1));
		//placing the car Icon in the center layout 
		frame.add(label, BorderLayout.CENTER);
		//placing the slider towards the south of the frame 
		frame.add(slider,BorderLayout.SOUTH);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
