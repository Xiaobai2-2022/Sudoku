/**
 * SudokuGUI.java
 * Provide the GUI for the Sudoku game
 * package sudoku
 * 
 * @author Xiaobai2
 * @version 1.0-SNAPSHOT-0
 * @since 1.0-SNAPSHOT-0
 */
package sudoku;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SudokuGUI {

    /*  Global Constants */
    public static final int NUMROW = 9;
    public static final int NUMCOL = 9;
    public static final int SECTIONNUM = 3;

    /* Private Constants */

    private static final String FILENAME = "config.xinf";

    private static final int PIECESIZE = 50;
    private static final int NUMPANEWIDTH = PIECESIZE * NUMROW;
    private static final int NUMPANEHEIGHT = PIECESIZE * NUMCOL;
    
    private static final int INFOPANEWIDTH = NUMPANEWIDTH;
    private static final int INFOPANEHEIGHT = 2 * PIECESIZE;

    private static final int FRAMEWIDTH = (int) (NUMPANEWIDTH * 1.03);
    private static final int FRAMEHEIGHT = (int) ((INFOPANEHEIGHT + NUMPANEHEIGHT) * 1.1);

    private static final int BORDERWIDTH = 2;
    private static final int THICKBORDERWIDTH = 2 * BORDERWIDTH;

    /* Private Display Fields */
    private JFrame main_frame;
    private JLabel[][] slots;
    private JTextField display_time;

    /**
     * Ctor: SudokuGUI
     * initalize an empty SudokuGUI
     * 
     * @since 1.0-SNAPSHOT-0
     */
    public SudokuGUI() {

        System.out.println(init());

    }

    /**
     * init
     * initalize the GUI
     * 
     * @since 1.0-SNAPSHOT-0
     * @return if the GUI is correctly initaliazed
     */
    public boolean init() {

        if(!init_config(FILENAME)){
            return false;
        }

        return true;

    }

    /**
     * init_config
     * grap the information from the config file
     * 
     * @since 1.0-SNAPSHOT-0
     * @param file_name the name of the config file
     * @return if the information is correctly retrieved
     */
    private boolean init_config(String file_name) {

        // try opening the file
        try {

            BufferedReader in = new BufferedReader(new FileReader(file_name));
            in.close();

        }
        catch(IOException ioe) {

            System.out.println("Exception 100, file can not be accessed.");
            ioe.printStackTrace();
            return false;

        }

        return true;

    }

}