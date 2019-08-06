package com.controller;

public class MerSpuController {
	public String addSpuPro(String name) {
		return "add" + name + "suc";
	}
	public String delSpuPro(String name) {
		return "del" + name + "suc";
	}
	public String updateSpuPro(String name) {
		return "update" + name + "suc";
	}
	public String searchSpuPro(String name) {
		return "search" + name + "suc";
	}
	public String searchSpuV2Pro(String name) {
		return "search" + name + "suc v2";
	}
}
