import java.io.File;

public class VMtranslator{
    public static void main(String args[]){
	if(args.length != 1){
	    Systme.out.println("Not input file\n Usage: java VMTranslator *.vm");
	}else{
	    File file =new File(args[0]);
	    String pathFileOut =file.getAbsolutePath().substring(0, file.getAbsolutePath().lastIndexOf(".")) + ".asm";
	    File fileOut =new File(fileOutPath);
	    Parser parser =new Parser(file);
	    while(parser.moreCommands){
		
	    }	    
	    System.out.println("File Created: " + fileOutPath);
	}
    }
}
