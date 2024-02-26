package br.com.alura.comex;

import br.com.alura.comex.integracao.ViaCepResponse;
import br.com.alura.comex.integracao.ViaCepService;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class TesteIntegracaoViaCep {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu CEP: ");
        String cep = scanner.next();

        try {
            ViaCepService cepService = new ViaCepService();
            ViaCepResponse viaCepResponse = cepService.buscaCep(cep);
            System.out.println(viaCepResponse);
        } catch (IOException | InterruptedException e) {
            System.out.println("Erro na requisição à API ViaCEP: " + e.getMessage());
        }

    }
}
