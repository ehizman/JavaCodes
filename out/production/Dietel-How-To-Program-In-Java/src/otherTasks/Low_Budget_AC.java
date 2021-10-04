package otherTasks;

public class Low_Budget_AC {
    private String name;
    private boolean isOn;
    private int temperature;

    public Low_Budget_AC(String name){
        this.name = name;
        this.isOn = false;
        this.temperature = 0;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public boolean isOn() {
        return isOn;
    }

    public void power() {
        isOn = !isOn;
    }
}
