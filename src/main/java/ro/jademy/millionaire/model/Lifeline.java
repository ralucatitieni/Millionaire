package ro.jademy.millionaire.model;

public class Lifeline {
    private String name;
    private boolean used;


    //one instance of a lifeline
    //we have to make three of them (three different lifelines)


    public Lifeline(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isUsed() {             //unlike other getters, for boolean it uses the prefix "is" instead of "get"
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }
}
