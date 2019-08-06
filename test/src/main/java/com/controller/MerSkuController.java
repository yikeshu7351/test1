package com.controller;
public class MerSkuController {
	public String addSku(String name) {
		return "add" + name + "suc";
	}
	public String delSku(String name) {
		return "del" + name + "suc";
	}
	public String updateSku(String name) {
		return "update" + name + "suc";
	}
	public String searchSku(String name) {
		return "search" + name + "suc";
	}
}
