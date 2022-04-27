package ie.tudublin;

import processing.core.PApplet;

public class Nematode extends PApplet {
    private String name;
    @Override
    public String toString() {
        return "Nematode [eyes=" + eyes + ", gender=" + gender + ", lenght=" + lenght + ", limbs=" + limbs + ", name="
                + name + "]";
    }
    private int lenght;
    private boolean limbs;
    private char gender;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getLenght() {
        return lenght;
    }
    public void setLenght(int lenght) {
        this.lenght = lenght;
    }
    public boolean isLimbs() {
        return limbs;
    }
    public void setLimbs(boolean limbs) {
        this.limbs = limbs;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public boolean isEyes() {
        return eyes;
    }
    public void setEyes(boolean eyes) {
        this.eyes = eyes;
    }
    private boolean eyes;
}
