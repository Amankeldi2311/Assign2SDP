package task2.factory;

import task2.buttons.Button;
import task2.buttons.DarkButton;
import task2.checkboxes.Checkbox;
import task2.checkboxes.DarkCheckbox;

public class FactoryDarkTheme implements FactoryTheme {
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new DarkCheckbox();
    }
}
