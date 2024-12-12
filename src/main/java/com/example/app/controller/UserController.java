package com.example.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.app.domain.Users;
import com.example.app.service.UserService;

import lombok.RequiredArgsConstructor;



@Controller
@RequiredArgsConstructor
//@RequestMapping("/user")
public class UserController {

	private final UserService userService;

	@GetMapping("login")
	public String login(Model model) {
		model.addAttribute("user", new Users());
		return "login";
	}
	@PostMapping("login")
	public String loggedIn(
			Users user,// フォームから送信されたユーザー情報
			RedirectAttributes rd,
			HttpSession session,
			Model model) {
		if(!userService.isCollectNameAndPass(user)) {
			rd.addFlashAttribute("errorMassage", "ユーザー名またはパスワードが間違っています。");
		  return "redirect:/login";
		}
			//ユーザー情報を行ごと取得
			session.setAttribute("user", user);
			System.out.println("user->" + user);
		return "redirect:/logout";//home作るまで仮にlogotに飛ばす
	}
	
	@GetMapping("logout")
	public String logout(
			HttpSession session) {
		session.invalidate();
		return "logout";
	}
	
	//ユーザー追加フォームの表示
	@GetMapping("addUser")
	public String addUser(Model model) {
		model.addAttribute("user", new Users());
		return "addUser";
	}
	
	@PostMapping("addUser")
	public String userAdded(
			Users user,
			RedirectAttributes rd,
			Model model) {
		userService.addUser(user);
		rd.addFlashAttribute("statusMessage", "新規ユーザー登録完了");
		return "redirect:/login";
	}
	
	
}
