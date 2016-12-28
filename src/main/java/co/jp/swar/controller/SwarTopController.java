package co.jp.swar.controller;

import java.util.ArrayList;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import co.jp.swar.dto.SfUnit;
import co.jp.swar.form.MonsterForm;
import co.jp.swar.service.SwMonstersName;
import co.jp.swar.service.SwarFarmSingleton;

@Controller
public class SwarTopController {
	
	private static final Logger logger = LoggerFactory.getLogger(SwarTopController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String top(Locale locale, Model model) {
		
		SwarFarmSingleton swarFarm = SwarFarmSingleton.getInstance();
        
        System.out.println(swarFarm.getData().getLstUnit()[0].getAtk());
        System.out.println(swarFarm.getData().getWizardInfo().getWizardLastLogin());
        
        ArrayList<MonsterForm> result = new ArrayList<MonsterForm>();
        for (SfUnit unit : swarFarm.getData().getLstUnit()) {
        	MonsterForm monster = new MonsterForm();
        	monster.setId(unit.getUnitId());
        	monster.setName(SwMonstersName.getJname(unit.getUnitMasterId()));
        	result.add(monster);
        }

        model.addAttribute("list", result);

        
		return "swtop";
	}
}
