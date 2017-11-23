package com.web.trip.admin;

import org.springframework.stereotype.Controller;

@Controller
public class AdminController {
	public String indexAdmin() {
		return "admin/admin_index";
	}
}
