package com.ciberdix.th.controllers.refactor;

import com.ciberdix.th.models.refactor.Widgets;
import com.ciberdix.th.repositories.refactor.WidgetsRefactorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Danny on 21/04/2017.
 */

@CrossOrigin
@Transactional
@RestController
@RequestMapping("/api/widgets")
public class WidgetsRefactorController {
    @Autowired
    private WidgetsRefactorRepository widgetsRefactorRepository;

    @RequestMapping(method = RequestMethod.GET)
    List<Widgets> findAll() {
        return (List<Widgets>) widgetsRefactorRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{IdWidget}")
    Widgets findOne(@PathVariable Integer IdWidget) {
        return widgetsRefactorRepository.findOne(IdWidget);
    }

    @RequestMapping(method = RequestMethod.POST)
    Widgets create(@RequestBody Widgets widgets) {
        return widgetsRefactorRepository.save(new Widgets(widgets.getWidget(), widgets.getCodigoWidget(),
                widgets.getDescripcion(), widgets.getIndicadorHabilitado(), widgets.getAuditoriaUsuario()));
    }

    @RequestMapping(method = RequestMethod.PUT)
    Widgets update(@RequestBody Widgets widgets) {
        return widgetsRefactorRepository.save(widgets);
    }
}
