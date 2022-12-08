package gitlet;

import java.io.File;
import java.io.Serializable;

import static gitlet.Utils.*;

public class Blob implements Serializable {
    private  byte[] content;

    private  String id;

    private  String  filename;

    private File file;



    public Blob(String filename,File CWD){
        this.filename = filename;
        this.file = join(CWD,filename);
        if (file.exists()){
            this.content = readContents(file);
            this.id = sha1(filename,content);}
    }

    public String getFilename(){
        return filename;
    }




}
