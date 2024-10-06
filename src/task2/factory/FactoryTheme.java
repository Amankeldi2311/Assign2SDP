package task2.factory;

import task2.buttons.Button;
import task2.checkboxes.Checkbox;

public interface FactoryTheme {
    Button createButton();
    Checkbox createCheckbox();
}
