package co.jp.swar.controller;

import java.io.File;
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
import co.jp.swar.service.SwarFarmService;

@Controller
public class SwarTopController {

	private static final Logger logger = LoggerFactory.getLogger(SwarTopController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String top(Locale locale, Model model) {
		logger.debug("top start");
		
		// SwarFarmサービス取得
		SwarFarmService swarFarm = SwarFarmService.getInstance();

		System.out.println(swarFarm.getLstUnit()[0].getAtk());
		System.out.println(swarFarm.getData().getWizardInfo().getWizardLastLogin());

		ArrayList<MonsterForm> result = new ArrayList<MonsterForm>();
		for (SfUnit unit : swarFarm.getLstUnit()) {
			MonsterForm monster = new MonsterForm();
			monster.setId(unit.getId());
			monster.setJname(unit.getJname());
			result.add(monster);
		}

		model.addAttribute("list", result);

		String path = new File(".").getAbsoluteFile().getParent();
		System.out.println(path);
		
		logger.debug("top ended");
		
		return "swtop";
	}
}
