package task2.factory;

import task2.buttons.Button;
import task2.buttons.LightButton;
import task2.checkboxes.Checkbox;
import task2.checkboxes.LightCheckbox;

public class FactoryLightTheme implements FactoryTheme {
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LightCheckbox();
    }
}
