package Hafta2.OOP.IdmanProgramı;

public class Idman {

    private int pushUpCount;
    private int sitUpCount;
    private int squatCount;
    private int pullUpCount;

    public Idman(int pushUpCount, int sitUpCount, int squatCount, int pullUpCount) {
        this.pushUpCount = pushUpCount;
        this.sitUpCount = sitUpCount;
        this.squatCount = squatCount;
        this.pullUpCount = pullUpCount;
    }

    public void doExersize(String exersizetype,int repetitionCount){
            if (exersizetype.equals("Push-up")){
                doPushUp(repetitionCount);
            }
            else if(exersizetype.equals("Sit-up")){
                doSitUp(repetitionCount);
            }
            else if(exersizetype.equals("Squat")){
                doSquat(repetitionCount);
            }
            else if(exersizetype.equals("Pull-up")){
                doPullUp(repetitionCount);
            }else{
                System.out.println("You entered the wrong value.");
            }
    }

    public void doPushUp(int count){
        if (count == 0){
            System.out.println("Your set is finished.");
        }
        if (pushUpCount < count){
            System.out.println("You did a lot of push-up congratulations.");
            pushUpCount = 0;
        } else{
            pushUpCount -= count;
            System.out.println("You have "+ pushUpCount +" push-ups left");
        }
    }
    public void doSitUp(int count){
        if (count == 0){
            System.out.println("Your set is finished.");
        }
        if (sitUpCount < count){
            System.out.println("You did a lot of sit-up congratulations.");
        } else{
            sitUpCount -= count;
            System.out.println("You have "+ sitUpCount +" push-ups left");
        }
    }
    public void doSquat(int count){
        if (count == 0){
            System.out.println("Your set is finished.");
        }
        if (squatCount < count){
            System.out.println("You did a lot of squat congratulations.");
        } else{
            squatCount -= count;
            System.out.println("You have "+ squatCount +" push-ups left");
        }
    }
    public void doPullUp(int count){
        if (count == 0){
            System.out.println("Your set is finished.");
        }
        if (pullUpCount < count){
            System.out.println("You did a lot of pull-up congratulations.");
        } else{
            pullUpCount -= count;
            System.out.println("You have "+ pullUpCount +" push-ups left");
        }
    }

    public boolean isTrainingOver() {
        return (pushUpCount == 0) && (sitUpCount == 0) && (squatCount == 0) && (pullUpCount == 0);
    }

    public int getPushUpCount() {
        return pushUpCount;
    }

    public void setPushUpCount(int pushUpCount) {
        this.pushUpCount = pushUpCount;
    }

    public int getSitUpCount() {
        return sitUpCount;
    }

    public void setSitUpCount(int sitUpCount) {
        this.sitUpCount = sitUpCount;
    }

    public int getSquatCount() {
        return squatCount;
    }

    public void setSquatCount(int squatCount) {
        this.squatCount = squatCount;
    }

    public int getPullUpCount() {
        return pullUpCount;
    }

    public void setPullUpCount(int pullUpCount) {
        this.pullUpCount = pullUpCount;
    }
}
