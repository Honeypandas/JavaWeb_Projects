package servlet;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.commons.collections.Buffer;
 

public class ImageServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		BufferedImage bi=new BufferedImage(68, 22, BufferedImage.TYPE_INT_RGB);
		Graphics g=bi.getGraphics();
		
		java.awt.Color c=new java.awt.Color(200, 150, 255);
		g.fillRect(0, 0, 68, 22);
		g.setColor(c);
		
		char[]  ch="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
		Random random=new Random();
		int len=ch.length,index;
		StringBuffer sb=new StringBuffer();
		
		for(int i=0;i<4;i++)
		{
			index=random.nextInt(len);
			g.setColor(new java.awt.Color(random.nextInt(88),random.nextInt(88),random.nextInt(88)));
			g.drawString(ch[index]+"", (i*15)+3, 18);
			sb.append(ch[index]);
		
		
		}
		req.getSession().setAttribute("piccode", sb.toString());
		ImageIO.write(bi, "JPG", resp.getOutputStream());
		
		
		
	}

}
