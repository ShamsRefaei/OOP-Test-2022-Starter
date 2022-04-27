package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class NematodeVisualiser extends PApplet
{

	ArrayList<Nematode> nematode = new ArrayList<Nematode>();

	public void keyPressed()
	{		
		if (keyCode == LEFT)
		{
		}		
	}


	public void settings()
	{
		size(800, 800);
	}

	public void setup() 
	{
		colorMode(HSB);
		background(0);
		smooth();				
	}
	

	public void loadNematodes()
	{
		// load nematodes from given csv file
		Table table = loadTable("nametodes.csv", "header");
        for(TableRow r:table.rows())
        {
            Nematode s = new Nematode(r);
            nematode.add(s);
        }
	}


	public void draw()
	{	
	}
}
