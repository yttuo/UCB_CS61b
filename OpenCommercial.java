/* OpenCommercial.java */

import java.net.*;
import java.io.*;

/**  A class that provides a main function to read five lines of a commercial
 *   Web page and print them in reverse order, given the name of a company.
 */

class OpenCommercial {

  /** Prompts the user for the name X of a company (a single string), opens
   *  the Web site corresponding to www.X.com, and prints the first five lines
   *  of the Web page in reverse order.
   *  @param arg is not used.
   *  @exception Exception thrown if there are any problems parsing the 
   *             user's input or opening the connection.
   */
  public static void main(String[] arg) throws Exception {

    BufferedReader keyboard;
    String inputLine;

    keyboard = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Please enter the name of a company (without spaces): ");
    System.out.flush();        /* Make sure the line is printed immediately. */
    inputLine = keyboard.readLine();
    
    /* Replace this comment with your solution.  */
    String address = "http://www." + inputLine + ".com";
    
    URL u = new URL(address);
    BufferedReader url = new BufferedReader(new InputStreamReader(u.openStream()));

    /*Read the first five lines of the Web page and save the content in the firstFiveLines[5] */
    int i=0;
    String[] firstFiveLines = new String[5];
    String oneLine;
    while((oneLine = url.readLine()) != null && i < firstFiveLines.length){
    	firstFiveLines[i] = oneLine;
    	i++;  
    }
    
    /*Print the five lines saved in the firstFiveLines[5] in the reverse order */
    for (int j = firstFiveLines.length - 1; j>=0; j--) {
        System.out.println(firstFiveLines[j]);
    }

  }
}