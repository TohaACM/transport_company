package by.teachmeskills.applications.actions;

import by.teachmeskills.applications.utils.Input;

public class RemoveCityAction extends BaseAction implements Actions {
    @Override
    public String getName() {
        return "Удалить город из списка доступных";
    }

    @Override
    public void action(){
        int id = Input.getInt("Введите id города");
        citiesController.remove(id);

    }
}
