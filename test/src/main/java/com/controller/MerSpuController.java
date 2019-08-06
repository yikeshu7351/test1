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
		System.out.println("after hello");
		System.out.println("hello");
		return "search" + name + "suc";
	}
	public String searchSpuV2(String name) {
		return "search" + name + "suc v2";
	}
	public String searchSpuV3(String name) {
		return "search" + name + "suc v2";
	}
}
