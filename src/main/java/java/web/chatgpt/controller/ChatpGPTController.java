package java.web.chatgpt.controller;

import java.web.chatgpt.model.ChatModel;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ChatpGPTController {

	@RequestMapping(value = "/chat", method = RequestMethod.GET)
	public String chat(Model model) {
		return null;
	}

	@RequestMapping(value = "/chat", method = RequestMethod.POST)
	public String response(@ModelAttribute ChatModel chatModel, Model model) {
		return null;
	}
}
