package edu.utn.phones.Controller.Model;

import edu.utn.phones.Abstract.AbstractController;
import edu.utn.phones.Model.Bill;
import edu.utn.phones.Service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BillController extends AbstractController<Bill, BillService> {

    @Autowired
    public BillController(BillService service) {
        super(service);
    }


}
