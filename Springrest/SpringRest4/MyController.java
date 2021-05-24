package springrest_4.Controller;

import springrest_4.Model.CreditCard;
import springrest_4.Service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {

    @Autowired
    CardService cardService;

    @PostMapping(path = "/validateCreditCard")
    public String checkCreditCard(@RequestBody CreditCard creditCard)
    {
        return cardService.cardValidation(creditCard);
    }
    @GetMapping(path = "/validateCard")
    public CreditCard check()
    {
        CreditCard creditCard = new CreditCard("Shopping" , "98763450026");
        return cardService.cardValidation(creditCard).equalsIgnoreCase("Valid Credit Card") ? creditCard : creditCard;
    }

}