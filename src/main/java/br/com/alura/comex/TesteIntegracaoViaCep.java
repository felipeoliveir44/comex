package br.com.alura.comex;

import br.com.alura.comex.integracao.ViaCepResponse;
import br.com.alura.comex.integracao.ViaCepService;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class TesteIntegracaoViaCep {
    public static void main(String[] args) throws IOException, InterruptedException {

        ViaCepService cepService = new ViaCepService();
        ViaCepResponse viaCepResponse = cepService.buscaCep("02649000");
        System.out.println(viaCepResponse);

    }
}
