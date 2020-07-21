package ro.jademy.millionaire;

public class Lifeline {
    private String name;
    private boolean used;    //vezi de getteri si setteri


    //o instanta a lifelineului


    //daca vreo sa avem de 3 ori 50:50 facem 3 obiecte lifeline


    public Lifeline(String name) {     //nu folosesc booleanul "used" pentru ca atunci cand e contruiesc e implicti false, deci e ok
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public boolean getUsed(){
        return used;
    }

    public void setUsed(boolean used){
        this.used=used;
    }


}
