package com.codingdojo.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codingdojo.models.Item;

//... importaciones (Usa shift+ctrl+O o shift+cmd+O para importar mientras codificas)
@Controller
public class ItemController 
{
	 @RequestMapping("/")
	 public String index(Model model) 
	 {
	     ArrayList<Item> fruits = new ArrayList<Item>();
	     fruits.add(new Item("Kiwi", 1.5));
	     fruits.add(new Item("Mango", 2.0));
	     fruits.add(new Item("Bayas de Goji", 4.0));
	     fruits.add(new Item("Guayava", .75));
	     
	     // Agrega frutas a tu modelo de vista aquí
	     model.addAttribute("fruitsFromController", fruits);
	     
	     return "index.jsp";
	 }
}

