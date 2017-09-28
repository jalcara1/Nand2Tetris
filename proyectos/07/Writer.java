import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.File;

public class Writer{
    private PrintWriter output;
    private in jumpFlags;
    public Writer(File outputFile){
	try{
	    output =new PrintWriter(outputFile);
	    jumpFlags =0;
	}catch(FileNotFoundException e){
	    e.printStackTrace();
	}
    }
}
