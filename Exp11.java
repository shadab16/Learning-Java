import java.awt.Graphics;
import java.applet.Applet;

public class Exp11 extends Applet
{
	StringBuffer buffer;

	public void init()
	{
		this.buffer = new StringBuffer();
		this.showText("Initialize.");
	}

	public void start()
	{
		this.showText("Start.");
	}

	public void stop()
	{
		this.showText("Stop.");
	}

	public void destroy()
	{
		this.showText("Destroy.");
	}

	protected void showText(String text)
	{
		this.buffer.append(text + " ");
		this.repaint();
	}

	public void paint(Graphics g)
	{
		g.drawRect(0, 0, this.getWidth() - 1, this.getHeight() - 1);

		g.drawString(
			buffer.toString(),
			10,
			this.getHeight() / 2
		);
	}
}
