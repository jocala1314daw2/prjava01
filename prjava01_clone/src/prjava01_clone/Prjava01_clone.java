/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prjava01_clone;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Jordi
 */
public class Prjava01_clone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
      File f=new File("fitxer.html");
	try(BufferedWriter bw=new BufferedWriter(new FileWriter(f))){
		
            bw.write("<html>");
                bw.newLine();
		bw.write("<head>");
                bw.newLine();
		bw.write("<title>");
                bw.newLine();
		bw.write("Novap&agrave;ginaweb");
                bw.newLine();
		bw.write("</title>");
                bw.newLine();
		bw.write("</head>");
                bw.newLine();
		bw.write("<body>");
                bw.write("<h1>DAW2m08uf4pr2</h1>");bw.newLine();
                bw.newLine();
		bw.write("Novap&agrave;ginaweb");
                bw.newLine();
		bw.write("</body>");
                bw.newLine();
		bw.write("</html>");
                bw.newLine();
		bw.close();
	}

    }
    }
    

