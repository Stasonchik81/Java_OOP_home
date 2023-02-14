package classes;

import java.util.ArrayList;


public class Robot {

    private static int defaultIndex;
    private static ArrayList<String> names;

    private enum State{
        On, Off
    }

    static{
        defaultIndex = 1;
        names = new ArrayList<>();
    }
    /** имя робота */
    private String name;

    /** класс робота */
    private int level;

    /** состояние */
    private State state;
    
    /**
     * 
     * @param name Имя робота! Не должно начинаться с цифры
     * @param level Уровень робота
     */
    private Robot(String name, int level) {
        if(name.isEmpty() 
            || Character.isDigit(name.charAt(0))
            || names.indexOf(name) != -1){
                this.name = String.format("DefaultName_%d", defaultIndex++);
        }else{
            this.name = name;
        }

        Robot.names.add(this.name);
        this.level = level;
        this.state = State.Off; 
        
    }
    public Robot(String name){
        this(name, defaultIndex);
    }
    public Robot(){
        this("");
    }

    public int getLevel() {
        return this.level;
    }

    public String getName() {
        return this.name;
    }
    // Включение и выключение робота
    public void power(){
        if(this.state == State.Off){
            powerOn();
            this.state = State.On;
        }
        else{
            powerOff();
            this.state = State.Off;
        }
        System.out.println("");
    }

    // Методы включения подсистем
    private void powerOn(){
        startBIOS();
        startOS();
        sayHi();
    }
    private void powerOff(){
        sayBy();
        exitOS();
        exitBIOS();
    }

    // Methods
    private void startBIOS(){
        System.out.println("Starting BIOS ...");
    }
    private void startOS(){
        System.out.println("Starting OS ...");
    }
    private void sayHi(){
        System.out.printf("Hi, I am %s", name);
    }
    private void exitBIOS(){
        System.out.println("Off BIOS ...");
    }
    private void exitOS(){
        System.out.println("Off OS ...");
    }
    private void sayBy(){
        System.out.println("By, by!");
    }
    public void work(){
        if(this.state == State.On){
            System.out.printf("%s is working ...\n", this.name);
        }
        
    }

    @Override
    public String toString() {
        return String.format("Name: %s, class: %d, state: %s", name, level, state);
    }
}
