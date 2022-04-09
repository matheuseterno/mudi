package br.com.alura.mvc.mudi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.model.Pedido;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String home(Model model) {
		
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("Console PlayStation®5");
		pedido.setUrlImagem("https://m.media-amazon.com/images/I/51VZErxKwkL._AC_SX679_.jpg");
		pedido.setUrlProduto("https://www.amazon.com.br/PlayStation-Console-PlayStation%C2%AE5/dp/B088GNRX3J/ref=sr_1_6?keywords=playstation+5&qid=1649523665&sprefix=pl%2Caps%2C366&sr=8-6");
		pedido.setDescricao("Maravilhe-se com os gráficos incríveis e experimente os recursos do novo PS5");
		
		List<Pedido> pedidos = Arrays.asList(pedido);
		model.addAttribute("pedidos", pedidos);
		
		return "home";
	}

}
