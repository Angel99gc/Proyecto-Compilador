package ErrorHandling;

import Generated.MiParserAS;
import Generated.MiScannerAS;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import java.util.ArrayList;

public class MyErrorListener extends BaseErrorListener {


    public ArrayList<String> errorMsgs = new ArrayList<String>();

    public MyErrorListener() {
        this.errorMsgs = new ArrayList<String>();
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line,
                            int charPositionInLine,
                            String msg,
                            RecognitionException re) {
        if (recognizer instanceof MiParserAS)
            errorMsgs.add(new String("PARSER ERROR - line " + line + ":" + charPositionInLine + " " + msg));
        else if (recognizer instanceof MiScannerAS)
            errorMsgs.add(new String("SCANNER ERROR - line " + line + ":" + charPositionInLine + " " + msg));
        else
            errorMsgs.add(new String("Other Error"));
    }

    public boolean hasErrors() {
        return this.errorMsgs.size() > 0;
    }

    @Override
    public String toString() {
        if (!hasErrors()) return "0 errors";
        StringBuilder builder = new StringBuilder();
        for (String s : errorMsgs) {
            builder.append(String.format("%s\n", s));
        }
        return builder.toString();
    }


}