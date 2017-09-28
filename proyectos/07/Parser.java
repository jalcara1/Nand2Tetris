import java.util.IllegalFormatException;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class Parser{
    private Scanner commands;
    
    public Parser(File inputFile){
	try{
	    commands = new Scanner(inputFile);
	    String line ="", codes ="";	    
	    while(commands.hasNext()){
		line = comment(cmds.nextLine()).trim();
		if(line.length() > 0){
		    codes +=line +"\n";
		}
	    }
	    commands = new Scanner(codes.trim());
	}catch(FileNotFoundException e){
	    System.out.println("File not found");
	}
    }
    public String comment(String line){
	int pos = line.indexOf("//");
	if (pos != -1){
	    line = line.substring(0, pos);
	}
	return line;
    }
    public boolean moreCommands(){
	return commands.hasNextLine();
    }
    public void advance(){

    }
}
