package tree;

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class Tree {


    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Frame!");
        frame.setLocation(100,100);
        frame.setVisible(true);
        frame.setSize(500, 500);
        
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                System.out.println("Bye!");
                System.exit(0);
            }
        });
        
        JTree arbol = new javax.swing.JTree();
        javax.swing.tree.DefaultMutableTreeNode e1 = new javax.swing.tree.DefaultMutableTreeNode("Start");
        javax.swing.tree.DefaultMutableTreeNode e2 = new javax.swing.tree.DefaultMutableTreeNode("First Part");
        javax.swing.tree.DefaultMutableTreeNode e3 = new javax.swing.tree.DefaultMutableTreeNode("E1-S1");
        
        e1.add(e2);
        e2.add(e3);
        
        e3 = new javax.swing.tree.DefaultMutableTreeNode("E2-S1");
        e2.add(e3);
        e3 = new javax.swing.tree.DefaultMutableTreeNode("E2-S1");
        e2.add(e3);
        
        e2 = new javax.swing.tree.DefaultMutableTreeNode("Second Part");
        e3 = new javax.swing.tree.DefaultMutableTreeNode("E1-S1");
        e2.add(e3);
        e3 = new javax.swing.tree.DefaultMutableTreeNode("E2-S1");
        e2.add(e3);
        
        javax.swing.tree.DefaultMutableTreeNode treeNode4 = new javax.swing.tree.DefaultMutableTreeNode("SE1-E2-S2");
        e3.add(treeNode4);
        e2.add(e3);
        e1.add(e2);
        
        arbol.setModel(new javax.swing.tree.DefaultTreeModel(e1));
        
        frame.add(arbol, BorderLayout.CENTER);   
    }   
}