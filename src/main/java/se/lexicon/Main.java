package se.lexicon;

import se.lexicon.model.CalculatorModel;
import se.lexicon.view.CalculatorView;
import se.lexicon.controller.CalculatorController;

public class Main {
    static void main() {
        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView();
        new CalculatorController(model, view);
    }
}