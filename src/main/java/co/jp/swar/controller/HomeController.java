package co.jp.swar.controller;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import co.jp.swar.dto.SwarFarm;
import co.jp.swar.dto.impl.InfoImpl;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		//json
		String json = "{\"name\":\"Nobunaga\", \"email\":\"nobunaga@gmail.com\"}";

        ObjectMapper mapper = new ObjectMapper();
        InfoImpl infoImpl = null;
		try {
			infoImpl = mapper.readValue(json, InfoImpl.class);
		} catch (JsonParseException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

        System.out.println(infoImpl.name);

        // JSONのファイル読み込み
        String file_name = "C:\\Users\\hhara\\OneDrive\\SWProxy-windows\\819205-swarfarm.json";
        File file = new File(file_name);
        
        //SwarFarm
        SwarFarm swarFarm = null;
        try {
        	swarFarm = mapper.readValue(file, SwarFarm.class);
		} catch (JsonParseException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
        
        System.out.println(swarFarm.getLstUnit()[0].getAtk());
        System.out.println(swarFarm.getWizardInfo().getWizardLastLogin());
		return "home";
	}
	
}
