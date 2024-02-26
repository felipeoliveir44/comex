package br.com.alura.comex.integracao;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ViaCepService {
    public ViaCepResponse buscaCep(String cep) {
        // Cria um cliente HTTP capaz de enviar solicitações e receber respostas de servidores da web.
        HttpClient client = HttpClient.newHttpClient();

        // Declaração da requisição HTTP
        // O newBuilder() cria um construtor para uma nova requisição HTTP,
        // permitindo configurar os detalhes da requisição.
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://viacep.com.br/ws/"  + cep + "/json/"))
                .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();
            
            return new Gson().fromJson(json, ViaCepResponse.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
