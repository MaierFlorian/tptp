package parser;

import java.io.IOException;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {

	public static void main(String[] args) {
		try {
			CharStream input = CharStreams.fromFileName("./resources/example.txt");
			tptp_v7_0_0_0Lexer lexer = new tptp_v7_0_0_0Lexer(input);
			
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			
			tptp_v7_0_0_0Parser parser = new tptp_v7_0_0_0Parser(tokens);
			ParseTree tree = parser.tptp_file(); // begin parsing at rule 'tptp_file'
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
			//open drawing of tree
			JFrame frame = new JFrame("Antlr AST");
	        JPanel panel = new JPanel();
	        TreeViewer viewr = new TreeViewer(Arrays.asList(
	                parser.getRuleNames()),tree);
	        viewr.setScale(1.5);//scale a little
	        panel.add(viewr);
	        frame.add(panel);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(800,800);
	        frame.setVisible(true);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
