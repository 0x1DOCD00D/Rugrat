package edu.uta.cse.proggen.util;

import java.util.Random;
import java.util.ArrayList;
import java.io.*;

import edu.uta.cse.proggen.configurationParser.ConfigurationXMLParser;

public class CleanupFacility
{	
	public static void main(String[] args)
	{
		try
		{
			new RandomPathDestroyer( ProgGenUtil.logfile ).doCleanup();
		}
		catch( IOException e )
		{
			e.printStackTrace();
		}
	}
}

class RandomPathDestroyer
{
    private BufferedReader logReader = null;
    private String logfile = null;

    public RandomPathDestroyer( String logfile ) throws IOException
    {
        this.logfile = logfile;
        logReader = new BufferedReader( new FileReader( logfile ) );
    }

    public boolean doCleanup() throws IOException
    {
        String line = "";
        int deletedFileCount = 0;
        boolean securityError = false;

        while( (line = logReader.readLine() ) != null )
        {
            if( line.length() < 1 || line.equals( "" ) )
                continue;
            File file = new File( line );
            if( file.exists() )
            {
                if (!file.delete()) {
                	securityError = true;
                	System.out.println("Error deleting " + line + " .");
                	continue;
                }
                deletedFileCount ++;
                System.out.println( "Deleting " + line );
            }
        }
        System.out.println( deletedFileCount + " files were deleted." );
        if (securityError) {
        	System.out.println("Some files encountered errors while deleting. Please check your" +
        			"permissions. Try running your IDE with administrator priveleges");
        }
        return true;
    }
}
