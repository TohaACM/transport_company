package by.teachmeskills.applications;

import by.teachmeskills.applications.actions.Actions;
import by.teachmeskills.applications.utils.Config;
import by.teachmeskills.applications.utils.Input;
import by.teachmeskills.exceptions.StopApplicationException;

import java.util.Map;

public class ConsoleApplication {
    private Actions getAction(){
        showMenu();
        int number = Input.getInt("Что будем делать? ");
        Actions actions = Config.actions.get(number);
        if (actions != null){
            return actions;
        }
        System.out.println("Не туда");
        return getAction();
    }

    private void showMenu() {
            for (Map.Entry<Integer, Actions> action : Config.actions.entrySet()) {
                System.out.println(action.getKey() + " - " + action.getValue().getName());
            }
        }
    private void run (){
        while (true){
            Actions actions = getAction();
            try {
                actions.action();
            } catch (StopApplicationException e) {
                break;
            }
        }
    }
    public void start(){
        System.out.println("Транспортная компания");
        run();


    }
}
