package mum.waa.october2019.lab03.controller;

import mum.waa.october2019.lab03.model.Operation;
import mum.waa.october2019.lab03.validator.Validator;
import mum.waa.october2019.lab03.validator.ValidatorImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
@RequestMapping("/calculator")
@Controller
public class CalculatorController {

    @Autowired
    private Validator operationValidator;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String showForm() {
        System.out.println("CalculatorController.showForm()");
        return "InputForm";
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String calculateResult(Operation operation) {
        System.out.println("CalculatorController.calculateResult()" + operation);
        //        ProductValidator productValidator = new ProductValidator();
        List<String> errors = operationValidator.validate(operation);
        if (errors.isEmpty()) {
            // no validation error, execute action method
            //request.setAttribute("operation", operation);
            return "CalculateResult";
        } else {
            // store errors and product in a scope variable for the view
            operation.setErrors(errors);
            //request.setAttribute("form", operation);
            return "InputForm";
        }
    }
}
