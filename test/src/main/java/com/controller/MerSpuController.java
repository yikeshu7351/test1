package com.controller;

public class MerSpuController {
	public String addSpu(String name) {
		return "add" + name + "suc";
	}
	public String delSpu(String name) {
		return "del" + name + "suc";
	}
	public String updateSpu(String name) {
		return "update" + name + "suc";
	}
	public String searchSpu(String name) {
		return "search" + name + "suc";
	}
}