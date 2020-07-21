package ro.jademy.millionaire;


public class Answer {

    private String text;

    public Answer(String text) {
        this.text = text;
    }


    public String getText() {      //getter
        return text;
    }

    public void setText(String text) {        //setter
        this.text = text;
    }
}
